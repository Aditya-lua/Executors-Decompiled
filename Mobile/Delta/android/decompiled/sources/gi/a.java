package gi;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.roblox.client.hybrid.RBHybridWebView;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import ek.q;
import java.util.Iterator;
import java.util.Vector;
import rh.h;
import ug.c0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends RBHybridWebView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Vector<String> f18554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Connection f18556h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f18557i;

    /* JADX INFO: renamed from: gi.a$a, reason: collision with other inner class name */
    public class C0328a implements Callback {

        /* JADX INFO: renamed from: gi.a$a$a, reason: collision with other inner class name */
        public class RunnableC0329a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f18559a;

            public RunnableC0329a(String str) {
                this.f18559a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b(this.f18559a);
            }
        }

        public C0328a() {
        }

        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.ExecuteJavaScript : " + str);
            a.this.o(new RunnableC0329a(str));
        }
    }

    public interface b {
        void a(String str);
    }

    public class c extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WebViewClient f18560a;

        public c(WebViewClient webViewClient) {
            this.f18560a = webViewClient;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f18560a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f18560a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            a.this.f18555g = true;
            WebViewClient webViewClient = this.f18560a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            }
            a.this.n();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            a.this.f18555g = false;
            WebViewClient webViewClient = this.f18560a;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f18560a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f18560a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return false;
        }
    }

    public a(Context context, b bVar) {
        super(context);
        this.f18553e = "rbx.browserservice";
        this.f18554f = null;
        this.f18555g = false;
        this.f18557i = bVar;
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView, rk.d
    public void a() {
        p();
        Vector<String> vector = this.f18554f;
        if (vector != null) {
            vector.clear();
            this.f18554f = null;
        }
        this.f18556h = null;
        this.f18557i = null;
        super.a();
    }

    @Override // rk.d
    public void b(String str) {
        if (this.f18555g) {
            super.b(str);
            return;
        }
        if (this.f18554f == null) {
            this.f18554f = new Vector<>();
        }
        this.f18554f.add(str);
    }

    @Override // rk.d
    public void e(String str) {
        b bVar = this.f18557i;
        if (bVar != null) {
            bVar.a(str);
        } else {
            MemStorage.fire("BrowserService.JavaScriptCallback", str);
        }
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView, rk.d
    public void g(Context context) {
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView
    public void h() {
        q.b("rbx.browserservice", "create -> bindBrowserService");
        m();
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView
    public void i() {
        if (h.a().T2()) {
            c0.t();
        }
        if (h.a().O2()) {
            q.b("rbx.browserservice", "destroy -> destroyWebView");
            a();
        } else {
            q.b("rbx.browserservice", "destroy -> unbindBrowserService");
            p();
        }
    }

    public final void m() {
        this.f18556h = MemStorage.bind("BrowserService.ExecuteJavaScript", new C0328a());
    }

    public final void n() {
        Vector<String> vector = this.f18554f;
        if (vector != null) {
            Iterator<String> it = vector.iterator();
            while (it.hasNext()) {
                super.b(it.next());
            }
            this.f18554f.clear();
        }
    }

    public final void o(Runnable runnable) {
        this.b.post(runnable);
    }

    public final void p() {
        Connection connection = this.f18556h;
        if (connection != null) {
            connection.disconnect();
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new c(webViewClient));
    }

    public a(Context context) {
        super(context);
        this.f18553e = "rbx.browserservice";
        this.f18554f = null;
        this.f18555g = false;
    }
}
