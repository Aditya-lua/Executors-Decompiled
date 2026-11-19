package zq;

import av.p0;
import wt.h;
import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements wt.d<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f39432a;
    public final i<a> b;

    public d(c cVar, i<a> iVar) {
        this.f39432a = cVar;
        this.b = iVar;
    }

    public static p0 a(c cVar, a aVar) {
        return (p0) h.e(cVar.a(aVar));
    }

    public static d b(c cVar, i<a> iVar) {
        return new d(cVar, iVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return a(this.f39432a, this.b.get());
    }
}
