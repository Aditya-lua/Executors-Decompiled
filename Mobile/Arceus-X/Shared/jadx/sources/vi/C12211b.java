package vi;

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
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.ossearch.C3210b;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.user.NativeUserJavaInterface;
import com.roblox.protocols.telemetrybindingsplatforminterface.generated.TelemetryBackend;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import mk.C8569c;
import mk.C8570d;
import ni.C9481c;
import org.webrtc.ContextUtils;
import p015ak.C0305k0;
import p015ak.C0311l2;
import p151gk.C6107c;
import p151gk.C6115h;
import p151gk.C6124q;
import p151gk.C6133z;
import p210j6.C7032a;
import p222jj.C7189n;
import p222jj.C7193r;
import p306nb.C9261qe;
import p308nh.C9478d;
import p383qi.C10583b;
import p383qi.C10589h;
import p493vk.C12225g;
import p519wj.C12477b;
import p520wk.C12483e;
import p520wk.C12488j;
import p546xg.C12830a;
import p548xi.C12836c;
import sg.C11295a1;
import sg.C11347q0;
import sg.C11355t;
import sg.C11356t0;
import sg.C11358u;
import sg.C11370y;
import sm.C11416c;
import th.C11659h;
import vg.C12175e;

/* JADX INFO: renamed from: vi.b */
/* JADX INFO: loaded from: classes2.dex */
public class C12211b {

    /* JADX INFO: renamed from: d */
    public static boolean f43042d;

    /* JADX INFO: renamed from: e */
    public static boolean f43043e;

    /* JADX INFO: renamed from: f */
    public static final AtomicBoolean f43044f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public static boolean f43045g;

    /* JADX INFO: renamed from: a */
    public volatile boolean f43046a;

    /* JADX INFO: renamed from: b */
    public boolean f43047b;

    /* JADX INFO: renamed from: c */
    public boolean f43048c;

    /* JADX INFO: renamed from: vi.b$a */
    public class a implements C12836c.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f43049a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractActivityC3152a f43050b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Bundle f43051c;

        /* JADX INFO: renamed from: vi.b$a$a, reason: collision with other inner class name */
        public class C14271a implements C10589h.c {
            public C14271a() {
            }

            @Override // p383qi.C10589h.c
            /* JADX INFO: renamed from: a */
            public void mo40612a(boolean z10) {
                C6124q.m27057b("rbx.AppManager", "handleLogout: ... Get-Locale API finished.");
                AbstractActivityC3152a abstractActivityC3152a = a.this.f43050b;
                if (abstractActivityC3152a != null && !abstractActivityC3152a.isFinishing()) {
                    a.this.f43050b.m14848T1();
                }
                C12214e.m45220c().m45224f(2, a.this.f43051c);
                C12211b.f43042d = false;
            }
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(Activity activity, AbstractActivityC3152a abstractActivityC3152a, Bundle bundle) {
            this.f43049a = activity;
            this.f43050b = abstractActivityC3152a;
            this.f43051c = bundle;
        }

        @Override // p548xi.C12836c.b
        /* JADX INFO: renamed from: a */
        public void mo45215a() {
            C6124q.m27057b("rbx.AppManager", "handleLogout: ... Logout API finished.");
            new C10589h().m40609a(this.f43049a, new C14271a());
        }
    }

    /* JADX INFO: renamed from: vi.b$b */
    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f43054a;

