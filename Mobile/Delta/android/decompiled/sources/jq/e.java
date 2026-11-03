package jq;

import dt.h;
import iu.l0;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements dt.d<l0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f22186a;

    public e(c cVar) {
        this.f22186a = cVar;
    }

    public static e a(c cVar) {
        return new e(cVar);
    }

    public static l0 c(c cVar) {
        return (l0) h.e(cVar.b());
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.f22186a);
    }
}
