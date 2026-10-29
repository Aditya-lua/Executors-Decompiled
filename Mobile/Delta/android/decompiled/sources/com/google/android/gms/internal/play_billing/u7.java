package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class u7 extends t4 implements y5 {
    private static final u7 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private int zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        u7 u7Var = new u7();
        zzb = u7Var;
        t4.i(u7.class, u7Var);
    }

    public static /* synthetic */ void B(u7 u7Var, int i10) {
        u7Var.zzd |= 1;
        u7Var.zze = i10;
    }

    public static q7 C() {
        return (q7) zzb.r();
    }

    public static /* synthetic */ void E(u7 u7Var, String str) {
        u7Var.zzd |= 8;
        u7Var.zzh = str;
    }

    public static /* synthetic */ void F(u7 u7Var, String str) {
        str.getClass();
        u7Var.zzd |= 2;
        u7Var.zzf = str;
    }

    public static /* synthetic */ void G(u7 u7Var, int i10) {
        u7Var.zzd |= 32;
        u7Var.zzj = i10;
    }

    public static /* synthetic */ void H(u7 u7Var, int i10) {
        u7Var.zzd |= 16;
        u7Var.zzi = i10;
    }

    public static /* synthetic */ void I(u7 u7Var, s7 s7Var) {
        u7Var.zzg = s7Var.zza();
        u7Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004\bင\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", r7.f7224a, "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new u7();
        }
        t7 t7Var = null;
        if (i11 == 4) {
            return new q7(t7Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
