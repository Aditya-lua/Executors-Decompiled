package com.roblox.client.startup;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.Os;
import android.text.TextUtils;
import com.github.luben.zstd.ZstdInputStream;
import com.github.luben.zstd.util.Native;
import com.roblox.client.RobloxApplication;
import com.roblox.client.flags.C3187a;
import com.roblox.client.flags.C3188b;
import com.roblox.client.scheduledwork.FlagFetchWorker;
import com.roblox.client.scheduledwork.OtaConfigHandler;
import com.roblox.client.scheduledwork.OtaPollingWorker;
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.C3273b;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.ClientLocalFlags;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.webrtc.WebRtcLoader;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ke.C7572d;
import ne.C9418e0;
import ne.C9435s;
import ne.InterfaceC9425i;
import ne.InterfaceFutureC9440x;
import org.json.JSONException;
import org.json.JSONObject;
import p015ak.C0347x;
import p015ak.EnumC0307k2;
import p104ei.C5141s;
import p151gk.AsyncTaskC6103a;
import p151gk.C6107c;
import p151gk.C6122o;
import p151gk.C6124q;
import p151gk.C6130w;
import p261l2.C7975b;
import p308nh.C9475a;
import p308nh.C9476b;
import p348p1.C10146t;
import p519wj.C12476a;
import p520wk.C12488j;
import p536x5.AbstractC12719p0;
import p536x5.C12694d;
import p536x5.C12701g0;
import p536x5.EnumC12688a;
import p536x5.EnumC12704i;
import p536x5.EnumC12734x;
import sg.C11295a1;
import sh.C11377b;
import th.C11657f;
import th.C11659h;
import th.InterfaceC11660i;
import vg.C12177g;

/* JADX INFO: renamed from: com.roblox.client.startup.a */
/* JADX INFO: loaded from: classes2.dex */
public class C3272a {

    /* JADX INFO: renamed from: b */
    public static InterfaceFutureC9440x<C3273b.b> f12333b;

    /* JADX INFO: renamed from: a */
    public static AtomicReference<b> f12332a = new AtomicReference<>(b.UNINITIALIZED);

    /* JADX INFO: renamed from: c */
    public static boolean f12334c = true;

    /* JADX INFO: renamed from: d */
    public static String f12335d = "roblox";

    /* JADX INFO: renamed from: e */
    public static long f12336e = 0;

    /* JADX INFO: renamed from: f */
    public static final Object f12337f = new Object();

    /* JADX INFO: renamed from: g */
    public static final Object f12338g = new Object();

    /* JADX INFO: renamed from: h */
    public static final AtomicBoolean f12339h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public static boolean f12340i = false;

    /* JADX INFO: renamed from: j */
    public static JSONObject f12341j = null;

    /* JADX INFO: renamed from: k */
    public static final a f12342k = new a();

    /* JADX INFO: renamed from: com.roblox.client.startup.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public JSONObject f12343a;

        /* JADX INFO: renamed from: b */
        public final Handler f12344b;

        /* JADX INFO: renamed from: c */
        public final Runnable f12345c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f12346d;

        /* JADX INFO: renamed from: a */
        public void m15719a() {
            if (this.f12346d.getAndSet(true)) {
                return;
            }
            this.f12344b.removeCallbacks(this.f12345c);
            if (this.f12343a == null) {
                return;
            }
            C11295a1.m42404L(RobloxApplication.m14834f()).edit().putString("AndroidAppSettingsCache", this.f12343a.toString()).apply();
            this.f12343a = null;
        }

