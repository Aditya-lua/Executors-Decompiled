package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2225o5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2225o5 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C2225o5 c2225o5 = new C2225o5();
        zzf = c2225o5;
        AbstractC2086gb.m10057t(C2225o5.class, c2225o5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C2225o5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2207n5(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final String m10482F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final String m10483G() {
        return this.zze;
    }
}
