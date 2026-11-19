package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s6 extends kb implements tc {
    private static final s6 zzj;
    private int zzb;
    private tb zzd = kb.z();
    private String zze = BuildConfig.FLAVOR;
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        s6 s6Var = new s6();
        zzj = s6Var;
        kb.t(s6.class, s6Var);
    }

    public static r6 P() {
        return (r6) zzj.p();
    }

    private final void c0() {
        tb tbVar = this.zzd;
        if (tbVar.zza()) {
            return;
        }
        this.zzd = kb.B(tbVar);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", w6.class, "zze", "zzf", "zzg", "zzh", "zzi"});
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

    public final List F() {
        return this.zzd;
    }

    public final int G() {
        return this.zzd.size();
    }

    public final w6 H(int i10) {
        return (w6) this.zzd.get(i10);
    }

    public final String I() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 2) != 0;
    }

    public final long K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 4) != 0;
    }

    public final long M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zzb & 8) != 0;
    }

    public final int O() {
        return this.zzh;
    }

    public final /* synthetic */ void R(int i10, w6 w6Var) {
        w6Var.getClass();
        c0();
        this.zzd.set(i10, w6Var);
    }

    public final /* synthetic */ void S(w6 w6Var) {
        w6Var.getClass();
        c0();
        this.zzd.add(w6Var);
    }

    public final /* synthetic */ void U(Iterable iterable) {
        c0();
        v9.h(iterable, this.zzd);
    }

    public final /* synthetic */ void V() {
        this.zzd = kb.z();
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
