package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class a9 extends t4 implements y5 {
    private static final a9 zzb;
    private int zzd;
    private int zzf;
    private y4 zze = t4.x();
    private String zzg = "";

    static {
        a9 a9Var = new a9();
        zzb = a9Var;
        t4.i(a9.class, a9Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new a9();
        }
        z8 z8Var = null;
        if (i11 == 4) {
            return new y8(z8Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
