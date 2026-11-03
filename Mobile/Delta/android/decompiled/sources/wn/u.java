package wn;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements dt.d<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dt.i<Context> f34644a;
    public final dt.i<m> b;

    public u(dt.i<Context> iVar, dt.i<m> iVar2) {
        this.f34644a = iVar;
        this.b = iVar2;
    }

    public static u a(dt.i<Context> iVar, dt.i<m> iVar2) {
        return new u(iVar, iVar2);
    }

    public static t c(Context context, m mVar) {
        return new t(context, mVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f34644a.get(), this.b.get());
    }
}
