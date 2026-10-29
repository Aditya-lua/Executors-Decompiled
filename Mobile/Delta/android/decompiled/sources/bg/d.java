package bg;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    public static abstract class a {
        @NonNull
        public abstract d a();

        @NonNull
        public abstract a b(@NonNull f fVar);

        @NonNull
        public abstract a c(@NonNull String str);

        @NonNull
        public abstract a d(@NonNull String str);

        @NonNull
        public abstract a e(@NonNull b bVar);

        @NonNull
        public abstract a f(@NonNull String str);
    }

    public enum b {
        OK,
        BAD_CONFIG
    }

    @NonNull
    public static a a() {
        return new bg.a.b();
    }

    public abstract f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
