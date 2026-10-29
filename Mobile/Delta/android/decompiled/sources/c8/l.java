package c8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class l implements d8.b<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<Context> f4667a;
    public final ht.a<i> b;

    public l(ht.a<Context> aVar, ht.a<i> aVar2) {
        this.f4667a = aVar;
        this.b = aVar2;
    }

    public static l a(ht.a<Context> aVar, ht.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public k get() {
        return c(this.f4667a.get(), this.b.get());
    }
}
