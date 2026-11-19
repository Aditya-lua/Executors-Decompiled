package np;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements wt.d<Context> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f26385a;

    public p(n nVar) {
        this.f26385a = nVar;
    }

    public static Context a(n nVar) {
        return (Context) wt.h.e(nVar.b());
    }

    public static p b(n nVar) {
        return new p(nVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return a(this.f26385a);
    }
}
