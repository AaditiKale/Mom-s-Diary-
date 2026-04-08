package com.example.momsdiary;

import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Moved webView to class-level field so onBackPressed() can access it
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        webView = new WebView(this);

        // Handle page errors gracefully instead of showing a blank screen
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request,
                                        WebResourceError error) {
                view.loadData(
                    "<html><body style='font-family:serif; padding:2rem; color:#4b2e2e;'>" +
                    "<h2>Oops! Something went wrong.</h2>" +
                    "<p>Could not load the diary. Please restart the app.</p>" +
                    "</body></html>",
                    "text/html",
                    "UTF-8"
                );
            }
        });

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Allow localStorage to work inside the WebView
        webSettings.setDomStorageEnabled(true);

        webView.loadUrl("file:///android_asset/index.html");
        setContentView(webView);
    }

    // Handle Android back button — go back in WebView history before closing app
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
