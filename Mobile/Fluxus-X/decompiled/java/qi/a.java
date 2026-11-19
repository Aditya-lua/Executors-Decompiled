package qi;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bi.h;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import eh.v0;
import java.util.Iterator;
import java.util.Vector;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class a extends qi.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f30023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Vector<String> f30024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Connection f30026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f30027i;

    /* JADX INFO: renamed from: qi.a$a, reason: collision with other inner class name */
    public class C0588a implements Callback {

        /* JADX INFO: renamed from: qi.a$a$a, reason: collision with other inner class name */
        public class RunnableC0589a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f30029a;

            public RunnableC0589a(String str) {
                this.f30029a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b(this.f30029a);
            }
        }

        public C0588a() {
        }

        @Override // com.roblox.engine.jni.memstorage.Callback
        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.ExecuteJavaScript : " + str);
            a.this.o(new RunnableC0589a(str));
        }
    }

    public interface b {
        void a(String str);
    }

    public class c extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WebViewClient f30030a;

        public c(WebViewClient webViewClient) {
            this.f30030a = webViewClient;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f30030a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f30030a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            a.this.f30025g = true;
            WebViewClient webViewClient = this.f30030a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            }
            a.this.n();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            a.this.f30025g = false;
            WebViewClient webViewClient = this.f30030a;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f30030a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f30030a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return false;
        }
    }

    public a(Context context, b bVar) {
        super(context);
        this.f30023e = "rbx.browserservice";
        this.f30024f = null;
        this.f30025g = false;
        this.f30027i = bVar;
    }

    @Override // qi.b, al.d
    public void a() {
        p();
        Vector<String> vector = this.f30024f;
        if (vector != null) {
            vector.clear();
            this.f30024f = null;
        }
        this.f30026h = null;
        this.f30027i = null;
        super.a();
    }

    @Override // al.d
    public void b(String str) {
        if (this.f30025g) {
            super.b(str);
            return;
        }
        if (this.f30024f == null) {
            this.f30024f = new Vector<>();
        }
        this.f30024f.add(str);
    }

    @Override // al.d
    public void e(String str) {
        b bVar = this.f30027i;
        if (bVar != null) {
            bVar.a(str);
        } else {
            MemStorage.fire("BrowserService.JavaScriptCallback", str);
        }
    }

    @Override // qi.b, al.d
    public void g(Context context) {
    }

    @Override // qi.b
    public void h() {
        q.b("rbx.browserservice", "create -> bindBrowserService");
        m();
    }

    @Override // qi.b
    public void i() {
        if (h.a().V2()) {
            v0.t();
        }
        if (h.a().Q2()) {
            q.b("rbx.browserservice", "destroy -> destroyWebView");
            a();
        } else {
            q.b("rbx.browserservice", "destroy -> unbindBrowserService");
            p();
        }
    }

    public final void m() {
        this.f30026h = MemStorage.bind("BrowserService.ExecuteJavaScript", new C0588a());
    }

    public final void n() {
        Vector<String> vector = this.f30024f;
        if (vector != null) {
            Iterator<String> it = vector.iterator();
            while (it.hasNext()) {
                super.b(it.next());
            }
            this.f30024f.clear();
        }
    }

    public final void o(Runnable runnable) {
        this.b.post(runnable);
    }

    public final void p() {
        Connection connection = this.f30026h;
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
        this.f30023e = "rbx.browserservice";
        this.f30024f = null;
        this.f30025g = false;
    }
}
