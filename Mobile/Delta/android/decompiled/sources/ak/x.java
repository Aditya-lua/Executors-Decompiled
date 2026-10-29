package ak;

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
    public static final String[] f652h = {"clientsettingscdn"};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f653i = {"apis", "friends", "locale", "users", "auth"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f654j = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap<k2, me.e0<Boolean>> f655a = new EnumMap<>(k2.class);
    public final me.e0<Context> b = me.e0.H();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me.e0<Boolean> f656c = me.e0.H();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadFactory f657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ThreadFactory f658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f660g;

    public x() {
        ThreadFactory threadFactoryB = new me.f0().g(10).f("AppStartupTaskManager-Tasks-%d").h(this).b();
        this.f657d = threadFactoryB;
        ThreadFactory threadFactoryB2 = new me.f0().g(5).f("AppStartupTaskManager-DNS-%d").h(this).b();
        this.f658e = threadFactoryB2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f659f = new ThreadPoolExecutor(5, 5, 5L, timeUnit, new LinkedBlockingDeque(), threadFactoryB);
        this.f660g = new ThreadPoolExecutor(0, 2, 5L, timeUnit, new LinkedBlockingDeque(), threadFactoryB2);
        if (f654j != null) {
            throw new IllegalStateException("Cannot re-instantiate app startup task manager as it is a singleton.");
        }
        for (k2 k2Var : k2.values()) {
            this.f655a.put(k2Var, me.e0.H());
        }
        this.f659f.allowCoreThreadTimeOut(true);
        this.f659f.prestartAllCoreThreads();
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
        return f654j;
    }

    public void A() {
        k("preload_native_libs", new Runnable() { // from class: ak.s
            @Override // java.lang.Runnable
            public final void run() {
                com.roblox.client.startup.a.r();
            }
        });
    }

    public void B() {
        this.b.a(new Runnable() { // from class: ak.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f625a.v();
            }
        }, this.f659f);
    }

    public final void C(final Runnable runnable, final Executor executor) {
        n(k2.ROBLOX).a(new Runnable() { // from class: ak.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f646a.w(runnable, executor);
            }
        }, executor);
    }

    public final void D() {
        C(new Runnable() { // from class: ak.m
            @Override // java.lang.Runnable
            public final void run() {
                LoggingProtocol.d();
            }
        }, me.a0.a());
    }

    public void E() {
        this.f656c.D(Boolean.TRUE);
    }

    public void F(Context context) {
        this.b.D(context.getApplicationContext());
    }

    public void G(k2 k2Var, boolean z10) {
        if (this.f655a.containsKey(k2Var)) {
            n(k2Var).D(Boolean.valueOf(z10));
            return;
        }
        Log.e("AppStartupTaskManager", "Error setting isLibLoaded: " + k2Var + " is not a valid lib name");
    }

    public boolean H(k2 k2Var) {
        if (!this.f655a.containsKey(k2Var)) {
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
        this.f659f.execute(new Runnable() { // from class: ak.u
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
    public me.e0<Boolean> n(k2 k2Var) {
        me.e0<Boolean> e0Var = this.f655a.get(k2Var);
        Objects.requireNonNull(e0Var);
        return e0Var;
    }

    public void o() {
        k("initialize_socket_factory", new Runnable() { // from class: ak.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f628a.p();
            }
        });
        this.b.a(new Runnable() { // from class: ak.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f631a.r();
            }
        }, this.f659f);
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
        k("initialize_okhttp_cache", new Runnable() { // from class: ak.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f642a.q();
            }
        });
    }

    public final /* synthetic */ void s(String str) {
        y(str + "." + sg.a1.O());
    }

    public final /* synthetic */ void t() {
        for (String str : f652h) {
            ei.n.c().d(str + "." + sg.a1.O());
        }
        for (final String str2 : f653i) {
            this.f660g.execute(new Runnable() { // from class: ak.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f622a.s(str2);
                }
            });
        }
    }

    public final /* synthetic */ void u() {
        Context contextL = l();
        if (contextL != null) {
            ei.b.b().a(contextL, "57ace1df87f8e37023aebc8d9ce7e0802ffc0ee11dbcc89b34b18ed4e75f1de7");
        } else {
            Log.e("AppStartupTaskManager", "Error preloading dictionary, app context is null");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
        Log.e("AppStartupTaskManager", "Uncaught exception in thread " + thread.getName(), th2);
    }

    public final /* synthetic */ void v() {
        k("preload_zstd_dictionary", new Runnable() { // from class: ak.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f650a.u();
            }
        });
    }

    public final /* synthetic */ void w(Runnable runnable, Executor executor) {
        this.f656c.a(runnable, executor);
    }

    public void x() {
        k("prewarm_dns", new Runnable() { // from class: ak.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f633a.t();
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
