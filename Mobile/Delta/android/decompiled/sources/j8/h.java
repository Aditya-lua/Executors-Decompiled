package j8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d8.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<Context> f21122a;

    public h(ht.a<Context> aVar) {
        this.f21122a = aVar;
    }

    public static h a(ht.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) d8.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f21122a.get());
    }
}
