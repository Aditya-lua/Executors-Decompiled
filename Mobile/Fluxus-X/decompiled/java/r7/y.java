package r7;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30610a = s7.c.a.a("nm", "mm", "hd");

    public static o7.j a(s7.c cVar) {
        String strN = null;
        boolean zG = false;
        o7.j.a aVarB = null;
        while (cVar.f()) {
            int iS = cVar.s(f30610a);
            if (iS == 0) {
                strN = cVar.n();
            } else if (iS == 1) {
                aVarB = o7.j.a.b(cVar.k());
            } else if (iS != 2) {
                cVar.u();
                cVar.w();
            } else {
                zG = cVar.g();
            }
        }
        return new o7.j(strN, aVarB, zG);
    }
}
