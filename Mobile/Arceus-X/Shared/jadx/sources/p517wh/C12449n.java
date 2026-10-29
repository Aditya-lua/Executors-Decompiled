package p517wh;

import android.text.TextUtils;
import cm.C1678a;
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.RobloxApplication;
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.FlagCacheUtils;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import org.json.JSONException;
import org.json.JSONObject;
import p015ak.C0305k0;
import p079di.C4617i;
import p093e4.ActivityC4831q;
import p138fv.C5840c;
import p151gk.C6124q;
import p516wg.C12419a;
import p520wk.C12488j;
import p548xi.C12835b;
import p548xi.C12836c;
import p548xi.C12837d;
import p548xi.C12838e;
import p606zj.InterfaceC13820c;
import ph.C10254c;
import ph.C10257f;
import ph.C10258g;
import sg.C11295a1;
import sg.C11304c2;
import sg.C11346q;
import sg.C11368x0;
import sh.C11377b;
import th.C11659h;
import vg.C12180j;
import vi.C12211b;
import vi.C12217h;

/* JADX INFO: renamed from: wh.n */
/* JADX INFO: loaded from: classes2.dex */
public class C12449n extends OnAppBridgeNotificationListener {

    /* JADX INFO: renamed from: c */
    public a f44549c;

    /* JADX INFO: renamed from: d */
    public b f44550d;

    /* JADX INFO: renamed from: a */
    public final String f44547a = "rbx.datamodel";

    /* JADX INFO: renamed from: b */
    public final String f44548b = "OPEN_YOUTUBE_VIDEO";

    /* JADX INFO: renamed from: e */
    public C12419a f44551e = new C12419a();

