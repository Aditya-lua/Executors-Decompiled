package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class g5 extends kb implements tc {
    private static final g5 zzg;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private tb zze = kb.z();
    private boolean zzf;

    static {
        g5 g5Var = new g5();
        zzg = g5Var;
        kb.t(g5.class, g5Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", q5.class, "zzf"});
        }
        if (i11 == 3) {
            return new g5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new f5(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }
}
