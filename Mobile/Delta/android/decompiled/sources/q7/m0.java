package q7;

/* JADX INFO: loaded from: classes3.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29261a = r7.c.a.a("s", "e", "o", "nm", "m", "hd");

    public static n7.t a(r7.c cVar, f7.i iVar) {
        String strM = null;
        n7.t.a aVarB = null;
        m7.b bVarF = null;
        m7.b bVarF2 = null;
        m7.b bVarF3 = null;
        boolean zG = false;
        while (cVar.f()) {
            int iR = cVar.r(f29261a);
            if (iR == 0) {
                bVarF = d.f(cVar, iVar, false);
            } else if (iR == 1) {
                bVarF2 = d.f(cVar, iVar, false);
            } else if (iR == 2) {
                bVarF3 = d.f(cVar, iVar, false);
            } else if (iR == 3) {
                strM = cVar.m();
            } else if (iR == 4) {
                aVarB = n7.t.a.b(cVar.j());
            } else if (iR != 5) {
                cVar.u();
            } else {
                zG = cVar.g();
            }
        }
        return new n7.t(strM, aVarB, bVarF, bVarF2, bVarF3, zG);
    }
}
