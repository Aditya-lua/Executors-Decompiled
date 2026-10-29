package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y6 extends gb implements pc {
    private static final y6 zzh;
    private int zzb;
    private pb zzd = gb.A();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        y6 y6Var = new y6();
        zzh = y6Var;
        gb.u(y6.class, y6Var);
    }

    public static v6 O() {
        return (v6) zzh.q();
    }

    public static v6 P(y6 y6Var) {
        cb cbVarQ = zzh.q();
        cbVarQ.v(y6Var);
        return (v6) cbVarQ;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", a7.class, "zze", "zzf", "zzg", x6.f6896a});
        }
        if (i11 == 3) {
            return new y6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new v6(bArr);
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

    public final a7 H(int i10) {
        return (a7) this.zzd.get(i10);
    }

    public final boolean J() {
        return (this.zzb & 1) != 0;
    }

    public final String K() {
        return this.zze;
    }

    public final boolean L() {
        return (this.zzb & 2) != 0;
    }

    public final String N() {
        return this.zzf;
    }

    public final /* synthetic */ void Q(int i10, a7 a7Var) {
        a7Var.getClass();
        X();
        this.zzd.set(i10, a7Var);
    }

    public final /* synthetic */ void R(a7 a7Var) {
        a7Var.getClass();
        X();
        this.zzd.add(a7Var);
    }

    public final /* synthetic */ void S(Iterable iterable) {
        X();
        r9.i(iterable, this.zzd);
    }

    public final /* synthetic */ void T() {
        this.zzd = gb.A();
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
        pb pbVar = this.zzd;
        if (pbVar.zza()) {
            return;
        }
        this.zzd = gb.B(pbVar);
    }
}
