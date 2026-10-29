package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0863n1<T, B> {

    /* JADX INFO: renamed from: a */
    public static volatile int f2956a = 100;

    /* JADX INFO: renamed from: a */
    public abstract void mo3891a(B b, int i10, int i11);

    /* JADX INFO: renamed from: b */
    public abstract void mo3892b(B b, int i10, long j10);

    /* JADX INFO: renamed from: c */
    public abstract void mo3893c(B b, int i10, T t8);

    /* JADX INFO: renamed from: d */
    public abstract void mo3894d(B b, int i10, AbstractC0840g abstractC0840g);

    /* JADX INFO: renamed from: e */
    public abstract void mo3895e(B b, int i10, long j10);

    /* JADX INFO: renamed from: f */
    public abstract B mo3896f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract T mo3897g(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract int mo3898h(T t8);

    /* JADX INFO: renamed from: i */
    public abstract int mo3899i(T t8);

    /* JADX INFO: renamed from: j */
    public abstract void mo3900j(Object obj);

    /* JADX INFO: renamed from: k */
    public abstract T mo3901k(T t8, T t10);

    /* JADX INFO: renamed from: l */
    public final void m3902l(B b, InterfaceC0839f1 interfaceC0839f1, int i10) {
        while (interfaceC0839f1.mo3396A() != Integer.MAX_VALUE && m3903m(b, interfaceC0839f1, i10)) {
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3903m(B b, InterfaceC0839f1 interfaceC0839f1, int i10) throws C0823a0 {
        int iMo3412a = interfaceC0839f1.mo3412a();
        int iM4058a = C0878s1.m4058a(iMo3412a);
        int iM4059b = C0878s1.m4059b(iMo3412a);
        if (iM4059b == 0) {
            mo3895e(b, iM4058a, interfaceC0839f1.mo3403H());
            return true;
        }
        if (iM4059b == 1) {
            mo3892b(b, iM4058a, interfaceC0839f1.mo3413b());
            return true;
        }
        if (iM4059b == 2) {
            mo3894d(b, iM4058a, interfaceC0839f1.mo3426o());
            return true;
        }
        if (iM4059b != 3) {
            if (iM4059b == 4) {
                return false;
            }
            if (iM4059b != 5) {
                throw C0823a0.m3342e();
            }
            mo3891a(b, iM4058a, interfaceC0839f1.mo3432u());
            return true;
        }
        B bMo3904n = mo3904n();
        int iM4060c = C0878s1.m4060c(iM4058a, 4);
        int i11 = i10 + 1;
        if (i11 >= f2956a) {
            throw C0823a0.m3346i();
        }
        m3902l(bMo3904n, interfaceC0839f1, i11);
        if (iM4060c != interfaceC0839f1.mo3412a()) {
            throw C0823a0.m3339b();
        }
        mo3893c(b, iM4058a, mo3908r(bMo3904n));
        return true;
    }

    /* JADX INFO: renamed from: n */
    public abstract B mo3904n();

    /* JADX INFO: renamed from: o */
    public abstract void mo3905o(Object obj, B b);

    /* JADX INFO: renamed from: p */
    public abstract void mo3906p(Object obj, T t8);

    /* JADX INFO: renamed from: q */
    public abstract boolean mo3907q(InterfaceC0839f1 interfaceC0839f1);

    /* JADX INFO: renamed from: r */
    public abstract T mo3908r(B b);

    /* JADX INFO: renamed from: s */
    public abstract void mo3909s(T t8, InterfaceC0881t1 interfaceC0881t1);

    /* JADX INFO: renamed from: t */
    public abstract void mo3910t(T t8, InterfaceC0881t1 interfaceC0881t1);
}
