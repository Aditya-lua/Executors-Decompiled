package q7;

/* JADX INFO: loaded from: classes3.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29237a = r7.c.a.a("nm", "c", "o", "tr", "hd");

    public static n7.m a(r7.c cVar, f7.i iVar) {
        String strM = null;
        m7.b bVarF = null;
        m7.b bVarF2 = null;
        m7.n nVarG = null;
        boolean zG = false;
        while (cVar.f()) {
            int iR = cVar.r(f29237a);
            if (iR == 0) {
                strM = cVar.m();
            } else if (iR == 1) {
                bVarF = d.f(cVar, iVar, false);
            } else if (iR == 2) {
                bVarF2 = d.f(cVar, iVar, false);
            } else if (iR == 3) {
                nVarG = c.g(cVar, iVar);
            } else if (iR != 4) {
                cVar.u();
            } else {
                zG = cVar.g();
            }
        }
        return new n7.m(strM, bVarF, bVarF2, nVarG, zG);
    }
}
