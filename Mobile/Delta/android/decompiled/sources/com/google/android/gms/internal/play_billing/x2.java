package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class x2 extends t4 implements y5 {
    private static final x2 zzb;
    private int zzd;
    private String zze = "";

    static {
        x2 x2Var = new x2();
        zzb = x2Var;
        t4.i(x2.class, x2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new x2();
        }
        y2 y2Var = null;
        if (i11 == 4) {
            return new w2(y2Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
