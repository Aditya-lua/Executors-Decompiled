package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class x4 extends gb implements pc {
    private static final x4 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        x4 x4Var = new x4();
        zzf = x4Var;
        gb.u(x4.class, x4Var);
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
            return new x4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new w4(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }
}
