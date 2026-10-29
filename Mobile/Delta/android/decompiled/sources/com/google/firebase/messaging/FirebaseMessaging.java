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
    public static u0 f8699n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f8701p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ef.e f8702a;
    public final wf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f8704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p0 f8705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f8706f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f8707g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f8708h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Task<z0> f8709i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f8710j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8711k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f8712l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f8698m = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static xf.b<y7.i> f8700o = new xf.b() { // from class: com.google.firebase.messaging.p
        @Override // xf.b
        public final Object get() {
            return FirebaseMessaging.d();
        }
    };

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uf.d f8713a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public uf.b<ef.b> f8714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f8715d;

        public a(uf.d dVar) {
            this.f8713a = dVar;
        }

        public static /* synthetic */ void a(a aVar, uf.a aVar2) {
            if (aVar.c()) {
                FirebaseMessaging.this.C();
            }
        }

        public synchronized void b() {
            try {
                if (this.b) {
                    return;
                }
                Boolean boolD = d();
                this.f8715d = boolD;
                if (boolD == null) {
                    uf.b<ef.b> bVar = new uf.b() { // from class: com.google.firebase.messaging.y
                        @Override // uf.b
                        public final void a(uf.a aVar) {
                            FirebaseMessaging.a.a(this.f8831a, aVar);
                        }
                    };
                    this.f8714c = bVar;
                    this.f8713a.c(ef.b.class, bVar);
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
                bool = this.f8715d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f8702a.t();
        }

        public final Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextJ = FirebaseMessaging.this.f8702a.j();
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

        public synchronized void e(boolean z10) {
            try {
                b();
                uf.b<ef.b> bVar = this.f8714c;
                if (bVar != null) {
                    this.f8713a.b(ef.b.class, bVar);
                    this.f8714c = null;
                }
                SharedPreferences.Editor editorEdit = FirebaseMessaging.this.f8702a.j().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                editorEdit.putBoolean("auto_init", z10);
                editorEdit.apply();
                if (z10) {
                    FirebaseMessaging.this.C();
                }
                this.f8715d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public FirebaseMessaging(ef.e eVar, wf.a aVar, xf.b<gg.i> bVar, xf.b<vf.j> bVar2, yf.h hVar, xf.b<y7.i> bVar3, uf.d dVar) {
        this(eVar, aVar, bVar, bVar2, hVar, bVar3, dVar, new g0(eVar.j()));
    }

    public static /* synthetic */ Task a(FirebaseMessaging firebaseMessaging, String str, u0.a aVar, String str2) {
        o(firebaseMessaging.f8703c).f(firebaseMessaging.p(), str, str2, firebaseMessaging.f8710j.a());
        if (aVar == null || !str2.equals(aVar.f8814a)) {
            firebaseMessaging.v(str2);
        }
        return sb.m.f(str2);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.w()) {
            firebaseMessaging.C();
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
    public static synchronized FirebaseMessaging getInstance(@NonNull ef.e eVar) {
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
        return getInstance(ef.e.l());
    }

    @NonNull
    public static synchronized u0 o(Context context) {
        try {
            if (f8699n == null) {
                f8699n = new u0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f8699n;
    }

    public static y7.i s() {
        return f8700o.get();
    }

    public final boolean A() {
        k0.c(this.f8703c);
        if (!k0.d(this.f8703c)) {
            return false;
        }
        if (this.f8702a.i(gf.a.class) != null) {
            return true;
        }
        return f0.a() && f8700o != null;
    }

    public final synchronized void B() {
        if (!this.f8711k) {
            D(0L);
        }
    }

    public final void C() {
        wf.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        } else if (E(r())) {
            B();
        }
    }

    public synchronized void D(long j10) {
        l(new v0(this, Math.min(Math.max(30L, 2 * j10), f8698m)), j10);
        this.f8711k = true;
    }

    public boolean E(u0.a aVar) {
        return aVar == null || aVar.b(this.f8710j.a());
    }

    public String k() throws IOException {
        wf.a aVar = this.b;
        if (aVar != null) {
            try {
                return (String) sb.m.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final u0.a aVarR = r();
        if (!E(aVarR)) {
            return aVarR.f8814a;
        }
        final String strC = g0.c(this.f8702a);
        try {
            return (String) sb.m.a(this.f8705e.b(strC, new p0.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.p0.a
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f8821a;
                    return firebaseMessaging.f8704d.f().n(firebaseMessaging.f8708h, new sb.j() { // from class: com.google.firebase.messaging.x
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
                if (f8701p == null) {
                    f8701p = new ScheduledThreadPoolExecutor(1, new v9.b("TAG"));
                }
                f8701p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Context m() {
        return this.f8703c;
    }

    public final String p() {
        return "[DEFAULT]".equals(this.f8702a.m()) ? "" : this.f8702a.o();
    }

    @NonNull
    public Task<String> q() {
        wf.a aVar = this.b;
        if (aVar != null) {
            return aVar.c();
        }
        final sb.k kVar = new sb.k();
        this.f8707g.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f8811a, kVar);
            }
        });
        return kVar.a();
    }

    public u0.a r() {
        return o(this.f8703c).d(p(), g0.c(this.f8702a));
    }

    public final void t() {
        this.f8704d.e().f(this.f8707g, new sb.g() { // from class: com.google.firebase.messaging.v
            @Override // sb.g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.f(this.f8816a, (CloudMessage) obj);
            }
        });
    }

    public final void u() {
        k0.c(this.f8703c);
        m0.f(this.f8703c, this.f8704d, A());
        if (A()) {
            t();
        }
    }

    public final void v(String str) {
        if ("[DEFAULT]".equals(this.f8702a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f8702a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.f8703c).g(intent);
        }
    }

    public boolean w() {
        return this.f8706f.c();
    }

    public boolean x() {
        return this.f8710j.g();
    }

    public void y(boolean z10) {
        this.f8706f.e(z10);
    }

    public synchronized void z(boolean z10) {
        this.f8711k = z10;
    }

    public FirebaseMessaging(ef.e eVar, wf.a aVar, xf.b<gg.i> bVar, xf.b<vf.j> bVar2, yf.h hVar, xf.b<y7.i> bVar3, uf.d dVar, g0 g0Var) {
        this(eVar, aVar, bVar3, dVar, g0Var, new b0(eVar, g0Var, bVar, bVar2, hVar), n.f(), n.c(), n.b());
    }

    public FirebaseMessaging(ef.e eVar, wf.a aVar, xf.b<y7.i> bVar, uf.d dVar, g0 g0Var, b0 b0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f8711k = false;
        f8700o = bVar;
        this.f8702a = eVar;
        this.b = aVar;
        this.f8706f = new a(dVar);
        Context contextJ = eVar.j();
        this.f8703c = contextJ;
        o oVar = new o();
        this.f8712l = oVar;
        this.f8710j = g0Var;
        this.f8704d = b0Var;
        this.f8705e = new p0(executor);
        this.f8707g = executor2;
        this.f8708h = executor3;
        Context contextJ2 = eVar.j();
        if (contextJ2 instanceof Application) {
            ((Application) contextJ2).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextJ2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new wf.a.InterfaceC0624a() { // from class: com.google.firebase.messaging.q
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.b(this.f8798a);
            }
        });
        Task<z0> taskE = z0.e(this, g0Var, b0Var, contextJ, n.g());
        this.f8709i = taskE;
        taskE.f(executor2, new sb.g() { // from class: com.google.firebase.messaging.s
            @Override // sb.g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.h(this.f8803a, (z0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f8805a.u();
            }
        });
    }
}
