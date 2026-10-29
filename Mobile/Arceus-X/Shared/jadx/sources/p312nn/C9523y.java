package p312nn;

import p388qn.AbstractC10601a;
import p388qn.AbstractC10621q;
import p388qn.C10622r;
import p388qn.C10627w;
import tn.AbstractC11707a;
import tn.C11709c;
import tn.InterfaceC11714h;

/* JADX INFO: renamed from: nn.y */
/* JADX INFO: loaded from: classes3.dex */
public class C9523y extends AbstractC11707a {

    /* JADX INFO: renamed from: a */
    public final C10622r f34304a;

    /* JADX INFO: renamed from: b */
    public int f34305b;

    /* JADX INFO: renamed from: c */
    public boolean f34306c;

    public C9523y(int i10, int i11) {
        C10622r c10622r = new C10622r();
        this.f34304a = c10622r;
        this.f34305b = i11;
        c10622r.m40697q(Integer.valueOf(i10));
        c10622r.m40696p(Integer.valueOf(i11));
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: a */
    public boolean mo37459a() {
        return true;
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: b */
    public C11709c mo37454b(InterfaceC11714h interfaceC11714h) {
        if (!interfaceC11714h.mo37491a()) {
            return interfaceC11714h.mo37494d() >= this.f34305b ? C11709c.m43901a(interfaceC11714h.mo37493c() + this.f34305b) : C11709c.m43904d();
        }
        if (this.f34304a.m40699d() == null) {
            return C11709c.m43904d();
        }
        AbstractC10601a abstractC10601aMo37455d = interfaceC11714h.mo37496f().mo37455d();
        this.f34306c = (abstractC10601aMo37455d instanceof C10627w) || (abstractC10601aMo37455d instanceof C10622r);
        return C11709c.m43902b(interfaceC11714h.mo37495e());
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: d */
    public AbstractC10601a mo37455d() {
        return this.f34304a;
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: e */
    public boolean mo37460e(AbstractC10601a abstractC10601a) {
        if (!this.f34306c) {
            return true;
        }
        AbstractC10601a abstractC10601aMo40634g = this.f34304a.mo40634g();
        if (!(abstractC10601aMo40634g instanceof AbstractC10621q)) {
            return true;
        }
        ((AbstractC10621q) abstractC10601aMo40634g).m40694q(false);
        return true;
    }
}
