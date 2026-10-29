package p338on;

import java.util.Set;
import p388qn.C10604b0;
import pn.C10298d;
import sn.C11424h;
import sn.C11425i;
import sn.InterfaceC11417a;
import sn.InterfaceC11418b;
import sn.InterfaceC11419c;
import sn.InterfaceC11423g;
import vn.C12233a;

/* JADX INFO: renamed from: on.i */
/* JADX INFO: loaded from: classes3.dex */
public class C9827i implements InterfaceC11417a {

    /* JADX INFO: renamed from: a */
    public static final C12233a f35626a = C12233a.m45370b().m45376d('0', '9').m45376d('A', 'F').m45376d('a', 'f').m45374b();

    /* JADX INFO: renamed from: b */
    public static final C12233a f35627b = C12233a.m45370b().m45376d('0', '9').m45374b();

    /* JADX INFO: renamed from: c */
    public static final C12233a f35628c;

    /* JADX INFO: renamed from: d */
    public static final C12233a f35629d;

    /* JADX INFO: renamed from: on.i$a */
    public static class a implements InterfaceC11418b {
        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: a */
        public InterfaceC11417a mo38685a() {
            return new C9827i();
        }

        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: b */
        public Set<Character> mo38686b() {
            return C9821c.m38683a(new Object[]{'&'});
        }
    }

    static {
        C12233a c12233aM45374b = C12233a.m45370b().m45376d('A', 'Z').m45376d('a', 'z').m45374b();
        f35628c = c12233aM45374b;
        f35629d = c12233aM45374b.m45372c().m45376d('0', '9').m45374b();
    }

    @Override // sn.InterfaceC11417a
    /* JADX INFO: renamed from: a */
    public InterfaceC11423g mo38684a(InterfaceC11419c interfaceC11419c) {
        C11425i c11425iMo37562a = interfaceC11419c.mo37562a();
        C11424h c11424hM42808o = c11425iMo37562a.m42808o();
        c11425iMo37562a.m42802h();
        char cM42805l = c11425iMo37562a.m42805l();
        if (cM42805l == '#') {
            c11425iMo37562a.m42802h();
            if (c11425iMo37562a.m42803i('x') || c11425iMo37562a.m42803i('X')) {
                int iM42800f = c11425iMo37562a.m42800f(f35626a);
                if (1 <= iM42800f && iM42800f <= 6 && c11425iMo37562a.m42803i(';')) {
                    return m38689b(c11425iMo37562a, c11424hM42808o);
                }
            } else {
                int iM42800f2 = c11425iMo37562a.m42800f(f35627b);
                if (1 <= iM42800f2 && iM42800f2 <= 7 && c11425iMo37562a.m42803i(';')) {
                    return m38689b(c11425iMo37562a, c11424hM42808o);
                }
            }
        } else if (f35628c.mo45371a(cM42805l)) {
            c11425iMo37562a.m42800f(f35629d);
            if (c11425iMo37562a.m42803i(';')) {
                return m38689b(c11425iMo37562a, c11424hM42808o);
            }
        }
        return InterfaceC11423g.m42792a();
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC11423g m38689b(C11425i c11425i, C11424h c11424h) {
        return InterfaceC11423g.m42793b(new C10604b0(C10298d.m39566a(c11425i.m42798d(c11424h, c11425i.m42808o()).m41535c())), c11425i.m42808o());
    }
}
