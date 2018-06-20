package com.example.mamun.websiteconverterexample;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private Context mContext;
    private Activity mActivity;
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = getApplicationContext();
        mActivity = MainActivity.this;
        mWebView = (WebView) findViewById(R.id.webView);

        mWebView.getSettings().setJavaScriptEnabled(true);

        // Set web view clicent for web view
        mWebView.setWebViewClient(new WebViewClient());

        // Register the context menu for web view
        registerForContextMenu(mWebView);

        // Specify the url to load in web view
        String url = "https://youtube.com";

        // Load the url to visit
        mWebView.loadUrl(url);


    }
}
