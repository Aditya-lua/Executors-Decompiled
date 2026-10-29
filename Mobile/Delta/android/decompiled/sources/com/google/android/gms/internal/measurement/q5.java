package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class q5 extends gb implements pc {
    private static final q5 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        q5 q5Var = new q5();
        zzi = q5Var;
        gb.u(q5.class, q5Var);
    }

    public static q5 K() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new q5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new p5(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }

    public final int H() {
        return this.zzg;
    }

    public final String J() {
        return this.zzh;
    }
}
