package yn;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ft.d<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f35998a;
    public final ft.i<z> b;

    public f(e eVar, ft.i<z> iVar) {
        this.f35998a = eVar;
        this.b = iVar;
    }

    public static k a(e eVar, z zVar) {
        return (k) ft.h.e(eVar.a(zVar));
    }

    public static f b(e eVar, ft.i<z> iVar) {
        return new f(eVar, iVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k get() {
        return a(this.f35998a, this.b.get());
    }
}
