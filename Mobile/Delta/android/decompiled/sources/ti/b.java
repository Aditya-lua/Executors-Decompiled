package ti;

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
import ek.q;
import ek.z;
import hj.n;
import hj.r;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import nb.qe;
import org.webrtc.ContextUtils;
import rg.a1;
import rg.q0;
import rg.t;
import rg.t0;
import rg.u;
import rg.y;
import uk.j;
import yj.k0;
import yj.l2;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f32374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f32375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicBoolean f32376f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f32377g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f32378a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32379c;

    public class a implements vi.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f32380a;
        public final /* synthetic */ com.roblox.client.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f32381c;

        /* JADX INFO: renamed from: ti.b$a$a, reason: collision with other inner class name */
        public class C0579a implements oi.h.c {
            public C0579a() {
            }

            @Override // oi.h.c
            public void a(boolean z10) {
                q.b("rbx.AppManager", "handleLogout: ... Get-Locale API finished.");
                com.roblox.client.a aVar = a.this.b;
                if (aVar != null && !aVar.isFinishing()) {
                    a.this.b.T1();
                }
                e.c().f(2, a.this.f32381c);
                b.f32374d = false;
            }
        }

        public a(Activity activity, com.roblox.client.a aVar, Bundle bundle) {
            this.f32380a = activity;
            this.b = aVar;
            this.f32381c = bundle;
        }

        @Override // vi.c.b
        public void a() {
            q.b("rbx.AppManager", "handleLogout: ... Logout API finished.");
            new oi.h().a(this.f32380a, new C0579a());
        }
    }

    /* JADX INFO: renamed from: ti.b$b, reason: collision with other inner class name */
    public static /* synthetic */ class C0580b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32384a;

        static {
            int[] iArr = new int[d.values().length];
            f32384a = iArr;
            try {
                iArr[d.LOGOUT_BY_USER_IN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32384a[d.LOGOUT_BY_USER_IN_LUA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32384a[d.LOGOUT_BY_401_ERROR_IN_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32384a[d.LOGOUT_BY_401_ERROR_IN_WEB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32384a[d.LOGOUT_BY_401_ERROR_IN_LUA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f32385a = new b();
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
        if (!f32375e) {
            return false;
        }
        f32375e = false;
        return true;
    }

    public static b f() {
        return c.f32385a;
    }

    public static d g(Bundle bundle) {
        d dVar;
        if (bundle != null && (dVar = (d) bundle.getSerializable("logout_type")) != null) {
            return dVar;
        }
        q.e("rbx.AppManager", "getLogoutTypeFromBundle: Logic error: Cannot find LogoutType enum in bundle!");
        return d.LOGOUT_BY_USER_IN_NATIVE;
    }

    public static boolean n() {
        return f32377g;
    }

    public static void q() {
        f32375e = true;
    }

    public void c(Context context) {
        SharedPreferences sharedPreferencesA = z.a(context, "DeviceInstallPreferences");
        boolean z10 = sharedPreferencesA.getBoolean("AppFirstLaunch", true);
        this.b = z10;
        if (z10) {
            q.h("rbx.AppManager", "First App launch!");
            g.b().f();
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putBoolean("AppFirstLaunch", false);
            editorEdit.putLong("AppFirstLaunchTime", System.currentTimeMillis());
            editorEdit.apply();
        }
    }

    public final void d(d dVar) {
        int i10 = C0580b.f32384a[dVar.ordinal()];
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
        q.k("rbx.AppManager", "fireLogoutEvent: Unknown logoutType:" + dVar);
    }

    public void h() {
        f32377g = true;
    }

    public void i(Activity activity, d dVar) {
        com.roblox.client.a aVar;
        q.h("rbx.AppManager", "handleLogout: logoutType = " + dVar + ", activity = " + activity.getLocalClassName());
        if (rh.h.a().W1() && (dVar == d.LOGOUT_BY_401_ERROR_IN_NATIVE || dVar == d.LOGOUT_BY_401_ERROR_IN_WEB || dVar == d.LOGOUT_BY_401_ERROR_IN_LUA)) {
            p(dVar);
        }
        f32374d = true;
        d(dVar);
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", dVar);
        if (rh.h.a().E5()) {
            ek.c.g().c();
            a1.Y0();
            y.h().d().b();
        }
        if (rh.h.a().t5()) {
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
            f32374d = false;
        }
        if (rh.h.a().U3()) {
            activity.getWindow().setFlags(8192, 8192);
        }
        f32377g = false;
    }

    public void j(Activity activity) {
        q.h("rbx.AppManager", "handleSwitchAccount activity = " + activity.getLocalClassName());
        f32374d = true;
        t0.z();
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", d.LOGOUT_BY_USER_IN_LUA);
        if (rh.h.a().E5()) {
            ek.c.g().c();
            a1.Y0();
            y.h().d().b();
        }
        if (rh.h.a().x5()) {
            com.roblox.client.ossearch.b.f(activity);
        }
        k0.s(activity).C(activity, false, null);
        e.c().f(2, bundle);
        f32374d = false;
        f32377g = false;
    }

    public final void k(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        NotificationChannel notificationChannel = new NotificationChannel("channel_general", applicationContext.getString(q0.f30534f1), 3);
        NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
        notificationManager.createNotificationChannel(notificationChannel);
        notificationManager.deleteNotificationChannel("channel_games");
        if (a1.q0()) {
            notificationManager.deleteNotificationChannel("channel_calls");
        } else {
            NotificationChannel notificationChannel2 = new NotificationChannel("channel_calls", applicationContext.getString(q0.f30522b1), 4);
            notificationChannel2.setSound(RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
            notificationChannel2.setVibrationPattern(n.b);
            notificationManager.createNotificationChannel(notificationChannel2);
        }
        NotificationChannel notificationChannel3 = new NotificationChannel("channel_urgent", applicationContext.getString(q0.f30549k1), 4);
        NotificationChannel notificationChannel4 = new NotificationChannel("channel_default", applicationContext.getString(q0.f30528d1), 3);
        NotificationChannel notificationChannel5 = new NotificationChannel("channel_medium", applicationContext.getString(q0.f30537g1), 2);
        NotificationChannel notificationChannel6 = new NotificationChannel("channel_minimum", applicationContext.getString(q0.f30540h1), 1);
        notificationManager.createNotificationChannel(notificationChannel3);
        notificationManager.createNotificationChannel(notificationChannel4);
        notificationManager.createNotificationChannel(notificationChannel5);
        notificationManager.createNotificationChannel(notificationChannel6);
        NotificationChannel notificationChannel7 = new NotificationChannel("channel_recommended", applicationContext.getString(q0.f30554m0), 3);
        notificationChannel7.setSound(null, null);
        notificationChannel7.enableVibration(false);
        notificationManager.createNotificationChannel(notificationChannel7);
    }

    public void l(@NonNull Context context) {
        synchronized (b.class) {
            try {
                q.h("rbx.AppManager", "initialize: Start...");
                if (this.f32378a) {
                    o();
                    q.h("rbx.AppManager", "initialize: Already initialized.");
                } else {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    m(context);
                    f32377g = false;
                    this.f32378a = true;
                    o();
                    q.h("rbx.AppManager", "initialize: Completed OK. elapsedTime(ms) = " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(@NonNull final Context context) {
        z.e(context.getApplicationContext());
        a1.g0(context);
        NativeSettingsInterface.nativeSetBaseUrl(a1.g(), a1.h());
        NativeSettingsInterface.nativeSetRobloxChannel(a1.W());
        if (rh.h.a().W1()) {
            uk.e.a aVarE = uk.e.e();
            if (aVarE == uk.e.a.NEW_FLOW_MIGRATED) {
                LoggingProtocol.g("cookie_migrated");
                q.h("rbx.AppManager", "VersionB: cookies migrated from WebView to native storage.");
            } else if (aVarE == uk.e.a.NEW_FLOW_LOADED) {
                LoggingProtocol.g("cookie_loaded");
                q.h("rbx.AppManager", "VersionB: cookies loaded from native storage.");
            }
        }
        NativeUserJavaInterface.setImplementation(new li.c());
        l2.b(context);
        tk.g.i(y.h().l());
        y.h().p();
        h.e();
        u.g().d(null);
        wg.a.e().g(context);
        mh.d.b();
        oi.b.f().q(Locale.getDefault());
        if (rh.h.a().Q4()) {
            r.k().x(context);
        } else {
            k(context);
        }
        kk.d.c(new uj.b());
        ContextUtils.initialize(context.getApplicationContext());
        kk.c.p().s(new Consumer() { // from class: ti.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                b.a(context, (String) obj);
            }
        });
        kk.c.p().x();
    }

    public final void o() {
        String strA1 = a1.a1();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ROBLOX\n| User-Agent = ");
        sb2.append(strA1);
        sb2.append("\n| Build = ");
        sb2.append(ek.h.a());
        sb2.append(", ID = ");
        sb2.append(a1.K());
        sb2.append("\n| Version = ");
        sb2.append("2.745.1142");
        sb2.append(", Code = ");
        sb2.append(20136);
        sb2.append("\n| BaseUrl = ");
        sb2.append(a1.H());
        sb2.append("\n| OS Ver. = ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", Lvl = ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("\n| Arch = ");
        sb2.append(u.g().i().toString());
        sb2.append("\n| Is domain set = ");
        sb2.append(tk.g.c() != null);
        q.h("rbx.AppManager", sb2.toString());
    }

    public void p(d dVar) {
        boolean z10;
        boolean z11;
        if (rh.h.a().W1()) {
            try {
                boolean zF = h.e().f();
                boolean zH = h.h();
                boolean zU = a1.u();
                String strB = j.c().b(a1.g());
                boolean z12 = strB != null && strB.contains(".ROBLOSECURITY=_");
                String strJ = uk.e.j();
                String strName = uk.e.e().name();
                long jI = uk.e.i();
                long jCurrentTimeMillis = jI > 0 ? (System.currentTimeMillis() - jI) / 1000 : -1L;
                String strH = uk.e.h();
                long jG = uk.e.g();
                long jCurrentTimeMillis2 = jG > 0 ? (System.currentTimeMillis() - jG) / 1000 : -1L;
                String strF = uk.e.f();
                boolean z13 = z12;
                qm.c.d(new qm.c.a("cookie_versionb_did_logout", qe.a(new Object[]{TelemetryBackend.COUNTER})).j(2026, 10, 13).d(), new qm.c.b().b("logout_type", dVar.name()).b("was_logged_in", String.valueOf(zF)).b("has_cached_user", String.valueOf(zH)).b("shell_has_roblosecurity", String.valueOf(z13)).b("engine_has_roblosecurity", String.valueOf(zU)).b("webview_state", strJ).b("migration_result", strName).b("native_cookie_age_bucket", uk.e.a(jI)).b("native_cookie_write_source", strH).b("native_cookie_delete_age_bucket", uk.e.a(jG)).b("native_cookie_delete_source", strF).l());
                boolean z14 = Math.random() * 100.0d < ((double) rh.h.a().O4());
                j6.a aVarG = ug.e.h().g();
                if (!z14 || aVarG == null) {
                    z10 = true;
                    z11 = false;
                } else {
                    z10 = true;
                    z11 = false;
                    if (f32376f.compareAndSet(false, true)) {
                        HashMap map = new HashMap();
                        map.put("logout_type", dVar.name());
                        map.put("was_logged_in", String.valueOf(zF));
                        map.put("has_cached_user", String.valueOf(zH));
                        map.put("shell_has_roblosecurity", String.valueOf(z13));
                        map.put("cookie_webview_state", strJ);
                        map.put("cookie_migration_result", strName);
                        map.put("engine_has_roblosecurity", String.valueOf(zU));
                        map.put("native_cookie_age_seconds", String.valueOf(jCurrentTimeMillis));
                        map.put("native_cookie_write_source", strH);
                        map.put("native_cookie_delete_age_seconds", String.valueOf(jCurrentTimeMillis2));
                        map.put("native_cookie_delete_source", strF);
                        aVarG.send(new BacktraceReport("involuntary_logout:" + dVar.name(), map));
                        q.h("rbx.AppManager", "reportInvoluntaryLogout: sent Backtrace report for " + dVar.name());
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("reportInvoluntaryLogout: counter only (inUploadSample=");
                sb2.append(z14);
                sb2.append(", clientReady=");
                sb2.append(aVarG != null ? z10 : z11);
                sb2.append(", alreadyUploadedThisProcess=");
                sb2.append(f32376f.get());
                sb2.append(")");
                q.h("rbx.AppManager", sb2.toString());
            } catch (Throwable th2) {
                q.k("rbx.AppManager", "reportInvoluntaryLogout: failed: " + th2);
            }
        }
    }

    public void r(boolean z10) {
        this.f32379c = z10;
    }

    public b() {
        this.f32378a = false;
        q.h("rbx.AppManager", "[AppManager]: Constructor called.");
    }
}
