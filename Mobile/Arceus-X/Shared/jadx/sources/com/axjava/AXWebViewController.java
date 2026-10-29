package com.axjava;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class AXWebViewController {
    public static WebView sWebView;

    public static void evalJs(String js2) {
        WebView webView = sWebView;
        if (webView != null) {
            webView.evaluateJavascript(js2, null);
        }
    }

    public static String getRandomUserAgent() {
        switch (new Random().nextInt(12)) {
            case 0:
                return "Mozilla/5.0 (Linux; Android 14; SM-G998B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Mobile Safari/537.36";
            case 1:
                return "Mozilla/5.0 (Linux; Android 14; SM-S918B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Mobile Safari/537.36";
            case 2:
                return "Mozilla/5.0 (Linux; Android 14; SM-S926B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Mobile Safari/537.36";
            case 3:
                return "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Mobile Safari/537.36";
            case 4:
                return "Mozilla/5.0 (Linux; Android 14; Pixel 8) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Mobile Safari/537.36";
            case 5:
                return "Mozilla/5.0 (Linux; Android 14; Pixel 8 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Mobile Safari/537.36";
            case 6:
                return "Mozilla/5.0 (Linux; Android 13; 2201123G) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/121.0.0.0 Mobile Safari/537.36";
            case 7:
                return "Mozilla/5.0 (Linux; Android 14; 23127PN0CG) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Mobile Safari/537.36";
            case 8:
                return "Mozilla/5.0 (Linux; Android 14; CPH2481) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Mobile Safari/537.36";
            case 9:
                return "Mozilla/5.0 (Linux; Android 13; V2230) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Mobile Safari/537.36";
            case 10:
                return "Mozilla/5.0 (Linux; Android 14; M2102J20SG) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Mobile Safari/537.36";
            case 11:
                return "Mozilla/5.0 (Linux; Android 13; LE2123) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Mobile Safari/537.36";
            default:
                return "Mozilla/5.0 (Linux; Android 14; SM-G998B) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Mobile Safari/537.36";
        }
    }

    public static native void nativeOnButtonClicked();

    public static native void nativeOnJsMessage(String str);

    public static native void nativeOnPageFinished(String str);

    public static native void nativeOnPageStarted(String str);

    public static native void nativeOnRedirect(String str);

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public static Dialog openControlledWebView(Activity activity, String url) {
        Dialog dialog = new Dialog(activity);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Button button = new Button(activity);
        button.setText("Auto Complete Key system");
        button.setOnClickListener(new View.OnClickListener() { // from class: com.axjava.AXWebViewController.3
            @Override // android.view.View.OnClickListener
            public void onClick(View v5) {
                AXWebViewController.evalJs("console.log('Auto button clicked');");
                AXWebViewController.nativeOnButtonClicked();
            }
        });
        button.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        WebView webView = new WebView(activity);
        sWebView = webView;
        webView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setDatabaseEnabled(true);
        webView.getSettings().setUserAgentString(getRandomUserAgent());
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setMixedContentMode(2);
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        cookieManager.setAcceptThirdPartyCookies(webView, true);
        WebStorage.getInstance();
        webView.addJavascriptInterface(new Object() { // from class: com.axjava.AXWebViewController.1
            @JavascriptInterface
            public void postMessage(String msg) {
                AXWebViewController.nativeOnJsMessage(msg);
            }
        }, "AXNative");
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient() { // from class: com.axjava.AXWebViewController.2
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url2) {
                AXWebViewController.nativeOnPageFinished(url2);
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url2, Bitmap favicon) {
                AXWebViewController.nativeOnPageStarted(url2);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                AXWebViewController.nativeOnRedirect(request.getUrl().toString());
                return false;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String nextUrl) {
                AXWebViewController.nativeOnRedirect(nextUrl);
                return false;
            }
        });
        webView.resumeTimers();
        webView.onResume();
        linearLayout.addView(button);
        linearLayout.addView(webView);
        dialog.setContentView(linearLayout);
        dialog.show();
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        webView.loadUrl(url);
        CookieManager.getInstance().flush();
        return dialog;
    }
}
