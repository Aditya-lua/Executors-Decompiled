package p373q7;

import p303n7.C8904j;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.y */
/* JADX INFO: loaded from: classes3.dex */
public class C10478y {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37682a = AbstractC10794c.a.m41143a("nm", "mm", "hd");

    /* JADX INFO: renamed from: a */
    public static C8904j m40277a(AbstractC10794c abstractC10794c) {
        String strMo41136m = null;
        boolean zMo41132g = false;
        C8904j.a aVarM35883b = null;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37682a);
            if (iMo41139r == 0) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 1) {
                aVarM35883b = C8904j.a.m35883b(abstractC10794c.mo41134j());
            } else if (iMo41139r != 2) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                zMo41132g = abstractC10794c.mo41132g();
            }
        }
        return new C8904j(strMo41136m, aVarM35883b, zMo41132g);
    }
}
