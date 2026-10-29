package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2019d1 {

    /* JADX INFO: renamed from: a */
    public final C2313t3 f8141a;

    /* JADX INFO: renamed from: b */
    public C2332u4 f8142b;

    /* JADX INFO: renamed from: c */
    public final C1998c f8143c;

    /* JADX INFO: renamed from: d */
    public final C2111hh f8144d;

    public C2019d1() {
        C2313t3 c2313t3 = new C2313t3();
        this.f8141a = c2313t3;
        this.f8142b = c2313t3.f8659b.m10778c();
        this.f8143c = new C1998c();
        this.f8144d = new C2111hh();
        c2313t3.f8661d.m10971a("internal.registerCallback", new Callable() { // from class: com.google.android.gms.internal.measurement.c0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f8124a.m9906g();
            }
        });
        c2313t3.f8661d.m10971a("internal.eventLogger", new Callable() { // from class: com.google.android.gms.internal.measurement.a
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new C2408y8(this.f8088a.f8143c);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public final void m9900a(String str, Callable callable) {
        this.f8141a.f8661d.m10971a(str, callable);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m9901b(C1979b c1979b) throws C2020d2 {
        try {
            C1998c c1998c = this.f8143c;
            c1998c.m9833b(c1979b);
            this.f8141a.f8660c.m10780e("runtime.counter", new C2129j(Double.valueOf(0.0d)));
            this.f8144d.m10278b(this.f8142b.m10778c(), c1998c);
            return m9902c() || m9903d();
        } catch (Throwable th2) {
            throw new C2020d2(th2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9902c() {
        C1998c c1998c = this.f8143c;
        return !c1998c.m9834c().equals(c1998c.m9832a());
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9903d() {
        return !this.f8143c.m9837f().isEmpty();
    }

    /* JADX INFO: renamed from: e */
    public final C1998c m9904e() {
        return this.f8143c;
    }

    /* JADX INFO: renamed from: f */
    public final void m9905f(C2407y7 c2407y7) throws C2020d2 {
        AbstractC2147k abstractC2147k;
        try {
            C2313t3 c2313t3 = this.f8141a;
            this.f8142b = c2313t3.f8659b.m10778c();
            if (c2313t3.m10762a(this.f8142b, (C2007c8[]) c2407y7.m11016F().toArray(new C2007c8[0])) instanceof C2093h) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C2353v7 c2353v7 : c2407y7.m11017G().m10765F()) {
                List listM10852G = c2353v7.m10852G();
                String strM10851F = c2353v7.m10851F();
                Iterator it = listM10852G.iterator();
                while (it.hasNext()) {
                    InterfaceC2255q interfaceC2255qM10762a = c2313t3.m10762a(this.f8142b, (C2007c8) it.next());
                    if (!(interfaceC2255qM10762a instanceof C2201n)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    C2332u4 c2332u4 = this.f8142b;
                    if (c2332u4.m10779d(strM10851F)) {
                        InterfaceC2255q interfaceC2255qM10783h = c2332u4.m10783h(strM10851F);
                        if (!(interfaceC2255qM10783h instanceof AbstractC2147k)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strM10851F)));
                        }
                        abstractC2147k = (AbstractC2147k) interfaceC2255qM10783h;
                    } else {
                        abstractC2147k = null;
                    }
                    if (abstractC2147k == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strM10851F)));
                    }
                    abstractC2147k.mo9763h(this.f8142b, Collections.singletonList(interfaceC2255qM10762a));
                }
            }
        } catch (Throwable th2) {
            throw new C2020d2(th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC2147k m9906g() {
        return new C2035dh(this.f8144d);
    }
}
