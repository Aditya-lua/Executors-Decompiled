package vg;

import android.os.Handler;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ek.q;
import org.json.JSONException;
import org.json.JSONObject;
import ug.c0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33501a = "rbx.browserservice";
    public Handler b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f33502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Connection f33503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Connection f33504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Connection f33505f;

    public class a implements Callback {

        /* JADX INFO: renamed from: vg.c$a$a, reason: collision with other inner class name */
        public class RunnableC0611a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ll.a f33507a;

            public RunnableC0611a(ll.a aVar) {
                this.f33507a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f33502c.d(this.f33507a);
            }
        }

        public a() {
        }

        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.OpenBrowserWindow : " + str);
            c0.w(c0.b.BROWSER_SERVICE_BRIDGE, str);
            c.this.d(new RunnableC0611a(new ll.a(str)));
        }
    }

    public class b implements Callback {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f33502c.e();
            }
        }

        public b() {
        }

        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.CloseBrowserWindow");
            c.this.d(new a());
        }
    }

    /* JADX INFO: renamed from: vg.c$c, reason: collision with other inner class name */
    public class C0612c implements Callback {

        /* JADX INFO: renamed from: vg.c$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ll.a f33511a;

            public a(ll.a aVar) {
                this.f33511a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f33502c.d(this.f33511a);
            }
        }

        /* JADX INFO: renamed from: vg.c$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ll.a f33512a;

            public b(ll.a aVar) {
                this.f33512a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f33502c.f(this.f33512a);
            }
        }

        public C0612c() {
        }

        public void onItemSet(String str) {
            q.b("rbx.browserservice", "BrowserService.SendCommand : " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("command");
                if (string.equals("open")) {
                    String string2 = jSONObject.getString("url");
                    c0.w(c0.b.BROWSER_SERVICE_BRIDGE, string2);
                    c.this.d(new a(new ll.a(string2, jSONObject.optString(Title.type, ""), Boolean.valueOf(jSONObject.optBoolean("visible", true)), Boolean.valueOf(jSONObject.optBoolean("modal", false)), Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled", false)), Boolean.valueOf(jSONObject.optBoolean("showDomainAsTitle", false)))));
                } else {
                    if (string.equals("config")) {
                        c.this.d(new b(new ll.a(null, jSONObject.has(Title.type) ? jSONObject.optString(Title.type) : null, jSONObject.has("visible") ? Boolean.valueOf(jSONObject.optBoolean("visible")) : null, null, jSONObject.has("backNavigationDisabled") ? Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled")) : null, Boolean.FALSE)));
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
        void d(ll.a aVar);

        void e();

        void f(ll.a aVar);
    }

    public c(d dVar, Handler handler) {
        this.f33502c = dVar;
        this.b = handler;
    }

    public void c() {
        this.f33503d = MemStorage.bind("BrowserService.OpenBrowserWindow", new a());
        this.f33504e = MemStorage.bind("BrowserService.CloseBrowserWindow", new b());
        this.f33505f = MemStorage.bind("BrowserService.SendCommand", new C0612c());
    }

    public final void d(Runnable runnable) {
        this.b.post(runnable);
    }

    public void e() {
        Connection connection = this.f33503d;
        if (connection != null) {
            connection.disconnect();
        }
        Connection connection2 = this.f33504e;
        if (connection2 != null) {
            connection2.disconnect();
        }
        Connection connection3 = this.f33505f;
        if (connection3 != null) {
            connection3.disconnect();
        }
    }
}
