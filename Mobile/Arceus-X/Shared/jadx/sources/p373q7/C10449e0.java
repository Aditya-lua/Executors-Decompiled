package p373q7;

import p121f7.C5452i;
import p288m7.C8454b;
import p288m7.C8466n;
import p303n7.C8907m;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.e0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10449e0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37628a = AbstractC10794c.a.m41143a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: renamed from: a */
    public static C8907m m40220a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        String strMo41136m = null;
        C8454b c8454bM40211f = null;
        C8454b c8454bM40211f2 = null;
        C8466n c8466nM40204g = null;
        boolean zMo41132g = false;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37628a);
            if (iMo41139r == 0) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 1) {
                c8454bM40211f = C10446d.m40211f(abstractC10794c, c5452i, false);
            } else if (iMo41139r == 2) {
                c8454bM40211f2 = C10446d.m40211f(abstractC10794c, c5452i, false);
            } else if (iMo41139r == 3) {
                c8466nM40204g = C10444c.m40204g(abstractC10794c, c5452i);
            } else if (iMo41139r != 4) {
                abstractC10794c.mo41141u();
            } else {
                zMo41132g = abstractC10794c.mo41132g();
            }
        }
        return new C8907m(strMo41136m, c8454bM40211f, c8454bM40211f2, c8466nM40204g, zMo41132g);
    }
}
