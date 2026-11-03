package mn;

import java.util.Set;
import on.b0;

/* JADX INFO: loaded from: classes3.dex */
public class i implements qn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tn.a f24925a = tn.a.b().d('0', '9').d('A', 'F').d('a', 'f').b();
    public static final tn.a b = tn.a.b().d('0', '9').b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tn.a f24926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tn.a f24927d;

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new i();
        }

        @Override // qn.b
        public Set<Character> b() {
            return c.a(new Object[]{'&'});
        }
    }

    static {
        tn.a aVarB = tn.a.b().d('A', 'Z').d('a', 'z').b();
        f24926c = aVarB;
        f24927d = aVarB.c().d('0', '9').b();
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        qn.i iVarB = cVar.b();
        qn.h hVarO = iVarB.o();
        iVarB.h();
        char cL = iVarB.l();
        if (cL == '#') {
            iVarB.h();
            if (iVarB.i('x') || iVarB.i('X')) {
                int iF = iVarB.f(f24925a);
                if (1 <= iF && iF <= 6 && iVarB.i(';')) {
                    return b(iVarB, hVarO);
                }
            } else {
                int iF2 = iVarB.f(b);
                if (1 <= iF2 && iF2 <= 7 && iVarB.i(';')) {
                    return b(iVarB, hVarO);
                }
            }
        } else if (f24926c.a(cL)) {
            iVarB.f(f24927d);
            if (iVarB.i(';')) {
                return b(iVarB, hVarO);
            }
        }
        return qn.g.a();
    }

    public final qn.g b(qn.i iVar, qn.h hVar) {
        return qn.g.b(new b0(nn.d.a(iVar.d(hVar, iVar.o()).c())), iVar.o());
    }
}
