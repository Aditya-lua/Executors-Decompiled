package lq;

import ft.h;
import ku.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements ft.d<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f23534a;

    public f(c cVar) {
        this.f23534a = cVar;
    }

    public static f a(c cVar) {
        return new f(cVar);
    }

    public static l0 c(c cVar) {
        return (l0) h.e(cVar.c());
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f23534a);
    }
}
