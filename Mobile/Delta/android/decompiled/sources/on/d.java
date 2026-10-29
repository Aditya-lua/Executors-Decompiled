package on;

import java.util.Set;
import java.util.regex.Pattern;
import qn.b0;
import qn.o;

/* JADX INFO: loaded from: classes3.dex */
public class d implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f27533a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");
    public static final Pattern b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    public static class a implements sn.b {
        @Override // sn.b
        public sn.a a() {
            return new d();
        }

        @Override // sn.b
        public Set<Character> b() {
            return c.a(new Object[]{'<'});
        }
    }

    @Override // sn.a
    public sn.g a(sn.c cVar) {
        String str;
        sn.i iVarA = cVar.a();
        iVarA.h();
        sn.h hVarO = iVarA.o();
        if (iVarA.b('>') > 0) {
            rn.j jVarD = iVarA.d(hVarO, iVarA.o());
            String strC = jVarD.c();
            iVarA.h();
            if (f27533a.matcher(strC).matches()) {
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
                return sn.g.b(oVar, iVarA.o());
            }
        }
        return sn.g.a();
    }
}
