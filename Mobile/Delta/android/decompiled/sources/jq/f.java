package jq;

import dt.h;
import iu.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements dt.d<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f22187a;

    public f(c cVar) {
        this.f22187a = cVar;
    }

    public static f a(c cVar) {
        return new f(cVar);
    }

    public static l0 c(c cVar) {
        return (l0) h.e(cVar.c());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f22187a);
    }
}
