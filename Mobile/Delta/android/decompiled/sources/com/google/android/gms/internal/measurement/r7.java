package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class r7 extends gb implements pc {
    private static final r7 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        r7 r7Var = new r7();
        zzj = r7Var;
        gb.u(r7.class, r7Var);
    }

    public static q7 S() {
        return (q7) zzj.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new r7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new q7(bArr);
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

    public final boolean J() {
        return (this.zzb & 4) != 0;
    }

    public final String K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final long N() {
        return this.zzg;
    }

    public final boolean O() {
        return (this.zzb & 16) != 0;
    }

    public final float P() {
        return this.zzh;
    }

    public final boolean Q() {
        return (this.zzb & 32) != 0;
    }

    public final double R() {
        return this.zzi;
    }

    public final /* synthetic */ void T(long j10) {
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
