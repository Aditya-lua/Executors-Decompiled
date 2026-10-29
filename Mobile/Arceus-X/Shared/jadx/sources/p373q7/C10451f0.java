package p373q7;

import p121f7.C5452i;
import p288m7.C8454b;
import p303n7.C8908n;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.f0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10451f0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37630a = AbstractC10794c.a.m41143a("nm", "r", "hd");

    /* JADX INFO: renamed from: a */
    public static C8908n m40222a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        boolean zMo41132g = false;
        String strMo41136m = null;
        C8454b c8454bM40211f = null;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37630a);
            if (iMo41139r == 0) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 1) {
                c8454bM40211f = C10446d.m40211f(abstractC10794c, c5452i, true);
            } else if (iMo41139r != 2) {
                abstractC10794c.mo41141u();
            } else {
                zMo41132g = abstractC10794c.mo41132g();
            }
        }
        if (zMo41132g) {
            return null;
        }
        return new C8908n(strMo41136m, c8454bM40211f);
    }
}
