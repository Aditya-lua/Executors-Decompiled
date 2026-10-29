package p312nn;

import java.util.Objects;
import p388qn.AbstractC10601a;
import p388qn.AbstractC10621q;
import p388qn.C10605c;
import p388qn.C10622r;
import p388qn.C10626v;
import pn.C10300f;
import tn.AbstractC11707a;
import tn.AbstractC11708b;
import tn.AbstractC11712f;
import tn.C11709c;
import tn.InterfaceC11710d;
import tn.InterfaceC11713g;
import tn.InterfaceC11714h;

/* JADX INFO: renamed from: nn.x */
/* JADX INFO: loaded from: classes3.dex */
public class C9522x extends AbstractC11707a {

    /* JADX INFO: renamed from: a */
    public final AbstractC10621q f34297a;

    /* JADX INFO: renamed from: b */
    public boolean f34298b;

    /* JADX INFO: renamed from: c */
    public int f34299c;

    /* JADX INFO: renamed from: nn.x$a */
    public static class a extends AbstractC11708b {
        @Override // tn.InterfaceC11711e
        /* JADX INFO: renamed from: a */
        public AbstractC11712f mo37456a(InterfaceC11714h interfaceC11714h, InterfaceC11713g interfaceC11713g) {
            b bVarM37602o;
            InterfaceC11710d interfaceC11710dMo37514a = interfaceC11713g.mo37514a();
            if (interfaceC11714h.mo37494d() < C10300f.f37013a && (bVarM37602o = C9522x.m37602o(interfaceC11714h.mo37492b().m41528a(), interfaceC11714h.mo37495e(), interfaceC11714h.mo37493c() + interfaceC11714h.mo37494d(), !interfaceC11713g.mo37515b().m41538f())) != null) {
                int i10 = bVarM37602o.f34301b;
                C9523y c9523y = new C9523y(interfaceC11714h.mo37494d(), i10 - interfaceC11714h.mo37493c());
                if ((interfaceC11710dMo37514a instanceof C9522x) && C9522x.m37601n((AbstractC10621q) interfaceC11710dMo37514a.mo37455d(), bVarM37602o.f34300a)) {
                    return AbstractC11712f.m43906d(c9523y).mo37462a(i10);
                }
                C9522x c9522x = new C9522x(bVarM37602o.f34300a);
                bVarM37602o.f34300a.m40694q(true);
                return AbstractC11712f.m43906d(c9522x, c9523y).mo37462a(i10);
            }
            return AbstractC11712f.m43905c();
        }
    }

    /* JADX INFO: renamed from: nn.x$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final AbstractC10621q f34300a;

        /* JADX INFO: renamed from: b */
        public final int f34301b;

        public b(AbstractC10621q abstractC10621q, int i10) {
            this.f34300a = abstractC10621q;
            this.f34301b = i10;
        }
    }

    /* JADX INFO: renamed from: nn.x$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final AbstractC10621q f34302a;

        /* JADX INFO: renamed from: b */
        public final int f34303b;

        public c(AbstractC10621q abstractC10621q, int i10) {
            this.f34302a = abstractC10621q;
            this.f34303b = i10;
        }
    }

    public C9522x(AbstractC10621q abstractC10621q) {
        this.f34297a = abstractC10621q;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m37600m(CharSequence charSequence, int i10) {
        char cCharAt;
        return i10 >= charSequence.length() || (cCharAt = charSequence.charAt(i10)) == '\t' || cCharAt == ' ';
    }

    /* JADX INFO: renamed from: n */
    public static boolean m37601n(AbstractC10621q abstractC10621q, AbstractC10621q abstractC10621q2) {
        if ((abstractC10621q instanceof C10605c) && (abstractC10621q2 instanceof C10605c)) {
            return Objects.equals(((C10605c) abstractC10621q).m40641r(), ((C10605c) abstractC10621q2).m40641r());
        }
        if ((abstractC10621q instanceof C10626v) && (abstractC10621q2 instanceof C10626v)) {
            return Objects.equals(((C10626v) abstractC10621q).m40709r(), ((C10626v) abstractC10621q2).m40709r());
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static b m37602o(CharSequence charSequence, int i10, int i11, boolean z10) {
        boolean z11;
        c cVarM37603p = m37603p(charSequence, i10);
        if (cVarM37603p == null) {
            return null;
        }
        AbstractC10621q abstractC10621q = cVarM37603p.f34302a;
        int i12 = cVarM37603p.f34303b;
        int i13 = i11 + (i12 - i10);
        int length = charSequence.length();
        int iM39574a = i13;
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
                iM39574a++;
            } else {
                iM39574a += C10300f.m39574a(iM39574a);
            }
            i12++;
        }
        if (z10 && (((abstractC10621q instanceof C10626v) && ((C10626v) abstractC10621q).m40710s().intValue() != 1) || !z11)) {
            return null;
        }
        if (!z11 || iM39574a - i13 > C10300f.f37013a) {
            iM39574a = i13 + 1;
        }
        return new b(abstractC10621q, iM39574a);
    }

    /* JADX INFO: renamed from: p */
    public static c m37603p(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '*' && cCharAt != '+' && cCharAt != '-') {
            return m37604q(charSequence, i10);
        }
        int i11 = i10 + 1;
        if (!m37600m(charSequence, i11)) {
            return null;
        }
        C10605c c10605c = new C10605c();
        c10605c.m40642s(String.valueOf(cCharAt));
        return new c(c10605c, i11);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x002e  */
    /* JADX WARN: Code duplicated, block: B:5:0x0009  */
    /* JADX INFO: renamed from: q */
    public static c m37604q(CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        int i12 = 0;
        for (int i13 = i10; i13 < length; i13++) {
            char cCharAt = charSequence.charAt(i13);
            if (cCharAt != ')' || cCharAt == '.') {
                if (i12 >= 1) {
                    i11 = i13 + 1;
                    if (m37600m(charSequence, i11)) {
                        String string = charSequence.subSequence(i10, i13).toString();
                        C10626v c10626v = new C10626v();
                        c10626v.m40713v(Integer.valueOf(Integer.parseInt(string)));
                        c10626v.m40712u(String.valueOf(cCharAt));
                        return new c(c10626v, i11);
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
                    if (m37600m(charSequence, i11)) {
                        String string2 = charSequence.subSequence(i10, i13).toString();
                        C10626v c10626v2 = new C10626v();
                        c10626v2.m40713v(Integer.valueOf(Integer.parseInt(string2)));
                        c10626v2.m40712u(String.valueOf(cCharAt2));
                        return new c(c10626v2, i11);
                    }
                }
                return null;
            }
        }
        return null;
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: a */
    public boolean mo37459a() {
        return true;
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: b */
    public C11709c mo37454b(InterfaceC11714h interfaceC11714h) {
        if (interfaceC11714h.mo37491a()) {
            this.f34298b = true;
            this.f34299c = 0;
        } else if (this.f34298b) {
            this.f34299c++;
        }
        return C11709c.m43902b(interfaceC11714h.getIndex());
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: d */
    public AbstractC10601a mo37455d() {
        return this.f34297a;
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: e */
    public boolean mo37460e(AbstractC10601a abstractC10601a) {
        if (!(abstractC10601a instanceof C10622r)) {
            return false;
        }
        if (this.f34298b && this.f34299c == 1) {
            this.f34297a.m40694q(false);
            this.f34298b = false;
        }
        return true;
    }
}
