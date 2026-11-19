package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class l7 extends t4 implements y5 {
    private static final l7 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private u7 zzh;
    private int zzi;

    static {
        l7 l7Var = new l7();
        zzb = l7Var;
        t4.i(l7.class, l7Var);
    }

    public static /* synthetic */ void B(l7 l7Var, u8 u8Var) {
        u8Var.getClass();
        l7Var.zzf = u8Var;
        l7Var.zze = 7;
    }

    public static /* synthetic */ void C(l7 l7Var, p9 p9Var) {
        p9Var.getClass();
        l7Var.zzf = p9Var;
        l7Var.zze = 6;
    }

    public static /* synthetic */ void D(l7 l7Var, int i10) {
        l7Var.zzg = i10 - 1;
        l7Var.zzd |= 1;
    }

    public static j7 E() {
        return (j7) zzb.r();
    }

    public static l7 G(byte[] bArr) {
        return (l7) t4.v(zzb, bArr);
    }

    public static /* synthetic */ void I(l7 l7Var, z7 z7Var) {
        l7Var.zzi = z7Var.zza();
        l7Var.zzd |= 4;
    }

    public static /* synthetic */ void J(l7 l7Var, u7 u7Var) {
        u7Var.getClass();
        l7Var.zzh = u7Var;
        l7Var.zzd |= 2;
    }

    public static /* synthetic */ void K(l7 l7Var, o8 o8Var) {
        o8Var.getClass();
        l7Var.zzf = o8Var;
        l7Var.zze = 4;
    }

    public final u8 H() {
        return this.zze == 7 ? (u8) this.zzf : u8.C();
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", m7.f7184a, "zzh", o8.class, "zzi", y7.f7349a, p9.class, u8.class});
        }
        if (i11 == 3) {
            return new l7();
        }
        k7 k7Var = null;
        if (i11 == 4) {
            return new j7(k7Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
