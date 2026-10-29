package h8;

import i8.x;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements d8.b<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<Executor> f18726a;
    public final ht.a<c8.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht.a<x> f18727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.a<j8.d> f18728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ht.a<k8.b> f18729e;

    public d(ht.a<Executor> aVar, ht.a<c8.e> aVar2, ht.a<x> aVar3, ht.a<j8.d> aVar4, ht.a<k8.b> aVar5) {
        this.f18726a = aVar;
        this.b = aVar2;
        this.f18727c = aVar3;
        this.f18728d = aVar4;
        this.f18729e = aVar5;
    }

    public static d a(ht.a<Executor> aVar, ht.a<c8.e> aVar2, ht.a<x> aVar3, ht.a<j8.d> aVar4, ht.a<k8.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, c8.e eVar, x xVar, j8.d dVar, k8.b bVar) {
        return new c(executor, eVar, xVar, dVar, bVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.f18726a.get(), this.b.get(), this.f18727c.get(), this.f18728d.get(), this.f18729e.get());
    }
}
