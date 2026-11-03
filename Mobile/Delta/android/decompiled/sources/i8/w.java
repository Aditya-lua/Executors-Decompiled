package i8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w implements d8.b<v> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.a<Executor> f20513a;
    public final ft.a<j8.d> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.a<x> f20514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.a<k8.b> f20515d;

    public w(ft.a<Executor> aVar, ft.a<j8.d> aVar2, ft.a<x> aVar3, ft.a<k8.b> aVar4) {
        this.f20513a = aVar;
        this.b = aVar2;
        this.f20514c = aVar3;
        this.f20515d = aVar4;
    }

    public static w a(ft.a<Executor> aVar, ft.a<j8.d> aVar2, ft.a<x> aVar3, ft.a<k8.b> aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, j8.d dVar, x xVar, k8.b bVar) {
        return new v(executor, dVar, xVar, bVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c(this.f20513a.get(), this.b.get(), this.f20514c.get(), this.f20515d.get());
    }
}
