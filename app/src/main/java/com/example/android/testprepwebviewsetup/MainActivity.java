package com.example.android.testprepwebviewsetup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView Home = (WebView)findViewById(R.id.HomeScreen);
        Home.setWebViewClient(new WebViewClient());

        Home.getSettings().setJavaScriptEnabled(true);

        Home.loadUrl("http://theexamguru.com/testprep");
    }
}
