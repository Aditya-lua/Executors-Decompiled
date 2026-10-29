package lq;

import ft.h;
import ft.i;
import ku.p0;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements ft.d<p0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f23532a;
    public final i<a> b;

    public d(c cVar, i<a> iVar) {
        this.f23532a = cVar;
        this.b = iVar;
    }

    public static p0 a(c cVar, a aVar) {
        return (p0) h.e(cVar.a(aVar));
    }

    public static d b(c cVar, i<a> iVar) {
        return new d(cVar, iVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public p0 get() {
        return a(this.f23532a, this.b.get());
    }
}
