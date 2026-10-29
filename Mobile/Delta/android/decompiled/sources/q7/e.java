package q7;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29236a = r7.c.a.a("ef");
    public static final r7.c.a b = r7.c.a.a("ty", "v");

    public static n7.a a(r7.c cVar, f7.i iVar) {
        cVar.c();
        n7.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!cVar.f()) {
                    cVar.e();
                    return aVar;
                }
                int iR = cVar.r(b);
                if (iR != 0) {
                    if (iR != 1) {
                        cVar.s();
                        cVar.u();
                    } else if (z10) {
                        aVar = new n7.a(d.e(cVar, iVar));
                    } else {
                        cVar.u();
                    }
                } else if (cVar.j() == 0) {
                    z10 = true;
                }
            }
        }
    }

    public static n7.a b(r7.c cVar, f7.i iVar) {
        n7.a aVar = null;
        while (cVar.f()) {
            if (cVar.r(f29236a) != 0) {
                cVar.s();
                cVar.u();
            } else {
                cVar.b();
                while (cVar.f()) {
                    n7.a aVarA = a(cVar, iVar);
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
