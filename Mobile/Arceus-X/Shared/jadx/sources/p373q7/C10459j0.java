package p373q7;

import java.util.ArrayList;
import p121f7.C5452i;
import p303n7.C8911q;
import p303n7.InterfaceC8897c;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.j0 */
/* JADX INFO: loaded from: classes3.dex */
public class C10459j0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37644a = AbstractC10794c.a.m41143a("nm", "hd", "it");

    /* JADX INFO: renamed from: a */
    public static C8911q m40234a(AbstractC10794c abstractC10794c, C5452i c5452i) {
        ArrayList arrayList = new ArrayList();
        String strMo41136m = null;
        boolean zMo41132g = false;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37644a);
            if (iMo41139r == 0) {
                strMo41136m = abstractC10794c.mo41136m();
            } else if (iMo41139r == 1) {
                zMo41132g = abstractC10794c.mo41132g();
            } else if (iMo41139r != 2) {
                abstractC10794c.mo41141u();
            } else {
                abstractC10794c.mo41127b();
                while (abstractC10794c.mo41131f()) {
                    InterfaceC8897c interfaceC8897cM40225a = C10454h.m40225a(abstractC10794c, c5452i);
                    if (interfaceC8897cM40225a != null) {
                        arrayList.add(interfaceC8897cM40225a);
                    }
                }
                abstractC10794c.mo41129d();
            }
        }
        return new C8911q(strMo41136m, arrayList, zMo41132g);
    }
}
