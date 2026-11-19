package r7;

/* JADX INFO: loaded from: classes3.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30591a = s7.c.a.a("s", "e", "o", "nm", "m", "hd");

    public static o7.t a(s7.c cVar, g7.i iVar) {
        String strN = null;
        o7.t.a aVarB = null;
        n7.b bVarF = null;
        n7.b bVarF2 = null;
        n7.b bVarF3 = null;
        boolean zG = false;
        while (cVar.f()) {
            int iS = cVar.s(f30591a);
            if (iS == 0) {
                bVarF = d.f(cVar, iVar, false);
            } else if (iS == 1) {
                bVarF2 = d.f(cVar, iVar, false);
            } else if (iS == 2) {
                bVarF3 = d.f(cVar, iVar, false);
            } else if (iS == 3) {
                strN = cVar.n();
            } else if (iS == 4) {
                aVarB = o7.t.a.b(cVar.k());
            } else if (iS != 5) {
                cVar.w();
            } else {
                zG = cVar.g();
            }
        }
        return new o7.t(strN, aVarB, bVarF, bVarF2, bVarF3, zG);
    }
}
