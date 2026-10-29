package ii;

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
import gk.p;
import java.util.Iterator;
import java.util.Vector;
import th.h;
import vg.c0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends RBHybridWebView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Vector<String> f20497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f20498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Connection f20499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f20500i;

    /* JADX INFO: renamed from: ii.a$a, reason: collision with other inner class name */
    public class C0362a implements Callback {

        /* JADX INFO: renamed from: ii.a$a$a, reason: collision with other inner class name */
        public class RunnableC0363a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f20502a;

            public RunnableC0363a(String str) {
                this.f20502a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b(this.f20502a);
            }
        }

        public C0362a() {
        }

        public void onItemSet(String str) {
            p.b("rbx.browserservice", "BrowserService.ExecuteJavaScript : " + str);
            a.this.o(new RunnableC0363a(str));
        }
    }

    public interface b {
        void a(String str);
    }

    public class c extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WebViewClient f20503a;

        public c(WebViewClient webViewClient) {
            this.f20503a = webViewClient;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f20503a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f20503a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            a.this.f20498g = true;
            WebViewClient webViewClient = this.f20503a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            }
            a.this.n();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            a.this.f20498g = false;
            WebViewClient webViewClient = this.f20503a;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f20503a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f20503a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return false;
        }
    }

    public a(Context context, b bVar) {
        super(context);
        this.f20496e = "rbx.browserservice";
        this.f20497f = null;
        this.f20498g = false;
        this.f20500i = bVar;
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView, tk.d
    public void a() {
        p();
        Vector<String> vector = this.f20497f;
        if (vector != null) {
            vector.clear();
            this.f20497f = null;
        }
        this.f20499h = null;
        this.f20500i = null;
        super.a();
    }

    @Override // tk.d
    public void b(String str) {
        if (this.f20498g) {
            super.b(str);
            return;
        }
        if (this.f20497f == null) {
            this.f20497f = new Vector<>();
        }
        this.f20497f.add(str);
    }

    @Override // tk.d
    public void e(String str) {
        b bVar = this.f20500i;
        if (bVar != null) {
            bVar.a(str);
        } else {
            MemStorage.fire("BrowserService.JavaScriptCallback", str);
        }
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView, tk.d
    public void g(Context context) {
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView
    public void h() {
        p.b("rbx.browserservice", "create -> bindBrowserService");
        m();
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView
    public void i() {
        if (h.a().I2()) {
            c0.t();
        }
        if (h.a().D2()) {
            p.b("rbx.browserservice", "destroy -> destroyWebView");
            a();
        } else {
            p.b("rbx.browserservice", "destroy -> unbindBrowserService");
            p();
        }
    }

    public final void m() {
        this.f20499h = MemStorage.bind("BrowserService.ExecuteJavaScript", new C0362a());
    }

    public final void n() {
        Vector<String> vector = this.f20497f;
        if (vector != null) {
            Iterator<String> it = vector.iterator();
            while (it.hasNext()) {
                super.b(it.next());
            }
            this.f20497f.clear();
        }
    }

    public final void o(Runnable runnable) {
        this.b.post(runnable);
    }

    public final void p() {
        Connection connection = this.f20499h;
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
        this.f20496e = "rbx.browserservice";
        this.f20497f = null;
        this.f20498g = false;
    }
}
