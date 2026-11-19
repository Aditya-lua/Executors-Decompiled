package bo;

import eo.b0;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class f implements go.a {

    public static class a implements go.b {
        @Override // go.b
        public go.a a() {
            return new f();
        }

        @Override // go.b
        public Set<Character> b() {
            return c.a(new Object[]{'`'});
        }
    }

    @Override // go.a
    public go.g a(go.c cVar) {
        go.i iVarA = cVar.a();
        go.h hVarO = iVarA.o();
        int iG = iVarA.g('`');
        go.h hVarO2 = iVarA.o();
        while (iVarA.b('`') > 0) {
            go.h hVarO3 = iVarA.o();
            if (iVarA.g('`') == iG) {
                eo.d dVar = new eo.d();
                String strReplace = iVarA.d(hVarO2, hVarO3).c().replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && jo.d.c(strReplace)) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                dVar.p(strReplace);
                return go.g.b(dVar, iVarA.o());
            }
        }
        return go.g.b(new b0(iVarA.d(hVarO, hVarO2).c()), hVarO2);
    }
}
