package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2004c5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2004c5 zzg;
    private int zzb;
    private String zzd = "";
    private InterfaceC2249pb zze = AbstractC2086gb.m10052A();
    private boolean zzf;

    static {
        C2004c5 c2004c5 = new C2004c5();
        zzg = c2004c5;
        AbstractC2086gb.m10057t(C2004c5.class, c2004c5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", C2189m5.class, "zzf"});
        }
        if (i11 == 3) {
            return new C2004c5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C1985b5(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final String m9845F() {
        return this.zzd;
    }
}
