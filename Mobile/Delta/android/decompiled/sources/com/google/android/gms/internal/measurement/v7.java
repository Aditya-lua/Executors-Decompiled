package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v7 extends gb implements pc {
    private static final v7 zzf;
    private int zzb;
    private String zzd = "";
    private pb zze = gb.A();

    static {
        v7 v7Var = new v7();
        zzf = v7Var;
        gb.u(v7.class, v7Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", c8.class});
        }
        if (i11 == 3) {
            return new v7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new u7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final List G() {
        return this.zze;
    }
}
