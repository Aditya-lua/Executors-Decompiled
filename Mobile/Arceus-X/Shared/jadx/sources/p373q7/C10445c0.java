package p373q7;

import android.graphics.PointF;
import p121f7.C5452i;
import p288m7.C8454b;
import p288m7.InterfaceC8467o;
import p303n7.C8905k;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.c0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10445c0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37624a = AbstractC10794c.a.m41143a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    /* JADX INFO: renamed from: a */
    public static C8905k m40205a(AbstractC10794c abstractC10794c, C5452i c5452i, int i10) {
        boolean zMo41132g = false;
        boolean z10 = i10 == 3;
        String strMo41136m = null;
        C8905k.a aVarM35896b = null;
        C8454b c8454bM40211f = null;
        InterfaceC8467o<PointF, PointF> interfaceC8467oM40191b = null;
        C8454b c8454bM40211f2 = null;
        C8454b c8454bM40210e = null;
        C8454b c8454bM40210e2 = null;
        C8454b c8454bM40211f3 = null;
        C8454b c8454bM40211f4 = null;
        while (abstractC10794c.mo41131f()) {
            switch (abstractC10794c.mo41139r(f37624a)) {
                case 0:
                    strMo41136m = abstractC10794c.mo41136m();
                    break;
                case 1:
                    aVarM35896b = C8905k.a.m35896b(abstractC10794c.mo41134j());
                    break;
                case 2:
                    c8454bM40211f = C10446d.m40211f(abstractC10794c, c5452i, false);
                    break;
                case 3:
                    interfaceC8467oM40191b = C10440a.m40191b(abstractC10794c, c5452i);
                    break;
                case 4:
                    c8454bM40211f2 = C10446d.m40211f(abstractC10794c, c5452i, false);
                    break;
                case 5:
                    c8454bM40210e2 = C10446d.m40210e(abstractC10794c, c5452i);
                    break;
                case 6:
                    c8454bM40211f4 = C10446d.m40211f(abstractC10794c, c5452i, false);
                    break;
                case 7:
                    c8454bM40210e = C10446d.m40210e(abstractC10794c, c5452i);
                    break;
                case 8:
                    c8454bM40211f3 = C10446d.m40211f(abstractC10794c, c5452i, false);
                    break;
                case 9:
                    zMo41132g = abstractC10794c.mo41132g();
                    break;
                case 10:
                    z10 = abstractC10794c.mo41134j() == 3;
                    break;
                default:
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                    break;
            }
        }
        return new C8905k(strMo41136m, aVarM35896b, c8454bM40211f, interfaceC8467oM40191b, c8454bM40211f2, c8454bM40210e, c8454bM40210e2, c8454bM40211f3, c8454bM40211f4, zMo41132g, z10);
    }
}
