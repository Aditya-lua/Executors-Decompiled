package bo;

import eo.b0;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class e implements go.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f4499a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    public static class a implements go.b {
        @Override // go.b
        public go.a a() {
            return new e();
        }

        @Override // go.b
        public Set<Character> b() {
            return c.a(new Object[]{'\\'});
        }
    }

    @Override // go.a
    public go.g a(go.c cVar) {
        go.i iVarA = cVar.a();
        iVarA.h();
        char cL = iVarA.l();
        if (cL == '\n') {
            iVarA.h();
            return go.g.b(new eo.i(), iVarA.o());
        }
        if (!f4499a.matcher(String.valueOf(cL)).matches()) {
            return go.g.b(new b0("\\"), iVarA.o());
        }
        iVarA.h();
        return go.g.b(new b0(String.valueOf(cL)), iVarA.o());
    }
}
