package p373q7;

import android.graphics.PointF;
import p121f7.C5452i;
import p288m7.C8454b;
import p288m7.C8458f;
import p288m7.InterfaceC8467o;
import p303n7.C8906l;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.d0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10447d0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37625a = AbstractC10794c.a.m41143a("nm", "p", "s", "r", "hd");

    /* JADX INFO: renamed from: a */
    public static C8906l m40217a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        String strMo41136m = null;
        InterfaceC8467o<PointF, PointF> interfaceC8467oM40191b = null;
        C8458f c8458fM40214i = null;
        C8454b c8454bM40210e = null;
        boolean zMo41132g = false;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37625a);
            if (iMo41139r == 0) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 1) {
                interfaceC8467oM40191b = C10440a.m40191b(abstractC10794c, c5452i);
            } else if (iMo41139r == 2) {
                c8458fM40214i = C10446d.m40214i(abstractC10794c, c5452i);
            } else if (iMo41139r == 3) {
                c8454bM40210e = C10446d.m40210e(abstractC10794c, c5452i);
            } else if (iMo41139r != 4) {
                abstractC10794c.mo41141u();
            } else {
                zMo41132g = abstractC10794c.mo41132g();
            }
        }
        return new C8906l(strMo41136m, interfaceC8467oM40191b, c8458fM40214i, c8454bM40210e, zMo41132g);
    }
}
