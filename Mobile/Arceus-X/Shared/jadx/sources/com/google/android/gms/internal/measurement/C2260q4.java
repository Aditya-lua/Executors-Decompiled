package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2260q4 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2260q4 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        C2260q4 c2260q4 = new C2260q4();
        zzf = c2260q4;
        AbstractC2086gb.m10057t(C2260q4.class, c2260q4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            InterfaceC2177lb interfaceC2177lb = C2314t4.f8662a;
            return AbstractC2086gb.m10058v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", interfaceC2177lb, "zze", interfaceC2177lb});
        }
        if (i11 == 3) {
            return new C2260q4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2242p4(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final int m10554G() {
        int iM10827a = C2350v4.m10827a(this.zzd);
        if (iM10827a == 0) {
            return 1;
        }
        return iM10827a;
    }

    /* JADX INFO: renamed from: H */
    public final int m10555H() {
        int iM10827a = C2350v4.m10827a(this.zze);
        if (iM10827a == 0) {
            return 1;
        }
        return iM10827a;
    }
}
