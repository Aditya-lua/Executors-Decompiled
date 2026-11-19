package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class l6 extends kb implements tc {
    private static final l6 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        l6 l6Var = new l6();
        zzf = l6Var;
        kb.t(l6.class, l6Var);
    }

    public static k6 F() {
        return (k6) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", i6.f6544a, "zze", m6.f6615a});
        }
        if (i11 == 3) {
            return new l6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new k6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int H() {
        int iA = j6.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int I() {
        int iA = n6.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void J(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void K(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
