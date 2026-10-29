package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1967a6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C1967a6 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C1967a6 c1967a6 = new C1967a6();
        zzk = c1967a6;
        AbstractC2086gb.m10057t(C1967a6.class, c1967a6);
    }

    /* JADX INFO: renamed from: O */
    public static C2423z5 m9586O() {
        return (C2423z5) zzk.m10074p();
    }

    /* JADX INFO: renamed from: P */
    public static C1967a6 m9587P() {
        return zzk;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C1967a6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2423z5(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9589F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m9590G() {
        return this.zze;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m9591H() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m9592J() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m9593K() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m9594M() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m9595N() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m9596Q(boolean z10) {
        this.zzb |= 1;
        this.zzd = z10;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m9597R(boolean z10) {
        this.zzb |= 2;
        this.zze = z10;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m9598S(boolean z10) {
        this.zzb |= 4;
        this.zzf = z10;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m9599T(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m9600U(boolean z10) {
        this.zzb |= 16;
        this.zzh = z10;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m9601V(boolean z10) {
        this.zzb |= 32;
        this.zzi = z10;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m9602W(boolean z10) {
        this.zzb |= 64;
        this.zzj = z10;
    }
}
