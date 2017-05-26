package com.example.hp.jmitschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class chemsummpprs extends AppCompatActivity {
    TextView chp1,chp2,chp3,chp4,chp5,chp6,chp7,chp8,chp9,chp10,chp11,chp12,chp13,chp14,chp15,chp16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemsummpprs);
        getSupportActionBar().hide();
        chp1=(TextView)findViewById(R.id.chp1);
        chp2=(TextView)findViewById(R.id.chp2);
        chp3=(TextView)findViewById(R.id.ch3);
        chp4=(TextView)findViewById(R.id.chp4);
        chp5=(TextView)findViewById(R.id.chp5);
        chp6=(TextView)findViewById(R.id.chp6);
        chp7=(TextView)findViewById(R.id.chp7);
        chp8=(TextView)findViewById(R.id.chp8);
        chp9=(TextView)findViewById(R.id.chp9);
        chp10=(TextView)findViewById(R.id.chp10);
        chp11=(TextView)findViewById(R.id.chp11);
        chp12=(TextView)findViewById(R.id.chp12);
        chp13=(TextView)findViewById(R.id.chp13);
        chp14=(TextView)findViewById(R.id.chp14);
        chp15=(TextView)findViewById(R.id.chp15);
        chp16=(TextView)findViewById(R.id.chp16);

        chp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm1");
                startActivity(intent);
            }
        });
        chp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm2");
                startActivity(intent);
            }
        });
        chp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm3");
                startActivity(intent);
            }
        });
        chp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm4");
                startActivity(intent);
            }
        });
        chp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm5");
                startActivity(intent);
            }
        });
        chp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm6");
                startActivity(intent);
            }
        });
        chp7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm7");
                startActivity(intent);
            }
        });
        chp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm8");
                startActivity(intent);
            }
        });
        chp9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm9");
                startActivity(intent);
            }
        });
        chp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm10");
                startActivity(intent);
            }
        });
        chp11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm11");
                startActivity(intent);
            }
        });
        chp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm12");
                startActivity(intent);
            }
        });
        chp13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm13");
                startActivity(intent);
            }
        });
        chp14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm14");
                startActivity(intent);
            }
        });
        chp15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm15");
                startActivity(intent);
            }
        });
        chp16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemsummpprs.this,Webviewpdf.class).putExtra("num","chemsumm16");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chemsummpprs, menu);
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
