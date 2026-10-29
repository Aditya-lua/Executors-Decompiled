package p338on;

import java.util.Set;
import p388qn.C10616l;
import sn.C11424h;
import sn.C11425i;
import sn.InterfaceC11417a;
import sn.InterfaceC11418b;
import sn.InterfaceC11419c;
import sn.InterfaceC11423g;
import vn.C12233a;

/* JADX INFO: renamed from: on.j */
/* JADX INFO: loaded from: classes3.dex */
public class C9828j implements InterfaceC11417a {

    /* JADX INFO: renamed from: a */
    public static final C12233a f35630a;

    /* JADX INFO: renamed from: b */
    public static final C12233a f35631b;

    /* JADX INFO: renamed from: c */
    public static final C12233a f35632c;

    /* JADX INFO: renamed from: d */
    public static final C12233a f35633d;

    /* JADX INFO: renamed from: e */
    public static final C12233a f35634e;

    /* JADX INFO: renamed from: f */
    public static final C12233a f35635f;

    /* JADX INFO: renamed from: on.j$a */
    public static class a implements InterfaceC11418b {
        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: a */
        public InterfaceC11417a mo38685a() {
            return new C9828j();
        }

        @Override // sn.InterfaceC11418b
        /* JADX INFO: renamed from: b */
        public Set<Character> mo38686b() {
            return C9821c.m38683a(new Object[]{'<'});
        }
    }

