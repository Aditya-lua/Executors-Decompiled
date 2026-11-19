package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class m9 extends t4 implements y5 {
    private static final m9 zzb;
    private int zzd;
    private int zze;

    static {
        m9 m9Var = new m9();
        zzb = m9Var;
        t4.i(m9.class, m9Var);
    }

    public static m9 C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", k9.f7126a});
        }
        if (i11 == 3) {
            return new m9();
        }
        l9 l9Var = null;
        if (i11 == 4) {
            return new j9(l9Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
