package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2317t7 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2317t7 zzd;
    private InterfaceC2249pb zzb = AbstractC2086gb.m10052A();

    static {
        C2317t7 c2317t7 = new C2317t7();
        zzd = c2317t7;
        AbstractC2086gb.m10057t(C2317t7.class, c2317t7);
    }

    /* JADX INFO: renamed from: H */
    public static C2317t7 m10763H() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C2353v7.class});
        }
        if (i11 == 3) {
            return new C2317t7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2299s7(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final List m10765F() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: G */
    public final int m10766G() {
        return this.zzb.size();
    }
}
