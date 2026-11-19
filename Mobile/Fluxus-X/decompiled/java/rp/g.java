package rp;

import androidx.p000lifecycle.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements wt.d<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f30840a;

    public g(c cVar) {
        this.f30840a = cVar;
    }

    public static g a(c cVar) {
        return new g(cVar);
    }

    public static l0 c(c cVar) {
        return (l0) wt.h.e(cVar.getSavedStateHandle());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f30840a);
    }
}
