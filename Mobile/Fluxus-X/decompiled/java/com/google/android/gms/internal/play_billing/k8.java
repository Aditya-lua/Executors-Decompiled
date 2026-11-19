package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class k8 extends t4 implements y5 {
    private static final k8 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        k8 k8Var = new k8();
        zzb = k8Var;
        t4.i(k8.class, k8Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new k8();
        }
        j8 j8Var = null;
        if (i11 == 4) {
            return new i8(j8Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
