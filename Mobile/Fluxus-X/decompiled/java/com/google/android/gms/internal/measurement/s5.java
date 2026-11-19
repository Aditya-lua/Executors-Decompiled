package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class s5 extends kb implements tc {
    private static final s5 zzf;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;

    static {
        s5 s5Var = new s5();
        zzf = s5Var;
        kb.t(s5.class, s5Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new s5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new r5(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final String G() {
        return this.zze;
    }
}
