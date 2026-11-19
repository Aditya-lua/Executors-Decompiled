package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w6 extends kb implements tc {
    private static final w6 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = BuildConfig.FLAVOR;
    private String zze = BuildConfig.FLAVOR;
    private tb zzi = kb.z();

    static {
        w6 w6Var = new w6();
        zzj = w6Var;
        kb.t(w6.class, w6Var);
    }

    public static v6 S() {
        return (v6) zzj.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", w6.class});
        }
        if (i11 == 3) {
            return new w6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new v6(bArr);
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

    public final String I() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 4) != 0;
    }

    public final long K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final float M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zzb & 16) != 0;
    }

    public final double O() {
        return this.zzh;
    }

    public final List P() {
        return this.zzi;
    }

    public final int R() {
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

    public final /* synthetic */ void b0(w6 w6Var) {
        w6Var.getClass();
        f0();
        this.zzi.add(w6Var);
    }

    public final /* synthetic */ void c0(Iterable iterable) {
        f0();
        v9.h(iterable, this.zzi);
    }

    public final /* synthetic */ void d0() {
        this.zzi = kb.z();
    }

    public final void f0() {
        tb tbVar = this.zzi;
        if (tbVar.zza()) {
            return;
        }
        this.zzi = kb.B(tbVar);
    }
}
