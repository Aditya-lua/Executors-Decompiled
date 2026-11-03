package mn;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class j implements qn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tn.a f24928a;
    public static final tn.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tn.a f24929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tn.a f24930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tn.a f24931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final tn.a f24932f;

    public static class a implements qn.b {
        @Override // qn.b
        public qn.a a() {
            return new j();
        }

        @Override // qn.b
        public Set<Character> b() {
            return c.a(new Object[]{'<'});
        }
    }

    static {
        tn.a aVarB = tn.a.b().d('A', 'Z').d('a', 'z').b();
        f24928a = aVarB;
        b = aVarB;
        f24929c = aVarB.c().d('0', '9').c('-').b();
        tn.a aVarB2 = aVarB.c().c('_').c(':').b();
        f24930d = aVarB2;
        f24931e = aVarB2.c().d('0', '9').c('.').c('-').b();
        f24932f = tn.a.b().c(' ').c('\t').c('\n').c((char) 11).c('\f').c('\r').c('\"').c('\'').c('=').c('<').c('>').c('`').b();
    }

    public static qn.g b(qn.h hVar, qn.i iVar) {
        String strC = iVar.d(hVar, iVar.o()).c();
        on.l lVar = new on.l();
        lVar.o(strC);
        return qn.g.b(lVar, iVar.o());
    }

    public static boolean c(qn.i iVar) {
        iVar.h();
        if (!iVar.j("CDATA[")) {
            return false;
        }
        while (iVar.b(']') >= 0) {
            if (iVar.j("]]>")) {
                return true;
            }
            iVar.h();
        }
        return false;
    }

    public static boolean d(qn.i iVar) {
        iVar.h();
        if (iVar.f(b) < 1) {
            return false;
        }
        iVar.f(f24929c);
        iVar.r();
        return iVar.i('>');
    }

    public static boolean e(qn.i iVar) {
        iVar.h();
        if (!iVar.i('-')) {
            return false;
        }
        if (iVar.i('>') || iVar.j("->")) {
            return true;
        }
        while (iVar.b('-') >= 0) {
            if (iVar.j("-->")) {
                return true;
            }
            iVar.h();
        }
        return false;
    }

    public static boolean f(qn.i iVar) {
        iVar.f(f24928a);
        if (iVar.r() <= 0 || iVar.b('>') < 0) {
            return false;
        }
        iVar.h();
        return true;
    }

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
    public static boolean g(qn.i r4) {
        /*
            r4.h()
            tn.a r0 = mn.j.f24929c
            r4.f(r0)
            int r0 = r4.r()
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
            tn.a r0 = mn.j.f24930d
            int r0 = r4.f(r0)
            if (r0 < r2) goto L6e
            tn.a r0 = mn.j.f24931e
            r4.f(r0)
            int r0 = r4.r()
            if (r0 < r2) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r1
        L2b:
            r3 = 61
            boolean r3 = r4.i(r3)
            if (r3 == 0) goto L13
            r4.r()
            char r0 = r4.l()
            r3 = 39
            if (r0 != r3) goto L4c
            r4.h()
            int r0 = r4.b(r3)
            if (r0 >= 0) goto L48
            return r1
        L48:
            r4.h()
            goto L67
        L4c:
            r3 = 34
            if (r0 != r3) goto L5e
            r4.h()
            int r0 = r4.b(r3)
            if (r0 >= 0) goto L5a
            return r1
        L5a:
            r4.h()
            goto L67
        L5e:
            tn.a r0 = mn.j.f24932f
            int r0 = r4.c(r0)
            if (r0 > 0) goto L67
            return r1
        L67:
            int r0 = r4.r()
            if (r0 < r2) goto L12
            goto L10
        L6e:
            r0 = 47
            r4.i(r0)
            r0 = 62
            boolean r4 = r4.i(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mn.j.g(qn.i):boolean");
    }

    public static boolean h(qn.i iVar) {
        iVar.h();
        while (iVar.b('?') > 0) {
            iVar.h();
            if (iVar.i('>')) {
                return true;
            }
        }
        return false;
    }

    @Override // qn.a
    public qn.g a(qn.c cVar) {
        qn.i iVarB = cVar.b();
        qn.h hVarO = iVarB.o();
        iVarB.h();
        char cL = iVarB.l();
        if (b.a(cL)) {
            if (g(iVarB)) {
                return b(hVarO, iVarB);
            }
        } else if (cL == '/') {
            if (d(iVarB)) {
                return b(hVarO, iVarB);
            }
        } else if (cL == '?') {
            if (h(iVarB)) {
                return b(hVarO, iVarB);
            }
        } else if (cL == '!') {
            iVarB.h();
            char cL2 = iVarB.l();
            if (cL2 == '-') {
                if (e(iVarB)) {
                    return b(hVarO, iVarB);
                }
            } else if (cL2 == '[') {
                if (c(iVarB)) {
                    return b(hVarO, iVarB);
                }
            } else if (f24928a.a(cL2) && f(iVarB)) {
                return b(hVarO, iVarB);
            }
        }
        return qn.g.a();
    }
}
