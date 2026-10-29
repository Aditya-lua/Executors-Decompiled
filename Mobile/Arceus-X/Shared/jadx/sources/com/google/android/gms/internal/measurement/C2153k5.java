package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2153k5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2153k5 zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        C2153k5 c2153k5 = new C2153k5();
        zzi = c2153k5;
        AbstractC2086gb.m10057t(C2153k5.class, c2153k5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2153k5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2135j5(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }
}
