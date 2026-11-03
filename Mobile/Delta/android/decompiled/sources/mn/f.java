package mn;

import java.util.Set;
import on.b0;

/* JADX INFO: loaded from: classes3.dex */
public class f implements qn.a {

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new f();
        }

        @Override // qn.b
        public Set<Character> b() {
            return c.a(new Object[]{'`'});
        }
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        qn.i iVarB = cVar.b();
        qn.h hVarO = iVarB.o();
        int iG = iVarB.g('`');
        qn.h hVarO2 = iVarB.o();
        while (iVarB.b('`') > 0) {
            qn.h hVarO3 = iVarB.o();
            if (iVarB.g('`') == iG) {
                on.d dVar = new on.d();
                String strReplace = iVarB.d(hVarO2, hVarO3).c().replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && tn.d.c(strReplace)) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                dVar.p(strReplace);
                return qn.g.b(dVar, iVarB.o());
            }
        }
        return qn.g.b(new b0(iVarB.d(hVarO, hVarO2).c()), hVarO2);
    }
}
