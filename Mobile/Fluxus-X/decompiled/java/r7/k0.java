package r7;

/* JADX INFO: loaded from: classes3.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static s7.c.a f30587a = s7.c.a.a("nm", "ind", "ks", "hd");

    public static o7.r a(s7.c cVar, g7.i iVar) {
        String strN = null;
        int iK = 0;
        boolean zG = false;
        n7.h hVarK = null;
        while (cVar.f()) {
            int iS = cVar.s(f30587a);
            if (iS == 0) {
                strN = cVar.n();
            } else if (iS == 1) {
                iK = cVar.k();
            } else if (iS == 2) {
                hVarK = d.k(cVar, iVar);
            } else if (iS != 3) {
                cVar.w();
            } else {
                zG = cVar.g();
            }
        }
        return new o7.r(strN, iK, hVarK, zG);
    }
}
