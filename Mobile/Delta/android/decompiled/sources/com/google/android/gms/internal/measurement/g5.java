package com.google.android.gms.internal.measurement;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g5 extends gb implements pc {
    private static final g5 zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private a5 zzp;
    private k5 zzq;
    private q5 zzr;
    private m5 zzs;
    private i5 zzt;
    private String zze = "";
    private pb zzg = gb.A();
    private pb zzh = gb.A();
    private pb zzi = gb.A();
    private String zzj = "";
    private pb zzl = gb.A();
    private pb zzm = gb.A();
    private String zzn = "";
    private String zzo = "";

    static {
        g5 g5Var = new g5();
        zzu = g5Var;
        gb.u(g5.class, g5Var);
    }

    public static f5 X() {
        return (f5) zzu.q();
    }

    public static g5 Y() {
        return zzu;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", o5.class, "zzh", e5.class, "zzi", x3.class, "zzj", "zzk", "zzl", y7.class, "zzm", c5.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i11 == 3) {
            return new g5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new f5(bArr);
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

    public final String J() {
        return this.zze;
    }

    public final List K() {
        return this.zzg;
    }

    public final int L() {
        return this.zzh.size();
    }

    public final e5 N(int i10) {
        return (e5) this.zzh.get(i10);
    }

    public final List O() {
        return this.zzi;
    }

    public final List P() {
        return this.zzl;
    }

    public final int Q() {
        return this.zzl.size();
    }

    public final List R() {
        return this.zzm;
    }

    public final String S() {
        return this.zzn;
    }

    public final boolean T() {
        return (this.zzb & 128) != 0;
    }

    public final a5 U() {
        a5 a5Var = this.zzp;
        return a5Var == null ? a5.N() : a5Var;
    }

    public final boolean V() {
        return (this.zzb & Barcode.FORMAT_UPC_A) != 0;
    }

    public final q5 W() {
        q5 q5Var = this.zzr;
        return q5Var == null ? q5.K() : q5Var;
    }

    public final /* synthetic */ void Z(int i10, e5 e5Var) {
        e5Var.getClass();
        pb pbVar = this.zzh;
        if (!pbVar.zza()) {
            this.zzh = gb.B(pbVar);
        }
        this.zzh.set(i10, e5Var);
    }

    public final /* synthetic */ void a0() {
        this.zzi = gb.A();
    }

    public final /* synthetic */ void b0() {
        this.zzl = gb.A();
    }
}
