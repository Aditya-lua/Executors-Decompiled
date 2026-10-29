package p0;

/* JADX INFO: loaded from: classes.dex */
public class w {
    public static a1.c a(a1.c cVar, a1.c cVar2) {
        if (cVar2 == null) {
            return cVar;
        }
        if (cVar == null) {
            return cVar2;
        }
        a1.c.a aVarB = a1.c.a.b(cVar);
        if (cVar2.b() != null) {
            aVarB.d(cVar2.b());
        }
        if (cVar2.d() != null) {
            aVarB.f(cVar2.d());
        }
        if (cVar2.c() != null) {
            aVarB.e(cVar2.c());
        }
        if (cVar2.a() != 0) {
            aVarB.c(cVar2.a());
        }
        return aVarB.a();
    }
}
