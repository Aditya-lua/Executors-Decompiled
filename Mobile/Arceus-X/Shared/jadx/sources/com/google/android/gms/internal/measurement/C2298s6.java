package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2298s6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2298s6 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private InterfaceC2249pb zzi = AbstractC2086gb.m10052A();

    static {
        C2298s6 c2298s6 = new C2298s6();
        zzj = c2298s6;
        AbstractC2086gb.m10057t(C2298s6.class, c2298s6);
    }

    /* JADX INFO: renamed from: T */
    public static C2280r6 m10694T() {
        return (C2280r6) zzj.m10074p();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", C2298s6.class});
        }
        if (i11 == 3) {
            return new C2298s6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2280r6(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m10696F() {
        return (this.zzb & 1) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final String m10697G() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m10698H() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final String m10699J() {
        return this.zze;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m10700K() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final long m10701M() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m10702N() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: O */
    public final float m10703O() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m10704P() {
        return (this.zzb & 16) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public final double m10705Q() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: R */
    public final List m10706R() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: S */
    public final int m10707S() {
        return this.zzi.size();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m10708U(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m10709V(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m10710W() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m10711X(long j10) {
        this.zzb |= 4;
        this.zzf = j10;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m10712Y() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m10713Z(double d10) {
        this.zzb |= 16;
        this.zzh = d10;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m10714a0() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m10715b0(C2298s6 c2298s6) {
        c2298s6.getClass();
        m10718f0();
        this.zzi.add(c2298s6);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m10716c0(Iterable iterable) {
        m10718f0();
        AbstractC2283r9.m10627i(iterable, this.zzi);
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m10717d0() {
        this.zzi = AbstractC2086gb.m10052A();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m10718f0() {
        InterfaceC2249pb interfaceC2249pb = this.zzi;
        if (interfaceC2249pb.zza()) {
            return;
        }
        this.zzi = AbstractC2086gb.m10053B(interfaceC2249pb);
    }
}
