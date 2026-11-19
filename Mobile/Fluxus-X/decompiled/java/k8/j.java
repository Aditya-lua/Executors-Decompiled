package k8;

/* JADX INFO: loaded from: classes.dex */
public final class j implements e8.b<e> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f21174a = new j();
    }

    public static j a() {
        return a.f21174a;
    }

    public static e c() {
        return (e) e8.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
