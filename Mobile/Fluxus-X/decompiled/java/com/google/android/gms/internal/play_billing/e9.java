package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class e9 extends t4 implements y5 {
    private static final e9 zzb;
    private int zzd;
    private int zze;

    static {
        e9 e9Var = new e9();
        zzb = e9Var;
        t4.i(e9.class, e9Var);
    }

    public static b9 B() {
        return (b9) zzb.r();
    }

    public static /* synthetic */ void D(e9 e9Var, int i10) {
        e9Var.zze = i10 - 1;
        e9Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", c9.f7024a});
        }
        if (i11 == 3) {
            return new e9();
        }
        d9 d9Var = null;
        if (i11 == 4) {
            return new b9(d9Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
