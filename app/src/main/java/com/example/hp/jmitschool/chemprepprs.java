package com.example.hp.jmitschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class chemprepprs extends AppCompatActivity {
    TextView cppr1,cppr2,cppr3,cppr4,cppr5,cppr6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemprepprs);
        getSupportActionBar().hide();
        cppr1=(TextView)findViewById(R.id.cppr1);
        cppr2=(TextView)findViewById(R.id.cppr2);
        cppr3=(TextView)findViewById(R.id.cppr3);
        cppr4=(TextView)findViewById(R.id.cppr4);
        cppr5=(TextView)findViewById(R.id.cppr5);
        cppr6=(TextView)findViewById(R.id.cppr6);

        cppr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemprepprs.this,Webviewpdf.class).putExtra("num","cppr1");
                startActivity(intent);
            }
        });
        cppr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemprepprs.this,Webviewpdf.class).putExtra("num","cppr2");
                startActivity(intent);
            }
        });
        cppr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemprepprs.this,Webviewpdf.class).putExtra("num","cppr3");
                startActivity(intent);
            }
        });
        cppr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemprepprs.this,Webviewpdf.class).putExtra("num","cppr4");
                startActivity(intent);
            }
        });
        cppr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemprepprs.this,Webviewpdf.class).putExtra("num","cppr5");
                startActivity(intent);
            }
        });
        cppr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(chemprepprs.this,Webviewpdf.class).putExtra("num","cppr6");
                startActivity(intent);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chemprepprs, menu);
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
