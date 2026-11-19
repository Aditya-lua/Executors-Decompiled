package r7;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30560a = s7.c.a.a("s", "a");
    public static final s7.c.a b = s7.c.a.a("s", "e", "o", "r");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s7.c.a f30561c = s7.c.a.a("fc", "sc", "sw", "t", "o");

    public static n7.k a(s7.c cVar, g7.i iVar) {
        cVar.c();
        n7.m mVarC = null;
        n7.l lVarB = null;
        while (cVar.f()) {
            int iS = cVar.s(f30560a);
            if (iS == 0) {
                lVarB = b(cVar, iVar);
            } else if (iS != 1) {
                cVar.u();
                cVar.w();
            } else {
                mVarC = c(cVar, iVar);
            }
        }
        cVar.e();
        return new n7.k(mVarC, lVarB);
    }

    public static n7.l b(s7.c cVar, g7.i iVar) {
        cVar.c();
        n7.d dVar = null;
        n7.d dVarH = null;
        n7.d dVarH2 = null;
        o7.u uVar = null;
        while (cVar.f()) {
            int iS = cVar.s(b);
            if (iS == 0) {
                dVar = d.h(cVar, iVar);
            } else if (iS == 1) {
                dVarH = d.h(cVar, iVar);
            } else if (iS == 2) {
                dVarH2 = d.h(cVar, iVar);
            } else if (iS != 3) {
                cVar.u();
                cVar.w();
            } else {
                int iK = cVar.k();
                if (iK == 1 || iK == 2) {
                    uVar = iK == 1 ? o7.u.PERCENT : o7.u.INDEX;
                } else {
                    iVar.a("Unsupported text range units: " + iK);
                    uVar = o7.u.INDEX;
                }
            }
        }
        cVar.e();
        if (dVar == null && dVarH != null) {
            dVar = new n7.d(Collections.singletonList(new u7.a(0)));
        }
        return new n7.l(dVar, dVarH, dVarH2, uVar);
    }

    public static n7.m c(s7.c cVar, g7.i iVar) {
        cVar.c();
        n7.a aVarC = null;
        n7.a aVarC2 = null;
        n7.b bVarE = null;
        n7.b bVarE2 = null;
        n7.d dVarH = null;
        while (cVar.f()) {
            int iS = cVar.s(f30561c);
            if (iS == 0) {
                aVarC = d.c(cVar, iVar);
            } else if (iS == 1) {
                aVarC2 = d.c(cVar, iVar);
            } else if (iS == 2) {
                bVarE = d.e(cVar, iVar);
            } else if (iS == 3) {
                bVarE2 = d.e(cVar, iVar);
            } else if (iS != 4) {
                cVar.u();
                cVar.w();
            } else {
                dVarH = d.h(cVar, iVar);
            }
        }
        cVar.e();
        return new n7.m(aVarC, aVarC2, bVarE, bVarE2, dVarH);
    }
}
