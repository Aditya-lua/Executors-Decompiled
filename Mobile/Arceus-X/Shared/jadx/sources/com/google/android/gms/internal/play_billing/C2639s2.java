package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2639s2 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2639s2 zzb;
    private int zzd;
    private C2694x2 zze;
    private C2694x2 zzf;
    private int zzg;

    static {
        C2639s2 c2639s2 = new C2639s2();
        zzb = c2639s2;
        AbstractC2652t4.m11738i(C2639s2.class, c2639s2);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", C2442a3.m11170a()});
        }
        if (i11 == 3) {
            return new C2639s2();
        }
        C2672v2 c2672v2 = null;
        if (i11 == 4) {
            return new C2628r2(c2672v2);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
