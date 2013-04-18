package org.wordrobe.wordrobe;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.Display;
import android.view.Menu;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
    }
    
    private void setup() {
    	WebView myWebView = (WebView) findViewById(R.id.WebView1);
    	myWebView.setWebViewClient(new WebViewClient() {});
    	WebSettings webSettings = myWebView.getSettings();
    	webSettings.setJavaScriptEnabled(true);
    	webSettings.setUseWideViewPort(true);
    	webSettings.setLoadWithOverviewMode(true);
    	webSettings.setBuiltInZoomControls(true);
    	myWebView.loadUrl("http://wordrobe.housing.rug.nl/Wordrobe/public/Login.aspx");	
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
