package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k5 extends kb implements tc {
    private static final k5 zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private e5 zzp;
    private o5 zzq;
    private u5 zzr;
    private q5 zzs;
    private m5 zzt;
    private String zze = BuildConfig.FLAVOR;
    private tb zzg = kb.z();
    private tb zzh = kb.z();
    private tb zzi = kb.z();
    private String zzj = BuildConfig.FLAVOR;
    private tb zzl = kb.z();
    private tb zzm = kb.z();
    private String zzn = BuildConfig.FLAVOR;
    private String zzo = BuildConfig.FLAVOR;

    static {
        k5 k5Var = new k5();
        zzu = k5Var;
        kb.t(k5.class, k5Var);
    }

    public static j5 X() {
        return (j5) zzu.p();
    }

    public static k5 Y() {
        return zzu;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", s5.class, "zzh", i5.class, "zzi", b4.class, "zzj", "zzk", "zzl", c8.class, "zzm", g5.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new k5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new j5(bArr);
        }
        if (i11 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final long G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final String I() {
        return this.zze;
    }

    public final List J() {
        return this.zzg;
    }

    public final int K() {
        return this.zzh.size();
    }

    public final i5 L(int i10) {
        return (i5) this.zzh.get(i10);
    }

    public final List M() {
        return this.zzi;
    }

    public final List N() {
        return this.zzl;
    }

    public final int O() {
        return this.zzl.size();
    }

    public final List P() {
        return this.zzm;
    }

    public final String R() {
        return this.zzn;
    }

    public final boolean S() {
        return (this.zzb & Barcode.FORMAT_ITF) != 0;
    }

    public final e5 U() {
        e5 e5Var = this.zzp;
        return e5Var == null ? e5.L() : e5Var;
    }

    public final boolean V() {
        return (this.zzb & Barcode.FORMAT_UPC_A) != 0;
    }

    public final u5 W() {
        u5 u5Var = this.zzr;
        return u5Var == null ? u5.J() : u5Var;
    }

    public final /* synthetic */ void Z(int i10, i5 i5Var) {
        i5Var.getClass();
        tb tbVar = this.zzh;
        if (!tbVar.zza()) {
            this.zzh = kb.B(tbVar);
        }
        this.zzh.set(i10, i5Var);
    }

    public final /* synthetic */ void a0() {
        this.zzi = kb.z();
    }

    public final /* synthetic */ void b0() {
        this.zzl = kb.z();
    }
}
