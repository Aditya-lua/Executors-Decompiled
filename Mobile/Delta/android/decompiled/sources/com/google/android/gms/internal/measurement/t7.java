package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends gb implements pc {
    private static final t7 zzd;
    private pb zzb = gb.A();

    static {
        t7 t7Var = new t7();
        zzd = t7Var;
        gb.u(t7.class, t7Var);
    }

    public static t7 H() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", v7.class});
        }
        if (i11 == 3) {
            return new t7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new s7(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List F() {
        return this.zzb;
    }

    public final int G() {
        return this.zzb.size();
    }
}
