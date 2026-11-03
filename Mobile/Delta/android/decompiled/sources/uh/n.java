package uh;

import android.text.TextUtils;
import com.roblox.client.RobloxApplication;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import org.json.JSONException;
import org.json.JSONObject;
import rg.c2;

/* JADX INFO: loaded from: classes2.dex */
public class n extends OnAppBridgeNotificationListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f33034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f33035d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33033a = "rbx.datamodel";
    public final String b = "OPEN_YOUTUBE_VIDEO";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vg.a f33036e = new vg.a();

    public interface a {
        void c(String str);
    }

    public interface b {
        rg.x0 a();
    }

    public n(a aVar, b bVar) {
        this.f33034c = aVar;
        this.f33035d = bVar;
    }

    public static /* synthetic */ void c(boolean z10, com.roblox.client.a aVar) {
        if (z10) {
            c2.b(aVar.getWindow());
            aVar.W1().o(u0.EXPERIENCE);
            if (rh.h.a().F3()) {
                aVar.getWindow().addFlags(128);
                return;
            }
            return;
        }
        aVar.W1().o(u0.APP);
        if (!rg.a1.R0(aVar.getResources().getConfiguration())) {
            c2.c(aVar.getWindow());
        }
        if (rh.h.a().F3()) {
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
        ek.q.h("rbx.datamodel", sb2.toString());
        if (str.equals("VIEW_PROFILE")) {
            oh.g gVarB = oh.g.b("PROFILE_TAG");
            gVarB.i(str2);
            gVarB.j(true);
            dv.c.d().j(gVarB);
            return;
        }
        if (str.equals("SCAN_QR_CODE")) {
            dv.c.d().j(new oh.g("SCAN_QR_CODE"));
            return;
        }
        if (str.equals("REPORT_ABUSE")) {
            oh.g gVar = new oh.g("ABUSE_REPORT_TAG");
            gVar.i(str2);
            gVar.j(true);
            dv.c.d().j(gVar);
            return;
        }
        if (str.equals("BACK_BUTTON_NOT_CONSUMED")) {
            dv.c.d().j(new oh.c());
            return;
        }
        if (str.equals("PURCHASE_ROBUX")) {
            new vi.e(this.f33035d.a(), "tabAvatar").g(this.f33036e);
            return;
        }
        if (str.equals("VIEW_NOTIFICATIONS")) {
            new vi.d(this.f33035d.a()).f(this.f33036e);
            return;
        }
        if (str.equals("APP_READY")) {
            this.f33034c.c(str2);
            if (rh.h.a().k2()) {
                d(str2);
            }
            if (TextUtils.isEmpty(str2) || !str2.equals("landing")) {
                return;
            }
            ek.q.h("rbx.datamodel", "Got callback to Java landing page, going to flush the client settings");
            com.roblox.client.startup.a.n();
            return;
        }
        if (str.equals("OPEN_CUSTOM_WEBVIEW")) {
            oh.g gVarB2 = oh.g.b("CUSTOM_WEBVIEW_TAG");
            gVarB2.g(str2);
            gVarB2.j(true);
            dv.c.d().j(gVarB2);
            return;
        }
        if (rh.h.a().u1() && str.equals("POST_PURCHASE")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                oh.g gVarB3 = oh.g.b("CUSTOM_WEBVIEW_TAG");
                gVarB3.g(jSONObject.toString());
                gVarB3.j(true);
                dv.c.d().j(gVarB3);
                return;
            } catch (JSONException e10) {
                ek.q.e("rbx.datamodel", "POST_PURCHASE: failed to build JSON url=" + str2 + " error=" + e10.getMessage());
                return;
            }
        }
        if (str.equals("OPEN_BUILDERS_CLUB")) {
            new vi.b(this.f33035d.a(), "tabMore").c(this.f33036e);
            return;
        }
        if (str.equals("SEARCH_GAMES")) {
            oh.g gVarB4 = oh.g.b("SEARCH_GAMES_TAG");
            gVarB4.i(str2);
            gVarB4.j(true);
            dv.c.d().j(gVarB4);
            return;
        }
        if (str.equals("ACTION_LOG_OUT")) {
            new vi.c(this.f33035d.a()).c(this.f33036e);
            return;
        }
        if (str.equals("LUA_HOME_PAGE_LOADED")) {
            if (rh.h.a().k2()) {
                e();
            }
            FlagCacheUtils.flushPendingVersionBWrite(RobloxApplication.f());
            FlagCacheUtils.flushPendingVersionBTelemetry();
            if (rh.h.a().a1()) {
                qh.b.c();
            }
            if (!rh.h.a().Y5() || (qVarP = this.f33035d.a().p()) == null) {
                return;
            }
            bi.i.p(qVarP);
            return;
        }
        if (str.equals("LAUNCH_CONVERSATION")) {
            try {
                j10 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                ek.q.k("rbx.datamodel", "could not parse data");
                j10 = -1;
            }
            if (j10 != -1) {
                dv.c.d().j(new oh.f(j10));
                return;
            }
            return;
        }
        if (str.equals("UNIVERSAL_FRIENDS")) {
            dv.c.d().j(new oh.g("UNIVERSAL_FRIENDS_TAG"));
            return;
        }
        if ("OPEN_YOUTUBE_VIDEO".equals(str)) {
            oh.g gVarA = oh.g.a("YOUTUBE_TAG", str2);
            gVarA.j(true);
            dv.c.d().j(gVarA);
            return;
        }
        if (str.equals("ACTION_LOG_IN")) {
            e4.q qVarP2 = this.f33035d.a().p();
            if (qVarP2 != null) {
                yj.k0.s(qVarP2).J();
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_IN")) {
            e4.q qVarP3 = this.f33035d.a().p();
            if (qVarP3 != null) {
                yj.k0.G(qVarP3, str2);
                return;
            }
            return;
        }
        if (str.equals("DID_SIGN_UP")) {
            e4.q qVarP4 = this.f33035d.a().p();
            if (qVarP4 != null) {
                yj.k0.s(qVarP4).I(str2);
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_OUT")) {
            if (rh.h.a().W1() && !ti.h.e().f()) {
                ti.b.f().p(ti.b.d.LOGOUT_BY_USER_IN_LUA);
                uk.j.c().e(rg.a1.O(), rg.a1.g());
            }
            e4.q qVarP5 = this.f33035d.a().p();
            if (qVarP5 == null || !ti.h.e().f()) {
                return;
            }
            ti.b.f().i(qVarP5, ti.b.d.LOGOUT_BY_USER_IN_LUA);
            am.a.a().c();
            if (rh.h.a().z3()) {
                NativeGLInterface.screenTimeStop();
                return;
            }
            return;
        }
        if (str.equals("DID_SWITCH_ACCOUNT")) {
            e4.q qVarP6 = this.f33035d.a().p();
            if (qVarP6 != null) {
                ti.b.f().j(qVarP6);
                am.a.a().c();
                return;
            }
            return;
        }
        if (str.equals("NATIVE_SHARE")) {
            e4.q qVarP7 = this.f33035d.a().p();
            if (qVarP7 == 0 || qVarP7.isFinishing() || !(qVarP7 instanceof xj.c)) {
                return;
            }
            ((xj.c) qVarP7).k(str2);
            return;
        }
        if (str.equals("RESTART_LUA_APP")) {
            e4.q qVarP8 = this.f33035d.a().p();
            if (qVarP8 != null) {
                qVarP8.recreate();
                return;
            } else {
                ek.q.k("rbx.datamodel", "could not restart lua app");
                return;
            }
        }
        if (rh.h.a().m5() && str.equals("SET_STATUS_BAR_STYLE")) {
            try {
                final boolean zOptBoolean = new JSONObject(str2).optBoolean("hidden", false);
                e4.q qVarP9 = this.f33035d.a().p();
                if (qVarP9 instanceof com.roblox.client.a) {
                    final com.roblox.client.a aVar = (com.roblox.client.a) qVarP9;
                    aVar.runOnUiThread(new Runnable() { // from class: uh.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.c(zOptBoolean, aVar);
                        }
                    });
                    return;
                }
                return;
            } catch (JSONException e11) {
                ek.q.e("rbx.datamodel", "Failed to parse SET_STATUS_BAR_STYLE data: " + e11.getMessage());
                return;
            }
        }
        if (str.equals("HOME_PAGE_INTERACTIVE")) {
            ek.q.h("rbx.datamodel", "Got callback to Java for home page is ready to interact.");
            e4.q qVarP10 = this.f33035d.a().p();
            if (qVarP10 != null) {
                qVarP10.reportFullyDrawn();
            }
            if (rh.h.a().Y5() && qVarP10 != null) {
                bi.i.o(qVarP10);
            }
            com.roblox.client.startup.a.n();
            if (rh.h.a().v1()) {
                FlagCacheUtils.flushRetryDialogTelemetry();
                return;
            }
            return;
        }
        if (rh.h.a().X1() && str.equals("GAME_STREAMING_STATUS_CHANGED")) {
            try {
                boolean zOptBoolean2 = new JSONObject(str2).optBoolean("inGameStreaming", false);
                e4.q qVarP11 = this.f33035d.a().p();
                if (qVarP11 != null) {
                    if (zOptBoolean2) {
                        q0.f(qVarP11);
                    } else {
                        q0.i(qVarP11);
                    }
                }
            } catch (JSONException e12) {
                ek.q.e("rbx.datamodel", "Failed to parse GAME_STREAMING_STATUS_CHANGED data: " + e12.getMessage());
            }
        }
    }

    public final void d(String str) {
        str.getClass();
        if (str.equals("Startup")) {
            ug.j.q().k("luaStartup");
        } else if (str.equals("Landing")) {
            ug.j.q().k("luaLandingScreen");
        }
    }

    public final void e() {
        ug.j.q().k("luaHomeScreen");
    }

    public final void f(JSONObject jSONObject) {
        rg.q.b(jSONObject, this.f33035d.a().p());
    }

    public void g() {
        if (this.f33035d.a().p() != null) {
            am.a.a().b(new am.a.b() { // from class: uh.l
                @Override // am.a.b
                public final void a(JSONObject jSONObject) {
                    this.f33012a.f(jSONObject);
                }
            });
        }
    }
}
