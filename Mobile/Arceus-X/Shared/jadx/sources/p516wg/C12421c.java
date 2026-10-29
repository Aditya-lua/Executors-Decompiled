package p516wg;

import android.os.Handler;
import com.roblox.engine.jni.memstorage.Callback;
import com.roblox.engine.jni.memstorage.Connection;
import com.roblox.engine.jni.memstorage.MemStorage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import nl.C9492a;
import org.json.JSONException;
import org.json.JSONObject;
import p151gk.C6124q;
import vg.C12173c0;

/* JADX INFO: renamed from: wg.c */
/* JADX INFO: loaded from: classes2.dex */
public class C12421c {

    /* JADX INFO: renamed from: a */
    public final String f44399a = "rbx.browserservice";

    /* JADX INFO: renamed from: b */
    public Handler f44400b;

    /* JADX INFO: renamed from: c */
    public d f44401c;

    /* JADX INFO: renamed from: d */
    public Connection f44402d;

    /* JADX INFO: renamed from: e */
    public Connection f44403e;

    /* JADX INFO: renamed from: f */
    public Connection f44404f;

    /* JADX INFO: renamed from: wg.c$a */
    public class a implements Callback {

        /* JADX INFO: renamed from: wg.c$a$a, reason: collision with other inner class name */
        public class RunnableC14277a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C9492a f44406a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public RunnableC14277a(C9492a c9492a) {
                this.f44406a = c9492a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C12421c.this.f44401c.mo1224g(this.f44406a);
            }
        }

        public a() {
        }

        public void onItemSet(String str) {
            C6124q.m27057b("rbx.browserservice", "BrowserService.OpenBrowserWindow : " + str);
            C12173c0.m45034w(C12173c0.b.BROWSER_SERVICE_BRIDGE, str);
            C12421c.this.m46515d(new RunnableC14277a(new C9492a(str)));
        }
    }

    /* JADX INFO: renamed from: wg.c$b */
    public class b implements Callback {

        /* JADX INFO: renamed from: wg.c$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C12421c.this.f44401c.mo1223e();
            }
        }

        public b() {
        }

        public void onItemSet(String str) {
            C6124q.m27057b("rbx.browserservice", "BrowserService.CloseBrowserWindow");
            C12421c.this.m46515d(new a());
        }
    }

    /* JADX INFO: renamed from: wg.c$c */
    public class c implements Callback {

        /* JADX INFO: renamed from: wg.c$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C9492a f44411a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public a(C9492a c9492a) {
                this.f44411a = c9492a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C12421c.this.f44401c.mo1224g(this.f44411a);
            }
        }

        /* JADX INFO: renamed from: wg.c$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C9492a f44413a;

            /* JADX DEBUG: Incorrect args count in method signature: ()V */
            public b(C9492a c9492a) {
                this.f44413a = c9492a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C12421c.this.f44401c.mo1222d(this.f44413a);
            }
        }

        public c() {
        }

        public void onItemSet(String str) {
            C6124q.m27057b("rbx.browserservice", "BrowserService.SendCommand : " + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("command");
                if (string.equals("open")) {
                    String string2 = jSONObject.getString("url");
                    C12173c0.m45034w(C12173c0.b.BROWSER_SERVICE_BRIDGE, string2);
                    C12421c.this.m46515d(new a(new C9492a(string2, jSONObject.optString(Title.type, ""), Boolean.valueOf(jSONObject.optBoolean("visible", true)), Boolean.valueOf(jSONObject.optBoolean("modal", false)), Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled", false)), Boolean.valueOf(jSONObject.optBoolean("showDomainAsTitle", false)))));
                } else {
                    if (string.equals("config")) {
                        C12421c.this.m46515d(new b(new C9492a(null, jSONObject.has(Title.type) ? jSONObject.optString(Title.type) : null, jSONObject.has("visible") ? Boolean.valueOf(jSONObject.optBoolean("visible")) : null, null, jSONObject.has("backNavigationDisabled") ? Boolean.valueOf(jSONObject.optBoolean("backNavigationDisabled")) : null, Boolean.FALSE)));
                        return;
                    }
                    C6124q.m27060e("rbx.browserservice", "ERROR, Command is not supported, BrowserService.SendCommand : " + str);
                }
            } catch (JSONException unused) {
                C6124q.m27060e("rbx.browserservice", "ERROR, BrowserService.SendCommand : " + str);
            }
        }
    }

    /* JADX INFO: renamed from: wg.c$d */
    public interface d {
        /* JADX INFO: renamed from: d */
        void mo1222d(C9492a c9492a);

        /* JADX INFO: renamed from: e */
        void mo1223e();

        /* JADX INFO: renamed from: g */
        void mo1224g(C9492a c9492a);
    }

    public C12421c(d dVar, Handler handler) {
        this.f44401c = dVar;
        this.f44400b = handler;
    }

    /* JADX INFO: renamed from: c */
    public void m46514c() {
        this.f44402d = MemStorage.bind("BrowserService.OpenBrowserWindow", new a());
        this.f44403e = MemStorage.bind("BrowserService.CloseBrowserWindow", new b());
        this.f44404f = MemStorage.bind("BrowserService.SendCommand", new c());
    }

    /* JADX INFO: renamed from: d */
    public final void m46515d(Runnable runnable) {
        this.f44400b.post(runnable);
    }

    /* JADX INFO: renamed from: e */
    public void m46516e() {
        Connection connection = this.f44402d;
        if (connection != null) {
            connection.disconnect();
        }
        Connection connection2 = this.f44403e;
        if (connection2 != null) {
            connection2.disconnect();
        }
        Connection connection3 = this.f44404f;
        if (connection3 != null) {
            connection3.disconnect();
        }
    }
}
