package zo;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements ft.d<k6.s> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f37946a;
    public final ft.i<Context> b;

    public q(n nVar, ft.i<Context> iVar) {
        this.f37946a = nVar;
        this.b = iVar;
    }

    public static q a(n nVar, ft.i<Context> iVar) {
        return new q(nVar, iVar);
    }

    public static k6.s c(n nVar, Context context) {
        return (k6.s) ft.h.e(nVar.c(context));
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k6.s get() {
        return c(this.f37946a, this.b.get());
    }
}
