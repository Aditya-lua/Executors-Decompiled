package p373q7;

import java.util.ArrayList;
import p121f7.C5452i;
import p266l7.C8005d;
import p303n7.C8911q;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.m */
/* JADX INFO: loaded from: classes3.dex */
public class C10464m {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37656a = AbstractC10794c.a.m41143a("ch", "size", "w", "style", "fFamily", "data");

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37657b = AbstractC10794c.a.m41143a("shapes");

    /* JADX INFO: renamed from: a */
    public static C8005d m40240a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        ArrayList arrayList = new ArrayList();
        abstractC10794c.mo41128c();
        double dMo41133h = 0.0d;
        String strMo41136m = null;
        String strMo41136m2 = null;
        char cCharAt = 0;
        double dMo41133h2 = 0.0d;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37656a);
            if (iMo41139r == 0) {
                cCharAt = abstractC10794c.mo41136m().charAt(0);
            } else if (iMo41139r == 1) {
                dMo41133h2 = abstractC10794c.mo41133h();
            } else if (iMo41139r == 2) {
                dMo41133h = abstractC10794c.mo41133h();
            } else if (iMo41139r == 3) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 4) {
                strMo41136m2 = abstractC10794c.mo41136m();
            } else if (iMo41139r != 5) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                abstractC10794c.mo41128c();
                while (abstractC10794c.mo41131f()) {
                    if (abstractC10794c.mo41139r(f37657b) != 0) {
                        abstractC10794c.mo41140s();
                        abstractC10794c.mo41141u();
                    } else {
                        abstractC10794c.mo41127b();
                        while (abstractC10794c.mo41131f()) {
                            arrayList.add((C8911q) C10454h.m40225a(abstractC10794c, c5452i));
                        }
                        abstractC10794c.mo41129d();
                    }
                }
                abstractC10794c.mo41130e();
            }
        }
        abstractC10794c.mo41130e();
        return new C8005d(arrayList, cCharAt, dMo41133h2, dMo41133h, strMo41136m, strMo41136m2);
    }
}
