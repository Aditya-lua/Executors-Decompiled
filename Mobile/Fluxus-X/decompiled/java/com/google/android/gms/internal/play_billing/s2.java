package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends t4 implements y5 {
    private static final s2 zzb;
    private int zzd;
    private x2 zze;
    private x2 zzf;
    private int zzg;

    static {
        s2 s2Var = new s2();
        zzb = s2Var;
        t4.i(s2.class, s2Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", a3.a()});
        }
        if (i11 == 3) {
            return new s2();
        }
        v2 v2Var = null;
        if (i11 == 4) {
            return new r2(v2Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
