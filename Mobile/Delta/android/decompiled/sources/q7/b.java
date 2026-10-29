package q7;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29230a = r7.c.a.a("s", "a");
    public static final r7.c.a b = r7.c.a.a("s", "e", "o", "r");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r7.c.a f29231c = r7.c.a.a("fc", "sc", "sw", "t", "o");

    public static m7.k a(r7.c cVar, f7.i iVar) {
        cVar.c();
        m7.m mVarC = null;
        m7.l lVarB = null;
        while (cVar.f()) {
            int iR = cVar.r(f29230a);
            if (iR == 0) {
                lVarB = b(cVar, iVar);
            } else if (iR != 1) {
                cVar.s();
                cVar.u();
            } else {
                mVarC = c(cVar, iVar);
            }
        }
        cVar.e();
        return new m7.k(mVarC, lVarB);
    }

    public static m7.l b(r7.c cVar, f7.i iVar) {
        cVar.c();
        m7.d dVar = null;
        m7.d dVarH = null;
        m7.d dVarH2 = null;
        n7.u uVar = null;
        while (cVar.f()) {
            int iR = cVar.r(b);
            if (iR == 0) {
                dVar = d.h(cVar, iVar);
            } else if (iR == 1) {
                dVarH = d.h(cVar, iVar);
            } else if (iR == 2) {
                dVarH2 = d.h(cVar, iVar);
            } else if (iR != 3) {
                cVar.s();
                cVar.u();
            } else {
                int iJ = cVar.j();
                if (iJ == 1 || iJ == 2) {
                    uVar = iJ == 1 ? n7.u.PERCENT : n7.u.INDEX;
                } else {
                    iVar.a("Unsupported text range units: " + iJ);
                    uVar = n7.u.INDEX;
                }
            }
        }
        cVar.e();
        if (dVar == null && dVarH != null) {
            dVar = new m7.d(Collections.singletonList(new t7.a(0)));
        }
        return new m7.l(dVar, dVarH, dVarH2, uVar);
    }

    public static m7.m c(r7.c cVar, f7.i iVar) {
        cVar.c();
        m7.a aVarC = null;
        m7.a aVarC2 = null;
        m7.b bVarE = null;
        m7.b bVarE2 = null;
        m7.d dVarH = null;
        while (cVar.f()) {
            int iR = cVar.r(f29231c);
            if (iR == 0) {
                aVarC = d.c(cVar, iVar);
            } else if (iR == 1) {
                aVarC2 = d.c(cVar, iVar);
            } else if (iR == 2) {
                bVarE = d.e(cVar, iVar);
            } else if (iR == 3) {
                bVarE2 = d.e(cVar, iVar);
            } else if (iR != 4) {
                cVar.s();
                cVar.u();
            } else {
                dVarH = d.h(cVar, iVar);
            }
        }
        cVar.e();
        return new m7.m(aVarC, aVarC2, bVarE, bVarE2, dVarH);
    }
}
