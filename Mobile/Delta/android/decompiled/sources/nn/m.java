package nn;

/* JADX INFO: loaded from: classes3.dex */
public class m extends tn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn.j f26418a;
    public final rn.j b;

    public static class a extends tn.b {
        @Override // tn.e
        public tn.f a(tn.h hVar, tn.g gVar) {
            m mVarM;
            if (hVar.d() >= pn.f.f28739a) {
                return tn.f.c();
            }
            rn.i iVarB = hVar.b();
            int iE = hVar.e();
            if (iVarB.a().charAt(iE) == '#' && (mVarM = m.m(iVarB.d(iE, iVarB.a().length()))) != null) {
                return tn.f.d(mVarM).b(iVarB.a().length());
            }
            int iN = m.n(iVarB.a(), iE);
            if (iN > 0) {
                rn.j jVarB = gVar.b();
                if (!jVarB.f()) {
                    return tn.f.d(new m(iN, jVarB)).b(iVarB.a().length()).e(jVarB.d().size());
                }
            }
            return tn.f.c();
        }
    }

    public m(int i10, rn.j jVar) {
        qn.j jVar2 = new qn.j();
        this.f26418a = jVar2;
        jVar2.q(i10);
        this.b = jVar;
    }

    public static m m(rn.i iVar) {
        sn.i iVarK = sn.i.k(rn.j.h(iVar));
        int iG = iVarK.g('#');
        if (iG == 0 || iG > 6) {
            return null;
        }
        if (!iVarK.e()) {
            return new m(iG, rn.j.b());
        }
        char cL = iVarK.l();
        if (cL != ' ' && cL != '\t') {
            return null;
        }
        iVarK.r();
        sn.h hVarO = iVarK.o();
        sn.h hVarO2 = hVarO;
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
        rn.j jVarD = iVarK.d(hVarO, hVarO2);
        return jVarD.c().isEmpty() ? new m(iG, rn.j.b()) : new m(iG, jVarD);
    }

    public static int n(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '-') {
            return (cCharAt == '=' && o(charSequence, i10 + 1, '=')) ? 1 : 0;
        }
        return o(charSequence, i10 + 1, '-') ? 2 : 0;
    }

    public static boolean o(CharSequence charSequence, int i10, char c10) {
        return vn.d.k(charSequence, vn.d.i(c10, charSequence, i10, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // tn.d
    public tn.c b(tn.h hVar) {
        return tn.c.d();
    }

    @Override // tn.d
    public qn.a d() {
        return this.f26418a;
    }

    @Override // tn.a, tn.d
    public void f(rn.b bVar) {
        bVar.b(this.b, this.f26418a);
    }
}
