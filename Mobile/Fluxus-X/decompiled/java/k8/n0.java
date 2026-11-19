package k8;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements e8.b<m0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<m8.a> f21186a;
    public final yt.a<m8.a> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yt.a<e> f21187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yt.a<t0> f21188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yt.a<String> f21189e;

    public n0(yt.a<m8.a> aVar, yt.a<m8.a> aVar2, yt.a<e> aVar3, yt.a<t0> aVar4, yt.a<String> aVar5) {
        this.f21186a = aVar;
        this.b = aVar2;
        this.f21187c = aVar3;
        this.f21188d = aVar4;
        this.f21189e = aVar5;
    }

    public static n0 a(yt.a<m8.a> aVar, yt.a<m8.a> aVar2, yt.a<e> aVar3, yt.a<t0> aVar4, yt.a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(m8.a aVar, m8.a aVar2, Object obj, Object obj2, yt.a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 get() {
        return c(this.f21186a.get(), this.b.get(), this.f21187c.get(), this.f21188d.get(), this.f21189e);
    }
}
