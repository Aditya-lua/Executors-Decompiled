package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2443a4 extends C2530i3 {

    /* JADX INFO: renamed from: b */
    public static final boolean f8899b = C2446a7.m11234B();

    /* JADX INFO: renamed from: a */
    public Object f8900a;

    public /* synthetic */ AbstractC2443a4(C2717z3 c2717z3) {
    }

    /* JADX INFO: renamed from: u */
    public static int m11172u(InterfaceC2697x5 interfaceC2697x5) {
        int iZzn = interfaceC2697x5.zzn();
        return m11173v(iZzn) + iZzn;
    }

    /* JADX INFO: renamed from: v */
    public static int m11173v(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: w */
    public static int m11174w(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    /* JADX INFO: renamed from: a */
    public final void m11175a() {
        if (mo11176c() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (mo11176c() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo11176c();

    /* JADX INFO: renamed from: d */
    public abstract void mo11177d(byte b);

    /* JADX INFO: renamed from: e */
    public abstract void mo11178e(int i10, boolean z10);

    /* JADX INFO: renamed from: f */
    public abstract void mo11179f(int i10, AbstractC2640s3 abstractC2640s3);

    /* JADX INFO: renamed from: g */
    public abstract void mo11180g(int i10, int i11);

    /* JADX INFO: renamed from: h */
    public abstract void mo11181h(int i10);

    /* JADX INFO: renamed from: i */
    public abstract void mo11182i(int i10, long j10);

    /* JADX INFO: renamed from: j */
    public abstract void mo11183j(long j10);

    /* JADX INFO: renamed from: k */
    public abstract void mo11184k(int i10, int i11);

    /* JADX INFO: renamed from: l */
    public abstract void mo11185l(int i10);

    /* JADX INFO: renamed from: m */
    public abstract void mo11186m(int i10, InterfaceC2697x5 interfaceC2697x5);

    /* JADX INFO: renamed from: n */
    public abstract void mo11187n(int i10, AbstractC2640s3 abstractC2640s3);

    /* JADX INFO: renamed from: o */
    public abstract void mo11188o(int i10, String str);

    /* JADX INFO: renamed from: p */
    public abstract void mo11189p(int i10, int i11);

    /* JADX INFO: renamed from: q */
    public abstract void mo11190q(int i10, int i11);

    /* JADX INFO: renamed from: r */
    public abstract void mo11191r(int i10);

    /* JADX INFO: renamed from: s */
    public abstract void mo11192s(int i10, long j10);

    /* JADX INFO: renamed from: t */
    public abstract void mo11193t(long j10);
}
