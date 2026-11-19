package ao;

/* JADX INFO: loaded from: classes3.dex */
public class m extends ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.j f3110a;
    public final fo.j b;

    public static class a extends ho.b {
        @Override // ho.e
        public ho.f a(ho.h hVar, ho.g gVar) {
            m mVarM;
            if (hVar.d() >= co.f.f5535a) {
                return ho.f.c();
            }
            fo.i iVarB = hVar.b();
            int iE = hVar.e();
            if (iVarB.a().charAt(iE) == '#' && (mVarM = m.m(iVarB.d(iE, iVarB.a().length()))) != null) {
                return ho.f.d(mVarM).b(iVarB.a().length());
            }
            int iN = m.n(iVarB.a(), iE);
            if (iN > 0) {
                fo.j jVarB = gVar.b();
                if (!jVarB.f()) {
                    return ho.f.d(new m(iN, jVarB)).b(iVarB.a().length()).e(jVarB.d().size());
                }
            }
            return ho.f.c();
        }
    }

    public m(int i10, fo.j jVar) {
        eo.j jVar2 = new eo.j();
        this.f3110a = jVar2;
        jVar2.q(i10);
        this.b = jVar;
    }

    public static m m(fo.i iVar) {
        go.i iVarK = go.i.k(fo.j.g(iVar));
        int iG = iVarK.g('#');
        if (iG == 0 || iG > 6) {
            return null;
        }
        if (!iVarK.e()) {
            return new m(iG, fo.j.b());
        }
        char cL = iVarK.l();
        if (cL != ' ' && cL != '\t') {
            return null;
        }
        iVarK.r();
        go.h hVarO = iVarK.o();
        go.h hVarO2 = hVarO;
        loop0: while (true) {
            boolean z10 = true;
            while (true) {
                if (!iVarK.e()) {
                    break loop0;
                }
                char cL2 = iVarK.l();
                if (cL2 == '\t' || cL2 == ' ') {
                    iVarK.h();
                    break;
                }
                if (cL2 != '#') {
                    iVarK.h();
                    hVarO2 = iVarK.o();
                } else if (z10) {
                    iVarK.g('#');
                    int iR = iVarK.r();
                    if (iVarK.e()) {
                        hVarO2 = iVarK.o();
                    }
                    if (iR > 0) {
                        break;
                    }
                } else {
                    iVarK.h();
                    hVarO2 = iVarK.o();
                }
                z10 = false;
            }
        }
        fo.j jVarD = iVarK.d(hVarO, hVarO2);
        return jVarD.c().isEmpty() ? new m(iG, fo.j.b()) : new m(iG, jVarD);
    }

    public static int n(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '-') {
            return (cCharAt == '=' && o(charSequence, i10 + 1, '=')) ? 1 : 0;
        }
        return o(charSequence, i10 + 1, '-') ? 2 : 0;
    }

    public static boolean o(CharSequence charSequence, int i10, char c10) {
        return jo.d.k(charSequence, jo.d.i(c10, charSequence, i10, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // ho.d
    public ho.c a(ho.h hVar) {
        return ho.c.d();
    }

    @Override // ho.d
    public eo.a f() {
        return this.f3110a;
    }

    @Override // ho.a, ho.d
    public void j(fo.b bVar) {
        bVar.b(this.b, this.f3110a);
    }
}
