package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2262q6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2262q6 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        C2262q6 c2262q6 = new C2262q6();
        zzf = c2262q6;
        AbstractC2086gb.m10057t(C2262q6.class, c2262q6);
    }

    /* JADX INFO: renamed from: F */
    public static C2244p6 m10562F() {
        return (C2244p6) zzf.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C2262q6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2244p6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10564G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10565H(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
