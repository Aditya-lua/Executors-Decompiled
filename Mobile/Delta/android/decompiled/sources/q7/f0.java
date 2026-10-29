package q7;

/* JADX INFO: loaded from: classes3.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29239a = r7.c.a.a("nm", "r", "hd");

    public static n7.n a(r7.c cVar, f7.i iVar) {
        boolean zG = false;
        String strM = null;
        m7.b bVarF = null;
        while (cVar.f()) {
            int iR = cVar.r(f29239a);
            if (iR == 0) {
                strM = cVar.m();
            } else if (iR == 1) {
                bVarF = d.f(cVar, iVar, true);
            } else if (iR != 2) {
                cVar.u();
            } else {
                zG = cVar.g();
            }
        }
        if (zG) {
            return null;
        }
        return new n7.n(strM, bVarF);
    }
}
