package p373q7;

import java.util.ArrayList;
import java.util.Collections;
import p121f7.C5452i;
import p288m7.C8453a;
import p288m7.C8454b;
import p288m7.C8456d;
import p303n7.C8913s;
import p404r7.AbstractC10794c;
import p444t7.C11550a;

/* JADX INFO: renamed from: q7.l0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10463l0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37654a = AbstractC10794c.a.m41143a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37655b = AbstractC10794c.a.m41143a("n", "v");

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: m7.b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static C8913s m40239a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        ArrayList arrayList = new ArrayList();
        String strMo41136m = null;
        C8913s.a aVar = null;
        C8913s.b bVar = null;
        Object obj = null;
        C8453a c8453aM40208c = null;
        C8454b c8454bM40210e = null;
        String str = null;
        float fMo41133h = 0.0f;
        boolean zMo41132g = false;
        C8456d c8456d = null;
        while (abstractC10794c.mo41131f()) {
            switch (abstractC10794c.mo41139r(f37654a)) {
                case 0:
                    strMo41136m = abstractC10794c.mo41136m();
                    break;
                case 1:
                    c8453aM40208c = C10446d.m40208c(abstractC10794c, c5452i);
                    break;
                case 2:
                    c8454bM40210e = C10446d.m40210e(abstractC10794c, c5452i);
                    break;
                case 3:
                    c8456d = C10446d.m40213h(abstractC10794c, c5452i);
                    break;
                case 4:
                    aVar = C8913s.a.values()[abstractC10794c.mo41134j() - 1];
                    break;
                case 5:
                    bVar = C8913s.b.values()[abstractC10794c.mo41134j() - 1];
                    break;
                case 6:
                    fMo41133h = (float) abstractC10794c.mo41133h();
                    break;
                case 7:
                    zMo41132g = abstractC10794c.mo41132g();
                    break;
                case 8:
                    abstractC10794c.mo41127b();
                    while (abstractC10794c.mo41131f()) {
                        abstractC10794c.mo41128c();
                        String strMo41136m2 = str;
                        Object objM40210e = strMo41136m2;
                        while (abstractC10794c.mo41131f()) {
                            int iMo41139r = abstractC10794c.mo41139r(f37655b);
                            if (iMo41139r == 0) {
                                strMo41136m2 = abstractC10794c.mo41136m();
                            } else if (iMo41139r != 1) {
                                abstractC10794c.mo41140s();
                                abstractC10794c.mo41141u();
                            } else {
                                objM40210e = C10446d.m40210e(abstractC10794c, c5452i);
                            }
                        }
                        abstractC10794c.mo41130e();
                        strMo41136m2.getClass();
                        switch (strMo41136m2) {
                            case "d":
                            case "g":
                                c5452i.m25055u(true);
                                arrayList.add(objM40210e);
                                break;
                            case "o":
                                obj = objM40210e;
                                break;
                        }
                        str = null;
                    }
                    abstractC10794c.mo41129d();
                    if (arrayList.size() == 1) {
                        arrayList.add((C8454b) arrayList.get(0));
                    }
                    break;
                default:
                    abstractC10794c.mo41141u();
                    continue;
            }
            str = null;
        }
        if (c8456d == null) {
            c8456d = new C8456d(Collections.singletonList(new C11550a(100)));
        }
        if (aVar == null) {
            aVar = C8913s.a.BUTT;
        }
        if (bVar == null) {
            bVar = C8913s.b.MITER;
        }
        return new C8913s(strMo41136m, obj, arrayList, c8453aM40208c, c8456d, c8454bM40210e, aVar, bVar, fMo41133h, zMo41132g);
    }
}
