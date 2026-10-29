package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class l9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f6603g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile g9 f6604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f6605i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f9 f6606a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f6608d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f6609e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f6610f;

    static {
        new AtomicReference();
        ge.n.m(new Object() { // from class: com.google.android.gms.internal.measurement.j9
        }, "BuildInfo must be non-null");
        f6605i = new AtomicInteger();
    }

    public /* synthetic */ l9(f9 f9Var, String str, Object obj, boolean z10, byte[] bArr) {
        if (f9Var.f6440a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f6606a = f9Var;
        this.b = str;
        this.f6607c = obj;
        this.f6610f = false;
    }

    public static void b(final Context context) {
        if (f6604h != null || context == null) {
            return;
        }
        Object obj = f6603g;
        synchronized (obj) {
            try {
                if (f6604h == null) {
                    synchronized (obj) {
                        try {
                            g9 g9Var = f6604h;
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
                                f6604h = new l8(context, ge.t.a(new ge.s() { // from class: com.google.android.gms.internal.measurement.k9
                                    @Override // ge.s
                                    public final /* synthetic */ Object get() {
                                        Object obj2 = l9.f6603g;
                                        return x8.a(context);
                                    }
                                }));
                                f6605i.incrementAndGet();
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
        f6605i.incrementAndGet();
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 ge.k) = (r2v0 ge.k), (r2v0 ge.k), (r2v7 ge.k) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object d() {
        String strA;
        t8 t8VarC;
        String strD;
        Object objB;
        int i10 = f6605i.get();
        if (this.f6608d < i10) {
            synchronized (this) {
                try {
                    if (this.f6608d < i10) {
                        g9 g9Var = f6604h;
                        ge.k kVarA = ge.k.a();
                        Object objA = null;
                        if (g9Var == null || g9Var.b() == null) {
                            strA = null;
                        } else {
                            kVarA = (ge.k) ((ge.s) ge.n.l(g9Var.b())).get();
                            if (kVarA.c()) {
                                r8 r8Var = (r8) kVarA.b();
                                f9 f9Var = this.f6606a;
                                strA = r8Var.a(f9Var.f6440a, null, f9Var.f6441c, this.b);
                            } else {
                                strA = null;
                            }
                        }
                        ge.n.s(g9Var != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        f9 f9Var2 = this.f6606a;
                        Uri uri = f9Var2.f6440a;
                        if (uri != null) {
                            t8VarC = z8.a(g9Var.a(), uri) ? p8.c(g9Var.a().getContentResolver(), uri, new Runnable() { // from class: com.google.android.gms.internal.measurement.i9
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    l9.c();
                                }
                            }) : null;
                        } else {
                            t8VarC = n9.c(g9Var.a(), (String) ge.n.l(null), new Runnable() { // from class: com.google.android.gms.internal.measurement.h9
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    l9.c();
                                }
                            });
                        }
                        Object objA2 = (t8VarC == null || (objB = t8VarC.b(this.b)) == null) ? null : a(objB);
                        if (objA2 == null) {
                            if (!f9Var2.f6442d && (strD = w8.c(g9Var.a()).b(this.b)) != null) {
                                objA = a(strD);
                            }
                            objA2 = objA == null ? this.f6607c : objA;
                        }
                        if (kVarA.c()) {
                            objA2 = strA == null ? this.f6607c : a(strA);
                        }
                        this.f6609e = objA2;
                        this.f6608d = i10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f6609e;
    }
}
