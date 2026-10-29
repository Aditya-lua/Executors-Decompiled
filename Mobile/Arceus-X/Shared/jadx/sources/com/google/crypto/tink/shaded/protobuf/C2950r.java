package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C2950r extends AbstractC2947q<AbstractC2967y.d> {

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10988a;

        static {
            int[] iArr = new int[C2955s1.b.values().length];
            f10988a = iArr;
            try {
                iArr[C2955s1.b.f10996c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10988a[C2955s1.b.f10997d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10988a[C2955s1.b.f10998e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10988a[C2955s1.b.f10999f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10988a[C2955s1.b.f11000g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10988a[C2955s1.b.f11001h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10988a[C2955s1.b.f11002i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10988a[C2955s1.b.f11003j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10988a[C2955s1.b.f11008o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10988a[C2955s1.b.f11010q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10988a[C2955s1.b.f11011r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10988a[C2955s1.b.f11012s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10988a[C2955s1.b.f11013t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10988a[C2955s1.b.f11009p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10988a[C2955s1.b.f11007n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10988a[C2955s1.b.f11004k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10988a[C2955s1.b.f11005l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10988a[C2955s1.b.f11006m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: a */
    public int mo14056a(Map.Entry<?, ?> entry) {
        return ((AbstractC2967y.d) entry.getKey()).getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: b */
    public Object mo14057b(C2944p c2944p, InterfaceC2954s0 interfaceC2954s0, int i10) {
        return c2944p.m14036a(interfaceC2954s0, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: c */
    public C2959u<AbstractC2967y.d> mo14058c(Object obj) {
        return ((AbstractC2967y.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: d */
    public C2959u<AbstractC2967y.d> mo14059d(Object obj) {
        return ((AbstractC2967y.c) obj).m14352Z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: e */
    public boolean mo14060e(InterfaceC2954s0 interfaceC2954s0) {
        return interfaceC2954s0 instanceof AbstractC2967y.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: f */
    public void mo14061f(Object obj) {
        mo14058c(obj).m14203t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: g */
    public <UT, UB> UB mo14062g(Object obj, InterfaceC2916f1 interfaceC2916f1, Object obj2, C2944p c2944p, C2959u<AbstractC2967y.d> c2959u, UB ub, AbstractC2940n1<UT, UB> abstractC2940n1) {
        Object objValueOf;
        Object objM14195i;
        ArrayList arrayList;
        AbstractC2967y.e eVar = (AbstractC2967y.e) obj2;
        int iM14357c = eVar.m14357c();
        if (eVar.f11141b.mo14208f() && eVar.f11141b.mo14212m()) {
            switch (a.f10988a[eVar.m14355a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13500G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13496C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13518i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13516g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13532w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13526q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13533x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13522m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13529t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13512c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13531v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13527r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13513d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC2916f1.mo13519j(arrayList);
                    ub = (UB) C2925i1.m13705z(obj, iM14357c, arrayList, eVar.f11141b.m14354b(), ub, abstractC2940n1);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f11141b.mo14209g());
            }
            c2959u.m14206x(eVar.f11141b, arrayList);
            return ub;
        }
        if (eVar.m14355a() != C2955s1.b.f11009p) {
            switch (a.f10988a[eVar.m14355a().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(interfaceC2916f1.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(interfaceC2916f1.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(interfaceC2916f1.mo13501H());
                    break;
                case 4:
                    objValueOf = Long.valueOf(interfaceC2916f1.mo13528s());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(interfaceC2916f1.mo13525p());
                    break;
                case 6:
                    objValueOf = Long.valueOf(interfaceC2916f1.mo13511b());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(interfaceC2916f1.mo13530u());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(interfaceC2916f1.mo13514e());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(interfaceC2916f1.mo13517h());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(interfaceC2916f1.mo13498E());
                    break;
                case 11:
                    objValueOf = Long.valueOf(interfaceC2916f1.mo13515f());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(interfaceC2916f1.mo13521l());
                    break;
                case 13:
                    objValueOf = Long.valueOf(interfaceC2916f1.mo13534y());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = interfaceC2916f1.mo13524o();
                    break;
                case 16:
                    objValueOf = interfaceC2916f1.mo13535z();
                    break;
                case 17:
                    if (!eVar.m14358d()) {
                        Object objM14195i2 = c2959u.m14195i(eVar.f11141b);
                        if (objM14195i2 instanceof AbstractC2967y) {
                            InterfaceC2919g1 interfaceC2919g1M13415d = C2907c1.m13412a().m13415d(objM14195i2);
                            if (!((AbstractC2967y) objM14195i2).m14324J()) {
                                Object objMo13544e = interfaceC2919g1M13415d.mo13544e();
                                interfaceC2919g1M13415d.mo13540a(objMo13544e, objM14195i2);
                                c2959u.m14206x(eVar.f11141b, objMo13544e);
                                objM14195i2 = objMo13544e;
                            }
                            interfaceC2916f1.mo13503J(objM14195i2, interfaceC2919g1M13415d, c2944p);
                            return ub;
                        }
                    }
                    objValueOf = interfaceC2916f1.mo13504K(eVar.m14356b().getClass(), c2944p);
                    break;
                case 18:
                    if (!eVar.m14358d()) {
                        Object objM14195i3 = c2959u.m14195i(eVar.f11141b);
                        if (objM14195i3 instanceof AbstractC2967y) {
                            InterfaceC2919g1 interfaceC2919g1M13415d2 = C2907c1.m13412a().m13415d(objM14195i3);
                            if (!((AbstractC2967y) objM14195i3).m14324J()) {
                                Object objMo13544e2 = interfaceC2919g1M13415d2.mo13544e();
                                interfaceC2919g1M13415d2.mo13540a(objMo13544e2, objM14195i3);
                                c2959u.m14206x(eVar.f11141b, objMo13544e2);
                                objM14195i3 = objMo13544e2;
                            }
                            interfaceC2916f1.mo13506M(objM14195i3, interfaceC2919g1M13415d2, c2944p);
                            return ub;
                        }
                    }
                    objValueOf = interfaceC2916f1.mo13508O(eVar.m14356b().getClass(), c2944p);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iMo13525p = interfaceC2916f1.mo13525p();
            if (eVar.f11141b.m14354b().mo612a(iMo13525p) == null) {
                return (UB) C2925i1.m13659J(obj, iM14357c, iMo13525p, ub, abstractC2940n1);
            }
            objValueOf = Integer.valueOf(iMo13525p);
        }
        if (eVar.m14358d()) {
            c2959u.m14192a(eVar.f11141b, objValueOf);
            return ub;
        }
        int i10 = a.f10988a[eVar.m14355a().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objM14195i = c2959u.m14195i(eVar.f11141b)) != null) {
            objValueOf = C2900a0.m13385g(objM14195i, objValueOf);
        }
        c2959u.m14206x(eVar.f11141b, objValueOf);
        return ub;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: h */
    public void mo14063h(InterfaceC2916f1 interfaceC2916f1, Object obj, C2944p c2944p, C2959u<AbstractC2967y.d> c2959u) {
        AbstractC2967y.e eVar = (AbstractC2967y.e) obj;
        c2959u.m14206x(eVar.f11141b, interfaceC2916f1.mo13508O(eVar.m14356b().getClass(), c2944p));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: i */
    public void mo14064i(AbstractC2920h abstractC2920h, Object obj, C2944p c2944p, C2959u<AbstractC2967y.d> c2959u) {
        AbstractC2967y.e eVar = (AbstractC2967y.e) obj;
        InterfaceC2954s0.a aVarMo567e = eVar.m14356b().mo567e();
        AbstractC2923i abstractC2923iMo13565m = abstractC2920h.mo13565m();
        aVarMo567e.mo575F(abstractC2923iMo13565m, c2944p);
        c2959u.m14206x(eVar.f11141b, aVarMo567e.mo577d());
        abstractC2923iMo13565m.mo13595a(0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2947q
    /* JADX INFO: renamed from: j */
    public void mo14065j(InterfaceC2958t1 interfaceC2958t1, Map.Entry<?, ?> entry) {
        AbstractC2967y.d dVar = (AbstractC2967y.d) entry.getKey();
        if (!dVar.mo14208f()) {
            switch (a.f10988a[dVar.mo14209g().ordinal()]) {
                case 1:
                    interfaceC2958t1.mo13936p(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    interfaceC2958t1.mo13882B(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    interfaceC2958t1.mo13946u(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    interfaceC2958t1.mo13916f(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    interfaceC2958t1.mo13920h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    interfaceC2958t1.mo13942s(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    interfaceC2958t1.mo13910c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    interfaceC2958t1.mo13947v(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    interfaceC2958t1.mo13934o(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    interfaceC2958t1.mo13948w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    interfaceC2958t1.mo13922i(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    interfaceC2958t1.mo13888H(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    interfaceC2958t1.mo13930m(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    interfaceC2958t1.mo13920h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    interfaceC2958t1.mo13893M(dVar.getNumber(), (AbstractC2920h) entry.getValue());
                    break;
                case 16:
                    interfaceC2958t1.mo13914e(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    interfaceC2958t1.mo13891K(dVar.getNumber(), entry.getValue(), C2907c1.m13412a().m13414c(entry.getValue().getClass()));
                    break;
                case 18:
                    interfaceC2958t1.mo13894N(dVar.getNumber(), entry.getValue(), C2907c1.m13412a().m13414c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f10988a[dVar.mo14209g().ordinal()]) {
            case 1:
                C2925i1.m13664O(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 2:
                C2925i1.m13668S(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 3:
                C2925i1.m13671V(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 4:
                C2925i1.m13683d0(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 5:
                C2925i1.m13670U(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 6:
                C2925i1.m13667R(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 7:
                C2925i1.m13666Q(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 8:
                C2925i1.m13662M(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 9:
                C2925i1.m13681c0(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 10:
                C2925i1.m13673X(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 11:
                C2925i1.m13674Y(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 12:
                C2925i1.m13675Z(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 13:
                C2925i1.m13677a0(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 14:
                C2925i1.m13670U(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, dVar.mo14212m());
                break;
            case 15:
                C2925i1.m13663N(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1);
                break;
            case 16:
                C2925i1.m13679b0(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    C2925i1.m13669T(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, C2907c1.m13412a().m13414c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    C2925i1.m13672W(dVar.getNumber(), (List) entry.getValue(), interfaceC2958t1, C2907c1.m13412a().m13414c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
