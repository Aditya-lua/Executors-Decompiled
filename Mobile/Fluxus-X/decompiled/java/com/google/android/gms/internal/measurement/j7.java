package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j7 extends kb implements tc {
    private static final j7 zzg;
    private sb zzb = kb.x();
    private sb zzd = kb.x();
    private tb zze = kb.z();
    private tb zzf = kb.z();

    static {
        j7 j7Var = new j7();
        zzg = j7Var;
        kb.t(j7.class, j7Var);
    }

    public static i7 N() {
        return (i7) zzg.p();
    }

    public static j7 O() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", q6.class, "zzf", l7.class});
        }
        if (i11 == 3) {
            return new j7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new i7(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List F() {
        return this.zzb;
    }

    public final int G() {
        return this.zzb.size();
    }

    public final List H() {
        return this.zzd;
    }

    public final int I() {
        return this.zzd.size();
    }

    public final List J() {
        return this.zze;
    }

    public final int K() {
        return this.zze.size();
    }

    public final List L() {
        return this.zzf;
    }

    public final int M() {
        return this.zzf.size();
    }

    public final /* synthetic */ void P(Iterable iterable) {
        sb sbVar = this.zzb;
        if (!sbVar.zza()) {
            this.zzb = kb.y(sbVar);
        }
        v9.h(iterable, this.zzb);
    }

    public final /* synthetic */ void R() {
        this.zzb = kb.x();
    }

    public final /* synthetic */ void S(Iterable iterable) {
        sb sbVar = this.zzd;
        if (!sbVar.zza()) {
            this.zzd = kb.y(sbVar);
        }
        v9.h(iterable, this.zzd);
    }

    public final /* synthetic */ void U() {
        this.zzd = kb.x();
    }

    public final /* synthetic */ void V(Iterable iterable) {
        tb tbVar = this.zze;
        if (!tbVar.zza()) {
            this.zze = kb.B(tbVar);
        }
        v9.h(iterable, this.zze);
    }

    public final /* synthetic */ void W() {
        this.zze = kb.z();
    }

    public final /* synthetic */ void X(Iterable iterable) {
        tb tbVar = this.zzf;
        if (!tbVar.zza()) {
            this.zzf = kb.B(tbVar);
        }
        v9.h(iterable, this.zzf);
    }

    public final /* synthetic */ void Y() {
        this.zzf = kb.z();
    }
}
