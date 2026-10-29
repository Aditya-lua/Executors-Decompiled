package b8;

/* JADX INFO: loaded from: classes.dex */
public final class r<T> implements y7.h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f4045a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y7.c f4046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y7.g<T, byte[]> f4047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f4048e;

    public r(o oVar, String str, y7.c cVar, y7.g<T, byte[]> gVar, s sVar) {
        this.f4045a = oVar;
        this.b = str;
        this.f4046c = cVar;
        this.f4047d = gVar;
        this.f4048e = sVar;
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
        this.f4048e.a(n.a().e(this.f4045a).c(dVar).f(this.b).d(this.f4047d).b(this.f4046c).a(), jVar);
    }
}
