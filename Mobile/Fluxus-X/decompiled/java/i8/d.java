package i8;

import j8.x;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e8.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<Executor> f19283a;
    public final yt.a<d8.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt.a<x> f19284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yt.a<k8.d> f19285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yt.a<l8.b> f19286e;

    public d(yt.a<Executor> aVar, yt.a<d8.e> aVar2, yt.a<x> aVar3, yt.a<k8.d> aVar4, yt.a<l8.b> aVar5) {
        this.f19283a = aVar;
        this.b = aVar2;
        this.f19284c = aVar3;
        this.f19285d = aVar4;
        this.f19286e = aVar5;
    }

    public static d a(yt.a<Executor> aVar, yt.a<d8.e> aVar2, yt.a<x> aVar3, yt.a<k8.d> aVar4, yt.a<l8.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, d8.e eVar, x xVar, k8.d dVar, l8.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f19283a.get(), this.b.get(), this.f19284c.get(), this.f19285d.get(), this.f19286e.get());
    }
}
