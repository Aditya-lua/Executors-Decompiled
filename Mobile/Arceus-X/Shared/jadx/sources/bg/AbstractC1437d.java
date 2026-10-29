package bg;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: bg.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1437d {

    /* JADX INFO: renamed from: a */
    @NonNull
    public static AbstractC1437d f5633a = m7424a().mo7402a();

    /* JADX INFO: renamed from: bg.d$a */
    public static abstract class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public abstract AbstractC1437d mo7402a();

        @NonNull
        /* JADX INFO: renamed from: b */
        public abstract a mo7403b(String str);

        @NonNull
        /* JADX INFO: renamed from: c */
        public abstract a mo7404c(long j10);

        @NonNull
        /* JADX INFO: renamed from: d */
        public abstract a mo7405d(@NonNull String str);

        @NonNull
        /* JADX INFO: renamed from: e */
        public abstract a mo7406e(String str);

        @NonNull
        /* JADX INFO: renamed from: f */
        public abstract a mo7407f(String str);

        @NonNull
        /* JADX INFO: renamed from: g */
        public abstract a mo7408g(@NonNull C1436c.a aVar);

        @NonNull
        /* JADX INFO: renamed from: h */
        public abstract a mo7409h(long j10);
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m7424a() {
        return new C1434a.b().mo7409h(0L).mo7408g(C1436c.a.ATTEMPT_MIGRATION).mo7404c(0L);
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo7394b();

    /* JADX INFO: renamed from: c */
    public abstract long mo7395c();

    /* JADX INFO: renamed from: d */
    public abstract String mo7396d();

    /* JADX INFO: renamed from: e */
    public abstract String mo7397e();

    /* JADX INFO: renamed from: f */
    public abstract String mo7398f();

    @NonNull
    /* JADX INFO: renamed from: g */
    public abstract C1436c.a mo7399g();

    /* JADX INFO: renamed from: h */
    public abstract long mo7400h();

    /* JADX INFO: renamed from: i */
    public boolean m7425i() {
        return mo7399g() == C1436c.a.REGISTER_ERROR;
    }

    /* JADX INFO: renamed from: j */
    public boolean m7426j() {
        return mo7399g() == C1436c.a.NOT_GENERATED || mo7399g() == C1436c.a.ATTEMPT_MIGRATION;
    }

    /* JADX INFO: renamed from: k */
    public boolean m7427k() {
        return mo7399g() == C1436c.a.REGISTERED;
    }

    /* JADX INFO: renamed from: l */
    public boolean m7428l() {
        return mo7399g() == C1436c.a.UNREGISTERED;
    }

    /* JADX INFO: renamed from: m */
    public boolean m7429m() {
        return mo7399g() == C1436c.a.ATTEMPT_MIGRATION;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public abstract a mo7401n();

    @NonNull
    /* JADX INFO: renamed from: o */
    public AbstractC1437d m7430o(@NonNull String str, long j10, long j11) {
        return mo7401n().mo7403b(str).mo7404c(j10).mo7409h(j11).mo7402a();
    }

    @NonNull
    /* JADX INFO: renamed from: p */
    public AbstractC1437d m7431p() {
        return mo7401n().mo7403b(null).mo7402a();
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public AbstractC1437d m7432q(@NonNull String str) {
        return mo7401n().mo7406e(str).mo7408g(C1436c.a.REGISTER_ERROR).mo7402a();
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public AbstractC1437d m7433r() {
        return mo7401n().mo7408g(C1436c.a.NOT_GENERATED).mo7402a();
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public AbstractC1437d m7434s(@NonNull String str, @NonNull String str2, long j10, String str3, long j11) {
        return mo7401n().mo7405d(str).mo7408g(C1436c.a.REGISTERED).mo7403b(str3).mo7407f(str2).mo7404c(j11).mo7409h(j10).mo7402a();
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public AbstractC1437d m7435t(@NonNull String str) {
        return mo7401n().mo7405d(str).mo7408g(C1436c.a.UNREGISTERED).mo7402a();
    }
}
