package com.udemy.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    lateinit  var webView : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.web)

        webView.webViewClient = WebViewClient() // its going to open this website inside of my application
        webView.loadUrl("https://www.google.com")
    }

    override fun onBackPressed() {

        if(webView.canGoBack()){
            webView.goBack()
        }
        else{
            super.onBackPressed()
        }

    }
}