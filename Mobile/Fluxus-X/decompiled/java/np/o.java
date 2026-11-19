package np;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements wt.d<Application> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f26384a;

    public o(n nVar) {
        this.f26384a = nVar;
    }

    public static Application a(n nVar) {
        return (Application) wt.h.e(nVar.a());
    }

    public static o b(n nVar) {
        return new o(nVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Application get() {
        return a(this.f26384a);
    }
}
