package com.example.webviewsampleandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Parshi sai krishna.
 */
public class MainActivity extends AppCompatActivity {
    private WebView myWebView;
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myWebView = findViewById(R.id.web_view);
        myWebView.setWebViewClient(new MyWebViewClient());
        myWebView.getSettings().setJavaScriptEnabled(true);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.getSettings().setDomStorageEnabled(true);
        openURL();

//        myWebView.loadUrl("https://email.principleacs.com/");

    }
    private void openURL() {
        myWebView.loadUrl("https://www.worldometers.info/coronavirus/country/india/");
        myWebView.requestFocus();
    }
}
