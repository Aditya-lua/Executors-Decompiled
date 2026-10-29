package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k6 extends gb implements pc {
    private static final k6 zzd;
    private pb zzb = gb.A();

    static {
        k6 k6Var = new k6();
        zzd = k6Var;
        gb.u(k6.class, k6Var);
    }

    public static d6 G() {
        return (d6) zzd.q();
    }

    public static k6 H() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", h6.class});
        }
        if (i11 == 3) {
            return new k6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new d6(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List F() {
        return this.zzb;
    }

    public final /* synthetic */ void J(Iterable iterable) {
        pb pbVar = this.zzb;
        if (!pbVar.zza()) {
            this.zzb = gb.B(pbVar);
        }
        r9.i(iterable, this.zzb);
    }
}
