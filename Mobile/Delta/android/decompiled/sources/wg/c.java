package wg;

import android.os.Handler;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import gk.p;
import org.json.JSONException;
import org.json.JSONObject;
import vg.c0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34242a = "rbx.browserservice";
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f34243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f34244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f34245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Connection f34246f;

    public class a implements Callback {

        /* JADX INFO: renamed from: wg.c$a$a, reason: collision with other inner class name */
        public class RunnableC0625a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nl.a f34248a;

            public RunnableC0625a(nl.a aVar) {
                this.f34248a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f34243c.g(this.f34248a);
            }
        }

        public a() {
        }

        public void onItemSet(String str) {
            p.b("rbx.browserservice", "BrowserService.OpenBrowserWindow : " + str);
            c0.w(c0.b.BROWSER_SERVICE_BRIDGE, str);
            c.this.d(new RunnableC0625a(new nl.a(str)));
        }
    }

    public class b implements Callback {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f34243c.e();
            }
        }

        public b() {
        }

        public void onItemSet(String str) {
            p.b("rbx.browserservice", "BrowserService.CloseBrowserWindow");
            c.this.d(new a());
        }
    }

    /* JADX INFO: renamed from: wg.c$c, reason: collision with other inner class name */
    public class C0626c implements Callback {

        /* JADX INFO: renamed from: wg.c$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nl.a f34252a;

            public a(nl.a aVar) {
                this.f34252a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f34243c.g(this.f34252a);
            }
        }

        /* JADX INFO: renamed from: wg.c$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ nl.a f34253a;

            public b(nl.a aVar) {
                this.f34253a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f34243c.d(this.f34253a);
            }
        }

        public C0626c() {
        }

        public void onItemSet(String str) {
            p.b("rbx.browserservice", "BrowserService.SendCommand : " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("command");
                if (string.equals("open")) {
                    String string2 = jSONObject.getString("url");
                    c0.w(c0.b.BROWSER_SERVICE_BRIDGE, string2);
                    c.this.d(new a(new nl.a(string2, jSONObject.optString(Title.type, ""), Boolean.valueOf(jSONObject.optBoolean("visible", true)), Boolean.valueOf(jSONObject.optBoolean("modal", false)), Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled", false)), Boolean.valueOf(jSONObject.optBoolean("showDomainAsTitle", false)))));
                } else {
                    if (string.equals("config")) {
                        c.this.d(new b(new nl.a(null, jSONObject.has(Title.type) ? jSONObject.optString(Title.type) : null, jSONObject.has("visible") ? Boolean.valueOf(jSONObject.optBoolean("visible")) : null, null, jSONObject.has("backNavigationDisabled") ? Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled")) : null, Boolean.FALSE)));
                        return;
                    }
                    p.e("rbx.browserservice", "ERROR, Command is not supported, BrowserService.SendCommand : " + str);
                }
            } catch (JSONException unused) {
                p.e("rbx.browserservice", "ERROR, BrowserService.SendCommand : " + str);
            }
        }
    }

    public interface d {
        void d(nl.a aVar);

        void e();

        void g(nl.a aVar);
    }

    public c(d dVar, Handler handler) {
        this.f34243c = dVar;
        this.b = handler;
    }

    public void c() {
        this.f34244d = MemStorage.bind("BrowserService.OpenBrowserWindow", new a());
        this.f34245e = MemStorage.bind("BrowserService.CloseBrowserWindow", new b());
        this.f34246f = MemStorage.bind("BrowserService.SendCommand", new C0626c());
    }

    public final void d(Runnable runnable) {
        this.b.post(runnable);
    }

    public void e() {
        Connection connection = this.f34244d;
        if (connection != null) {
            connection.disconnect();
        }
        Connection connection2 = this.f34245e;
        if (connection2 != null) {
            connection2.disconnect();
        }
        Connection connection3 = this.f34246f;
        if (connection3 != null) {
            connection3.disconnect();
        }
    }
}
