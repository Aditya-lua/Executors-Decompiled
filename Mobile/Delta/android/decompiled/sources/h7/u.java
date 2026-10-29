package h7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u implements c, i7.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18710a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i7.a.b> f18711c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.t.a f18712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i7.a<?, Float> f18713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i7.a<?, Float> f18714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i7.a<?, Float> f18715g;

    public u(o7.b bVar, n7.t tVar) {
        this.f18710a = tVar.c();
        this.b = tVar.g();
        this.f18712d = tVar.f();
        i7.d dVarA = tVar.e().a();
        this.f18713e = dVarA;
        i7.d dVarA2 = tVar.b().a();
        this.f18714f = dVarA2;
        i7.d dVarA3 = tVar.d().a();
        this.f18715g = dVarA3;
        bVar.j(dVarA);
        bVar.j(dVarA2);
        bVar.j(dVarA3);
        dVarA.a(this);
        dVarA2.a(this);
        dVarA3.a(this);
    }

    @Override // i7.a.b
    public void a() {
        for (int i10 = 0; i10 < this.f18711c.size(); i10++) {
            this.f18711c.get(i10).a();
        }
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
    }

    public void c(i7.a.b bVar) {
        this.f18711c.add(bVar);
    }

    public i7.a<?, Float> f() {
        return this.f18714f;
    }

    public i7.a<?, Float> h() {
        return this.f18715g;
    }

    public i7.a<?, Float> j() {
        return this.f18713e;
    }

    public n7.t.a k() {
        return this.f18712d;
    }

    public boolean l() {
        return this.b;
    }
}
