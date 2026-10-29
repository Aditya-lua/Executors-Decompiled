package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2261q5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2261q5 zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        C2261q5 c2261q5 = new C2261q5();
        zzi = c2261q5;
        AbstractC2086gb.m10057t(C2261q5.class, c2261q5);
    }

    /* JADX INFO: renamed from: K */
    public static C2261q5 m10556K() {
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
            return AbstractC2086gb.m10058v(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2261q5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2243p5(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final String m10558F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final String m10559G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: H */
    public final int m10560H() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: J */
    public final String m10561J() {
        return this.zzh;
    }
}
