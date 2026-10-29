package com.google.android.gms.internal.measurement;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2369w5 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2369w5 zzn;
    private int zzb;
    private long zzg;
    private long zzk;
    private C2125ic zzl = C2125ic.m10285a();
    private C2125ic zzm = C2125ic.m10285a();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        C2369w5 c2369w5 = new C2369w5();
        zzn = c2369w5;
        AbstractC2086gb.m10057t(C2369w5.class, c2369w5);
    }

    /* JADX INFO: renamed from: h0 */
    public static C2297s5 m10880h0() {
        return (C2297s5) zzn.m10074p();
    }

    /* JADX INFO: renamed from: i0 */
    public static C2369w5 m10881i0() {
        return zzn;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", C2315t5.f8663a, "zzm", C2333u5.f8686a});
        }
        if (i11 == 3) {
            return new C2369w5();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2297s5(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m10882F(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m10883G() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m10884H(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m10885J() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m10886K(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m10887M() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10888N(long j10) {
        this.zzb |= 128;
        this.zzk = j10;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ Map m10889O() {
        if (!this.zzl.m10290f()) {
            this.zzl = this.zzl.m10288c();
        }
        return this.zzl;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ Map m10890P() {
        if (!this.zzm.m10290f()) {
            this.zzm = this.zzm.m10288c();
        }
        return this.zzm;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m10891R() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: S */
    public final String m10892S() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m10893T() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final String m10894U() {
        return this.zze;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m10895V() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final String m10896W() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m10897X() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: Y */
    public final long m10898Y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m10899Z() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final String m10900a0() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m10901b0() {
        return (this.zzb & 32) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final String m10902c0() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m10903d0() {
        return (this.zzb & 64) != 0;
    }

    /* JADX INFO: renamed from: e0 */
    public final String m10904e0() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m10905f0() {
        return (this.zzb & 128) != 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final long m10906g0() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m10907j0(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m10908k0() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m10909l0(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m10910m0() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m10911n0(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m10912o0() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m10913p0(long j10) {
        this.zzb |= 8;
        this.zzg = j10;
    }
}
