package q7;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29262a = r7.c.a.a("fFamily", "fName", "fStyle", "ascent");

    public static l7.c a(r7.c cVar) {
        cVar.c();
        String strM = null;
        String strM2 = null;
        float fH = 0.0f;
        String strM3 = null;
        while (cVar.f()) {
            int iR = cVar.r(f29262a);
            if (iR == 0) {
                strM = cVar.m();
            } else if (iR == 1) {
                strM3 = cVar.m();
            } else if (iR == 2) {
                strM2 = cVar.m();
            } else if (iR != 3) {
                cVar.s();
                cVar.u();
            } else {
                fH = (float) cVar.h();
            }
        }
        cVar.e();
        return new l7.c(strM, strM3, strM2, fH);
    }
}
