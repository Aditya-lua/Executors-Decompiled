package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b4 extends kb implements tc {
    private static final b4 zzi;
    private int zzb;
    private int zzd;
    private tb zze = kb.z();
    private tb zzf = kb.z();
    private boolean zzg;
    private boolean zzh;

    static {
        b4 b4Var = new b4();
        zzi = b4Var;
        kb.t(b4.class, b4Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", l4.class, "zzf", d4.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new b4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new a4(bArr);
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

    public final int I() {
        return this.zze.size();
    }

    public final l4 J(int i10) {
        return (l4) this.zze.get(i10);
    }

    public final List K() {
        return this.zzf;
    }

    public final int L() {
        return this.zzf.size();
    }

    public final d4 M(int i10) {
        return (d4) this.zzf.get(i10);
    }

    public final /* synthetic */ void N(int i10, l4 l4Var) {
        l4Var.getClass();
        tb tbVar = this.zze;
        if (!tbVar.zza()) {
            this.zze = kb.B(tbVar);
        }
        this.zze.set(i10, l4Var);
    }

    public final /* synthetic */ void O(int i10, d4 d4Var) {
        d4Var.getClass();
        tb tbVar = this.zzf;
        if (!tbVar.zza()) {
            this.zzf = kb.B(tbVar);
        }
        this.zzf.set(i10, d4Var);
    }
}
