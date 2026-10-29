package p373q7;

import p266l7.C8004c;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.n */
/* JADX INFO: loaded from: classes3.dex */
public class C10466n {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37659a = AbstractC10794c.a.m41143a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: renamed from: a */
    public static C8004c m40242a(AbstractC10794c abstractC10794c) {
        abstractC10794c.mo41128c();
        String strMo41136m = null;
        String strMo41136m2 = null;
        float fMo41133h = 0.0f;
        String strMo41136m3 = null;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37659a);
            if (iMo41139r == 0) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 1) {
                strMo41136m3 = abstractC10794c.mo41136m();
            } else if (iMo41139r == 2) {
                strMo41136m2 = abstractC10794c.mo41136m();
            } else if (iMo41139r != 3) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                fMo41133h = (float) abstractC10794c.mo41133h();
            }
        }
        abstractC10794c.mo41130e();
        return new C8004c(strMo41136m, strMo41136m3, strMo41136m2, fMo41133h);
    }
}
