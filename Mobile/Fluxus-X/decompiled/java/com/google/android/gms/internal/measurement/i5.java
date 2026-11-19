package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class i5 extends kb implements tc {
    private static final i5 zzh;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        i5 i5Var = new i5();
        zzh = i5Var;
        kb.t(i5.class, i5Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new i5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new h5(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
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

    public final boolean J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final int L() {
        return this.zzg;
    }

    public final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
