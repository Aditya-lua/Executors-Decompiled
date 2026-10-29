package p373q7;

import p121f7.C5452i;
import p288m7.C8454b;
import p303n7.C8914t;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.m0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10465m0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37658a = AbstractC10794c.a.m41143a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: renamed from: a */
    public static C8914t m40241a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        String strMo41136m = null;
        C8914t.a aVarM35947b = null;
        C8454b c8454bM40211f = null;
        C8454b c8454bM40211f2 = null;
        C8454b c8454bM40211f3 = null;
        boolean zMo41132g = false;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37658a);
            if (iMo41139r == 0) {
                c8454bM40211f = C10446d.m40211f(abstractC10794c, c5452i, false);
            } else if (iMo41139r == 1) {
                c8454bM40211f2 = C10446d.m40211f(abstractC10794c, c5452i, false);
            } else if (iMo41139r == 2) {
                c8454bM40211f3 = C10446d.m40211f(abstractC10794c, c5452i, false);
            } else if (iMo41139r == 3) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 4) {
                aVarM35947b = C8914t.a.m35947b(abstractC10794c.mo41134j());
            } else if (iMo41139r != 5) {
                abstractC10794c.mo41141u();
            } else {
                zMo41132g = abstractC10794c.mo41132g();
            }
        }
        return new C8914t(strMo41136m, aVarM35947b, c8454bM40211f, c8454bM40211f2, c8454bM40211f3, zMo41132g);
    }
}
