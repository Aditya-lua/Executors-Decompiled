package nn;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class x extends tn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn.q f26464a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26465c;

    public static class a extends tn.b {
        @Override // tn.e
        public tn.f a(tn.h hVar, tn.g gVar) {
            b bVarO;
            tn.d dVarA = gVar.a();
            if (hVar.d() < pn.f.f28739a && (bVarO = x.o(hVar.b().a(), hVar.e(), hVar.c() + hVar.d(), !gVar.b().f())) != null) {
                int i10 = bVarO.b;
                y yVar = new y(hVar.d(), i10 - hVar.c());
                if ((dVarA instanceof x) && x.n((qn.q) dVarA.d(), bVarO.f26466a)) {
                    return tn.f.d(yVar).a(i10);
                }
                x xVar = new x(bVarO.f26466a);
                bVarO.f26466a.q(true);
                return tn.f.d(xVar, yVar).a(i10);
            }
            return tn.f.c();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qn.q f26466a;
        public final int b;

        public b(qn.q qVar, int i10) {
            this.f26466a = qVar;
            this.b = i10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qn.q f26467a;
        public final int b;

        public c(qn.q qVar, int i10) {
            this.f26467a = qVar;
            this.b = i10;
        }
    }

    public x(qn.q qVar) {
        this.f26464a = qVar;
    }

    public static boolean m(CharSequence charSequence, int i10) {
        char cCharAt;
        return i10 >= charSequence.length() || (cCharAt = charSequence.charAt(i10)) == '\t' || cCharAt == ' ';
    }

    public static boolean n(qn.q qVar, qn.q qVar2) {
        if ((qVar instanceof qn.c) && (qVar2 instanceof qn.c)) {
            return Objects.equals(((qn.c) qVar).r(), ((qn.c) qVar2).r());
        }
        if ((qVar instanceof qn.v) && (qVar2 instanceof qn.v)) {
            return Objects.equals(((qn.v) qVar).r(), ((qn.v) qVar2).r());
        }
        return false;
    }

    public static b o(CharSequence charSequence, int i10, int i11, boolean z10) {
        boolean z11;
        c cVarP = p(charSequence, i10);
        if (cVarP == null) {
            return null;
        }
        qn.q qVar = cVarP.f26467a;
        int i12 = cVarP.b;
        int i13 = i11 + (i12 - i10);
        int length = charSequence.length();
        int iA = i13;
        while (true) {
            if (i12 >= length) {
                z11 = false;
                break;
            }
            char cCharAt = charSequence.charAt(i12);
            if (cCharAt != '\t') {
                if (cCharAt != ' ') {
                    z11 = true;
                    break;
                }
                iA++;
            } else {
                iA += pn.f.a(iA);
            }
            i12++;
        }
        if (z10 && (((qVar instanceof qn.v) && ((qn.v) qVar).s().intValue() != 1) || !z11)) {
            return null;
        }
        if (!z11 || iA - i13 > pn.f.f28739a) {
            iA = i13 + 1;
        }
        return new b(qVar, iA);
    }

    public static c p(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return q(charSequence, i10);
        }
        int i11 = i10 + 1;
        if (!m(charSequence, i11)) {
            return null;
        }
        qn.c cVar = new qn.c();
        cVar.s(String.valueOf(cCharAt));
        return new c(cVar, i11);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:5:0x0009  */
    public static c q(CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        int i12 = 0;
        for (int i13 = i10; i13 < length; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != ')' || cCharAt == '.') {
                if (i12 >= 1) {
                    i11 = i13 + 1;
                    if (m(charSequence, i11)) {
                        String string = charSequence.subSequence(i10, i13).toString();
                        qn.v vVar = new qn.v();
                        vVar.v(Integer.valueOf(Integer.parseInt(string)));
                        vVar.u(String.valueOf(cCharAt));
                        return new c(vVar, i11);
                    }
                }
                return null;
            }
            switch (cCharAt) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    i12++;
                    if (i12 > 9) {
                        return null;
                    }
                    break;
                    break;
                default:
                    return null;
            }
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 != ')') {
                }
                if (i12 >= 1) {
                    i11 = i13 + 1;
                    if (m(charSequence, i11)) {
                        String string2 = charSequence.subSequence(i10, i13).toString();
                        qn.v vVar2 = new qn.v();
                        vVar2.v(Integer.valueOf(Integer.parseInt(string2)));
                        vVar2.u(String.valueOf(cCharAt2));
                        return new c(vVar2, i11);
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // tn.a, tn.d
    public boolean a() {
        return true;
    }

    @Override // tn.d
    public tn.c b(tn.h hVar) {
        if (hVar.a()) {
            this.b = true;
            this.f26465c = 0;
        } else if (this.b) {
            this.f26465c++;
        }
        return tn.c.b(hVar.getIndex());
    }

    @Override // tn.d
    public qn.a d() {
        return this.f26464a;
    }

    @Override // tn.a, tn.d
    public boolean e(qn.a aVar) {
        if (!(aVar instanceof qn.r)) {
            return false;
        }
        if (this.b && this.f26465c == 1) {
            this.f26464a.q(false);
            this.b = false;
        }
        return true;
    }
}
