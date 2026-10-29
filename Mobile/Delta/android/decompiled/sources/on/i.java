package on;

import java.util.Set;
import qn.b0;

/* JADX INFO: loaded from: classes3.dex */
public class i implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vn.a f27536a = vn.a.b().d('0', '9').d('A', 'F').d('a', 'f').b();
    public static final vn.a b = vn.a.b().d('0', '9').b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vn.a f27537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vn.a f27538d;

    public static class a implements sn.b {
        @Override // sn.b
        public sn.a a() {
            return new i();
        }

        @Override // sn.b
        public Set<Character> b() {
            return c.a(new Object[]{'&'});
        }
    }

    static {
        vn.a aVarB = vn.a.b().d('A', 'Z').d('a', 'z').b();
        f27537c = aVarB;
        f27538d = aVarB.c().d('0', '9').b();
    }

    @Override // sn.a
    public sn.g a(sn.c cVar) {
        sn.i iVarA = cVar.a();
        sn.h hVarO = iVarA.o();
        iVarA.h();
        char cL = iVarA.l();
        if (cL == '#') {
            iVarA.h();
            if (iVarA.i('x') || iVarA.i('X')) {
                int iF = iVarA.f(f27536a);
                if (1 <= iF && iF <= 6 && iVarA.i(';')) {
                    return b(iVarA, hVarO);
                }
            } else {
                int iF2 = iVarA.f(b);
                if (1 <= iF2 && iF2 <= 7 && iVarA.i(';')) {
                    return b(iVarA, hVarO);
                }
            }
        } else if (f27537c.a(cL)) {
            iVarA.f(f27538d);
            if (iVarA.i(';')) {
                return b(iVarA, hVarO);
            }
        }
        return sn.g.a();
    }

    public final sn.g b(sn.i iVar, sn.h hVar) {
        return sn.g.b(new b0(pn.d.a(iVar.d(hVar, iVar.o()).c())), iVar.o());
    }
}
