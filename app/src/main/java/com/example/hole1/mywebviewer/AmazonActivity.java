package com.example.hole1.mywebviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AmazonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);
        WebView amazonView=(WebView) findViewById(R.id.webViewAmazon);
        amazonView.loadUrl("https://www.amazon.com/");
    }
}
