package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends kb implements tc {
    private static final t7 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        t7 t7Var = new t7();
        zzg = t7Var;
        kb.t(t7.class, t7Var);
    }

    public static m7 G() {
        return (m7) zzg.p();
    }

    public static t7 H() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", r7.f6805a, "zze", n7.f6721a, "zzf", p7.f6769a});
        }
        if (i11 == 3) {
            return new t7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new m7(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final o7 F() {
        o7 o7VarA = o7.a(this.zze);
        return o7VarA == null ? o7.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : o7VarA;
    }

    public final /* synthetic */ void I(o7 o7Var) {
        this.zze = o7Var.zza();
        this.zzb |= 2;
    }

    public final int K() {
        int iA = s7.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int L() {
        int iA = q7.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void M(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void N(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
