package i7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u implements c, j7.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19267a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<j7.a.b> f19268c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o7.t.a f19269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j7.a<?, Float> f19270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j7.a<?, Float> f19271f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j7.a<?, Float> f19272g;

    public u(p7.b bVar, o7.t tVar) {
        this.f19267a = tVar.c();
        this.b = tVar.g();
        this.f19269d = tVar.f();
        j7.d dVarA = tVar.e().a();
        this.f19270e = dVarA;
        j7.d dVarA2 = tVar.b().a();
        this.f19271f = dVarA2;
        j7.d dVarA3 = tVar.d().a();
        this.f19272g = dVarA3;
        bVar.j(dVarA);
        bVar.j(dVarA2);
        bVar.j(dVarA3);
        dVarA.a(this);
        dVarA2.a(this);
        dVarA3.a(this);
    }

    @Override // j7.a.b
    public void a() {
        for (int i10 = 0; i10 < this.f19268c.size(); i10++) {
            this.f19268c.get(i10).a();
        }
    }

    @Override // i7.c
    public void b(List<c> list, List<c> list2) {
    }

    public void c(j7.a.b bVar) {
        this.f19268c.add(bVar);
    }

    public j7.a<?, Float> e() {
        return this.f19271f;
    }

    public j7.a<?, Float> h() {
        return this.f19272g;
    }

    public j7.a<?, Float> j() {
        return this.f19270e;
    }

    public o7.t.a k() {
        return this.f19269d;
    }

    public boolean l() {
        return this.b;
    }
}
