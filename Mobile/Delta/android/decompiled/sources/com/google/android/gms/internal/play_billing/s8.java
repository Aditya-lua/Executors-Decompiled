package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class s8 extends t4 implements y5 {
    private static final s8 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        s8 s8Var = new s8();
        zzb = s8Var;
        t4.i(s8.class, s8Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t4
    public final Object p(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return t4.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", r8.f7225a, "zzf"});
        }
        if (i11 == 3) {
            return new s8();
        }
        t8 t8Var = null;
        if (i11 == 4) {
            return new q8(t8Var);
        }
        if (i11 == 5) {
            return zzb;
        }
        throw null;
    }
}
