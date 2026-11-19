package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class v7 extends kb implements tc {
    private static final v7 zzj;
    private int zzb;
    private long zzd;
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        v7 v7Var = new v7();
        zzj = v7Var;
        kb.t(v7.class, v7Var);
    }

    public static u7 R() {
        return (u7) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new v7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new u7(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final long G() {
        return this.zzd;
    }

    public final String H() {
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

    public final long L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 16) != 0;
    }

    public final float N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zzb & 32) != 0;
    }

    public final double P() {
        return this.zzi;
    }

    public final /* synthetic */ void S(long j10) {
        this.zzb |= 1;
        this.zzd = j10;
    }

    public final /* synthetic */ void U(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void V(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void W() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void X(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }

    public final /* synthetic */ void Y() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void Z(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    public final /* synthetic */ void a0() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }
}
