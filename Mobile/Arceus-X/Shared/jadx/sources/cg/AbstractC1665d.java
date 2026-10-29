package cg;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: cg.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1665d {

    /* JADX INFO: renamed from: cg.d$a */
    public static abstract class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public abstract AbstractC1665d mo8330a();

        @NonNull
        /* JADX INFO: renamed from: b */
        public abstract a mo8331b(@NonNull AbstractC1667f abstractC1667f);

        @NonNull
        /* JADX INFO: renamed from: c */
        public abstract a mo8332c(@NonNull String str);

        @NonNull
        /* JADX INFO: renamed from: d */
        public abstract a mo8333d(@NonNull String str);

        @NonNull
        /* JADX INFO: renamed from: e */
        public abstract a mo8334e(@NonNull b bVar);

        @NonNull
        /* JADX INFO: renamed from: f */
        public abstract a mo8335f(@NonNull String str);
    }

    /* JADX INFO: renamed from: cg.d$b */
    public enum b {
        OK,
        BAD_CONFIG
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m8362a() {
        return new C1662a.b();
    }

    /* JADX INFO: renamed from: b */
    public abstract AbstractC1667f mo8325b();

    /* JADX INFO: renamed from: c */
    public abstract String mo8326c();

    /* JADX INFO: renamed from: d */
    public abstract String mo8327d();

    /* JADX INFO: renamed from: e */
    public abstract b mo8328e();

    /* JADX INFO: renamed from: f */
    public abstract String mo8329f();
}
