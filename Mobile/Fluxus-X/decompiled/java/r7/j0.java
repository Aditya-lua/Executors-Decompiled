package r7;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30580a = s7.c.a.a("nm", "hd", "it");

    public static o7.q a(s7.c cVar, g7.i iVar) {
        ArrayList arrayList = new ArrayList();
        String strN = null;
        boolean zG = false;
        while (cVar.f()) {
            int iS = cVar.s(f30580a);
            if (iS == 0) {
                strN = cVar.n();
            } else if (iS == 1) {
                zG = cVar.g();
            } else if (iS != 2) {
                cVar.w();
            } else {
                cVar.b();
                while (cVar.f()) {
                    o7.c cVarA = h.a(cVar, iVar);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                cVar.d();
            }
        }
        return new o7.q(strN, arrayList, zG);
    }
}
