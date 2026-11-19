package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class g6 extends kb implements tc {
    private static final g6 zzh;
    private int zzb;
    private int zzd;
    private j7 zze;
    private j7 zzf;
    private boolean zzg;

    static {
        g6 g6Var = new g6();
        zzh = g6Var;
        kb.t(g6.class, g6Var);
    }

    public static f6 M() {
        return (f6) zzh.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new g6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new f6(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final j7 H() {
        j7 j7Var = this.zze;
        return j7Var == null ? j7.O() : j7Var;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final j7 J() {
        j7 j7Var = this.zzf;
        return j7Var == null ? j7.O() : j7Var;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final boolean L() {
        return this.zzg;
    }

    public final /* synthetic */ void N(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void O(j7 j7Var) {
        j7Var.getClass();
        this.zze = j7Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void P(j7 j7Var) {
        this.zzf = j7Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void R(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }
}
