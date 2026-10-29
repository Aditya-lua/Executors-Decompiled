package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c8 extends gb implements pc {
    private static final c8 zzj;
    private int zzb;
    private int zzd;
    private pb zze = gb.A();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        c8 c8Var = new c8();
        zzj = c8Var;
        gb.u(c8.class, c8Var);
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", a8.f6372a, "zze", c8.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new c8();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new z7(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List F() {
        return this.zze;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final String J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean N() {
        return (this.zzb & 16) != 0;
    }

    public final double O() {
        return this.zzi;
    }

    public final int Q() {
        int iA = b8.a(this.zzd);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
