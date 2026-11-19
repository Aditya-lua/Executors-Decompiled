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
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseMessaging {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static v0 f8603n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f8605p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf.e f8606a;
    public final zf.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f8608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q0 f8609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f8610f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f8611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f8612h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Task<a1> f8613i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g0 f8614j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8615k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f8616l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f8602m = TimeUnit.HOURS.toSeconds(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static ag.b<z7.i> f8604o = new ag.b() { // from class: com.google.firebase.messaging.p
        @Override // ag.b
        public final Object get() {
            return FirebaseMessaging.d();
        }
    };

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final xf.d f8617a;
        public boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public xf.b<hf.b> f8618c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f8619d;

        public a(xf.d dVar) {
            this.f8617a = dVar;
        }

        public static /* synthetic */ void a(a aVar, xf.a aVar2) {
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
                this.f8619d = boolD;
                if (boolD == null) {
                    xf.b<hf.b> bVar = new xf.b() { // from class: com.google.firebase.messaging.y
                        @Override // xf.b
                        public final void a(xf.a aVar) {
                            FirebaseMessaging.a.a(this.f8740a, aVar);
                        }
                    };
                    this.f8618c = bVar;
                    this.f8617a.a(hf.b.class, bVar);
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
                bool = this.f8619d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.f8606a.t();
        }

        public final Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context contextJ = FirebaseMessaging.this.f8606a.j();
            SharedPreferences sharedPreferences = contextJ.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = contextJ.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextJ.getPackageName(), Barcode.FORMAT_ITF)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(hf.e eVar, zf.a aVar, ag.b<jg.i> bVar, ag.b<yf.j> bVar2, bg.h hVar, ag.b<z7.i> bVar3, xf.d dVar) {
        this(eVar, aVar, bVar, bVar2, hVar, bVar3, dVar, new g0(eVar.j()));
    }

    public static /* synthetic */ Task a(FirebaseMessaging firebaseMessaging, String str, v0.a aVar, String str2) {
        o(firebaseMessaging.f8607c).f(firebaseMessaging.p(), str, str2, firebaseMessaging.f8614j.a());
        if (aVar == null || !str2.equals(aVar.f8727a)) {
            firebaseMessaging.v(str2);
        }
        return tb.m.f(str2);
    }

    public static /* synthetic */ void b(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.w()) {
            firebaseMessaging.B();
        }
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging, tb.k kVar) {
        firebaseMessaging.getClass();
        try {
            kVar.c(firebaseMessaging.k());
        } catch (Exception e10) {
            kVar.b(e10);
        }
    }

    public static /* synthetic */ z7.i d() {
        return null;
    }

    public static /* synthetic */ void f(FirebaseMessaging firebaseMessaging, j9.a aVar) {
        firebaseMessaging.getClass();
        if (aVar != null) {
            f0.y(aVar.A3());
            firebaseMessaging.t();
        }
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull hf.e eVar) {
        FirebaseMessaging firebaseMessaging;
        firebaseMessaging = (FirebaseMessaging) eVar.i(FirebaseMessaging.class);
        o9.s.m(firebaseMessaging, "Firebase Messaging component is not present");
        return firebaseMessaging;
    }

    public static /* synthetic */ void h(FirebaseMessaging firebaseMessaging, a1 a1Var) {
        if (firebaseMessaging.w()) {
            a1Var.n();
        }
    }

    @NonNull
    public static synchronized FirebaseMessaging n() {
        return getInstance(hf.e.l());
    }

    @NonNull
    public static synchronized v0 o(Context context) {
        try {
            if (f8603n == null) {
                f8603n = new v0(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f8603n;
    }

    public static z7.i s() {
        return f8604o.get();
    }

    public final synchronized void A() {
        if (!this.f8615k) {
            C(0L);
        }
    }

    public final void B() {
        zf.a aVar = this.b;
        if (aVar != null) {
            aVar.b();
        } else if (D(r())) {
            A();
        }
    }

    public synchronized void C(long j10) {
        l(new w0(this, Math.min(Math.max(30L, 2 * j10), f8602m)), j10);
        this.f8615k = true;
    }

    public boolean D(v0.a aVar) {
        return aVar == null || aVar.b(this.f8614j.a());
    }

    public String k() throws IOException {
        zf.a aVar = this.b;
        if (aVar != null) {
            try {
                return (String) tb.m.a(aVar.c());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        }
        final v0.a aVarR = r();
        if (!D(aVarR)) {
            return aVarR.f8727a;
        }
        final String strC = g0.c(this.f8606a);
        try {
            return (String) tb.m.a(this.f8609e.b(strC, new q0.a() { // from class: com.google.firebase.messaging.w
                @Override // com.google.firebase.messaging.q0.a
                public final Task start() {
                    FirebaseMessaging firebaseMessaging = this.f8729a;
                    return firebaseMessaging.f8608d.f().n(firebaseMessaging.f8612h, new tb.j() { // from class: com.google.firebase.messaging.x
                        @Override // tb.j
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
                if (f8605p == null) {
                    f8605p = new ScheduledThreadPoolExecutor(1, new w9.b("TAG"));
                }
                f8605p.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Context m() {
        return this.f8607c;
    }

    public final String p() {
        return "[DEFAULT]".equals(this.f8606a.m()) ? BuildConfig.FLAVOR : this.f8606a.o();
    }

    @NonNull
    public Task<String> q() {
        zf.a aVar = this.b;
        if (aVar != null) {
            return aVar.c();
        }
        final tb.k kVar = new tb.k();
        this.f8611g.execute(new Runnable() { // from class: com.google.firebase.messaging.u
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(this.f8718a, kVar);
            }
        });
        return kVar.a();
    }

    public v0.a r() {
        return o(this.f8607c).d(p(), g0.c(this.f8606a));
    }

    public final void t() {
        this.f8608d.e().f(this.f8611g, new tb.g() { // from class: com.google.firebase.messaging.v
            @Override // tb.g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.f(this.f8724a, (j9.a) obj);
            }
        });
    }

    public final void u() {
        k0.c(this.f8607c);
        m0.f(this.f8607c, this.f8608d, z());
        if (z()) {
            t();
        }
    }

    public final void v(String str) {
        if ("[DEFAULT]".equals(this.f8606a.m())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.f8606a.m());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new m(this.f8607c).g(intent);
        }
    }

    public boolean w() {
        return this.f8610f.c();
    }

    public boolean x() {
        return this.f8614j.g();
    }

    public synchronized void y(boolean z10) {
        this.f8615k = z10;
    }

    public final boolean z() {
        k0.c(this.f8607c);
        if (!k0.d(this.f8607c)) {
            return false;
        }
        if (this.f8606a.i(kf.a.class) != null) {
            return true;
        }
        return f0.a() && f8604o != null;
    }

    public FirebaseMessaging(hf.e eVar, zf.a aVar, ag.b<jg.i> bVar, ag.b<yf.j> bVar2, bg.h hVar, ag.b<z7.i> bVar3, xf.d dVar, g0 g0Var) {
        this(eVar, aVar, bVar3, dVar, g0Var, new b0(eVar, g0Var, bVar, bVar2, hVar), n.f(), n.c(), n.b());
    }

    public FirebaseMessaging(hf.e eVar, zf.a aVar, ag.b<z7.i> bVar, xf.d dVar, g0 g0Var, b0 b0Var, Executor executor, Executor executor2, Executor executor3) {
        this.f8615k = false;
        f8604o = bVar;
        this.f8606a = eVar;
        this.b = aVar;
        this.f8610f = new a(dVar);
        Context contextJ = eVar.j();
        this.f8607c = contextJ;
        o oVar = new o();
        this.f8616l = oVar;
        this.f8614j = g0Var;
        this.f8608d = b0Var;
        this.f8609e = new q0(executor);
        this.f8611g = executor2;
        this.f8612h = executor3;
        Context contextJ2 = eVar.j();
        if (contextJ2 instanceof Application) {
            ((Application) contextJ2).registerActivityLifecycleCallbacks(oVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + contextJ2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.a(new zf.a.InterfaceC0788a() { // from class: com.google.firebase.messaging.q
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.b(this.f8709a);
            }
        });
        Task<a1> taskE = a1.e(this, g0Var, b0Var, contextJ, n.g());
        this.f8613i = taskE;
        taskE.f(executor2, new tb.g() { // from class: com.google.firebase.messaging.s
            @Override // tb.g
            public final void onSuccess(Object obj) {
                FirebaseMessaging.h(this.f8711a, (a1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f8716a.u();
            }
        });
    }
}
