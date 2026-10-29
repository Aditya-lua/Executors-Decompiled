package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2060f4 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2060f4 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        C2060f4 c2060f4 = new C2060f4();
        zzi = c2060f4;
        AbstractC2086gb.m10057t(C2060f4.class, c2060f4);
    }

    /* JADX INFO: renamed from: Q */
    public static C2060f4 m9967Q() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", C2022d4.f8148a, "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2060f4();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2003c4(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9969F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m9970G() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9971H() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m9972J() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final String m9973K() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m9974M() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final String m9975N() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m9976O() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: P */
    public final String m9977P() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: S */
    public final int m9978S() {
        int iM9927a = C2041e4.m9927a(this.zzd);
        if (iM9927a == 0) {
            return 1;
        }
        return iM9927a;
    }
}
