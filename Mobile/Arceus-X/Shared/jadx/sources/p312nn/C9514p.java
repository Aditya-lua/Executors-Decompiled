package p312nn;

import java.util.ArrayList;
import java.util.List;
import p388qn.AbstractC10601a;
import p388qn.C10618n;
import p388qn.C10627w;
import p418rn.C10934i;
import pn.C10300f;
import tn.AbstractC11707a;
import tn.AbstractC11708b;
import tn.AbstractC11712f;
import tn.C11709c;
import tn.InterfaceC11713g;
import tn.InterfaceC11714h;
import vn.C12236d;

/* JADX INFO: renamed from: nn.p */
/* JADX INFO: loaded from: classes3.dex */
public class C9514p extends AbstractC11707a {

    /* JADX INFO: renamed from: a */
    public final C10618n f34248a = new C10618n();

    /* JADX INFO: renamed from: b */
    public final List<CharSequence> f34249b = new ArrayList();

    /* JADX INFO: renamed from: nn.p$a */
    public static class a extends AbstractC11708b {
        @Override // tn.InterfaceC11711e
        /* JADX INFO: renamed from: a */
        public AbstractC11712f mo37456a(InterfaceC11714h interfaceC11714h, InterfaceC11713g interfaceC11713g) {
            return (interfaceC11714h.mo37494d() < C10300f.f37013a || interfaceC11714h.mo37491a() || (interfaceC11714h.mo37496f().mo37455d() instanceof C10627w)) ? AbstractC11712f.m43905c() : AbstractC11712f.m43906d(new C9514p()).mo37462a(interfaceC11714h.mo37493c() + C10300f.f37013a);
        }
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: b */
    public C11709c mo37454b(InterfaceC11714h interfaceC11714h) {
        if (interfaceC11714h.mo37494d() >= C10300f.f37013a) {
            return C11709c.m43901a(interfaceC11714h.mo37493c() + C10300f.f37013a);
        }
        return interfaceC11714h.mo37491a() ? C11709c.m43902b(interfaceC11714h.mo37495e()) : C11709c.m43904d();
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: d */
    public AbstractC10601a mo37455d() {
        return this.f34248a;
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: g */
    public void mo37522g(C10934i c10934i) {
        this.f34249b.add(c10934i.m41528a());
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: h */
    public void mo37523h() {
        int size = this.f34249b.size() - 1;
        while (size >= 0 && C12236d.m45380d(this.f34249b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < size + 1; i10++) {
            sb2.append(this.f34249b.get(i10));
            sb2.append('\n');
        }
        this.f34248a.m40688q(sb2.toString());
    }
}
