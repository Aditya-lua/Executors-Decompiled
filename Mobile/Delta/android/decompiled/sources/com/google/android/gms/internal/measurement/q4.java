package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class q4 extends gb implements pc {
    private static final q4 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        q4 q4Var = new q4();
        zzf = q4Var;
        gb.u(q4.class, q4Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            lb lbVar = t4.f6803a;
            return gb.v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", lbVar, "zze", lbVar});
        }
        if (i11 == 3) {
            return new q4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new p4(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int G() {
        int iA = v4.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int H() {
        int iA = v4.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
