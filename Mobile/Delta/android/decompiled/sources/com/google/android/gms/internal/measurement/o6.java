package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o6 extends gb implements pc {
    private static final o6 zzj;
    private int zzb;
    private pb zzd = gb.A();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        o6 o6Var = new o6();
        zzj = o6Var;
        gb.u(o6.class, o6Var);
    }

    public static n6 R() {
        return (n6) zzj.q();
    }

    private final void c0() {
        pb pbVar = this.zzd;
        if (pbVar.zza()) {
            return;
        }
        this.zzd = gb.B(pbVar);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", s6.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new o6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new n6(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List F() {
        return this.zzd;
    }

    public final int G() {
        return this.zzd.size();
    }

    public final s6 H(int i10) {
        return (s6) this.zzd.get(i10);
    }

    public final String J() {
        return this.zze;
    }

    public final boolean K() {
        return (this.zzb & 2) != 0;
    }

    public final long L() {
        return this.zzf;
    }

    public final boolean N() {
        return (this.zzb & 4) != 0;
    }

    public final long O() {
        return this.zzg;
    }

    public final boolean P() {
        return (this.zzb & 8) != 0;
    }

    public final int Q() {
        return this.zzh;
    }

    public final /* synthetic */ void S(int i10, s6 s6Var) {
        s6Var.getClass();
        c0();
        this.zzd.set(i10, s6Var);
    }

    public final /* synthetic */ void T(s6 s6Var) {
        s6Var.getClass();
        c0();
        this.zzd.add(s6Var);
    }

    public final /* synthetic */ void U(Iterable iterable) {
        c0();
        r9.i(iterable, this.zzd);
    }

    public final /* synthetic */ void V() {
        this.zzd = gb.A();
    }

    public final /* synthetic */ void W(int i10) {
        c0();
        this.zzd.remove(i10);
    }

    public final /* synthetic */ void X(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void Y(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }

    public final /* synthetic */ void Z(long j10) {
        this.zzb |= 4;
        this.zzg = j10;
    }

    public final /* synthetic */ void a0(long j10) {
        this.zzb |= 16;
        this.zzi = j10;
    }
}
