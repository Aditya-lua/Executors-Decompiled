package p338on;

import java.util.Set;
import java.util.regex.Pattern;
import p388qn.C10604b0;
import p388qn.C10619o;
import p418rn.C10935j;
import sn.C11424h;
import sn.C11425i;
import sn.InterfaceC11417a;
import sn.InterfaceC11418b;
import sn.InterfaceC11419c;
import sn.InterfaceC11423g;

/* JADX INFO: renamed from: on.d */
/* JADX INFO: loaded from: classes3.dex */
public class C9822d implements InterfaceC11417a {

    /* JADX INFO: renamed from: a */
    public static final Pattern f35622a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f35623b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    /* JADX INFO: renamed from: on.d$a */
    public static class a implements InterfaceC11418b {
        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: a */
        public InterfaceC11417a mo38685a() {
            return new C9822d();
        }

        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: b */
        public Set<Character> mo38686b() {
            return C9821c.m38683a(new Object[]{'<'});
        }
    }

    @Override // sn.InterfaceC11417a
    /* JADX INFO: renamed from: a */
    public InterfaceC11423g mo38684a(InterfaceC11419c interfaceC11419c) {
        String str;
        C11425i c11425iMo37562a = interfaceC11419c.mo37562a();
        c11425iMo37562a.m42802h();
        C11424h c11424hM42808o = c11425iMo37562a.m42808o();
        if (c11425iMo37562a.m42796b('>') > 0) {
            C10935j c10935jM42798d = c11425iMo37562a.m42798d(c11424hM42808o, c11425iMo37562a.m42808o());
            String strM41535c = c10935jM42798d.m41535c();
            c11425iMo37562a.m42802h();
            if (f35622a.matcher(strM41535c).matches()) {
                str = strM41535c;
            } else if (f35623b.matcher(strM41535c).matches()) {
                str = "mailto:" + strM41535c;
            } else {
                str = null;
            }
            if (str != null) {
                C10619o c10619o = new C10619o(str, null);
                C10604b0 c10604b0 = new C10604b0(strM41535c);
                c10604b0.m40705l(c10935jM42798d.m41537e());
                c10619o.mo40695c(c10604b0);
                return InterfaceC11423g.m42793b(c10619o, c11425iMo37562a.m42808o());
            }
        }
        return InterfaceC11423g.m42792a();
    }
}
