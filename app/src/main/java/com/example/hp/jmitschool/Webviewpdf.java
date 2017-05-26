package com.example.hp.jmitschool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class Webviewpdf extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewpdf);
        getSupportActionBar().hide();
        String num1=getIntent().getStringExtra("num");
        switch (num1){
            case "chemsumm1":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjMXlwazQzYlo3Vk0/view?usp=sharing");
                break;
            }
            case "chemsumm2":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjUzhoSjZNdmVQaDA/view?usp=sharing");
                break;
            }
            case "chemsumm3":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjcGxmbW5lUFd6bjg/view?usp=sharing");
                break;
            }
            case "chemsumm4":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjcEJjY09aOVRnOE0/view?usp=sharing");
                break;
            }
            case "chemsumm5":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2Jja3J4c0ZKcVUtbGs/view?usp=sharing");
                break;
            }
            case "chemsumm6":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjLWhxU1pCcm5rNnM/view?usp=sharing");
                break;
            }
            case "chemsumm7":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjSVViZTFtTVpsVmM/view?usp=sharing");
                break;
            }
            case "chemsumm8":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjVEgwZEhCWUR0NDQ/view?usp=sharing");
                break;
            }
            case "chemsumm9":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjTXRZOGNRNEtaNjQ/view?usp=sharing");
                break;
            }
            case "chemsumm10":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjZ0lCQVZLYlVhZGc/view?usp=sharing");
                break;
            }
            case "chemsumm11":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjeFByWUNtelJBb00/view?usp=sharing");
                break;
            }
            case "chemsumm12":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjVWNhVkVBWi1FLUk/view?usp=sharing");
                break;
            }
            case "chemsumm13":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjNklqd0NzbFZlUlU/view?usp=sharing");
                break;
            }
            case "chemsumm14":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjYjA0bFRMUGlVWGs/view?usp=sharing");
                break;
            }
            case "chemsumm15":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjWldyNC1OUVAxSXc/view?usp=sharing");
                break;
            }
            case "chemsumm16":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjbnY1TFhqM2ZRLVE/view?usp=sharing");
                break;
            }


            case "physumm1":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjRHhoTGdFOG9yVHc/view?usp=sharing");
                break;
            }
            case "physumm2":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjVUVhVjVVcWVwVmM/view?usp=sharing");
                break;
            }
            case "physumm3":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjeWxFanZDQWlyN0U/view?usp=sharing");
                break;
            }
            case "physumm4":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjdV9xRF9XZXhwaVE/view?usp=sharing");
                break;
            }
            case "physumm5":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjdE5NT29GTVk2ZU0/view?usp=sharing");
                break;
            }
            case "physumm6":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjMU54VjhlN3dJdkk/view?usp=sharing");
                break;
            }
            case "physumm7":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjZEltaWowcjlSSVk/view?usp=sharing");
                break;
            }
            case "physumm8":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjZVJVemJLR253V1U/view?usp=sharing");
                break;
            }
            case "physumm9":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjWG9abV9pd2JFWGM/view?usp=sharing");
                break;
            }
            case "physumm10":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2Jjb29sRTBMVExFN00/view?usp=sharing");
                break;
            }
            case "physumm11":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjajhISmtSV3lnN2M/view?usp=sharing");
                break;
            }
            case "physumm12":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjOUplZXF6Vngwb0k/view?usp=sharing");
                break;
            }
            case "physumm13":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjQ3RSXzV2U1p6RjA/view?usp=sharing");
                break;
            }
            case "physumm14":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjeE9vS09MdVpPSW8/view?usp=sharing");
                break;
            }
            case "physumm15":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjM2xfTTRhT0treG8/view?usp=sharing");
                break;
            }


            case "physa1":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjaTZfOUlZVzNlZ3M/view?usp=sharing");
                break;
            }
            case "physa2":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2Jjb3RLMmtDQVU5YTA/view?usp=sharing");
                break;
            }
            case "physa3":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjVEIzYVpMSkdkQU0/view?usp=sharing");
                break;
            }
            case "physa4":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjU0tVLVJGNFhSLXc/view?usp=sharing");
                break;
            }
            case "physa5":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjMFJjQVNqdEtoUjQ/view?usp=sharing");
                break;
            }
            case "physa6":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjM2FUWDU1TW5wenc/view?usp=sharing");
                break;
            }

            case "chemsa1":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjWlVZS2JBd3V3b0U/view?usp=sharing");
                break;
            }
            case "chemsa2":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjbkNNUzBuY0ZhZDA/view?usp=sharing");
                break;
            }
            case "chemsa3":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2Jjc1pyVU5iejY5ajg/view?usp=sharing");
                break;
            }
            case "chemsa4":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjcFBnYTNWcmF2WkE/view?usp=sharing");
                break;
            }
            case "chemsa5":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjUnRON0std0JhUEU/view?usp=sharing");
                break;
            }
            case "chemsa6":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjblFUVmhEcWltMWc/view?usp=sharing");
                break;
            }

            case "mathsa1":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjYkhWU0RzZXZsRWc/view?usp=sharing");
                break;
            }
            case "mathsa2":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjQldvQUFjdGN0MTg/view?usp=sharing");
                break;
            }
            case "mathsa3":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2Jjc25JdmpCaU80Vkk/view?usp=sharing");
                break;
            }
            case "mathsa4":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjRlFoTEYyTENUck0/view?usp=sharing");
                break;
            }
            case "mathsa5":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjNlZncFh3VnNLNG8/view?usp=sharing");
                break;
            }
            case "mathsa6":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2Jjc2RSLWxPNTRUQjA/view?usp=sharing");
                break;
            }

            case "physyl":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjaU14QzVKU3I2RHM/view?usp=sharing");
                break;
            }
            case "chemsyl":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjaGREbnRCTFhNcUE/view?usp=sharing");
                break;
            }
            case "mathsyl":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2Jja0F0S1V2UVVoblE/view?usp=sharing");
                break;
            }

            case "phyimp":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjS3F3T3Eya1lRLXc/view?usp=sharing");
                break;
            }
            case "chemimp":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjUUI0TER4THk1VGc/view?usp=sharing");
                break;
            }

            case "mppr1":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjekItNEFzTlVScFU/view?usp=sharing");
                break;
            }
            case "mppr2":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjX0NfbmlqTm9FaHc/view?usp=sharing");
                break;
            }
            case "mppr3":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjZEFFQnhJd0pEZE0/view?usp=sharing");
                break;
            }
            case "mppr4":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjU0FPMWx0ZWk3R0U/view?usp=sharing");
                break;
            }
            case "mppr5":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjRzZONEppMUQ1TUE/view?usp=sharing");
                break;
            }
            case "mppr6":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjUklXUDd5VkZjdTA/view?usp=sharing");
                break;
            }

            case "pppr1":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjME9rUG9XcWxKR2s/view?usp=sharing");
                break;
            }
            case "pppr2":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjdWxvbmZOdTRzRXc/view?usp=sharing");
                break;
            }
            case "pppr3":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjMTRzVE55alJSdWc/view?usp=sharing");
                break;
            }
            case "pppr4":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2Jjb205OGRFUFg1T1E/view?usp=sharing");
                break;
            }
            case "pppr5":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjNE4tdHFIVlZVR2M/view?usp=sharing");
                break;
            }
            case "pppr6":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjWXIwR3N0V1lRc2c/view?usp=sharing");
                break;
            }

            case "cppr1":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjVFNNazlLR3BMWVU/view?usp=sharing");
                break;
            }
            case "cppr2":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjVUNycmQ4d0o4eDg/view?usp=sharing");
                break;
            }
            case "cppr3":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjYWpoREw1amoxU00/view?usp=sharing");
                break;
            }
            case "cppr4":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2Jja08tT05jZ0tQOVE/view?usp=sharing");
                break;
            }
            case "cppr5":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjTkNicjZtanFVeEk/view?usp=sharing");
                break;
            }
            case "cppr6":{
                webView=(WebView)findViewById(R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/file/d/0B_Hiqft0m2JjWG1aQXMwMjFBZzQ/view?usp=sharing");
                break;
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_webviewpdf, menu);
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
