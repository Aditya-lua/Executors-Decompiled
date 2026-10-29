package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class o5 extends gb implements pc {
    private static final o5 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        o5 o5Var = new o5();
        zzf = o5Var;
        gb.u(o5.class, o5Var);
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
            return new o5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new n5(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }
}
