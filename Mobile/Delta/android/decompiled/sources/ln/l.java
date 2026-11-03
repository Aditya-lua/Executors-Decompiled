package ln;

/* JADX INFO: loaded from: classes3.dex */
public class l extends rn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on.h f23703a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuilder f23706e;

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            int iD = hVar.d();
            if (iD >= nn.f.f27333a) {
                return rn.f.c();
            }
            int iE = hVar.e();
            l lVarM = l.m(hVar.b().a(), iE, iD);
            return lVarM != null ? rn.f.d(lVarM).b(iE + lVarM.f23703a.t().intValue()) : rn.f.c();
        }
    }

    public l(char c10, int i10, int i11) {
        on.h hVar = new on.h();
        this.f23703a = hVar;
        this.f23706e = new StringBuilder();
        this.b = c10;
        this.f23704c = i10;
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
            if (tn.d.a('`', charSequence, i10 + i12) != -1) {
                return null;
            }
            return new l('`', i12, i11);
        }
        if (i13 < 3 || i12 != 0) {
            return null;
        }
        return new l('~', i13, i11);
    }

    @Override // rn.a, rn.d
    public void a(pn.i iVar) {
        if (this.f23705d == null) {
            this.f23705d = iVar.a().toString();
        } else {
            this.f23706e.append(iVar.a());
            this.f23706e.append('\n');
        }
    }

    @Override // rn.d
    public on.a g() {
        return this.f23703a;
    }

    @Override // rn.a, rn.d
    public void h() {
        this.f23703a.x(nn.c.e(this.f23705d.trim()));
        this.f23703a.y(this.f23706e.toString());
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        int iE = hVar.e();
        int index = hVar.getIndex();
        CharSequence charSequenceA = hVar.b().a();
        if (hVar.d() < nn.f.f27333a && iE < charSequenceA.length() && n(charSequenceA, iE)) {
            return rn.c.c();
        }
        int length = charSequenceA.length();
        for (int iQ = this.f23703a.q(); iQ > 0 && index < length && charSequenceA.charAt(index) == ' '; iQ--) {
            index++;
        }
        return rn.c.b(index);
    }

    public final boolean n(CharSequence charSequence, int i10) {
        int i11 = tn.d.i(this.b, charSequence, i10, charSequence.length()) - i10;
        if (i11 < this.f23704c || tn.d.k(charSequence, i10 + i11, charSequence.length()) != charSequence.length()) {
            return false;
        }
        this.f23703a.u(Integer.valueOf(i11));
        return true;
    }
}
