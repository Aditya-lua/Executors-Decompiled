package b8;

/* JADX INFO: loaded from: classes.dex */
public final class v implements d8.b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<l8.a> f4053a;
    public final ht.a<l8.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht.a<h8.e> f4054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.a<i8.r> f4055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ht.a<i8.v> f4056e;

    public v(ht.a<l8.a> aVar, ht.a<l8.a> aVar2, ht.a<h8.e> aVar3, ht.a<i8.r> aVar4, ht.a<i8.v> aVar5) {
        this.f4053a = aVar;
        this.b = aVar2;
        this.f4054c = aVar3;
        this.f4055d = aVar4;
        this.f4056e = aVar5;
    }

    public static v a(ht.a<l8.a> aVar, ht.a<l8.a> aVar2, ht.a<h8.e> aVar3, ht.a<i8.r> aVar4, ht.a<i8.v> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(l8.a aVar, l8.a aVar2, h8.e eVar, i8.r rVar, i8.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f4053a.get(), this.b.get(), this.f4054c.get(), this.f4055d.get(), this.f4056e.get());
    }
}
