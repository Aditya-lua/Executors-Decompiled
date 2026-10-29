package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2334u6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2334u6 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private C2405y5 zzf;

    static {
        C2334u6 c2334u6 = new C2334u6();
        zzg = c2334u6;
        AbstractC2086gb.m10057t(C2334u6.class, c2334u6);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2334u6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2316t6(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }
}
