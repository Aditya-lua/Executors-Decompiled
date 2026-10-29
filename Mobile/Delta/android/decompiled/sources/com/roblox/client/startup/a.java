package com.roblox.client.startup;

import ak.k2;
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
import com.google.mlkit.vision.barcode.common.Barcode;
import com.roblox.client.RobloxApplication;
import com.roblox.client.scheduledwork.FlagFetchWorker;
import com.roblox.client.scheduledwork.OtaConfigHandler;
import com.roblox.client.scheduledwork.OtaPollingWorker;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.model.ClientLocalFlags;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.webrtc.WebRtcLoader;
import ei.s;
import gk.n;
import gk.p;
import gk.v;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import me.e0;
import me.x;
import org.json.JSONException;
import org.json.JSONObject;
import p1.t;
import sg.a1;
import th.f;
import th.h;
import th.i;
import vg.g;
import wk.j;
import x5.g0;
import x5.p0;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static x<com.roblox.client.startup.b.C0149b> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicReference<b> f9458a = new AtomicReference<>(b.UNINITIALIZED);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f9459c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f9460d = "roblox";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f9461e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9462f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f9463g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f9464h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9465i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static JSONObject f9466j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0148a f9467k = new C0148a();

    /* JADX INFO: renamed from: com.roblox.client.startup.a$a, reason: collision with other inner class name */
    public static class C0148a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f9468a;
        public final Handler b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f9469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f9470d;

        public void a() {
            if (this.f9470d.getAndSet(true)) {
                return;
            }
            this.b.removeCallbacks(this.f9469c);
            if (this.f9468a == null) {
                return;
            }
            a1.L(RobloxApplication.f()).edit().putString("AndroidAppSettingsCache", this.f9468a.toString()).apply();
            this.f9468a = null;
        }

        public synchronized void b(JSONObject jSONObject) {
            this.f9468a = jSONObject;
            this.b.removeCallbacks(this.f9469c);
            this.b.postDelayed(this.f9469c, h.a().J2());
        }

        public C0148a() {
            this.b = new Handler(Looper.getMainLooper());
            this.f9469c = new Runnable() { // from class: ak.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f587a.a();
                }
            };
            this.f9470d = new AtomicBoolean(false);
        }
    }

    public enum b {
        UNINITIALIZED,
        PREFETCHED,
        REQUEST_SENT,
        ENGINE_FLAG_LOADED
    }

    public static void A(e0<com.roblox.client.startup.b.C0149b> e0Var, com.roblox.client.startup.b.C0149b c0149b, Context context) {
        E(c0149b, context);
        h();
        x();
        e0Var.D(c0149b);
        if (j.c() instanceof s) {
            ((s) j.c()).k();
        }
    }

    public static void B(Context context) {
        com.roblox.client.flags.b.f9037a.f(a1.U(context));
        f9458a.set(b.ENGINE_FLAG_LOADED);
        if (h.a().x1()) {
            Iterator<String> it = OtaConfigHandler.getActiveBehaviorNames(OtaConfigHandler.getOtaPrefs(context)).iterator();
            while (it.hasNext()) {
                OtaConfigHandler.checkAndPromoteWorkerBlob(context, it.next());
            }
        }
        OtaPollingWorker.w(context);
    }

    public static void C(String str) {
        f9460d = str;
    }

    public static void D() {
        int i10;
        try {
            i iVarA = h.a();
            if (!iVarA.S() || Process.is64Bit()) {
                return;
            }
            if (iVarA.Q2()) {
                i10 = Barcode.FORMAT_UPC_A;
            } else if (iVarA.i()) {
                i10 = 768;
            } else {
                i10 = iVarA.m2() ? Barcode.FORMAT_UPC_E : 0;
            }
            if (i10 != 0) {
                Os.setenv("MIMALLOC_RESERVE_OS_MEMORY", i10 + "M", true);
            }
            if (iVarA.H3()) {
                Os.setenv("MIMALLOC_DISALLOW_OS_ALLOC", "1", true);
                Os.setenv("MIMALLOC_LIMIT_OS_ALLOC", "1", true);
            }
            if (iVarA.Y1()) {
                Os.setenv("MIMALLOC_EAGER_COMMIT", "0", true);
            }
            if (iVarA.c3()) {
                Os.setenv("MIMALLOC_ARENA_EAGER_COMMIT", "0", true);
            }
        } catch (ErrnoException e10) {
            p.k("AndroidAppSettings", "tuneMimalloc failed " + e10.getMessage());
        }
    }

    public static boolean E(com.roblox.client.startup.b.C0149b c0149b, Context context) {
        JSONObject jSONObjectC = c0149b.c();
        boolean z10 = false;
        if (jSONObjectC != null) {
            boolean zH = H(jSONObjectC, 1);
            G(context, jSONObjectC, false);
            f9464h.set(zH);
            y(zH);
            z10 = zH;
        } else {
            k(context);
        }
        l(context);
        f.f31815a.h(a1.U(context));
        g.a(context);
        return z10;
    }

    public static void F(String str, Context context) {
        JSONObject jSONObjectA = com.roblox.client.startup.b.C0149b.a(str);
        if (jSONObjectA != null) {
            G(context, jSONObjectA, true);
            H(jSONObjectA, 1);
        } else {
            k(context);
        }
        l(context);
        f.f31815a.h(a1.U(context));
        g.a(context);
    }

    public static void G(final Context context, final JSONObject jSONObject, boolean z10) {
        if (!z10 && h.a().S0() && v.a(context).equals("foreground")) {
            f9467k.b(jSONObject);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ak.g
                @Override // java.lang.Runnable
                public final void run() {
                    sg.a1.L(context.getApplicationContext()).edit().putString("AndroidAppSettingsCache", jSONObject.toString()).apply();
                }
            });
        }
    }

    public static boolean H(JSONObject jSONObject, int i10) {
        Object objValueOf;
        boolean z10 = false;
        for (Map.Entry<String, com.roblox.client.flags.a> entry : h.a().M3()) {
            String key = entry.getKey();
            com.roblox.client.flags.a value = entry.getValue();
            String strP = p(jSONObject, key, value);
            if (strP != null) {
                try {
                    if ((value instanceof com.roblox.client.flags.a.C0137a) || (value instanceof com.roblox.client.flags.a.d)) {
                        objValueOf = Boolean.valueOf(jSONObject.getBoolean(strP));
                    } else if (value instanceof com.roblox.client.flags.a.c) {
                        objValueOf = Long.valueOf(jSONObject.getLong(strP));
                    } else {
                        objValueOf = ((value instanceof com.roblox.client.flags.a.b) || (value instanceof com.roblox.client.flags.a.f)) ? Integer.valueOf(jSONObject.getInt(strP)) : jSONObject.getString(strP);
                    }
                    value.f(objValueOf, i10);
                    z10 = true;
                } catch (JSONException unused) {
                    value.c(i10);
                    p.k("AndroidAppSettings", "Error reading value for setting: " + key);
                }
            } else {
                value.c(i10);
            }
        }
        return z10;
    }

    public static void I(String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        t();
        LoggingProtocol.l("native_lib_wait_" + str + "_begin", Long.valueOf(jElapsedRealtime));
        LoggingProtocol.k("native_lib_wait_" + str + "_end");
    }

    public static /* synthetic */ void a(final Context context, final e0 e0Var) {
        t.a(f9458a, b.PREFETCHED, b.REQUEST_SENT);
        w();
        LoggingProtocol.k("vb_flag_enabled");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ak.j
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.b(context, atomicBoolean, e0Var);
            }
        });
        com.roblox.client.startup.b.C0149b c0149bB = com.roblox.client.startup.b.b(context);
        if (atomicBoolean.compareAndSet(false, true)) {
            p.h("AndroidAppSettings", "[VersionB] Network won the race.");
            A(e0Var, c0149bB, context);
        } else {
            p.h("AndroidAppSettings", "[VersionB] Network fetch complete; cache already won.");
        }
        FlagCacheUtils.storePendingVersionBWrite(c0149bB, context);
    }

    public static /* synthetic */ void b(Context context, AtomicBoolean atomicBoolean, e0 e0Var) {
        try {
            com.roblox.client.startup.b.C0149b c0149bTryLoadVersionBCache = FlagCacheUtils.tryLoadVersionBCache(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c0149bTryLoadVersionBCache == null) {
                String lastCacheOutcomeValue = FlagCacheUtils.getLastCacheOutcomeValue();
                LoggingProtocol.l("vb_cache_" + lastCacheOutcomeValue, Long.valueOf(jElapsedRealtime));
                p.h("AndroidAppSettings", "[VersionB] Cache miss (" + lastCacheOutcomeValue + "); waiting for network.");
                return;
            }
            if (!atomicBoolean.compareAndSet(false, true)) {
                LoggingProtocol.l("vb_network_faster", Long.valueOf(jElapsedRealtime));
                p.h("AndroidAppSettings", "[VersionB] Cache hit, but network already won.");
                FlagCacheUtils.recordVersionBCacheOutcome(FlagCacheUtils.a.MISS_NETWORK_WON);
            } else {
                LoggingProtocol.l("vb_cache_applied", Long.valueOf(jElapsedRealtime));
                if (h.a().n3()) {
                    LoggingProtocol.l(FlagCacheUtils.wasVersionBCacheWrittenByWorker(context) ? "vb_cache_source_worker" : "vb_cache_source_previous_launch", Long.valueOf(jElapsedRealtime));
                }
                p.h("AndroidAppSettings", "[VersionB] Cache won the race.");
                FlagCacheUtils.recordVersionBCacheOutcome(FlagCacheUtils.a.SUCCESS);
                A(e0Var, c0149bTryLoadVersionBCache, context);
            }
        } catch (Exception e10) {
            p.f("AndroidAppSettings", "Failed to read cache", e10);
        }
    }

    public static /* synthetic */ void c(Context context) {
        boolean zF0 = h.a().f0();
        if (zF0) {
            LoggingProtocol.k("cookie_manager_init_begin");
        }
        j.c();
        if (zF0) {
            LoggingProtocol.k("cookie_manager_init_end");
        }
        gk.c.g().f(context, new gk.a.InterfaceC0327a() { // from class: ak.h
            @Override // gk.a.InterfaceC0327a
            public final void a(String str) {
                gk.c.f18233c.D(str);
            }
        });
    }

    public static /* synthetic */ x d(Context context, com.roblox.client.startup.b.C0149b c0149b) {
        f.f31815a.q();
        return j(context);
    }

    public static synchronized void g(Context context) {
        if (!h.a().n3()) {
            SharedPreferences sharedPreferencesU = a1.U(context);
            if (sharedPreferencesU.getBoolean("flag_task_scheduled", false)) {
                p0.h(context).a("fetch_flags");
                sharedPreferencesU.edit().putBoolean("flag_task_scheduled", false).apply();
            }
            return;
        }
        p0 p0VarH = p0.h(context);
        SharedPreferences.Editor editorEdit = a1.U(context).edit();
        editorEdit.putLong("last_startup_time", System.currentTimeMillis());
        editorEdit.putBoolean("flag_task_scheduled", true);
        editorEdit.apply();
        x5.d dVarA = new x5.d.a().b(x5.x.CONNECTED).d(false).c(true).f(false).e(false).a();
        long jV4 = h.a().v4();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        g0 g0VarB = new g0.a(FlagFetchWorker.class, jV4, timeUnit, h.a().p1(), timeUnit).a("fetch_flags").k(dVarA).i(x5.a.EXPONENTIAL, 60L, TimeUnit.SECONDS).b();
        p.e("fetch_flags", "requested periodic work");
        p0VarH.e("fetch_flags", x5.i.REPLACE, g0VarB);
    }

    public static void h() {
        LoggingProtocol.l("fetch_flag_begin", Long.valueOf(f9461e));
    }

    public static synchronized x<com.roblox.client.startup.b.C0149b> i(Context context) {
        x<com.roblox.client.startup.b.C0149b> xVar = b;
        if (xVar != null && f9459c) {
            f9459c = false;
            return xVar;
        }
        x<com.roblox.client.startup.b.C0149b> xVarJ = j(context);
        b = xVarJ;
        return xVarJ;
    }

    public static x<com.roblox.client.startup.b.C0149b> j(final Context context) {
        final e0 e0VarH = e0.H();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ak.i
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.a(context, e0VarH);
            }
        });
        return e0VarH;
    }

    public static void k(Context context) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(a1.L(context).getString("AndroidAppSettingsCache", "{}"));
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
        }
        H(jSONObject, 1);
    }

    public static void l(Context context) {
        JSONObject jSONObjectB = nh.a.b(context);
        if (jSONObjectB != null && jSONObjectB.length() > 0) {
            H(jSONObjectB, 2);
        }
        I("fetch");
        ClientLocalFlags localFlags = NativeGLInterface.readLocalFlags();
        JSONObject all = localFlags.getAll();
        if (!localFlags.isEmpty()) {
            p.b("AndroidAppSettings", "localFlags size:" + localFlags.size());
            H(all, 3);
        }
        JSONObject jSONObject = null;
        if (nh.b.a()) {
            String strH = new wj.a(context).h();
            if (!TextUtils.isEmpty(strH)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strH);
                    try {
                        H(jSONObject2, 3);
                        jSONObject = jSONObject2;
                    } catch (JSONException e10) {
                        e = e10;
                        jSONObject = jSONObject2;
                        p.c("AndroidAppSettings", "Failed to parse external dev app settings JSON", e);
                    }
                } catch (JSONException e11) {
                    e = e11;
                }
            }
        }
        if (nh.b.a()) {
            JSONObject jSONObject3 = new JSONObject();
            f9466j = jSONObject3;
            n.a(jSONObject3, jSONObjectB);
            n.a(f9466j, all);
            n.a(f9466j, jSONObject);
        }
    }

    public static boolean m() {
        return f9458a.get() == b.ENGINE_FLAG_LOADED;
    }

    public static void n() {
        if (h.a().S0()) {
            f9467k.a();
        }
    }

    public static String o() {
        JSONObject jSONObject = f9466j;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public static String p(JSONObject jSONObject, String str, com.roblox.client.flags.a aVar) {
        return nh.a.c(jSONObject, str, aVar);
    }

    public static boolean q(com.roblox.client.startup.b.C0149b c0149b) {
        return c0149b == null || c0149b.d() == null || c0149b.d().isEmpty();
    }

    public static void r() {
        ak.x xVarM = ak.x.m();
        synchronized (f9462f) {
            try {
                if (!Native.isLoaded()) {
                    k2 k2Var = k2.ZSTD;
                    if (!xVarM.n(k2Var).isDone()) {
                        Native.load();
                        ZstdInputStream zstdInputStream = new ZstdInputStream(new ByteArrayInputStream(new byte[]{40, -75, 47, -3, 32, 11, 89, 0, 0, 84, 101, 115, 116, 105, 110, 103, 32, 49, 50, 51}));
                        try {
                            String str = new String(je.d.d(zstdInputStream), StandardCharsets.UTF_8);
                            zstdInputStream.setDict(new byte[0]);
                            xVarM.G(k2Var, "Testing 123".equals(str));
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
                p.f("AndroidAppSettings", "Failed to initialize ZSTD library", e10);
                xVarM.G(k2.ZSTD, false);
            }
        }
    }

    public static void s(Context context) {
        k(context);
        l(context);
    }

    public static void t() {
        String strE;
        try {
            synchronized (f9462f) {
                try {
                    r();
                    if (!f9465i) {
                        D();
                        System.loadLibrary(f9460d);
                        if (h.a().b5() && (strE = sh.b.e(RobloxApplication.f(), "robloxwebrtc", "android_app_settings")) != null) {
                            WebRtcLoader.initialize(strE);
                        }
                        f9465i = true;
                        ak.x.m().G(k2.ROBLOX, true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (UnsatisfiedLinkError e10) {
            p.h("AndroidAppSettings", e10.getLocalizedMessage());
        }
    }

    public static com.roblox.client.startup.b.C0149b u() {
        Context contextF;
        try {
            com.roblox.client.startup.b.C0149b c0149b = b.get();
            if (h.a().J4() && q(c0149b) && (contextF = RobloxApplication.f()) != null) {
                p.k("AndroidAppSettings", "Initial prefetch returned empty; retrying before popping.");
                LoggingProtocol.g("automatic_retry_applied");
                com.roblox.client.startup.b.C0149b c0149bB = com.roblox.client.startup.b.b(contextF);
                if (q(c0149bB)) {
                    p.e("AndroidAppSettings", "popFetchedResponse retry still returned empty.");
                    LoggingProtocol.g("flag_fetch_retry_empty_payload");
                } else {
                    E(c0149bB, contextF);
                    FlagCacheUtils.storePendingVersionBWrite(c0149bB, contextF);
                    c0149b = c0149bB;
                }
            }
            b = null;
            return c0149b;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void v(final Context context) {
        b = i(context);
        f9458a.set(b.PREFETCHED);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ak.f
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.c(context);
            }
        });
    }

    public static void w() {
        f9461e = SystemClock.elapsedRealtime();
    }

    public static void x() {
        LoggingProtocol.k("fetch_flag_end");
    }

    public static void y(boolean z10) {
        if (z10) {
            LoggingProtocol.k("fastflag_load_success");
        } else {
            LoggingProtocol.k("fastflag_load_failure");
        }
    }

    public static synchronized void z(final Context context) {
        b bVar = f9458a.get();
        if (bVar != b.UNINITIALIZED && bVar != b.PREFETCHED) {
            b = me.s.m(b, new me.i() { // from class: ak.e
                @Override // me.i
                public final me.x apply(Object obj) {
                    return com.roblox.client.startup.a.d(context, (com.roblox.client.startup.b.C0149b) obj);
                }
            }, l2.b.i(context));
        }
    }
}
