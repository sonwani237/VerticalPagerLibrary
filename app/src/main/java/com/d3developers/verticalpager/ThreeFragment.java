package com.d3developers.verticalpager;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class ThreeFragment extends Fragment {

    private static WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_three, container, false);

        webView = view.findViewById(R.id.webView);

        return view;
    }

    public static void setmNum(int Num, final String URL) {

        Log.e("Position ", " select "+Num+" , "+URL);

        if (webView!=null){
            webView.clearView();
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                WebSettings webSettings=webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.loadUrl(URL);
                webView.setWebViewClient(new WebViewClient());
            }
        }, 500);

    }

}
