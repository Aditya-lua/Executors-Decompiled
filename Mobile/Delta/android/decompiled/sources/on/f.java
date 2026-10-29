package on;

import java.util.Set;
import qn.b0;

/* JADX INFO: loaded from: classes3.dex */
public class f implements sn.a {

    public static class a implements sn.b {
        @Override // sn.b
        public sn.a a() {
            return new f();
        }

        @Override // sn.b
        public Set<Character> b() {
            return c.a(new Object[]{'`'});
        }
    }

    @Override // sn.a
    public sn.g a(sn.c cVar) {
        sn.i iVarA = cVar.a();
        sn.h hVarO = iVarA.o();
        int iG = iVarA.g('`');
        sn.h hVarO2 = iVarA.o();
        while (iVarA.b('`') > 0) {
            sn.h hVarO3 = iVarA.o();
            if (iVarA.g('`') == iG) {
                qn.d dVar = new qn.d();
                String strReplace = iVarA.d(hVarO2, hVarO3).c().replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && vn.d.c(strReplace)) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                dVar.p(strReplace);
                return sn.g.b(dVar, iVarA.o());
            }
        }
        return sn.g.b(new b0(iVarA.d(hVarO, hVarO2).c()), hVarO2);
    }
}
