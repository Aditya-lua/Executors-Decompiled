package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class m5 extends kb implements tc {
    private static final m5 zzd;
    private tb zzb = kb.z();

    static {
        m5 m5Var = new m5();
        zzd = m5Var;
        kb.t(m5.class, m5Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new m5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new l5(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
