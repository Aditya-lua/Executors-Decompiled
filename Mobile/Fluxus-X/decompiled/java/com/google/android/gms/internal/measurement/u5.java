package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class u5 extends kb implements tc {
    private static final u5 zzi;
    private int zzb;
    private int zzg;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    static {
        u5 u5Var = new u5();
        zzi = u5Var;
        kb.t(u5.class, u5Var);
    }

    public static u5 J() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new u5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new t5(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }

    public final int H() {
        return this.zzg;
    }

    public final String I() {
        return this.zzh;
    }
}
