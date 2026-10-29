package p312nn;

import p388qn.AbstractC10601a;
import p388qn.C10614j;
import p418rn.C10934i;
import p418rn.C10935j;
import p418rn.InterfaceC10927b;
import pn.C10300f;
import sn.C11424h;
import sn.C11425i;
import tn.AbstractC11707a;
import tn.AbstractC11708b;
import tn.AbstractC11712f;
import tn.C11709c;
import tn.InterfaceC11713g;
import tn.InterfaceC11714h;
import vn.C12236d;

/* JADX INFO: renamed from: nn.m */
/* JADX INFO: loaded from: classes3.dex */
public class C9511m extends AbstractC11707a {

    /* JADX INFO: renamed from: a */
    public final C10614j f34241a;

    /* JADX INFO: renamed from: b */
    public final C10935j f34242b;

    /* JADX INFO: renamed from: nn.m$a */
    public static class a extends AbstractC11708b {
        @Override // tn.InterfaceC11711e
        /* JADX INFO: renamed from: a */
        public AbstractC11712f mo37456a(InterfaceC11714h interfaceC11714h, InterfaceC11713g interfaceC11713g) {
            C9511m c9511mM37527m;
            if (interfaceC11714h.mo37494d() >= C10300f.f37013a) {
                return AbstractC11712f.m43905c();
            }
            C10934i c10934iMo37492b = interfaceC11714h.mo37492b();
            int iMo37495e = interfaceC11714h.mo37495e();
            if (c10934iMo37492b.m41528a().charAt(iMo37495e) == '#' && (c9511mM37527m = C9511m.m37527m(c10934iMo37492b.m41530d(iMo37495e, c10934iMo37492b.m41528a().length()))) != null) {
                return AbstractC11712f.m43906d(c9511mM37527m).mo37463b(c10934iMo37492b.m41528a().length());
            }
            int iM37528n = C9511m.m37528n(c10934iMo37492b.m41528a(), iMo37495e);
            if (iM37528n > 0) {
                C10935j c10935jMo37515b = interfaceC11713g.mo37515b();
                if (!c10935jMo37515b.m41538f()) {
                    return AbstractC11712f.m43906d(new C9511m(iM37528n, c10935jMo37515b)).mo37463b(c10934iMo37492b.m41528a().length()).mo37464e(c10935jMo37515b.m41536d().size());
                }
            }
            return AbstractC11712f.m43905c();
        }
    }

    public C9511m(int i10, C10935j c10935j) {
        C10614j c10614j = new C10614j();
        this.f34241a = c10614j;
        c10614j.m40683q(i10);
        this.f34242b = c10935j;
    }

    /* JADX INFO: renamed from: m */
    public static C9511m m37527m(C10934i c10934i) {
        C11425i c11425iM42794k = C11425i.m42794k(C10935j.m41533h(c10934i));
        int iM42801g = c11425iM42794k.m42801g('#');
        if (iM42801g == 0 || iM42801g > 6) {
            return null;
        }
        if (!c11425iM42794k.m42799e()) {
            return new C9511m(iM42801g, C10935j.m41531b());
        }
        char cM42805l = c11425iM42794k.m42805l();
        if (cM42805l != ' ' && cM42805l != '\t') {
            return null;
        }
        c11425iM42794k.m42811r();
        C11424h c11424hM42808o = c11425iM42794k.m42808o();
        C11424h c11424hM42808o2 = c11424hM42808o;
        loop0: while (true) {
            boolean z10 = true;
            while (true) {
                if (!c11425iM42794k.m42799e()) {
                    break loop0;
                }
                char cM42805l2 = c11425iM42794k.m42805l();
                if (cM42805l2 == '\t' || cM42805l2 == ' ') {
                    c11425iM42794k.m42802h();
                    break;
                }
                if (cM42805l2 != '#') {
                    c11425iM42794k.m42802h();
                    c11424hM42808o2 = c11425iM42794k.m42808o();
                } else if (z10) {
                    c11425iM42794k.m42801g('#');
                    int iM42811r = c11425iM42794k.m42811r();
                    if (c11425iM42794k.m42799e()) {
                        c11424hM42808o2 = c11425iM42794k.m42808o();
                    }
                    if (iM42811r > 0) {
                        break;
                    }
                } else {
                    c11425iM42794k.m42802h();
                    c11424hM42808o2 = c11425iM42794k.m42808o();
                }
                z10 = false;
            }
        }
        C10935j c10935jM42798d = c11425iM42794k.m42798d(c11424hM42808o, c11424hM42808o2);
        return c10935jM42798d.m41535c().isEmpty() ? new C9511m(iM42801g, C10935j.m41531b()) : new C9511m(iM42801g, c10935jM42798d);
    }

    /* JADX INFO: renamed from: n */
    public static int m37528n(CharSequence charSequence, int i10) {
        char cCharAt = charSequence.charAt(i10);
        if (cCharAt != '-') {
            return (cCharAt == '=' && m37529o(charSequence, i10 + 1, '=')) ? 1 : 0;
        }
        return m37529o(charSequence, i10 + 1, '-') ? 2 : 0;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m37529o(CharSequence charSequence, int i10, char c10) {
        return C12236d.m45387k(charSequence, C12236d.m45385i(c10, charSequence, i10, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: b */
    public C11709c mo37454b(InterfaceC11714h interfaceC11714h) {
        return C11709c.m43904d();
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: d */
    public AbstractC10601a mo37455d() {
        return this.f34241a;
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: f */
    public void mo37530f(InterfaceC10927b interfaceC10927b) {
        interfaceC10927b.mo37563b(this.f34242b, this.f34241a);
    }
}
