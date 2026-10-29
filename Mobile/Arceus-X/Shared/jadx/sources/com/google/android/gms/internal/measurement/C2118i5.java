package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2118i5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2118i5 zzd;
    private InterfaceC2249pb zzb = AbstractC2086gb.m10052A();

    static {
        C2118i5 c2118i5 = new C2118i5();
        zzd = c2118i5;
        AbstractC2086gb.m10057t(C2118i5.class, c2118i5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i11 == 3) {
            return new C2118i5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2099h5(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }
}
