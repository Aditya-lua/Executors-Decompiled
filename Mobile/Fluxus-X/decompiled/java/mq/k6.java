package mq;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class k6 implements wt.d<q5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f23652a;
    public final wt.i<qq.c.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wt.i<js.b.a> f23653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wt.i<c0.b> f23654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wt.i<fq.n1> f23655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wt.i<vq.j> f23656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wt.i<sn.a0.a> f23657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wt.i<un.c.a> f23658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final wt.i<yn.a> f23659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wt.i<ir.b> f23660j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final wt.i<pq.a> f23661k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wt.i<rq.b.InterfaceC0610b> f23662l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wt.i<gr.b> f23663m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wt.i<f0> f23664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final wt.i<er.c> f23665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wt.i<to.e> f23666p;

    public k6(wt.i<Context> iVar, wt.i<qq.c.a> iVar2, wt.i<js.b.a> iVar3, wt.i<c0.b> iVar4, wt.i<fq.n1> iVar5, wt.i<vq.j> iVar6, wt.i<sn.a0.a> iVar7, wt.i<un.c.a> iVar8, wt.i<yn.a> iVar9, wt.i<ir.b> iVar10, wt.i<pq.a> iVar11, wt.i<rq.b.InterfaceC0610b> iVar12, wt.i<gr.b> iVar13, wt.i<f0> iVar14, wt.i<er.c> iVar15, wt.i<to.e> iVar16) {
        this.f23652a = iVar;
        this.b = iVar2;
        this.f23653c = iVar3;
        this.f23654d = iVar4;
        this.f23655e = iVar5;
        this.f23656f = iVar6;
        this.f23657g = iVar7;
        this.f23658h = iVar8;
        this.f23659i = iVar9;
        this.f23660j = iVar10;
        this.f23661k = iVar11;
        this.f23662l = iVar12;
        this.f23663m = iVar13;
        this.f23664n = iVar14;
        this.f23665o = iVar15;
        this.f23666p = iVar16;
    }

    public static k6 a(wt.i<Context> iVar, wt.i<qq.c.a> iVar2, wt.i<js.b.a> iVar3, wt.i<c0.b> iVar4, wt.i<fq.n1> iVar5, wt.i<vq.j> iVar6, wt.i<sn.a0.a> iVar7, wt.i<un.c.a> iVar8, wt.i<yn.a> iVar9, wt.i<ir.b> iVar10, wt.i<pq.a> iVar11, wt.i<rq.b.InterfaceC0610b> iVar12, wt.i<gr.b> iVar13, wt.i<f0> iVar14, wt.i<er.c> iVar15, wt.i<to.e> iVar16) {
        return new k6(iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10, iVar11, iVar12, iVar13, iVar14, iVar15, iVar16);
    }

    public static q5 c(Context context, qq.c.a aVar, js.b.a aVar2, c0.b bVar, fq.n1 n1Var, vq.j jVar, sn.a0.a aVar3, un.c.a aVar4, yn.a aVar5, ir.b bVar2, pq.a aVar6, rq.b.InterfaceC0610b interfaceC0610b, gr.b bVar3, f0 f0Var, er.c cVar, to.e eVar) {
        return new q5(context, aVar, aVar2, bVar, n1Var, jVar, aVar3, aVar4, aVar5, bVar2, aVar6, interfaceC0610b, bVar3, f0Var, cVar, eVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public q5 get() {
        return c(this.f23652a.get(), this.b.get(), this.f23653c.get(), this.f23654d.get(), this.f23655e.get(), this.f23656f.get(), this.f23657g.get(), this.f23658h.get(), this.f23659i.get(), this.f23660j.get(), this.f23661k.get(), this.f23662l.get(), this.f23663m.get(), this.f23664n.get(), this.f23665o.get(), this.f23666p.get());
    }
}
