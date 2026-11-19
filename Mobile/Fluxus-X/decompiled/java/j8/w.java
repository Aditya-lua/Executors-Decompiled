package j8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w implements e8.b<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<Executor> f20199a;
    public final yt.a<k8.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt.a<x> f20200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yt.a<l8.b> f20201d;

    public w(yt.a<Executor> aVar, yt.a<k8.d> aVar2, yt.a<x> aVar3, yt.a<l8.b> aVar4) {
        this.f20199a = aVar;
        this.b = aVar2;
        this.f20200c = aVar3;
        this.f20201d = aVar4;
    }

    public static w a(yt.a<Executor> aVar, yt.a<k8.d> aVar2, yt.a<x> aVar3, yt.a<l8.b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, k8.d dVar, x xVar, l8.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f20199a.get(), this.b.get(), this.f20200c.get(), this.f20201d.get());
    }
}
