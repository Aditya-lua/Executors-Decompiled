package yj;

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
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class x implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String[] f36797h = {"clientsettingscdn"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f36798i = {"apis", "friends", "locale", "users", "auth"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f36799j = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap<k2, ne.e0<Boolean>> f36800a = new EnumMap<>(k2.class);
    public final ne.e0<Context> b = ne.e0.H();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.e0<Boolean> f36801c = ne.e0.H();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadFactory f36802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadFactory f36803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f36804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f36805g;

    public x() {
        ThreadFactory threadFactoryB = new ne.f0().g(10).f("AppStartupTaskManager-Tasks-%d").h(this).b();
        this.f36802d = threadFactoryB;
        ThreadFactory threadFactoryB2 = new ne.f0().g(5).f("AppStartupTaskManager-DNS-%d").h(this).b();
        this.f36803e = threadFactoryB2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f36804f = new ThreadPoolExecutor(5, 5, 5L, timeUnit, new LinkedBlockingDeque(), threadFactoryB);
        this.f36805g = new ThreadPoolExecutor(0, 2, 5L, timeUnit, new LinkedBlockingDeque(), threadFactoryB2);
        if (f36799j != null) {
            throw new IllegalStateException("Cannot re-instantiate app startup task manager as it is a singleton.");
        }
        for (k2 k2Var : k2.values()) {
            this.f36800a.put(k2Var, ne.e0.H());
        }
        this.f36804f.allowCoreThreadTimeOut(true);
        this.f36804f.prestartAllCoreThreads();
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
        return f36799j;
    }

    public void A() {
        k("preload_native_libs", new Runnable() { // from class: yj.s
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.r();
            }
        });
    }

    public void B() {
        this.b.a(new Runnable() { // from class: yj.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f36769a.v();
            }
        }, this.f36804f);
    }

    public final void C(final Runnable runnable, final Executor executor) {
        n(k2.ROBLOX).a(new Runnable() { // from class: yj.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f36791a.w(runnable, executor);
            }
        }, executor);
    }

    public final void D() {
        C(new Runnable() { // from class: yj.m
            @Override // java.lang.Runnable
            public final void run() {
                LoggingProtocol.d();
            }
        }, ne.a0.a());
    }

    public void E() {
        this.f36801c.D(Boolean.TRUE);
    }

    public void F(Context context) {
        this.b.D(context.getApplicationContext());
    }

    public void G(k2 k2Var, boolean z10) {
        if (this.f36800a.containsKey(k2Var)) {
            n(k2Var).D(Boolean.valueOf(z10));
            return;
        }
        Log.e("AppStartupTaskManager", "Error setting isLibLoaded: " + k2Var + " is not a valid lib name");
    }

    public boolean H(k2 k2Var) {
        if (!this.f36800a.containsKey(k2Var)) {
            Log.e("AppStartupTaskManager", "Error waiting for lib loaded: " + k2Var + " is not a valid lib name");
            return false;
        }
        try {
            return n(k2Var).get().booleanValue();
        } catch (InterruptedException e10) {
            Log.e("AppStartupTaskManager", "InterruptedException waiting for lib: " + k2Var, e10);
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e11) {
            Log.e("AppStartupTaskManager", "Error waiting for lib " + k2Var + " loaded: " + e11, e11);
            return false;
        }
    }

    public final void k(final String str, final Runnable runnable) {
        this.f36804f.execute(new Runnable() { // from class: yj.u
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
    public ne.e0<Boolean> n(k2 k2Var) {
        ne.e0<Boolean> e0Var = this.f36800a.get(k2Var);
        Objects.requireNonNull(e0Var);
        return e0Var;
    }

    public void o() {
        k("initialize_socket_factory", new Runnable() { // from class: yj.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f36773a.p();
            }
        });
        this.b.a(new Runnable() { // from class: yj.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f36776a.r();
            }
        }, this.f36804f);
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
            com.roblox.client.startup.b.g(contextL).initialize();
            Log.i("AppStartupTaskManager", "OkHttp Cache initialized in " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
        } catch (IOException e10) {
            Log.e("AppStartupTaskManager", "Error initializing OkHttp cache: " + e10, e10);
        }
    }

    public final /* synthetic */ void r() {
        k("initialize_okhttp_cache", new Runnable() { // from class: yj.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f36787a.q();
            }
        });
    }

    public final /* synthetic */ void s(String str) {
        y(str + "." + rg.a1.O());
    }

    public final /* synthetic */ void t() {
        for (String str : f36797h) {
            ci.n.c().d(str + "." + rg.a1.O());
        }
        for (final String str2 : f36798i) {
            this.f36805g.execute(new Runnable() { // from class: yj.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36766a.s(str2);
                }
            });
        }
    }

    public final /* synthetic */ void u() {
        Context contextL = l();
        if (contextL != null) {
            ci.b.b().a(contextL, "35659ed0421961bc16f9bd3955ac6b8e583db18147d4c97c4ad62dc9f9d48438");
        } else {
            Log.e("AppStartupTaskManager", "Error preloading dictionary, app context is null");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
        Log.e("AppStartupTaskManager", "Uncaught exception in thread " + thread.getName(), th2);
    }

    public final /* synthetic */ void v() {
        k("preload_zstd_dictionary", new Runnable() { // from class: yj.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f36795a.u();
            }
        });
    }

    public final /* synthetic */ void w(Runnable runnable, Executor executor) {
        this.f36801c.a(runnable, executor);
    }

    public void x() {
        k("prewarm_dns", new Runnable() { // from class: yj.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f36778a.t();
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
            Response responseExecute = com.roblox.client.startup.b.h().newCall(new Request.Builder().url(com.roblox.client.startup.b.i()).method("HEAD", null).build()).execute();
            try {
                Log.d("AppStartupTaskManager", "Pre-warmed TLS: " + responseExecute.code());
                responseExecute.close();
            } catch (Throwable th2) {
                if (responseExecute != null) {
                    try {
                        responseExecute.close();
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
