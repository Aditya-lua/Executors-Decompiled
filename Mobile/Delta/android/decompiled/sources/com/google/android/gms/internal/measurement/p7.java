package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class p7 extends gb implements pc {
    private static final p7 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        p7 p7Var = new p7();
        zzg = p7Var;
        gb.u(p7.class, p7Var);
    }

    public static i7 G() {
        return (i7) zzg.q();
    }

    public static p7 H() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", n7.f6682a, "zze", j7.f6556a, "zzf", l7.f6601a});
        }
        if (i11 == 3) {
            return new p7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new i7(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    public final k7 F() {
        k7 k7VarA = k7.a(this.zze);
        return k7VarA == null ? k7.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : k7VarA;
    }

    public final /* synthetic */ void J(k7 k7Var) {
        this.zze = k7Var.zza();
        this.zzb |= 2;
    }

    public final int L() {
        int iA = o7.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int N() {
        int iA = m7.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final /* synthetic */ void O(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void P(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 4;
    }
}
