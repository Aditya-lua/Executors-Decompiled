package ao;

/* JADX INFO: loaded from: classes3.dex */
public class l extends ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.h f3106a;
    public final char b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f3108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public StringBuilder f3109e;

    public static class a extends ho.b {
        @Override // ho.e
        public ho.f a(ho.h hVar, ho.g gVar) {
            int iD = hVar.d();
            if (iD >= co.f.f5535a) {
                return ho.f.c();
            }
            int iE = hVar.e();
            l lVarM = l.m(hVar.b().a(), iE, iD);
            return lVarM != null ? ho.f.d(lVarM).b(iE + lVarM.f3106a.t().intValue()) : ho.f.c();
        }
    }

    public l(char c10, int i10, int i11) {
        eo.h hVar = new eo.h();
        this.f3106a = hVar;
        this.f3109e = new StringBuilder();
        this.b = c10;
        this.f3107c = i10;
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
            if (jo.d.a('`', charSequence, i10 + i12) != -1) {
                return null;
            }
            return new l('`', i12, i11);
        }
        if (i13 < 3 || i12 != 0) {
            return null;
        }
        return new l('~', i13, i11);
    }

    @Override // ho.d
    public ho.c a(ho.h hVar) {
        int iE = hVar.e();
        int index = hVar.getIndex();
        CharSequence charSequenceA = hVar.b().a();
        if (hVar.d() < co.f.f5535a && iE < charSequenceA.length() && n(charSequenceA, iE)) {
            return ho.c.c();
        }
        int length = charSequenceA.length();
        for (int iQ = this.f3106a.q(); iQ > 0 && index < length && charSequenceA.charAt(index) == ' '; iQ--) {
            index++;
        }
        return ho.c.b(index);
    }

    @Override // ho.a, ho.d
    public void c(fo.i iVar) {
        if (this.f3108d == null) {
            this.f3108d = iVar.a().toString();
        } else {
            this.f3109e.append(iVar.a());
            this.f3109e.append('\n');
        }
    }

    @Override // ho.d
    public eo.a f() {
        return this.f3106a;
    }

    @Override // ho.a, ho.d
    public void h() {
        this.f3106a.x(co.c.e(this.f3108d.trim()));
        this.f3106a.y(this.f3109e.toString());
    }

    public final boolean n(CharSequence charSequence, int i10) {
        int i11 = jo.d.i(this.b, charSequence, i10, charSequence.length()) - i10;
        if (i11 < this.f3107c || jo.d.k(charSequence, i10 + i11, charSequence.length()) != charSequence.length()) {
            return false;
        }
        this.f3106a.u(Integer.valueOf(i11));
        return true;
    }
}
