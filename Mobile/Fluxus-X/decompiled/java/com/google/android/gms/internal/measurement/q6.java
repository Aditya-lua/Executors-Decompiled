package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class q6 extends kb implements tc {
    private static final q6 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        q6 q6Var = new q6();
        zzf = q6Var;
        kb.t(q6.class, q6Var);
    }

    public static p6 J() {
        return (p6) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new q6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new p6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final long I() {
        return this.zze;
    }

    public final /* synthetic */ void K(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
