package wp;

import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements ft.d<Interceptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f34483a;
    public final ft.i<c> b;

    public g(f fVar, ft.i<c> iVar) {
        this.f34483a = fVar;
        this.b = iVar;
    }

    public static g a(f fVar, ft.i<c> iVar) {
        return new g(fVar, iVar);
    }

    public static Interceptor c(f fVar, c cVar) {
        return (Interceptor) ft.h.e(fVar.b(cVar));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Interceptor get() {
        return c(this.f34483a, this.b.get());
    }
}
