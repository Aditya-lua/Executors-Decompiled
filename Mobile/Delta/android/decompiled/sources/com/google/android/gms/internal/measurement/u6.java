package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class u6 extends gb implements pc {
    private static final u6 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private y5 zzf;

    static {
        u6 u6Var = new u6();
        zzg = u6Var;
        gb.u(u6.class, u6Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new u6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new t6(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
