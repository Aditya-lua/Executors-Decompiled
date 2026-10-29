package p015ak;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.C3273b;
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
import ne.C9410a0;
import ne.C9418e0;
import ne.C9420f0;
import okhttp3.Request;
import okhttp3.Response;
import p104ei.C5124b;
import p104ei.C5136n;
import sg.C11295a1;

/* JADX INFO: renamed from: ak.x */
/* JADX INFO: loaded from: classes2.dex */
public class C0347x implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: h */
    public static final String[] f855h = {"clientsettingscdn"};

    /* JADX INFO: renamed from: i */
    public static final String[] f856i = {"apis", "friends", "locale", "users", "auth"};

    /* JADX INFO: renamed from: j */
    public static final C0347x f857j = new C0347x();

    /* JADX INFO: renamed from: a */
    public final EnumMap<EnumC0307k2, C9418e0<Boolean>> f858a = new EnumMap<>(EnumC0307k2.class);

    /* JADX INFO: renamed from: b */
    public final C9418e0<Context> f859b = C9418e0.m37204H();

    /* JADX INFO: renamed from: c */
    public final C9418e0<Boolean> f860c = C9418e0.m37204H();

    /* JADX INFO: renamed from: d */
    public final ThreadFactory f861d;

    /* JADX INFO: renamed from: e */
    public final ThreadFactory f862e;

    /* JADX INFO: renamed from: f */
    public final ThreadPoolExecutor f863f;

    /* JADX INFO: renamed from: g */
    public final ThreadPoolExecutor f864g;

    public C0347x() {
        ThreadFactory threadFactoryM37208b = new C9420f0().m37211g(10).m37210f("AppStartupTaskManager-Tasks-%d").m37212h(this).m37208b();
        this.f861d = threadFactoryM37208b;
        ThreadFactory threadFactoryM37208b2 = new C9420f0().m37211g(5).m37210f("AppStartupTaskManager-DNS-%d").m37212h(this).m37208b();
        this.f862e = threadFactoryM37208b2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f863f = new ThreadPoolExecutor(5, 5, 5L, timeUnit, new LinkedBlockingDeque(), threadFactoryM37208b);
        this.f864g = new ThreadPoolExecutor(0, 2, 5L, timeUnit, new LinkedBlockingDeque(), threadFactoryM37208b2);
        if (f857j != null) {
            throw new IllegalStateException("Cannot re-instantiate app startup task manager as it is a singleton.");
        }
        for (EnumC0307k2 enumC0307k2 : EnumC0307k2.values()) {
            this.f858a.put(enumC0307k2, C9418e0.m37204H());
        }
        this.f863f.allowCoreThreadTimeOut(true);
        this.f863f.prestartAllCoreThreads();
        m1353D();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1339a(Runnable runnable, String str) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        runnable.run();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        LoggingProtocol.m15999l(str + "_begin", Long.valueOf(jElapsedRealtime));
        LoggingProtocol.m15999l(str + "_end", Long.valueOf(jElapsedRealtime2));
    }

    /* JADX INFO: renamed from: m */
    public static C0347x m1349m() {
        return f857j;
    }

    /* JADX INFO: renamed from: A */
    public void m1350A() {
        m1358k("preload_native_libs", new Runnable() { // from class: ak.s
            @Override // java.lang.Runnable
            public final void run() {
                C3272a.m15710r();
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m1351B() {
        this.f859b.mo37173a(new Runnable() { // from class: ak.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f823a.m1368v();
            }
        }, this.f863f);
    }

    /* JADX INFO: renamed from: C */
    public final void m1352C(final Runnable runnable, final Executor executor) {
        m1360n(EnumC0307k2.ROBLOX).mo37173a(new Runnable() { // from class: ak.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f848a.m1369w(runnable, executor);
            }
        }, executor);
    }

    /* JADX INFO: renamed from: D */
    public final void m1353D() {
        m1352C(new Runnable() { // from class: ak.m
            @Override // java.lang.Runnable
            public final void run() {
                LoggingProtocol.m15993d();
            }
        }, C9410a0.m37145a());
    }

    /* JADX INFO: renamed from: E */
    public void m1354E() {
        this.f860c.mo37169D(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: F */
    public void m1355F(Context context) {
        this.f859b.mo37169D(context.getApplicationContext());
    }

    /* JADX INFO: renamed from: G */
    public void m1356G(EnumC0307k2 enumC0307k2, boolean z10) {
        if (this.f858a.containsKey(enumC0307k2)) {
            m1360n(enumC0307k2).mo37169D(Boolean.valueOf(z10));
            return;
        }
        Log.e("AppStartupTaskManager", "Error setting isLibLoaded: " + enumC0307k2 + " is not a valid lib name");
    }

    /* JADX INFO: renamed from: H */
    public boolean m1357H(EnumC0307k2 enumC0307k2) {
        if (!this.f858a.containsKey(enumC0307k2)) {
            Log.e("AppStartupTaskManager", "Error waiting for lib loaded: " + enumC0307k2 + " is not a valid lib name");
            return false;
        }
        try {
            return m1360n(enumC0307k2).get().booleanValue();
        } catch (InterruptedException e10) {
            Log.e("AppStartupTaskManager", "InterruptedException waiting for lib: " + enumC0307k2, e10);
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e11) {
            Log.e("AppStartupTaskManager", "Error waiting for lib " + enumC0307k2 + " loaded: " + e11, e11);
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1358k(final String str, final Runnable runnable) {
        this.f863f.execute(new Runnable() { // from class: ak.u
            @Override // java.lang.Runnable
            public final void run() {
                C0347x.m1339a(runnable, str);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final Context m1359l() {
        try {
            return this.f859b.get();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("AppStartupTaskManager", "Error getting application context: " + e10, e10);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public C9418e0<Boolean> m1360n(EnumC0307k2 enumC0307k2) {
        C9418e0<Boolean> c9418e0 = this.f858a.get(enumC0307k2);
        Objects.requireNonNull(c9418e0);
        return c9418e0;
    }

    /* JADX INFO: renamed from: o */
    public void m1361o() {
        m1358k("initialize_socket_factory", new Runnable() { // from class: ak.p
            @Override // java.lang.Runnable
            public final void run() {
                this.f827a.m1362p();
            }
        });
        this.f859b.mo37173a(new Runnable() { // from class: ak.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f831a.m1364r();
            }
        }, this.f863f);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m1362p() {
        C3273b.m15731j();
        m1372z();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m1363q() {
        Context contextM1359l = m1359l();
        if (contextM1359l == null) {
            Log.e("AppStartupTaskManager", "Error initializing OkHttp cache: context is null");
            return;
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C3273b.m15728g(contextM1359l).initialize();
            Log.i("AppStartupTaskManager", "OkHttp Cache initialized in " + (SystemClock.elapsedRealtime() - jElapsedRealtime) + "ms");
        } catch (IOException e10) {
            Log.e("AppStartupTaskManager", "Error initializing OkHttp cache: " + e10, e10);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m1364r() {
        m1358k("initialize_okhttp_cache", new Runnable() { // from class: ak.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f843a.m1363q();
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m1365s(String str) {
        m1371y(str + "." + C11295a1.m42410O());
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m1366t() {
        for (String str : f855h) {
            C5136n.m23943c().m23944d(str + "." + C11295a1.m42410O());
        }
        for (final String str2 : f856i) {
            this.f864g.execute(new Runnable() { // from class: ak.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f819a.m1365s(str2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m1367u() {
        Context contextM1359l = m1359l();
        if (contextM1359l != null) {
            C5124b.m23913b().m23914a(contextM1359l, "c94f4ea02188704a1a40f58b2c82ff034a26bc2be981f126c1a3434f869b7915");
        } else {
            Log.e("AppStartupTaskManager", "Error preloading dictionary, app context is null");
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
        Log.e("AppStartupTaskManager", "Uncaught exception in thread " + thread.getName(), th2);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m1368v() {
        m1358k("preload_zstd_dictionary", new Runnable() { // from class: ak.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f853a.m1367u();
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m1369w(Runnable runnable, Executor executor) {
        this.f860c.mo37173a(runnable, executor);
    }

    /* JADX INFO: renamed from: x */
    public void m1370x() {
        m1358k("prewarm_dns", new Runnable() { // from class: ak.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f833a.m1366t();
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public final void m1371y(String str) {
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

    /* JADX INFO: renamed from: z */
    public final void m1372z() {
        try {
            Response responseExecute = C3273b.m15729h().newCall(new Request.Builder().url(C3273b.m15730i()).method("HEAD", null).build()).execute();
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
            C3273b.m15733l();
            Log.e("AppStartupTaskManager", "Error pre-warming TLS: " + e10, e10);
        }
    }
}
