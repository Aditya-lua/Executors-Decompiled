package r7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30590a = s7.c.a.a("ch", "size", "w", "style", "fFamily", "data");
    public static final s7.c.a b = s7.c.a.a("shapes");

    public static m7.d a(s7.c cVar, g7.i iVar) {
        ArrayList arrayList = new ArrayList();
        cVar.c();
        double dH = 0.0d;
        String strN = null;
        String strN2 = null;
        char cCharAt = 0;
        double dH2 = 0.0d;
        while (cVar.f()) {
            int iS = cVar.s(f30590a);
            if (iS == 0) {
                cCharAt = cVar.n().charAt(0);
            } else if (iS == 1) {
                dH2 = cVar.h();
            } else if (iS == 2) {
                dH = cVar.h();
            } else if (iS == 3) {
                strN = cVar.n();
            } else if (iS == 4) {
                strN2 = cVar.n();
            } else if (iS != 5) {
                cVar.u();
                cVar.w();
            } else {
                cVar.c();
                while (cVar.f()) {
                    if (cVar.s(b) != 0) {
                        cVar.u();
                        cVar.w();
                    } else {
                        cVar.b();
                        while (cVar.f()) {
                            arrayList.add((o7.q) h.a(cVar, iVar));
                        }
                        cVar.d();
                    }
                }
                cVar.e();
            }
        }
        cVar.e();
        return new m7.d(arrayList, cCharAt, dH2, dH, strN, strN2);
    }
}
