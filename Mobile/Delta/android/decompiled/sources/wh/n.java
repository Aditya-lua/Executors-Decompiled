package wh;

import android.text.TextUtils;
import com.roblox.client.RobloxApplication;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import org.json.JSONException;
import org.json.JSONObject;
import sg.a1;
import sg.c2;

/* JADX INFO: loaded from: classes2.dex */
public class n extends OnAppBridgeNotificationListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f34357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f34358d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34356a = "rbx.datamodel";
    public final String b = "OPEN_YOUTUBE_VIDEO";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public wg.a f34359e = new wg.a();

    public interface a {
        void c(String str);
    }

    public interface b {
        sg.x0 a();
    }

    public n(a aVar, b bVar) {
        this.f34357c = aVar;
        this.f34358d = bVar;
    }

    public static /* synthetic */ void c(boolean z10, com.roblox.client.a aVar) {
        if (z10) {
            c2.b(aVar.getWindow());
            aVar.W1().o(t0.EXPERIENCE);
            if (th.h.a().t3()) {
                aVar.getWindow().addFlags(128);
                return;
            }
            return;
        }
        aVar.W1().o(t0.APP);
        if (!a1.Q0(aVar.getResources().getConfiguration())) {
            c2.c(aVar.getWindow());
        }
        if (th.h.a().t3()) {
            aVar.getWindow().clearFlags(128);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.roblox.engine.jni.OnAppBridgeNotificationListener
    public void a(String str, String str2) {
        String str3;
        long j10;
        e4.q qVarP;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDataModelNotification() type:");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " data:" + str2;
        }
        sb2.append(str3);
        gk.p.h("rbx.datamodel", sb2.toString());
        if (str.equals("VIEW_PROFILE")) {
            ph.g gVarB = ph.g.b("PROFILE_TAG");
            gVarB.i(str2);
            gVarB.j(true);
            fv.c.d().j(gVarB);
            return;
        }
        if (str.equals("SCAN_QR_CODE")) {
            fv.c.d().j(new ph.g("SCAN_QR_CODE"));
            return;
        }
        if (str.equals("REPORT_ABUSE")) {
            ph.g gVar = new ph.g("ABUSE_REPORT_TAG");
            gVar.i(str2);
            gVar.j(true);
            fv.c.d().j(gVar);
            return;
        }
        if (str.equals("BACK_BUTTON_NOT_CONSUMED")) {
            fv.c.d().j(new ph.c());
            return;
        }
        if (str.equals("PURCHASE_ROBUX")) {
            new xi.e(this.f34358d.a(), "tabAvatar").g(this.f34359e);
            return;
        }
        if (str.equals("VIEW_NOTIFICATIONS")) {
            new xi.d(this.f34358d.a()).f(this.f34359e);
            return;
        }
        if (str.equals("APP_READY")) {
            this.f34357c.c(str2);
            if (th.h.a().Z1()) {
                d(str2);
            }
            if (TextUtils.isEmpty(str2) || !str2.equals("landing")) {
                return;
            }
            gk.p.h("rbx.datamodel", "Got callback to Java landing page, going to flush the client settings");
            com.roblox.client.startup.a.n();
            return;
        }
        if (str.equals("OPEN_CUSTOM_WEBVIEW")) {
            ph.g gVarB2 = ph.g.b("CUSTOM_WEBVIEW_TAG");
            gVarB2.g(str2);
            gVarB2.j(true);
            fv.c.d().j(gVarB2);
            return;
        }
        if (th.h.a().l1() && str.equals("POST_PURCHASE")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                ph.g gVarB3 = ph.g.b("CUSTOM_WEBVIEW_TAG");
                gVarB3.g(jSONObject.toString());
                gVarB3.j(true);
                fv.c.d().j(gVarB3);
                return;
            } catch (JSONException e10) {
                gk.p.e("rbx.datamodel", "POST_PURCHASE: failed to build JSON url=" + str2 + " error=" + e10.getMessage());
                return;
            }
        }
        if (str.equals("OPEN_BUILDERS_CLUB")) {
            new xi.b(this.f34358d.a(), "tabMore").c(this.f34359e);
            return;
        }
        if (str.equals("SEARCH_GAMES")) {
            ph.g gVarB4 = ph.g.b("SEARCH_GAMES_TAG");
            gVarB4.i(str2);
            gVarB4.j(true);
            fv.c.d().j(gVarB4);
            return;
        }
        if (str.equals("ACTION_LOG_OUT")) {
            new xi.c(this.f34358d.a()).c(this.f34359e);
            return;
        }
        if (str.equals("LUA_HOME_PAGE_LOADED")) {
            if (th.h.a().Z1()) {
                e();
            }
            FlagCacheUtils.flushPendingVersionBWrite(RobloxApplication.f());
            FlagCacheUtils.flushPendingVersionBTelemetry();
            if (th.h.a().T0()) {
                sh.b.c();
            }
            if (!th.h.a().O5() || (qVarP = this.f34358d.a().p()) == null) {
                return;
            }
            di.h.p(qVarP);
            return;
        }
        if (str.equals("LAUNCH_CONVERSATION")) {
            try {
                j10 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                gk.p.k("rbx.datamodel", "could not parse data");
                j10 = -1;
            }
            if (j10 != -1) {
                fv.c.d().j(new ph.f(j10));
                return;
            }
            return;
        }
        if (str.equals("UNIVERSAL_FRIENDS")) {
            fv.c.d().j(new ph.g("UNIVERSAL_FRIENDS_TAG"));
            return;
        }
        if ("OPEN_YOUTUBE_VIDEO".equals(str)) {
            ph.g gVarA = ph.g.a("YOUTUBE_TAG", str2);
            gVarA.j(true);
            fv.c.d().j(gVarA);
            return;
        }
        if (str.equals("ACTION_LOG_IN")) {
            e4.q qVarP2 = this.f34358d.a().p();
            if (qVarP2 != null) {
                ak.k0.s(qVarP2).J();
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_IN")) {
            e4.q qVarP3 = this.f34358d.a().p();
            if (qVarP3 != null) {
                ak.k0.G(qVarP3, str2);
                return;
            }
            return;
        }
        if (str.equals("DID_SIGN_UP")) {
            e4.q qVarP4 = this.f34358d.a().p();
            if (qVarP4 != null) {
                ak.k0.s(qVarP4).I(str2);
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_OUT")) {
            if (th.h.a().M1() && !vi.h.e().f()) {
                vi.b.f().p(vi.b.d.LOGOUT_BY_USER_IN_LUA);
                wk.j.c().e(a1.O(), a1.g());
            }
            e4.q qVarP5 = this.f34358d.a().p();
            if (qVarP5 == null || !vi.h.e().f()) {
                return;
            }
            vi.b.f().i(qVarP5, vi.b.d.LOGOUT_BY_USER_IN_LUA);
            cm.a.a().c();
            if (th.h.a().p3()) {
                NativeGLInterface.screenTimeStop();
                return;
            }
            return;
        }
        if (str.equals("DID_SWITCH_ACCOUNT")) {
            e4.q qVarP6 = this.f34358d.a().p();
            if (qVarP6 != null) {
                vi.b.f().j(qVarP6);
                cm.a.a().c();
                return;
            }
            return;
        }
        if (str.equals("NATIVE_SHARE")) {
            e4.q qVarP7 = this.f34358d.a().p();
            if (qVarP7 == 0 || qVarP7.isFinishing() || !(qVarP7 instanceof zj.c)) {
                return;
            }
            ((zj.c) qVarP7).k(str2);
            return;
        }
        if (str.equals("RESTART_LUA_APP")) {
            e4.q qVarP8 = this.f34358d.a().p();
            if (qVarP8 != null) {
                qVarP8.recreate();
                return;
            } else {
                gk.p.k("rbx.datamodel", "could not restart lua app");
                return;
            }
        }
        if (th.h.a().Z4() && str.equals("SET_STATUS_BAR_STYLE")) {
            try {
                final boolean zOptBoolean = new JSONObject(str2).optBoolean("hidden", false);
                e4.q qVarP9 = this.f34358d.a().p();
                if (qVarP9 instanceof com.roblox.client.a) {
                    final com.roblox.client.a aVar = (com.roblox.client.a) qVarP9;
                    aVar.runOnUiThread(new Runnable() { // from class: wh.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.c(zOptBoolean, aVar);
                        }
                    });
                    return;
                }
                return;
            } catch (JSONException e11) {
                gk.p.e("rbx.datamodel", "Failed to parse SET_STATUS_BAR_STYLE data: " + e11.getMessage());
                return;
            }
        }
        if (str.equals("HOME_PAGE_INTERACTIVE")) {
            gk.p.h("rbx.datamodel", "Got callback to Java for home page is ready to interact.");
            e4.q qVarP10 = this.f34358d.a().p();
            if (qVarP10 != null) {
                qVarP10.reportFullyDrawn();
            }
            if (th.h.a().O5() && qVarP10 != null) {
                di.h.o(qVarP10);
            }
            com.roblox.client.startup.a.n();
            if (th.h.a().m1()) {
                FlagCacheUtils.flushRetryDialogTelemetry();
                return;
            }
            return;
        }
        if (th.h.a().N1() && str.equals("GAME_STREAMING_STATUS_CHANGED")) {
            try {
                boolean zOptBoolean2 = new JSONObject(str2).optBoolean("inGameStreaming", false);
                e4.q qVarP11 = this.f34358d.a().p();
                if (qVarP11 != null) {
                    if (zOptBoolean2) {
                        p0.f(qVarP11);
                    } else {
                        p0.i(qVarP11);
                    }
                }
            } catch (JSONException e12) {
                gk.p.e("rbx.datamodel", "Failed to parse GAME_STREAMING_STATUS_CHANGED data: " + e12.getMessage());
            }
        }
    }

    public final void d(String str) {
        str.getClass();
        if (str.equals("Startup")) {
            vg.j.q().k("luaStartup");
        } else if (str.equals("Landing")) {
            vg.j.q().k("luaLandingScreen");
        }
    }

    public final void e() {
        vg.j.q().k("luaHomeScreen");
    }

    public final void f(JSONObject jSONObject) {
        sg.q.b(jSONObject, this.f34358d.a().p());
    }

    public void g() {
        if (this.f34358d.a().p() != null) {
            cm.a.a().b(new cm.a.b() { // from class: wh.l
                @Override // cm.a.b
                public final void a(JSONObject jSONObject) {
                    this.f34336a.f(jSONObject);
                }
            });
        }
    }
}
