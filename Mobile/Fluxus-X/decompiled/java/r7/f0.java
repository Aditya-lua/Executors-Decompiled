package r7;

/* JADX INFO: loaded from: classes3.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30569a = s7.c.a.a("nm", "r", "hd");

    public static o7.n a(s7.c cVar, g7.i iVar) {
        boolean zG = false;
        String strN = null;
        n7.b bVarF = null;
        while (cVar.f()) {
            int iS = cVar.s(f30569a);
            if (iS == 0) {
                strN = cVar.n();
            } else if (iS == 1) {
                bVarF = d.f(cVar, iVar, true);
            } else if (iS != 2) {
                cVar.w();
            } else {
                zG = cVar.g();
            }
        }
        if (zG) {
            return null;
        }
        return new o7.n(strN, bVarF);
    }
}
