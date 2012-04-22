/**
 * 
 */
package kr.or.tyson.namseoulch;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * @author sty1013
 *
 */
public class ChurchIntroduction extends Activity {
    
    private WebView mWebView;
    private static final String CHURCH_INTRODUCTION_URL = "http://namseoulch.com/main/sub.html?pageCode=3";
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.church_introduction);
        
        mWebView = (WebView) findViewById(R.id.IntroduceChurchWebView);
        mWebView.getSettings().setJavaScriptEnabled(true); //자바스크립트 허용
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl(CHURCH_INTRODUCTION_URL);
    }
}
