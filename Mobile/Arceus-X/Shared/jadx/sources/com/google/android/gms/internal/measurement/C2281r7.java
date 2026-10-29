package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2281r7 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2281r7 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        C2281r7 c2281r7 = new C2281r7();
        zzj = c2281r7;
        AbstractC2086gb.m10057t(C2281r7.class, c2281r7);
    }

    /* JADX INFO: renamed from: S */
    public static C2263q7 m10605S() {
        return (C2263q7) zzj.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C2281r7();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2263q7(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10607F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final long m10608G() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final String m10609H() {
        return this.zze;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m10610J() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final String m10611K() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m10612M() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final long m10613N() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m10614O() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: P */
    public final float m10615P() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m10616Q() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: R */
    public final double m10617R() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m10618T(long j10) {
        this.zzb |= 1;
        this.zzd = j10;
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m10619U(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m10620V(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m10621W() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m10622X(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m10623Y() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m10624Z(double d10) {
        this.zzb |= 32;
        this.zzi = d10;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m10625a0() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }
}