        static {
            int[] iArr = new int[d.values().length];
            f43054a = iArr;
            try {
                iArr[d.LOGOUT_BY_USER_IN_NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43054a[d.LOGOUT_BY_USER_IN_LUA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43054a[d.LOGOUT_BY_401_ERROR_IN_NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43054a[d.LOGOUT_BY_401_ERROR_IN_WEB.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f43054a[d.LOGOUT_BY_401_ERROR_IN_LUA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: vi.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final C12211b f43055a = new C12211b();
    }

    /* JADX INFO: renamed from: vi.b$d */
    public enum d {
        LOGOUT_BY_USER_IN_NATIVE,
        LOGOUT_BY_USER_IN_LUA,
        LOGOUT_BY_401_ERROR_IN_NATIVE,
        LOGOUT_BY_401_ERROR_IN_WEB,
        LOGOUT_BY_401_ERROR_IN_LUA
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45197a(Context context, String str) {
        C11355t.m42527c(context);
        NativeSettingsInterface.nativeSetDefaultAppPolicyFile("content/guac/defaultConfigs/GuacDefaultPolicy-" + C11295a1.m42476t() + ".json");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m45199e() {
        if (!f43043e) {
            return false;
        }
        f43043e = false;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static C12211b m45200f() {
        return c.f43055a;
    }

    /* JADX INFO: renamed from: g */
    public static d m45201g(Bundle bundle) {
        d dVar;
        if (bundle != null && (dVar = (d) bundle.getSerializable("logout_type")) != null) {
            return dVar;
        }
        C6124q.m27060e("rbx.AppManager", "getLogoutTypeFromBundle: Logic error: Cannot find LogoutType enum in bundle!");
        return d.LOGOUT_BY_USER_IN_NATIVE;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m45202n() {
        return f43045g;
    }

    /* JADX INFO: renamed from: q */
    public static void m45203q() {
        f43043e = true;
    }

    /* JADX INFO: renamed from: c */
    public void m45204c(Context context) {
        SharedPreferences sharedPreferencesM27104a = C6133z.m27104a(context, "DeviceInstallPreferences");
        boolean z10 = sharedPreferencesM27104a.getBoolean("AppFirstLaunch", true);
        this.f43047b = z10;
        if (z10) {
            C6124q.m27063h("rbx.AppManager", "First App launch!");
            C12216g.m45228b().m45264f();
            SharedPreferences.Editor editorEdit = sharedPreferencesM27104a.edit();
            editorEdit.putBoolean("AppFirstLaunch", false);
            editorEdit.putLong("AppFirstLaunchTime", System.currentTimeMillis());
            editorEdit.apply();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m45205d(d dVar) {
        int i10 = b.f43054a[dVar.ordinal()];
        if (i10 == 1) {
            C11356t0.m42540j("manual", "manual");
            return;
        }
        if (i10 == 2) {
            C11356t0.m42540j("manual", "luaapp");
            return;
        }
        if (i10 == 3) {
            C11356t0.m42540j("failedSessionCheck", "native");
            return;
        }
        if (i10 == 4) {
            C11356t0.m42540j("failedSessionCheck", "webview");
            return;
        }
        if (i10 == 5) {
            C11356t0.m42540j("failedSessionCheck", "luaapp");
            return;
        }
        C6124q.m27066k("rbx.AppManager", "fireLogoutEvent: Unknown logoutType:" + dVar);
    }

    /* JADX INFO: renamed from: h */
    public void m45206h() {
        f43045g = true;
    }

    /* JADX INFO: renamed from: i */
    public void m45207i(Activity activity, d dVar) {
        AbstractActivityC3152a abstractActivityC3152a;
        C6124q.m27063h("rbx.AppManager", "handleLogout: logoutType = " + dVar + ", activity = " + activity.getLocalClassName());
        if (C11659h.m43403a().mo43530S1() && (dVar == d.LOGOUT_BY_401_ERROR_IN_NATIVE || dVar == d.LOGOUT_BY_401_ERROR_IN_WEB || dVar == d.LOGOUT_BY_401_ERROR_IN_LUA)) {
            m45213p(dVar);
        }
        f43042d = true;
        m45205d(dVar);
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", dVar);
        if (C11659h.m43403a().mo43410A5()) {
            C6107c.m27010g().m27011c();
            C11295a1.m42429X0();
            C11370y.m42581h().m42585d().mo14925b();
        }
        if (C11659h.m43403a().mo43686n5()) {
            C3210b.m15319f(activity);
        }
        AbstractActivityC3152a abstractActivityC3152a2 = null;
        if (dVar == d.LOGOUT_BY_USER_IN_NATIVE) {
            if (activity instanceof AbstractActivityC3152a) {
                abstractActivityC3152a = (AbstractActivityC3152a) activity;
            }
            if (abstractActivityC3152a2 != null) {
                abstractActivityC3152a2 = abstractActivityC3152a;
                abstractActivityC3152a2.m14858d2(abstractActivityC3152a2);
            }
            abstractActivityC3152a2 = abstractActivityC3152a;
            C0305k0.m1274s(activity).m1278C(activity, true, new a(activity, abstractActivityC3152a2, bundle));
        } else {
            C0305k0.m1274s(activity).m1278C(activity, false, null);
            C12214e.m45220c().m45224f(2, bundle);
            f43042d = false;
        }
        if (C11659h.m43403a().mo43505O3()) {
            activity.getWindow().setFlags(8192, 8192);
        }
        f43045g = false;
    }

    /* JADX INFO: renamed from: j */
    public void m45208j(Activity activity) {
        C6124q.m27063h("rbx.AppManager", "handleSwitchAccount activity = " + activity.getLocalClassName());
        f43042d = true;
        C11356t0.m42556z();
        Bundle bundle = new Bundle();
        bundle.putSerializable("logout_type", d.LOGOUT_BY_USER_IN_LUA);
        if (C11659h.m43403a().mo43410A5()) {
            C6107c.m27010g().m27011c();
            C11295a1.m42429X0();
            C11370y.m42581h().m42585d().mo14925b();
        }
        if (C11659h.m43403a().mo43721s5()) {
            C3210b.m15319f(activity);
        }
        C0305k0.m1274s(activity).m1278C(activity, false, null);
        C12214e.m45220c().m45224f(2, bundle);
        f43042d = false;
        f43045g = false;
    }

    /* JADX INFO: renamed from: k */
    public final void m45209k(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        NotificationChannel notificationChannel = new NotificationChannel("channel_general", applicationContext.getString(C11347q0.f39970f1), 3);
        NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService("notification");
        notificationManager.createNotificationChannel(notificationChannel);
        notificationManager.deleteNotificationChannel("channel_games");
        if (C11295a1.m42471q0()) {
            notificationManager.deleteNotificationChannel("channel_calls");
        } else {
            NotificationChannel notificationChannel2 = new NotificationChannel("channel_calls", applicationContext.getString(C11347q0.f39958b1), 4);
            notificationChannel2.setSound(RingtoneManager.getDefaultUri(1), new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
            notificationChannel2.setVibrationPattern(C7189n.f27872b);
            notificationManager.createNotificationChannel(notificationChannel2);
        }
        NotificationChannel notificationChannel3 = new NotificationChannel("channel_urgent", applicationContext.getString(C11347q0.f39985k1), 4);
        NotificationChannel notificationChannel4 = new NotificationChannel("channel_default", applicationContext.getString(C11347q0.f39964d1), 3);
        NotificationChannel notificationChannel5 = new NotificationChannel("channel_medium", applicationContext.getString(C11347q0.f39973g1), 2);
        NotificationChannel notificationChannel6 = new NotificationChannel("channel_minimum", applicationContext.getString(C11347q0.f39976h1), 1);
        notificationManager.createNotificationChannel(notificationChannel3);
        notificationManager.createNotificationChannel(notificationChannel4);
        notificationManager.createNotificationChannel(notificationChannel5);
        notificationManager.createNotificationChannel(notificationChannel6);
        NotificationChannel notificationChannel7 = new NotificationChannel("channel_recommended", applicationContext.getString(C11347q0.f39990m0), 3);
        notificationChannel7.setSound(null, null);
        notificationChannel7.enableVibration(false);
        notificationManager.createNotificationChannel(notificationChannel7);
    }

    /* JADX INFO: renamed from: l */
    public void m45210l(@NonNull Context context) {
        synchronized (C12211b.class) {
            try {
                C6124q.m27063h("rbx.AppManager", "initialize: Start...");
                if (this.f43046a) {
                    m45212o();
                    C6124q.m27063h("rbx.AppManager", "initialize: Already initialized.");
                } else {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    m45211m(context);
                    f43045g = false;
                    this.f43046a = true;
                    m45212o();
                    C6124q.m27063h("rbx.AppManager", "initialize: Completed OK. elapsedTime(ms) = " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m45211m(@NonNull final Context context) {
        C6133z.m27106e(context.getApplicationContext());
        C11295a1.m42451g0(context);
        NativeSettingsInterface.nativeSetBaseUrl(C11295a1.m42450g(), C11295a1.m42452h());
        NativeSettingsInterface.nativeSetRobloxChannel(C11295a1.m42426W());
        if (C11659h.m43403a().mo43530S1()) {
            C12483e.a aVarM46746c = C12483e.m46746c();
            if (aVarM46746c == C12483e.a.NEW_FLOW_MIGRATED) {
                LoggingProtocol.m15994g("cookie_migrated");
                C6124q.m27063h("rbx.AppManager", "VersionB: cookies migrated from WebView to native storage.");
            } else if (aVarM46746c == C12483e.a.NEW_FLOW_LOADED) {
                LoggingProtocol.m15994g("cookie_loaded");
                C6124q.m27063h("rbx.AppManager", "VersionB: cookies loaded from native storage.");
            }
        }
        NativeUserJavaInterface.setImplementation(new C9481c());
        C0311l2.m1315b(context);
        C12225g.m45331i(C11370y.m42581h().m42592l());
        C11370y.m42581h().m42596p();
        C12217h.m45288e();
        C11358u.m42560g().m42561d(null);
        C12830a.m47749e().m47756g(context);
        C9478d.m37341b();
        C10583b.m40569f().m40583q(Locale.getDefault());
        if (C11659h.m43403a().mo43472J4()) {
            C7193r.m30069k().m30093x(context);
        } else {
            m45209k(context);
        }
        C8570d.m34532c(new C12477b());
        ContextUtils.initialize(context.getApplicationContext());
        C8569c.m34512p().m34521s(new Consumer() { // from class: vi.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C12211b.m45197a(context, (String) obj);
            }
        });
        C8569c.m34512p().m34525x();
    }

    /* JADX INFO: renamed from: o */
    public final void m45212o() {
        String strM42433Z0 = C11295a1.m42433Z0();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ROBLOX\n| User-Agent = ");
        sb2.append(strM42433Z0);
        sb2.append("\n| Build = ");
        sb2.append(C6115h.m27036a());
        sb2.append(", ID = ");
        sb2.append(C11295a1.m42402K());
        sb2.append("\n| Version = ");
        sb2.append("2.744.1081");
        sb2.append(", Code = ");
        sb2.append(19426);
        sb2.append("\n| BaseUrl = ");
        sb2.append(C11295a1.m42396H());
        sb2.append("\n| OS Ver. = ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(", Lvl = ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append("\n| Arch = ");
        sb2.append(C11358u.m42560g().m42565i().toString());
        sb2.append("\n| Is domain set = ");
        sb2.append(C12225g.m45325c() != null);
        C6124q.m27063h("rbx.AppManager", sb2.toString());
    }

    /* JADX INFO: renamed from: p */
    public void m45213p(d dVar) {
        boolean z10;
        boolean z11;
        if (C11659h.m43403a().mo43530S1()) {
            try {
                boolean zM45295f = C12217h.m45288e().m45295f();
                boolean zM45289h = C12217h.m45289h();
                boolean zM42478u = C11295a1.m42478u();
                String strMo23956b = C12488j.m46781c().mo23956b(C11295a1.m42450g());
                boolean z12 = strMo23956b != null && strMo23956b.contains(".ROBLOSECURITY=_");
                String strM46749f = C12483e.m46749f();
                String strName = C12483e.m46746c().name();
                long jM46748e = C12483e.m46748e();
                long jCurrentTimeMillis = jM46748e > 0 ? (System.currentTimeMillis() - jM46748e) / 1000 : -1L;
                String strM46747d = C12483e.m46747d();
                C11416c.m42768d(new C11416c.a("cookie_versionb_did_logout", C9261qe.m36724a(new Object[]{TelemetryBackend.COUNTER})).m42780j(2026, 9, 21).m42774d(), new C11416c.b().mo42758b("logout_type", dVar.name()).mo42758b("was_logged_in", String.valueOf(zM45295f)).mo42758b("has_cached_user", String.valueOf(zM45289h)).mo42758b("shell_has_roblosecurity", String.valueOf(z12)).mo42758b("engine_has_roblosecurity", String.valueOf(zM42478u)).mo42758b("webview_state", strM46749f).mo42758b("migration_result", strName).mo42758b("native_cookie_age_seconds", String.valueOf(jCurrentTimeMillis)).mo42758b("native_cookie_write_source", strM46747d).m42785l());
                boolean z13 = Math.random() * 100.0d < ((double) C11659h.m43403a().mo43458H4());
                C7032a c7032aM45060g = C12175e.m45057h().m45060g();
                if (!z13 || c7032aM45060g == null) {
                    z10 = true;
                    z11 = false;
                } else {
                    boolean z14 = z12;
                    z10 = true;
                    z11 = false;
                    if (f43044f.compareAndSet(false, true)) {
                        HashMap map = new HashMap();
                        map.put("logout_type", dVar.name());
                        map.put("was_logged_in", String.valueOf(zM45295f));
                        map.put("has_cached_user", String.valueOf(zM45289h));
                        map.put("shell_has_roblosecurity", String.valueOf(z14));
                        map.put("cookie_webview_state", strM46749f);
                        map.put("cookie_migration_result", strName);
                        map.put("engine_has_roblosecurity", String.valueOf(zM42478u));
                        map.put("native_cookie_age_seconds", String.valueOf(jCurrentTimeMillis));
                        map.put("native_cookie_write_source", strM46747d);
                        c7032aM45060g.send(new BacktraceReport("involuntary_logout:" + dVar.name(), map));
                        C6124q.m27063h("rbx.AppManager", "reportInvoluntaryLogout: sent Backtrace report for " + dVar.name());
                        return;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("reportInvoluntaryLogout: counter only (inUploadSample=");
                sb2.append(z13);
                sb2.append(", clientReady=");
                sb2.append(c7032aM45060g != null ? z10 : z11);
                sb2.append(", alreadyUploadedThisProcess=");
                sb2.append(f43044f.get());
                sb2.append(")");
                C6124q.m27063h("rbx.AppManager", sb2.toString());
            } catch (Throwable th2) {
                C6124q.m27066k("rbx.AppManager", "reportInvoluntaryLogout: failed: " + th2);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m45214r(boolean z10) {
        this.f43048c = z10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12211b() {
        this.f43046a = false;
        C6124q.m27063h("rbx.AppManager", "[AppManager]: Constructor called.");
    }
}
