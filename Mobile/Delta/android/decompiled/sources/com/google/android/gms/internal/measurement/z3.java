package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z3 extends gb implements pc {
    private static final z3 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private pb zzf = gb.A();
    private boolean zzg;
    private f4 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        z3 z3Var = new z3();
        zzl = z3Var;
        gb.u(z3.class, z3Var);
    }

    public static y3 T() {
        return (y3) zzl.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", b4.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new z3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new y3(bArr);
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

    public final List J() {
        return this.zzf;
    }

    public final int K() {
        return this.zzf.size();
    }

    public final b4 L(int i10) {
        return (b4) this.zzf.get(i10);
    }

    public final boolean N() {
        return (this.zzb & 8) != 0;
    }

    public final f4 O() {
        f4 f4Var = this.zzh;
        return f4Var == null ? f4.Q() : f4Var;
    }

    public final boolean P() {
        return this.zzi;
    }

    public final boolean Q() {
        return this.zzj;
    }

    public final boolean R() {
        return (this.zzb & 64) != 0;
    }

    public final boolean S() {
        return this.zzk;
    }

    public final /* synthetic */ void U(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void V(int i10, b4 b4Var) {
        b4Var.getClass();
        pb pbVar = this.zzf;
        if (!pbVar.zza()) {
            this.zzf = gb.B(pbVar);
        }
        this.zzf.set(i10, b4Var);
    }
}
