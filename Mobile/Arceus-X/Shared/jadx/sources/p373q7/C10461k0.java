package p373q7;

import p121f7.C5452i;
import p288m7.C8460h;
import p303n7.C8912r;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.k0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10461k0 {

    /* JADX INFO: renamed from: a */
    public static AbstractC10794c.a f37652a = AbstractC10794c.a.m41143a("nm", "ind", "ks", "hd");

    /* JADX INFO: renamed from: a */
    public static C8912r m40237a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        String strMo41136m = null;
        int iMo41134j = 0;
        boolean zMo41132g = false;
        C8460h c8460hM40216k = null;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37652a);
            if (iMo41139r == 0) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 1) {
                iMo41134j = abstractC10794c.mo41134j();
            } else if (iMo41139r == 2) {
                c8460hM40216k = C10446d.m40216k(abstractC10794c, c5452i);
            } else if (iMo41139r != 3) {
                abstractC10794c.mo41141u();
            } else {
                zMo41132g = abstractC10794c.mo41132g();
            }
        }
        return new C8912r(strMo41136m, iMo41134j, c8460hM40216k, zMo41132g);
    }
}
