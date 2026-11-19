package mo;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements wt.d<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f23411a;
    public final wt.i<z> b;

    public f(e eVar, wt.i<z> iVar) {
        this.f23411a = eVar;
        this.b = iVar;
    }

    public static k a(e eVar, z zVar) {
        return (k) wt.h.e(eVar.a(zVar));
    }

    public static f b(e eVar, wt.i<z> iVar) {
        return new f(eVar, iVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public k get() {
        return a(this.f23411a, this.b.get());
    }
}
