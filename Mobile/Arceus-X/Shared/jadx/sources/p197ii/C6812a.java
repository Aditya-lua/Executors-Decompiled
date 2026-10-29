package p197ii;

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
import java.util.Iterator;
import java.util.Vector;
import p151gk.C6124q;
import th.C11659h;
import vg.C12173c0;

/* JADX INFO: renamed from: ii.a */
/* JADX INFO: loaded from: classes2.dex */
public class C6812a extends RBHybridWebView {

    /* JADX INFO: renamed from: e */
    public final String f26760e;

    /* JADX INFO: renamed from: f */
    public Vector<String> f26761f;

    /* JADX INFO: renamed from: g */
    public boolean f26762g;

    /* JADX INFO: renamed from: h */
    public Connection f26763h;

    /* JADX INFO: renamed from: i */
    public b f26764i;

    /* JADX INFO: renamed from: ii.a$a */
    public class a implements Callback {

        /* JADX INFO: renamed from: ii.a$a$a, reason: collision with other inner class name */
        public class RunnableC14189a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f26766a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public RunnableC14189a(String str) {
                this.f26766a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C6812a.this.mo29177b(this.f26766a);
            }
        }

        public a() {
        }

        public void onItemSet(String str) {
            C6124q.m27057b("rbx.browserservice", "BrowserService.ExecuteJavaScript : " + str);
            C6812a.this.m29181o(new RunnableC14189a(str));
        }
    }

    /* JADX INFO: renamed from: ii.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo15031a(String str);
    }

    /* JADX INFO: renamed from: ii.a$c */
    public class c extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public WebViewClient f26768a;

        public c(WebViewClient webViewClient) {
            this.f26768a = webViewClient;
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            WebViewClient webViewClient = this.f26768a;
            if (webViewClient != null) {
                webViewClient.onLoadResource(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            WebViewClient webViewClient = this.f26768a;
            if (webViewClient != null) {
                webViewClient.onPageCommitVisible(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            C6812a.this.f26762g = true;
            WebViewClient webViewClient = this.f26768a;
            if (webViewClient != null) {
                webViewClient.onPageFinished(webView, str);
            }
            C6812a.this.m29180n();
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            C6812a.this.f26762g = false;
            WebViewClient webViewClient = this.f26768a;
            if (webViewClient != null) {
                webViewClient.onPageStarted(webView, str, bitmap);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            WebViewClient webViewClient = this.f26768a;
            if (webViewClient != null) {
                webViewClient.onReceivedError(webView, webResourceRequest, webResourceError);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            WebViewClient webViewClient = this.f26768a;
            if (webViewClient != null) {
                return webViewClient.shouldOverrideUrlLoading(webView, webResourceRequest);
            }
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6812a(Context context, b bVar) {
        super(context);
        this.f26760e = "rbx.browserservice";
        this.f26761f = null;
        this.f26762g = false;
        this.f26764i = bVar;
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView, tk.C11669d
    /* JADX INFO: renamed from: a */
    public void mo15285a() {
        m29182p();
        Vector<String> vector = this.f26761f;
        if (vector != null) {
            vector.clear();
            this.f26761f = null;
        }
        this.f26763h = null;
        this.f26764i = null;
        super.mo15285a();
    }

    @Override // tk.C11669d
    /* JADX INFO: renamed from: b */
    public void mo29177b(String str) {
        if (this.f26762g) {
            super.mo29177b(str);
            return;
        }
        if (this.f26761f == null) {
            this.f26761f = new Vector<>();
        }
        this.f26761f.add(str);
    }

    @Override // tk.C11669d
    /* JADX INFO: renamed from: e */
    public void mo29178e(String str) {
        b bVar = this.f26764i;
        if (bVar != null) {
            bVar.mo15031a(str);
        } else {
            MemStorage.fire("BrowserService.JavaScriptCallback", str);
        }
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView, tk.C11669d
    /* JADX INFO: renamed from: g */
    public void mo15287g(Context context) {
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView
    /* JADX INFO: renamed from: h */
    public void mo15288h() {
        C6124q.m27057b("rbx.browserservice", "create -> bindBrowserService");
        m29179m();
    }

    @Override // com.roblox.client.hybrid.RBHybridWebView
    /* JADX INFO: renamed from: i */
    public void mo15289i() {
        if (C11659h.m43403a().mo43504O2()) {
            C12173c0.m45031t();
        }
        if (C11659h.m43403a().mo43470J2()) {
            C6124q.m27057b("rbx.browserservice", "destroy -> destroyWebView");
            mo15285a();
        } else {
            C6124q.m27057b("rbx.browserservice", "destroy -> unbindBrowserService");
            m29182p();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m29179m() {
        this.f26763h = MemStorage.bind("BrowserService.ExecuteJavaScript", new a());
    }

    /* JADX INFO: renamed from: n */
    public final void m29180n() {
        Vector<String> vector = this.f26761f;
        if (vector != null) {
            Iterator<String> it = vector.iterator();
            while (it.hasNext()) {
                super.mo29177b(it.next());
            }
            this.f26761f.clear();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m29181o(Runnable runnable) {
        this.f41258b.post(runnable);
    }

    /* JADX INFO: renamed from: p */
    public final void m29182p() {
        Connection connection = this.f26763h;
        if (connection != null) {
            connection.disconnect();
        }
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(new c(webViewClient));
    }

    public C6812a(Context context) {
        super(context);
        this.f26760e = "rbx.browserservice";
        this.f26761f = null;
        this.f26762g = false;
    }
}
