package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class d8 extends t4 implements y5 {
    private static final d8 zzb;
    private int zzd;
    private int zzf;
    private u7 zzi;
    private boolean zzj;
    private boolean zzk;
    private e9 zzl;
    private String zze = "";
    private x4 zzg = t4.w();
    private y4 zzh = t4.x();

    static {
        d8 d8Var = new d8();
        zzb = d8Var;
        t4.i(d8.class, d8Var);
    }

    public static a8 B() {
        return (a8) zzb.r();
    }

    public static /* synthetic */ void D(d8 d8Var, z7 z7Var) {
        z7Var.getClass();
        x4 x4Var = d8Var.zzg;
        if (!x4Var.zzc()) {
            int size = x4Var.size();
            d8Var.zzg = x4Var.r(size + size);
        }
        d8Var.zzg.w(z7Var.zza());
    }

    public static /* synthetic */ void E(d8 d8Var, u7 u7Var) {
        u7Var.getClass();
        d8Var.zzi = u7Var;
        d8Var.zzd |= 4;
    }

    public static /* synthetic */ void F(d8 d8Var, String str) {
        d8Var.zzd |= 1;
        d8Var.zze = "ProxyBillingBroadcastReceiver";
    }

    public static /* synthetic */ void G(d8 d8Var, e9 e9Var) {
        e9Var.getClass();
        d8Var.zzl = e9Var;
        d8Var.zzd |= 32;
    }

    public static /* synthetic */ void H(d8 d8Var, int i10) {
        d8Var.zzf = i10 - 1;
        d8Var.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004\bဉ\u0005", new Object[]{"zzd", "zze", "zzf", b8.f7012a, "zzg", y7.f7349a, "zzh", a9.class, "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new d8();
        }
        c8 c8Var = null;
        if (i11 == 4) {
            return new a8(c8Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
