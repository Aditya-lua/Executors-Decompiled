package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends kb implements tc {
    private static final s4 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        s4 s4Var = new s4();
        zzg = s4Var;
        kb.t(s4.class, s4Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", x4.f6924a, "zze", v4.f6876a, "zzf", c5.f6462a});
        }
        if (i11 == 3) {
            return new s4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new r4(bArr);
        }
        if (i11 == 5) {
            return zzg;
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
        int iA = w4.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int I() {
        int iA = d5.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
