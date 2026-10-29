package l8;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d8.b<l8.a> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f22983a = new c();
    }

    public static c a() {
        return a.f22983a;
    }

    public static l8.a b() {
        return (l8.a) d8.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public l8.a get() {
        return b();
    }
}
