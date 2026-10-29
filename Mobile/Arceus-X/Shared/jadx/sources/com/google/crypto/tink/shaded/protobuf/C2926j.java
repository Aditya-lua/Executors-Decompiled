package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C2926j implements InterfaceC2916f1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2923i f10893a;

    /* JADX INFO: renamed from: b */
    public int f10894b;

    /* JADX INFO: renamed from: c */
    public int f10895c;

    /* JADX INFO: renamed from: d */
    public int f10896d = 0;

    public C2926j(AbstractC2923i abstractC2923i) {
        AbstractC2923i abstractC2923i2 = (AbstractC2923i) C2900a0.m13380b(abstractC2923i, "input");
        this.f10893a = abstractC2923i2;
        abstractC2923i2.f10869d = this;
    }

    /* JADX INFO: renamed from: Q */
    public static C2926j m13706Q(AbstractC2923i abstractC2923i) {
        C2926j c2926j = abstractC2923i.f10869d;
        return c2926j != null ? c2926j : new C2926j(abstractC2923i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: A */
    public int mo13494A() {
        int i10 = this.f10896d;
        if (i10 != 0) {
            this.f10894b = i10;
            this.f10896d = 0;
        } else {
            this.f10894b = this.f10893a.mo13590C();
        }
        int i11 = this.f10894b;
        if (i11 == 0 || i11 == this.f10895c) {
            return Integer.MAX_VALUE;
        }
        return C2955s1.m14179a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: B */
    public void mo13495B(List<String> list) throws C2903b0.a {
        m13711V(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: C */
    public void mo13496C(List<Float> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2963w)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 2) {
                int iMo13591D = this.f10893a.mo13591D();
                m13714Y(iMo13591D);
                int iMo13597e = this.f10893a.mo13597e() + iMo13591D;
                do {
                    list.add(Float.valueOf(this.f10893a.mo13607t()));
                } while (this.f10893a.mo13597e() < iMo13597e);
                return;
            }
            if (iM14180b != 5) {
                throw C2903b0.m13400e();
            }
            do {
                list.add(Float.valueOf(this.f10893a.mo13607t()));
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C = this.f10893a.mo13590C();
                }
            } while (iMo13590C == this.f10894b);
            this.f10896d = iMo13590C;
            return;
        }
        C2963w c2963w = (C2963w) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 2) {
            int iMo13591D2 = this.f10893a.mo13591D();
            m13714Y(iMo13591D2);
            int iMo13597e2 = this.f10893a.mo13597e() + iMo13591D2;
            do {
                c2963w.m14292d(this.f10893a.mo13607t());
            } while (this.f10893a.mo13597e() < iMo13597e2);
            return;
        }
        if (iM14180b2 != 5) {
            throw C2903b0.m13400e();
        }
        do {
            c2963w.m14292d(this.f10893a.mo13607t());
            if (this.f10893a.mo13598f()) {
                return;
            } else {
                iMo13590C2 = this.f10893a.mo13590C();
            }
        } while (iMo13590C2 == this.f10894b);
        this.f10896d = iMo13590C2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: D */
    public boolean mo13497D() {
        int i10;
        if (this.f10893a.mo13598f() || (i10 = this.f10894b) == this.f10895c) {
            return false;
        }
        return this.f10893a.mo13593F(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: E */
    public int mo13498E() throws C2903b0.a {
        m13713X(5);
        return this.f10893a.mo13610w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: F */
    public void mo13499F(List<AbstractC2920h> list) throws C2903b0.a {
        int iMo13590C;
        if (C2955s1.m14180b(this.f10894b) != 2) {
            throw C2903b0.m13400e();
        }
        do {
            list.add(mo13524o());
            if (this.f10893a.mo13598f()) {
                return;
            } else {
                iMo13590C = this.f10893a.mo13590C();
            }
        } while (iMo13590C == this.f10894b);
        this.f10896d = iMo13590C;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: G */
    public void mo13500G(List<Double> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2935m)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 1) {
                do {
                    list.add(Double.valueOf(this.f10893a.mo13603p()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13591D = this.f10893a.mo13591D();
            m13715Z(iMo13591D);
            int iMo13597e = this.f10893a.mo13597e() + iMo13591D;
            do {
                list.add(Double.valueOf(this.f10893a.mo13603p()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            return;
        }
        C2935m c2935m = (C2935m) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 1) {
            do {
                c2935m.m13964d(this.f10893a.mo13603p());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13591D2 = this.f10893a.mo13591D();
        m13715Z(iMo13591D2);
        int iMo13597e2 = this.f10893a.mo13597e() + iMo13591D2;
        do {
            c2935m.m13964d(this.f10893a.mo13603p());
        } while (this.f10893a.mo13597e() < iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: H */
    public long mo13501H() throws C2903b0.a {
        m13713X(0);
        return this.f10893a.mo13609v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: I */
    public String mo13502I() throws C2903b0.a {
        m13713X(2);
        return this.f10893a.mo13589B();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: J */
    public <T> void mo13503J(T t8, InterfaceC2919g1<T> interfaceC2919g1, C2944p c2944p) throws C2903b0.a {
        m13713X(3);
        m13707R(t8, interfaceC2919g1, c2944p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    @Deprecated
    /* JADX INFO: renamed from: K */
    public <T> T mo13504K(Class<T> cls, C2944p c2944p) throws C2903b0.a {
        m13713X(3);
        return (T) m13709T(C2907c1.m13412a().m13414c(cls), c2944p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: L */
    public <K, V> void mo13505L(Map<K, V> map, C2933l0.a<K, V> aVar, C2944p c2944p) throws C2903b0.a {
        m13713X(2);
        this.f10893a.mo13600m(this.f10893a.mo13591D());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: M */
    public <T> void mo13506M(T t8, InterfaceC2919g1<T> interfaceC2919g1, C2944p c2944p) throws C2903b0 {
        m13713X(2);
        m13708S(t8, interfaceC2919g1, c2944p);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: N */
    public <T> void mo13507N(List<T> list, InterfaceC2919g1<T> interfaceC2919g1, C2944p c2944p) throws C2903b0.a {
        int iMo13590C;
        if (C2955s1.m14180b(this.f10894b) != 2) {
            throw C2903b0.m13400e();
        }
        int i10 = this.f10894b;
        do {
            list.add(m13710U(interfaceC2919g1, c2944p));
            if (this.f10893a.mo13598f() || this.f10896d != 0) {
                return;
            } else {
                iMo13590C = this.f10893a.mo13590C();
            }
        } while (iMo13590C == i10);
        this.f10896d = iMo13590C;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: O */
    public <T> T mo13508O(Class<T> cls, C2944p c2944p) throws C2903b0.a {
        m13713X(2);
        return (T) m13710U(C2907c1.m13412a().m13414c(cls), c2944p);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    @Deprecated
    /* JADX INFO: renamed from: P */
    public <T> void mo13509P(List<T> list, InterfaceC2919g1<T> interfaceC2919g1, C2944p c2944p) throws C2903b0.a {
        int iMo13590C;
        if (C2955s1.m14180b(this.f10894b) != 3) {
            throw C2903b0.m13400e();
        }
        int i10 = this.f10894b;
        do {
            list.add(m13709T(interfaceC2919g1, c2944p));
            if (this.f10893a.mo13598f() || this.f10896d != 0) {
                return;
            } else {
                iMo13590C = this.f10893a.mo13590C();
            }
        } while (iMo13590C == i10);
        this.f10896d = iMo13590C;
    }

    /* JADX INFO: renamed from: R */
    public final <T> void m13707R(T t8, InterfaceC2919g1<T> interfaceC2919g1, C2944p c2944p) {
        int i10 = this.f10895c;
        this.f10895c = C2955s1.m14181c(C2955s1.m14179a(this.f10894b), 4);
        try {
            interfaceC2919g1.mo13548i(t8, this, c2944p);
            if (this.f10894b != this.f10895c) {
                throw C2903b0.m13403h();
            }
            this.f10895c = i10;
        } catch (Throwable th2) {
            this.f10895c = i10;
            throw th2;
        }
    }

    /* JADX INFO: renamed from: S */
    public final <T> void m13708S(T t8, InterfaceC2919g1<T> interfaceC2919g1, C2944p c2944p) throws C2903b0 {
        int iMo13591D = this.f10893a.mo13591D();
        AbstractC2923i abstractC2923i = this.f10893a;
        if (abstractC2923i.f10866a >= abstractC2923i.f10867b) {
            throw C2903b0.m13404i();
        }
        int iMo13600m = abstractC2923i.mo13600m(iMo13591D);
        this.f10893a.f10866a++;
        interfaceC2919g1.mo13548i(t8, this, c2944p);
        this.f10893a.mo13595a(0);
        AbstractC2923i abstractC2923i2 = this.f10893a;
        abstractC2923i2.f10866a--;
        abstractC2923i2.mo13599l(iMo13600m);
    }

    /* JADX INFO: renamed from: T */
    public final <T> T m13709T(InterfaceC2919g1<T> interfaceC2919g1, C2944p c2944p) {
        T tMo13544e = interfaceC2919g1.mo13544e();
        m13707R(tMo13544e, interfaceC2919g1, c2944p);
        interfaceC2919g1.mo13541b(tMo13544e);
        return tMo13544e;
    }

    /* JADX INFO: renamed from: U */
    public final <T> T m13710U(InterfaceC2919g1<T> interfaceC2919g1, C2944p c2944p) throws C2903b0 {
        T tMo13544e = interfaceC2919g1.mo13544e();
        m13708S(tMo13544e, interfaceC2919g1, c2944p);
        interfaceC2919g1.mo13541b(tMo13544e);
        return tMo13544e;
    }

    /* JADX INFO: renamed from: V */
    public void m13711V(List<String> list, boolean z10) throws C2903b0.a {
        int iMo13590C;
        int iMo13590C2;
        if (C2955s1.m14180b(this.f10894b) != 2) {
            throw C2903b0.m13400e();
        }
        if (!(list instanceof InterfaceC2915f0) || z10) {
            do {
                list.add(z10 ? mo13502I() : mo13535z());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C = this.f10893a.mo13590C();
                }
            } while (iMo13590C == this.f10894b);
            this.f10896d = iMo13590C;
            return;
        }
        InterfaceC2915f0 interfaceC2915f0 = (InterfaceC2915f0) list;
        do {
            interfaceC2915f0.m13492P2(mo13524o());
            if (this.f10893a.mo13598f()) {
                return;
            } else {
                iMo13590C2 = this.f10893a.mo13590C();
            }
        } while (iMo13590C2 == this.f10894b);
        this.f10896d = iMo13590C2;
    }

    /* JADX INFO: renamed from: W */
    public final void m13712W(int i10) throws C2903b0 {
        if (this.f10893a.mo13597e() != i10) {
            throw C2903b0.m13406m();
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m13713X(int i10) throws C2903b0.a {
        if (C2955s1.m14180b(this.f10894b) != i10) {
            throw C2903b0.m13400e();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m13714Y(int i10) throws C2903b0 {
        if ((i10 & 3) != 0) {
            throw C2903b0.m13403h();
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m13715Z(int i10) throws C2903b0 {
        if ((i10 & 7) != 0) {
            throw C2903b0.m13403h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: a */
    public int mo13510a() {
        return this.f10894b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: b */
    public long mo13511b() throws C2903b0.a {
        m13713X(1);
        return this.f10893a.mo13606s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: c */
    public void mo13512c(List<Integer> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2969z)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 2) {
                int iMo13591D = this.f10893a.mo13591D();
                m13714Y(iMo13591D);
                int iMo13597e = this.f10893a.mo13597e() + iMo13591D;
                do {
                    list.add(Integer.valueOf(this.f10893a.mo13610w()));
                } while (this.f10893a.mo13597e() < iMo13597e);
                return;
            }
            if (iM14180b != 5) {
                throw C2903b0.m13400e();
            }
            do {
                list.add(Integer.valueOf(this.f10893a.mo13610w()));
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C = this.f10893a.mo13590C();
                }
            } while (iMo13590C == this.f10894b);
            this.f10896d = iMo13590C;
            return;
        }
        C2969z c2969z = (C2969z) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 2) {
            int iMo13591D2 = this.f10893a.mo13591D();
            m13714Y(iMo13591D2);
            int iMo13597e2 = this.f10893a.mo13597e() + iMo13591D2;
            do {
                c2969z.m14363d(this.f10893a.mo13610w());
            } while (this.f10893a.mo13597e() < iMo13597e2);
            return;
        }
        if (iM14180b2 != 5) {
            throw C2903b0.m13400e();
        }
        do {
            c2969z.m14363d(this.f10893a.mo13610w());
            if (this.f10893a.mo13598f()) {
                return;
            } else {
                iMo13590C2 = this.f10893a.mo13590C();
            }
        } while (iMo13590C2 == this.f10894b);
        this.f10896d = iMo13590C2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: d */
    public void mo13513d(List<Long> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2927j0)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 0) {
                do {
                    list.add(Long.valueOf(this.f10893a.mo13613z()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13597e = this.f10893a.mo13597e() + this.f10893a.mo13591D();
            do {
                list.add(Long.valueOf(this.f10893a.mo13613z()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            m13712W(iMo13597e);
            return;
        }
        C2927j0 c2927j0 = (C2927j0) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 0) {
            do {
                c2927j0.m13721e(this.f10893a.mo13613z());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13597e2 = this.f10893a.mo13597e() + this.f10893a.mo13591D();
        do {
            c2927j0.m13721e(this.f10893a.mo13613z());
        } while (this.f10893a.mo13597e() < iMo13597e2);
        m13712W(iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: e */
    public boolean mo13514e() throws C2903b0.a {
        m13713X(0);
        return this.f10893a.mo13601n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: f */
    public long mo13515f() throws C2903b0.a {
        m13713X(1);
        return this.f10893a.mo13611x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: g */
    public void mo13516g(List<Long> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2927j0)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 0) {
                do {
                    list.add(Long.valueOf(this.f10893a.mo13592E()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13597e = this.f10893a.mo13597e() + this.f10893a.mo13591D();
            do {
                list.add(Long.valueOf(this.f10893a.mo13592E()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            m13712W(iMo13597e);
            return;
        }
        C2927j0 c2927j0 = (C2927j0) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 0) {
            do {
                c2927j0.m13721e(this.f10893a.mo13592E());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13597e2 = this.f10893a.mo13597e() + this.f10893a.mo13591D();
        do {
            c2927j0.m13721e(this.f10893a.mo13592E());
        } while (this.f10893a.mo13597e() < iMo13597e2);
        m13712W(iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: h */
    public int mo13517h() throws C2903b0.a {
        m13713X(0);
        return this.f10893a.mo13591D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: i */
    public void mo13518i(List<Long> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2927j0)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 0) {
                do {
                    list.add(Long.valueOf(this.f10893a.mo13609v()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13597e = this.f10893a.mo13597e() + this.f10893a.mo13591D();
            do {
                list.add(Long.valueOf(this.f10893a.mo13609v()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            m13712W(iMo13597e);
            return;
        }
        C2927j0 c2927j0 = (C2927j0) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 0) {
            do {
                c2927j0.m13721e(this.f10893a.mo13609v());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13597e2 = this.f10893a.mo13597e() + this.f10893a.mo13591D();
        do {
            c2927j0.m13721e(this.f10893a.mo13609v());
        } while (this.f10893a.mo13597e() < iMo13597e2);
        m13712W(iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: j */
    public void mo13519j(List<Integer> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2969z)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 0) {
                do {
                    list.add(Integer.valueOf(this.f10893a.mo13604q()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13597e = this.f10893a.mo13597e() + this.f10893a.mo13591D();
            do {
                list.add(Integer.valueOf(this.f10893a.mo13604q()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            m13712W(iMo13597e);
            return;
        }
        C2969z c2969z = (C2969z) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 0) {
            do {
                c2969z.m14363d(this.f10893a.mo13604q());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13597e2 = this.f10893a.mo13597e() + this.f10893a.mo13591D();
        do {
            c2969z.m14363d(this.f10893a.mo13604q());
        } while (this.f10893a.mo13597e() < iMo13597e2);
        m13712W(iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: k */
    public int mo13520k() throws C2903b0.a {
        m13713X(0);
        return this.f10893a.mo13604q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: l */
    public int mo13521l() throws C2903b0.a {
        m13713X(0);
        return this.f10893a.mo13612y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: m */
    public void mo13522m(List<Boolean> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2914f)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 0) {
                do {
                    list.add(Boolean.valueOf(this.f10893a.mo13601n()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13597e = this.f10893a.mo13597e() + this.f10893a.mo13591D();
            do {
                list.add(Boolean.valueOf(this.f10893a.mo13601n()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            m13712W(iMo13597e);
            return;
        }
        C2914f c2914f = (C2914f) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 0) {
            do {
                c2914f.m13483e(this.f10893a.mo13601n());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13597e2 = this.f10893a.mo13597e() + this.f10893a.mo13591D();
        do {
            c2914f.m13483e(this.f10893a.mo13601n());
        } while (this.f10893a.mo13597e() < iMo13597e2);
        m13712W(iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: n */
    public void mo13523n(List<String> list) throws C2903b0.a {
        m13711V(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: o */
    public AbstractC2920h mo13524o() throws C2903b0.a {
        m13713X(2);
        return this.f10893a.mo13602o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: p */
    public int mo13525p() throws C2903b0.a {
        m13713X(0);
        return this.f10893a.mo13608u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: q */
    public void mo13526q(List<Long> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2927j0)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 1) {
                do {
                    list.add(Long.valueOf(this.f10893a.mo13606s()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13591D = this.f10893a.mo13591D();
            m13715Z(iMo13591D);
            int iMo13597e = this.f10893a.mo13597e() + iMo13591D;
            do {
                list.add(Long.valueOf(this.f10893a.mo13606s()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            return;
        }
        C2927j0 c2927j0 = (C2927j0) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 1) {
            do {
                c2927j0.m13721e(this.f10893a.mo13606s());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13591D2 = this.f10893a.mo13591D();
        m13715Z(iMo13591D2);
        int iMo13597e2 = this.f10893a.mo13597e() + iMo13591D2;
        do {
            c2927j0.m13721e(this.f10893a.mo13606s());
        } while (this.f10893a.mo13597e() < iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: r */
    public void mo13527r(List<Integer> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2969z)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 0) {
                do {
                    list.add(Integer.valueOf(this.f10893a.mo13612y()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13597e = this.f10893a.mo13597e() + this.f10893a.mo13591D();
            do {
                list.add(Integer.valueOf(this.f10893a.mo13612y()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            m13712W(iMo13597e);
            return;
        }
        C2969z c2969z = (C2969z) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 0) {
            do {
                c2969z.m14363d(this.f10893a.mo13612y());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13597e2 = this.f10893a.mo13597e() + this.f10893a.mo13591D();
        do {
            c2969z.m14363d(this.f10893a.mo13612y());
        } while (this.f10893a.mo13597e() < iMo13597e2);
        m13712W(iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    public double readDouble() throws C2903b0.a {
        m13713X(1);
        return this.f10893a.mo13603p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    public float readFloat() throws C2903b0.a {
        m13713X(5);
        return this.f10893a.mo13607t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: s */
    public long mo13528s() throws C2903b0.a {
        m13713X(0);
        return this.f10893a.mo13592E();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: t */
    public void mo13529t(List<Integer> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2969z)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 0) {
                do {
                    list.add(Integer.valueOf(this.f10893a.mo13591D()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13597e = this.f10893a.mo13597e() + this.f10893a.mo13591D();
            do {
                list.add(Integer.valueOf(this.f10893a.mo13591D()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            m13712W(iMo13597e);
            return;
        }
        C2969z c2969z = (C2969z) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 0) {
            do {
                c2969z.m14363d(this.f10893a.mo13591D());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13597e2 = this.f10893a.mo13597e() + this.f10893a.mo13591D();
        do {
            c2969z.m14363d(this.f10893a.mo13591D());
        } while (this.f10893a.mo13597e() < iMo13597e2);
        m13712W(iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: u */
    public int mo13530u() throws C2903b0.a {
        m13713X(5);
        return this.f10893a.mo13605r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: v */
    public void mo13531v(List<Long> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2927j0)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 1) {
                do {
                    list.add(Long.valueOf(this.f10893a.mo13611x()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13591D = this.f10893a.mo13591D();
            m13715Z(iMo13591D);
            int iMo13597e = this.f10893a.mo13597e() + iMo13591D;
            do {
                list.add(Long.valueOf(this.f10893a.mo13611x()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            return;
        }
        C2927j0 c2927j0 = (C2927j0) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 1) {
            do {
                c2927j0.m13721e(this.f10893a.mo13611x());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13591D2 = this.f10893a.mo13591D();
        m13715Z(iMo13591D2);
        int iMo13597e2 = this.f10893a.mo13597e() + iMo13591D2;
        do {
            c2927j0.m13721e(this.f10893a.mo13611x());
        } while (this.f10893a.mo13597e() < iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: w */
    public void mo13532w(List<Integer> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2969z)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 0) {
                do {
                    list.add(Integer.valueOf(this.f10893a.mo13608u()));
                    if (this.f10893a.mo13598f()) {
                        return;
                    } else {
                        iMo13590C = this.f10893a.mo13590C();
                    }
                } while (iMo13590C == this.f10894b);
                this.f10896d = iMo13590C;
                return;
            }
            if (iM14180b != 2) {
                throw C2903b0.m13400e();
            }
            int iMo13597e = this.f10893a.mo13597e() + this.f10893a.mo13591D();
            do {
                list.add(Integer.valueOf(this.f10893a.mo13608u()));
            } while (this.f10893a.mo13597e() < iMo13597e);
            m13712W(iMo13597e);
            return;
        }
        C2969z c2969z = (C2969z) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 0) {
            do {
                c2969z.m14363d(this.f10893a.mo13608u());
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C2 = this.f10893a.mo13590C();
                }
            } while (iMo13590C2 == this.f10894b);
            this.f10896d = iMo13590C2;
            return;
        }
        if (iM14180b2 != 2) {
            throw C2903b0.m13400e();
        }
        int iMo13597e2 = this.f10893a.mo13597e() + this.f10893a.mo13591D();
        do {
            c2969z.m14363d(this.f10893a.mo13608u());
        } while (this.f10893a.mo13597e() < iMo13597e2);
        m13712W(iMo13597e2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: x */
    public void mo13533x(List<Integer> list) throws C2903b0 {
        int iMo13590C;
        int iMo13590C2;
        if (!(list instanceof C2969z)) {
            int iM14180b = C2955s1.m14180b(this.f10894b);
            if (iM14180b == 2) {
                int iMo13591D = this.f10893a.mo13591D();
                m13714Y(iMo13591D);
                int iMo13597e = this.f10893a.mo13597e() + iMo13591D;
                do {
                    list.add(Integer.valueOf(this.f10893a.mo13605r()));
                } while (this.f10893a.mo13597e() < iMo13597e);
                return;
            }
            if (iM14180b != 5) {
                throw C2903b0.m13400e();
            }
            do {
                list.add(Integer.valueOf(this.f10893a.mo13605r()));
                if (this.f10893a.mo13598f()) {
                    return;
                } else {
                    iMo13590C = this.f10893a.mo13590C();
                }
            } while (iMo13590C == this.f10894b);
            this.f10896d = iMo13590C;
            return;
        }
        C2969z c2969z = (C2969z) list;
        int iM14180b2 = C2955s1.m14180b(this.f10894b);
        if (iM14180b2 == 2) {
            int iMo13591D2 = this.f10893a.mo13591D();
            m13714Y(iMo13591D2);
            int iMo13597e2 = this.f10893a.mo13597e() + iMo13591D2;
            do {
                c2969z.m14363d(this.f10893a.mo13605r());
            } while (this.f10893a.mo13597e() < iMo13597e2);
            return;
        }
        if (iM14180b2 != 5) {
            throw C2903b0.m13400e();
        }
        do {
            c2969z.m14363d(this.f10893a.mo13605r());
            if (this.f10893a.mo13598f()) {
                return;
            } else {
                iMo13590C2 = this.f10893a.mo13590C();
            }
        } while (iMo13590C2 == this.f10894b);
        this.f10896d = iMo13590C2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: y */
    public long mo13534y() throws C2903b0.a {
        m13713X(0);
        return this.f10893a.mo13613z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2916f1
    /* JADX INFO: renamed from: z */
    public String mo13535z() throws C2903b0.a {
        m13713X(2);
        return this.f10893a.mo13588A();
    }
}
