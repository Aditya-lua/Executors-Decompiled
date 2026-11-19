package ao;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z extends ho.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eo.w f3162a = new eo.w();
    public final w b = new w();

    @Override // ho.d
    public ho.c a(ho.h hVar) {
        return !hVar.a() ? ho.c.b(hVar.getIndex()) : ho.c.d();
    }

    @Override // ho.a, ho.d
    public void c(fo.i iVar) {
        this.b.h(iVar);
    }

    @Override // ho.a, ho.d
    public void d(eo.y yVar) {
        this.b.a(yVar);
    }

    @Override // ho.a, ho.d
    public boolean e() {
        return true;
    }

    @Override // ho.d
    public eo.a f() {
        return this.f3162a;
    }

    @Override // ho.a, ho.d
    public void h() {
        Iterator<eo.p> it = this.b.d().iterator();
        while (it.hasNext()) {
            this.f3162a.j(it.next());
        }
        if (this.b.e().f()) {
            this.f3162a.n();
        } else {
            this.f3162a.l(this.b.f());
        }
    }

    @Override // ho.a, ho.d
    public List<eo.e<?>> i() {
        eo.e eVar = new eo.e(eo.p.class);
        for (eo.p pVar : this.b.d()) {
            eVar.d(pVar.q(), pVar);
        }
        return j.a(new Object[]{eVar});
    }

    @Override // ho.a, ho.d
    public void j(fo.b bVar) {
        fo.j jVarE = this.b.e();
        if (jVarE.f()) {
            return;
        }
        bVar.b(jVarE, this.f3162a);
    }

    public fo.j k() {
        return this.b.e();
    }

    public List<eo.y> l(int i10) {
        return this.b.j(i10);
    }
}
