package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class f4 extends kb implements tc {
    private static final f4 zzh;
    private int zzb;
    private p4 zzd;
    private j4 zze;
    private boolean zzf;
    private String zzg = BuildConfig.FLAVOR;

    static {
        f4 f4Var = new f4();
        zzh = f4Var;
        kb.t(f4.class, f4Var);
    }

    public static f4 N() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new f4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new e4(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final p4 G() {
        p4 p4Var = this.zzd;
        return p4Var == null ? p4.M() : p4Var;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final j4 I() {
        j4 j4Var = this.zze;
        return j4Var == null ? j4.O() : j4Var;
    }

    public final boolean J() {
        return (this.zzb & 4) != 0;
    }

    public final boolean K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final String M() {
        return this.zzg;
    }

    public final /* synthetic */ void O(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
