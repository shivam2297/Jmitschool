package com.example.hp.jmitschool;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class signup_stu_par extends AppCompatActivity implements AdapterView.OnItemClickListener {
    EditText name, ph_no, email, father_name, parent_contact, father_email, school_name, role, stream;
    Button btnsubmit;
    private HttpURLConnection urlConnection;
    private String TAG = "network test";
    Spinner spinnerstream, yop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_details);
        //getSupportActionBar().hide();
        //role = (EditText) findViewById(R.id.role);
        name = (EditText) findViewById(R.id.name);
        ph_no = (EditText) findViewById(R.id.contact);
        email = (EditText) findViewById(R.id.email);
        father_name = (EditText) findViewById(R.id.fathername);
        parent_contact = (EditText) findViewById(R.id.fathercontact);
        school_name = (EditText) findViewById(R.id.schoolname);
        father_email = (EditText) findViewById(R.id.fatheremail);
        //stream=(EditText) findViewById(R.id.stream);
        yop = (Spinner) findViewById(R.id.yearofpass);
        spinnerstream = (Spinner) findViewById(R.id.spinnerstream);
        //btnsubmit = (Button) findViewById(R.id.btnsubmit);

        List<String> categories = new ArrayList<String>();
        categories.add("Stream");
        categories.add("Medical");
        categories.add("Non-Medical");
        categories.add("Commerce");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinnerstream.setAdapter(dataAdapter);

        //items for yop spinner
        ArrayList<String> years = new ArrayList<String>();
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        for (int i = thisYear; i <= 2025; i++)
            years.add(Integer.toString(i));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, years);
        yop.setAdapter(adapter);

        /*btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean allvalid = true;
                if (yop.getSelectedItem().toString().matches("") || father_email.getText().toString().matches("") || father_name.getText().toString().matches("") || name.getText().toString().matches("") || ph_no.getText().toString().matches("") || parent_contact.getText().toString().matches("") || email.getText().toString().matches("") || school_name.getText().toString().matches("")) {
                    allvalid = false;
                    Toast.makeText(getApplicationContext(), "Fill All The Blanks", Toast.LENGTH_SHORT).show();
                }
                if ((ph_no.getText().toString().length() < 7 || ph_no.getText().toString().length() > 13) && (parent_contact.getText().toString().length() < 7 || parent_contact.getText().toString().length() > 13)) {
                    allvalid = false;
                    Toast.makeText(getApplicationContext(), "check your Phone Number", Toast.LENGTH_SHORT).show();
                }
                if (!isValidEmail(email.getText()) && !isValidEmail(father_email.getText())) {
                    allvalid = false;
                    Toast.makeText(getApplicationContext(), "check your email", Toast.LENGTH_SHORT).show();
                }
                if (yop.getSelectedItem().toString().length() != 4) {
                    allvalid = false;
                    Toast.makeText(getApplicationContext(), "check your Year of passing", Toast.LENGTH_SHORT).show();
                }
                if (spinnerstream.getSelectedItemPosition() == 0) {
                    allvalid = false;
                    Toast.makeText(getApplicationContext(), "choose a Stream", Toast.LENGTH_SHORT).show();
                }
                if (allvalid && isOnline()) {
                    Toast.makeText(getApplicationContext(), "Succesfully login by:" + name.getText().toString(), Toast.LENGTH_SHORT).show();
                    String rol = "student";
                    String nam = name.getText().toString();
                    String ema = email.getText().toString();
                    String ph = ph_no.getText().toString();
                    String fathername = father_name.getText().toString();
                    String fatheremail = father_email.getText().toString();
                    String streamf = spinnerstream.getSelectedItem().toString();
                    String yopass = yop.getSelectedItem().toString();
                    String parentcontact = parent_contact.getText().toString();
                    String school = school_name.getText().toString();
                    String fsubject = "----";

                    String[] details = {rol, nam, ph, ema, fathername, parentcontact, school, yopass, streamf, fatheremail, fsubject};
                    Log.d("test1", details.toString());
                    new SendPostRequest().execute(details);
                    Intent intent = new Intent(signup_stu_par.this, Mainfile.class);
                    startActivity(intent);
                } else {
                    //try {
                    AlertDialog alertDialog = new AlertDialog.Builder(getApplicationContext()).create();

                    alertDialog.setTitle("Info");
                    alertDialog.setMessage("Internet not available, Cross check your internet connectivity and try again");
                    alertDialog.setIcon(android.R.drawable.ic_dialog_alert);
                    alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

                    alertDialog.show();
                    }
                    catch(Exception e)
                    {
                        Log.d(TAG, "Show Dialog: "+e.getMessage());
                    }
                }
            }
        });*/

    }

    public boolean isOnline() {
        ConnectivityManager conMgr = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = conMgr.getActiveNetworkInfo();

        if (netInfo == null || !netInfo.isConnected() || !netInfo.isAvailable()) {
            Toast.makeText(this, "No Internet connection!", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    public final static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    public class SendPostRequest extends AsyncTask<String, Void, String> {

        protected void onPreExecute() {
        }

        protected String doInBackground(String... strings) {

            try {

                URL url = new URL("https://jbooks.000webhostapp.com/form_api.php"); // here is your URL path

                JSONObject postDataParams = new JSONObject();
                postDataParams.put("role", strings[0]);
                postDataParams.put("name", strings[1]);
                postDataParams.put("ph_no", strings[2]);
                postDataParams.put("email", strings[3]);
                postDataParams.put("father_name", strings[4]);
                postDataParams.put("parent_contact", strings[5]);
                postDataParams.put("school_name", strings[6]);
                postDataParams.put("yop", strings[7]);
                postDataParams.put("stream", strings[8]);
                postDataParams.put("father_email", strings[9]);
                postDataParams.put("subject", strings[10]);
                Log.e("params", postDataParams.toString());

                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setReadTimeout(15000 /* milliseconds */);
                conn.setConnectTimeout(15000 /* milliseconds */);
                conn.setRequestMethod("POST");
                conn.setDoInput(true);
                conn.setDoOutput(true);

                OutputStream os = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(getPostDataString(postDataParams));

                writer.flush();
                writer.close();
                os.close();

                int responseCode = conn.getResponseCode();

                if (responseCode == HttpsURLConnection.HTTP_OK) {

                    BufferedReader in = new BufferedReader(new
                            InputStreamReader(
                            conn.getInputStream()));

                    StringBuffer sb = new StringBuffer("");
                    String line = "";

                    while ((line = in.readLine()) != null) {

                        sb.append(line);
                        break;
                    }

                    in.close();
                    return sb.toString();

                } else {
                    return new String("false : " + responseCode);
                }
            } catch (Exception e) {
                return new String("Exception: " + e.getMessage());
            }

        }

        @Override
        protected void onPostExecute(String result) {
            Toast.makeText(getApplicationContext(), result,
                    Toast.LENGTH_LONG).show();
            Log.d(TAG, result);
        }
    }

    public String getPostDataString(JSONObject params) throws Exception {

        StringBuilder result = new StringBuilder();
        boolean first = true;

        Iterator<String> itr = params.keys();

        while (itr.hasNext()) {

            String key = itr.next();
            Object value = params.get(key);

            if (first)
                first = false;
            else
                result.append("&");

            result.append(URLEncoder.encode(key, "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(value.toString(), "UTF-8"));

        }
        return result.toString();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.submit_form, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean allvalid = true;
        if (yop.getSelectedItem().toString().matches("") || father_email.getText().toString().matches("") || father_name.getText().toString().matches("") || name.getText().toString().matches("") || ph_no.getText().toString().matches("") || parent_contact.getText().toString().matches("") || email.getText().toString().matches("") || school_name.getText().toString().matches("")) {
            allvalid = false;
            Toast.makeText(getApplicationContext(), "Fill All The Blanks", Toast.LENGTH_SHORT).show();
        }
        if ((ph_no.getText().toString().length() < 7 || ph_no.getText().toString().length() > 13) && (parent_contact.getText().toString().length() < 7 || parent_contact.getText().toString().length() > 13)) {
            allvalid = false;
            Toast.makeText(getApplicationContext(), "check your Phone Number", Toast.LENGTH_SHORT).show();
        }
        if (!isValidEmail(email.getText()) && !isValidEmail(father_email.getText())) {
            allvalid = false;
            Toast.makeText(getApplicationContext(), "check your email", Toast.LENGTH_SHORT).show();
        }
        if (yop.getSelectedItem().toString().length() != 4) {
            allvalid = false;
            Toast.makeText(getApplicationContext(), "check your Year of passing", Toast.LENGTH_SHORT).show();
        }
        if (spinnerstream.getSelectedItemPosition() == 0) {
            allvalid = false;
            Toast.makeText(getApplicationContext(), "choose a Stream", Toast.LENGTH_SHORT).show();
        }
        if (allvalid && isOnline()) {
            Toast.makeText(getApplicationContext(), "Succesfully login by:" + name.getText().toString(), Toast.LENGTH_SHORT).show();
            String rol = "student";
            String nam = name.getText().toString();
            String ema = email.getText().toString();
            String ph = ph_no.getText().toString();
            String fathername = father_name.getText().toString();
            String fatheremail = father_email.getText().toString();
            String streamf = spinnerstream.getSelectedItem().toString();
            String yopass = yop.getSelectedItem().toString();
            String parentcontact = parent_contact.getText().toString();
            String school = school_name.getText().toString();
            String fsubject = "----";

            String[] details = {rol, nam, ph, ema, fathername, parentcontact, school, yopass, streamf, fatheremail, fsubject};
            Log.d("test1", details.toString());
            new SendPostRequest().execute(details);
            Intent intent = new Intent(signup_stu_par.this, Mainfile.class);
            startActivity(intent);
        } else {
            //try {
            AlertDialog alertDialog = new AlertDialog.Builder(getApplicationContext()).create();

            alertDialog.setTitle("Info");
            alertDialog.setMessage("Internet not available, Cross check your internet connectivity and try again");
            alertDialog.setIcon(android.R.drawable.ic_dialog_alert);
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });

            alertDialog.show();
                    /*}
                    catch(Exception e)
                    {
                        Log.d(TAG, "Show Dialog: "+e.getMessage());
                    }*/
        }
        return true;
    }
}
