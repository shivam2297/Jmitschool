package com.example.hp.jmitschool;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Physamplepapers extends AppCompatActivity {
    TextView paper1,paper2,paper3,paper4,paper5,paper6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physamplepapers);
        getSupportActionBar().hide();
        paper1=(TextView)findViewById(R.id.paper1);
        paper2=(TextView)findViewById(R.id.paper2);
        paper3=(TextView)findViewById(R.id.paper3);
        paper4=(TextView)findViewById(R.id.paper4);
        paper5=(TextView)findViewById(R.id.paper5);
        paper6=(TextView)findViewById(R.id.paper6);

        paper1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Physamplepapers.this,Webviewpdf.class).putExtra("num","physa1");
                startActivity(intent);
            }
        });

        paper2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Physamplepapers.this,Webviewpdf.class).putExtra("num","physa2");
                startActivity(intent);
            }
        });

        paper3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Physamplepapers.this,Webviewpdf.class).putExtra("num","physa3");
                startActivity(intent);
            }
        });

        paper4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Physamplepapers.this,Webviewpdf.class).putExtra("num","physa4");
                startActivity(intent);
            }
        });

        paper5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Physamplepapers.this,Webviewpdf.class).putExtra("num","physa5");
                startActivity(intent);
            }
        });

        paper6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Physamplepapers.this,Webviewpdf.class).putExtra("num","physa6");
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_physamplepapers, menu);
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
