package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s6 extends gb implements pc {
    private static final s6 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private pb zzi = gb.A();

    static {
        s6 s6Var = new s6();
        zzj = s6Var;
        gb.u(s6.class, s6Var);
    }

    public static r6 T() {
        return (r6) zzj.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", s6.class});
        }
        if (i11 == 3) {
            return new s6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new r6(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final String G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final String J() {
        return this.zze;
    }

    public final boolean K() {
        return (this.zzb & 4) != 0;
    }

    public final long L() {
        return this.zzf;
    }

    public final boolean N() {
        return (this.zzb & 8) != 0;
    }

    public final float O() {
        return this.zzg;
    }

    public final boolean P() {
        return (this.zzb & 16) != 0;
    }

    public final double Q() {
        return this.zzh;
    }

    public final List R() {
        return this.zzi;
    }

    public final int S() {
        return this.zzi.size();
    }

    public final /* synthetic */ void U(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void V(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void W() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void X(long j10) {
        this.zzb |= 4;
        this.zzf = j10;
    }

    public final /* synthetic */ void Y() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void Z(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    public final /* synthetic */ void a0() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final /* synthetic */ void b0(s6 s6Var) {
        s6Var.getClass();
        f0();
        this.zzi.add(s6Var);
    }

    public final /* synthetic */ void c0(Iterable iterable) {
        f0();
        r9.i(iterable, this.zzi);
    }

    public final /* synthetic */ void d0() {
        this.zzi = gb.A();
    }

    public final void f0() {
        pb pbVar = this.zzi;
        if (pbVar.zza()) {
            return;
        }
        this.zzi = gb.B(pbVar);
    }
}
