package b8;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    public static abstract class a {
        @NonNull
        public abstract k a();

        @NonNull
        public abstract a b(b8.a aVar);

        @NonNull
        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3743a;

        b(int i10) {
            this.f3743a = i10;
        }
    }

    @NonNull
    public static a a() {
        return new e.b();
    }

    public abstract b8.a b();

    public abstract b c();
}
