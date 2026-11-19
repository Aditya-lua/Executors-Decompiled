package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g8 extends kb implements tc {
    private static final g8 zzj;
    private int zzb;
    private int zzd;
    private tb zze = kb.z();
    private String zzf = BuildConfig.FLAVOR;
    private String zzg = BuildConfig.FLAVOR;
    private boolean zzh;
    private double zzi;

    static {
        g8 g8Var = new g8();
        zzj = g8Var;
        kb.t(g8.class, g8Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", e8.f6488a, "zze", g8.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new g8();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new d8(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List F() {
        return this.zze;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final String I() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zzb & 16) != 0;
    }

    public final double M() {
        return this.zzi;
    }

    public final int O() {
        int iA = f8.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
