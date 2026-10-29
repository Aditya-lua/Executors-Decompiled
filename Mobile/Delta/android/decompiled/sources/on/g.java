package on;

import qn.o;
import qn.p;

/* JADX INFO: loaded from: classes3.dex */
public class g implements sn.e {
    public static sn.f b(sn.d dVar, sn.i iVar, String str, String str2) {
        return (dVar.a() == null || !dVar.a().o().equals("!")) ? sn.f.c(new o(str, str2), iVar.o()) : sn.f.c(new qn.m(str, str2), iVar.o()).b();
    }

    @Override // sn.e
    public sn.f a(sn.d dVar, sn.i iVar, rn.c cVar) {
        if (dVar.e() != null) {
            return b(dVar, iVar, dVar.e(), dVar.b());
        }
        String strC = dVar.c();
        if (strC == null || strC.isEmpty()) {
            strC = dVar.d();
        }
        p pVar = (p) cVar.a(p.class, strC);
        return pVar != null ? b(dVar, iVar, pVar.p(), pVar.r()) : sn.f.a();
    }
}
