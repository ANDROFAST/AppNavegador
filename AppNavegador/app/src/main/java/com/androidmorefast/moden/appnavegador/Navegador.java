package com.androidmorefast.moden.appnavegador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Navegador extends AppCompatActivity {
    WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegador);

        webView1=(WebView)findViewById(R.id.webView);
       webView1.clearCache(true);// Limpiamos cache
       webView1.clearHistory();// Limpiamos historial
        //las 2 lineas de codigo abajo son para que las paginas con javascript funciones correctamente
        webView1.getSettings().setJavaScriptEnabled(true);

        webView1.getSettings().setLoadWithOverviewMode(true);
        webView1.getSettings().setUseWideViewPort(true);
        webView1.setWebChromeClient(new WebChromeClient());
        webView1.setWebViewClient(new WebViewClient());

        webView1.getSettings().setSaveFormData(true);
        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("direccion");
        webView1.loadUrl("http://" + dato);
    }

    public void finalizar(View v) {
        finish();
    }
}

