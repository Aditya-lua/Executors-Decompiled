package cg;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: cg.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1667f {

    /* JADX INFO: renamed from: cg.f$a */
    public static abstract class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public abstract AbstractC1667f mo8339a();

        @NonNull
        /* JADX INFO: renamed from: b */
        public abstract a mo8340b(@NonNull b bVar);

        @NonNull
        /* JADX INFO: renamed from: c */
        public abstract a mo8341c(@NonNull String str);

        @NonNull
        /* JADX INFO: renamed from: d */
        public abstract a mo8342d(long j10);
    }

    /* JADX INFO: renamed from: cg.f$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static a m8370a() {
        return new C1663b.b().mo8342d(0L);
    }

    /* JADX INFO: renamed from: b */
    public abstract b mo8336b();

    /* JADX INFO: renamed from: c */
    public abstract String mo8337c();

    @NonNull
    /* JADX INFO: renamed from: d */
    public abstract long mo8338d();
}
