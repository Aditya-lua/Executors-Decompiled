package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class u6 extends kb implements tc {
    private static final u6 zzf;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private long zze;

    static {
        u6 u6Var = new u6();
        zzf = u6Var;
        kb.t(u6.class, u6Var);
    }

    public static t6 F() {
        return (t6) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new u6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new t6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void H(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
