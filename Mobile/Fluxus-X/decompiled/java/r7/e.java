package r7;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30566a = s7.c.a.a("ef");
    public static final s7.c.a b = s7.c.a.a("ty", "v");

    public static o7.a a(s7.c cVar, g7.i iVar) {
        cVar.c();
        o7.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!cVar.f()) {
                    cVar.e();
                    return aVar;
                }
                int iS = cVar.s(b);
                if (iS != 0) {
                    if (iS != 1) {
                        cVar.u();
                        cVar.w();
                    } else if (z10) {
                        aVar = new o7.a(d.e(cVar, iVar));
                    } else {
                        cVar.w();
                    }
                } else if (cVar.k() == 0) {
                    z10 = true;
                }
            }
        }
    }

    public static o7.a b(s7.c cVar, g7.i iVar) {
        o7.a aVar = null;
        while (cVar.f()) {
            if (cVar.s(f30566a) != 0) {
                cVar.u();
                cVar.w();
            } else {
                cVar.b();
                while (cVar.f()) {
                    o7.a aVarA = a(cVar, iVar);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                cVar.d();
            }
        }
        return aVar;
    }
}
