package ln;

/* JADX INFO: loaded from: classes3.dex */
public class c extends rn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on.b f23658a = new on.b();

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            int iE = hVar.e();
            if (!c.m(hVar, iE)) {
                return rn.f.c();
            }
            int iC = hVar.c() + hVar.d();
            int i10 = iC + 1;
            if (tn.d.g(hVar.b().a(), iE + 1)) {
                i10 = iC + 2;
            }
            return rn.f.d(new c()).a(i10);
        }
    }

    public static boolean m(rn.h hVar, int i10) {
        CharSequence charSequenceA = hVar.b().a();
        return hVar.d() < nn.f.f27333a && i10 < charSequenceA.length() && charSequenceA.charAt(i10) == '>';
    }

    @Override // rn.a, rn.d
    public boolean b() {
        return true;
    }

    @Override // rn.a, rn.d
    public boolean f(on.a aVar) {
        return true;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        int iE = hVar.e();
        if (!m(hVar, iE)) {
            return rn.c.d();
        }
        int iC = hVar.c() + hVar.d();
        int i10 = iC + 1;
        if (tn.d.g(hVar.b().a(), iE + 1)) {
            i10 = iC + 2;
        }
        return rn.c.a(i10);
    }

    @Override // rn.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public on.b g() {
        return this.f23658a;
    }
}
