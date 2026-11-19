package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class p9 extends t4 implements y5 {
    private static final p9 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        p9 p9Var = new p9();
        zzb = p9Var;
        t4.i(p9.class, p9Var);
    }

    public static n9 B() {
        return (n9) zzb.r();
    }

    public static /* synthetic */ void D(p9 p9Var, boolean z10) {
        p9Var.zzd |= 8;
        p9Var.zzh = z10;
    }

    public static /* synthetic */ void E(p9 p9Var, int i10) {
        p9Var.zzd |= 16;
        p9Var.zzi = i10;
    }

    public static /* synthetic */ void F(p9 p9Var, long j10) {
        p9Var.zzd |= 4;
        p9Var.zzg = j10;
    }

    public static /* synthetic */ void G(p9 p9Var, int i10) {
        p9Var.zzd |= 32;
        p9Var.zzj = i10;
    }

    public static /* synthetic */ void H(p9 p9Var, boolean z10) {
        p9Var.zzd |= 2;
        p9Var.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new p9();
        }
        o9 o9Var = null;
        if (i11 == 4) {
            return new n9(o9Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
