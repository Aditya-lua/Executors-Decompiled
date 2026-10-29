package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends gb implements pc {
    private static final x3 zzi;
    private int zzb;
    private int zzd;
    private pb zze = gb.A();
    private pb zzf = gb.A();
    private boolean zzg;
    private boolean zzh;

    static {
        x3 x3Var = new x3();
        zzi = x3Var;
        gb.u(x3.class, x3Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", h4.class, "zzf", z3.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new x3();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new w3(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final List H() {
        return this.zze;
    }

    public final int J() {
        return this.zze.size();
    }

    public final h4 K(int i10) {
        return (h4) this.zze.get(i10);
    }

    public final List L() {
        return this.zzf;
    }

    public final int N() {
        return this.zzf.size();
    }

    public final z3 O(int i10) {
        return (z3) this.zzf.get(i10);
    }

    public final /* synthetic */ void P(int i10, h4 h4Var) {
        h4Var.getClass();
        pb pbVar = this.zze;
        if (!pbVar.zza()) {
            this.zze = gb.B(pbVar);
        }
        this.zze.set(i10, h4Var);
    }

    public final /* synthetic */ void Q(int i10, z3 z3Var) {
        z3Var.getClass();
        pb pbVar = this.zzf;
        if (!pbVar.zza()) {
            this.zzf = gb.B(pbVar);
        }
        this.zzf.set(i10, z3Var);
    }
}
