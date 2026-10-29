package p373q7;

import java.util.Collections;
import p121f7.C5452i;
import p288m7.C8453a;
import p288m7.C8454b;
import p288m7.C8456d;
import p288m7.C8463k;
import p288m7.C8464l;
import p288m7.C8465m;
import p303n7.EnumC8915u;
import p404r7.AbstractC10794c;
import p444t7.C11550a;

/* JADX INFO: renamed from: q7.b */
/* JADX INFO: loaded from: classes3.dex */
public class C10442b {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37618a = AbstractC10794c.a.m41143a("s", "a");

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37619b = AbstractC10794c.a.m41143a("s", "e", "o", "r");

    /* JADX INFO: renamed from: c */
    public static final AbstractC10794c.a f37620c = AbstractC10794c.a.m41143a("fc", "sc", "sw", "t", "o");

    /* JADX INFO: renamed from: a */
    public static C8463k m40194a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        abstractC10794c.mo41128c();
        C8465m c8465mM40196c = null;
        C8464l c8464lM40195b = null;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37618a);
            if (iMo41139r == 0) {
                c8464lM40195b = m40195b(abstractC10794c, c5452i);
            } else if (iMo41139r != 1) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                c8465mM40196c = m40196c(abstractC10794c, c5452i);
            }
        }
        abstractC10794c.mo41130e();
        return new C8463k(c8465mM40196c, c8464lM40195b);
    }

    /* JADX INFO: renamed from: b */
    public static C8464l m40195b(AbstractC10794c abstractC10794c, C5452i c5452i) {
        abstractC10794c.mo41128c();
        C8456d c8456d = null;
        C8456d c8456dM40213h = null;
        C8456d c8456dM40213h2 = null;
        EnumC8915u enumC8915u = null;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37619b);
            if (iMo41139r == 0) {
                c8456d = C10446d.m40213h(abstractC10794c, c5452i);
            } else if (iMo41139r == 1) {
                c8456dM40213h = C10446d.m40213h(abstractC10794c, c5452i);
            } else if (iMo41139r == 2) {
                c8456dM40213h2 = C10446d.m40213h(abstractC10794c, c5452i);
            } else if (iMo41139r != 3) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                int iMo41134j = abstractC10794c.mo41134j();
                if (iMo41134j == 1 || iMo41134j == 2) {
                    enumC8915u = iMo41134j == 1 ? EnumC8915u.PERCENT : EnumC8915u.INDEX;
                } else {
                    c5452i.m25035a("Unsupported text range units: " + iMo41134j);
                    enumC8915u = EnumC8915u.INDEX;
                }
            }
        }
        abstractC10794c.mo41130e();
        if (c8456d == null && c8456dM40213h != null) {
            c8456d = new C8456d(Collections.singletonList(new C11550a(0)));
        }
        return new C8464l(c8456d, c8456dM40213h, c8456dM40213h2, enumC8915u);
    }

    /* JADX INFO: renamed from: c */
    public static C8465m m40196c(AbstractC10794c abstractC10794c, C5452i c5452i) {
        abstractC10794c.mo41128c();
        C8453a c8453aM40208c = null;
        C8453a c8453aM40208c2 = null;
        C8454b c8454bM40210e = null;
        C8454b c8454bM40210e2 = null;
        C8456d c8456dM40213h = null;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37620c);
            if (iMo41139r == 0) {
                c8453aM40208c = C10446d.m40208c(abstractC10794c, c5452i);
            } else if (iMo41139r == 1) {
                c8453aM40208c2 = C10446d.m40208c(abstractC10794c, c5452i);
            } else if (iMo41139r == 2) {
                c8454bM40210e = C10446d.m40210e(abstractC10794c, c5452i);
            } else if (iMo41139r == 3) {
                c8454bM40210e2 = C10446d.m40210e(abstractC10794c, c5452i);
            } else if (iMo41139r != 4) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                c8456dM40213h = C10446d.m40213h(abstractC10794c, c5452i);
            }
        }
        abstractC10794c.mo41130e();
        return new C8465m(c8453aM40208c, c8453aM40208c2, c8454bM40210e, c8454bM40210e2, c8456dM40213h);
    }
}
