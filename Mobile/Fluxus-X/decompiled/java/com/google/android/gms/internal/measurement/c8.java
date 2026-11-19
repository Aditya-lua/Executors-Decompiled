package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c8 extends kb implements tc {
    private static final c8 zzf;
    private int zzb;
    private tb zzd = kb.z();
    private x7 zze;

    static {
        c8 c8Var = new c8();
        zzf = c8Var;
        kb.t(c8.class, c8Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", g8.class, "zze"});
        }
        if (i11 == 3) {
            return new c8();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new a8(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List F() {
        return this.zzd;
    }

    public final x7 G() {
        x7 x7Var = this.zze;
        return x7Var == null ? x7.H() : x7Var;
    }
}
