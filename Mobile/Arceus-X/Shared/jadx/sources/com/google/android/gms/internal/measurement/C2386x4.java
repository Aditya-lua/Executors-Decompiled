package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2386x4 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2386x4 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        C2386x4 c2386x4 = new C2386x4();
        zzf = c2386x4;
        AbstractC2086gb.m10057t(C2386x4.class, c2386x4);
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
            return new C2386x4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2368w4(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final String m10970F() {
        return this.zzd;
    }
}
