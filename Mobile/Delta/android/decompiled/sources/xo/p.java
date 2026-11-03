package xo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements dt.d<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f36067a;

    public p(n nVar) {
        this.f36067a = nVar;
    }

    public static Context a(n nVar) {
        return (Context) dt.h.e(nVar.b());
    }

    public static p b(n nVar) {
        return new p(nVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return a(this.f36067a);
    }
}
