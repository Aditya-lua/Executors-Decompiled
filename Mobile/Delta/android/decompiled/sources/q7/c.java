package q7;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29233a = r7.c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");
    public static final r7.c.a b = r7.c.a.a("k");

    public static boolean a(m7.e eVar) {
        if (eVar != null) {
            return eVar.c() && eVar.b().get(0).b.equals(0.0f, 0.0f);
        }
        return true;
    }

    public static boolean b(m7.o<PointF, PointF> oVar) {
        if (oVar != null) {
            return !(oVar instanceof m7.i) && oVar.c() && oVar.b().get(0).b.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean c(m7.b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((t7.a) bVar.b().get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean d(m7.g gVar) {
        if (gVar != null) {
            return gVar.c() && ((t7.d) ((t7.a) gVar.b().get(0)).b).a(1.0f, 1.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean e(m7.b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((t7.a) bVar.b().get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean f(m7.b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((t7.a) bVar.b().get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    public static m7.n g(r7.c cVar, f7.i iVar) {
        m7.b bVarF;
        f7.i iVar2 = iVar;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z10 = cVar.o() == r7.c.b.BEGIN_OBJECT;
        if (z10) {
            cVar.c();
        }
        m7.b bVar = null;
        m7.e eVarA = null;
        m7.o<PointF, PointF> oVarB = null;
        m7.g gVarJ = null;
        m7.b bVarF2 = null;
        m7.b bVarF3 = null;
        m7.d dVarH = null;
        m7.b bVarF4 = null;
        m7.b bVarF5 = null;
        while (cVar.f()) {
            switch (cVar.r(f29233a)) {
                case 0:
                    cVar.c();
                    while (cVar.f()) {
                        if (cVar.r(b) != 0) {
                            cVar.s();
                            cVar.u();
                        } else {
                            eVarA = a.a(cVar, iVar);
                        }
                    }
                    cVar.e();
                    iVar2 = iVar;
                    break;
                case 1:
                    oVarB = a.b(cVar, iVar);
                    iVar2 = iVar;
                    break;
                case 2:
                    gVarJ = d.j(cVar, iVar);
                    iVar2 = iVar;
                    break;
                case 3:
                    iVar2.a("Lottie doesn't support 3D layers.");
                    bVarF = d.f(cVar, iVar2, false);
                    if (bVarF.b().isEmpty()) {
                        bVarF.b().add(new t7.a(iVar2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(iVar2.f())));
                    } else if (((t7.a) bVarF.b().get(0)).b == 0) {
                        bVarF.b().set(0, new t7.a(iVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(iVar.f())));
                    }
                    iVar2 = iVar;
                    bVar = bVarF;
                    break;
                case 4:
                    bVarF = d.f(cVar, iVar2, false);
                    if (bVarF.b().isEmpty()) {
                        bVarF.b().add(new t7.a(iVar2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(iVar2.f())));
                    } else if (((t7.a) bVarF.b().get(0)).b == 0) {
                        bVarF.b().set(0, new t7.a(iVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(iVar.f())));
                    }
                    iVar2 = iVar;
                    bVar = bVarF;
                    break;
                case 5:
                    dVarH = d.h(cVar, iVar);
                    break;
                case 6:
                    bVarF4 = d.f(cVar, iVar2, false);
                    break;
                case 7:
                    bVarF5 = d.f(cVar, iVar2, false);
                    break;
                case 8:
                    bVarF2 = d.f(cVar, iVar2, false);
                    break;
                case 9:
                    bVarF3 = d.f(cVar, iVar2, false);
                    break;
                default:
                    cVar.s();
                    cVar.u();
                    break;
            }
        }
        if (z10) {
            cVar.e();
        }
        m7.e eVar = a(eVarA) ? null : eVarA;
        if (b(oVarB)) {
            oVarB = null;
        }
        return new m7.n(eVar, oVarB, d(gVarJ) ? null : gVarJ, c(bVar) ? null : bVar, dVarH, bVarF4, bVarF5, f(bVarF2) ? null : bVarF2, e(bVarF3) ? null : bVarF3);
    }
}
