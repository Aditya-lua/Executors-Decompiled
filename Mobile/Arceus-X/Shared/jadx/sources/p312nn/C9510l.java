package p312nn;

import p388qn.AbstractC10601a;
import p388qn.C10612h;
import p418rn.C10934i;
import pn.C10297c;
import pn.C10300f;
import tn.AbstractC11707a;
import tn.AbstractC11708b;
import tn.AbstractC11712f;
import tn.C11709c;
import tn.InterfaceC11713g;
import tn.InterfaceC11714h;
import vn.C12236d;

/* JADX INFO: renamed from: nn.l */
/* JADX INFO: loaded from: classes3.dex */
public class C9510l extends AbstractC11707a {

    /* JADX INFO: renamed from: a */
    public final C10612h f34236a;

    /* JADX INFO: renamed from: b */
    public final char f34237b;

    /* JADX INFO: renamed from: c */
    public final int f34238c;

    /* JADX INFO: renamed from: d */
    public String f34239d;

    /* JADX INFO: renamed from: e */
    public StringBuilder f34240e;

    /* JADX INFO: renamed from: nn.l$a */
    public static class a extends AbstractC11708b {
        @Override // tn.InterfaceC11711e
        /* JADX INFO: renamed from: a */
        public AbstractC11712f mo37456a(InterfaceC11714h interfaceC11714h, InterfaceC11713g interfaceC11713g) {
            int iMo37494d = interfaceC11714h.mo37494d();
            if (iMo37494d >= C10300f.f37013a) {
                return AbstractC11712f.m43905c();
            }
            int iMo37495e = interfaceC11714h.mo37495e();
            C9510l c9510lM37521m = C9510l.m37521m(interfaceC11714h.mo37492b().m41528a(), iMo37495e, iMo37494d);
            return c9510lM37521m != null ? AbstractC11712f.m43906d(c9510lM37521m).mo37463b(iMo37495e + c9510lM37521m.f34236a.m40675t().intValue()) : AbstractC11712f.m43905c();
        }
    }

    public C9510l(char c10, int i10, int i11) {
        C10612h c10612h = new C10612h();
        this.f34236a = c10612h;
        this.f34240e = new StringBuilder();
        this.f34237b = c10;
        this.f34238c = i10;
        c10612h.m40677v(String.valueOf(c10));
        c10612h.m40681z(Integer.valueOf(i10));
        c10612h.m40678w(i11);
    }

    /* JADX INFO: renamed from: m */
    public static C9510l m37521m(CharSequence charSequence, int i10, int i11) {
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
            if (C12236d.m45377a('`', charSequence, i10 + i12) != -1) {
                return null;
            }
            return new C9510l('`', i12, i11);
        }
        if (i13 < 3 || i12 != 0) {
            return null;
        }
        return new C9510l('~', i13, i11);
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: b */
    public C11709c mo37454b(InterfaceC11714h interfaceC11714h) {
        int iMo37495e = interfaceC11714h.mo37495e();
        int index = interfaceC11714h.getIndex();
        CharSequence charSequenceM41528a = interfaceC11714h.mo37492b().m41528a();
        if (interfaceC11714h.mo37494d() < C10300f.f37013a && iMo37495e < charSequenceM41528a.length() && m37524n(charSequenceM41528a, iMo37495e)) {
            return C11709c.m43903c();
        }
        int length = charSequenceM41528a.length();
        for (int iM40672q = this.f34236a.m40672q(); iM40672q > 0 && index < length && charSequenceM41528a.charAt(index) == ' '; iM40672q--) {
            index++;
        }
        return C11709c.m43902b(index);
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: d */
    public AbstractC10601a mo37455d() {
        return this.f34236a;
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: g */
    public void mo37522g(C10934i c10934i) {
        if (this.f34239d == null) {
            this.f34239d = c10934i.m41528a().toString();
        } else {
            this.f34240e.append(c10934i.m41528a());
            this.f34240e.append('\n');
        }
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: h */
    public void mo37523h() {
        this.f34236a.m40679x(C10297c.m39565e(this.f34239d.trim()));
        this.f34236a.m40680y(this.f34240e.toString());
    }

    /* JADX INFO: renamed from: n */
    public final boolean m37524n(CharSequence charSequence, int i10) {
        int iM45385i = C12236d.m45385i(this.f34237b, charSequence, i10, charSequence.length()) - i10;
        if (iM45385i < this.f34238c || C12236d.m45387k(charSequence, i10 + iM45385i, charSequence.length()) != charSequence.length()) {
            return false;
        }
        this.f34236a.m40676u(Integer.valueOf(iM45385i));
        return true;
    }
}
