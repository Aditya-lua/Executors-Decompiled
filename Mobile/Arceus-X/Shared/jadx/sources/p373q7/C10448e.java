package p373q7;

import p121f7.C5452i;
import p303n7.C8895a;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.e */
/* JADX INFO: loaded from: classes3.dex */
public class C10448e {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37626a = AbstractC10794c.a.m41143a("ef");

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37627b = AbstractC10794c.a.m41143a("ty", "v");

    /* JADX INFO: renamed from: a */
    public static C8895a m40218a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        abstractC10794c.mo41128c();
        C8895a c8895a = null;
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!abstractC10794c.mo41131f()) {
                    abstractC10794c.mo41130e();
                    return c8895a;
                }
                int iMo41139r = abstractC10794c.mo41139r(f37627b);
                if (iMo41139r != 0) {
                    if (iMo41139r != 1) {
                        abstractC10794c.mo41140s();
                        abstractC10794c.mo41141u();
                    } else if (z10) {
                        c8895a = new C8895a(C10446d.m40210e(abstractC10794c, c5452i));
                    } else {
                        abstractC10794c.mo41141u();
                    }
                } else if (abstractC10794c.mo41134j() == 0) {
                    z10 = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C8895a m40219b(AbstractC10794c abstractC10794c, C5452i c5452i) {
        C8895a c8895a = null;
        while (abstractC10794c.mo41131f()) {
            if (abstractC10794c.mo41139r(f37626a) != 0) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                abstractC10794c.mo41127b();
                while (abstractC10794c.mo41131f()) {
                    C8895a c8895aM40218a = m40218a(abstractC10794c, c5452i);
                    if (c8895aM40218a != null) {
                        c8895a = c8895aM40218a;
                    }
                }
                abstractC10794c.mo41129d();
            }
        }
        return c8895a;
    }
}
