package np;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements wt.d<l6.s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f26387a;
    public final wt.i<Context> b;

    public q(n nVar, wt.i<Context> iVar) {
        this.f26387a = nVar;
        this.b = iVar;
    }

    public static q a(n nVar, wt.i<Context> iVar) {
        return new q(nVar, iVar);
    }

    public static l6.s c(n nVar, Context context) {
        return (l6.s) wt.h.e(nVar.c(context));
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l6.s get() {
        return c(this.f26387a, this.b.get());
    }
}
