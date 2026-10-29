package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2661u2 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2661u2 zzb;
    private InterfaceC2707y4 zzd = AbstractC2652t4.m11745x();

    static {
        C2661u2 c2661u2 = new C2661u2();
        zzb = c2661u2;
        AbstractC2652t4.m11738i(C2661u2.class, c2661u2);
    }

    /* JADX INFO: renamed from: B */
    public static C2650t2 m11765B() {
        return (C2650t2) zzb.m11756r();
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11767D(C2661u2 c2661u2, Iterable iterable) {
        InterfaceC2707y4 interfaceC2707y4 = c2661u2.zzd;
        if (!interfaceC2707y4.zzc()) {
            int size = interfaceC2707y4.size();
            c2661u2.zzd = interfaceC2707y4.mo11340r(size + size);
        }
        AbstractC2464c3.m11330d(iterable, c2661u2.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2639s2.class});
        }
        if (i11 == 3) {
            return new C2661u2();
        }
        C2672v2 c2672v2 = null;
        if (i11 == 4) {
            return new C2650t2(c2672v2);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
