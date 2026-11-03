package bp;

import androidx.p000lifecycle.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements dt.d<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f4362a;

    public g(c cVar) {
        this.f4362a = cVar;
    }

    public static g a(c cVar) {
        return new g(cVar);
    }

    public static l0 c(c cVar) {
        return (l0) dt.h.e(cVar.getSavedStateHandle());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f4362a);
    }
}
