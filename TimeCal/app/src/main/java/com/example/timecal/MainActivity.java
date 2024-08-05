package com.example.timecal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView home =findViewById(R.id.home);
        home.setWebViewClient(new WebViewClient());
        home.getSettings().setJavaScriptEnabled(true);

        home.loadUrl("file:///android_asset/home.html");
    }
}