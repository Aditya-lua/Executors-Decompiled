package b8;

/* JADX INFO: loaded from: classes.dex */
public final class r<T> implements y7.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f3943a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y7.c f3944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y7.g<T, byte[]> f3945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f3946e;

    public r(o oVar, String str, y7.c cVar, y7.g<T, byte[]> gVar, s sVar) {
        this.f3943a = oVar;
        this.b = str;
        this.f3944c = cVar;
        this.f3945d = gVar;
        this.f3946e = sVar;
    }

    public static /* synthetic */ void b(Exception exc) {
    }

    @Override // y7.h
    public void a(y7.d<T> dVar) {
        c(dVar, new y7.j() { // from class: b8.q
            @Override // y7.j
            public final void a(Exception exc) {
                r.b(exc);
            }
        });
    }

    public void c(y7.d<T> dVar, y7.j jVar) {
        this.f3946e.a(n.a().e(this.f3943a).c(dVar).f(this.b).d(this.f3945d).b(this.f3944c).a(), jVar);
    }
}
