package b8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements d8.b<Executor> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f4039a = new k();
    }

    public static k a() {
        return a.f4039a;
    }

    public static Executor b() {
        return (Executor) d8.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // ht.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
