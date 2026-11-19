package i8;

/* JADX INFO: loaded from: classes.dex */
public final class g implements e8.b<j8.f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yt.a<m8.a> f19287a;

    public g(yt.a<m8.a> aVar) {
        this.f19287a = aVar;
    }

    public static j8.f a(m8.a aVar) {
        return (j8.f) e8.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(yt.a<m8.a> aVar) {
        return new g(aVar);
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public j8.f get() {
        return a(this.f19287a.get());
    }
}
