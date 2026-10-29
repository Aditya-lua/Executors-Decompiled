package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class q6 extends gb implements pc {
    private static final q6 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        q6 q6Var = new q6();
        zzf = q6Var;
        gb.u(q6.class, q6Var);
    }

    public static p6 F() {
        return (p6) zzf.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new q6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new p6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void H(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
