package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2190m6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2190m6 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        C2190m6 c2190m6 = new C2190m6();
        zzf = c2190m6;
        AbstractC2086gb.m10057t(C2190m6.class, c2190m6);
    }

    /* JADX INFO: renamed from: K */
    public static C2172l6 m10371K() {
        return (C2172l6) zzf.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i11 == 3) {
            return new C2190m6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2172l6(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10373F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final int m10374G() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m10375H() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final long m10376J() {
        return this.zze;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10377M(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10378N(long j10) {
        this.zzb |= 2;
        this.zze = j10;
    }
}
