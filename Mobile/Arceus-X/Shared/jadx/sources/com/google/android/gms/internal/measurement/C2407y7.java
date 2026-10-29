package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2407y7 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2407y7 zzf;
    private int zzb;
    private InterfaceC2249pb zzd = AbstractC2086gb.m10052A();
    private C2317t7 zze;

    static {
        C2407y7 c2407y7 = new C2407y7();
        zzf = c2407y7;
        AbstractC2086gb.m10057t(C2407y7.class, c2407y7);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", C2007c8.class, "zze"});
        }
        if (i11 == 3) {
            return new C2407y7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2371w7(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final List m11016F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final C2317t7 m11017G() {
        C2317t7 c2317t7 = this.zze;
        return c2317t7 == null ? C2317t7.m10763H() : c2317t7;
    }
}
