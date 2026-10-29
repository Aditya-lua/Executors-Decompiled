package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p<x.d> {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2257a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f2257a = iArr;
            try {
                iArr[s1.b.f2286c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2257a[s1.b.f2287d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2257a[s1.b.f2288e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2257a[s1.b.f2289f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2257a[s1.b.f2290g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2257a[s1.b.f2291h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2257a[s1.b.f2292i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2257a[s1.b.f2293j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2257a[s1.b.f2298o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2257a[s1.b.f2300q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2257a[s1.b.f2301r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2257a[s1.b.f2302s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2257a[s1.b.f2303t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2257a[s1.b.f2299p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2257a[s1.b.f2297n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2257a[s1.b.f2294k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2257a[s1.b.f2295l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2257a[s1.b.f2296m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public int a(Map.Entry<?, ?> entry) {
        return ((x.d) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public Object b(o oVar, r0 r0Var, int i10) {
        return oVar.a(r0Var, i10);
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public t<x.d> c(Object obj) {
        return ((x.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public t<x.d> d(Object obj) {
        return ((x.c) obj).U();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public boolean e(r0 r0Var) {
        return r0Var instanceof x.c;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public void f(Object obj) {
        c(obj).u();
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public <UT, UB> UB g(Object obj, f1 f1Var, Object obj2, o oVar, t<x.d> tVar, UB ub, n1<UT, UB> n1Var) {
        Object objI;
        ArrayList arrayList;
        x.e eVar = (x.e) obj2;
        int iC = eVar.c();
        if (eVar.b.f() && eVar.b.m()) {
            switch (a.f2257a[eVar.a().ordinal()]) {
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
                    eVar.b.b();
                    ub = (UB) i1.z(obj, iC, arrayList, null, ub, n1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.g());
            }
            tVar.y(eVar.b, arrayList);
            return ub;
        }
        Object objG = null;
        if (eVar.a() == s1.b.f2299p) {
            f1Var.p();
            eVar.b.b();
            throw null;
        }
        int[] iArr = a.f2257a;
        switch (iArr[eVar.a().ordinal()]) {
            case 1:
                objG = Double.valueOf(f1Var.readDouble());
                break;
            case 2:
                objG = Float.valueOf(f1Var.readFloat());
                break;
            case 3:
                objG = Long.valueOf(f1Var.H());
                break;
            case 4:
                objG = Long.valueOf(f1Var.s());
                break;
            case 5:
                objG = Integer.valueOf(f1Var.p());
                break;
            case 6:
                objG = Long.valueOf(f1Var.b());
                break;
            case 7:
                objG = Integer.valueOf(f1Var.u());
                break;
            case 8:
                objG = Boolean.valueOf(f1Var.e());
                break;
            case 9:
                objG = Integer.valueOf(f1Var.h());
                break;
            case 10:
                objG = Integer.valueOf(f1Var.E());
                break;
            case 11:
                objG = Long.valueOf(f1Var.f());
                break;
            case 12:
                objG = Integer.valueOf(f1Var.l());
                break;
            case 13:
                objG = Long.valueOf(f1Var.y());
                break;
            case 14:
                throw new IllegalStateException("Shouldn't reach here.");
            case 15:
                objG = f1Var.o();
                break;
            case 16:
                objG = f1Var.z();
                break;
            case 17:
                if (!eVar.d()) {
                    Object objI2 = tVar.i(eVar.b);
                    if (objI2 instanceof x) {
                        g1 g1VarD = c1.a().d(objI2);
                        if (!((x) objI2).I()) {
                            Object objE = g1VarD.e();
                            g1VarD.a(objE, objI2);
                            tVar.y(eVar.b, objE);
                            objI2 = objE;
                        }
                        f1Var.O(objI2, g1VarD, oVar);
                        return ub;
                    }
                }
                objG = f1Var.M(eVar.b().getClass(), oVar);
                break;
            case 18:
                if (!eVar.d()) {
                    Object objI3 = tVar.i(eVar.b);
                    if (objI3 instanceof x) {
                        g1 g1VarD2 = c1.a().d(objI3);
                        if (!((x) objI3).I()) {
                            Object objE2 = g1VarD2.e();
                            g1VarD2.a(objE2, objI3);
                            tVar.y(eVar.b, objE2);
                            objI3 = objE2;
                        }
                        f1Var.J(objI3, g1VarD2, oVar);
                        return ub;
                    }
                }
                objG = f1Var.L(eVar.b().getClass(), oVar);
                break;
        }
        if (eVar.d()) {
            tVar.a(eVar.b, objG);
            return ub;
        }
        int i10 = iArr[eVar.a().ordinal()];
        if ((i10 == 17 || i10 == 18) && (objI = tVar.i(eVar.b)) != null) {
            objG = z.g(objI, objG);
        }
        tVar.y(eVar.b, objG);
        return ub;
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public void h(f1 f1Var, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        tVar.y(eVar.b, f1Var.L(eVar.b().getClass(), oVar));
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public void i(g gVar, Object obj, o oVar, t<x.d> tVar) {
        x.e eVar = (x.e) obj;
        r0.a aVarE = eVar.b().e();
        h hVarM = gVar.m();
        aVarE.u(hVarM, oVar);
        tVar.y(eVar.b, aVarE.d());
        hVarM.a(0);
    }

    @Override // androidx.datastore.preferences.protobuf.p
    public void j(t1 t1Var, Map.Entry<?, ?> entry) {
        x.d dVar = (x.d) entry.getKey();
        if (!dVar.f()) {
            switch (a.f2257a[dVar.g().ordinal()]) {
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
                    t1Var.K(dVar.getNumber(), (g) entry.getValue());
                    break;
                case 16:
                    t1Var.e(dVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    t1Var.N(dVar.getNumber(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    t1Var.L(dVar.getNumber(), entry.getValue(), c1.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.f2257a[dVar.g().ordinal()]) {
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
