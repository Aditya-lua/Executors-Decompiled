package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends t4 implements y5 {
    private static final u2 zzb;
    private y4 zzd = t4.x();

    static {
        u2 u2Var = new u2();
        zzb = u2Var;
        t4.i(u2.class, u2Var);
    }

    public static t2 B() {
        return (t2) zzb.r();
    }

    public static /* synthetic */ void D(u2 u2Var, Iterable iterable) {
        y4 y4Var = u2Var.zzd;
        if (!y4Var.zzc()) {
            int size = y4Var.size();
            u2Var.zzd = y4Var.r(size + size);
        }
        c3.d(iterable, u2Var.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", s2.class});
        }
        if (i11 == 3) {
            return new u2();
        }
        v2 v2Var = null;
        if (i11 == 4) {
            return new t2(v2Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
