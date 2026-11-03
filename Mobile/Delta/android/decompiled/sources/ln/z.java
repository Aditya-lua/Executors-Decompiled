package ln;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z extends rn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final on.w f23759a = new on.w();
    public final w b = new w();

    @Override // rn.a, rn.d
    public void a(pn.i iVar) {
        this.b.h(iVar);
    }

    @Override // rn.a, rn.d
    public void c(pn.b bVar) {
        pn.j jVarE = this.b.e();
        if (jVarE.f()) {
            return;
        }
        bVar.a(jVarE, this.f23759a);
    }

    @Override // rn.a, rn.d
    public void d(on.y yVar) {
        this.b.a(yVar);
    }

    @Override // rn.a, rn.d
    public boolean e() {
        return true;
    }

    @Override // rn.d
    public on.a g() {
        return this.f23759a;
    }

    @Override // rn.a, rn.d
    public void h() {
        Iterator<on.p> it = this.b.d().iterator();
        while (it.hasNext()) {
            this.f23759a.j(it.next());
        }
        if (this.b.e().f()) {
            this.f23759a.n();
        } else {
            this.f23759a.l(this.b.f());
        }
    }

    @Override // rn.a, rn.d
    public List<on.e<?>> i() {
        on.e eVar = new on.e(on.p.class);
        for (on.p pVar : this.b.d()) {
            eVar.d(pVar.q(), pVar);
        }
        return j.a(new Object[]{eVar});
    }

    @Override // rn.d
    public rn.c j(rn.h hVar) {
        return !hVar.a() ? rn.c.b(hVar.getIndex()) : rn.c.d();
    }

    public pn.j k() {
        return this.b.e();
    }

    public List<on.y> l(int i10) {
        return this.b.j(i10);
    }
}
