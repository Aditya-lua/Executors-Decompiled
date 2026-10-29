package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class f4 extends gb implements pc {
    private static final f4 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        f4 f4Var = new f4();
        zzi = f4Var;
        gb.u(f4.class, f4Var);
    }

    public static f4 Q() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", d4.f6416a, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new f4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new c4(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final boolean H() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 4) != 0;
    }

    public final String K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final String N() {
        return this.zzg;
    }

    public final boolean O() {
        return (this.zzb & 16) != 0;
    }

    public final String P() {
        return this.zzh;
    }

    public final int S() {
        int iA = e4.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
