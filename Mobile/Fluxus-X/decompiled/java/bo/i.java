package bo;

import eo.b0;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class i implements go.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jo.a f4501a = jo.a.b().d('0', '9').d('A', 'F').d('a', 'f').b();
    public static final jo.a b = jo.a.b().d('0', '9').b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jo.a f4502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jo.a f4503d;

    public static class a implements go.b {
        @Override // go.b
        public go.a a() {
            return new i();
        }

        @Override // go.b
        public Set<Character> b() {
            return c.a(new Object[]{'&'});
        }
    }

    static {
        jo.a aVarB = jo.a.b().d('A', 'Z').d('a', 'z').b();
        f4502c = aVarB;
        f4503d = aVarB.c().d('0', '9').b();
    }

    @Override // go.a
    public go.g a(go.c cVar) {
        go.i iVarA = cVar.a();
        go.h hVarO = iVarA.o();
        iVarA.h();
        char cL = iVarA.l();
        if (cL == '#') {
            iVarA.h();
            if (iVarA.i('x') || iVarA.i('X')) {
                int iF = iVarA.f(f4501a);
                if (1 <= iF && iF <= 6 && iVarA.i(';')) {
                    return b(iVarA, hVarO);
                }
            } else {
                int iF2 = iVarA.f(b);
                if (1 <= iF2 && iF2 <= 7 && iVarA.i(';')) {
                    return b(iVarA, hVarO);
                }
            }
        } else if (f4502c.a(cL)) {
            iVarA.f(f4503d);
            if (iVarA.i(';')) {
                return b(iVarA, hVarO);
            }
        }
        return go.g.a();
    }

    public final go.g b(go.i iVar, go.h hVar) {
        return go.g.b(new b0(co.d.a(iVar.d(hVar, iVar.o()).c())), iVar.o());
    }
}
