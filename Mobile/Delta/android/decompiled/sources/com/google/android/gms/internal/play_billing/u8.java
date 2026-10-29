package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class u8 extends t4 implements y5 {
    private static final u8 zzb;
    private int zzd;
    private y4 zze = t4.x();
    private String zzf = "";
    private boolean zzg;

    static {
        u8 u8Var = new u8();
        zzb = u8Var;
        t4.i(u8.class, u8Var);
    }

    public static u8 C() {
        return zzb;
    }

    public static /* synthetic */ void D(u8 u8Var, boolean z10) {
        u8Var.zzd |= 2;
        u8Var.zzg = z10;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", s8.class, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new u8();
        }
        t8 t8Var = null;
        if (i11 == 4) {
            return new p8(t8Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
