package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.w0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2964w0<T> implements InterfaceC2919g1<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2954s0 f11127a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2940n1<?, ?> f11128b;

    /* JADX INFO: renamed from: c */
    public final boolean f11129c;

    /* JADX INFO: renamed from: d */
    public final AbstractC2947q<?> f11130d;

    public C2964w0(AbstractC2940n1<?, ?> abstractC2940n1, AbstractC2947q<?> abstractC2947q, InterfaceC2954s0 interfaceC2954s0) {
        this.f11128b = abstractC2940n1;
        this.f11129c = abstractC2947q.mo14060e(interfaceC2954s0);
        this.f11130d = abstractC2947q;
        this.f11127a = interfaceC2954s0;
    }

    /* JADX INFO: renamed from: k */
    private <UT, UB> int m14300k(AbstractC2940n1<UT, UB> abstractC2940n1, T t8) {
        return abstractC2940n1.mo14000i(abstractC2940n1.mo13998g(t8));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: com.google.crypto.tink.shaded.protobuf.w0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    private <UT, UB, ET extends C2959u.b<ET>> void m14301l(AbstractC2940n1<UT, UB> abstractC2940n1, AbstractC2947q<ET> abstractC2947q, T t8, InterfaceC2916f1 interfaceC2916f1, C2944p c2944p) throws Throwable {
        AbstractC2940n1<UT, UB> abstractC2940n2;
        UB ubMo13997f = abstractC2940n1.mo13997f(t8);
        Object objMo14059d = abstractC2947q.mo14059d(t8);
        while (interfaceC2916f1.mo13494A() != Integer.MAX_VALUE) {
            try {
                abstractC2940n2 = abstractC2940n1;
                AbstractC2947q<ET> abstractC2947q2 = abstractC2947q;
                InterfaceC2916f1 interfaceC2916f2 = interfaceC2916f1;
                C2944p c2944p2 = c2944p;
                try {
                    if (!m14303n(interfaceC2916f2, c2944p2, abstractC2947q2, objMo14059d, abstractC2940n2, ubMo13997f)) {
                        abstractC2940n2.mo14006o(t8, ubMo13997f);
                        return;
                    }
                    interfaceC2916f1 = interfaceC2916f2;
                    c2944p = c2944p2;
                    abstractC2947q = abstractC2947q2;
                    abstractC2940n1 = abstractC2940n2;
                } catch (Throwable th2) {
                    th = th2;
                    Throwable th3 = th;
                    abstractC2940n2.mo14006o(t8, ubMo13997f);
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                abstractC2940n2 = abstractC2940n1;
            }
        }
        abstractC2940n1.mo14006o(t8, ubMo13997f);
    }

    /* JADX INFO: renamed from: m */
    public static <T> C2964w0<T> m14302m(AbstractC2940n1<?, ?> abstractC2940n1, AbstractC2947q<?> abstractC2947q, InterfaceC2954s0 interfaceC2954s0) {
        return new C2964w0<>(abstractC2940n1, abstractC2947q, interfaceC2954s0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: a */
    public void mo13540a(T t8, T t10) {
        C2925i1.m13656G(this.f11128b, t8, t10);
        if (this.f11129c) {
            C2925i1.m13654E(this.f11130d, t8, t10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: b */
    public void mo13541b(T t8) {
        this.f11128b.mo14001j(t8);
        this.f11130d.mo14061f(t8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: c */
    public final boolean mo13542c(T t8) {
        return this.f11130d.mo14058c(t8).m14201o();
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.n1<?, ?>, com.google.crypto.tink.shaded.protobuf.n1<UT, UB> */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: d */
    public int mo13543d(T t8) {
        int iM14300k = m14300k(this.f11128b, t8);
        return this.f11129c ? iM14300k + this.f11130d.mo14058c(t8).m14196j() : iM14300k;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: e */
    public T mo13544e() {
        InterfaceC2954s0 interfaceC2954s0 = this.f11127a;
        return interfaceC2954s0 instanceof AbstractC2967y ? (T) ((AbstractC2967y) interfaceC2954s0).m14328P() : (T) interfaceC2954s0.mo567e().mo577d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: f */
    public int mo13545f(T t8) {
        int iHashCode = this.f11128b.mo13998g(t8).hashCode();
        return this.f11129c ? (iHashCode * 53) + this.f11130d.mo14058c(t8).hashCode() : iHashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: g */
    public boolean mo13546g(T t8, T t10) {
        if (!this.f11128b.mo13998g(t8).equals(this.f11128b.mo13998g(t10))) {
            return false;
        }
        if (this.f11129c) {
            return this.f11130d.mo14058c(t8).equals(this.f11130d.mo14058c(t10));
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: T */
    /* JADX WARN: Code duplicated, block: B:32:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf A[EDGE_INSN: B:62:0x00cf->B:34:0x00cf BREAK  A[LOOP:1: B:17:0x006f->B:65:0x006f], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: h */
    public void mo13547h(T t8, byte[] bArr, int i10, int i11, C2911e.b bVar) throws C2903b0 {
        int iM13436J;
        AbstractC2967y abstractC2967y = (AbstractC2967y) t8;
        C2943o1 c2943o1M14021k = abstractC2967y.unknownFields;
        if (c2943o1M14021k == C2943o1.m14017c()) {
            c2943o1M14021k = C2943o1.m14021k();
            abstractC2967y.unknownFields = c2943o1M14021k;
        }
        C2943o1 c2943o1 = c2943o1M14021k;
        C2959u<AbstractC2967y.d> c2959uM14352Z = ((AbstractC2967y.c) t8).m14352Z();
        AbstractC2967y.e eVar = null;
        while (i10 < i11) {
            int iM13436J2 = C2911e.m13436J(bArr, i10, bVar);
            int i12 = bVar.f10837a;
            if (i12 == C2955s1.f10992a) {
                int i13 = i11;
                C2911e.b bVar2 = bVar;
                int i14 = 0;
                AbstractC2920h abstractC2920h = null;
                while (true) {
                    if (iM13436J2 >= i13) {
                        iM13436J = iM13436J2;
                        break;
                    }
                    iM13436J = C2911e.m13436J(bArr, iM13436J2, bVar2);
                    int i15 = bVar2.f10837a;
                    int iM14179a = C2955s1.m14179a(i15);
                    int iM14180b = C2955s1.m14180b(i15);
                    if (iM14179a != 2) {
                        if (iM14179a == 3) {
                            if (eVar != null) {
                                iM13436J2 = C2911e.m13460q(C2907c1.m13412a().m13414c(eVar.m14356b().getClass()), bArr, iM13436J, i13, bVar2);
                                c2959uM14352Z.m14206x(eVar.f11141b, bVar2.f10839c);
                            } else if (iM14180b == 2) {
                                iM13436J2 = C2911e.m13446c(bArr, iM13436J, bVar2);
                                abstractC2920h = (AbstractC2920h) bVar2.f10839c;
                            }
                        }
                        if (i15 == C2955s1.f10993b) {
                            break;
                        } else {
                            iM13436J2 = C2911e.m13443Q(i15, bArr, iM13436J, i13, bVar2);
                        }
                    } else if (iM14180b == 0) {
                        iM13436J2 = C2911e.m13436J(bArr, iM13436J, bVar2);
                        i14 = bVar2.f10837a;
                        eVar = (AbstractC2967y.e) this.f11130d.mo14057b(bVar2.f10840d, this.f11127a, i14);
                    } else {
                        if (i15 == C2955s1.f10993b) {
                            break;
                            break;
                        }
                        iM13436J2 = C2911e.m13443Q(i15, bArr, iM13436J, i13, bVar2);
                    }
                }
                if (abstractC2920h != null) {
                    c2943o1.m14032n(C2955s1.m14181c(i14, 2), abstractC2920h);
                }
                i10 = iM13436J;
                i11 = i13;
                bVar = bVar2;
            } else if (C2955s1.m14180b(i12) == 2) {
                eVar = (AbstractC2967y.e) this.f11130d.mo14057b(bVar.f10840d, this.f11127a, C2955s1.m14179a(i12));
                if (eVar != null) {
                    i10 = C2911e.m13460q(C2907c1.m13412a().m13414c(eVar.m14356b().getClass()), bArr, iM13436J2, i11, bVar);
                    c2959uM14352Z.m14206x(eVar.f11141b, bVar.f10839c);
                } else {
                    i10 = C2911e.m13434H(i12, bArr, iM13436J2, i11, c2943o1, bVar);
                }
            } else {
                i10 = C2911e.m13443Q(i12, bArr, iM13436J2, i11, bVar);
            }
        }
        if (i10 != i11) {
            throw C2903b0.m13403h();
        }
    }

    /* JADX DEBUG: Type inference failed for r1v0. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.n1<?, ?>, com.google.crypto.tink.shaded.protobuf.n1<UT, UB> */
    /* JADX DEBUG: Type inference failed for r2v0. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.q<?>, com.google.crypto.tink.shaded.protobuf.q<ET extends com.google.crypto.tink.shaded.protobuf.u$b<ET>> */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: i */
    public void mo13548i(T t8, InterfaceC2916f1 interfaceC2916f1, C2944p c2944p) throws Throwable {
        m14301l(this.f11128b, this.f11130d, t8, interfaceC2916f1, c2944p);
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: com.google.crypto.tink.shaded.protobuf.n1<?, ?>, com.google.crypto.tink.shaded.protobuf.n1<UT, UB> */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2919g1
    /* JADX INFO: renamed from: j */
    public void mo13549j(T t8, InterfaceC2958t1 interfaceC2958t1) {
        Iterator itM14202s = this.f11130d.mo14058c(t8).m14202s();
        while (itM14202s.hasNext()) {
            Map.Entry entry = (Map.Entry) itM14202s.next();
            C2959u.b bVar = (C2959u.b) entry.getKey();
            if (bVar.mo14211k() != C2955s1.c.MESSAGE || bVar.mo14208f() || bVar.mo14212m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C2909d0.b) {
                interfaceC2958t1.mo13908b(bVar.getNumber(), ((C2909d0.b) entry).m13420a().m13474e());
            } else {
                interfaceC2958t1.mo13908b(bVar.getNumber(), entry.getValue());
            }
        }
        m14304o(this.f11128b, t8, interfaceC2958t1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.google.crypto.tink.shaded.protobuf.u<ET extends com.google.crypto.tink.shaded.protobuf.u$b<ET>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public final <UT, UB, ET extends C2959u.b<ET>> boolean m14303n(InterfaceC2916f1 interfaceC2916f1, C2944p c2944p, AbstractC2947q<ET> abstractC2947q, C2959u<ET> c2959u, AbstractC2940n1<UT, UB> abstractC2940n1, UB ub) throws C2903b0 {
        int iMo13510a = interfaceC2916f1.mo13510a();
        int iMo13517h = 0;
        if (iMo13510a != C2955s1.f10992a) {
            if (C2955s1.m14180b(iMo13510a) != 2) {
                return interfaceC2916f1.mo13497D();
            }
            Object objMo14057b = abstractC2947q.mo14057b(c2944p, this.f11127a, C2955s1.m14179a(iMo13510a));
            if (objMo14057b == null) {
                return abstractC2940n1.m14004m(ub, interfaceC2916f1, 0);
            }
            abstractC2947q.mo14063h(interfaceC2916f1, objMo14057b, c2944p, c2959u);
            return true;
        }
        Object objMo14057b2 = null;
        AbstractC2920h abstractC2920hMo13524o = null;
        while (interfaceC2916f1.mo13494A() != Integer.MAX_VALUE) {
            int iMo13510a2 = interfaceC2916f1.mo13510a();
            if (iMo13510a2 == C2955s1.f10994c) {
                iMo13517h = interfaceC2916f1.mo13517h();
                objMo14057b2 = abstractC2947q.mo14057b(c2944p, this.f11127a, iMo13517h);
            } else if (iMo13510a2 == C2955s1.f10995d) {
                if (objMo14057b2 != null) {
                    abstractC2947q.mo14063h(interfaceC2916f1, objMo14057b2, c2944p, c2959u);
                } else {
                    abstractC2920hMo13524o = interfaceC2916f1.mo13524o();
                }
            } else if (!interfaceC2916f1.mo13497D()) {
                break;
            }
        }
        if (interfaceC2916f1.mo13510a() != C2955s1.f10993b) {
            throw C2903b0.m13397b();
        }
        if (abstractC2920hMo13524o != null) {
            if (objMo14057b2 != null) {
                abstractC2947q.mo14064i(abstractC2920hMo13524o, objMo14057b2, c2944p, c2959u);
            } else {
                abstractC2940n1.mo13995d(ub, iMo13517h, abstractC2920hMo13524o);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final <UT, UB> void m14304o(AbstractC2940n1<UT, UB> abstractC2940n1, T t8, InterfaceC2958t1 interfaceC2958t1) {
        abstractC2940n1.mo14010s(abstractC2940n1.mo13998g(t8), interfaceC2958t1);
    }
}
