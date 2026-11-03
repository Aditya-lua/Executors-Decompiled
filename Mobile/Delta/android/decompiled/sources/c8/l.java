package c8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l implements d8.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.a<Context> f4833a;
    public final ft.a<i> b;

    public l(ft.a<Context> aVar, ft.a<i> aVar2) {
        this.f4833a = aVar;
        this.b = aVar2;
    }

    public static l a(ft.a<Context> aVar, ft.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f4833a.get(), this.b.get());
    }
}
