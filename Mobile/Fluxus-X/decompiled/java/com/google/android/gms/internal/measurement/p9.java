package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class p9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f6771g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static volatile k9 f6772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f6773i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9 f6774a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f6775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile int f6776d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f6777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f6778f;

    static {
        new AtomicReference();
        je.n.m(new Object() { // from class: com.google.android.gms.internal.measurement.n9
        }, "BuildInfo must be non-null");
        f6773i = new AtomicInteger();
    }

    public /* synthetic */ p9(j9 j9Var, String str, Object obj, boolean z10, byte[] bArr) {
        if (j9Var.f6561a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f6774a = j9Var;
        this.b = str;
        this.f6775c = obj;
        this.f6778f = false;
    }

    public static void b(final Context context) {
        if (f6772h != null || context == null) {
            return;
        }
        Object obj = f6771g;
        synchronized (obj) {
            try {
                if (f6772h == null) {
                    synchronized (obj) {
                        try {
                            k9 k9Var = f6772h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (k9Var == null || k9Var.a() != context) {
                                if (k9Var != null) {
                                    t8.f();
                                    r9.d();
                                    a9.e();
                                }
                                f6772h = new p8(context, je.t.a(new je.s() { // from class: com.google.android.gms.internal.measurement.o9
                                    @Override // je.s
                                    public final /* synthetic */ Object get() {
                                        Object obj2 = p9.f6771g;
                                        return b9.a(context);
                                    }
                                }));
                                f6773i.incrementAndGet();
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
        f6773i.incrementAndGet();
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 je.k) = (r2v0 je.k), (r2v0 je.k), (r2v7 je.k) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object d() {
        String strA;
        x8 x8VarC;
        String strD;
        Object objB;
        int i10 = f6773i.get();
        if (this.f6776d < i10) {
            synchronized (this) {
                try {
                    if (this.f6776d < i10) {
                        k9 k9Var = f6772h;
                        je.k kVarA = je.k.a();
                        Object objA = null;
                        if (k9Var == null || k9Var.b() == null) {
                            strA = null;
                        } else {
                            kVarA = (je.k) ((je.s) je.n.l(k9Var.b())).get();
                            if (kVarA.c()) {
                                v8 v8Var = (v8) kVarA.b();
                                j9 j9Var = this.f6774a;
                                strA = v8Var.a(j9Var.f6561a, null, j9Var.f6562c, this.b);
                            } else {
                                strA = null;
                            }
                        }
                        je.n.s(k9Var != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        j9 j9Var2 = this.f6774a;
                        Uri uri = j9Var2.f6561a;
                        if (uri != null) {
                            x8VarC = d9.a(k9Var.a(), uri) ? t8.c(k9Var.a().getContentResolver(), uri, new Runnable() { // from class: com.google.android.gms.internal.measurement.m9
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    p9.c();
                                }
                            }) : null;
                        } else {
                            x8VarC = r9.c(k9Var.a(), (String) je.n.l(null), new Runnable() { // from class: com.google.android.gms.internal.measurement.l9
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    p9.c();
                                }
                            });
                        }
                        Object objA2 = (x8VarC == null || (objB = x8VarC.b(this.b)) == null) ? null : a(objB);
                        if (objA2 == null) {
                            if (!j9Var2.f6563d && (strD = a9.c(k9Var.a()).b(this.b)) != null) {
                                objA = a(strD);
                            }
                            objA2 = objA == null ? this.f6775c : objA;
                        }
                        if (kVarA.c()) {
                            objA2 = strA == null ? this.f6775c : a(strA);
                        }
                        this.f6777e = objA2;
                        this.f6776d = i10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f6777e;
    }
}
