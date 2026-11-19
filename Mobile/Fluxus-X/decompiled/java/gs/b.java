package gs;

import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements wt.d<a.C0332a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<c> f17922a;

    public b(i<c> iVar) {
        this.f17922a = iVar;
    }

    public static b a(i<c> iVar) {
        return new b(iVar);
    }

    public static a.C0332a c(c cVar) {
        return new a.C0332a(cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0332a get() {
        return c(this.f17922a.get());
    }
}
