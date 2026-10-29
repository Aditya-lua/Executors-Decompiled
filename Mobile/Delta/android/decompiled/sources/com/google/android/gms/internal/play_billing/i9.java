package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class i9 extends t4 implements y5 {
    private static final i9 zzb;
    private int zzd;
    private u7 zze;
    private long zzf;

    static {
        i9 i9Var = new i9();
        zzb = i9Var;
        t4.i(i9.class, i9Var);
    }

    public static f9 B() {
        return (f9) zzb.r();
    }

    public static /* synthetic */ void D(i9 i9Var, u7 u7Var) {
        u7Var.getClass();
        i9Var.zze = u7Var;
        i9Var.zzd |= 1;
    }

    public static /* synthetic */ void E(i9 i9Var, long j10) {
        i9Var.zzd |= 2;
        i9Var.zzf = j10;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new i9();
        }
        h9 h9Var = null;
        if (i11 == 4) {
            return new f9(h9Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
