package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.k8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2557k8 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2557k8 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C2557k8 c2557k8 = new C2557k8();
        zzb = c2557k8;
        AbstractC2652t4.m11738i(C2557k8.class, c2557k8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2557k8();
        }
        C2546j8 c2546j8 = null;
        if (i11 == 4) {
            return new C2535i8(c2546j8);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
