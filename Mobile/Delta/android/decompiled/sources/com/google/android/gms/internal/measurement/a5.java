package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a5 extends gb implements pc {
    private static final a5 zzi;
    private int zzb;
    private boolean zzg;
    private pb zzd = gb.A();
    private pb zze = gb.A();
    private pb zzf = gb.A();
    private pb zzh = gb.A();

    static {
        a5 a5Var = new a5();
        zzi = a5Var;
        gb.u(a5.class, a5Var);
    }

    public static a5 N() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", o4.class, "zze", q4.class, "zzf", x4.class, "zzg", "zzh", o4.class});
        }
        if (i11 == 3) {
            return new a5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new m4(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List F() {
        return this.zzd;
    }

    public final List G() {
        return this.zze;
    }

    public final List H() {
        return this.zzf;
    }

    public final boolean J() {
        return (this.zzb & 1) != 0;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final List L() {
        return this.zzh;
    }
}
