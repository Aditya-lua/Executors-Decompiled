package mn;

import java.util.Set;
import java.util.regex.Pattern;
import on.b0;
import on.o;

/* JADX INFO: loaded from: classes3.dex */
public class d implements qn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f24922a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
    public static final Pattern b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new d();
        }

        @Override // qn.b
        public Set<Character> b() {
            return c.a(new Object[]{'<'});
        }
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        String str;
        qn.i iVarB = cVar.b();
        iVarB.h();
        qn.h hVarO = iVarB.o();
        if (iVarB.b('>') > 0) {
            pn.j jVarD = iVarB.d(hVarO, iVarB.o());
            String strC = jVarD.c();
            iVarB.h();
            if (f24922a.matcher(strC).matches()) {
                str = strC;
            } else if (b.matcher(strC).matches()) {
                str = "mailto:" + strC;
            } else {
                str = null;
            }
            if (str != null) {
                o oVar = new o(str, null);
                b0 b0Var = new b0(strC);
                b0Var.l(jVarD.e());
                oVar.c(b0Var);
                return qn.g.b(oVar, iVarB.o());
            }
        }
        return qn.g.a();
    }
}
