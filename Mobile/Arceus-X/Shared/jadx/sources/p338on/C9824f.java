package p338on;

import java.util.Set;
import p388qn.C10604b0;
import p388qn.C10607d;
import sn.C11424h;
import sn.C11425i;
import sn.InterfaceC11417a;
import sn.InterfaceC11418b;
import sn.InterfaceC11419c;
import sn.InterfaceC11423g;
import vn.C12236d;

/* JADX INFO: renamed from: on.f */
/* JADX INFO: loaded from: classes3.dex */
public class C9824f implements InterfaceC11417a {

    /* JADX INFO: renamed from: on.f$a */
    public static class a implements InterfaceC11418b {
        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: a */
        public InterfaceC11417a mo38685a() {
            return new C9824f();
        }

        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: b */
        public Set<Character> mo38686b() {
            return C9821c.m38683a(new Object[]{'`'});
        }
    }

    @Override // sn.InterfaceC11417a
    /* JADX INFO: renamed from: a */
    public InterfaceC11423g mo38684a(InterfaceC11419c interfaceC11419c) {
        C11425i c11425iMo37562a = interfaceC11419c.mo37562a();
        C11424h c11424hM42808o = c11425iMo37562a.m42808o();
        int iM42801g = c11425iMo37562a.m42801g('`');
        C11424h c11424hM42808o2 = c11425iMo37562a.m42808o();
        while (c11425iMo37562a.m42796b('`') > 0) {
            C11424h c11424hM42808o3 = c11425iMo37562a.m42808o();
            if (c11425iMo37562a.m42801g('`') == iM42801g) {
                C10607d c10607d = new C10607d();
                String strReplace = c11425iMo37562a.m42798d(c11424hM42808o2, c11424hM42808o3).m41535c().replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && C12236d.m45379c(strReplace)) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                c10607d.m40645p(strReplace);
                return InterfaceC11423g.m42793b(c10607d, c11425iMo37562a.m42808o());
            }
        }
        return InterfaceC11423g.m42793b(new C10604b0(c11425iMo37562a.m42798d(c11424hM42808o, c11424hM42808o2).m41535c()), c11424hM42808o2);
    }
}
