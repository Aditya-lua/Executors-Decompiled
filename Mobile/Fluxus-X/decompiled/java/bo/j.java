package bo;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class j implements go.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jo.a f4504a;
    public static final jo.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final jo.a f4505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final jo.a f4506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final jo.a f4507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final jo.a f4508f;

    public static class a implements go.b {
        @Override // go.b
        public go.a a() {
            return new j();
        }

        @Override // go.b
        public Set<Character> b() {
            return c.a(new Object[]{'<'});
        }
    }

    static {
        jo.a aVarB = jo.a.b().d('A', 'Z').d('a', 'z').b();
        f4504a = aVarB;
        b = aVarB;
        f4505c = aVarB.c().d('0', '9').c('-').b();
        jo.a aVarB2 = aVarB.c().c('_').c(':').b();
        f4506d = aVarB2;
        f4507e = aVarB2.c().d('0', '9').c('.').c('-').b();
        f4508f = jo.a.b().c(' ').c('\t').c('\n').c((char) 11).c('\f').c('\r').c('\"').c('\'').c('=').c('<').c('>').c('`').b();
    }

    public static go.g b(go.h hVar, go.i iVar) {
        String strC = iVar.d(hVar, iVar.o()).c();
        eo.l lVar = new eo.l();
        lVar.o(strC);
        return go.g.b(lVar, iVar.o());
    }

    public static boolean c(go.i iVar) {
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

    public static boolean d(go.i iVar) {
        iVar.h();
        if (iVar.f(b) < 1) {
            return false;
        }
        iVar.f(f4505c);
        iVar.r();
        return iVar.i('>');
    }

    public static boolean e(go.i iVar) {
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

    public static boolean f(go.i iVar) {
        iVar.f(f4504a);
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
    public static boolean g(go.i r4) {
        /*
            r4.h()
            jo.a r0 = bo.j.f4505c
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
            jo.a r0 = bo.j.f4506d
            int r0 = r4.f(r0)
            if (r0 < r2) goto L6e
            jo.a r0 = bo.j.f4507e
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
            jo.a r0 = bo.j.f4508f
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
        throw new UnsupportedOperationException("Method not decompiled: bo.j.g(go.i):boolean");
    }

    public static boolean h(go.i iVar) {
        iVar.h();
        while (iVar.b('?') > 0) {
            iVar.h();
            if (iVar.i('>')) {
                return true;
            }
        }
        return false;
    }

    @Override // go.a
    public go.g a(go.c cVar) {
        go.i iVarA = cVar.a();
        go.h hVarO = iVarA.o();
        iVarA.h();
        char cL = iVarA.l();
        if (b.a(cL)) {
            if (g(iVarA)) {
                return b(hVarO, iVarA);
            }
        } else if (cL == '/') {
            if (d(iVarA)) {
                return b(hVarO, iVarA);
            }
        } else if (cL == '?') {
            if (h(iVarA)) {
                return b(hVarO, iVarA);
            }
        } else if (cL == '!') {
            iVarA.h();
            char cL2 = iVarA.l();
            if (cL2 == '-') {
                if (e(iVarA)) {
                    return b(hVarO, iVarA);
                }
            } else if (cL2 == '[') {
                if (c(iVarA)) {
                    return b(hVarO, iVarA);
                }
            } else if (f4504a.a(cL2) && f(iVarA)) {
                return b(hVarO, iVarA);
            }
        }
        return go.g.a();
    }
}
