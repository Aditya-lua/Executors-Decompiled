package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class o4 extends gb implements pc {
    private static final o4 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        o4 o4Var = new o4();
        zzg = o4Var;
        gb.u(o4.class, o4Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", t4.f6803a, "zze", r4.f6759a, "zzf", y4.f6954a});
        }
        if (i11 == 3) {
            return new o4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new n4(bArr);
        }
        if (i11 == 5) {
            return zzg;
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
        int iA = s4.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int J() {
        int iA = z4.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
