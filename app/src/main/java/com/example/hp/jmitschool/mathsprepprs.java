package com.example.hp.jmitschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class mathsprepprs extends AppCompatActivity {
    TextView mppr1,mppr2,mppr3,mppr4,mppr5,mppr6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathsprepprs);
        getSupportActionBar().hide();
        mppr1=(TextView)findViewById(R.id.mppr1);
        mppr2=(TextView)findViewById(R.id.mppr2);
        mppr3=(TextView)findViewById(R.id.mppr3);
        mppr4=(TextView)findViewById(R.id.mppr4);
        mppr5=(TextView)findViewById(R.id.mppr5);
        mppr6=(TextView)findViewById(R.id.mppr6);

        mppr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mathsprepprs.this,Webviewpdf.class).putExtra("num","mppr1");
                startActivity(intent);
            }
        });
        mppr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mathsprepprs.this,Webviewpdf.class).putExtra("num","mppr2");
                startActivity(intent);
            }
        });
        mppr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mathsprepprs.this,Webviewpdf.class).putExtra("num","mppr3");
                startActivity(intent);
            }
        });
        mppr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mathsprepprs.this,Webviewpdf.class).putExtra("num","mppr4");
                startActivity(intent);
            }
        });
        mppr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mathsprepprs.this,Webviewpdf.class).putExtra("num","mppr5");
                startActivity(intent);
            }
        });
        mppr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(mathsprepprs.this,Webviewpdf.class).putExtra("num","mppr6");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mathsprepprs, menu);
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
