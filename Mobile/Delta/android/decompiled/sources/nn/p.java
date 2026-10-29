package nn;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class p extends tn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn.n f26423a = new qn.n();
    public final List<CharSequence> b = new ArrayList();

    public static class a extends tn.b {
        @Override // tn.e
        public tn.f a(tn.h hVar, tn.g gVar) {
            return (hVar.d() < pn.f.f28739a || hVar.a() || (hVar.f().d() instanceof qn.w)) ? tn.f.c() : tn.f.d(new p()).a(hVar.c() + pn.f.f28739a);
        }
    }

    @Override // tn.d
    public tn.c b(tn.h hVar) {
        if (hVar.d() >= pn.f.f28739a) {
            return tn.c.a(hVar.c() + pn.f.f28739a);
        }
        return hVar.a() ? tn.c.b(hVar.e()) : tn.c.d();
    }

    @Override // tn.d
    public qn.a d() {
        return this.f26423a;
    }

    @Override // tn.a, tn.d
    public void g(rn.i iVar) {
        this.b.add(iVar.a());
    }

    @Override // tn.a, tn.d
    public void h() {
        int size = this.b.size() - 1;
        while (size >= 0 && vn.d.d(this.b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < size + 1; i10++) {
            sb2.append(this.b.get(i10));
            sb2.append('\n');
        }
        this.f26423a.q(sb2.toString());
    }
}
