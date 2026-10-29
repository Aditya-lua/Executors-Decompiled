package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class x7 extends t4 implements y5 {
    private static final x7 zzb;

    static {
        x7 x7Var = new x7();
        zzb = x7Var;
        t4.i(x7.class, x7Var);
    }

    public static x7 C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        w7 w7Var = null;
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0000", null);
        }
        if (i11 == 3) {
            return new x7();
        }
        if (i11 == 4) {
            return new v7(w7Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
