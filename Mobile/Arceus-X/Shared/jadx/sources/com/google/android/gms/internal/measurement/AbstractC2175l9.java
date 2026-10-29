package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p169he.AbstractC6381k;
import p169he.C6384n;
import p169he.C6390t;
import p169he.InterfaceC6389s;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2175l9 {

    /* JADX INFO: renamed from: g */
    public static final Object f8395g = new Object();

    /* JADX INFO: renamed from: h */
    public static volatile AbstractC2084g9 f8396h;

    /* JADX INFO: renamed from: i */
    public static final AtomicInteger f8397i;

    /* JADX INFO: renamed from: a */
    public final C2065f9 f8398a;

    /* JADX INFO: renamed from: b */
    public final String f8399b;

    /* JADX INFO: renamed from: c */
    public Object f8400c;

    /* JADX INFO: renamed from: d */
    public volatile int f8401d = -1;

    /* JADX INFO: renamed from: e */
    public volatile Object f8402e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f8403f;

    static {
        new AtomicReference();
        C6384n.m27929m(new Object() { // from class: com.google.android.gms.internal.measurement.j9
        }, "BuildInfo must be non-null");
        f8397i = new AtomicInteger();
    }

    public /* synthetic */ AbstractC2175l9(C2065f9 c2065f9, String str, Object obj, boolean z10, byte[] bArr) {
        if (c2065f9.f8178a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.f8398a = c2065f9;
        this.f8399b = str;
        this.f8400c = obj;
        this.f8403f = false;
    }

    /* JADX INFO: renamed from: b */
    public static void m10361b(final Context context) {
        if (f8396h != null || context == null) {
            return;
        }
        Object obj = f8395g;
        synchronized (obj) {
            try {
                if (f8396h == null) {
                    synchronized (obj) {
                        try {
                            AbstractC2084g9 abstractC2084g9 = f8396h;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                context = applicationContext;
                            }
                            if (abstractC2084g9 == null || abstractC2084g9.mo10047a() != context) {
                                if (abstractC2084g9 != null) {
                                    C2246p8.m10530f();
                                    C2211n9.m10429d();
                                    C2372w8.m10917e();
                                }
                                f8396h = new C2174l8(context, C6390t.m27959a(new InterfaceC6389s() { // from class: com.google.android.gms.internal.measurement.k9
                                    @Override // p169he.InterfaceC6389s
                                    public final /* synthetic */ Object get() {
                                        Object obj2 = AbstractC2175l9.f8395g;
                                        return C2390x8.m10972a(context);
                                    }
                                }));
                                f8397i.incrementAndGet();
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

    /* JADX INFO: renamed from: c */
    public static void m10362c() {
        f8397i.incrementAndGet();
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo9792a(Object obj);

    /* JADX WARN: Code duplicated, block: B:16:0x004a A[PHI: r2
      0x004a: PHI (r2v1 he.k) = (r2v0 he.k), (r2v0 he.k), (r2v7 he.k) binds: [B:8:0x0016, B:10:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: d */
    public final Object m10363d() {
        String strM10626a;
        InterfaceC2318t8 interfaceC2318t8M10428c;
        String strM10918d;
        Object objMo10430b;
        int i10 = f8397i.get();
        if (this.f8401d < i10) {
            synchronized (this) {
                try {
                    if (this.f8401d < i10) {
                        AbstractC2084g9 abstractC2084g9 = f8396h;
                        AbstractC6381k abstractC6381kM27912a = AbstractC6381k.m27912a();
                        Object objMo9792a = null;
                        if (abstractC2084g9 == null || abstractC2084g9.mo10048b() == null) {
                            strM10626a = null;
                        } else {
                            abstractC6381kM27912a = (AbstractC6381k) ((InterfaceC6389s) C6384n.m27928l(abstractC2084g9.mo10048b())).get();
                            if (abstractC6381kM27912a.mo27884c()) {
                                C2282r8 c2282r8 = (C2282r8) abstractC6381kM27912a.mo27883b();
                                C2065f9 c2065f9 = this.f8398a;
                                strM10626a = c2282r8.m10626a(c2065f9.f8178a, null, c2065f9.f8180c, this.f8399b);
                            } else {
                                strM10626a = null;
                            }
                        }
                        C6384n.m27935s(abstractC2084g9 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        C2065f9 c2065f10 = this.f8398a;
                        Uri uri = c2065f10.f8178a;
                        if (uri != null) {
                            interfaceC2318t8M10428c = C2426z8.m11156a(abstractC2084g9.mo10047a(), uri) ? C2246p8.m10529c(abstractC2084g9.mo10047a().getContentResolver(), uri, new Runnable() { // from class: com.google.android.gms.internal.measurement.i9
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    AbstractC2175l9.m10362c();
                                }
                            }) : null;
                        } else {
                            interfaceC2318t8M10428c = C2211n9.m10428c(abstractC2084g9.mo10047a(), (String) C6384n.m27928l(null), new Runnable() { // from class: com.google.android.gms.internal.measurement.h9
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    AbstractC2175l9.m10362c();
                                }
                            });
                        }
                        Object objMo9792a2 = (interfaceC2318t8M10428c == null || (objMo10430b = interfaceC2318t8M10428c.mo10430b(this.f8399b)) == null) ? null : mo9792a(objMo10430b);
                        if (objMo9792a2 == null) {
                            if (!c2065f10.f8181d && (strM10918d = C2372w8.m10916c(abstractC2084g9.mo10047a()).mo10430b(this.f8399b)) != null) {
                                objMo9792a = mo9792a(strM10918d);
                            }
                            objMo9792a2 = objMo9792a == null ? this.f8400c : objMo9792a;
                        }
                        if (abstractC6381kM27912a.mo27884c()) {
                            objMo9792a2 = strM10626a == null ? this.f8400c : mo9792a(strM10626a);
                        }
                        this.f8402e = objMo9792a2;
                        this.f8401d = i10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f8402e;
    }
}
