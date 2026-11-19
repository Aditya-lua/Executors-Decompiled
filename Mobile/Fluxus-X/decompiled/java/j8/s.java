package j8;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements e8.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<Context> f20186a;
    public final yt.a<d8.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt.a<k8.d> f20187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yt.a<x> f20188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yt.a<Executor> f20189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yt.a<l8.b> f20190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yt.a<m8.a> f20191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yt.a<m8.a> f20192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yt.a<k8.c> f20193i;

    public s(yt.a<Context> aVar, yt.a<d8.e> aVar2, yt.a<k8.d> aVar3, yt.a<x> aVar4, yt.a<Executor> aVar5, yt.a<l8.b> aVar6, yt.a<m8.a> aVar7, yt.a<m8.a> aVar8, yt.a<k8.c> aVar9) {
        this.f20186a = aVar;
        this.b = aVar2;
        this.f20187c = aVar3;
        this.f20188d = aVar4;
        this.f20189e = aVar5;
        this.f20190f = aVar6;
        this.f20191g = aVar7;
        this.f20192h = aVar8;
        this.f20193i = aVar9;
    }

    public static s a(yt.a<Context> aVar, yt.a<d8.e> aVar2, yt.a<k8.d> aVar3, yt.a<x> aVar4, yt.a<Executor> aVar5, yt.a<l8.b> aVar6, yt.a<m8.a> aVar7, yt.a<m8.a> aVar8, yt.a<k8.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, d8.e eVar, k8.d dVar, x xVar, Executor executor, l8.b bVar, m8.a aVar, m8.a aVar2, k8.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f20186a.get(), this.b.get(), this.f20187c.get(), this.f20188d.get(), this.f20189e.get(), this.f20190f.get(), this.f20191g.get(), this.f20192h.get(), this.f20193i.get());
    }
}
