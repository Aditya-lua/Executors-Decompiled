package h8;

import i8.x;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements d8.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.a<Executor> f19213a;
    public final ft.a<c8.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.a<x> f19214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.a<j8.d> f19215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.a<k8.b> f19216e;

    public d(ft.a<Executor> aVar, ft.a<c8.e> aVar2, ft.a<x> aVar3, ft.a<j8.d> aVar4, ft.a<k8.b> aVar5) {
        this.f19213a = aVar;
        this.b = aVar2;
        this.f19214c = aVar3;
        this.f19215d = aVar4;
        this.f19216e = aVar5;
    }

    public static d a(ft.a<Executor> aVar, ft.a<c8.e> aVar2, ft.a<x> aVar3, ft.a<j8.d> aVar4, ft.a<k8.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, c8.e eVar, x xVar, j8.d dVar, k8.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f19213a.get(), this.b.get(), this.f19214c.get(), this.f19215d.get(), this.f19216e.get());
    }
}
