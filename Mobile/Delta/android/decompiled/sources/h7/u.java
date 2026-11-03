package h7;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class u implements c, i7.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19197a;
    public final boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<i7.a.b> f19198c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.t.a f19199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i7.a<?, Float> f19200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i7.a<?, Float> f19201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i7.a<?, Float> f19202g;

    public u(o7.b bVar, n7.t tVar) {
        this.f19197a = tVar.c();
        this.b = tVar.g();
        this.f19199d = tVar.f();
        i7.d dVarA = tVar.e().a();
        this.f19200e = dVarA;
        i7.d dVarA2 = tVar.b().a();
        this.f19201f = dVarA2;
        i7.d dVarA3 = tVar.d().a();
        this.f19202g = dVarA3;
        bVar.j(dVarA);
        bVar.j(dVarA2);
        bVar.j(dVarA3);
        dVarA.a(this);
        dVarA2.a(this);
        dVarA3.a(this);
    }

    @Override // i7.a.b
    public void a() {
        for (int i10 = 0; i10 < this.f19198c.size(); i10++) {
            this.f19198c.get(i10).a();
        }
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
    }

    public void c(i7.a.b bVar) {
        this.f19198c.add(bVar);
    }

    public i7.a<?, Float> f() {
        return this.f19201f;
    }

    public i7.a<?, Float> h() {
        return this.f19202g;
    }

    public i7.a<?, Float> j() {
        return this.f19200e;
    }

    public n7.t.a k() {
        return this.f19199d;
    }

    public boolean l() {
        return this.b;
    }
}
