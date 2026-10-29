package h8;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d8.b<i8.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ht.a<l8.a> f18730a;

    public g(ht.a<l8.a> aVar) {
        this.f18730a = aVar;
    }

    public static i8.f a(l8.a aVar) {
        return (i8.f) d8.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(ht.a<l8.a> aVar) {
        return new g(aVar);
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i8.f get() {
        return a(this.f18730a.get());
    }
}
