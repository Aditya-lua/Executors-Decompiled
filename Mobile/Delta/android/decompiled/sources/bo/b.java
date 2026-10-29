package bo;

import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ft.d<a.C0086a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<c> f4287a;

    public b(i<c> iVar) {
        this.f4287a = iVar;
    }

    public static b a(i<c> iVar) {
        return new b(iVar);
    }

    public static a.C0086a c(c cVar) {
        return new a.C0086a(cVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0086a get() {
        return c(this.f4287a.get());
    }
}
