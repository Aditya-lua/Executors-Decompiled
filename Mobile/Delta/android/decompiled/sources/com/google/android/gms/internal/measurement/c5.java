package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends gb implements pc {
    private static final c5 zzg;
    private int zzb;
    private String zzd = "";
    private pb zze = gb.A();
    private boolean zzf;

    static {
        c5 c5Var = new c5();
        zzg = c5Var;
        gb.u(c5.class, c5Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", m5.class, "zzf"});
        }
        if (i11 == 3) {
            return new c5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new b5(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }
}