    /* JADX INFO: renamed from: wh.n$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        void mo46533c(String str);
    }

    /* JADX INFO: renamed from: wh.n$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        C11368x0 mo46535a();
    }

    public C12449n(a aVar, b bVar) {
        this.f44549c = aVar;
        this.f44550d = bVar;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m46671c(boolean z10, AbstractActivityC3152a abstractActivityC3152a) {
        if (z10) {
            C11304c2.m42492b(abstractActivityC3152a.getWindow());
            abstractActivityC3152a.m14851W1().m34408o(EnumC12462t0.EXPERIENCE);
            if (C11659h.m43403a().mo43768z3()) {
                abstractActivityC3152a.getWindow().addFlags(128);
                return;
            }
            return;
        }
        abstractActivityC3152a.m14851W1().m34408o(EnumC12462t0.APP);
        if (!C11295a1.m42415Q0(abstractActivityC3152a.getResources().getConfiguration())) {
            C11304c2.m42493c(abstractActivityC3152a.getWindow());
        }
        if (C11659h.m43403a().mo43768z3()) {
            abstractActivityC3152a.getWindow().clearFlags(128);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v24, resolved type: e4.q */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.roblox.engine.jni.OnAppBridgeNotificationListener
    /* JADX INFO: renamed from: a */
    public void mo1303a(String str, String str2) {
        String str3;
        long j10;
        ActivityC4831q activityC4831qM4693p;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDataModelNotification() type:");
        sb2.append(str);
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = " data:" + str2;
        }
        sb2.append(str3);
        C6124q.m27063h("rbx.datamodel", sb2.toString());
        if (str.equals("VIEW_PROFILE")) {
            C10258g c10258gM39409b = C10258g.m39409b("PROFILE_TAG");
            c10258gM39409b.m39416i(str2);
            c10258gM39409b.m39417j(true);
            C5840c.m26204d().m26211j(c10258gM39409b);
            return;
        }
        if (str.equals("SCAN_QR_CODE")) {
            C5840c.m26204d().m26211j(new C10258g("SCAN_QR_CODE"));
            return;
        }
        if (str.equals("REPORT_ABUSE")) {
            C10258g c10258g = new C10258g("ABUSE_REPORT_TAG");
            c10258g.m39416i(str2);
            c10258g.m39417j(true);
            C5840c.m26204d().m26211j(c10258g);
            return;
        }
        if (str.equals("BACK_BUTTON_NOT_CONSUMED")) {
            C5840c.m26204d().m26211j(new C10254c());
            return;
        }
        if (str.equals("PURCHASE_ROBUX")) {
            new C12838e(this.f44550d.mo46535a(), "tabAvatar").m47792g(this.f44551e);
            return;
        }
        if (str.equals("VIEW_NOTIFICATIONS")) {
            new C12837d(this.f44550d.mo46535a()).m47783f(this.f44551e);
            return;
        }
        if (str.equals("APP_READY")) {
            this.f44549c.mo46533c(str2);
            if (C11659h.m43403a().mo43627f2()) {
                m46672d(str2);
            }
            if (TextUtils.isEmpty(str2) || !str2.equals("landing")) {
                return;
            }
            C6124q.m27063h("rbx.datamodel", "Got callback to Java landing page, going to flush the client settings");
            C3272a.m15706n();
            return;
        }
        if (str.equals("OPEN_CUSTOM_WEBVIEW")) {
            C10258g c10258gM39409b2 = C10258g.m39409b("CUSTOM_WEBVIEW_TAG");
            c10258gM39409b2.m39414g(str2);
            c10258gM39409b2.m39417j(true);
            C5840c.m26204d().m26211j(c10258gM39409b2);
            return;
        }
        if (C11659h.m43403a().mo43703q1() && str.equals("POST_PURCHASE")) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                C10258g c10258gM39409b3 = C10258g.m39409b("CUSTOM_WEBVIEW_TAG");
                c10258gM39409b3.m39414g(jSONObject.toString());
                c10258gM39409b3.m39417j(true);
                C5840c.m26204d().m26211j(c10258gM39409b3);
                return;
            } catch (JSONException e10) {
                C6124q.m27060e("rbx.datamodel", "POST_PURCHASE: failed to build JSON url=" + str2 + " error=" + e10.getMessage());
                return;
            }
        }
        if (str.equals("OPEN_BUILDERS_CLUB")) {
            new C12835b(this.f44550d.mo46535a(), "tabMore").m47774c(this.f44551e);
            return;
        }
        if (str.equals("SEARCH_GAMES")) {
            C10258g c10258gM39409b4 = C10258g.m39409b("SEARCH_GAMES_TAG");
            c10258gM39409b4.m39416i(str2);
            c10258gM39409b4.m39417j(true);
            C5840c.m26204d().m26211j(c10258gM39409b4);
            return;
        }
        if (str.equals("ACTION_LOG_OUT")) {
            new C12836c(this.f44550d.mo46535a()).m47777c(this.f44551e);
            return;
        }
        if (str.equals("LUA_HOME_PAGE_LOADED")) {
            if (C11659h.m43403a().mo43627f2()) {
                m46673e();
            }
            FlagCacheUtils.flushPendingVersionBWrite(RobloxApplication.m14834f());
            FlagCacheUtils.flushPendingVersionBTelemetry();
            if (C11659h.m43403a().mo43564X0()) {
                C11377b.m42667c();
            }
            if (!C11659h.m43403a().mo43548U5() || (activityC4831qM4693p = this.f44550d.mo46535a().m4693p()) == null) {
                return;
            }
            C4617i.m22796p(activityC4831qM4693p);
            return;
        }
        if (str.equals("LAUNCH_CONVERSATION")) {
            try {
                j10 = Long.parseLong(str2);
            } catch (NumberFormatException unused) {
                C6124q.m27066k("rbx.datamodel", "could not parse data");
                j10 = -1;
            }
            if (j10 != -1) {
                C5840c.m26204d().m26211j(new C10257f(j10));
                return;
            }
            return;
        }
        if (str.equals("UNIVERSAL_FRIENDS")) {
            C5840c.m26204d().m26211j(new C10258g("UNIVERSAL_FRIENDS_TAG"));
            return;
        }
        if ("OPEN_YOUTUBE_VIDEO".equals(str)) {
            C10258g c10258gM39408a = C10258g.m39408a("YOUTUBE_TAG", str2);
            c10258gM39408a.m39417j(true);
            C5840c.m26204d().m26211j(c10258gM39408a);
            return;
        }
        if (str.equals("ACTION_LOG_IN")) {
            ActivityC4831q activityC4831qM4693p2 = this.f44550d.mo46535a().m4693p();
            if (activityC4831qM4693p2 != null) {
                C0305k0.m1274s(activityC4831qM4693p2).m1284J();
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_IN")) {
            ActivityC4831q activityC4831qM4693p3 = this.f44550d.mo46535a().m4693p();
            if (activityC4831qM4693p3 != null) {
                C0305k0.m1258G(activityC4831qM4693p3, str2);
                return;
            }
            return;
        }
        if (str.equals("DID_SIGN_UP")) {
            ActivityC4831q activityC4831qM4693p4 = this.f44550d.mo46535a().m4693p();
            if (activityC4831qM4693p4 != null) {
                C0305k0.m1274s(activityC4831qM4693p4).m1283I(str2);
                return;
            }
            return;
        }
        if (str.equals("DID_LOG_OUT")) {
            if (C11659h.m43403a().mo43530S1() && !C12217h.m45288e().m45295f()) {
                C12211b.m45200f().m45213p(C12211b.d.LOGOUT_BY_USER_IN_LUA);
                C12488j.m46781c().m46783e(C11295a1.m42410O(), C11295a1.m42450g());
            }
            ActivityC4831q activityC4831qM4693p5 = this.f44550d.mo46535a().m4693p();
            if (activityC4831qM4693p5 == null || !C12217h.m45288e().m45295f()) {
                return;
            }
            C12211b.m45200f().m45207i(activityC4831qM4693p5, C12211b.d.LOGOUT_BY_USER_IN_LUA);
            C1678a.m8388a().m8390c();
            if (C11659h.m43403a().mo43740v3()) {
                NativeGLInterface.screenTimeStop();
                return;
            }
            return;
        }
        if (str.equals("DID_SWITCH_ACCOUNT")) {
            ActivityC4831q activityC4831qM4693p6 = this.f44550d.mo46535a().m4693p();
            if (activityC4831qM4693p6 != null) {
                C12211b.m45200f().m45208j(activityC4831qM4693p6);
                C1678a.m8388a().m8390c();
                return;
            }
            return;
        }
        if (str.equals("NATIVE_SHARE")) {
            ActivityC4831q activityC4831qM4693p7 = this.f44550d.mo46535a().m4693p();
            if (activityC4831qM4693p7 == 0 || activityC4831qM4693p7.isFinishing() || !(activityC4831qM4693p7 instanceof InterfaceC13820c)) {
                return;
            }
            ((InterfaceC13820c) activityC4831qM4693p7).mo14780k(str2);
            return;
        }
        if (str.equals("RESTART_LUA_APP")) {
            ActivityC4831q activityC4831qM4693p8 = this.f44550d.mo46535a().m4693p();
            if (activityC4831qM4693p8 != null) {
                activityC4831qM4693p8.recreate();
                return;
            } else {
                C6124q.m27066k("rbx.datamodel", "could not restart lua app");
                return;
            }
        }
        if (C11659h.m43403a().mo43630f5() && str.equals("SET_STATUS_BAR_STYLE")) {
            try {
                final boolean zOptBoolean = new JSONObject(str2).optBoolean("hidden", false);
                ActivityC4831q activityC4831qM4693p9 = this.f44550d.mo46535a().m4693p();
                if (activityC4831qM4693p9 instanceof AbstractActivityC3152a) {
                    final AbstractActivityC3152a abstractActivityC3152a = (AbstractActivityC3152a) activityC4831qM4693p9;
                    abstractActivityC3152a.runOnUiThread(new Runnable() { // from class: wh.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            C12449n.m46671c(zOptBoolean, abstractActivityC3152a);
                        }
                    });
                    return;
                }
                return;
            } catch (JSONException e11) {
                C6124q.m27060e("rbx.datamodel", "Failed to parse SET_STATUS_BAR_STYLE data: " + e11.getMessage());
                return;
            }
        }
        if (str.equals("HOME_PAGE_INTERACTIVE")) {
            C6124q.m27063h("rbx.datamodel", "Got callback to Java for home page is ready to interact.");
            ActivityC4831q activityC4831qM4693p10 = this.f44550d.mo46535a().m4693p();
            if (activityC4831qM4693p10 != null) {
                activityC4831qM4693p10.reportFullyDrawn();
            }
            if (C11659h.m43403a().mo43548U5() && activityC4831qM4693p10 != null) {
                C4617i.m22795o(activityC4831qM4693p10);
            }
            C3272a.m15706n();
            if (C11659h.m43403a().mo43710r1()) {
                FlagCacheUtils.flushRetryDialogTelemetry();
                return;
            }
            return;
        }
        if (C11659h.m43403a().mo43537T1() && str.equals("GAME_STREAMING_STATUS_CHANGED")) {
            try {
                boolean zOptBoolean2 = new JSONObject(str2).optBoolean("inGameStreaming", false);
                ActivityC4831q activityC4831qM4693p11 = this.f44550d.mo46535a().m4693p();
                if (activityC4831qM4693p11 != null) {
                    if (zOptBoolean2) {
                        C12454p0.m46687f(activityC4831qM4693p11);
                    } else {
                        C12454p0.m46690i(activityC4831qM4693p11);
                    }
                }
            } catch (JSONException e12) {
                C6124q.m27060e("rbx.datamodel", "Failed to parse GAME_STREAMING_STATUS_CHANGED data: " + e12.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m46672d(String str) {
        str.getClass();
        if (str.equals("Startup")) {
            C12180j.m45086q().m45096k("luaStartup");
        } else if (str.equals("Landing")) {
            C12180j.m45086q().m45096k("luaLandingScreen");
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m46673e() {
        C12180j.m45086q().m45096k("luaHomeScreen");
    }

    /* JADX INFO: renamed from: f */
    public final void m46674f(JSONObject jSONObject) {
        C11346q.m42509b(jSONObject, this.f44550d.mo46535a().m4693p());
    }

    /* JADX INFO: renamed from: g */
    public void m46675g() {
        if (this.f44550d.mo46535a().m4693p() != null) {
            C1678a.m8388a().m8389b(new C1678a.b() { // from class: wh.l
                @Override // cm.C1678a.b
                /* JADX INFO: renamed from: a */
                public final void mo1255a(JSONObject jSONObject) {
                    this.f44525a.m46674f(jSONObject);
                }
            });
        }
    }
}
