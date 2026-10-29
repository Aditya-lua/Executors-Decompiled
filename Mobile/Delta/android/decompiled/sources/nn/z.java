package nn;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class z extends tn.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qn.w f26470a = new qn.w();
    public final w b = new w();

    @Override // tn.d
    public tn.c b(tn.h hVar) {
        return !hVar.a() ? tn.c.b(hVar.getIndex()) : tn.c.d();
    }

    @Override // tn.a, tn.d
    public boolean c() {
        return true;
    }

    @Override // tn.d
    public qn.a d() {
        return this.f26470a;
    }

    @Override // tn.a, tn.d
    public void f(rn.b bVar) {
        rn.j jVarE = this.b.e();
        if (jVarE.f()) {
            return;
        }
        bVar.b(jVarE, this.f26470a);
    }

    @Override // tn.a, tn.d
    public void g(rn.i iVar) {
        this.b.h(iVar);
    }

    @Override // tn.a, tn.d
    public void h() {
        Iterator<qn.p> it = this.b.d().iterator();
        while (it.hasNext()) {
            this.f26470a.j(it.next());
        }
        if (this.b.e().f()) {
            this.f26470a.n();
        } else {
            this.f26470a.l(this.b.f());
        }
    }

    @Override // tn.a, tn.d
    public void i(qn.y yVar) {
        this.b.a(yVar);
    }

    @Override // tn.a, tn.d
    public List<qn.e<?>> j() {
        qn.e eVar = new qn.e(qn.p.class);
        for (qn.p pVar : this.b.d()) {
            eVar.d(pVar.q(), pVar);
        }
        return j.a(new Object[]{eVar});
    }

    public rn.j k() {
        return this.b.e();
    }

    public List<qn.y> l(int i10) {
        return this.b.j(i10);
    }
}
