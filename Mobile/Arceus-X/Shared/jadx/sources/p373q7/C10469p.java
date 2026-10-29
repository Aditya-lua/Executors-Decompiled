package p373q7;

import android.graphics.Path;
import java.util.Collections;
import p121f7.C5452i;
import p288m7.C8455c;
import p288m7.C8456d;
import p288m7.C8458f;
import p303n7.C8899e;
import p303n7.EnumC8901g;
import p404r7.AbstractC10794c;
import p444t7.C11550a;

/* JADX INFO: renamed from: q7.p */
/* JADX INFO: loaded from: classes3.dex */
public class C10469p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37661a = AbstractC10794c.a.m41143a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* JADX INFO: renamed from: b */
    public static final AbstractC10794c.a f37662b = AbstractC10794c.a.m41143a("p", "k");

    /* JADX INFO: renamed from: a */
    public static C8899e m40248a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        C8456d c8456d = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strMo41136m = null;
        EnumC8901g enumC8901g = null;
        C8455c c8455cM40212g = null;
        C8458f c8458fM40214i = null;
        C8458f c8458fM40214i2 = null;
        boolean zMo41132g = false;
        while (abstractC10794c.mo41131f()) {
            switch (abstractC10794c.mo41139r(f37661a)) {
                case 0:
                    strMo41136m = abstractC10794c.mo41136m();
                    break;
                case 1:
                    abstractC10794c.mo41128c();
                    int iMo41134j = -1;
                    while (abstractC10794c.mo41131f()) {
                        int iMo41139r = abstractC10794c.mo41139r(f37662b);
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
                    break;
                case 2:
                    c8456d = C10446d.m40213h(abstractC10794c, c5452i);
                    break;
                case 3:
                    enumC8901g = abstractC10794c.mo41134j() == 1 ? EnumC8901g.LINEAR : EnumC8901g.RADIAL;
                    break;
                case 4:
                    c8458fM40214i = C10446d.m40214i(abstractC10794c, c5452i);
                    break;
                case 5:
                    c8458fM40214i2 = C10446d.m40214i(abstractC10794c, c5452i);
                    break;
                case 6:
                    fillType = abstractC10794c.mo41134j() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zMo41132g = abstractC10794c.mo41132g();
                    break;
                default:
                    abstractC10794c.mo41140s();
                    abstractC10794c.mo41141u();
                    break;
            }
        }
        if (c8456d == null) {
            c8456d = new C8456d(Collections.singletonList(new C11550a(100)));
        }
        return new C8899e(strMo41136m, enumC8901g, fillType, c8455cM40212g, c8456d, c8458fM40214i, c8458fM40214i2, null, null, zMo41132g);
    }
}
