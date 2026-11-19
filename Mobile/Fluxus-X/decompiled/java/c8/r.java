package c8;

/* JADX INFO: loaded from: classes.dex */
public final class r<T> implements z7.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f4928a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z7.c f4929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z7.g<T, byte[]> f4930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f4931e;

    public r(o oVar, String str, z7.c cVar, z7.g<T, byte[]> gVar, s sVar) {
        this.f4928a = oVar;
        this.b = str;
        this.f4929c = cVar;
        this.f4930d = gVar;
        this.f4931e = sVar;
    }

    public static /* synthetic */ void b(Exception exc) {
    }

    @Override // z7.h
    public void a(z7.d<T> dVar) {
        c(dVar, new z7.j() { // from class: c8.q
            @Override // z7.j
            public final void a(Exception exc) {
                r.b(exc);
            }
        });
    }

    public void c(z7.d<T> dVar, z7.j jVar) {
        this.f4931e.a(n.a().e(this.f4928a).c(dVar).f(this.b).d(this.f4930d).b(this.f4929c).a(), jVar);
    }
}
