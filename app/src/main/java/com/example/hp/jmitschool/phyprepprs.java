package com.example.hp.jmitschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class phyprepprs extends AppCompatActivity {
    TextView pppr1,pppr2,pppr3,pppr4,pppr5,pppr6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathsprepprs);
        getSupportActionBar().hide();
        pppr1=(TextView)findViewById(R.id.mppr1);
        pppr2=(TextView)findViewById(R.id.mppr2);
        pppr3=(TextView)findViewById(R.id.mppr3);
        pppr4=(TextView)findViewById(R.id.mppr4);
        pppr5=(TextView)findViewById(R.id.mppr5);
        pppr6=(TextView)findViewById(R.id.mppr6);

        pppr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(phyprepprs.this,Webviewpdf.class).putExtra("num","pppr1");
                startActivity(intent);
            }
        });
        pppr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(phyprepprs.this,Webviewpdf.class).putExtra("num","pppr2");
                startActivity(intent);
            }
        });
        pppr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(phyprepprs.this,Webviewpdf.class).putExtra("num","pppr3");
                startActivity(intent);
            }
        });
        pppr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(phyprepprs.this,Webviewpdf.class).putExtra("num","pppr4");
                startActivity(intent);
            }
        });
        pppr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(phyprepprs.this,Webviewpdf.class).putExtra("num","pppr5");
                startActivity(intent);
            }
        });
        pppr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(phyprepprs.this,Webviewpdf.class).putExtra("num","pppr6");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_phyprepprs, menu);
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
