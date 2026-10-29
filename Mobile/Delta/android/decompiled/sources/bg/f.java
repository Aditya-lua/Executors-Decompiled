package bg;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    public static abstract class a {
        @NonNull
        public abstract f a();

        @NonNull
        public abstract a b(@NonNull b bVar);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(long j10);
    }

    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @NonNull
    public static a a() {
        return new bg.b.C0082b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    @NonNull
    public abstract long d();
}
