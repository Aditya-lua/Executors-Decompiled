package on;

import java.util.Set;
import java.util.regex.Pattern;
import qn.b0;

/* JADX INFO: loaded from: classes3.dex */
public class e implements sn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f27534a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    public static class a implements sn.b {
        @Override // sn.b
        public sn.a a() {
            return new e();
        }

        @Override // sn.b
        public Set<Character> b() {
            return c.a(new Object[]{'\\'});
        }
    }

    @Override // sn.a
    public sn.g a(sn.c cVar) {
        sn.i iVarA = cVar.a();
        iVarA.h();
        char cL = iVarA.l();
        if (cL == '\n') {
            iVarA.h();
            return sn.g.b(new qn.i(), iVarA.o());
        }
        if (!f27534a.matcher(String.valueOf(cL)).matches()) {
            return sn.g.b(new b0("\\"), iVarA.o());
        }
        iVarA.h();
        return sn.g.b(new b0(String.valueOf(cL)), iVarA.o());
    }
}
