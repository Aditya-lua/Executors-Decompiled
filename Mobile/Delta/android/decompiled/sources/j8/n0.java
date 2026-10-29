package j8;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements d8.b<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<l8.a> f21138a;
    public final ht.a<l8.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht.a<e> f21139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ht.a<t0> f21140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ht.a<String> f21141e;

    public n0(ht.a<l8.a> aVar, ht.a<l8.a> aVar2, ht.a<e> aVar3, ht.a<t0> aVar4, ht.a<String> aVar5) {
        this.f21138a = aVar;
        this.b = aVar2;
        this.f21139c = aVar3;
        this.f21140d = aVar4;
        this.f21141e = aVar5;
    }

    public static n0 a(ht.a<l8.a> aVar, ht.a<l8.a> aVar2, ht.a<e> aVar3, ht.a<t0> aVar4, ht.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(l8.a aVar, l8.a aVar2, Object obj, Object obj2, ht.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f21138a.get(), this.b.get(), this.f21139c.get(), this.f21140d.get(), this.f21141e);
    }
}
