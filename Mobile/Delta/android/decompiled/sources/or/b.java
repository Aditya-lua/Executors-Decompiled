package or;

import dt.d;
import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d<a.C0489a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<c> f28164a;

    public b(i<c> iVar) {
        this.f28164a = iVar;
    }

    public static b a(i<c> iVar) {
        return new b(iVar);
    }

    public static a.C0489a c(c cVar) {
        return new a.C0489a(cVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0489a get() {
        return c(this.f28164a.get());
    }
}
