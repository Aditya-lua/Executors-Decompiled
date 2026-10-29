package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class m5 extends gb implements pc {
    private static final m5 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        m5 m5Var = new m5();
        zzf = m5Var;
        gb.u(m5.class, m5Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new m5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new l5(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }
}
