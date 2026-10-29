package p312nn;

import p388qn.AbstractC10601a;
import p388qn.C10603b;
import pn.C10300f;
import tn.AbstractC11707a;
import tn.AbstractC11708b;
import tn.AbstractC11712f;
import tn.C11709c;
import tn.InterfaceC11713g;
import tn.InterfaceC11714h;
import vn.C12236d;

/* JADX INFO: renamed from: nn.c */
/* JADX INFO: loaded from: classes3.dex */
public class C9501c extends AbstractC11707a {

    /* JADX INFO: renamed from: a */
    public final C10603b f34186a = new C10603b();

    /* JADX INFO: renamed from: nn.c$a */
    public static class a extends AbstractC11708b {
        @Override // tn.InterfaceC11711e
        /* JADX INFO: renamed from: a */
        public AbstractC11712f mo37456a(InterfaceC11714h interfaceC11714h, InterfaceC11713g interfaceC11713g) {
            int iMo37495e = interfaceC11714h.mo37495e();
            if (!C9501c.m37458m(interfaceC11714h, iMo37495e)) {
                return AbstractC11712f.m43905c();
            }
            int iMo37493c = interfaceC11714h.mo37493c() + interfaceC11714h.mo37494d();
            int i10 = iMo37493c + 1;
            if (C12236d.m45383g(interfaceC11714h.mo37492b().m41528a(), iMo37495e + 1)) {
                i10 = iMo37493c + 2;
            }
            return AbstractC11712f.m43906d(new C9501c()).mo37462a(i10);
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m37458m(InterfaceC11714h interfaceC11714h, int i10) {
        CharSequence charSequenceM41528a = interfaceC11714h.mo37492b().m41528a();
        return interfaceC11714h.mo37494d() < C10300f.f37013a && i10 < charSequenceM41528a.length() && charSequenceM41528a.charAt(i10) == '>';
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: a */
    public boolean mo37459a() {
        return true;
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: b */
    public C11709c mo37454b(InterfaceC11714h interfaceC11714h) {
        int iMo37495e = interfaceC11714h.mo37495e();
        if (!m37458m(interfaceC11714h, iMo37495e)) {
            return C11709c.m43904d();
        }
        int iMo37493c = interfaceC11714h.mo37493c() + interfaceC11714h.mo37494d();
        int i10 = iMo37493c + 1;
        if (C12236d.m45383g(interfaceC11714h.mo37492b().m41528a(), iMo37495e + 1)) {
            i10 = iMo37493c + 2;
        }
        return C11709c.m43901a(i10);
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: e */
    public boolean mo37460e(AbstractC10601a abstractC10601a) {
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: d()Lqn/a; */
    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public C10603b mo37455d() {
        return this.f34186a;
    }
}
