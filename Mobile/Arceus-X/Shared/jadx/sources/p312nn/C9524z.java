package p312nn;

import java.util.Iterator;
import java.util.List;
import p388qn.AbstractC10601a;
import p388qn.C10609e;
import p388qn.C10620p;
import p388qn.C10627w;
import p388qn.C10629y;
import p418rn.C10934i;
import p418rn.C10935j;
import p418rn.InterfaceC10927b;
import tn.AbstractC11707a;
import tn.C11709c;
import tn.InterfaceC11714h;

/* JADX INFO: renamed from: nn.z */
/* JADX INFO: loaded from: classes3.dex */
public class C9524z extends AbstractC11707a {

    /* JADX INFO: renamed from: a */
    public final C10627w f34307a = new C10627w();

    /* JADX INFO: renamed from: b */
    public final C9521w f34308b = new C9521w();

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: b */
    public C11709c mo37454b(InterfaceC11714h interfaceC11714h) {
        return !interfaceC11714h.mo37491a() ? C11709c.m43902b(interfaceC11714h.getIndex()) : C11709c.m43904d();
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: c */
    public boolean mo37605c() {
        return true;
    }

    @Override // tn.InterfaceC11710d
    /* JADX INFO: renamed from: d */
    public AbstractC10601a mo37455d() {
        return this.f34307a;
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: f */
    public void mo37530f(InterfaceC10927b interfaceC10927b) {
        C10935j c10935jM37589e = this.f34308b.m37589e();
        if (c10935jM37589e.m41538f()) {
            return;
        }
        interfaceC10927b.mo37563b(c10935jM37589e, this.f34307a);
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: g */
    public void mo37522g(C10934i c10934i) {
        this.f34308b.m37592h(c10934i);
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: h */
    public void mo37523h() {
        Iterator<C10620p> it = this.f34308b.m37588d().iterator();
        while (it.hasNext()) {
            this.f34307a.m40704j(it.next());
        }
        if (this.f34308b.m37589e().m41538f()) {
            this.f34307a.m40706n();
        } else {
            this.f34307a.m40705l(this.f34308b.m37590f());
        }
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: i */
    public void mo37606i(C10629y c10629y) {
        this.f34308b.m37585a(c10629y);
    }

    @Override // tn.AbstractC11707a, tn.InterfaceC11710d
    /* JADX INFO: renamed from: j */
    public List<C10609e<?>> mo37607j() {
        C10609e c10609e = new C10609e(C10620p.class);
        for (C10620p c10620p : this.f34308b.m37588d()) {
            c10609e.m40670d(c10620p.m40691q(), c10620p);
        }
        return C9508j.m37484a(new Object[]{c10609e});
    }

    /* JADX INFO: renamed from: k */
    public C10935j m37608k() {
        return this.f34308b.m37589e();
    }

    /* JADX INFO: renamed from: l */
    public List<C10629y> m37609l(int i10) {
        return this.f34308b.m37593j(i10);
    }
}
