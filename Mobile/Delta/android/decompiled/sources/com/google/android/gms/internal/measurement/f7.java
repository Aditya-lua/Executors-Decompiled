package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f7 extends gb implements pc {
    private static final f7 zzg;
    private ob zzb = gb.y();
    private ob zzd = gb.y();
    private pb zze = gb.A();
    private pb zzf = gb.A();

    static {
        f7 f7Var = new f7();
        zzg = f7Var;
        gb.u(f7.class, f7Var);
    }

    public static e7 P() {
        return (e7) zzg.q();
    }

    public static f7 Q() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", m6.class, "zzf", h7.class});
        }
        if (i11 == 3) {
            return new f7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new e7(bArr);
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

    public final int J() {
        return this.zzd.size();
    }

    public final List K() {
        return this.zze;
    }

    public final int L() {
        return this.zze.size();
    }

    public final List N() {
        return this.zzf;
    }

    public final int O() {
        return this.zzf.size();
    }

    public final /* synthetic */ void R(Iterable iterable) {
        ob obVar = this.zzb;
        if (!obVar.zza()) {
            this.zzb = gb.z(obVar);
        }
        r9.i(iterable, this.zzb);
    }

    public final /* synthetic */ void S() {
        this.zzb = gb.y();
    }

    public final /* synthetic */ void T(Iterable iterable) {
        ob obVar = this.zzd;
        if (!obVar.zza()) {
            this.zzd = gb.z(obVar);
        }
        r9.i(iterable, this.zzd);
    }

    public final /* synthetic */ void U() {
        this.zzd = gb.y();
    }

    public final /* synthetic */ void V(Iterable iterable) {
        pb pbVar = this.zze;
        if (!pbVar.zza()) {
            this.zze = gb.B(pbVar);
        }
        r9.i(iterable, this.zze);
    }

    public final /* synthetic */ void W() {
        this.zze = gb.A();
    }

    public final /* synthetic */ void X(Iterable iterable) {
        pb pbVar = this.zzf;
        if (!pbVar.zza()) {
            this.zzf = gb.B(pbVar);
        }
        r9.i(iterable, this.zzf);
    }

    public final /* synthetic */ void Y() {
        this.zzf = gb.A();
    }
}
