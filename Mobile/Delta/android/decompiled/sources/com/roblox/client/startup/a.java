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
import ci.s;
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
import ek.o;
import ek.q;
import ek.w;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ne.e0;
import ne.x;
import org.json.JSONException;
import org.json.JSONObject;
import p1.t;
import rg.a1;
import rh.f;
import rh.h;
import rh.i;
import ug.g;
import uk.j;
import x5.g0;
import x5.p0;
import yj.k2;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static x<com.roblox.client.startup.b.C0152b> b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicReference<b> f9537a = new AtomicReference<>(b.UNINITIALIZED);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f9538c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f9539d = "roblox";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f9540e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f9541f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f9542g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f9543h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f9544i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static JSONObject f9545j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C0151a f9546k = new C0151a();

    /* JADX INFO: renamed from: com.roblox.client.startup.a$a, reason: collision with other inner class name */
    public static class C0151a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public JSONObject f9547a;
        public final Handler b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f9548c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f9549d;

        public void a() {
            if (this.f9549d.getAndSet(true)) {
                return;
            }
            this.b.removeCallbacks(this.f9548c);
            if (this.f9547a == null) {
                return;
            }
            a1.L(RobloxApplication.f()).edit().putString("AndroidAppSettingsCache", this.f9547a.toString()).apply();
            this.f9547a = null;
        }

        public synchronized void b(JSONObject jSONObject) {
            this.f9547a = jSONObject;
            this.b.removeCallbacks(this.f9548c);
            this.b.postDelayed(this.f9548c, h.a().U2());
        }

        public C0151a() {
            this.b = new Handler(Looper.getMainLooper());
            this.f9548c = new Runnable() { // from class: yj.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36731a.a();
                }
            };
            this.f9549d = new AtomicBoolean(false);
        }
    }

    public enum b {
        UNINITIALIZED,
        PREFETCHED,
        REQUEST_SENT,
        ENGINE_FLAG_LOADED
    }

    public static void A(e0<com.roblox.client.startup.b.C0152b> e0Var, com.roblox.client.startup.b.C0152b c0152b, Context context) {
        E(c0152b, context);
        h();
        x();
        e0Var.D(c0152b);
        if (j.c() instanceof s) {
            ((s) j.c()).k();
        }
    }

    public static void B(Context context) {
        com.roblox.client.flags.b.f9110a.f(a1.U(context));
        f9537a.set(b.ENGINE_FLAG_LOADED);
        if (h.a().H1()) {
            Iterator<String> it = OtaConfigHandler.getActiveBehaviorNames(OtaConfigHandler.getOtaPrefs(context)).iterator();
            while (it.hasNext()) {
                OtaConfigHandler.checkAndPromoteWorkerBlob(context, it.next());
            }
        }
        OtaPollingWorker.B(context);
    }

    public static void C(String str) {
        f9539d = str;
    }

    public static void D() {
        int i10;
        try {
            i iVarA = h.a();
            if (!iVarA.U() || Process.is64Bit()) {
                return;
            }
            if (iVarA.b3()) {
                i10 = Barcode.FORMAT_UPC_A;
            } else if (iVarA.k()) {
                i10 = 768;
            } else {
                i10 = iVarA.x2() ? Barcode.FORMAT_UPC_E : 0;
            }
            if (i10 != 0) {
                Os.setenv("MIMALLOC_RESERVE_OS_MEMORY", i10 + "M", true);
            }
            if (iVarA.T3()) {
                Os.setenv("MIMALLOC_DISALLOW_OS_ALLOC", "1", true);
                Os.setenv("MIMALLOC_LIMIT_OS_ALLOC", "1", true);
            }
            if (iVarA.j2()) {
                Os.setenv("MIMALLOC_EAGER_COMMIT", "0", true);
            }
            if (iVarA.m3()) {
                Os.setenv("MIMALLOC_ARENA_EAGER_COMMIT", "0", true);
            }
        } catch (ErrnoException e10) {
            q.k("AndroidAppSettings", "tuneMimalloc failed " + e10.getMessage());
        }
    }

    public static boolean E(com.roblox.client.startup.b.C0152b c0152b, Context context) {
        JSONObject jSONObjectC = c0152b.c();
        boolean z10 = false;
        if (jSONObjectC != null) {
            boolean zH = H(jSONObjectC, 1);
            G(context, jSONObjectC, false);
            f9543h.set(zH);
            y(zH);
            z10 = zH;
        } else {
            k(context);
        }
        l(context);
        f.f30722a.h(a1.U(context));
        g.a(context);
        return z10;
    }

    public static void F(String str, Context context) {
        JSONObject jSONObjectA = com.roblox.client.startup.b.C0152b.a(str);
        if (jSONObjectA != null) {
            G(context, jSONObjectA, true);
            H(jSONObjectA, 1);
        } else {
            k(context);
        }
        l(context);
        f.f30722a.h(a1.U(context));
        g.a(context);
    }

    public static void G(final Context context, final JSONObject jSONObject, boolean z10) {
        if (!z10 && h.a().Z0() && w.a(context).equals("foreground")) {
            f9546k.b(jSONObject);
        } else {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: yj.g
                @Override // java.lang.Runnable
                public final void run() {
                    rg.a1.L(context.getApplicationContext()).edit().putString("AndroidAppSettingsCache", jSONObject.toString()).apply();
                }
            });
        }
    }

    public static boolean H(JSONObject jSONObject, int i10) {
        Object objValueOf;
        boolean z10 = false;
        for (Map.Entry<String, com.roblox.client.flags.a> entry : h.a().X3()) {
            String key = entry.getKey();
            com.roblox.client.flags.a value = entry.getValue();
            String strP = p(jSONObject, key, value);
            if (strP != null) {
                try {
                    if ((value instanceof com.roblox.client.flags.a.C0140a) || (value instanceof com.roblox.client.flags.a.d)) {
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
        t.a(f9537a, b.PREFETCHED, b.REQUEST_SENT);
        w();
        LoggingProtocol.k("vb_flag_enabled");
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: yj.j
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.b(context, atomicBoolean, e0Var);
            }
        });
        com.roblox.client.startup.b.C0152b c0152bB = com.roblox.client.startup.b.b(context);
        if (atomicBoolean.compareAndSet(false, true)) {
            q.h("AndroidAppSettings", "[VersionB] Network won the race.");
            A(e0Var, c0152bB, context);
        } else {
            q.h("AndroidAppSettings", "[VersionB] Network fetch complete; cache already won.");
        }
        FlagCacheUtils.storePendingVersionBWrite(c0152bB, context);
    }

    public static /* synthetic */ void b(Context context, AtomicBoolean atomicBoolean, e0 e0Var) {
        try {
            com.roblox.client.startup.b.C0152b c0152bTryLoadVersionBCache = FlagCacheUtils.tryLoadVersionBCache(context);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (c0152bTryLoadVersionBCache == null) {
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
                if (h.a().x3()) {
                    LoggingProtocol.l(FlagCacheUtils.wasVersionBCacheWrittenByWorker(context) ? "vb_cache_source_worker" : "vb_cache_source_previous_launch", Long.valueOf(jElapsedRealtime));
                }
                q.h("AndroidAppSettings", "[VersionB] Cache won the race.");
                FlagCacheUtils.recordVersionBCacheOutcome(FlagCacheUtils.a.SUCCESS);
                A(e0Var, c0152bTryLoadVersionBCache, context);
            }
        } catch (Exception e10) {
            q.f("AndroidAppSettings", "Failed to read cache", e10);
        }
    }

    public static /* synthetic */ void c(Context context) {
        boolean zK0 = h.a().k0();
        if (zK0) {
            LoggingProtocol.k("cookie_manager_init_begin");
        }
        j.c();
        if (zK0) {
            LoggingProtocol.k("cookie_manager_init_end");
        }
        ek.c.g().f(context, new ek.a.InterfaceC0297a() { // from class: yj.h
            @Override // ek.a.InterfaceC0297a
            public final void a(String str) {
                ek.c.f16131c.D(str);
            }
        });
    }

    public static /* synthetic */ x d(Context context, com.roblox.client.startup.b.C0152b c0152b) {
        f.f30722a.q();
        return j(context);
    }

    public static synchronized void g(Context context) {
        if (!h.a().x3()) {
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
        long jH4 = h.a().H4();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        g0 g0VarB = new g0.a(FlagFetchWorker.class, jH4, timeUnit, h.a().y1(), timeUnit).a("fetch_flags").k(dVarA).i(x5.a.EXPONENTIAL, 60L, TimeUnit.SECONDS).b();
        q.e("fetch_flags", "requested periodic work");
        p0VarH.e("fetch_flags", x5.i.REPLACE, g0VarB);
    }

    public static void h() {
        LoggingProtocol.l("fetch_flag_begin", Long.valueOf(f9540e));
    }

    public static synchronized x<com.roblox.client.startup.b.C0152b> i(Context context) {
        x<com.roblox.client.startup.b.C0152b> xVar = b;
        if (xVar != null && f9538c) {
            f9538c = false;
            return xVar;
        }
        x<com.roblox.client.startup.b.C0152b> xVarJ = j(context);
        b = xVarJ;
        return xVarJ;
    }

    public static x<com.roblox.client.startup.b.C0152b> j(final Context context) {
        final e0 e0VarH = e0.H();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: yj.i
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
        JSONObject jSONObjectB = mh.a.b(context);
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
        if (mh.b.a()) {
            String strH = new uj.a(context).h();
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
        if (mh.b.a()) {
            JSONObject jSONObject3 = new JSONObject();
            f9545j = jSONObject3;
            o.a(jSONObject3, jSONObjectB);
            o.a(f9545j, all);
            o.a(f9545j, jSONObject);
        }
    }

    public static boolean m() {
        return f9537a.get() == b.ENGINE_FLAG_LOADED;
    }

    public static void n() {
        if (h.a().Z0()) {
            f9546k.a();
        }
    }

    public static String o() {
        JSONObject jSONObject = f9545j;
        return jSONObject == null ? "" : jSONObject.toString();
    }

    public static String p(JSONObject jSONObject, String str, com.roblox.client.flags.a aVar) {
        return mh.a.c(jSONObject, str, aVar);
    }

    public static boolean q(com.roblox.client.startup.b.C0152b c0152b) {
        return c0152b == null || c0152b.d() == null || c0152b.d().isEmpty();
    }

    public static void r() {
        yj.x xVarM = yj.x.m();
        synchronized (f9541f) {
            try {
                if (!Native.isLoaded()) {
                    k2 k2Var = k2.ZSTD;
                    if (!xVarM.n(k2Var).isDone()) {
                        Native.load();
                        ZstdInputStream zstdInputStream = new ZstdInputStream(new ByteArrayInputStream(new byte[]{40, -75, 47, -3, 32, 11, 89, 0, 0, 84, 101, 115, 116, 105, 110, 103, 32, 49, 50, 51}));
                        try {
                            String str = new String(ke.d.d(zstdInputStream), StandardCharsets.UTF_8);
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
                q.f("AndroidAppSettings", "Failed to initialize ZSTD library", e10);
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
            synchronized (f9541f) {
                try {
                    r();
                    if (!f9544i) {
                        D();
                        System.loadLibrary(f9539d);
                        if (h.a().o5() && (strE = qh.b.e(RobloxApplication.f(), "robloxwebrtc", "android_app_settings")) != null) {
                            WebRtcLoader.initialize(strE);
                        }
                        f9544i = true;
                        yj.x.m().G(k2.ROBLOX, true);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (UnsatisfiedLinkError e10) {
            q.h("AndroidAppSettings", e10.getLocalizedMessage());
        }
    }

    public static com.roblox.client.startup.b.C0152b u() {
        Context contextF;
        try {
            com.roblox.client.startup.b.C0152b c0152b = b.get();
            if (h.a().W4() && q(c0152b) && (contextF = RobloxApplication.f()) != null) {
                q.k("AndroidAppSettings", "Initial prefetch returned empty; retrying before popping.");
                LoggingProtocol.g("automatic_retry_applied");
                com.roblox.client.startup.b.C0152b c0152bB = com.roblox.client.startup.b.b(contextF);
                if (q(c0152bB)) {
                    q.e("AndroidAppSettings", "popFetchedResponse retry still returned empty.");
                    LoggingProtocol.g("flag_fetch_retry_empty_payload");
                } else {
                    E(c0152bB, contextF);
                    FlagCacheUtils.storePendingVersionBWrite(c0152bB, contextF);
                    c0152b = c0152bB;
                }
            }
            b = null;
            return c0152b;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void v(final Context context) {
        b = i(context);
        f9537a.set(b.PREFETCHED);
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: yj.f
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.c(context);
            }
        });
    }

    public static void w() {
        f9540e = SystemClock.elapsedRealtime();
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
        b bVar = f9537a.get();
        if (bVar != b.UNINITIALIZED && bVar != b.PREFETCHED) {
            b = ne.s.m(b, new ne.i() { // from class: yj.e
                @Override // ne.i
                public final ne.x apply(Object obj) {
                    return com.roblox.client.startup.a.d(context, (com.roblox.client.startup.b.C0152b) obj);
                }
            }, l2.b.i(context));
        }
    }
}
