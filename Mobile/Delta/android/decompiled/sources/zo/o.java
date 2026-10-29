package zo;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements ft.d<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f37942a;

    public o(n nVar) {
        this.f37942a = nVar;
    }

    public static Application a(n nVar) {
        return (Application) ft.h.e(nVar.a());
    }

    public static o b(n nVar) {
        return new o(nVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return a(this.f37942a);
    }
}
