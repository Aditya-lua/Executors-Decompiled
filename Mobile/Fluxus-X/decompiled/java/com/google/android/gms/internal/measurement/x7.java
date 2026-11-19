package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x7 extends kb implements tc {
    private static final x7 zzd;
    private tb zzb = kb.z();

    static {
        x7 x7Var = new x7();
        zzd = x7Var;
        kb.t(x7.class, x7Var);
    }

    public static x7 H() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", z7.class});
        }
        if (i11 == 3) {
            return new x7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new w7(bArr);
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
