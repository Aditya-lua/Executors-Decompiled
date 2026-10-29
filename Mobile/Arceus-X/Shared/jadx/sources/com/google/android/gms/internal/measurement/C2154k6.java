package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2154k6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2154k6 zzd;
    private InterfaceC2249pb zzb = AbstractC2086gb.m10052A();

    static {
        C2154k6 c2154k6 = new C2154k6();
        zzd = c2154k6;
        AbstractC2086gb.m10057t(C2154k6.class, c2154k6);
    }

    /* JADX INFO: renamed from: G */
    public static C2024d6 m10312G() {
        return (C2024d6) zzd.m10074p();
    }

    /* JADX INFO: renamed from: H */
    public static C2154k6 m10313H() {
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
            return AbstractC2086gb.m10058v(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", C2100h6.class});
        }
        if (i11 == 3) {
            return new C2154k6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2024d6(bArr);
        }
        if (i11 == 5) {
            return zzd;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final List m10315F() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10316J(Iterable iterable) {
        InterfaceC2249pb interfaceC2249pb = this.zzb;
        if (!interfaceC2249pb.zza()) {
            this.zzb = AbstractC2086gb.m10053B(interfaceC2249pb);
        }
        AbstractC2283r9.m10627i(iterable, this.zzb);
    }
}
