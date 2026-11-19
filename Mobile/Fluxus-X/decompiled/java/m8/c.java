package m8;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e8.b<m8.a> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f22968a = new c();
    }

    public static c a() {
        return a.f22968a;
    }

    public static m8.a b() {
        return (m8.a) e8.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public m8.a get() {
        return b();
    }
}
