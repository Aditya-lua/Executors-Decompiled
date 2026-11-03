package j8;

/* JADX INFO: loaded from: classes.dex */
public final class j implements d8.b<e> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f21699a = new j();
    }

    public static j a() {
        return a.f21699a;
    }

    public static e c() {
        return (e) d8.d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ft.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c();
    }
}
