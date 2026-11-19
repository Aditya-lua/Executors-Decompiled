package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class h7 extends kb implements tc {
    private static final h7 zzf;
    private int zzb;
    private int zzd = 1;
    private tb zze = kb.z();

    static {
        h7 h7Var = new h7();
        zzf = h7Var;
        kb.t(h7.class, h7Var);
    }

    public static f7 F() {
        return (f7) zzf.p();
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return kb.u(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", g7.f6518a, "zze", u6.class});
        }
        if (i11 == 3) {
            return new h7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new f7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void G(u6 u6Var) {
        u6Var.getClass();
        tb tbVar = this.zze;
        if (!tbVar.zza()) {
            this.zze = kb.B(tbVar);
        }
        this.zze.add(u6Var);
    }
}
