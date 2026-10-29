package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2667u8 extends AbstractC2652t4 implements InterfaceC2708y5 {
    private static final C2667u8 zzb;
    private int zzd;
    private InterfaceC2707y4 zze = AbstractC2652t4.m11745x();
    private String zzf = "";
    private boolean zzg;

    static {
        C2667u8 c2667u8 = new C2667u8();
        zzb = c2667u8;
        AbstractC2652t4.m11738i(C2667u8.class, c2667u8);
    }

    /* JADX INFO: renamed from: C */
    public static C2667u8 m11798C() {
        return zzb;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m11799D(C2667u8 c2667u8, boolean z10) {
        c2667u8.zzd |= 2;
        c2667u8.zzg = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2652t4
    /* JADX INFO: renamed from: p */
    public final Object mo11269p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2652t4.m11747z(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", C2645s8.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2667u8();
        }
        C2656t8 c2656t8 = null;
        if (i11 == 4) {
            return new C2612p8(c2656t8);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
