package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2100h6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2100h6 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        C2100h6 c2100h6 = new C2100h6();
        zzf = c2100h6;
        AbstractC2086gb.m10057t(C2100h6.class, c2100h6);
    }

    /* JADX INFO: renamed from: F */
    public static C2081g6 m10170F() {
        return (C2081g6) zzf.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", C2043e6.f8158a, "zze", C2119i6.f8244a});
        }
        if (i11 == 3) {
            return new C2100h6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2081g6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: H */
    public final int m10172H() {
        int iM9987a = C2062f6.m9987a(this.zzd);
        if (iM9987a == 0) {
            return 1;
        }
        return iM9987a;
    }

    /* JADX INFO: renamed from: J */
    public final int m10173J() {
        int iM10299a = C2136j6.m10299a(this.zze);
        if (iM10299a == 0) {
            return 1;
        }
        return iM10299a;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10174K(int i10) {
        this.zzd = i10 - 1;
        this.zzb |= 1;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10175M(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 2;
    }
}
