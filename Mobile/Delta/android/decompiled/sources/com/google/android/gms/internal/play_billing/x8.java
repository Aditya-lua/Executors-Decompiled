package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class x8 extends t4 implements y5 {
    private static final x8 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private h8 zzg;
    private k8 zzh;

    static {
        x8 x8Var = new x8();
        zzb = x8Var;
        t4.i(x8.class, x8Var);
    }

    public static /* synthetic */ void B(x8 x8Var, i9 i9Var) {
        i9Var.getClass();
        x8Var.zzf = i9Var;
        x8Var.zze = 8;
    }

    public static /* synthetic */ void C(x8 x8Var, m9 m9Var) {
        x8Var.zzf = m9Var;
        x8Var.zze = 4;
    }

    public static v8 D() {
        return (v8) zzb.r();
    }

    public static /* synthetic */ void F(x8 x8Var, l7 l7Var) {
        x8Var.zzf = l7Var;
        x8Var.zze = 2;
    }

    public static /* synthetic */ void G(x8 x8Var, p7 p7Var) {
        x8Var.zzf = p7Var;
        x8Var.zze = 3;
    }

    public static /* synthetic */ void H(x8 x8Var, x7 x7Var) {
        x7Var.getClass();
        x8Var.zzf = x7Var;
        x8Var.zze = 7;
    }

    public static /* synthetic */ void I(x8 x8Var, d8 d8Var) {
        d8Var.getClass();
        x8Var.zzf = d8Var;
        x8Var.zze = 5;
    }

    public static /* synthetic */ void J(x8 x8Var, h8 h8Var) {
        h8Var.getClass();
        x8Var.zzg = h8Var;
        x8Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", l7.class, p7.class, m9.class, d8.class, "zzh", x7.class, i9.class});
        }
        if (i11 == 3) {
            return new x8();
        }
        w8 w8Var = null;
        if (i11 == 4) {
            return new v8(w8Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
