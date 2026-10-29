package yn;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements ft.d<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f36011a;

    public q(ft.i<Context> iVar) {
        this.f36011a = iVar;
    }

    public static q a(ft.i<Context> iVar) {
        return new q(iVar);
    }

    public static p c(Context context) {
        return new p(context);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f36011a.get());
    }
}
