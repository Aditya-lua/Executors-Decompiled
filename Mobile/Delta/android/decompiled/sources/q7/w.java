package q7;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29277a = r7.c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static r7.c.a b = r7.c.a.a("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r7.c.a f29278c = r7.c.a.a("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r7.c.a f29279d = r7.c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static f7.i a(r7.c cVar) {
        cVar = cVar;
        float fE = s7.m.e();
        w1.g<o7.e> gVar = new w1.g<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        w1.k<l7.d> kVar = new w1.k<>();
        f7.i iVar = new f7.i();
        cVar.c();
        float fH = 0.0f;
        float fH2 = 0.0f;
        float fH3 = 0.0f;
        int iH = 0;
        int iH2 = 0;
        while (cVar.f()) {
            switch (cVar.r(f29277a)) {
                case 0:
                    iH2 = (int) cVar.h();
                    fE = fE;
                    break;
                case 1:
                    iH = (int) cVar.h();
                    fE = fE;
                    break;
                case 2:
                    fH = (float) cVar.h();
                    fE = fE;
                    break;
                case 3:
                    fH2 = ((float) cVar.h()) - 0.01f;
                    fE = fE;
                    break;
                case 4:
                    fH3 = (float) cVar.h();
                    fE = fE;
                    break;
                case 5:
                    String[] strArrSplit = cVar.m().split("\\.");
                    if (!s7.m.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        iVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    e(cVar, iVar, arrayList, gVar);
                    break;
                case 7:
                    b(cVar, iVar, map, map2);
                    break;
                case 8:
                    d(cVar, map3);
                    break;
                case 9:
                    c(cVar, iVar, kVar);
                    break;
                case 10:
                    f(cVar, arrayList2);
                    break;
                default:
                    cVar.s();
                    cVar.u();
                    break;
            }
        }
        float f10 = fE;
        iVar.s(new Rect(0, 0, (int) (iH2 * f10), (int) (iH * f10)), fH, fH2, fH3, arrayList, gVar, map, map2, s7.m.e(), kVar, map3, arrayList2, iH2, iH);
        return iVar;
    }

    public static void b(r7.c cVar, f7.i iVar, Map<String, List<o7.e>> map, Map<String, f7.k0> map2) {
        cVar.b();
        while (cVar.f()) {
            ArrayList arrayList = new ArrayList();
            w1.g gVar = new w1.g();
            cVar.c();
            int iJ = 0;
            int iJ2 = 0;
            String strM = null;
            String strM2 = null;
            String strM3 = null;
            while (cVar.f()) {
                int iR = cVar.r(b);
                if (iR == 0) {
                    strM = cVar.m();
                } else if (iR == 1) {
                    cVar.b();
                    while (cVar.f()) {
                        o7.e eVarB = v.b(cVar, iVar);
                        gVar.i(eVarB.e(), eVarB);
                        arrayList.add(eVarB);
                    }
                    cVar.d();
                } else if (iR == 2) {
                    iJ = cVar.j();
                } else if (iR == 3) {
                    iJ2 = cVar.j();
                } else if (iR == 4) {
                    strM2 = cVar.m();
                } else if (iR != 5) {
                    cVar.s();
                    cVar.u();
                } else {
                    strM3 = cVar.m();
                }
            }
            cVar.e();
            if (strM2 != null) {
                f7.k0 k0Var = new f7.k0(iJ, iJ2, strM, strM2, strM3);
                map2.put(k0Var.e(), k0Var);
            } else {
                map.put(strM, arrayList);
            }
        }
        cVar.d();
    }

    public static void c(r7.c cVar, f7.i iVar, w1.k<l7.d> kVar) {
        cVar.b();
        while (cVar.f()) {
            l7.d dVarA = m.a(cVar, iVar);
            kVar.i(dVarA.hashCode(), dVarA);
        }
        cVar.d();
    }

    public static void d(r7.c cVar, Map<String, l7.c> map) {
        cVar.c();
        while (cVar.f()) {
            if (cVar.r(f29278c) != 0) {
                cVar.s();
                cVar.u();
            } else {
                cVar.b();
                while (cVar.f()) {
                    l7.c cVarA = n.a(cVar);
                    map.put(cVarA.b(), cVarA);
                }
                cVar.d();
            }
        }
        cVar.e();
    }

    public static void e(r7.c cVar, f7.i iVar, List<o7.e> list, w1.g<o7.e> gVar) {
        cVar.b();
        int i10 = 0;
        while (cVar.f()) {
            o7.e eVarB = v.b(cVar, iVar);
            if (eVarB.g() == o7.e.a.IMAGE) {
                i10++;
            }
            list.add(eVarB);
            gVar.i(eVarB.e(), eVarB);
            if (i10 > 4) {
                s7.e.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.d();
    }

    public static void f(r7.c cVar, List<l7.h> list) {
        cVar.b();
        while (cVar.f()) {
            cVar.c();
            float fH = 0.0f;
            String strM = null;
            float fH2 = 0.0f;
            while (cVar.f()) {
                int iR = cVar.r(f29279d);
                if (iR == 0) {
                    strM = cVar.m();
                } else if (iR == 1) {
                    fH = (float) cVar.h();
                } else if (iR != 2) {
                    cVar.s();
                    cVar.u();
                } else {
                    fH2 = (float) cVar.h();
                }
            }
            cVar.e();
            list.add(new l7.h(strM, fH, fH2));
        }
        cVar.d();
    }
}
