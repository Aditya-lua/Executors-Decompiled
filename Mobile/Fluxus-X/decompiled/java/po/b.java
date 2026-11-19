package po;

import wt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements wt.d<a.C0563a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<c> f29247a;

    public b(i<c> iVar) {
        this.f29247a = iVar;
    }

    public static b a(i<c> iVar) {
        return new b(iVar);
    }

    public static a.C0563a c(c cVar) {
        return new a.C0563a(cVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0563a get() {
        return c(this.f29247a.get());
    }
}
