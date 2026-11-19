package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class o8 extends t4 implements y5 {
    private static final o8 zzb;
    private int zzd;
    private int zze;

    static {
        o8 o8Var = new o8();
        zzb = o8Var;
        t4.i(o8.class, o8Var);
    }

    public static l8 B() {
        return (l8) zzb.r();
    }

    public static /* synthetic */ void D(o8 o8Var, int i10) {
        o8Var.zze = i10 - 1;
        o8Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", m8.f7185a});
        }
        if (i11 == 3) {
            return new o8();
        }
        n8 n8Var = null;
        if (i11 == 4) {
            return new l8(n8Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
