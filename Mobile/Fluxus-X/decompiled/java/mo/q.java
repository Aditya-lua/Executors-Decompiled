package mo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements wt.d<p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f23424a;

    public q(wt.i<Context> iVar) {
        this.f23424a = iVar;
    }

    public static q a(wt.i<Context> iVar) {
        return new q(iVar);
    }

    public static p c(Context context) {
        return new p(context);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public p get() {
        return c(this.f23424a.get());
    }
}
