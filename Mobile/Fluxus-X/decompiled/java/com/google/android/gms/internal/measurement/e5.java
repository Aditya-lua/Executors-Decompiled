package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e5 extends kb implements tc {
    private static final e5 zzi;
    private int zzb;
    private boolean zzg;
    private tb zzd = kb.z();
    private tb zze = kb.z();
    private tb zzf = kb.z();
    private tb zzh = kb.z();

    static {
        e5 e5Var = new e5();
        zzi = e5Var;
        kb.t(e5.class, e5Var);
    }

    public static e5 L() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", s4.class, "zze", u4.class, "zzf", b5.class, "zzg", "zzh", s4.class});
        }
        if (i11 == 3) {
            return new e5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new q4(bArr);
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

    public final boolean I() {
        return (this.zzb & 1) != 0;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzh;
    }
}
