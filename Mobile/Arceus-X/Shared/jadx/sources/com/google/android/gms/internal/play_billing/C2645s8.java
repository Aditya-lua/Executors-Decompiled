package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2645s8 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2645s8 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C2645s8 c2645s8 = new C2645s8();
        zzb = c2645s8;
        AbstractC2652t4.m11738i(C2645s8.class, c2645s8);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", C2634r8.f9216a, "zzf"});
        }
        if (i11 == 3) {
            return new C2645s8();
        }
        C2656t8 c2656t8 = null;
        if (i11 == 4) {
            return new C2623q8(c2656t8);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
