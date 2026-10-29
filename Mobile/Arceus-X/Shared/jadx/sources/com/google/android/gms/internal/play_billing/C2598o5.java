package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2598o5 {

    /* JADX INFO: renamed from: b */
    public static final InterfaceC2675v5 f9180b = new C2576m5();

    /* JADX INFO: renamed from: a */
    public final InterfaceC2675v5 f9181a;

    public C2598o5() {
        C2597o4 c2597o4M11633c = C2597o4.m11633c();
        int i10 = C2486e3.f8956a;
        this.f9181a = new C2587n5(c2597o4M11633c, f9180b);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2522h6 m11634a(Class cls) {
        AbstractC2654t6 abstractC2654t6 = C2533i6.f9048a;
        if (!AbstractC2652t4.class.isAssignableFrom(cls)) {
            int i10 = C2486e3.f8956a;
        }
        InterfaceC2664u5 interfaceC2664u5Mo11592a = this.f9181a.mo11592a(cls);
        if (interfaceC2664u5Mo11592a.zzb()) {
            int i11 = C2486e3.f8956a;
            return C2456b6.m11315g(C2533i6.m11493r(), C2531i4.m11470a(), interfaceC2664u5Mo11592a.zza());
        }
        int i12 = C2486e3.f8956a;
        return C2445a6.m11203x(cls, interfaceC2664u5Mo11592a, C2478d6.m11366a(), C2543j5.m11508a(), C2533i6.m11493r(), interfaceC2664u5Mo11592a.zzc() + (-1) != 1 ? C2531i4.m11470a() : null, C2653t5.m11759a());
    }
}
