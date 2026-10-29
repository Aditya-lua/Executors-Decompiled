package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class d7 extends gb implements pc {
    private static final d7 zzf;
    private int zzb;
    private int zzd = 1;
    private pb zze = gb.A();

    static {
        d7 d7Var = new d7();
        zzf = d7Var;
        gb.u(d7.class, d7Var);
    }

    public static b7 F() {
        return (b7) zzf.q();
    }

    @Override // com.google.android.gms.internal.measurement.gb
    public final Object E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return gb.v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", c7.f6401a, "zze", q6.class});
        }
        if (i11 == 3) {
            return new d7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new b7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    public final /* synthetic */ void G(q6 q6Var) {
        q6Var.getClass();
        pb pbVar = this.zze;
        if (!pbVar.zza()) {
            this.zze = gb.B(pbVar);
        }
        this.zze.add(q6Var);
    }
}
