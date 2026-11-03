package bp;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dt.d<co.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4361a;
    public final dt.i<i> b;

    public f(c cVar, dt.i<i> iVar) {
        this.f4361a = cVar;
        this.b = iVar;
    }

    public static f a(c cVar, dt.i<i> iVar) {
        return new f(cVar, iVar);
    }

    public static co.a b(c cVar, i iVar) {
        return (co.a) dt.h.e(cVar.c(iVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public co.a get() {
        return b(this.f4361a, this.b.get());
    }
}
