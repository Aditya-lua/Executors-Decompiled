package xo;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements dt.d<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f36065a;

    public o(n nVar) {
        this.f36065a = nVar;
    }

    public static Application a(n nVar) {
        return (Application) dt.h.e(nVar.a());
    }

    public static o b(n nVar) {
        return new o(nVar);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return a(this.f36065a);
    }
}
