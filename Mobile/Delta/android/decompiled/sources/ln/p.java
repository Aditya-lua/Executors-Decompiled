package ln;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class p extends rn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on.n f23712a = new on.n();
    public final List<CharSequence> b = new ArrayList();

    public static class a extends rn.b {
        @Override // rn.e
        public rn.f a(rn.h hVar, rn.g gVar) {
            return (hVar.d() < nn.f.f27333a || hVar.a() || (hVar.f().g() instanceof on.w)) ? rn.f.c() : rn.f.d(new p()).a(hVar.c() + nn.f.f27333a);
        }
    }

    @Override // rn.a, rn.d
    public void a(pn.i iVar) {
        this.b.add(iVar.a());
    }

    @Override // rn.d
    public on.a g() {
        return this.f23712a;
    }

    @Override // rn.a, rn.d
    public void h() {
        int size = this.b.size() - 1;
        while (size >= 0 && tn.d.d(this.b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < size + 1; i10++) {
            sb2.append(this.b.get(i10));
            sb2.append('\n');
        }
        this.f23712a.q(sb2.toString());
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        if (hVar.d() >= nn.f.f27333a) {
            return rn.c.a(hVar.c() + nn.f.f27333a);
        }
        return hVar.a() ? rn.c.b(hVar.e()) : rn.c.d();
    }
}
