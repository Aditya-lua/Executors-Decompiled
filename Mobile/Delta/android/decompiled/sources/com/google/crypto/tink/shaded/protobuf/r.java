package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends q<y.d> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8548a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f8548a = iArr;
            try {
                iArr[s1.b.f8554c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8548a[s1.b.f8555d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8548a[s1.b.f8556e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8548a[s1.b.f8557f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8548a[s1.b.f8558g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8548a[s1.b.f8559h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8548a[s1.b.f8560i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8548a[s1.b.f8561j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8548a[s1.b.f8566o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8548a[s1.b.f8568q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8548a[s1.b.f8569r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8548a[s1.b.f8570s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8548a[s1.b.f8571t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8548a[s1.b.f8567p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8548a[s1.b.f8565n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8548a[s1.b.f8562k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8548a[s1.b.f8563l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8548a[s1.b.f8564m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public int a(Map.Entry<?, ?> entry) {
        return ((y.d) entry.getKey()).getNumber();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public Object b(p pVar, s0 s0Var, int i10) {
        return pVar.a(s0Var, i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public u<y.d> c(Object obj) {
        return ((y.c) obj).extensions;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public u<y.d> d(Object obj) {
        return ((y.c) obj).Z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public boolean e(s0 s0Var) {
        return s0Var instanceof y.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void f(Object obj) {
        c(obj).t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public <UT, UB> UB g(Object obj, f1 f1Var, Object obj2, p pVar, u<y.d> uVar, UB ub, n1<UT, UB> n1Var) {
        Object objValueOf;
        Object objI;
        ArrayList arrayList;
        y.e eVar = (y.e) obj2;
        int iC = eVar.c();
        if (eVar.b.f() && eVar.b.m()) {
            switch (a.f8548a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    f1Var.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    f1Var.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    f1Var.i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    f1Var.g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    f1Var.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    f1Var.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    f1Var.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    f1Var.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    f1Var.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    f1Var.c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    f1Var.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    f1Var.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    f1Var.d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    f1Var.j(arrayList);
                    ub = (UB) i1.z(obj, iC, arrayList, eVar.b.b(), ub, n1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.g());
            }
            uVar.x(eVar.b, arrayList);
            return ub;
        }
        if (eVar.a() != s1.b.f8567p) {
            switch (a.f8548a[eVar.a().ordinal()]) {
                case 1:
                    objValueOf = Double.valueOf(f1Var.readDouble());
                    break;
                case 2:
                    objValueOf = Float.valueOf(f1Var.readFloat());
                    break;
                case 3:
                    objValueOf = Long.valueOf(f1Var.H());
                    break;
                case 4:
                    objValueOf = Long.valueOf(f1Var.s());
                    break;
                case 5:
                    objValueOf = Integer.valueOf(f1Var.p());
                    break;
                case 6:
                    objValueOf = Long.valueOf(f1Var.b());
                    break;
                case 7:
                    objValueOf = Integer.valueOf(f1Var.u());
                    break;
                case 8:
                    objValueOf = Boolean.valueOf(f1Var.e());
                    break;
                case 9:
                    objValueOf = Integer.valueOf(f1Var.h());
                    break;
                case 10:
                    objValueOf = Integer.valueOf(f1Var.E());
                    break;
                case 11:
                    objValueOf = Long.valueOf(f1Var.f());
                    break;
                case 12:
                    objValueOf = Integer.valueOf(f1Var.l());
                    break;
                case 13:
                    objValueOf = Long.valueOf(f1Var.y());
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    objValueOf = f1Var.o();
                    break;
                case 16:
                    objValueOf = f1Var.z();
                    break;
                case 17:
                    if (!eVar.d()) {
                        Object objI2 = uVar.i(eVar.b);
                        if (objI2 instanceof y) {
                            g1 g1VarD = c1.a().d(objI2);
                            if (!((y) objI2).J()) {
                                Object objE = g1VarD.e();
                                g1VarD.a(objE, objI2);
                                uVar.x(eVar.b, objE);
                                objI2 = objE;
                            }
                            f1Var.J(objI2, g1VarD, pVar);
                            return ub;
                        }
                    }
                    objValueOf = f1Var.K(eVar.b().getClass(), pVar);
                    break;
                case 18:
                    if (!eVar.d()) {
                        Object objI3 = uVar.i(eVar.b);
                        if (objI3 instanceof y) {
                            g1 g1VarD2 = c1.a().d(objI3);
                            if (!((y) objI3).J()) {
                                Object objE2 = g1VarD2.e();
                                g1VarD2.a(objE2, objI3);
                                uVar.x(eVar.b, objE2);
                                objI3 = objE2;
                            }
                            f1Var.M(objI3, g1VarD2, pVar);
                            return ub;
                        }
                    }
                    objValueOf = f1Var.O(eVar.b().getClass(), pVar);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iP = f1Var.p();
            if (eVar.b.b().a(iP) == null) {
                return (UB) i1.J(obj, iC, iP, ub, n1Var);
            }
            objValueOf = Integer.valueOf(iP);
        }
        if (eVar.d()) {
            uVar.a(eVar.b, objValueOf);
            return ub;
        }
        int i10 = a.f8548a[eVar.a().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objI = uVar.i(eVar.b)) != null) {
            objValueOf = a0.g(objI, objValueOf);
        }
        uVar.x(eVar.b, objValueOf);
        return ub;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void h(f1 f1Var, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        uVar.x(eVar.b, f1Var.O(eVar.b().getClass(), pVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void i(h hVar, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        s0.a aVarE = eVar.b().e();
        i iVarM = hVar.m();
        aVarE.F(iVarM, pVar);
        uVar.x(eVar.b, aVarE.d());
        iVarM.a(0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void j(t1 t1Var, Map.Entry<?, ?> entry) {
        y.d dVar = (y.d) entry.getKey();
        if (!dVar.f()) {
            switch (a.f8548a[dVar.g().ordinal()]) {
                case 1:
                    t1Var.p(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    t1Var.B(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    t1Var.u(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    t1Var.f(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    t1Var.h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    t1Var.s(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    t1Var.c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    t1Var.v(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    t1Var.o(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    t1Var.w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    t1Var.i(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    t1Var.H(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    t1Var.m(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    t1Var.h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    t1Var.M(dVar.getNumber(), (h) entry.getValue());
                    break;
                case 16:
                    t1Var.e(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    t1Var.K(dVar.getNumber(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    t1Var.N(dVar.getNumber(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f8548a[dVar.g().ordinal()]) {
            case 1:
                i1.O(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 2:
                i1.S(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 3:
                i1.V(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 4:
                i1.d0(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 5:
                i1.U(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 6:
                i1.R(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 7:
                i1.Q(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 8:
                i1.M(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 9:
                i1.c0(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 10:
                i1.X(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 11:
                i1.Y(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 12:
                i1.Z(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 13:
                i1.a0(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 14:
                i1.U(dVar.getNumber(), (List) entry.getValue(), t1Var, dVar.m());
                break;
            case 15:
                i1.N(dVar.getNumber(), (List) entry.getValue(), t1Var);
                break;
            case 16:
                i1.b0(dVar.getNumber(), (List) entry.getValue(), t1Var);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    i1.T(dVar.getNumber(), (List) entry.getValue(), t1Var, c1.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    i1.W(dVar.getNumber(), (List) entry.getValue(), t1Var, c1.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
