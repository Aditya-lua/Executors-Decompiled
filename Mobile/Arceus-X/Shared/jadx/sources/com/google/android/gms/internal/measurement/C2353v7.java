package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2353v7 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2353v7 zzf;
    private int zzb;
    private String zzd = "";
    private InterfaceC2249pb zze = AbstractC2086gb.m10052A();

    static {
        C2353v7 c2353v7 = new C2353v7();
        zzf = c2353v7;
        AbstractC2086gb.m10057t(C2353v7.class, c2353v7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", C2007c8.class});
        }
        if (i11 == 3) {
            return new C2353v7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2335u7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final String m10851F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final List m10852G() {
        return this.zze;
    }
}
