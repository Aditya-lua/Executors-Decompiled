package mo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements wt.d<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wt.i<Context> f23428a;
    public final wt.i<m> b;

    public u(wt.i<Context> iVar, wt.i<m> iVar2) {
        this.f23428a = iVar;
        this.b = iVar2;
    }

    public static u a(wt.i<Context> iVar, wt.i<m> iVar2) {
        return new u(iVar, iVar2);
    }

    public static t c(Context context, m mVar) {
        return new t(context, mVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f23428a.get(), this.b.get());
    }
}
