package com.example.brint_aflevering1;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Web extends AppCompatActivity {
    private WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        Button knap6 = findViewById(R.id.button6);
        knap6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToYT();
            }
        });

    }

    private void goToYT() {
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.inside.dtu.dk");
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.canGoBack();
        } else {
            super.onBackPressed();

        }

    }
}

