package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class p7 extends t4 implements y5 {
    private static final p7 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        p7 p7Var = new p7();
        zzb = p7Var;
        t4.i(p7.class, p7Var);
    }

    public static /* synthetic */ void B(p7 p7Var, int i10) {
        p7Var.zzg = i10 - 1;
        p7Var.zzd |= 1;
    }

    public static n7 C() {
        return (n7) zzb.r();
    }

    public static /* synthetic */ void F(p7 p7Var, z7 z7Var) {
        p7Var.zzh = z7Var.zza();
        p7Var.zzd |= 2;
    }

    public static /* synthetic */ void G(p7 p7Var, o8 o8Var) {
        o8Var.getClass();
        p7Var.zzf = o8Var;
        p7Var.zze = 2;
    }

    public static /* synthetic */ void H(p7 p7Var, u8 u8Var) {
        u8Var.getClass();
        p7Var.zzf = u8Var;
        p7Var.zze = 4;
    }

    public static /* synthetic */ void I(p7 p7Var, p9 p9Var) {
        p9Var.getClass();
        p7Var.zzf = p9Var;
        p7Var.zze = 3;
    }

    public final u8 E() {
        return this.zze == 4 ? (u8) this.zzf : u8.C();
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", m7.f7184a, o8.class, p9.class, u8.class, "zzh", y7.f7349a});
        }
        if (i11 == 3) {
            return new p7();
        }
        o7 o7Var = null;
        if (i11 == 4) {
            return new n7(o7Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
