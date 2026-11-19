package c8;

/* JADX INFO: loaded from: classes.dex */
public final class v implements e8.b<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<m8.a> f4936a;
    public final yt.a<m8.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt.a<i8.e> f4937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yt.a<j8.r> f4938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yt.a<j8.v> f4939e;

    public v(yt.a<m8.a> aVar, yt.a<m8.a> aVar2, yt.a<i8.e> aVar3, yt.a<j8.r> aVar4, yt.a<j8.v> aVar5) {
        this.f4936a = aVar;
        this.b = aVar2;
        this.f4937c = aVar3;
        this.f4938d = aVar4;
        this.f4939e = aVar5;
    }

    public static v a(yt.a<m8.a> aVar, yt.a<m8.a> aVar2, yt.a<i8.e> aVar3, yt.a<j8.r> aVar4, yt.a<j8.v> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(m8.a aVar, m8.a aVar2, i8.e eVar, j8.r rVar, j8.v vVar) {
        return new t(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f4936a.get(), this.b.get(), this.f4937c.get(), this.f4938d.get(), this.f4939e.get());
    }
}
