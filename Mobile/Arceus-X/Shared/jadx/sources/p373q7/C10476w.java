package p373q7;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p121f7.C5452i;
import p121f7.C5457k0;
import p266l7.C8004c;
import p266l7.C8005d;
import p266l7.C8009h;
import p324o7.C9712e;
import p404r7.AbstractC10794c;
import p431s7.C11189e;
import p431s7.C11197m;
import p504w1.C12283g;
import p504w1.C12287k;

/* JADX INFO: renamed from: q7.w */
/* JADX INFO: loaded from: classes3.dex */
public class C10476w {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37678a = AbstractC10794c.a.m41143a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b */
    public static AbstractC10794c.a f37679b = AbstractC10794c.a.m41143a("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c */
    public static final AbstractC10794c.a f37680c = AbstractC10794c.a.m41143a("list");

    /* JADX INFO: renamed from: d */
    public static final AbstractC10794c.a f37681d = AbstractC10794c.a.m41143a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: a */
    public static C5452i m40270a(AbstractC10794c abstractC10794c) {
        abstractC10794c = abstractC10794c;
        float fM42216e = C11197m.m42216e();
        C12283g<C9712e> c12283g = new C12283g<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        C12287k<C8005d> c12287k = new C12287k<>();
        C5452i c5452i = new C5452i();
        abstractC10794c.mo41128c();
        float fMo41133h = 0.0f;
        float fMo41133h2 = 0.0f;
        float fMo41133h3 = 0.0f;
        int iMo41133h = 0;
        int iMo41133h2 = 0;
        while (abstractC10794c.mo41131f()) {
            switch (abstractC10794c.mo41139r(f37678a)) {
                case 0:
                    iMo41133h2 = (int) abstractC10794c.mo41133h();
                    fM42216e = fM42216e;
                    break;
                case 1:
                    iMo41133h = (int) abstractC10794c.mo41133h();
                    fM42216e = fM42216e;
                    break;
                case 2:
                    fMo41133h = (float) abstractC10794c.mo41133h();
                    fM42216e = fM42216e;
                    break;
                case 3:
                    fMo41133h2 = ((float) abstractC10794c.mo41133h()) - 0.01f;
                    fM42216e = fM42216e;
                    break;
                case 4:
                    fMo41133h3 = (float) abstractC10794c.mo41133h();
                    fM42216e = fM42216e;
                    break;
                case 5:
                    String[] strArrSplit = abstractC10794c.mo41136m().split("\\.");
                    if (!C11197m.m42221j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        c5452i.m25035a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    m40274e(abstractC10794c, c5452i, arrayList, c12283g);
                    break;
                case 7:
                    m40271b(abstractC10794c, c5452i, map, map2);
                    break;
                case 8:
                    m40273d(abstractC10794c, map3);
                    break;
                case 9:
                    m40272c(abstractC10794c, c5452i, c12287k);
                    break;
                case 10:
                    m40275f(abstractC10794c, arrayList2);
                    break;
                default:
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                    break;
            }
        }
        float f10 = fM42216e;
        c5452i.m25053s(new Rect(0, 0, (int) (iMo41133h2 * f10), (int) (iMo41133h * f10)), fMo41133h, fMo41133h2, fMo41133h3, arrayList, c12283g, map, map2, C11197m.m42216e(), c12287k, map3, arrayList2, iMo41133h2, iMo41133h);
        return c5452i;
    }

    /* JADX INFO: renamed from: b */
    public static void m40271b(AbstractC10794c abstractC10794c, C5452i c5452i, Map<String, List<C9712e>> map, Map<String, C5457k0> map2) {
        abstractC10794c.mo41127b();
        while (abstractC10794c.mo41131f()) {
            ArrayList arrayList = new ArrayList();
            C12283g c12283g = new C12283g();
            abstractC10794c.mo41128c();
            int iMo41134j = 0;
            int iMo41134j2 = 0;
            String strMo41136m = null;
            String strMo41136m2 = null;
            String strMo41136m3 = null;
            while (abstractC10794c.mo41131f()) {
                int iMo41139r = abstractC10794c.mo41139r(f37679b);
                if (iMo41139r == 0) {
                    strMo41136m = abstractC10794c.mo41136m();
                } else if (iMo41139r == 1) {
                    abstractC10794c.mo41127b();
                    while (abstractC10794c.mo41131f()) {
                        C9712e c9712eM40269b = C10475v.m40269b(abstractC10794c, c5452i);
                        c12283g.m45604i(c9712eM40269b.m38376e(), c9712eM40269b);
                        arrayList.add(c9712eM40269b);
                    }
                    abstractC10794c.mo41129d();
                } else if (iMo41139r == 2) {
                    iMo41134j = abstractC10794c.mo41134j();
                } else if (iMo41139r == 3) {
                    iMo41134j2 = abstractC10794c.mo41134j();
                } else if (iMo41139r == 4) {
                    strMo41136m2 = abstractC10794c.mo41136m();
                } else if (iMo41139r != 5) {
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                } else {
                    strMo41136m3 = abstractC10794c.mo41136m();
                }
            }
            abstractC10794c.mo41130e();
            if (strMo41136m2 != null) {
                C5457k0 c5457k0 = new C5457k0(iMo41134j, iMo41134j2, strMo41136m, strMo41136m2, strMo41136m3);
                map2.put(c5457k0.m25064e(), c5457k0);
            } else {
                map.put(strMo41136m, arrayList);
            }
        }
        abstractC10794c.mo41129d();
    }

    /* JADX INFO: renamed from: c */
    public static void m40272c(AbstractC10794c abstractC10794c, C5452i c5452i, C12287k<C8005d> c12287k) {
        abstractC10794c.mo41127b();
        while (abstractC10794c.mo41131f()) {
            C8005d c8005dM40240a = C10464m.m40240a(abstractC10794c, c5452i);
            c12287k.m45636i(c8005dM40240a.hashCode(), c8005dM40240a);
        }
        abstractC10794c.mo41129d();
    }

    /* JADX INFO: renamed from: d */
    public static void m40273d(AbstractC10794c abstractC10794c, Map<String, C8004c> map) {
        abstractC10794c.mo41128c();
        while (abstractC10794c.mo41131f()) {
            if (abstractC10794c.mo41139r(f37680c) != 0) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                abstractC10794c.mo41127b();
                while (abstractC10794c.mo41131f()) {
                    C8004c c8004cM40242a = C10466n.m40242a(abstractC10794c);
                    map.put(c8004cM40242a.m33069b(), c8004cM40242a);
                }
                abstractC10794c.mo41129d();
            }
        }
        abstractC10794c.mo41130e();
    }

    /* JADX INFO: renamed from: e */
    public static void m40274e(AbstractC10794c abstractC10794c, C5452i c5452i, List<C9712e> list, C12283g<C9712e> c12283g) {
        abstractC10794c.mo41127b();
        int i10 = 0;
        while (abstractC10794c.mo41131f()) {
            C9712e c9712eM40269b = C10475v.m40269b(abstractC10794c, c5452i);
            if (c9712eM40269b.m38378g() == C9712e.a.IMAGE) {
                i10++;
            }
            list.add(c9712eM40269b);
            c12283g.m45604i(c9712eM40269b.m38376e(), c9712eM40269b);
            if (i10 > 4) {
                C11189e.m42153c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        abstractC10794c.mo41129d();
    }

    /* JADX INFO: renamed from: f */
    public static void m40275f(AbstractC10794c abstractC10794c, List<C8009h> list) {
        abstractC10794c.mo41127b();
        while (abstractC10794c.mo41131f()) {
            abstractC10794c.mo41128c();
            float fMo41133h = 0.0f;
            String strMo41136m = null;
            float fMo41133h2 = 0.0f;
            while (abstractC10794c.mo41131f()) {
                int iMo41139r = abstractC10794c.mo41139r(f37681d);
                if (iMo41139r == 0) {
                    strMo41136m = abstractC10794c.mo41136m();
                } else if (iMo41139r == 1) {
                    fMo41133h = (float) abstractC10794c.mo41133h();
                } else if (iMo41139r != 2) {
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                } else {
                    fMo41133h2 = (float) abstractC10794c.mo41133h();
                }
            }
            abstractC10794c.mo41130e();
            list.add(new C8009h(strMo41136m, fMo41133h, fMo41133h2));
        }
        abstractC10794c.mo41129d();
    }
}
