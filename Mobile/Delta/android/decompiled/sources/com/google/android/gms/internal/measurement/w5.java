package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w5 extends gb implements pc {
    private static final w5 zzn;
    private int zzb;
    private long zzg;
    private long zzk;
    private ic zzl = ic.a();
    private ic zzm = ic.a();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        w5 w5Var = new w5();
        zzn = w5Var;
        gb.u(w5.class, w5Var);
    }

    public static s5 h0() {
        return (s5) zzn.q();
    }

    public static w5 i0() {
        return zzn;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", t5.f6804a, "zzm", u5.f6825a});
        }
        if (i11 == 3) {
            return new w5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new s5(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        throw null;
    }

    public final /* synthetic */ void F(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void H(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void J() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final /* synthetic */ void K(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void L() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void N(long j10) {
        this.zzb |= 128;
        this.zzk = j10;
    }

    public final /* synthetic */ Map O() {
        if (!this.zzl.f()) {
            this.zzl = this.zzl.c();
        }
        return this.zzl;
    }

    public final /* synthetic */ Map P() {
        if (!this.zzm.f()) {
            this.zzm = this.zzm.c();
        }
        return this.zzm;
    }

    public final boolean R() {
        return (this.zzb & 1) != 0;
    }

    public final String S() {
        return this.zzd;
    }

    public final boolean T() {
        return (this.zzb & 2) != 0;
    }

    public final String U() {
        return this.zze;
    }

    public final boolean V() {
        return (this.zzb & 4) != 0;
    }

    public final String W() {
        return this.zzf;
    }

    public final boolean X() {
        return (this.zzb & 8) != 0;
    }

    public final long Y() {
        return this.zzg;
    }

    public final boolean Z() {
        return (this.zzb & 16) != 0;
    }

    public final String a0() {
        return this.zzh;
    }

    public final boolean b0() {
        return (this.zzb & 32) != 0;
    }

    public final String c0() {
        return this.zzi;
    }

    public final boolean d0() {
        return (this.zzb & 64) != 0;
    }

    public final String e0() {
        return this.zzj;
    }

    public final boolean f0() {
        return (this.zzb & 128) != 0;
    }

    public final long g0() {
        return this.zzk;
    }

    public final /* synthetic */ void j0(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void k0() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void l0(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void m0() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void n0(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void o0() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void p0(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }
}
