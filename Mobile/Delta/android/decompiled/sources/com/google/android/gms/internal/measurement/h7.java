package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h7 extends gb implements pc {
    private static final h7 zzf;
    private int zzb;
    private int zzd;
    private ob zze = gb.y();

    static {
        h7 h7Var = new h7();
        zzf = h7Var;
        gb.u(h7.class, h7Var);
    }

    public static g7 L() {
        return (g7) zzf.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new h7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new g7(bArr);
        }
        if (i11 == 5) {
            return zzf;
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

    public final long K(int i10) {
        return this.zze.x0(i10);
    }

    public final /* synthetic */ void N(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void O(Iterable iterable) {
        ob obVar = this.zze;
        if (!obVar.zza()) {
            this.zze = gb.z(obVar);
        }
        r9.i(iterable, this.zze);
    }
}
