package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d4 extends kb implements tc {
    private static final d4 zzl;
    private int zzb;
    private int zzd;
    private String zze = BuildConfig.FLAVOR;
    private tb zzf = kb.z();
    private boolean zzg;
    private j4 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        d4 d4Var = new d4();
        zzl = d4Var;
        kb.t(d4.class, d4Var);
    }

    public static c4 S() {
        return (c4) zzl.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", f4.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new d4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new c4(bArr);
        }
        if (i11 == 5) {
            return zzl;
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

    public final List I() {
        return this.zzf;
    }

    public final int J() {
        return this.zzf.size();
    }

    public final f4 K(int i10) {
        return (f4) this.zzf.get(i10);
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final j4 M() {
        j4 j4Var = this.zzh;
        return j4Var == null ? j4.O() : j4Var;
    }

    public final boolean N() {
        return this.zzi;
    }

    public final boolean O() {
        return this.zzj;
    }

    public final boolean P() {
        return (this.zzb & 64) != 0;
    }

    public final boolean R() {
        return this.zzk;
    }

    public final /* synthetic */ void U(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void V(int i10, f4 f4Var) {
        f4Var.getClass();
        tb tbVar = this.zzf;
        if (!tbVar.zza()) {
            this.zzf = kb.B(tbVar);
        }
        this.zzf.set(i10, f4Var);
    }
}
