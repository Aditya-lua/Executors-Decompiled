package ao;

/* JADX INFO: loaded from: classes3.dex */
public class c extends ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.b f3061a = new eo.b();

    public static class a extends ho.b {
        @Override // ho.e
        public ho.f a(ho.h hVar, ho.g gVar) {
            int iE = hVar.e();
            if (!c.m(hVar, iE)) {
                return ho.f.c();
            }
            int iC = hVar.c() + hVar.d();
            int i10 = iC + 1;
            if (jo.d.g(hVar.b().a(), iE + 1)) {
                i10 = iC + 2;
            }
            return ho.f.d(new c()).a(i10);
        }
    }

    public static boolean m(ho.h hVar, int i10) {
        CharSequence charSequenceA = hVar.b().a();
        return hVar.d() < co.f.f5535a && i10 < charSequenceA.length() && charSequenceA.charAt(i10) == '>';
    }

    @Override // ho.d
    public ho.c a(ho.h hVar) {
        int iE = hVar.e();
        if (!m(hVar, iE)) {
            return ho.c.d();
        }
        int iC = hVar.c() + hVar.d();
        int i10 = iC + 1;
        if (jo.d.g(hVar.b().a(), iE + 1)) {
            i10 = iC + 2;
        }
        return ho.c.a(i10);
    }

    @Override // ho.a, ho.d
    public boolean b() {
        return true;
    }

    @Override // ho.a, ho.d
    public boolean g(eo.a aVar) {
        return true;
    }

    @Override // ho.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public eo.b f() {
        return this.f3061a;
    }
}
