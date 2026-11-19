package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class l4 extends kb implements tc {
    private static final l4 zzj;
    private int zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private f4 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        l4 l4Var = new l4();
        zzj = l4Var;
        kb.t(l4.class, l4Var);
    }

    public static k4 N() {
        return (k4) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new l4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new k4(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final String H() {
        return this.zze;
    }

    public final f4 I() {
        f4 f4Var = this.zzf;
        return f4Var == null ? f4.N() : f4Var;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zzb & 32) != 0;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final /* synthetic */ void O(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
