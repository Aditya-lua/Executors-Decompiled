package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class l9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f6676g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile g9 f6677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f6678i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9 f6679a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f6681d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f6682e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f6683f;

    static {
        new AtomicReference();
        he.n.m(new Object() { // from class: com.google.android.gms.internal.measurement.j9
        }, "BuildInfo must be non-null");
        f6678i = new AtomicInteger();
    }

    public /* synthetic */ l9(f9 f9Var, String str, Object obj, boolean z10, byte[] bArr) {
        if (f9Var.f6513a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f6679a = f9Var;
        this.b = str;
        this.f6680c = obj;
        this.f6683f = false;
    }

    public static void b(final Context context) {
        if (f6677h != null || context == null) {
            return;
        }
        Object obj = f6676g;
        synchronized (obj) {
            try {
                if (f6677h == null) {
                    synchronized (obj) {
                        try {
                            g9 g9Var = f6677h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (g9Var == null || g9Var.a() != context) {
                                if (g9Var != null) {
                                    p8.f();
                                    n9.d();
                                    w8.e();
                                }
                                f6677h = new l8(context, he.t.a(new he.s() { // from class: com.google.android.gms.internal.measurement.k9
                                    @Override // he.s
                                    public final /* synthetic */ Object get() {
                                        Object obj2 = l9.f6676g;
                                        return x8.a(context);
                                    }
                                }));
                                f6678i.incrementAndGet();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void c() {
        f6678i.incrementAndGet();
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 he.k) = (r2v0 he.k), (r2v0 he.k), (r2v7 he.k) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object d() {
        String strA;
        t8 t8VarC;
        String strD;
        Object objB;
        int i10 = f6678i.get();
        if (this.f6681d < i10) {
            synchronized (this) {
                try {
                    if (this.f6681d < i10) {
                        g9 g9Var = f6677h;
                        he.k kVarA = he.k.a();
                        Object objA = null;
                        if (g9Var == null || g9Var.b() == null) {
                            strA = null;
                        } else {
                            kVarA = (he.k) ((he.s) he.n.l(g9Var.b())).get();
                            if (kVarA.c()) {
                                r8 r8Var = (r8) kVarA.b();
                                f9 f9Var = this.f6679a;
                                strA = r8Var.a(f9Var.f6513a, null, f9Var.f6514c, this.b);
                            } else {
                                strA = null;
                            }
                        }
                        he.n.s(g9Var != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        f9 f9Var2 = this.f6679a;
                        Uri uri = f9Var2.f6513a;
                        if (uri != null) {
                            t8VarC = z8.a(g9Var.a(), uri) ? p8.c(g9Var.a().getContentResolver(), uri, new Runnable() { // from class: com.google.android.gms.internal.measurement.i9
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    l9.c();
                                }
                            }) : null;
                        } else {
                            t8VarC = n9.c(g9Var.a(), (String) he.n.l(null), new Runnable() { // from class: com.google.android.gms.internal.measurement.h9
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    l9.c();
                                }
                            });
                        }
                        Object objA2 = (t8VarC == null || (objB = t8VarC.b(this.b)) == null) ? null : a(objB);
                        if (objA2 == null) {
                            if (!f9Var2.f6515d && (strD = w8.c(g9Var.a()).b(this.b)) != null) {
                                objA = a(strD);
                            }
                            objA2 = objA == null ? this.f6680c : objA;
                        }
                        if (kVarA.c()) {
                            objA2 = strA == null ? this.f6680c : a(strA);
                        }
                        this.f6682e = objA2;
                        this.f6681d = i10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f6682e;
    }
}
