package up;

import okhttp3.Interceptor;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements dt.d<Interceptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f33167a;
    public final dt.i<c> b;

    public g(f fVar, dt.i<c> iVar) {
        this.f33167a = fVar;
        this.b = iVar;
    }

    public static g a(f fVar, dt.i<c> iVar) {
        return new g(fVar, iVar);
    }

    public static Interceptor c(f fVar, c cVar) {
        return (Interceptor) dt.h.e(fVar.b(cVar));
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Interceptor get() {
        return c(this.f33167a, this.b.get());
    }
}
