package zq;

import av.l0;
import wt.h;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements wt.d<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f39433a;

    public e(c cVar) {
        this.f39433a = cVar;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    public static l0 c(c cVar) {
        return (l0) h.e(cVar.b());
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f39433a);
    }
}
