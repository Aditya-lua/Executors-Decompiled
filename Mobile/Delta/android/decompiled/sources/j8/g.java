package j8;

/* JADX INFO: loaded from: classes.dex */
public final class g implements d8.b<String> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f21121a = new g();
    }

    public static g a() {
        return a.f21121a;
    }

    public static String b() {
        return (String) d8.d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
