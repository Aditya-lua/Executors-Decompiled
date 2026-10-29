package nn;

/* JADX INFO: loaded from: classes3.dex */
public class c extends tn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn.b f26369a = new qn.b();

    public static class a extends tn.b {
        @Override // tn.e
        public tn.f a(tn.h hVar, tn.g gVar) {
            int iE = hVar.e();
            if (!c.m(hVar, iE)) {
                return tn.f.c();
            }
            int iC = hVar.c() + hVar.d();
            int i10 = iC + 1;
            if (vn.d.g(hVar.b().a(), iE + 1)) {
                i10 = iC + 2;
            }
            return tn.f.d(new c()).a(i10);
        }
    }

    public static boolean m(tn.h hVar, int i10) {
        CharSequence charSequenceA = hVar.b().a();
        return hVar.d() < pn.f.f28739a && i10 < charSequenceA.length() && charSequenceA.charAt(i10) == '>';
    }

    @Override // tn.a, tn.d
    public boolean a() {
        return true;
    }

    @Override // tn.d
    public tn.c b(tn.h hVar) {
        int iE = hVar.e();
        if (!m(hVar, iE)) {
            return tn.c.d();
        }
        int iC = hVar.c() + hVar.d();
        int i10 = iC + 1;
        if (vn.d.g(hVar.b().a(), iE + 1)) {
            i10 = iC + 2;
        }
        return tn.c.a(i10);
    }

    @Override // tn.a, tn.d
    public boolean e(qn.a aVar) {
        return true;
    }

    @Override // tn.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public qn.b d() {
        return this.f26369a;
    }
}
