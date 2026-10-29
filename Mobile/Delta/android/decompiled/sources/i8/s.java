package i8;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements d8.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<Context> f20384a;
    public final ht.a<c8.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht.a<j8.d> f20385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.a<x> f20386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ht.a<Executor> f20387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ht.a<k8.b> f20388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ht.a<l8.a> f20389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ht.a<l8.a> f20390h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ht.a<j8.c> f20391i;

    public s(ht.a<Context> aVar, ht.a<c8.e> aVar2, ht.a<j8.d> aVar3, ht.a<x> aVar4, ht.a<Executor> aVar5, ht.a<k8.b> aVar6, ht.a<l8.a> aVar7, ht.a<l8.a> aVar8, ht.a<j8.c> aVar9) {
        this.f20384a = aVar;
        this.b = aVar2;
        this.f20385c = aVar3;
        this.f20386d = aVar4;
        this.f20387e = aVar5;
        this.f20388f = aVar6;
        this.f20389g = aVar7;
        this.f20390h = aVar8;
        this.f20391i = aVar9;
    }

    public static s a(ht.a<Context> aVar, ht.a<c8.e> aVar2, ht.a<j8.d> aVar3, ht.a<x> aVar4, ht.a<Executor> aVar5, ht.a<k8.b> aVar6, ht.a<l8.a> aVar7, ht.a<l8.a> aVar8, ht.a<j8.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, c8.e eVar, j8.d dVar, x xVar, Executor executor, k8.b bVar, l8.a aVar, l8.a aVar2, j8.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f20384a.get(), this.b.get(), this.f20385c.get(), this.f20386d.get(), this.f20387e.get(), this.f20388f.get(), this.f20389g.get(), this.f20390h.get(), this.f20391i.get());
    }
}
