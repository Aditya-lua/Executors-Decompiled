package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends kb implements tc {
    private static final j4 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private String zzh = BuildConfig.FLAVOR;

    static {
        j4 j4Var = new j4();
        zzi = j4Var;
        kb.t(j4.class, j4Var);
    }

    public static j4 O() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", h4.f6536a, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new j4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new g4(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final boolean H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 16) != 0;
    }

    public final String N() {
        return this.zzh;
    }

    public final int R() {
        int iA = i4.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
