package ao;

import com.appsflyer.share.attribution.RequestError;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class x extends ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.q f3156a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3157c;

    public static class a extends ho.b {
        @Override // ho.e
        public ho.f a(ho.h hVar, ho.g gVar) {
            b bVarO;
            ho.d dVarA = gVar.a();
            if (hVar.d() < co.f.f5535a && (bVarO = x.o(hVar.b().a(), hVar.e(), hVar.c() + hVar.d(), !gVar.b().f())) != null) {
                int i10 = bVarO.b;
                y yVar = new y(hVar.d(), i10 - hVar.c());
                if ((dVarA instanceof x) && x.n((eo.q) dVarA.f(), bVarO.f3158a)) {
                    return ho.f.d(yVar).a(i10);
                }
                x xVar = new x(bVarO.f3158a);
                bVarO.f3158a.q(true);
                return ho.f.d(xVar, yVar).a(i10);
            }
            return ho.f.c();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final eo.q f3158a;
        public final int b;

        public b(eo.q qVar, int i10) {
            this.f3158a = qVar;
            this.b = i10;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final eo.q f3159a;
        public final int b;

        public c(eo.q qVar, int i10) {
            this.f3159a = qVar;
            this.b = i10;
        }
    }

    public x(eo.q qVar) {
        this.f3156a = qVar;
    }

    public static boolean m(CharSequence charSequence, int i10) {
        char cCharAt;
        return i10 >= charSequence.length() || (cCharAt = charSequence.charAt(i10)) == '\t' || cCharAt == ' ';
    }

    public static boolean n(eo.q qVar, eo.q qVar2) {
        if ((qVar instanceof eo.c) && (qVar2 instanceof eo.c)) {
            return Objects.equals(((eo.c) qVar).r(), ((eo.c) qVar2).r());
        }
        if ((qVar instanceof eo.v) && (qVar2 instanceof eo.v)) {
            return Objects.equals(((eo.v) qVar).r(), ((eo.v) qVar2).r());
        }
        return false;
    }

    public static b o(CharSequence charSequence, int i10, int i11, boolean z10) {
        boolean z11;
        c cVarP = p(charSequence, i10);
        if (cVarP == null) {
            return null;
        }
        eo.q qVar = cVarP.f3159a;
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
                iA += co.f.a(iA);
            }
            i12++;
        }
        if (z10 && (((qVar instanceof eo.v) && ((eo.v) qVar).s().intValue() != 1) || !z11)) {
            return null;
        }
        if (!z11 || iA - i13 > co.f.f5535a) {
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
        eo.c cVar = new eo.c();
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
                        eo.v vVar = new eo.v();
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
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
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
                        eo.v vVar2 = new eo.v();
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

    @Override // ho.d
    public ho.c a(ho.h hVar) {
        if (hVar.a()) {
            this.b = true;
            this.f3157c = 0;
        } else if (this.b) {
            this.f3157c++;
        }
        return ho.c.b(hVar.getIndex());
    }

    @Override // ho.a, ho.d
    public boolean b() {
        return true;
    }

    @Override // ho.d
    public eo.a f() {
        return this.f3156a;
    }

    @Override // ho.a, ho.d
    public boolean g(eo.a aVar) {
        if (!(aVar instanceof eo.r)) {
            return false;
        }
        if (this.b && this.f3157c == 1) {
            this.f3156a.q(false);
            this.b = false;
        }
        return true;
    }
}
