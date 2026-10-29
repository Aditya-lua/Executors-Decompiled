package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l4 extends gb implements pc {
    private static final l4 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private pb zzg = gb.A();

    static {
        l4 l4Var = new l4();
        zzh = l4Var;
        gb.u(l4.class, l4Var);
    }

    public static l4 O() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", j4.f6555a, "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new l4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new i4(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 4) != 0;
    }

    public final boolean K() {
        return this.zzf;
    }

    public final List L() {
        return this.zzg;
    }

    public final int N() {
        return this.zzg.size();
    }

    public final int Q() {
        int iA = k4.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
