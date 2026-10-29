package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y7 extends gb implements pc {
    private static final y7 zzf;
    private int zzb;
    private pb zzd = gb.A();
    private t7 zze;

    static {
        y7 y7Var = new y7();
        zzf = y7Var;
        gb.u(y7.class, y7Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", c8.class, "zze"});
        }
        if (i11 == 3) {
            return new y7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new w7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List F() {
        return this.zzd;
    }

    public final t7 G() {
        t7 t7Var = this.zze;
        return t7Var == null ? t7.H() : t7Var;
    }
}
