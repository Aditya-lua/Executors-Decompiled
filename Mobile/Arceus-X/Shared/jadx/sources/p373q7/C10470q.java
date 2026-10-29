package p373q7;

import java.util.ArrayList;
import java.util.Collections;
import p121f7.C5452i;
import p288m7.C8454b;
import p288m7.C8455c;
import p288m7.C8456d;
import p288m7.C8458f;
import p303n7.C8900f;
import p303n7.C8913s;
import p303n7.EnumC8901g;
import p404r7.AbstractC10794c;
import p444t7.C11550a;

/* JADX INFO: renamed from: q7.q */
/* JADX INFO: loaded from: classes3.dex */
public class C10470q {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37663a = AbstractC10794c.a.m41143a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37664b = AbstractC10794c.a.m41143a("p", "k");

    /* JADX INFO: renamed from: c */
    public static final AbstractC10794c.a f37665c = AbstractC10794c.a.m41143a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    public static C8900f m40249a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        C8456d c8456d;
        ArrayList arrayList = new ArrayList();
        EnumC8901g enumC8901g = null;
        String strMo41136m = null;
        C8455c c8455cM40212g = null;
        C8458f c8458fM40214i = null;
        C8458f c8458fM40214i2 = null;
        C8454b c8454bM40210e = null;
        C8913s.a aVar = null;
        C8913s.b bVar = null;
        C8454b c8454b = null;
        float fMo41133h = 0.0f;
        boolean zMo41132g = false;
        C8456d c8456dM40213h = null;
        while (abstractC10794c.mo41131f()) {
            EnumC8901g enumC8901g2 = enumC8901g;
            switch (abstractC10794c.mo41139r(f37663a)) {
                case 0:
                    strMo41136m = abstractC10794c.mo41136m();
                    enumC8901g = enumC8901g2;
                    break;
                case 1:
                    c8456d = c8456dM40213h;
                    abstractC10794c.mo41128c();
                    int iMo41134j = -1;
                    while (abstractC10794c.mo41131f()) {
                        int iMo41139r = abstractC10794c.mo41139r(f37664b);
                        if (iMo41139r == 0) {
                            iMo41134j = abstractC10794c.mo41134j();
                        } else if (iMo41139r != 1) {
                            abstractC10794c.mo41140s();
                            abstractC10794c.mo41141u();
                        } else {
                            c8455cM40212g = C10446d.m40212g(abstractC10794c, c5452i, iMo41134j);
                        }
                    }
                    abstractC10794c.mo41130e();
                    enumC8901g = enumC8901g2;
                    c8456dM40213h = c8456d;
                    break;
                case 2:
                    c8456dM40213h = C10446d.m40213h(abstractC10794c, c5452i);
                    enumC8901g = enumC8901g2;
                    break;
                case 3:
                    c8456d = c8456dM40213h;
                    enumC8901g = abstractC10794c.mo41134j() == 1 ? EnumC8901g.LINEAR : EnumC8901g.RADIAL;
                    c8456dM40213h = c8456d;
                    break;
                case 4:
                    c8458fM40214i = C10446d.m40214i(abstractC10794c, c5452i);
                    enumC8901g = enumC8901g2;
                    break;
                case 5:
                    c8458fM40214i2 = C10446d.m40214i(abstractC10794c, c5452i);
                    enumC8901g = enumC8901g2;
                    break;
                case 6:
                    c8454bM40210e = C10446d.m40210e(abstractC10794c, c5452i);
                    enumC8901g = enumC8901g2;
                    break;
                case 7:
                    c8456d = c8456dM40213h;
                    aVar = C8913s.a.values()[abstractC10794c.mo41134j() - 1];
                    enumC8901g = enumC8901g2;
                    c8456dM40213h = c8456d;
                    break;
                case 8:
                    c8456d = c8456dM40213h;
                    bVar = C8913s.b.values()[abstractC10794c.mo41134j() - 1];
                    enumC8901g = enumC8901g2;
                    c8456dM40213h = c8456d;
                    break;
                case 9:
                    c8456d = c8456dM40213h;
                    fMo41133h = (float) abstractC10794c.mo41133h();
                    enumC8901g = enumC8901g2;
                    c8456dM40213h = c8456d;
                    break;
                case 10:
                    zMo41132g = abstractC10794c.mo41132g();
                    enumC8901g = enumC8901g2;
                    break;
                case 11:
                    abstractC10794c.mo41127b();
                    while (abstractC10794c.mo41131f()) {
                        abstractC10794c.mo41128c();
                        String strMo41136m2 = null;
                        C8454b c8454bM40210e2 = null;
                        while (abstractC10794c.mo41131f()) {
                            int iMo41139r2 = abstractC10794c.mo41139r(f37665c);
                            if (iMo41139r2 != 0) {
                                C8456d c8456d2 = c8456dM40213h;
                                if (iMo41139r2 != 1) {
                                    abstractC10794c.mo41140s();
                                    abstractC10794c.mo41141u();
                                } else {
                                    c8454bM40210e2 = C10446d.m40210e(abstractC10794c, c5452i);
                                }
                                c8456dM40213h = c8456d2;
                            } else {
                                strMo41136m2 = abstractC10794c.mo41136m();
                            }
                        }
                        C8456d c8456d3 = c8456dM40213h;
                        abstractC10794c.mo41130e();
                        if (strMo41136m2.equals("o")) {
                            c8454b = c8454bM40210e2;
                        } else {
                            if (strMo41136m2.equals("d") || strMo41136m2.equals("g")) {
                                c5452i.m25055u(true);
                                arrayList.add(c8454bM40210e2);
                            }
                            c8456dM40213h = c8456d3;
                        }
                        c8456dM40213h = c8456d3;
                    }
                    c8456d = c8456dM40213h;
                    abstractC10794c.mo41129d();
                    if (arrayList.size() == 1) {
                        arrayList.add((C8454b) arrayList.get(0));
                    }
                    enumC8901g = enumC8901g2;
                    c8456dM40213h = c8456d;
                    break;
                default:
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                    enumC8901g = enumC8901g2;
                    break;
            }
        }
        C8456d c8456d4 = c8456dM40213h;
        return new C8900f(strMo41136m, enumC8901g, c8455cM40212g, c8456d4 == null ? new C8456d(Collections.singletonList(new C11550a(100))) : c8456d4, c8458fM40214i, c8458fM40214i2, c8454bM40210e, aVar, bVar, fMo41133h, arrayList, c8454b, zMo41132g);
    }
}
