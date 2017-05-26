package com.example.hp.jmitschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button button1,button2,button3,button4,button5,button6,button7;
    TextView phy,chem,mathpprs,chempprs,phypprs,physumm,chemsumm,mathsumm;
    LinearLayout imp,pprs,summ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        phy=(TextView)findViewById(R.id.phy);
        chem=(TextView)findViewById(R.id.chem);
        mathpprs=(TextView)findViewById(R.id.mathpprs);
        chempprs=(TextView)findViewById(R.id.chempprs);
        phypprs=(TextView)findViewById(R.id.phypprs);
        mathsumm=(TextView)findViewById(R.id.mathsumm);
        chemsumm=(TextView)findViewById(R.id.chemsumm);
        physumm=(TextView)findViewById(R.id.physumm);
        imp=(LinearLayout)findViewById(R.id.imp);
        pprs=(LinearLayout)findViewById(R.id.pprs);
        summ=(LinearLayout)findViewById(R.id.summ);

        mathsumm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                summ.setVisibility(View.INVISIBLE);
                Intent intent=new Intent(MainActivity.this,mathsprepprs.class);
                startActivity(intent);
            }
        });
        chemsumm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                summ.setVisibility(View.INVISIBLE);
                Intent intent=new Intent(MainActivity.this,chemsummpprs.class);
                startActivity(intent);
            }
        });
        physumm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                summ.setVisibility(View.INVISIBLE);
                Intent intent=new Intent(MainActivity.this,physummpprs.class);
                startActivity(intent);
            }
        });

        mathpprs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pprs.setVisibility(View.INVISIBLE);
                Intent intent=new Intent(MainActivity.this,mathsprepprs.class);
                startActivity(intent);
            }
        });
        chempprs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pprs.setVisibility(View.INVISIBLE);
                Intent intent=new Intent(MainActivity.this,chemprepprs.class);
                startActivity(intent);
            }
        });
        phypprs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pprs.setVisibility(View.INVISIBLE);
                Intent intent=new Intent(MainActivity.this,phyprepprs.class);
                startActivity(intent);
            }
        });
        phy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imp.setVisibility(View.INVISIBLE);
                Intent intent=new Intent(MainActivity.this,Webviewpdf.class).putExtra("num","phyimp");
                startActivity(intent);
            }
        });
        chem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imp.setVisibility(View.INVISIBLE);
                Intent intent=new Intent(MainActivity.this,Webviewpdf.class).putExtra("num","chemimp");
                startActivity(intent);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                summ.setVisibility(View.VISIBLE);
                /*Intent intent=new Intent(MainActivity.this,Webviewpdf.class).putExtra("num","1");
                startActivity(intent);*/
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pprs.setVisibility(View.VISIBLE);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imp.setVisibility(View.VISIBLE);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Samplepapers.class);
                startActivity(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Webviewpdf.class).putExtra("num","1");
                startActivity(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Webviewpdf.class).putExtra("num","2");
                startActivity(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Syllabus.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
