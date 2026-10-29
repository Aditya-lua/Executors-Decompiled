package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class h4 extends gb implements pc {
    private static final h4 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private b4 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        h4 h4Var = new h4();
        zzj = h4Var;
        gb.u(h4.class, h4Var);
    }

    public static g4 P() {
        return (g4) zzj.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new h4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new g4(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final String H() {
        return this.zze;
    }

    public final b4 J() {
        b4 b4Var = this.zzf;
        return b4Var == null ? b4.P() : b4Var;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean N() {
        return (this.zzb & 32) != 0;
    }

    public final boolean O() {
        return this.zzi;
    }

    public final /* synthetic */ void Q(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
