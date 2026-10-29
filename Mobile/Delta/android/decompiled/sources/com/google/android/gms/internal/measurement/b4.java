package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class b4 extends gb implements pc {
    private static final b4 zzh;
    private int zzb;
    private l4 zzd;
    private f4 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        b4 b4Var = new b4();
        zzh = b4Var;
        gb.u(b4.class, b4Var);
    }

    public static b4 P() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new b4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new a4(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final l4 G() {
        l4 l4Var = this.zzd;
        return l4Var == null ? l4.O() : l4Var;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final f4 J() {
        f4 f4Var = this.zze;
        return f4Var == null ? f4.Q() : f4Var;
    }

    public final boolean K() {
        return (this.zzb & 4) != 0;
    }

    public final boolean L() {
        return this.zzf;
    }

    public final boolean N() {
        return (this.zzb & 8) != 0;
    }

    public final String O() {
        return this.zzg;
    }

    public final /* synthetic */ void Q(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
