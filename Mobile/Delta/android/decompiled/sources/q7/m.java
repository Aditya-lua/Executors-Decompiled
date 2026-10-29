package q7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29260a = r7.c.a.a("ch", "size", "w", "style", "fFamily", "data");
    public static final r7.c.a b = r7.c.a.a("shapes");

    public static l7.d a(r7.c cVar, f7.i iVar) {
        ArrayList arrayList = new ArrayList();
        cVar.c();
        double dH = 0.0d;
        String strM = null;
        String strM2 = null;
        char cCharAt = 0;
        double dH2 = 0.0d;
        while (cVar.f()) {
            int iR = cVar.r(f29260a);
            if (iR == 0) {
                cCharAt = cVar.m().charAt(0);
            } else if (iR == 1) {
                dH2 = cVar.h();
            } else if (iR == 2) {
                dH = cVar.h();
            } else if (iR == 3) {
                strM = cVar.m();
            } else if (iR == 4) {
                strM2 = cVar.m();
            } else if (iR != 5) {
                cVar.s();
                cVar.u();
            } else {
                cVar.c();
                while (cVar.f()) {
                    if (cVar.r(b) != 0) {
                        cVar.s();
                        cVar.u();
                    } else {
                        cVar.b();
                        while (cVar.f()) {
                            arrayList.add((n7.q) h.a(cVar, iVar));
                        }
                        cVar.d();
                    }
                }
                cVar.e();
            }
        }
        cVar.e();
        return new l7.d(arrayList, cCharAt, dH2, dH, strM, strM2);
    }
}
