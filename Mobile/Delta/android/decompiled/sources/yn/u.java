package yn;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements ft.d<t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f36015a;
    public final ft.i<m> b;

    public u(ft.i<Context> iVar, ft.i<m> iVar2) {
        this.f36015a = iVar;
        this.b = iVar2;
    }

    public static u a(ft.i<Context> iVar, ft.i<m> iVar2) {
        return new u(iVar, iVar2);
    }

    public static t c(Context context, m mVar) {
        return new t(context, mVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t get() {
        return c(this.f36015a.get(), this.b.get());
    }
}
