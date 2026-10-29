package p338on;

import java.util.Set;
import java.util.regex.Pattern;
import p388qn.C10604b0;
import p388qn.C10613i;
import sn.C11425i;
import sn.InterfaceC11417a;
import sn.InterfaceC11418b;
import sn.InterfaceC11419c;
import sn.InterfaceC11423g;

/* JADX INFO: renamed from: on.e */
/* JADX INFO: loaded from: classes3.dex */
public class C9823e implements InterfaceC11417a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f35624a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    /* JADX INFO: renamed from: on.e$a */
    public static class a implements InterfaceC11418b {
        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: a */
        public InterfaceC11417a mo38685a() {
            return new C9823e();
        }

        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: b */
        public Set<Character> mo38686b() {
            return C9821c.m38683a(new Object[]{'\\'});
        }
    }

    @Override // sn.InterfaceC11417a
    /* JADX INFO: renamed from: a */
    public InterfaceC11423g mo38684a(InterfaceC11419c interfaceC11419c) {
        C11425i c11425iMo37562a = interfaceC11419c.mo37562a();
        c11425iMo37562a.m42802h();
        char cM42805l = c11425iMo37562a.m42805l();
        if (cM42805l == '\n') {
            c11425iMo37562a.m42802h();
            return InterfaceC11423g.m42793b(new C10613i(), c11425iMo37562a.m42808o());
        }
        if (!f35624a.matcher(String.valueOf(cM42805l)).matches()) {
            return InterfaceC11423g.m42793b(new C10604b0("\\"), c11425iMo37562a.m42808o());
        }
        c11425iMo37562a.m42802h();
        return InterfaceC11423g.m42793b(new C10604b0(String.valueOf(cM42805l)), c11425iMo37562a.m42808o());
    }
}
