package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class i5 extends gb implements pc {
    private static final i5 zzd;
    private pb zzb = gb.A();

    static {
        i5 i5Var = new i5();
        zzd = i5Var;
        gb.u(i5.class, i5Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new i5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new h5(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
