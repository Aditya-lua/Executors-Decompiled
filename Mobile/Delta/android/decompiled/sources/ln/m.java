package ln;

/* JADX INFO: loaded from: classes3.dex */
public class m extends rn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on.j f23707a;
    public final pn.j b;

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            m mVarM;
            if (hVar.d() >= nn.f.f27333a) {
                return rn.f.c();
            }
            pn.i iVarB = hVar.b();
            int iE = hVar.e();
            if (iVarB.a().charAt(iE) == '#' && (mVarM = m.m(iVarB.d(iE, iVarB.a().length()))) != null) {
                return rn.f.d(mVarM).b(iVarB.a().length());
            }
            int iN = m.n(iVarB.a(), iE);
            if (iN > 0) {
                pn.j jVarB = gVar.b();
                if (!jVarB.f()) {
                    return rn.f.d(new m(iN, jVarB)).b(iVarB.a().length()).e(jVarB.d().size());
                }
            }
            return rn.f.c();
        }
    }

    public m(int i10, pn.j jVar) {
        on.j jVar2 = new on.j();
        this.f23707a = jVar2;
        jVar2.q(i10);
        this.b = jVar;
    }

    public static m m(pn.i iVar) {
        qn.i iVarK = qn.i.k(pn.j.h(iVar));
        int iG = iVarK.g('#');
        if (iG == 0 || iG > 6) {
            return null;
        }
        if (!iVarK.e()) {
            return new m(iG, pn.j.b());
        }
        char cL = iVarK.l();
        if (cL != ' ' && cL != '\t') {
            return null;
        }
        iVarK.r();
        qn.h hVarO = iVarK.o();
        qn.h hVarO2 = hVarO;
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
        pn.j jVarD = iVarK.d(hVarO, hVarO2);
        return jVarD.c().isEmpty() ? new m(iG, pn.j.b()) : new m(iG, jVarD);
    }

    public static int n(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '-') {
            return (cCharAt == '=' && o(charSequence, i10 + 1, '=')) ? 1 : 0;
        }
        return o(charSequence, i10 + 1, '-') ? 2 : 0;
    }

    public static boolean o(CharSequence charSequence, int i10, char c10) {
        return tn.d.k(charSequence, tn.d.i(c10, charSequence, i10, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // rn.a, rn.d
    public void c(pn.b bVar) {
        bVar.a(this.b, this.f23707a);
    }

    @Override // rn.d
    public on.a g() {
        return this.f23707a;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        return rn.c.d();
    }
}
