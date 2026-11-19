package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l7 extends kb implements tc {
    private static final l7 zzf;
    private int zzb;
    private int zzd;
    private sb zze = kb.x();

    static {
        l7 l7Var = new l7();
        zzf = l7Var;
        kb.t(l7.class, l7Var);
    }

    public static k7 K() {
        return (k7) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new l7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new k7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final List H() {
        return this.zze;
    }

    public final int I() {
        return this.zze.size();
    }

    public final long J(int i10) {
        return this.zze.w0(i10);
    }

    public final /* synthetic */ void L(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    public final /* synthetic */ void M(Iterable iterable) {
        sb sbVar = this.zze;
        if (!sbVar.zza()) {
            this.zze = kb.y(sbVar);
        }
        v9.h(iterable, this.zze);
    }
}