    static {
        C12233a c12233aM45374b = C12233a.m45370b().m45376d('A', 'Z').m45376d('a', 'z').m45374b();
        f35630a = c12233aM45374b;
        f35631b = c12233aM45374b;
        f35632c = c12233aM45374b.m45372c().m45376d('0', '9').m45375c('-').m45374b();
        C12233a c12233aM45374b2 = c12233aM45374b.m45372c().m45375c('_').m45375c(':').m45374b();
        f35633d = c12233aM45374b2;
        f35634e = c12233aM45374b2.m45372c().m45376d('0', '9').m45375c('.').m45375c('-').m45374b();
        f35635f = C12233a.m45370b().m45375c(' ').m45375c('\t').m45375c('\n').m45375c((char) 11).m45375c('\f').m45375c('\r').m45375c('\"').m45375c('\'').m45375c('=').m45375c('<').m45375c('>').m45375c('`').m45374b();
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC11423g m38690b(C11424h c11424h, C11425i c11425i) {
        String strM41535c = c11425i.m42798d(c11424h, c11425i.m42808o()).m41535c();
        C10616l c10616l = new C10616l();
        c10616l.m40685o(strM41535c);
        return InterfaceC11423g.m42793b(c10616l, c11425i.m42808o());
    }

    /* JADX INFO: renamed from: c */
    public static boolean m38691c(C11425i c11425i) {
        c11425i.m42802h();
        if (!c11425i.m42804j("CDATA[")) {
            return false;
        }
        while (c11425i.m42796b(']') >= 0) {
            if (c11425i.m42804j("]]>")) {
                return true;
            }
            c11425i.m42802h();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m38692d(C11425i c11425i) {
        c11425i.m42802h();
        if (c11425i.m42800f(f35631b) < 1) {
            return false;
        }
        c11425i.m42800f(f35632c);
        c11425i.m42811r();
        return c11425i.m42803i('>');
    }

    /* JADX INFO: renamed from: e */
    public static boolean m38693e(C11425i c11425i) {
        c11425i.m42802h();
        if (!c11425i.m42803i('-')) {
            return false;
        }
        if (c11425i.m42803i('>') || c11425i.m42804j("->")) {
            return true;
        }
        while (c11425i.m42796b('-') >= 0) {
            if (c11425i.m42804j("-->")) {
                return true;
            }
            c11425i.m42802h();
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m38694f(C11425i c11425i) {
        c11425i.m42800f(f35630a);
        if (c11425i.m42811r() <= 0 || c11425i.m42796b('>') < 0) {
            return false;
        }
        c11425i.m42802h();
        return true;
    }

    /* JADX DEBUG: Duplicate block (B:5:0x0012) to fix multi-entry loop: BACK_EDGE: B:5:0x0012 -> B:6:0x0013 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006b -> B:4:0x0010). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:6:0x0013
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: renamed from: g */
    public static boolean m38695g(sn.C11425i r4) {
        /*
            r4.m42802h()
            vn.a r0 = p338on.C9828j.f35632c
            r4.m42800f(r0)
            int r0 = r4.m42811r()
            r1 = 0
            r2 = 1
            if (r0 < r2) goto L12
        L10:
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L6e
            vn.a r0 = p338on.C9828j.f35633d
            int r0 = r4.m42800f(r0)
            if (r0 < r2) goto L6e
            vn.a r0 = p338on.C9828j.f35634e
            r4.m42800f(r0)
            int r0 = r4.m42811r()
            if (r0 < r2) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r3 = 61
            boolean r3 = r4.m42803i(r3)
            if (r3 == 0) goto L13
            r4.m42811r()
            char r0 = r4.m42805l()
            r3 = 39
            if (r0 != r3) goto L4c
            r4.m42802h()
            int r0 = r4.m42796b(r3)
            if (r0 >= 0) goto L48
            return r1
        L48:
            r4.m42802h()
            goto L67
        L4c:
            r3 = 34
            if (r0 != r3) goto L5e
            r4.m42802h()
            int r0 = r4.m42796b(r3)
            if (r0 >= 0) goto L5a
            return r1
        L5a:
            r4.m42802h()
            goto L67
        L5e:
            vn.a r0 = p338on.C9828j.f35635f
            int r0 = r4.m42797c(r0)
            if (r0 > 0) goto L67
            return r1
        L67:
            int r0 = r4.m42811r()
            if (r0 < r2) goto L12
            goto L10
        L6e:
            r0 = 47
            r4.m42803i(r0)
            r0 = 62
            boolean r4 = r4.m42803i(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p338on.C9828j.m38695g(sn.i):boolean");
    }

    /* JADX INFO: renamed from: h */
    public static boolean m38696h(C11425i c11425i) {
        c11425i.m42802h();
        while (c11425i.m42796b('?') > 0) {
            c11425i.m42802h();
            if (c11425i.m42803i('>')) {
                return true;
            }
        }
        return false;
    }

    @Override // sn.InterfaceC11417a
    /* JADX INFO: renamed from: a */
    public InterfaceC11423g mo38684a(InterfaceC11419c interfaceC11419c) {
        C11425i c11425iMo37562a = interfaceC11419c.mo37562a();
        C11424h c11424hM42808o = c11425iMo37562a.m42808o();
        c11425iMo37562a.m42802h();
        char cM42805l = c11425iMo37562a.m42805l();
        if (f35631b.mo45371a(cM42805l)) {
            if (m38695g(c11425iMo37562a)) {
                return m38690b(c11424hM42808o, c11425iMo37562a);
            }
        } else if (cM42805l == '/') {
            if (m38692d(c11425iMo37562a)) {
                return m38690b(c11424hM42808o, c11425iMo37562a);
            }
        } else if (cM42805l == '?') {
            if (m38696h(c11425iMo37562a)) {
                return m38690b(c11424hM42808o, c11425iMo37562a);
            }
        } else if (cM42805l == '!') {
            c11425iMo37562a.m42802h();
            char cM42805l2 = c11425iMo37562a.m42805l();
            if (cM42805l2 == '-') {
                if (m38693e(c11425iMo37562a)) {
                    return m38690b(c11424hM42808o, c11425iMo37562a);
                }
            } else if (cM42805l2 == '[') {
                if (m38691c(c11425iMo37562a)) {
                    return m38690b(c11424hM42808o, c11425iMo37562a);
                }
            } else if (f35630a.mo45371a(cM42805l2) && m38694f(c11425iMo37562a)) {
                return m38690b(c11424hM42808o, c11425iMo37562a);
            }
        }
        return InterfaceC11423g.m42792a();
    }
}
