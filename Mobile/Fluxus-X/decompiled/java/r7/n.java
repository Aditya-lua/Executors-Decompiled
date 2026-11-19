package r7;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30592a = s7.c.a.a("fFamily", "fName", "fStyle", "ascent");

    public static m7.c a(s7.c cVar) {
        cVar.c();
        String strN = null;
        String strN2 = null;
        float fH = 0.0f;
        String strN3 = null;
        while (cVar.f()) {
            int iS = cVar.s(f30592a);
            if (iS == 0) {
                strN = cVar.n();
            } else if (iS == 1) {
                strN3 = cVar.n();
            } else if (iS == 2) {
                strN2 = cVar.n();
            } else if (iS != 3) {
                cVar.u();
                cVar.w();
            } else {
                fH = (float) cVar.h();
            }
        }
        cVar.e();
        return new m7.c(strN, strN3, strN2, fH);
    }
}
