package j8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class h implements d8.b<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ft.a<Context> f21695a;

    public h(ft.a<Context> aVar) {
        this.f21695a = aVar;
    }

    public static h a(ft.a<Context> aVar) {
        return new h(aVar);
    }

    public static String c(Context context) {
        return (String) d8.d.c(f.b(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get() {
        return c(this.f21695a.get());
    }
}
