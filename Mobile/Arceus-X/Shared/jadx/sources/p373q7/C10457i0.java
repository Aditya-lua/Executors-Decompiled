package p373q7;

import android.graphics.Path;
import java.util.Collections;
import p121f7.C5452i;
import p288m7.C8453a;
import p288m7.C8456d;
import p303n7.C8910p;
import p404r7.AbstractC10794c;
import p444t7.C11550a;

/* JADX INFO: renamed from: q7.i0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10457i0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37638a = AbstractC10794c.a.m41143a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: renamed from: a */
    public static C8910p m40228a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        C8456d c8456d = null;
        String strMo41136m = null;
        C8453a c8453aM40208c = null;
        boolean zMo41132g = false;
        boolean zMo41132g2 = false;
        int iMo41134j = 1;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37638a);
            if (iMo41139r == 0) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 1) {
                c8453aM40208c = C10446d.m40208c(abstractC10794c, c5452i);
            } else if (iMo41139r == 2) {
                c8456d = C10446d.m40213h(abstractC10794c, c5452i);
            } else if (iMo41139r == 3) {
                zMo41132g = abstractC10794c.mo41132g();
            } else if (iMo41139r == 4) {
                iMo41134j = abstractC10794c.mo41134j();
            } else if (iMo41139r != 5) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                zMo41132g2 = abstractC10794c.mo41132g();
            }
        }
        if (c8456d == null) {
            c8456d = new C8456d(Collections.singletonList(new C11550a(100)));
        }
        return new C8910p(strMo41136m, zMo41132g, iMo41134j == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, c8453aM40208c, c8456d, zMo41132g2);
    }
}
