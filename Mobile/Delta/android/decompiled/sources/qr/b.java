package qr;

import ft.d;
import ft.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d<a.C0521a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<c> f29620a;

    public b(i<c> iVar) {
        this.f29620a = iVar;
    }

    public static b a(i<c> iVar) {
        return new b(iVar);
    }

    public static a.C0521a c(c cVar) {
        return new a.C0521a(cVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0521a get() {
        return c(this.f29620a.get());
    }
}
