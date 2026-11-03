package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.Task;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static u0 f8773n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f8775p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff.e f8776a;
    public final xf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f8778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p0 f8779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f8780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f8781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f8782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Task<z0> f8783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f8784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f8786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f8772m = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static yf.b<y7.i> f8774o = new yf.b() { // from class: com.google.firebase.messaging.p
        @Override // yf.b
        public final Object get() {
            return FirebaseMessaging.d();
        }
    };

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final vf.d f8787a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public vf.b<ff.b> f8788c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f8789d;

        public a(vf.d dVar) {
            this.f8787a = dVar;
        }

        public static /* synthetic */ void a(a aVar, vf.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.B();
            }
        }

        public synchronized void b() {
            try {
                if (this.b) {
                    return;
                }
                Boolean boolD = d();
                this.f8789d = boolD;
                if (boolD == null) {
                    vf.b<ff.b> bVar = new vf.b() { // from class: com.google.firebase.messaging.y
                        @Override // vf.b
                        public final void a(vf.a aVar) {
                            FirebaseMessaging.a.a(this.f8905a, aVar);
                        }
                    };
                    this.f8788c = bVar;
                    this.f8787a.b(ff.b.class, bVar);
                }
                this.b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f8789d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f8776a.s();
        }

        public final Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextJ = FirebaseMessaging.this.f8776a.j();
            SharedPreferences sharedPreferences = contextJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextJ.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextJ.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(ff.e eVar, xf.a aVar, yf.b<hg.i> bVar, yf.b<wf.j> bVar2, zf.h hVar, yf.b<y7.i> bVar3, vf.d dVar) {
        this(eVar, aVar, bVar, bVar2, hVar, bVar3, dVar, new g0(eVar.j()));
    }

    public static /* synthetic */ Task a(FirebaseMessaging firebaseMessaging, String str, u0.a aVar, String str2) {
        o(firebaseMessaging.f8777c).f(firebaseMessaging.p(), str, str2, firebaseMessaging.f8784j.a());
        if (aVar == null || !str2.equals(aVar.f8888a)) {
            firebaseMessaging.v(str2);
        }
        return sb.m.f(str2);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.w()) {
            firebaseMessaging.B();
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, sb.k kVar) {
        firebaseMessaging.getClass();
        try {
            kVar.c(firebaseMessaging.k());
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    public static /* synthetic */ y7.i d() {
        return null;
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            f0.y(cloudMessage.v3());
            firebaseMessaging.t();
        }
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull ff.e eVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) eVar.i(FirebaseMessaging.class);
        n9.m.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static /* synthetic */ void h(FirebaseMessaging firebaseMessaging, z0 z0Var) {
        if (firebaseMessaging.w()) {
            z0Var.n();
        }
    }

    @NonNull
    public static synchronized FirebaseMessaging n() {
        return getInstance(ff.e.k());
    }

    @NonNull
    public static synchronized u0 o(Context context) {
        try {
            if (f8773n == null) {
                f8773n = new u0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f8773n;
    }

    public static y7.i s() {
        return f8774o.get();
    }

    public final synchronized void A() {
        if (!this.f8785k) {
            C(0L);
        }
    }

    public final void B() {
        xf.a aVar = this.b;
        if (aVar != null) {
            aVar.b();
        } else if (D(r())) {
            A();
        }
    }

    public synchronized void C(long j10) {
        l(new v0(this, Math.min(Math.max(30L, 2 * j10), f8772m)), j10);
        this.f8785k = true;
    }

    public boolean D(u0.a aVar) {
        return aVar == null || aVar.b(this.f8784j.a());
    }

    public String k() throws IOException {
        xf.a aVar = this.b;
        if (aVar != null) {
            try {
                return (String) sb.m.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final u0.a aVarR = r();
        if (!D(aVarR)) {
            return aVarR.f8888a;
        }
        final String strC = g0.c(this.f8776a);
        try {
            return (String) sb.m.a(this.f8779e.b(strC, new p0.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.p0.a
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f8895a;
                    return firebaseMessaging.f8778d.f().n(firebaseMessaging.f8782h, new sb.j() { // from class: com.google.firebase.messaging.x
                        @Override // sb.j
                        public final Task then(Object obj) {
                            return FirebaseMessaging.a(firebaseMessaging, str, aVar, (String) obj);
                        }
                    });
                }
            }));
        } catch (InterruptedException | ExecutionException e11) {
            throw new IOException(e11);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void l(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (f8775p == null) {
                    f8775p = new ScheduledThreadPoolExecutor(1, new v9.b("TAG"));
                }
                f8775p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Context m() {
        return this.f8777c;
    }

    public final String p() {
        return "[DEFAULT]".equals(this.f8776a.l()) ? "" : this.f8776a.n();
    }

    @NonNull
    public Task<String> q() {
        xf.a aVar = this.b;
        if (aVar != null) {
            return aVar.c();
        }
        final sb.k kVar = new sb.k();
        this.f8781g.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f8885a, kVar);
            }
        });
        return kVar.a();
    }

    public u0.a r() {
        return o(this.f8777c).d(p(), g0.c(this.f8776a));
    }

    public final void t() {
        this.f8778d.e().f(this.f8781g, new sb.g() { // from class: com.google.firebase.messaging.v
            @Override // sb.g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.f(this.f8890a, (CloudMessage) obj);
            }
        });
    }

    public final void u() {
        k0.c(this.f8777c);
        m0.f(this.f8777c, this.f8778d, z());
        if (z()) {
            t();
        }
    }

    public final void v(String str) {
        if ("[DEFAULT]".equals(this.f8776a.l())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f8776a.l());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.f8777c).g(intent);
        }
    }

    public boolean w() {
        return this.f8780f.c();
    }

    public boolean x() {
        return this.f8784j.g();
    }

    public synchronized void y(boolean z10) {
        this.f8785k = z10;
    }

    public final boolean z() {
        k0.c(this.f8777c);
        if (!k0.d(this.f8777c)) {
            return false;
        }
        if (this.f8776a.i(hf.a.class) != null) {
            return true;
        }
        return f0.a() && f8774o != null;
    }

    public FirebaseMessaging(ff.e eVar, xf.a aVar, yf.b<hg.i> bVar, yf.b<wf.j> bVar2, zf.h hVar, yf.b<y7.i> bVar3, vf.d dVar, g0 g0Var) {
        this(eVar, aVar, bVar3, dVar, g0Var, new b0(eVar, g0Var, bVar, bVar2, hVar), n.f(), n.c(), n.b());
    }

    public FirebaseMessaging(ff.e eVar, xf.a aVar, yf.b<y7.i> bVar, vf.d dVar, g0 g0Var, b0 b0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f8785k = false;
        f8774o = bVar;
        this.f8776a = eVar;
        this.b = aVar;
        this.f8780f = new a(dVar);
        Context contextJ = eVar.j();
        this.f8777c = contextJ;
        o oVar = new o();
        this.f8786l = oVar;
        this.f8784j = g0Var;
        this.f8778d = b0Var;
        this.f8779e = new p0(executor);
        this.f8781g = executor2;
        this.f8782h = executor3;
        Context contextJ2 = eVar.j();
        if (contextJ2 instanceof Application) {
            ((Application) contextJ2).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextJ2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new xf.a.InterfaceC0649a() { // from class: com.google.firebase.messaging.q
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.b(this.f8872a);
            }
        });
        Task<z0> taskE = z0.e(this, g0Var, b0Var, contextJ, n.g());
        this.f8783i = taskE;
        taskE.f(executor2, new sb.g() { // from class: com.google.firebase.messaging.s
            @Override // sb.g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.h(this.f8877a, (z0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f8879a.u();
            }
        });
    }
}
