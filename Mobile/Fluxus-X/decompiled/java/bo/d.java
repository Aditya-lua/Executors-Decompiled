package bo;

import eo.b0;
import eo.o;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class d implements go.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f4498a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
    public static final Pattern b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    public static class a implements go.b {
        @Override // go.b
        public go.a a() {
            return new d();
        }

        @Override // go.b
        public Set<Character> b() {
            return c.a(new Object[]{'<'});
        }
    }

    @Override // go.a
    public go.g a(go.c cVar) {
        String str;
        go.i iVarA = cVar.a();
        iVarA.h();
        go.h hVarO = iVarA.o();
        if (iVarA.b('>') > 0) {
            fo.j jVarD = iVarA.d(hVarO, iVarA.o());
            String strC = jVarD.c();
            iVarA.h();
            if (f4498a.matcher(strC).matches()) {
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
                return go.g.b(oVar, iVarA.o());
            }
        }
        return go.g.a();
    }
}
