package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.n1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2940n1<T, B> {

    /* JADX INFO: renamed from: a */
    public static volatile int f10949a = 100;

    /* JADX INFO: renamed from: a */
    public abstract void mo13992a(B b, int i10, int i11);

    /* JADX INFO: renamed from: b */
    public abstract void mo13993b(B b, int i10, long j10);

    /* JADX INFO: renamed from: c */
    public abstract void mo13994c(B b, int i10, T t8);

    /* JADX INFO: renamed from: d */
    public abstract void mo13995d(B b, int i10, AbstractC2920h abstractC2920h);

    /* JADX INFO: renamed from: e */
    public abstract void mo13996e(B b, int i10, long j10);

    /* JADX INFO: renamed from: f */
    public abstract B mo13997f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract T mo13998g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract int mo13999h(T t8);

    /* JADX INFO: renamed from: i */
    public abstract int mo14000i(T t8);

    /* JADX INFO: renamed from: j */
    public abstract void mo14001j(Object obj);

    /* JADX INFO: renamed from: k */
    public abstract T mo14002k(T t8, T t10);

    /* JADX INFO: renamed from: l */
    public final void m14003l(B b, InterfaceC2916f1 interfaceC2916f1, int i10) {
        while (interfaceC2916f1.mo13494A() != Integer.MAX_VALUE && m14004m(b, interfaceC2916f1, i10)) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m14004m(B b, InterfaceC2916f1 interfaceC2916f1, int i10) throws C2903b0 {
        int iMo13510a = interfaceC2916f1.mo13510a();
        int iM14179a = C2955s1.m14179a(iMo13510a);
        int iM14180b = C2955s1.m14180b(iMo13510a);
        if (iM14180b == 0) {
            mo13996e(b, iM14179a, interfaceC2916f1.mo13501H());
            return true;
        }
        if (iM14180b == 1) {
            mo13993b(b, iM14179a, interfaceC2916f1.mo13511b());
            return true;
        }
        if (iM14180b == 2) {
            mo13995d(b, iM14179a, interfaceC2916f1.mo13524o());
            return true;
        }
        if (iM14180b != 3) {
            if (iM14180b == 4) {
                return false;
            }
            if (iM14180b != 5) {
                throw C2903b0.m13400e();
            }
            mo13992a(b, iM14179a, interfaceC2916f1.mo13530u());
            return true;
        }
        B bMo14005n = mo14005n();
        int iM14181c = C2955s1.m14181c(iM14179a, 4);
        int i11 = i10 + 1;
        if (i11 >= f10949a) {
            throw C2903b0.m13404i();
        }
        m14003l(bMo14005n, interfaceC2916f1, i11);
        if (iM14181c != interfaceC2916f1.mo13510a()) {
            throw C2903b0.m13397b();
        }
        mo13994c(b, iM14179a, mo14009r(bMo14005n));
        return true;
    }

    /* JADX INFO: renamed from: n */
    public abstract B mo14005n();

    /* JADX INFO: renamed from: o */
    public abstract void mo14006o(Object obj, B b);

    /* JADX INFO: renamed from: p */
    public abstract void mo14007p(Object obj, T t8);

    /* JADX INFO: renamed from: q */
    public abstract boolean mo14008q(InterfaceC2916f1 interfaceC2916f1);

    /* JADX INFO: renamed from: r */
    public abstract T mo14009r(B b);

    /* JADX INFO: renamed from: s */
    public abstract void mo14010s(T t8, InterfaceC2958t1 interfaceC2958t1);

    /* JADX INFO: renamed from: t */
    public abstract void mo14011t(T t8, InterfaceC2958t1 interfaceC2958t1);
}
