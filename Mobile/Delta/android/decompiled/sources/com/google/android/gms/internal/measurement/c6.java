package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class c6 extends gb implements pc {
    private static final c6 zzh;
    private int zzb;
    private int zzd;
    private f7 zze;
    private f7 zzf;
    private boolean zzg;

    static {
        c6 c6Var = new c6();
        zzh = c6Var;
        gb.u(c6.class, c6Var);
    }

    public static b6 O() {
        return (b6) zzh.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new c6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new b6(bArr);
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

    public final f7 H() {
        f7 f7Var = this.zze;
        return f7Var == null ? f7.Q() : f7Var;
    }

    public final boolean J() {
        return (this.zzb & 4) != 0;
    }

    public final f7 K() {
        f7 f7Var = this.zzf;
        return f7Var == null ? f7.Q() : f7Var;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final boolean N() {
        return this.zzg;
    }

    public final /* synthetic */ void P(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void Q(f7 f7Var) {
        f7Var.getClass();
        this.zze = f7Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void R(f7 f7Var) {
        this.zzf = f7Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void S(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }
}
