package m8;

/* JADX INFO: loaded from: classes.dex */
public final class d implements e8.b<m8.a> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22969a = new d();
    }

    public static d a() {
        return a.f22969a;
    }

    public static m8.a c() {
        return (m8.a) e8.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // yt.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m8.a get() {
        return c();
    }
}
