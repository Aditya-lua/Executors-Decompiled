package ei;

import android.text.TextUtils;
import bh.c2;
import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.roblox.client.RobloxApplication;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class n extends OnAppBridgeNotificationListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f13772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f13773d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13771a = "rbx.datamodel";
    public final String b = "OPEN_YOUTUBE_VIDEO";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public fh.a f13774e = new fh.a();

    public interface a {
        void c(String str);
    }

    public interface b {
        bh.x0 a();
    }

    public n(a aVar, b bVar) {
        this.f13772c = aVar;
        this.f13773d = bVar;
    }

    public static /* synthetic */ void c(boolean z10, com.roblox.client.a aVar) {
        if (z10) {
            c2.b(aVar.getWindow());
            aVar.W1().o(u0.EXPERIENCE);
            if (bi.h.a().J3()) {
                aVar.getWindow().addFlags(Barcode.FORMAT_ITF);
                return;
            }
            return;
        }
        aVar.W1().o(u0.APP);
        if (!bh.a1.R0(aVar.getResources().getConfiguration())) {
            c2.c(aVar.getWindow());
        }
        if (bi.h.a().J3()) {
            aVar.getWindow().clearFlags(Barcode.FORMAT_ITF);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.roblox.engine.jni.OnAppBridgeNotificationListener
    public void a(String str, String str2) {
        String str3;
        long j10;
        f4.v vVarP;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDataModelNotification() type:");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = BuildConfig.FLAVOR;
        } else {
            str3 = " data:" + str2;
        }
        sb2.append(str3);
        ok.q.h("rbx.datamodel", sb2.toString());
        if (str.equals("VIEW_PROFILE")) {
            yh.g gVarB = yh.g.b("PROFILE_TAG");
            gVarB.i(str2);
            gVarB.j(true);
            mw.c.d().j(gVarB);
            return;
        }
        if (str.equals("SCAN_QR_CODE")) {
            mw.c.d().j(new yh.g("SCAN_QR_CODE"));
            return;
        }
        if (str.equals("REPORT_ABUSE")) {
            yh.g gVar = new yh.g("ABUSE_REPORT_TAG");
            gVar.i(str2);
            gVar.j(true);
            mw.c.d().j(gVar);
            return;
        }
        if (str.equals("BACK_BUTTON_NOT_CONSUMED")) {
            mw.c.d().j(new yh.c());
            return;
        }
        if (str.equals("PURCHASE_ROBUX")) {
            new fj.e(this.f13773d.a(), "tabAvatar").g(this.f13774e);
            return;
        }
        if (str.equals("VIEW_NOTIFICATIONS")) {
            new fj.d(this.f13773d.a()).f(this.f13774e);
            return;
        }
        if (str.equals("APP_READY")) {
            this.f13772c.c(str2);
            if (bi.h.a().l2()) {
                d(str2);
            }
            if (TextUtils.isEmpty(str2) || !str2.equals("landing")) {
                return;
            }
            ok.q.h("rbx.datamodel", "Got callback to Java landing page, going to flush the client settings");
            com.roblox.client.startup.a.n();
            return;
        }
        if (str.equals("OPEN_CUSTOM_WEBVIEW")) {
            yh.g gVarB2 = yh.g.b("CUSTOM_WEBVIEW_TAG");
            gVarB2.g(str2);
            gVarB2.j(true);
            mw.c.d().j(gVarB2);
            return;
        }
        if (bi.h.a().u1() && str.equals("POST_PURCHASE")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                yh.g gVarB3 = yh.g.b("CUSTOM_WEBVIEW_TAG");
                gVarB3.g(jSONObject.toString());
                gVarB3.j(true);
                mw.c.d().j(gVarB3);
                return;
            } catch (JSONException e10) {
                ok.q.e("rbx.datamodel", "POST_PURCHASE: failed to build JSON url=" + str2 + " error=" + e10.getMessage());
                return;
            }
        }
        if (str.equals("OPEN_BUILDERS_CLUB")) {
            new fj.b(this.f13773d.a(), "tabMore").c(this.f13774e);
            return;
        }
        if (str.equals("SEARCH_GAMES")) {
            yh.g gVarB4 = yh.g.b("SEARCH_GAMES_TAG");
            gVarB4.i(str2);
            gVarB4.j(true);
            mw.c.d().j(gVarB4);
            return;
        }
        if (str.equals("ACTION_LOG_OUT")) {
            new fj.c(this.f13773d.a()).c(this.f13774e);
            return;
        }
        if (str.equals("LUA_HOME_PAGE_LOADED")) {
            if (bi.h.a().l2()) {
                e();
            }
            FlagCacheUtils.flushPendingVersionBWrite(RobloxApplication.f());
            FlagCacheUtils.flushPendingVersionBTelemetry();
            if (bi.h.a().c1()) {
                ai.b.c();
            }
            if (!bi.h.a().W5() || (vVarP = this.f13773d.a().p()) == null) {
                return;
            }
            li.i.p(vVarP);
            return;
        }
        if (str.equals("LAUNCH_CONVERSATION")) {
            try {
                j10 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                ok.q.k("rbx.datamodel", "could not parse data");
                j10 = -1;
            }
            if (j10 != -1) {
                mw.c.d().j(new yh.f(j10));
                return;
            }
            return;
        }
        if (str.equals("UNIVERSAL_FRIENDS")) {
            mw.c.d().j(new yh.g("UNIVERSAL_FRIENDS_TAG"));
            return;
        }
        if ("OPEN_YOUTUBE_VIDEO".equals(str)) {
            yh.g gVarA = yh.g.a("YOUTUBE_TAG", str2);
            gVarA.j(true);
            mw.c.d().j(gVarA);
            return;
        }
        if (str.equals("ACTION_LOG_IN")) {
            f4.v vVarP2 = this.f13773d.a().p();
            if (vVarP2 != null) {
                ik.k0.s(vVarP2).J();
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_IN")) {
            f4.v vVarP3 = this.f13773d.a().p();
            if (vVarP3 != null) {
                ik.k0.G(vVarP3, str2);
                return;
            }
            return;
        }
        if (str.equals("DID_SIGN_UP")) {
            f4.v vVarP4 = this.f13773d.a().p();
            if (vVarP4 != null) {
                ik.k0.s(vVarP4).I(str2);
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_OUT")) {
            if (bi.h.a().W1() && !dj.h.e().f()) {
                dj.b.f().o(dj.b.d.LOGOUT_BY_USER_IN_LUA);
                dl.j.e().g(bh.a1.O(), bh.a1.g());
            }
            f4.v vVarP5 = this.f13773d.a().p();
            if (vVarP5 == null || !dj.h.e().f()) {
                return;
            }
            dj.b.f().i(vVarP5, dj.b.d.LOGOUT_BY_USER_IN_LUA);
            qm.a.a().c();
            if (bi.h.a().C3()) {
                NativeGLInterface.screenTimeStop();
                return;
            }
            return;
        }
        if (str.equals("DID_SWITCH_ACCOUNT")) {
            f4.v vVarP6 = this.f13773d.a().p();
            if (vVarP6 != null) {
                dj.b.f().j(vVarP6);
                qm.a.a().c();
                return;
            }
            return;
        }
        if (str.equals("NATIVE_SHARE")) {
            f4.v vVarP7 = this.f13773d.a().p();
            if (vVarP7 == 0 || vVarP7.isFinishing() || !(vVarP7 instanceof hk.c)) {
                return;
            }
            ((hk.c) vVarP7).k(str2);
            return;
        }
        if (str.equals("RESTART_LUA_APP")) {
            f4.v vVarP8 = this.f13773d.a().p();
            if (vVarP8 != null) {
                vVarP8.recreate();
                return;
            } else {
                ok.q.k("rbx.datamodel", "could not restart lua app");
                return;
            }
        }
        if (bi.h.a().l5() && str.equals("SET_STATUS_BAR_STYLE")) {
            try {
                final boolean zOptBoolean = new JSONObject(str2).optBoolean("hidden", false);
                f4.v vVarP9 = this.f13773d.a().p();
                if (vVarP9 instanceof com.roblox.client.a) {
                    final com.roblox.client.a aVar = (com.roblox.client.a) vVarP9;
                    aVar.runOnUiThread(new Runnable() { // from class: ei.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            n.c(zOptBoolean, aVar);
                        }
                    });
                    return;
                }
                return;
            } catch (JSONException e11) {
                ok.q.e("rbx.datamodel", "Failed to parse SET_STATUS_BAR_STYLE data: " + e11.getMessage());
                return;
            }
        }
        if (str.equals("HOME_PAGE_INTERACTIVE")) {
            ok.q.h("rbx.datamodel", "Got callback to Java for home page is ready to interact.");
            f4.v vVarP10 = this.f13773d.a().p();
            if (vVarP10 != null) {
                vVarP10.reportFullyDrawn();
            }
            if (bi.h.a().W5() && vVarP10 != null) {
                li.i.o(vVarP10);
            }
            com.roblox.client.startup.a.n();
            if (bi.h.a().v1()) {
                FlagCacheUtils.flushRetryDialogTelemetry();
                return;
            }
            return;
        }
        if (bi.h.a().X1() && str.equals("GAME_STREAMING_STATUS_CHANGED")) {
            try {
                boolean zOptBoolean2 = new JSONObject(str2).optBoolean("inGameStreaming", false);
                f4.v vVarP11 = this.f13773d.a().p();
                if (vVarP11 != null) {
                    if (zOptBoolean2) {
                        q0.f(vVarP11);
                    } else {
                        q0.i(vVarP11);
                    }
                }
            } catch (JSONException e12) {
                ok.q.e("rbx.datamodel", "Failed to parse GAME_STREAMING_STATUS_CHANGED data: " + e12.getMessage());
            }
        }
    }

    public final void d(String str) {
        str.getClass();
        if (str.equals("Startup")) {
            eh.k.q().k("luaStartup");
        } else if (str.equals("Landing")) {
            eh.k.q().k("luaLandingScreen");
        }
    }

    public final void e() {
        eh.k.q().k("luaHomeScreen");
    }

    public final void f(JSONObject jSONObject) {
        bh.q.b(jSONObject, this.f13773d.a().p());
    }

    public void g() {
        if (this.f13773d.a().p() != null) {
            qm.a.a().b(new qm.a.b() { // from class: ei.l
                @Override // qm.a.b
                public final void a(JSONObject jSONObject) {
                    this.f13750a.f(jSONObject);
                }
            });
        }
    }
}
