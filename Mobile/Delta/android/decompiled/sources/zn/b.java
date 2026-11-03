package zn;

import dt.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements dt.d<a.C0693a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i<c> f38214a;

    public b(i<c> iVar) {
        this.f38214a = iVar;
    }

    public static b a(i<c> iVar) {
        return new b(iVar);
    }

    public static a.C0693a c(c cVar) {
        return new a.C0693a(cVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0693a get() {
        return c(this.f38214a.get());
    }
}
