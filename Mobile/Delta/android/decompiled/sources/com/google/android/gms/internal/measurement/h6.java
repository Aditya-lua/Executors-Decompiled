package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class h6 extends gb implements pc {
    private static final h6 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        h6 h6Var = new h6();
        zzf = h6Var;
        gb.u(h6.class, h6Var);
    }

    public static g6 F() {
        return (g6) zzf.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", e6.f6425a, "zze", i6.f6491a});
        }
        if (i11 == 3) {
            return new h6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new g6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int H() {
        int iA = f6.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int J() {
        int iA = j6.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void K(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void L(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
