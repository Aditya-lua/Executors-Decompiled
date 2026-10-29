package ag;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public static d f544a = a().a();

    public static abstract class a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract a b(String str);

        @NonNull
        public abstract a c(long j10);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(String str);

        @NonNull
        public abstract a f(String str);

        @NonNull
        public abstract a g(@NonNull c.a aVar);

        @NonNull
        public abstract a h(long j10);
    }

    @NonNull
    public static a a() {
        return new ag.a.b().h(0L).g(c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    @NonNull
    public abstract c.a g();

    public abstract long h();

    public boolean i() {
        return g() == c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == c.a.NOT_GENERATED || g() == c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == c.a.REGISTERED;
    }

    public boolean l() {
        return g() == c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == c.a.ATTEMPT_MIGRATION;
    }

    @NonNull
    public abstract a n();

    @NonNull
    public d o(@NonNull String str, long j10, long j11) {
        return n().b(str).c(j10).h(j11).a();
    }

    @NonNull
    public d p() {
        return n().b(null).a();
    }

    @NonNull
    public d q(@NonNull String str) {
        return n().e(str).g(c.a.REGISTER_ERROR).a();
    }

    @NonNull
    public d r() {
        return n().g(c.a.NOT_GENERATED).a();
    }

    @NonNull
    public d s(@NonNull String str, @NonNull String str2, long j10, String str3, long j11) {
        return n().d(str).g(c.a.REGISTERED).b(str3).f(str2).c(j11).h(j10).a();
    }

    @NonNull
    public d t(@NonNull String str) {
        return n().d(str).g(c.a.UNREGISTERED).a();
    }
}
