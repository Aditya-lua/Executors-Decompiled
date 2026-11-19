package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o6 extends kb implements tc {
    private static final o6 zzd;
    private tb zzb = kb.z();

    static {
        o6 o6Var = new o6();
        zzd = o6Var;
        kb.t(o6.class, o6Var);
    }

    public static h6 G() {
        return (h6) zzd.p();
    }

    public static o6 H() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", l6.class});
        }
        if (i11 == 3) {
            return new o6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new h6(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List F() {
        return this.zzb;
    }

    public final /* synthetic */ void I(Iterable iterable) {
        tb tbVar = this.zzb;
        if (!tbVar.zza()) {
            this.zzb = kb.B(tbVar);
        }
        v9.h(iterable, this.zzb);
    }
}
