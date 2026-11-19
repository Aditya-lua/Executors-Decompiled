package fh;

import android.os.Handler;
import com.github.luben.zstd.BuildConfig;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import eh.v0;
import ok.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16107a = "rbx.browserservice";
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f16108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f16109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f16110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Connection f16111f;

    public class a implements Callback {

        /* JADX INFO: renamed from: fh.b$a$a, reason: collision with other inner class name */
        public class RunnableC0297a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ bm.a f16113a;

            public RunnableC0297a(bm.a aVar) {
                this.f16113a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f16108c.d(this.f16113a);
            }
        }

        public a() {
        }

        @Override // com.roblox.engine.jni.memstorage.Callback
        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.OpenBrowserWindow : " + str);
            v0.w(v0.b.BROWSER_SERVICE_BRIDGE, str);
            b.this.d(new RunnableC0297a(new bm.a(str)));
        }
    }

    /* JADX INFO: renamed from: fh.b$b, reason: collision with other inner class name */
    public class C0298b implements Callback {

        /* JADX INFO: renamed from: fh.b$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f16108c.e();
            }
        }

        public C0298b() {
        }

        @Override // com.roblox.engine.jni.memstorage.Callback
        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.CloseBrowserWindow");
            b.this.d(new a());
        }
    }

    public class c implements Callback {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ bm.a f16117a;

            public a(bm.a aVar) {
                this.f16117a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f16108c.d(this.f16117a);
            }
        }

        /* JADX INFO: renamed from: fh.b$c$b, reason: collision with other inner class name */
        public class RunnableC0299b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ bm.a f16118a;

            public RunnableC0299b(bm.a aVar) {
                this.f16118a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f16108c.g(this.f16118a);
            }
        }

        public c() {
        }

        @Override // com.roblox.engine.jni.memstorage.Callback
        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.SendCommand : " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("command");
                if (string.equals("open")) {
                    String string2 = jSONObject.getString("url");
                    v0.w(v0.b.BROWSER_SERVICE_BRIDGE, string2);
                    b.this.d(new a(new bm.a(string2, jSONObject.optString(Title.type, BuildConfig.FLAVOR), Boolean.valueOf(jSONObject.optBoolean("visible", true)), Boolean.valueOf(jSONObject.optBoolean("modal", false)), Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled", false)), Boolean.valueOf(jSONObject.optBoolean("showDomainAsTitle", false)))));
                } else {
                    if (string.equals("config")) {
                        b.this.d(new RunnableC0299b(new bm.a(null, jSONObject.has(Title.type) ? jSONObject.optString(Title.type) : null, jSONObject.has("visible") ? Boolean.valueOf(jSONObject.optBoolean("visible")) : null, null, jSONObject.has("backNavigationDisabled") ? Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled")) : null, Boolean.FALSE)));
                        return;
                    }
                    q.e("rbx.browserservice", "ERROR, Command is not supported, BrowserService.SendCommand : " + str);
                }
            } catch (JSONException unused) {
                q.e("rbx.browserservice", "ERROR, BrowserService.SendCommand : " + str);
            }
        }
    }

    public interface d {
        void d(bm.a aVar);

        void e();

        void g(bm.a aVar);
    }

    public b(d dVar, Handler handler) {
        this.f16108c = dVar;
        this.b = handler;
    }

    public void c() {
        this.f16109d = MemStorage.bind("BrowserService.OpenBrowserWindow", new a());
        this.f16110e = MemStorage.bind("BrowserService.CloseBrowserWindow", new C0298b());
        this.f16111f = MemStorage.bind("BrowserService.SendCommand", new c());
    }

    public final void d(Runnable runnable) {
        this.b.post(runnable);
    }

    public void e() {
        Connection connection = this.f16109d;
        if (connection != null) {
            connection.disconnect();
        }
        Connection connection2 = this.f16110e;
        if (connection2 != null) {
            connection2.disconnect();
        }
        Connection connection3 = this.f16111f;
        if (connection3 != null) {
            connection3.disconnect();
        }
    }
}
