package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2224o4 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2224o4 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        C2224o4 c2224o4 = new C2224o4();
        zzg = c2224o4;
        AbstractC2086gb.m10057t(C2224o4.class, c2224o4);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", C2314t4.f8662a, "zze", C2278r4.f8607a, "zzf", C2404y4.f8863a});
        }
        if (i11 == 3) {
            return new C2224o4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2206n4(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final int m10478G() {
        int iM10827a = C2350v4.m10827a(this.zzd);
        if (iM10827a == 0) {
            return 1;
        }
        return iM10827a;
    }

    /* JADX INFO: renamed from: H */
    public final int m10479H() {
        int iM10673a = C2296s4.m10673a(this.zze);
        if (iM10673a == 0) {
            return 1;
        }
        return iM10673a;
    }

    /* JADX INFO: renamed from: J */
    public final int m10480J() {
        int iM11053a = C2422z4.m11053a(this.zzf);
        if (iM11053a == 0) {
            return 1;
        }
        return iM11053a;
    }
}
