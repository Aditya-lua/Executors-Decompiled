package q7;

/* JADX INFO: loaded from: classes3.dex */
public class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static r7.c.a f29257a = r7.c.a.a("nm", "ind", "ks", "hd");

    public static n7.r a(r7.c cVar, f7.i iVar) {
        String strM = null;
        int iJ = 0;
        boolean zG = false;
        m7.h hVarK = null;
        while (cVar.f()) {
            int iR = cVar.r(f29257a);
            if (iR == 0) {
                strM = cVar.m();
            } else if (iR == 1) {
                iJ = cVar.j();
            } else if (iR == 2) {
                hVarK = d.k(cVar, iVar);
            } else if (iR != 3) {
                cVar.u();
            } else {
                zG = cVar.g();
            }
        }
        return new n7.r(strM, iJ, hVarK, zG);
    }
}
