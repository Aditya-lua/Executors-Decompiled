package q7;

/* JADX INFO: loaded from: classes3.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29280a = r7.c.a.a("nm", "mm", "hd");

    public static n7.j a(r7.c cVar) {
        String strM = null;
        boolean zG = false;
        n7.j.a aVarB = null;
        while (cVar.f()) {
            int iR = cVar.r(f29280a);
            if (iR == 0) {
                strM = cVar.m();
            } else if (iR == 1) {
                aVarB = n7.j.a.b(cVar.j());
            } else if (iR != 2) {
                cVar.s();
                cVar.u();
            } else {
                zG = cVar.g();
            }
        }
        return new n7.j(strM, aVarB, zG);
    }
}
