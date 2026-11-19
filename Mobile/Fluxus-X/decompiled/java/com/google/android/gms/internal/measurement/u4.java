package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class u4 extends kb implements tc {
    private static final u4 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        u4 u4Var = new u4();
        zzf = u4Var;
        kb.t(u4.class, u4Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            pb pbVar = x4.f6924a;
            return kb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", pbVar, "zze", pbVar});
        }
        if (i11 == 3) {
            return new u4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new t4(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int G() {
        int iA = z4.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int H() {
        int iA = z4.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
