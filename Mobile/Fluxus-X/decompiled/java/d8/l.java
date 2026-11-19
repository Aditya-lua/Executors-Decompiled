package d8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l implements e8.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<Context> f11978a;
    public final yt.a<i> b;

    public l(yt.a<Context> aVar, yt.a<i> aVar2) {
        this.f11978a = aVar;
        this.b = aVar2;
    }

    public static l a(yt.a<Context> aVar, yt.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f11978a.get(), this.b.get());
    }
}
