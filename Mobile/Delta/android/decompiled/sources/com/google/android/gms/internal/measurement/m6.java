package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class m6 extends gb implements pc {
    private static final m6 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        m6 m6Var = new m6();
        zzf = m6Var;
        gb.u(m6.class, m6Var);
    }

    public static l6 K() {
        return (l6) zzf.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new m6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new l6(bArr);
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

    public final long J() {
        return this.zze;
    }

    public final /* synthetic */ void L(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void N(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
