package vi;

import ak.k0;
import ak.l2;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import backtraceio.library.models.json.BacktraceReport;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.user.NativeUserJavaInterface;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.logging.LoggingProtocol;
import gk.p;
import gk.y;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import jj.n;
import jj.r;
import nb.qe;
import org.webrtc.ContextUtils;
import sg.a1;
import sg.q0;
import sg.t;
import sg.t0;
import sg.u;
import wk.j;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f33239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f33240e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f33241f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f33242g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f33243a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f33244c;

    public class a implements xi.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f33245a;
        public final /* synthetic */ com.roblox.client.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f33246c;

        /* JADX INFO: renamed from: vi.b$a$a, reason: collision with other inner class name */
        public class C0600a implements qi.h.c {
            public C0600a() {
            }

            @Override // qi.h.c
            public void a(boolean z10) {
                p.b("rbx.AppManager", "handleLogout: ... Get-Locale API finished.");
                com.roblox.client.a aVar = a.this.b;
                if (aVar != null && !aVar.isFinishing()) {
                    a.this.b.T1();
                }
                e.c().f(2, a.this.f33246c);
                b.f33239d = false;
            }
        }

        public a(Activity activity, com.roblox.client.a aVar, Bundle bundle) {
            this.f33245a = activity;
            this.b = aVar;
            this.f33246c = bundle;
        }

        @Override // xi.c.b
        public void a() {
            p.b("rbx.AppManager", "handleLogout: ... Logout API finished.");
            new qi.h().a(this.f33245a, new C0600a());
        }
    }

    /* JADX INFO: renamed from: vi.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C0601b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33249a;

        static {
            int[] iArr = new int[d.values().length];
            f33249a = iArr;
            try {
                iArr[d.LOGOUT_BY_USER_IN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33249a[d.LOGOUT_BY_USER_IN_LUA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33249a[d.LOGOUT_BY_401_ERROR_IN_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33249a[d.LOGOUT_BY_401_ERROR_IN_WEB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33249a[d.LOGOUT_BY_401_ERROR_IN_LUA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33250a = new b();
    }

    public enum d {
        LOGOUT_BY_USER_IN_NATIVE,
        LOGOUT_BY_USER_IN_LUA,
        LOGOUT_BY_401_ERROR_IN_NATIVE,
        LOGOUT_BY_401_ERROR_IN_WEB,
        LOGOUT_BY_401_ERROR_IN_LUA
    }

    public static /* synthetic */ void a(Context context, String str) {
        t.c(context);
        NativeSettingsInterface.nativeSetDefaultAppPolicyFile("content/guac/defaultConfigs/GuacDefaultPolicy-" + a1.t() + ".json");
    }

    public static boolean e() {
        if (!f33240e) {
            return false;
        }
        f33240e = false;
        return true;
    }

    public static b f() {
        return c.f33250a;
    }

    public static d g(Bundle bundle) {
        d dVar;
        if (bundle != null && (dVar = (d) bundle.getSerializable("logout_type")) != null) {
            return dVar;
        }
        p.e("rbx.AppManager", "getLogoutTypeFromBundle: Logic error: Cannot find LogoutType enum in bundle!");
        return d.LOGOUT_BY_USER_IN_NATIVE;
    }

    public static boolean n() {
        return f33242g;
    }

    public static void q() {
        f33240e = true;
    }

    public void c(Context context) {
        SharedPreferences sharedPreferencesA = y.a(context, "DeviceInstallPreferences");
        boolean z10 = sharedPreferencesA.getBoolean("AppFirstLaunch", true);
        this.b = z10;
        if (z10) {
            p.h("rbx.AppManager", "First App launch!");
            g.b().f();
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putBoolean("AppFirstLaunch", false);
            editorEdit.putLong("AppFirstLaunchTime", System.currentTimeMillis());
            editorEdit.apply();
        }
    }

    public final void d(d dVar) {
        int i10 = C0601b.f33249a[dVar.ordinal()];
        if (i10 == 1) {
            t0.j("manual", "manual");
            return;
        }
        if (i10 == 2) {
            t0.j("manual", "luaapp");
            return;
        }
        if (i10 == 3) {
            t0.j("failedSessionCheck", "native");
            return;
        }
        if (i10 == 4) {
            t0.j("failedSessionCheck", "webview");
            return;
        }
        if (i10 == 5) {
            t0.j("failedSessionCheck", "luaapp");
            return;
        }
        p.k("rbx.AppManager", "fireLogoutEvent: Unknown logoutType:" + dVar);
    }

    public void h() {
        f33242g = true;
    }

    public void i(Activity activity, d dVar) {
        com.roblox.client.a aVar;
        p.h("rbx.AppManager", "handleLogout: logoutType = " + dVar + ", activity = " + activity.getLocalClassName());
        if (th.h.a().M1() && (dVar == d.LOGOUT_BY_401_ERROR_IN_NATIVE || dVar == d.LOGOUT_BY_401_ERROR_IN_WEB || dVar == d.LOGOUT_BY_401_ERROR_IN_LUA)) {
            p(dVar);
        }
        f33239d = true;
        d(dVar);
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", dVar);
        if (th.h.a().u5()) {
            gk.c.g().c();
            a1.X0();
            sg.y.h().d().b();
        }
        if (th.h.a().h5()) {
            com.roblox.client.ossearch.b.f(activity);
        }
        com.roblox.client.a aVar2 = null;
        if (dVar == d.LOGOUT_BY_USER_IN_NATIVE) {
            if (activity instanceof com.roblox.client.a) {
                aVar = (com.roblox.client.a) activity;
            }
            if (aVar2 != null) {
                aVar2 = aVar;
                aVar2.d2(aVar2);
            }
            aVar2 = aVar;
            k0.s(activity).C(activity, true, new a(activity, aVar2, bundle));
        } else {
            k0.s(activity).C(activity, false, null);
            e.c().f(2, bundle);
            f33239d = false;
        }
        if (th.h.a().J3()) {
            activity.getWindow().setFlags(8192, 8192);
        }
        f33242g = false;
    }

    public void j(Activity activity) {
        p.h("rbx.AppManager", "handleSwitchAccount activity = " + activity.getLocalClassName());
        f33239d = true;
        t0.z();
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", d.LOGOUT_BY_USER_IN_LUA);
        if (th.h.a().u5()) {
            gk.c.g().c();
            a1.X0();
            sg.y.h().d().b();
        }
        if (th.h.a().m5()) {
            com.roblox.client.ossearch.b.f(activity);
        }
        k0.s(activity).C(activity, false, null);
        e.c().f(2, bundle);
        f33239d = false;
        f33242g = false;
    }

    public final void k(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        NotificationChannel notificationChannel = new NotificationChannel("channel_general", applicationContext.getString(q0.f30929f1), 3);
        NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
        notificationManager.createNotificationChannel(notificationChannel);
        notificationManager.deleteNotificationChannel("channel_games");
        if (a1.q0()) {
            notificationManager.deleteNotificationChannel("channel_calls");
        } else {
            NotificationChannel notificationChannel2 = new NotificationChannel("channel_calls", applicationContext.getString(q0.f30917b1), 4);
            notificationChannel2.setSound(RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
            notificationChannel2.setVibrationPattern(n.b);
            notificationManager.createNotificationChannel(notificationChannel2);
        }
        NotificationChannel notificationChannel3 = new NotificationChannel("channel_urgent", applicationContext.getString(q0.f30944k1), 4);
        NotificationChannel notificationChannel4 = new NotificationChannel("channel_default", applicationContext.getString(q0.f30923d1), 3);
        NotificationChannel notificationChannel5 = new NotificationChannel("channel_medium", applicationContext.getString(q0.f30932g1), 2);
        NotificationChannel notificationChannel6 = new NotificationChannel("channel_minimum", applicationContext.getString(q0.f30935h1), 1);
        notificationManager.createNotificationChannel(notificationChannel3);
        notificationManager.createNotificationChannel(notificationChannel4);
        notificationManager.createNotificationChannel(notificationChannel5);
        notificationManager.createNotificationChannel(notificationChannel6);
        NotificationChannel notificationChannel7 = new NotificationChannel("channel_recommended", applicationContext.getString(q0.f30949m0), 3);
        notificationChannel7.setSound(null, null);
        notificationChannel7.enableVibration(false);
        notificationManager.createNotificationChannel(notificationChannel7);
    }

    public void l(@NonNull Context context) {
        synchronized (b.class) {
            try {
                p.h("rbx.AppManager", "initialize: Start...");
                if (this.f33243a) {
                    o();
                    p.h("rbx.AppManager", "initialize: Already initialized.");
                } else {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    m(context);
                    f33242g = false;
                    this.f33243a = true;
                    o();
                    p.h("rbx.AppManager", "initialize: Completed OK. elapsedTime(ms) = " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(@NonNull final Context context) {
        y.e(context.getApplicationContext());
        a1.g0(context);
        NativeSettingsInterface.nativeSetBaseUrl(a1.g(), a1.h());
        NativeSettingsInterface.nativeSetRobloxChannel(a1.W());
        if (th.h.a().M1()) {
            wk.e.a aVarC = wk.e.c();
            if (aVarC == wk.e.a.NEW_FLOW_MIGRATED) {
                LoggingProtocol.g("cookie_migrated");
                p.h("rbx.AppManager", "VersionB: cookies migrated from WebView to native storage.");
            } else if (aVarC == wk.e.a.NEW_FLOW_LOADED) {
                LoggingProtocol.g("cookie_loaded");
                p.h("rbx.AppManager", "VersionB: cookies loaded from native storage.");
            }
        }
        NativeUserJavaInterface.setImplementation(new ni.c());
        l2.b(context);
        vk.g.i(sg.y.h().l());
        sg.y.h().p();
        h.e();
        u.g().d(null);
        xg.a.e().g(context);
        nh.d.b();
        qi.b.f().q(Locale.getDefault());
        if (th.h.a().E4()) {
            r.k().x(context);
        } else {
            k(context);
        }
        mk.d.c(new wj.b());
        ContextUtils.initialize(context.getApplicationContext());
        mk.c.p().s(new Consumer() { // from class: vi.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b.a(context, (String) obj);
            }
        });
        mk.c.p().x();
    }

    public final void o() {
        String strZ0 = a1.Z0();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ROBLOX\n| User-Agent = ");
        sb2.append(strZ0);
        sb2.append("\n| Build = ");
        sb2.append(gk.h.a());
        sb2.append(", ID = ");
        sb2.append(a1.K());
        sb2.append("\n| Version = ");
        sb2.append("2.743.1136");
        sb2.append(", Code = ");
        sb2.append(18934);
        sb2.append("\n| BaseUrl = ");
        sb2.append(a1.H());
        sb2.append("\n| OS Ver. = ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", Lvl = ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("\n| Arch = ");
        sb2.append(u.g().i().toString());
        sb2.append("\n| Is domain set = ");
        sb2.append(vk.g.c() != null);
        p.h("rbx.AppManager", sb2.toString());
    }

    public void p(d dVar) {
        boolean z10;
        boolean z11;
        if (th.h.a().M1()) {
            try {
                boolean zF = h.e().f();
                boolean zH = h.h();
                boolean zU = a1.u();
                String strB = j.c().b(a1.g());
                boolean z12 = strB != null && strB.contains(".ROBLOSECURITY=_");
                String strF = wk.e.f();
                String strName = wk.e.c().name();
                long jE = wk.e.e();
                long jCurrentTimeMillis = jE > 0 ? (System.currentTimeMillis() - jE) / 1000 : -1L;
                String strD = wk.e.d();
                sm.c.d(new sm.c.a("cookie_versionb_did_logout", qe.a(new Object[]{TelemetryBackend.COUNTER})).j(2026, 9, 21).d(), new sm.c.b().b("logout_type", dVar.name()).b("was_logged_in", String.valueOf(zF)).b("has_cached_user", String.valueOf(zH)).b("shell_has_roblosecurity", String.valueOf(z12)).b("engine_has_roblosecurity", String.valueOf(zU)).b("webview_state", strF).b("migration_result", strName).b("native_cookie_age_seconds", String.valueOf(jCurrentTimeMillis)).b("native_cookie_write_source", strD).l());
                boolean z13 = Math.random() * 100.0d < ((double) th.h.a().C4());
                j6.a aVarG = vg.e.h().g();
                if (!z13 || aVarG == null) {
                    z10 = true;
                    z11 = false;
                } else {
                    boolean z14 = z12;
                    z10 = true;
                    z11 = false;
                    if (f33241f.compareAndSet(false, true)) {
                        HashMap map = new HashMap();
                        map.put("logout_type", dVar.name());
                        map.put("was_logged_in", String.valueOf(zF));
                        map.put("has_cached_user", String.valueOf(zH));
                        map.put("shell_has_roblosecurity", String.valueOf(z14));
                        map.put("cookie_webview_state", strF);
                        map.put("cookie_migration_result", strName);
                        map.put("engine_has_roblosecurity", String.valueOf(zU));
                        map.put("native_cookie_age_seconds", String.valueOf(jCurrentTimeMillis));
                        map.put("native_cookie_write_source", strD);
                        aVarG.send(new BacktraceReport("involuntary_logout:" + dVar.name(), map));
                        p.h("rbx.AppManager", "reportInvoluntaryLogout: sent Backtrace report for " + dVar.name());
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("reportInvoluntaryLogout: counter only (inUploadSample=");
                sb2.append(z13);
                sb2.append(", clientReady=");
                sb2.append(aVarG != null ? z10 : z11);
                sb2.append(", alreadyUploadedThisProcess=");
                sb2.append(f33241f.get());
                sb2.append(")");
                p.h("rbx.AppManager", sb2.toString());
            } catch (Throwable th2) {
                p.k("rbx.AppManager", "reportInvoluntaryLogout: failed: " + th2);
            }
        }
    }

    public void r(boolean z10) {
        this.f33244c = z10;
    }

    public b() {
        this.f33243a = false;
        p.h("rbx.AppManager", "[AppManager]: Constructor called.");
    }
}
