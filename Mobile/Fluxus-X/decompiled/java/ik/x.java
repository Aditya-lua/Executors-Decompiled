package ik;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.EnumMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class x implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f19614h = {"clientsettingscdn"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f19615i = {"apis", "friends", "locale", "users", "auth"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f19616j = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap<q2, pe.e0<Boolean>> f19617a = new EnumMap<>(q2.class);
    public final pe.e0<Context> b = pe.e0.H();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.e0<Boolean> f19618c = pe.e0.H();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadFactory f19619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadFactory f19620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f19621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f19622g;

    public x() {
        ThreadFactory threadFactoryB = new pe.f0().g(10).f("AppStartupTaskManager-Tasks-%d").h(this).b();
        this.f19619d = threadFactoryB;
        ThreadFactory threadFactoryB2 = new pe.f0().g(5).f("AppStartupTaskManager-DNS-%d").h(this).b();
        this.f19620e = threadFactoryB2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f19621f = new ThreadPoolExecutor(5, 5, 5L, timeUnit, new LinkedBlockingDeque(), threadFactoryB);
        this.f19622g = new ThreadPoolExecutor(0, 2, 5L, timeUnit, new LinkedBlockingDeque(), threadFactoryB2);
        if (f19616j != null) {
            throw new IllegalStateException("Cannot re-instantiate app startup task manager as it is a singleton.");
        }
        for (q2 q2Var : q2.values()) {
            this.f19617a.put(q2Var, pe.e0.H());
        }
        this.f19621f.allowCoreThreadTimeOut(true);
        this.f19621f.prestartAllCoreThreads();
        D();
    }

    public static /* synthetic */ void a(Runnable runnable, String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        LoggingProtocol.l(str + "_begin", Long.valueOf(jElapsedRealtime));
        LoggingProtocol.l(str + "_end", Long.valueOf(jElapsedRealtime2));
    }

    public static x m() {
        return f19616j;
    }

    public void A() {
        k("preload_native_libs", new Runnable() { // from class: ik.s
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.r();
            }
        });
    }

    public void B() {
        this.b.a(new Runnable() { // from class: ik.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f19562a.v();
            }
        }, this.f19621f);
    }

    public final void C(final Runnable runnable, final Executor executor) {
        n(q2.ROBLOX).a(new Runnable() { // from class: ik.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f19600a.w(runnable, executor);
            }
        }, executor);
    }

    public final void D() {
        C(new Runnable() { // from class: ik.m
            @Override // java.lang.Runnable
            public final void run() {
                LoggingProtocol.d();
            }
        }, pe.a0.a());
    }

    public void E() {
        this.f19618c.D(Boolean.TRUE);
    }

    public void F(Context context) {
        this.b.D(context.getApplicationContext());
    }

    public void G(q2 q2Var, boolean z10) {
        if (this.f19617a.containsKey(q2Var)) {
            n(q2Var).D(Boolean.valueOf(z10));
            return;
        }
        Log.e("AppStartupTaskManager", "Error setting isLibLoaded: " + q2Var + " is not a valid lib name");
    }

    public boolean H(q2 q2Var) {
        if (!this.f19617a.containsKey(q2Var)) {
            Log.e("AppStartupTaskManager", "Error waiting for lib loaded: " + q2Var + " is not a valid lib name");
            return false;
        }
        try {
            return n(q2Var).get().booleanValue();
        } catch (InterruptedException e10) {
            Log.e("AppStartupTaskManager", "InterruptedException waiting for lib: " + q2Var, e10);
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e11) {
            Log.e("AppStartupTaskManager", "Error waiting for lib " + q2Var + " loaded: " + e11, e11);
            return false;
        }
    }

    public final void k(final String str, final Runnable runnable) {
        this.f19621f.execute(new Runnable() { // from class: ik.u
            @Override // java.lang.Runnable
            public final void run() {
                x.a(runnable, str);
            }
        });
    }

    public final Context l() {
        try {
            return this.b.get();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("AppStartupTaskManager", "Error getting application context: " + e10, e10);
            return null;
        }
    }

    @NonNull
    public pe.e0<Boolean> n(q2 q2Var) {
        pe.e0<Boolean> e0Var = this.f19617a.get(q2Var);
        Objects.requireNonNull(e0Var);
        return e0Var;
    }

    public void o() {
        k("initialize_socket_factory", new Runnable() { // from class: ik.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f19566a.p();
            }
        });
        this.b.a(new Runnable() { // from class: ik.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f19573a.r();
            }
        }, this.f19621f);
    }

    public final /* synthetic */ void p() {
        com.roblox.client.startup.b.j();
        z();
    }

    public final /* synthetic */ void q() {
        Context contextL = l();
        if (contextL == null) {
            Log.e("AppStartupTaskManager", "Error initializing OkHttp cache: context is null");
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            com.roblox.client.startup.b.g(contextL).e();
            Log.i("AppStartupTaskManager", "OkHttp Cache initialized in " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
        } catch (IOException e10) {
            Log.e("AppStartupTaskManager", "Error initializing OkHttp cache: " + e10, e10);
        }
    }

    public final /* synthetic */ void r() {
        k("initialize_okhttp_cache", new Runnable() { // from class: ik.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f19590a.q();
            }
        });
    }

    public final /* synthetic */ void s(String str) {
        y(str + "." + bh.a1.O());
    }

    public final /* synthetic */ void t() {
        for (String str : f19614h) {
            mi.n.d().e(str + "." + bh.a1.O());
        }
        for (final String str2 : f19615i) {
            this.f19622g.execute(new Runnable() { // from class: ik.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19560a.s(str2);
                }
            });
        }
    }

    public final /* synthetic */ void u() {
        Context contextL = l();
        if (contextL != null) {
            mi.b.b().a(contextL, "c0101e39d0563e9590a0ab27f90e91ea36d6bcfdf99add6915870c306a286479");
        } else {
            Log.e("AppStartupTaskManager", "Error preloading dictionary, app context is null");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
        Log.e("AppStartupTaskManager", "Uncaught exception in thread " + thread.getName(), th2);
    }

    public final /* synthetic */ void v() {
        k("preload_zstd_dictionary", new Runnable() { // from class: ik.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f19603a.u();
            }
        });
    }

    public final /* synthetic */ void w(Runnable runnable, Executor executor) {
        this.f19618c.a(runnable, executor);
    }

    public void x() {
        k("prewarm_dns", new Runnable() { // from class: ik.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f19577a.t();
            }
        });
    }

    public final void y(String str) {
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Pre-warmed DNS for ");
            sb2.append(str);
            sb2.append(", address count: ");
            sb2.append(allByName == null ? 0 : allByName.length);
            Log.d("AppStartupTaskManager", sb2.toString());
        } catch (UnknownHostException e10) {
            Log.e("AppStartupTaskManager", "Error pre-warming DNS for " + str, e10);
        }
    }

    public final void z() {
        try {
            mv.h0 h0VarJ = com.roblox.client.startup.b.h().a(new mv.f0.a().t(com.roblox.client.startup.b.i()).o("HEAD", null).b()).j();
            try {
                Log.d("AppStartupTaskManager", "Pre-warmed TLS: " + h0VarJ.getCode());
                h0VarJ.close();
            } catch (Throwable th2) {
                if (h0VarJ != null) {
                    try {
                        h0VarJ.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Exception e10) {
            com.roblox.client.startup.b.l();
            Log.e("AppStartupTaskManager", "Error pre-warming TLS: " + e10, e10);
        }
    }
}
