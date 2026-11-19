package c8;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements e8.b<Executor> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f4922a = new k();
    }

    public static k a() {
        return a.f4922a;
    }

    public static Executor b() {
        return (Executor) e8.d.c(j.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // yt.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
