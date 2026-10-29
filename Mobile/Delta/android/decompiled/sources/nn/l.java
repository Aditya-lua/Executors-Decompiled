package nn;

/* JADX INFO: loaded from: classes3.dex */
public class l extends tn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn.h f26414a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuilder f26417e;

    public static class a extends tn.b {
        @Override // tn.e
        public tn.f a(tn.h hVar, tn.g gVar) {
            int iD = hVar.d();
            if (iD >= pn.f.f28739a) {
                return tn.f.c();
            }
            int iE = hVar.e();
            l lVarM = l.m(hVar.b().a(), iE, iD);
            return lVarM != null ? tn.f.d(lVarM).b(iE + lVarM.f26414a.t().intValue()) : tn.f.c();
        }
    }

    public l(char c10, int i10, int i11) {
        qn.h hVar = new qn.h();
        this.f26414a = hVar;
        this.f26417e = new StringBuilder();
        this.b = c10;
        this.f26415c = i10;
        hVar.v(String.valueOf(c10));
        hVar.z(Integer.valueOf(i10));
        hVar.w(i11);
    }

    public static l m(CharSequence charSequence, int i10, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i10; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt == '`') {
                i12++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i13++;
            }
        }
        if (i12 >= 3 && i13 == 0) {
            if (vn.d.a('`', charSequence, i10 + i12) != -1) {
                return null;
            }
            return new l('`', i12, i11);
        }
        if (i13 < 3 || i12 != 0) {
            return null;
        }
        return new l('~', i13, i11);
    }

    @Override // tn.d
    public tn.c b(tn.h hVar) {
        int iE = hVar.e();
        int index = hVar.getIndex();
        CharSequence charSequenceA = hVar.b().a();
        if (hVar.d() < pn.f.f28739a && iE < charSequenceA.length() && n(charSequenceA, iE)) {
            return tn.c.c();
        }
        int length = charSequenceA.length();
        for (int iQ = this.f26414a.q(); iQ > 0 && index < length && charSequenceA.charAt(index) == ' '; iQ--) {
            index++;
        }
        return tn.c.b(index);
    }

    @Override // tn.d
    public qn.a d() {
        return this.f26414a;
    }

    @Override // tn.a, tn.d
    public void g(rn.i iVar) {
        if (this.f26416d == null) {
            this.f26416d = iVar.a().toString();
        } else {
            this.f26417e.append(iVar.a());
            this.f26417e.append('\n');
        }
    }

    @Override // tn.a, tn.d
    public void h() {
        this.f26414a.x(pn.c.e(this.f26416d.trim()));
        this.f26414a.y(this.f26417e.toString());
    }

    public final boolean n(CharSequence charSequence, int i10) {
        int i11 = vn.d.i(this.b, charSequence, i10, charSequence.length()) - i10;
        if (i11 < this.f26415c || vn.d.k(charSequence, i10 + i11, charSequence.length()) != charSequence.length()) {
            return false;
        }
        this.f26414a.u(Integer.valueOf(i11));
        return true;
    }
}
