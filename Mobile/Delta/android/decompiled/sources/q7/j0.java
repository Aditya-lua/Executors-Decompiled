package q7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29250a = r7.c.a.a("nm", "hd", "it");

    public static n7.q a(r7.c cVar, f7.i iVar) {
        ArrayList arrayList = new ArrayList();
        String strM = null;
        boolean zG = false;
        while (cVar.f()) {
            int iR = cVar.r(f29250a);
            if (iR == 0) {
                strM = cVar.m();
            } else if (iR == 1) {
                zG = cVar.g();
            } else if (iR != 2) {
                cVar.u();
            } else {
                cVar.b();
                while (cVar.f()) {
                    n7.c cVarA = h.a(cVar, iVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                cVar.d();
            }
        }
        return new n7.q(strM, arrayList, zG);
    }
}
