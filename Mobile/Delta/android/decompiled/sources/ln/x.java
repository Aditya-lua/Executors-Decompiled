package ln;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class x extends rn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on.q f23753a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23754c;

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            b bVarO;
            rn.d dVarA = gVar.a();
            if (hVar.d() < nn.f.f27333a && (bVarO = x.o(hVar.b().a(), hVar.e(), hVar.c() + hVar.d(), !gVar.b().f())) != null) {
                int i10 = bVarO.b;
                y yVar = new y(hVar.d(), i10 - hVar.c());
                if ((dVarA instanceof x) && x.n((on.q) dVarA.g(), bVarO.f23755a)) {
                    return rn.f.d(yVar).a(i10);
                }
                x xVar = new x(bVarO.f23755a);
                bVarO.f23755a.q(true);
                return rn.f.d(xVar, yVar).a(i10);
            }
            return rn.f.c();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final on.q f23755a;
        public final int b;

        public b(on.q qVar, int i10) {
            this.f23755a = qVar;
            this.b = i10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final on.q f23756a;
        public final int b;

        public c(on.q qVar, int i10) {
            this.f23756a = qVar;
            this.b = i10;
        }
    }

    public x(on.q qVar) {
        this.f23753a = qVar;
    }

    public static boolean m(CharSequence charSequence, int i10) {
        char cCharAt;
        return i10 >= charSequence.length() || (cCharAt = charSequence.charAt(i10)) == '\t' || cCharAt == ' ';
    }

    public static boolean n(on.q qVar, on.q qVar2) {
        if ((qVar instanceof on.c) && (qVar2 instanceof on.c)) {
            return Objects.equals(((on.c) qVar).r(), ((on.c) qVar2).r());
        }
        if ((qVar instanceof on.v) && (qVar2 instanceof on.v)) {
            return Objects.equals(((on.v) qVar).r(), ((on.v) qVar2).r());
        }
        return false;
    }

    public static b o(CharSequence charSequence, int i10, int i11, boolean z10) {
        boolean z11;
        c cVarP = p(charSequence, i10);
        if (cVarP == null) {
            return null;
        }
        on.q qVar = cVarP.f23756a;
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
                iA += nn.f.a(iA);
            }
            i12++;
        }
        if (z10 && (((qVar instanceof on.v) && ((on.v) qVar).s().intValue() != 1) || !z11)) {
            return null;
        }
        if (!z11 || iA - i13 > nn.f.f27333a) {
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
        on.c cVar = new on.c();
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
                        on.v vVar = new on.v();
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
                        on.v vVar2 = new on.v();
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

    @Override // rn.a, rn.d
    public boolean b() {
        return true;
    }

    @Override // rn.a, rn.d
    public boolean f(on.a aVar) {
        if (!(aVar instanceof on.r)) {
            return false;
        }
        if (this.b && this.f23754c == 1) {
            this.f23753a.q(false);
            this.b = false;
        }
        return true;
    }

    @Override // rn.d
    public on.a g() {
        return this.f23753a;
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        if (hVar.a()) {
            this.b = true;
            this.f23754c = 0;
        } else if (this.b) {
            this.f23754c++;
        }
        return rn.c.b(hVar.getIndex());
    }
}
