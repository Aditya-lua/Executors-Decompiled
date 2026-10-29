package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class e5 extends gb implements pc {
    private static final e5 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        e5 e5Var = new e5();
        zzh = e5Var;
        gb.u(e5.class, e5Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new e5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new d5(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
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

    public final boolean K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final int N() {
        return this.zzg;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
