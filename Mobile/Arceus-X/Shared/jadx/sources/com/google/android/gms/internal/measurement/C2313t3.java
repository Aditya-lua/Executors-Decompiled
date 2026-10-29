package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2313t3 {

    /* JADX INFO: renamed from: a */
    public final C2399y f8658a;

    /* JADX INFO: renamed from: b */
    public final C2332u4 f8659b;

    /* JADX INFO: renamed from: c */
    public final C2332u4 f8660c;

    /* JADX INFO: renamed from: d */
    public final C2389x7 f8661d;

    public C2313t3() {
        C2399y c2399y = new C2399y();
        this.f8658a = c2399y;
        C2332u4 c2332u4 = new C2332u4(null, c2399y);
        this.f8660c = c2332u4;
        this.f8659b = c2332u4.m10778c();
        C2389x7 c2389x7 = new C2389x7();
        this.f8661d = c2389x7;
        c2332u4.m10780e("require", new C2054eh(c2389x7));
        c2389x7.m10971a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.x2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new C2092gh();
            }
        });
        c2332u4.m10780e("runtime.counter", new C2129j(Double.valueOf(0.0d)));
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2255q m10762a(C2332u4 c2332u4, C2007c8... c2007c8Arr) {
        InterfaceC2255q interfaceC2255qM10915b = InterfaceC2255q.f8587zo;
        for (C2007c8 c2007c8 : c2007c8Arr) {
            interfaceC2255qM10915b = C2370w6.m10915b(c2007c8);
            C2351v5.m10839l(this.f8660c);
            if ((interfaceC2255qM10915b instanceof C2273r) || (interfaceC2255qM10915b instanceof C2237p)) {
                interfaceC2255qM10915b = this.f8658a.m10990b(c2332u4, interfaceC2255qM10915b);
            }
        }
        return interfaceC2255qM10915b;
    }
}
