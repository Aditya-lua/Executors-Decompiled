package b8;

/* JADX INFO: loaded from: classes.dex */
public final class v implements d8.b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.a<l8.a> f3951a;
    public final ft.a<l8.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ft.a<h8.e> f3952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ft.a<i8.r> f3953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ft.a<i8.v> f3954e;

    public v(ft.a<l8.a> aVar, ft.a<l8.a> aVar2, ft.a<h8.e> aVar3, ft.a<i8.r> aVar4, ft.a<i8.v> aVar5) {
        this.f3951a = aVar;
        this.b = aVar2;
        this.f3952c = aVar3;
        this.f3953d = aVar4;
        this.f3954e = aVar5;
    }

    public static v a(ft.a<l8.a> aVar, ft.a<l8.a> aVar2, ft.a<h8.e> aVar3, ft.a<i8.r> aVar4, ft.a<i8.v> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(l8.a aVar, l8.a aVar2, h8.e eVar, i8.r rVar, i8.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f3951a.get(), this.b.get(), this.f3952c.get(), this.f3953d.get(), this.f3954e.get());
    }
}
