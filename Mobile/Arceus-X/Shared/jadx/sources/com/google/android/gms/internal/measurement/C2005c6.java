package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2005c6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2005c6 zzh;
    private int zzb;
    private int zzd;
    private C2063f7 zze;
    private C2063f7 zzf;
    private boolean zzg;

    static {
        C2005c6 c2005c6 = new C2005c6();
        zzh = c2005c6;
        AbstractC2086gb.m10057t(C2005c6.class, c2005c6);
    }

    /* JADX INFO: renamed from: O */
    public static C1986b6 m9846O() {
        return (C1986b6) zzh.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2005c6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C1986b6(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m9848F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final int m9849G() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final C2063f7 m9850H() {
        C2063f7 c2063f7 = this.zze;
        return c2063f7 == null ? C2063f7.m9989Q() : c2063f7;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m9851J() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final C2063f7 m9852K() {
        C2063f7 c2063f7 = this.zzf;
        return c2063f7 == null ? C2063f7.m9989Q() : c2063f7;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m9853M() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m9854N() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m9855P(int i10) {
        this.zzb |= 1;
        this.zzd = i10;
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m9856Q(C2063f7 c2063f7) {
        c2063f7.getClass();
        this.zze = c2063f7;
        this.zzb |= 2;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m9857R(C2063f7 c2063f7) {
        this.zzf = c2063f7;
        this.zzb |= 4;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m9858S(boolean z10) {
        this.zzb |= 8;
        this.zzg = z10;
    }
}