        /* JADX INFO: renamed from: b */
        public synchronized void m15720b(JSONObject jSONObject) {
            this.f12343a = jSONObject;
            this.f12344b.removeCallbacks(this.f12345c);
            this.f12344b.postDelayed(this.f12345c, C11659h.m43403a().mo43511P2());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a() {
            this.f12344b = new Handler(Looper.getMainLooper());
            this.f12345c = new Runnable() { // from class: ak.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f778a.m15719a();
                }
            };
            this.f12346d = new AtomicBoolean(false);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.a$b */
    public enum b {
        UNINITIALIZED,
        PREFETCHED,
        REQUEST_SENT,
        ENGINE_FLAG_LOADED
    }

    /* JADX INFO: renamed from: A */
    public static void m15684A(C9418e0<C3273b.b> c9418e0, C3273b.b bVar, Context context) {
        m15688E(bVar, context);
        m15700h();
        m15716x();
        c9418e0.mo37169D(bVar);
        if (C12488j.m46781c() instanceof C5141s) {
            ((C5141s) C12488j.m46781c()).m23959k();
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m15685B(Context context) {
        C3188b.f11801a.m15147f(C11295a1.m42422U(context));
        f12332a.set(b.ENGINE_FLAG_LOADED);
        if (C11659h.m43403a().mo43427D1()) {
            Iterator<String> it = OtaConfigHandler.getActiveBehaviorNames(OtaConfigHandler.getOtaPrefs(context)).iterator();
            while (it.hasNext()) {
                OtaConfigHandler.checkAndPromoteWorkerBlob(context, it.next());
            }
        }
        OtaPollingWorker.m15504x(context);
    }

    /* JADX INFO: renamed from: C */
    public static void m15686C(String str) {
        f12335d = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m15687D() {
        int i10;
        try {
            InterfaceC11660i interfaceC11660iM43403a = C11659h.m43403a();
            if (!interfaceC11660iM43403a.mo43549V() || Process.is64Bit()) {
                return;
            }
            if (interfaceC11660iM43403a.mo43559W2()) {
                i10 = 512;
            } else if (interfaceC11660iM43403a.mo43659k()) {
                i10 = 768;
            } else {
                i10 = interfaceC11660iM43403a.mo43711r2() ? 1024 : 0;
            }
            if (i10 != 0) {
                Os.setenv("MIMALLOC_RESERVE_OS_MEMORY", i10 + "M", true);
            }
            if (interfaceC11660iM43403a.mo43492M3()) {
                Os.setenv("MIMALLOC_DISALLOW_OS_ALLOC", "1", true);
                Os.setenv("MIMALLOC_LIMIT_OS_ALLOC", "1", true);
            }
            if (interfaceC11660iM43403a.mo43619e2()) {
                Os.setenv("MIMALLOC_EAGER_COMMIT", "0", true);
            }
            if (interfaceC11660iM43403a.mo43649i3()) {
                Os.setenv("MIMALLOC_ARENA_EAGER_COMMIT", "0", true);
            }
        } catch (ErrnoException e10) {
            C6124q.m27066k("AndroidAppSettings", "tuneMimalloc failed " + e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: E */
    public static boolean m15688E(C3273b.b bVar, Context context) {
        JSONObject jSONObjectM15738c = bVar.m15738c();
        boolean z10 = false;
        if (jSONObjectM15738c != null) {
            boolean zM15691H = m15691H(jSONObjectM15738c, 1);
            m15690G(context, jSONObjectM15738c, false);
            f12339h.set(zM15691H);
            m15717y(zM15691H);
            z10 = zM15691H;
        } else {
            m15703k(context);
        }
        m15704l(context);
        C11657f.f41211a.m43393h(C11295a1.m42422U(context));
        C12177g.m45075a(context);
        return z10;
    }

    /* JADX INFO: renamed from: F */
    public static void m15689F(String str, Context context) {
        JSONObject jSONObjectM15736a = C3273b.b.m15736a(str);
        if (jSONObjectM15736a != null) {
            m15690G(context, jSONObjectM15736a, true);
            m15691H(jSONObjectM15736a, 1);
        } else {
            m15703k(context);
        }
        m15704l(context);
        C11657f.f41211a.m43393h(C11295a1.m42422U(context));
        C12177g.m45075a(context);
    }

    /* JADX INFO: renamed from: G */
    public static void m15690G(final Context context, final JSONObject jSONObject, boolean z10) {
        if (!z10 && C11659h.m43403a().mo43557W0() && C6130w.m27099a(context).equals("foreground")) {
            f12342k.m15720b(jSONObject);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ak.g
                @Override // java.lang.Runnable
                public final void run() {
                    C11295a1.m42404L(context.getApplicationContext()).edit().putString("AndroidAppSettingsCache", jSONObject.toString()).apply();
                }
            });
        }
    }

    /* JADX INFO: renamed from: H */
    public static boolean m15691H(JSONObject jSONObject, int i10) {
        Object objValueOf;
        boolean z10 = false;
        for (Map.Entry<String, C3187a> entry : C11659h.m43403a().mo15152R3()) {
            String key = entry.getKey();
            C3187a value = entry.getValue();
            String strM15708p = m15708p(jSONObject, key, value);
            if (strM15708p != null) {
                try {
                    if ((value instanceof C3187a.a) || (value instanceof C3187a.d)) {
                        objValueOf = Boolean.valueOf(jSONObject.getBoolean(strM15708p));
                    } else if (value instanceof C3187a.c) {
                        objValueOf = Long.valueOf(jSONObject.getLong(strM15708p));
                    } else {
                        objValueOf = ((value instanceof C3187a.b) || (value instanceof C3187a.f)) ? Integer.valueOf(jSONObject.getInt(strM15708p)) : jSONObject.getString(strM15708p);
                    }
                    value.m15128f(objValueOf, i10);
                    z10 = true;
                } catch (JSONException unused) {
                    value.m15125c(i10);
                    C6124q.m27066k("AndroidAppSettings", "Error reading value for setting: " + key);
                }
            } else {
                value.m15125c(i10);
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: I */
    public static void m15692I(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        m15712t();
        LoggingProtocol.m15999l("native_lib_wait_" + str + "_begin", Long.valueOf(jElapsedRealtime));
        LoggingProtocol.m15998k("native_lib_wait_" + str + "_end");
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m15693a(final Context context, final C9418e0 c9418e0) {
        C10146t.m39085a(f12332a, b.PREFETCHED, b.REQUEST_SENT);
        m15715w();
        LoggingProtocol.m15998k("vb_flag_enabled");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ak.j
            @Override // java.lang.Runnable
            public final void run() {
                C3272a.m15694b(context, atomicBoolean, c9418e0);
            }
        });
        C3273b.b bVarM15723b = C3273b.m15723b(context);
        if (atomicBoolean.compareAndSet(false, true)) {
            C6124q.m27063h("AndroidAppSettings", "[VersionB] Network won the race.");
            m15684A(c9418e0, bVarM15723b, context);
        } else {
            C6124q.m27063h("AndroidAppSettings", "[VersionB] Network fetch complete; cache already won.");
        }
        FlagCacheUtils.storePendingVersionBWrite(bVarM15723b, context);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15694b(Context context, AtomicBoolean atomicBoolean, C9418e0 c9418e0) {
        try {
            C3273b.b bVarTryLoadVersionBCache = FlagCacheUtils.tryLoadVersionBCache(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (bVarTryLoadVersionBCache == null) {
                String lastCacheOutcomeValue = FlagCacheUtils.getLastCacheOutcomeValue();
                LoggingProtocol.m15999l("vb_cache_" + lastCacheOutcomeValue, Long.valueOf(jElapsedRealtime));
                C6124q.m27063h("AndroidAppSettings", "[VersionB] Cache miss (" + lastCacheOutcomeValue + "); waiting for network.");
                return;
            }
            if (!atomicBoolean.compareAndSet(false, true)) {
                LoggingProtocol.m15999l("vb_network_faster", Long.valueOf(jElapsedRealtime));
                C6124q.m27063h("AndroidAppSettings", "[VersionB] Cache hit, but network already won.");
                FlagCacheUtils.recordVersionBCacheOutcome(FlagCacheUtils.EnumC3259a.MISS_NETWORK_WON);
            } else {
                LoggingProtocol.m15999l("vb_cache_applied", Long.valueOf(jElapsedRealtime));
                if (C11659h.m43403a().mo43726t3()) {
                    LoggingProtocol.m15999l(FlagCacheUtils.wasVersionBCacheWrittenByWorker(context) ? "vb_cache_source_worker" : "vb_cache_source_previous_launch", Long.valueOf(jElapsedRealtime));
                }
                C6124q.m27063h("AndroidAppSettings", "[VersionB] Cache won the race.");
                FlagCacheUtils.recordVersionBCacheOutcome(FlagCacheUtils.EnumC3259a.SUCCESS);
                m15684A(c9418e0, bVarTryLoadVersionBCache, context);
            }
        } catch (Exception e10) {
            C6124q.m27061f("AndroidAppSettings", "Failed to read cache", e10);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m15695c(Context context) {
        boolean zMo43653j0 = C11659h.m43403a().mo43653j0();
        if (zMo43653j0) {
            LoggingProtocol.m15998k("cookie_manager_init_begin");
        }
        C12488j.m46781c();
        if (zMo43653j0) {
            LoggingProtocol.m15998k("cookie_manager_init_end");
        }
        C6107c.m27010g().m27013f(context, new AsyncTaskC6103a.a() { // from class: ak.h
            @Override // p151gk.AsyncTaskC6103a.a
            /* JADX INFO: renamed from: a */
            public final void mo1253a(String str) {
                C6107c.f23449c.mo37169D(str);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceFutureC9440x m15696d(Context context, C3273b.b bVar) {
        C11657f.f41211a.m43400q();
        return m15702j(context);
    }

    /* JADX INFO: renamed from: g */
    public static synchronized void m15699g(Context context) {
        if (!C11659h.m43403a().mo43726t3()) {
            SharedPreferences sharedPreferencesM42422U = C11295a1.m42422U(context);
            if (sharedPreferencesM42422U.getBoolean("flag_task_scheduled", false)) {
                AbstractC12719p0.m47392h(context).mo47394a("fetch_flags");
                sharedPreferencesM42422U.edit().putBoolean("flag_task_scheduled", false).apply();
            }
            return;
        }
        AbstractC12719p0 abstractC12719p0M47392h = AbstractC12719p0.m47392h(context);
        SharedPreferences.Editor editorEdit = C11295a1.m42422U(context).edit();
        editorEdit.putLong("last_startup_time", System.currentTimeMillis());
        editorEdit.putBoolean("flag_task_scheduled", true);
        editorEdit.apply();
        C12694d c12694dM47345a = new C12694d.a().m47346b(EnumC12734x.CONNECTED).m47348d(false).m47347c(true).m47350f(false).m47349e(false).m47345a();
        long jMo43409A4 = C11659h.m43403a().mo43409A4();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        C12701g0 c12701g0M47409b = new C12701g0.a(FlagFetchWorker.class, jMo43409A4, timeUnit, C11659h.m43403a().mo43731u1(), timeUnit).m47408a("fetch_flags").m47416k(c12694dM47345a).m47414i(EnumC12688a.EXPONENTIAL, 60L, TimeUnit.SECONDS).m47409b();
        C6124q.m27060e("fetch_flags", "requested periodic work");
        abstractC12719p0M47392h.mo47398e("fetch_flags", EnumC12704i.REPLACE, c12701g0M47409b);
    }

    /* JADX INFO: renamed from: h */
    public static void m15700h() {
        LoggingProtocol.m15999l("fetch_flag_begin", Long.valueOf(f12336e));
    }

    /* JADX INFO: renamed from: i */
    public static synchronized InterfaceFutureC9440x<C3273b.b> m15701i(Context context) {
        InterfaceFutureC9440x<C3273b.b> interfaceFutureC9440x = f12333b;
        if (interfaceFutureC9440x != null && f12334c) {
            f12334c = false;
            return interfaceFutureC9440x;
        }
        InterfaceFutureC9440x<C3273b.b> interfaceFutureC9440xM15702j = m15702j(context);
        f12333b = interfaceFutureC9440xM15702j;
        return interfaceFutureC9440xM15702j;
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceFutureC9440x<C3273b.b> m15702j(final Context context) {
        final C9418e0 c9418e0M37204H = C9418e0.m37204H();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ak.i
            @Override // java.lang.Runnable
            public final void run() {
                C3272a.m15693a(context, c9418e0M37204H);
            }
        });
        return c9418e0M37204H;
    }

    /* JADX INFO: renamed from: k */
    public static void m15703k(Context context) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(C11295a1.m42404L(context).getString("AndroidAppSettingsCache", "{}"));
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        m15691H(jSONObject, 1);
    }

    /* JADX INFO: renamed from: l */
    public static void m15704l(Context context) {
        JSONObject jSONObjectM37329b = C9475a.m37329b(context);
        if (jSONObjectM37329b != null && jSONObjectM37329b.length() > 0) {
            m15691H(jSONObjectM37329b, 2);
        }
        m15692I("fetch");
        ClientLocalFlags localFlags = NativeGLInterface.readLocalFlags();
        JSONObject all = localFlags.getAll();
        if (!localFlags.isEmpty()) {
            C6124q.m27057b("AndroidAppSettings", "localFlags size:" + localFlags.size());
            m15691H(all, 3);
        }
        JSONObject jSONObject = null;
        if (C9476b.m37333a()) {
            String strM46736h = new C12476a(context).m46736h();
            if (!TextUtils.isEmpty(strM46736h)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strM46736h);
                    try {
                        m15691H(jSONObject2, 3);
                        jSONObject = jSONObject2;
                    } catch (JSONException e10) {
                        e = e10;
                        jSONObject = jSONObject2;
                        C6124q.m27058c("AndroidAppSettings", "Failed to parse external dev app settings JSON", e);
                    }
                } catch (JSONException e11) {
                    e = e11;
                }
            }
        }
        if (C9476b.m37333a()) {
            JSONObject jSONObject3 = new JSONObject();
            f12341j = jSONObject3;
            C6122o.m27047a(jSONObject3, jSONObjectM37329b);
            C6122o.m27047a(f12341j, all);
            C6122o.m27047a(f12341j, jSONObject);
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m15705m() {
        return f12332a.get() == b.ENGINE_FLAG_LOADED;
    }

    /* JADX INFO: renamed from: n */
    public static void m15706n() {
        if (C11659h.m43403a().mo43557W0()) {
            f12342k.m15719a();
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m15707o() {
        JSONObject jSONObject = f12341j;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    /* JADX INFO: renamed from: p */
    public static String m15708p(JSONObject jSONObject, String str, C3187a c3187a) {
        return C9475a.m37330c(jSONObject, str, c3187a);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m15709q(C3273b.b bVar) {
        return bVar == null || bVar.m15739d() == null || bVar.m15739d().isEmpty();
    }

    /* JADX INFO: renamed from: r */
    public static void m15710r() {
        C0347x c0347xM1349m = C0347x.m1349m();
        synchronized (f12337f) {
            try {
                if (!Native.isLoaded()) {
                    EnumC0307k2 enumC0307k2 = EnumC0307k2.ZSTD;
                    if (!c0347xM1349m.m1360n(enumC0307k2).isDone()) {
                        Native.load();
                        ZstdInputStream zstdInputStream = new ZstdInputStream(new ByteArrayInputStream(new byte[]{40, -75, 47, -3, 32, 11, 89, 0, 0, 84, 101, 115, 116, 105, 110, 103, 32, 49, 50, 51}));
                        try {
                            String str = new String(C7572d.m31371d(zstdInputStream), StandardCharsets.UTF_8);
                            zstdInputStream.setDict(new byte[0]);
                            c0347xM1349m.m1356G(enumC0307k2, "Testing 123".equals(str));
                            zstdInputStream.close();
                        } catch (Throwable th2) {
                            try {
                                zstdInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                }
            } catch (Exception e10) {
                C6124q.m27061f("AndroidAppSettings", "Failed to initialize ZSTD library", e10);
                c0347xM1349m.m1356G(EnumC0307k2.ZSTD, false);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m15711s(Context context) {
        m15703k(context);
        m15704l(context);
    }

    /* JADX INFO: renamed from: t */
    public static void m15712t() {
        String strM42668e;
        try {
            synchronized (f12337f) {
                try {
                    m15710r();
                    if (!f12340i) {
                        m15687D();
                        System.loadLibrary(f12335d);
                        if (C11659h.m43403a().mo43644h5() && (strM42668e = C11377b.m42668e(RobloxApplication.m14834f(), "robloxwebrtc", "android_app_settings")) != null) {
                            WebRtcLoader.initialize(strM42668e);
                        }
                        f12340i = true;
                        C0347x.m1349m().m1356G(EnumC0307k2.ROBLOX, true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (UnsatisfiedLinkError e10) {
            C6124q.m27063h("AndroidAppSettings", e10.getLocalizedMessage());
        }
    }

    /* JADX INFO: renamed from: u */
    public static C3273b.b m15713u() {
        Context contextM14834f;
        try {
            C3273b.b bVar = f12333b.get();
            if (C11659h.m43403a().mo43513P4() && m15709q(bVar) && (contextM14834f = RobloxApplication.m14834f()) != null) {
                C6124q.m27066k("AndroidAppSettings", "Initial prefetch returned empty; retrying before popping.");
                LoggingProtocol.m15994g("automatic_retry_applied");
                C3273b.b bVarM15723b = C3273b.m15723b(contextM14834f);
                if (m15709q(bVarM15723b)) {
                    C6124q.m27060e("AndroidAppSettings", "popFetchedResponse retry still returned empty.");
                    LoggingProtocol.m15994g("flag_fetch_retry_empty_payload");
                } else {
                    m15688E(bVarM15723b, contextM14834f);
                    FlagCacheUtils.storePendingVersionBWrite(bVarM15723b, contextM14834f);
                    bVar = bVarM15723b;
                }
            }
            f12333b = null;
            return bVar;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m15714v(final Context context) {
        f12333b = m15701i(context);
        f12332a.set(b.PREFETCHED);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ak.f
            @Override // java.lang.Runnable
            public final void run() {
                C3272a.m15695c(context);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public static void m15715w() {
        f12336e = SystemClock.elapsedRealtime();
    }

    /* JADX INFO: renamed from: x */
    public static void m15716x() {
        LoggingProtocol.m15998k("fetch_flag_end");
    }

    /* JADX INFO: renamed from: y */
    public static void m15717y(boolean z10) {
        if (z10) {
            LoggingProtocol.m15998k("fastflag_load_success");
        } else {
            LoggingProtocol.m15998k("fastflag_load_failure");
        }
    }

    /* JADX INFO: renamed from: z */
    public static synchronized void m15718z(final Context context) {
        b bVar = f12332a.get();
        if (bVar != b.UNINITIALIZED && bVar != b.PREFETCHED) {
            f12333b = C9435s.m37268m(f12333b, new InterfaceC9425i() { // from class: ak.e
                @Override // ne.InterfaceC9425i
                public final InterfaceFutureC9440x apply(Object obj) {
                    return C3272a.m15696d(context, (C3273b.b) obj);
                }
            }, C7975b.m33011i(context));
        }
    }
}
