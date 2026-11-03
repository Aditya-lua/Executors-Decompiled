package mn;

import java.util.Set;
import java.util.regex.Pattern;
import on.b0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements qn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f24923a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new e();
        }

        @Override // qn.b
        public Set<Character> b() {
            return c.a(new Object[]{'\\'});
        }
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        qn.i iVarB = cVar.b();
        iVarB.h();
        char cL = iVarB.l();
        if (cL == '\n') {
            iVarB.h();
            return qn.g.b(new on.i(), iVarB.o());
        }
        if (!f24923a.matcher(String.valueOf(cL)).matches()) {
            return qn.g.b(new b0("\\"), iVarB.o());
        }
        iVarB.h();
        return qn.g.b(new b0(String.valueOf(cL)), iVarB.o());
    }
}
