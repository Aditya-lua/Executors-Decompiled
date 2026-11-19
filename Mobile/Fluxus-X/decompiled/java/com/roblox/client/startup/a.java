package com.roblox.client.startup;

import ai.k;
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
import bh.a1;
import bi.f;
import bi.h;
import bi.i;
import com.github.luben.zstd.BuildConfig;
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
import dl.j;
import ik.q2;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mi.s;
import ok.o;
import ok.q;
import ok.w;
import org.json.JSONException;
import org.json.JSONObject;
import p1.t;
import pe.e0;
import pe.x;
import y5.g0;
import y5.p0;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static x<com.roblox.client.startup.b.C0155b> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicReference<b> f9359a = new AtomicReference<>(b.UNINITIALIZED);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f9360c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f9361d = "roblox";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f9362e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9363f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f9364g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f9365h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9366i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static JSONObject f9367j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0154a f9368k = new C0154a();

    /* JADX INFO: renamed from: com.roblox.client.startup.a$a, reason: collision with other inner class name */
    public static class C0154a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f9369a;
        public final Handler b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f9370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f9371d;

        public void a() {
            if (this.f9371d.getAndSet(true)) {
                return;
            }
            this.b.removeCallbacks(this.f9370c);
            if (this.f9369a == null) {
                return;
            }
            a1.L(RobloxApplication.f()).edit().putString("AndroidAppSettingsCache", this.f9369a.toString()).apply();
            this.f9369a = null;
        }

        public synchronized void b(JSONObject jSONObject) {
            this.f9369a = jSONObject;
            this.b.removeCallbacks(this.f9370c);
            this.b.postDelayed(this.f9370c, h.a().W2());
        }

        public C0154a() {
            this.b = new Handler(Looper.getMainLooper());
            this.f9370c = new Runnable() { // from class: ik.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19529a.a();
                }
            };
            this.f9371d = new AtomicBoolean(false);
        }
    }

    public enum b {
        UNINITIALIZED,
        PREFETCHED,
        REQUEST_SENT,
        ENGINE_FLAG_LOADED
    }

    public static void A(e0<com.roblox.client.startup.b.C0155b> e0Var, com.roblox.client.startup.b.C0155b c0155b, Context context) {
        E(c0155b, context);
        h();
        x();
        e0Var.D(c0155b);
        if (j.e() instanceof s) {
            ((s) j.e()).m();
        }
    }

    public static void B(Context context) {
        com.roblox.client.flags.b.f8926a.f(a1.U(context));
        f9359a.set(b.ENGINE_FLAG_LOADED);
        if (h.a().G1()) {
            Iterator<String> it = OtaConfigHandler.getActiveBehaviorNames(OtaConfigHandler.getOtaPrefs(context)).iterator();
            while (it.hasNext()) {
                OtaConfigHandler.checkAndPromoteWorkerBlob(context, it.next());
            }
        }
        OtaPollingWorker.B(context);
    }

    public static void C(String str) {
        f9361d = str;
    }

    public static void D() {
        int i10;
        try {
            i iVarA = h.a();
            if (!iVarA.W() || Process.is64Bit()) {
                return;
            }
            if (iVarA.d3()) {
                i10 = Barcode.FORMAT_UPC_A;
            } else if (iVarA.k()) {
                i10 = 768;
            } else {
                i10 = iVarA.z2() ? Barcode.FORMAT_UPC_E : 0;
            }
            if (i10 != 0) {
                Os.setenv("MIMALLOC_RESERVE_OS_MEMORY", i10 + "M", true);
            }
            if (iVarA.X3()) {
                Os.setenv("MIMALLOC_DISALLOW_OS_ALLOC", "1", true);
                Os.setenv("MIMALLOC_LIMIT_OS_ALLOC", "1", true);
            }
            if (iVarA.k2()) {
                Os.setenv("MIMALLOC_EAGER_COMMIT", "0", true);
            }
            if (iVarA.o3()) {
                Os.setenv("MIMALLOC_ARENA_EAGER_COMMIT", "0", true);
            }
        } catch (ErrnoException e10) {
            q.k("AndroidAppSettings", "tuneMimalloc failed " + e10.getMessage());
        }
    }

    public static boolean E(com.roblox.client.startup.b.C0155b c0155b, Context context) {
        JSONObject jSONObjectC = c0155b.c();
        boolean z10 = false;
        if (jSONObjectC != null) {
            boolean zH = H(jSONObjectC, 1);
            G(context, jSONObjectC, false);
            f9365h.set(zH);
            y(zH);
            z10 = zH;
        } else {
            k(context);
        }
        l(context);
        f.f4423a.h(a1.U(context));
        eh.h.a(context);
        return z10;
    }

    public static void F(String str, Context context) {
        JSONObject jSONObjectA = com.roblox.client.startup.b.C0155b.a(str);
        if (jSONObjectA != null) {
            G(context, jSONObjectA, true);
            H(jSONObjectA, 1);
        } else {
            k(context);
        }
        l(context);
        f.f4423a.h(a1.U(context));
        eh.h.a(context);
    }

    public static void G(final Context context, final JSONObject jSONObject, boolean z10) {
        if (!z10 && h.a().b1() && w.a(context).equals("foreground")) {
            f9368k.b(jSONObject);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ik.g
                @Override // java.lang.Runnable
                public final void run() {
                    bh.a1.L(context.getApplicationContext()).edit().putString("AndroidAppSettingsCache", jSONObject.toString()).apply();
                }
            });
        }
    }

    public static boolean H(JSONObject jSONObject, int i10) {
        Object objValueOf;
        boolean z10 = false;
        for (Map.Entry<String, com.roblox.client.flags.a> entry : h.a().b4()) {
            String key = entry.getKey();
            com.roblox.client.flags.a value = entry.getValue();
            String strP = p(jSONObject, key, value);
            if (strP != null) {
                try {
                    if ((value instanceof com.roblox.client.flags.a.C0143a) || (value instanceof com.roblox.client.flags.a.d)) {
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
                    q.k("AndroidAppSettings", "Error reading value for setting: " + key);
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
        t.a(f9359a, b.PREFETCHED, b.REQUEST_SENT);
        w();
        LoggingProtocol.k("vb_flag_enabled");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ik.j
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.b(context, atomicBoolean, e0Var);
            }
        });
        com.roblox.client.startup.b.C0155b c0155bB = com.roblox.client.startup.b.b(context);
        if (atomicBoolean.compareAndSet(false, true)) {
            q.h("AndroidAppSettings", "[VersionB] Network won the race.");
            A(e0Var, c0155bB, context);
        } else {
            q.h("AndroidAppSettings", "[VersionB] Network fetch complete; cache already won.");
        }
        FlagCacheUtils.storePendingVersionBWrite(c0155bB, context);
    }

    public static /* synthetic */ void b(Context context, AtomicBoolean atomicBoolean, e0 e0Var) {
        try {
            com.roblox.client.startup.b.C0155b c0155bTryLoadVersionBCache = FlagCacheUtils.tryLoadVersionBCache(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c0155bTryLoadVersionBCache == null) {
                String lastCacheOutcomeValue = FlagCacheUtils.getLastCacheOutcomeValue();
                LoggingProtocol.l("vb_cache_" + lastCacheOutcomeValue, Long.valueOf(jElapsedRealtime));
                q.h("AndroidAppSettings", "[VersionB] Cache miss (" + lastCacheOutcomeValue + "); waiting for network.");
                return;
            }
            if (!atomicBoolean.compareAndSet(false, true)) {
                LoggingProtocol.l("vb_network_faster", Long.valueOf(jElapsedRealtime));
                q.h("AndroidAppSettings", "[VersionB] Cache hit, but network already won.");
                FlagCacheUtils.recordVersionBCacheOutcome(FlagCacheUtils.a.MISS_NETWORK_WON);
            } else {
                LoggingProtocol.l("vb_cache_applied", Long.valueOf(jElapsedRealtime));
                if (h.a().A3()) {
                    LoggingProtocol.l(FlagCacheUtils.wasVersionBCacheWrittenByWorker(context) ? "vb_cache_source_worker" : "vb_cache_source_previous_launch", Long.valueOf(jElapsedRealtime));
                }
                q.h("AndroidAppSettings", "[VersionB] Cache won the race.");
                FlagCacheUtils.recordVersionBCacheOutcome(FlagCacheUtils.a.SUCCESS);
                A(e0Var, c0155bTryLoadVersionBCache, context);
            }
        } catch (Exception e10) {
            q.f("AndroidAppSettings", "Failed to read cache", e10);
        }
    }

    public static /* synthetic */ void c(Context context) {
        boolean zM0 = h.a().m0();
        if (zM0) {
            LoggingProtocol.k("cookie_manager_init_begin");
        }
        j.e();
        if (zM0) {
            LoggingProtocol.k("cookie_manager_init_end");
        }
        ok.c.g().f(context, new ok.a.InterfaceC0545a() { // from class: ik.h
            @Override // ok.a.InterfaceC0545a
            public final void a(String str) {
                ok.c.f28244c.D(str);
            }
        });
    }

    public static /* synthetic */ x d(Context context, com.roblox.client.startup.b.C0155b c0155b) {
        f.f4423a.q();
        return j(context);
    }

    public static synchronized void g(Context context) {
        if (!h.a().A3()) {
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
        y5.d dVarA = new y5.d.a().b(y5.x.CONNECTED).d(false).c(true).f(false).e(false).a();
        long jI4 = h.a().I4();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        g0 g0VarB = new g0.a(FlagFetchWorker.class, jI4, timeUnit, h.a().y1(), timeUnit).a("fetch_flags").k(dVarA).i(y5.a.EXPONENTIAL, 60L, TimeUnit.SECONDS).b();
        q.e("fetch_flags", "requested periodic work");
        p0VarH.e("fetch_flags", y5.i.REPLACE, g0VarB);
    }

    public static void h() {
        LoggingProtocol.l("fetch_flag_begin", Long.valueOf(f9362e));
    }

    public static synchronized x<com.roblox.client.startup.b.C0155b> i(Context context) {
        x<com.roblox.client.startup.b.C0155b> xVar = b;
        if (xVar != null && f9360c) {
            f9360c = false;
            return xVar;
        }
        x<com.roblox.client.startup.b.C0155b> xVarJ = j(context);
        b = xVarJ;
        return xVarJ;
    }

    public static x<com.roblox.client.startup.b.C0155b> j(final Context context) {
        final e0 e0VarH = e0.H();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ik.i
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
        JSONObject jSONObjectB = wh.a.b(context);
        if (jSONObjectB != null && jSONObjectB.length() > 0) {
            H(jSONObjectB, 2);
        }
        I("fetch");
        ClientLocalFlags localFlags = NativeGLInterface.readLocalFlags();
        JSONObject all = localFlags.getAll();
        if (!localFlags.isEmpty()) {
            q.b("AndroidAppSettings", "localFlags size:" + localFlags.size());
            H(all, 3);
        }
        JSONObject jSONObject = null;
        if (wh.b.a()) {
            String strH = new ek.a(context).h();
            if (!TextUtils.isEmpty(strH)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strH);
                    try {
                        H(jSONObject2, 3);
                        jSONObject = jSONObject2;
                    } catch (JSONException e10) {
                        e = e10;
                        jSONObject = jSONObject2;
                        q.c("AndroidAppSettings", "Failed to parse external dev app settings JSON", e);
                    }
                } catch (JSONException e11) {
                    e = e11;
                }
            }
        }
        if (wh.b.a()) {
            JSONObject jSONObject3 = new JSONObject();
            f9367j = jSONObject3;
            o.a(jSONObject3, jSONObjectB);
            o.a(f9367j, all);
            o.a(f9367j, jSONObject);
        }
    }

    public static boolean m() {
        return f9359a.get() == b.ENGINE_FLAG_LOADED;
    }

    public static void n() {
        if (h.a().b1()) {
            f9368k.a();
        }
    }

    public static String o() {
        JSONObject jSONObject = f9367j;
        return jSONObject == null ? BuildConfig.FLAVOR : jSONObject.toString();
    }

    public static String p(JSONObject jSONObject, String str, com.roblox.client.flags.a aVar) {
        return wh.a.c(jSONObject, str, aVar);
    }

    public static boolean q(com.roblox.client.startup.b.C0155b c0155b) {
        return c0155b == null || c0155b.d() == null || c0155b.d().isEmpty();
    }

    public static void r() {
        ik.x xVarM = ik.x.m();
        synchronized (f9363f) {
            try {
                if (!Native.isLoaded()) {
                    q2 q2Var = q2.ZSTD;
                    if (!xVarM.n(q2Var).isDone()) {
                        Native.load();
                        ZstdInputStream zstdInputStream = new ZstdInputStream(new ByteArrayInputStream(new byte[]{40, -75, 47, -3, 32, 11, 89, 0, 0, 84, 101, 115, 116, 105, 110, 103, 32, 49, 50, 51}));
                        try {
                            String str = new String(me.d.d(zstdInputStream), StandardCharsets.UTF_8);
                            zstdInputStream.setDict(new byte[0]);
                            xVarM.G(q2Var, "Testing 123".equals(str));
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
                q.f("AndroidAppSettings", "Failed to initialize ZSTD library", e10);
                xVarM.G(q2.ZSTD, false);
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
            synchronized (f9363f) {
                try {
                    r();
                    if (!f9366i) {
                        D();
                        System.loadLibrary(f9361d);
                        if (k.b() && (strE = ai.b.e(RobloxApplication.f(), "robloxwebrtc", "android_app_settings")) != null) {
                            WebRtcLoader.initialize(strE);
                        }
                        f9366i = true;
                        ik.x.m().G(q2.ROBLOX, true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (UnsatisfiedLinkError e10) {
            q.h("AndroidAppSettings", e10.getLocalizedMessage());
        }
    }

    public static com.roblox.client.startup.b.C0155b u() {
        Context contextF;
        try {
            com.roblox.client.startup.b.C0155b c0155b = b.get();
            if (h.a().W4() && q(c0155b) && (contextF = RobloxApplication.f()) != null) {
                q.k("AndroidAppSettings", "Initial prefetch returned empty; retrying before popping.");
                LoggingProtocol.g("automatic_retry_applied");
                com.roblox.client.startup.b.C0155b c0155bB = com.roblox.client.startup.b.b(contextF);
                if (q(c0155bB)) {
                    q.e("AndroidAppSettings", "popFetchedResponse retry still returned empty.");
                    LoggingProtocol.g("flag_fetch_retry_empty_payload");
                } else {
                    E(c0155bB, contextF);
                    FlagCacheUtils.storePendingVersionBWrite(c0155bB, contextF);
                    c0155b = c0155bB;
                }
            }
            b = null;
            return c0155b;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void v(final Context context) {
        b = i(context);
        f9359a.set(b.PREFETCHED);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: ik.f
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.c(context);
            }
        });
    }

    public static void w() {
        f9362e = SystemClock.elapsedRealtime();
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
        b bVar = f9359a.get();
        if (bVar != b.UNINITIALIZED && bVar != b.PREFETCHED) {
            b = pe.s.m(b, new pe.i() { // from class: ik.e
                @Override // pe.i
                public final pe.x apply(Object obj) {
                    return com.roblox.client.startup.a.d(context, (com.roblox.client.startup.b.C0155b) obj);
                }
            }, l2.b.i(context));
        }
    }
}
