package ao;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class p extends ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.n f3115a = new eo.n();
    public final List<CharSequence> b = new ArrayList();

    public static class a extends ho.b {
        @Override // ho.e
        public ho.f a(ho.h hVar, ho.g gVar) {
            return (hVar.d() < co.f.f5535a || hVar.a() || (hVar.f().f() instanceof eo.w)) ? ho.f.c() : ho.f.d(new p()).a(hVar.c() + co.f.f5535a);
        }
    }

    @Override // ho.d
    public ho.c a(ho.h hVar) {
        if (hVar.d() >= co.f.f5535a) {
            return ho.c.a(hVar.c() + co.f.f5535a);
        }
        return hVar.a() ? ho.c.b(hVar.e()) : ho.c.d();
    }

    @Override // ho.a, ho.d
    public void c(fo.i iVar) {
        this.b.add(iVar.a());
    }

    @Override // ho.d
    public eo.a f() {
        return this.f3115a;
    }

    @Override // ho.a, ho.d
    public void h() {
        int size = this.b.size() - 1;
        while (size >= 0 && jo.d.d(this.b.get(size))) {
            size--;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < size + 1; i10++) {
            sb2.append(this.b.get(i10));
            sb2.append('\n');
        }
        this.f3115a.q(sb2.toString());
    }
}
