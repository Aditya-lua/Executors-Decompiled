package zo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements ft.d<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f37944a;

    public p(n nVar) {
        this.f37944a = nVar;
    }

    public static Context a(n nVar) {
        return (Context) ft.h.e(nVar.b());
    }

    public static p b(n nVar) {
        return new p(nVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return a(this.f37944a);
    }
}
