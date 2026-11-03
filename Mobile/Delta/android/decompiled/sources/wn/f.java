package wn;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dt.d<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f34627a;
    public final dt.i<z> b;

    public f(e eVar, dt.i<z> iVar) {
        this.f34627a = eVar;
        this.b = iVar;
    }

    public static k a(e eVar, z zVar) {
        return (k) dt.h.e(eVar.a(zVar));
    }

    public static f b(e eVar, dt.i<z> iVar) {
        return new f(eVar, iVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k get() {
        return a(this.f34627a, this.b.get());
    }
}
