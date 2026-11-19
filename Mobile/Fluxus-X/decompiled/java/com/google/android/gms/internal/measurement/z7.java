package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class z7 extends kb implements tc {
    private static final z7 zzf;
    private int zzb;
    private String zzd = BuildConfig.FLAVOR;
    private tb zze = kb.z();

    static {
        z7 z7Var = new z7();
        zzf = z7Var;
        kb.t(z7.class, z7Var);
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", g8.class});
        }
        if (i11 == 3) {
            return new z7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new y7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final List G() {
        return this.zze;
    }
}
