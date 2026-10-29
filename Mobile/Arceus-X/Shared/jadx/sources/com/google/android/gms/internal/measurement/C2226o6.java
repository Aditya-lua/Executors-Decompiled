package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2226o6 extends AbstractC2086gb implements InterfaceC2250pc {
    private static final C2226o6 zzj;
    private int zzb;
    private InterfaceC2249pb zzd = AbstractC2086gb.m10052A();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        C2226o6 c2226o6 = new C2226o6();
        zzj = c2226o6;
        AbstractC2086gb.m10057t(C2226o6.class, c2226o6);
    }

    /* JADX INFO: renamed from: R */
    public static C2208n6 m10484R() {
        return (C2208n6) zzj.m10074p();
    }

    /* JADX INFO: renamed from: c0 */
    private final void m10486c0() {
        InterfaceC2249pb interfaceC2249pb = this.zzd;
        if (interfaceC2249pb.zza()) {
            return;
        }
        this.zzd = AbstractC2086gb.m10053B(interfaceC2249pb);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2086gb
    /* JADX INFO: renamed from: E */
    public final Object mo9579E(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return AbstractC2086gb.m10058v(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", C2298s6.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C2226o6();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new C2208n6(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        throw null;
    }

    /* JADX INFO: renamed from: F */
    public final List m10487F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: G */
    public final int m10488G() {
        return this.zzd.size();
    }

    /* JADX INFO: renamed from: H */
    public final C2298s6 m10489H(int i10) {
        return (C2298s6) this.zzd.get(i10);
    }

    /* JADX INFO: renamed from: J */
    public final String m10490J() {
        return this.zze;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m10491K() {
        return (this.zzb & 2) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final long m10492M() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m10493N() {
        return (this.zzb & 4) != 0;
    }

    /* JADX INFO: renamed from: O */
    public final long m10494O() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m10495P() {
        return (this.zzb & 8) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public final int m10496Q() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m10497S(int i10, C2298s6 c2298s6) {
        c2298s6.getClass();
        m10486c0();
        this.zzd.set(i10, c2298s6);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m10498T(C2298s6 c2298s6) {
        c2298s6.getClass();
        m10486c0();
        this.zzd.add(c2298s6);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m10499U(Iterable iterable) {
        m10486c0();
        AbstractC2283r9.m10627i(iterable, this.zzd);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m10500V() {
        this.zzd = AbstractC2086gb.m10052A();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m10501W(int i10) {
        m10486c0();
        this.zzd.remove(i10);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m10502X(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m10503Y(long j10) {
        this.zzb |= 2;
        this.zzf = j10;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m10504Z(long j10) {
        this.zzb |= 4;
        this.zzg = j10;
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m10505a0(long j10) {
        this.zzb |= 16;
        this.zzi = j10;
    }
}
