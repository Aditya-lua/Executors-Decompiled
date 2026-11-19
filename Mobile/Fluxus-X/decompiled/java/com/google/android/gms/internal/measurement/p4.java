package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p4 extends kb implements tc {
    private static final p4 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = BuildConfig.FLAVOR;
    private tb zzg = kb.z();

    static {
        p4 p4Var = new p4();
        zzh = p4Var;
        kb.t(p4.class, p4Var);
    }

    public static p4 M() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", n4.f6720a, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new p4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new m4(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final boolean J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzg;
    }

    public final int L() {
        return this.zzg.size();
    }

    public final int O() {
        int iA = o4.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
