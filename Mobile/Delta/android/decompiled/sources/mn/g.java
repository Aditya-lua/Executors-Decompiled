package mn;

import on.o;
import on.p;

/* JADX INFO: loaded from: classes3.dex */
public class g implements qn.e {
    public static qn.f b(qn.d dVar, qn.i iVar, String str, String str2) {
        return (dVar.a() == null || !dVar.a().o().equals("!")) ? qn.f.b(new o(str, str2), iVar.o()) : qn.f.b(new on.m(str, str2), iVar.o()).c();
    }

    @Override // qn.e
    public qn.f a(qn.d dVar, qn.i iVar, pn.c cVar) {
        if (dVar.e() != null) {
            return b(dVar, iVar, dVar.e(), dVar.b());
        }
        String strC = dVar.c();
        if (strC == null || strC.isEmpty()) {
            strC = dVar.d();
        }
        p pVar = (p) cVar.a(p.class, strC);
        return pVar != null ? b(dVar, iVar, pVar.p(), pVar.r()) : qn.f.a();
    }
}
