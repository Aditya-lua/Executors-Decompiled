package i8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w implements d8.b<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<Executor> f20397a;
    public final ht.a<j8.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht.a<x> f20398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.a<k8.b> f20399d;

    public w(ht.a<Executor> aVar, ht.a<j8.d> aVar2, ht.a<x> aVar3, ht.a<k8.b> aVar4) {
        this.f20397a = aVar;
        this.b = aVar2;
        this.f20398c = aVar3;
        this.f20399d = aVar4;
    }

    public static w a(ht.a<Executor> aVar, ht.a<j8.d> aVar2, ht.a<x> aVar3, ht.a<k8.b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, j8.d dVar, x xVar, k8.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f20397a.get(), this.b.get(), this.f20398c.get(), this.f20399d.get());
    }
}
