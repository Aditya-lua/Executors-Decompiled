package l8;

/* JADX INFO: loaded from: classes.dex */
public final class d implements d8.b<l8.a> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22984a = new d();
    }

    public static d a() {
        return a.f22984a;
    }

    public static l8.a c() {
        return (l8.a) d8.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ht.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l8.a get() {
        return c();
    }
}
