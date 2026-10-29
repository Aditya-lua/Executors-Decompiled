package yn;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements ft.d<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.i<Context> f36013a;

    public s(ft.i<Context> iVar) {
        this.f36013a = iVar;
    }

    public static s a(ft.i<Context> iVar) {
        return new s(iVar);
    }

    public static r c(Context context) {
        return new r(context);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f36013a.get());
    }
}
