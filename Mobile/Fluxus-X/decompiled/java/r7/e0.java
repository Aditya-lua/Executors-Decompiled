package r7;

/* JADX INFO: loaded from: classes3.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30567a = s7.c.a.a("nm", "c", "o", "tr", "hd");

    public static o7.m a(s7.c cVar, g7.i iVar) {
        String strN = null;
        n7.b bVarF = null;
        n7.b bVarF2 = null;
        n7.n nVarG = null;
        boolean zG = false;
        while (cVar.f()) {
            int iS = cVar.s(f30567a);
            if (iS == 0) {
                strN = cVar.n();
            } else if (iS == 1) {
                bVarF = d.f(cVar, iVar, false);
            } else if (iS == 2) {
                bVarF2 = d.f(cVar, iVar, false);
            } else if (iS == 3) {
                nVarG = c.g(cVar, iVar);
            } else if (iS != 4) {
                cVar.w();
            } else {
                zG = cVar.g();
            }
        }
        return new o7.m(strN, bVarF, bVarF2, nVarG, zG);
    }
}
