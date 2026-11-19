package r7;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30607a = s7.c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    public static s7.c.a b = s7.c.a.a("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s7.c.a f30608c = s7.c.a.a("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s7.c.a f30609d = s7.c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static g7.i a(s7.c cVar) {
        cVar = cVar;
        float fE = t7.m.e();
        w1.g<p7.e> gVar = new w1.g<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        w1.k<m7.d> kVar = new w1.k<>();
        g7.i iVar = new g7.i();
        cVar.c();
        float fH = 0.0f;
        float fH2 = 0.0f;
        float fH3 = 0.0f;
        int iH = 0;
        int iH2 = 0;
        while (cVar.f()) {
            switch (cVar.s(f30607a)) {
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
                    String[] strArrSplit = cVar.n().split("\\.");
                    if (!t7.m.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
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
                    cVar.u();
                    cVar.w();
                    break;
            }
        }
        float f10 = fE;
        iVar.s(new Rect(0, 0, (int) (iH2 * f10), (int) (iH * f10)), fH, fH2, fH3, arrayList, gVar, map, map2, t7.m.e(), kVar, map3, arrayList2, iH2, iH);
        return iVar;
    }

    public static void b(s7.c cVar, g7.i iVar, Map<String, List<p7.e>> map, Map<String, g7.k0> map2) {
        cVar.b();
        while (cVar.f()) {
            ArrayList arrayList = new ArrayList();
            w1.g gVar = new w1.g();
            cVar.c();
            int iK = 0;
            int iK2 = 0;
            String strN = null;
            String strN2 = null;
            String strN3 = null;
            while (cVar.f()) {
                int iS = cVar.s(b);
                if (iS == 0) {
                    strN = cVar.n();
                } else if (iS == 1) {
                    cVar.b();
                    while (cVar.f()) {
                        p7.e eVarB = v.b(cVar, iVar);
                        gVar.k(eVarB.e(), eVarB);
                        arrayList.add(eVarB);
                    }
                    cVar.d();
                } else if (iS == 2) {
                    iK = cVar.k();
                } else if (iS == 3) {
                    iK2 = cVar.k();
                } else if (iS == 4) {
                    strN2 = cVar.n();
                } else if (iS != 5) {
                    cVar.u();
                    cVar.w();
                } else {
                    strN3 = cVar.n();
                }
            }
            cVar.e();
            if (strN2 != null) {
                g7.k0 k0Var = new g7.k0(iK, iK2, strN, strN2, strN3);
                map2.put(k0Var.e(), k0Var);
            } else {
                map.put(strN, arrayList);
            }
        }
        cVar.d();
    }

    public static void c(s7.c cVar, g7.i iVar, w1.k<m7.d> kVar) {
        cVar.b();
        while (cVar.f()) {
            m7.d dVarA = m.a(cVar, iVar);
            kVar.k(dVarA.hashCode(), dVarA);
        }
        cVar.d();
    }

    public static void d(s7.c cVar, Map<String, m7.c> map) {
        cVar.c();
        while (cVar.f()) {
            if (cVar.s(f30608c) != 0) {
                cVar.u();
                cVar.w();
            } else {
                cVar.b();
                while (cVar.f()) {
                    m7.c cVarA = n.a(cVar);
                    map.put(cVarA.b(), cVarA);
                }
                cVar.d();
            }
        }
        cVar.e();
    }

    public static void e(s7.c cVar, g7.i iVar, List<p7.e> list, w1.g<p7.e> gVar) {
        cVar.b();
        int i10 = 0;
        while (cVar.f()) {
            p7.e eVarB = v.b(cVar, iVar);
            if (eVarB.g() == p7.e.a.IMAGE) {
                i10++;
            }
            list.add(eVarB);
            gVar.k(eVarB.e(), eVarB);
            if (i10 > 4) {
                t7.e.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.d();
    }

    public static void f(s7.c cVar, List<m7.h> list) {
        cVar.b();
        while (cVar.f()) {
            cVar.c();
            float fH = 0.0f;
            String strN = null;
            float fH2 = 0.0f;
            while (cVar.f()) {
                int iS = cVar.s(f30609d);
                if (iS == 0) {
                    strN = cVar.n();
                } else if (iS == 1) {
                    fH = (float) cVar.h();
                } else if (iS != 2) {
                    cVar.u();
                    cVar.w();
                } else {
                    fH2 = (float) cVar.h();
                }
            }
            cVar.e();
            list.add(new m7.h(strN, fH, fH2));
        }
        cVar.d();
    }
}
