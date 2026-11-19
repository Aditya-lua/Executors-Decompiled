package bo;

import eo.o;
import eo.p;

/* JADX INFO: loaded from: classes3.dex */
public class g implements go.e {
    public static go.f b(go.d dVar, go.i iVar, String str, String str2) {
        return (dVar.a() == null || !dVar.a().o().equals("!")) ? go.f.b(new o(str, str2), iVar.o()) : go.f.b(new eo.m(str, str2), iVar.o()).c();
    }

    @Override // go.e
    public go.f a(go.d dVar, go.i iVar, fo.c cVar) {
        if (dVar.e() != null) {
            return b(dVar, iVar, dVar.e(), dVar.b());
        }
        String strC = dVar.c();
        if (strC == null || strC.isEmpty()) {
            strC = dVar.d();
        }
        p pVar = (p) cVar.a(p.class, strC);
        return pVar != null ? b(dVar, iVar, pVar.p(), pVar.r()) : go.f.a();
    }
}
