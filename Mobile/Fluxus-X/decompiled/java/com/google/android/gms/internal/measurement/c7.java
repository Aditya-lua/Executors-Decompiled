package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c7 extends kb implements tc {
    private static final c7 zzh;
    private int zzb;
    private tb zzd = kb.z();
    private String zze = BuildConfig.FLAVOR;
    private String zzf = BuildConfig.FLAVOR;
    private int zzg;

    static {
        c7 c7Var = new c7();
        zzh = c7Var;
        kb.t(c7.class, c7Var);
    }

    public static z6 M() {
        return (z6) zzh.p();
    }

    public static z6 N(c7 c7Var) {
        gb gbVarP = zzh.p();
        gbVarP.x(c7Var);
        return (z6) gbVarP;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", e7.class, "zze", "zzf", "zzg", b7.f6403a});
        }
        if (i11 == 3) {
            return new c7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new z6(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List F() {
        return this.zzd;
    }

    public final int G() {
        return this.zzd.size();
    }

    public final e7 H(int i10) {
        return (e7) this.zzd.get(i10);
    }

    public final boolean I() {
        return (this.zzb & 1) != 0;
    }

    public final String J() {
        return this.zze;
    }

    public final boolean K() {
        return (this.zzb & 2) != 0;
    }

    public final String L() {
        return this.zzf;
    }

    public final /* synthetic */ void O(int i10, e7 e7Var) {
        e7Var.getClass();
        X();
        this.zzd.set(i10, e7Var);
    }

    public final /* synthetic */ void P(e7 e7Var) {
        e7Var.getClass();
        X();
        this.zzd.add(e7Var);
    }

    public final /* synthetic */ void R(Iterable iterable) {
        X();
        v9.h(iterable, this.zzd);
    }

    public final /* synthetic */ void S() {
        this.zzd = kb.z();
    }

    public final /* synthetic */ void U(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void V(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void X() {
        tb tbVar = this.zzd;
        if (tbVar.zza()) {
            return;
        }
        this.zzd = kb.B(tbVar);
    }
}
