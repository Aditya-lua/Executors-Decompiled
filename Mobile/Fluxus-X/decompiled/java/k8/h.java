package k8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class h implements e8.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<Context> f21170a;

    public h(yt.a<Context> aVar) {
        this.f21170a = aVar;
    }

    public static h a(yt.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) e8.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f21170a.get());
    }
}
