package i8;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements d8.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.a<Context> f20500a;
    public final ft.a<c8.e> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.a<j8.d> f20501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.a<x> f20502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.a<Executor> f20503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ft.a<k8.b> f20504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ft.a<l8.a> f20505g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ft.a<l8.a> f20506h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ft.a<j8.c> f20507i;

    public s(ft.a<Context> aVar, ft.a<c8.e> aVar2, ft.a<j8.d> aVar3, ft.a<x> aVar4, ft.a<Executor> aVar5, ft.a<k8.b> aVar6, ft.a<l8.a> aVar7, ft.a<l8.a> aVar8, ft.a<j8.c> aVar9) {
        this.f20500a = aVar;
        this.b = aVar2;
        this.f20501c = aVar3;
        this.f20502d = aVar4;
        this.f20503e = aVar5;
        this.f20504f = aVar6;
        this.f20505g = aVar7;
        this.f20506h = aVar8;
        this.f20507i = aVar9;
    }

    public static s a(ft.a<Context> aVar, ft.a<c8.e> aVar2, ft.a<j8.d> aVar3, ft.a<x> aVar4, ft.a<Executor> aVar5, ft.a<k8.b> aVar6, ft.a<l8.a> aVar7, ft.a<l8.a> aVar8, ft.a<j8.c> aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, c8.e eVar, j8.d dVar, x xVar, Executor executor, k8.b bVar, l8.a aVar, l8.a aVar2, j8.c cVar) {
        return new r(context, eVar, dVar, xVar, executor, bVar, aVar, aVar2, cVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f20500a.get(), this.b.get(), this.f20501c.get(), this.f20502d.get(), this.f20503e.get(), this.f20504f.get(), this.f20505g.get(), this.f20506h.get(), this.f20507i.get());
    }
}
