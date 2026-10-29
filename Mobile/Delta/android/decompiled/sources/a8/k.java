package a8;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    public static abstract class a {
        @NonNull
        public abstract k a();

        @NonNull
        public abstract a b(a8.a aVar);

        @NonNull
        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f206a;

        b(int i10) {
            this.f206a = i10;
        }
    }

    @NonNull
    public static a a() {
        return new e.b();
    }

    public abstract a8.a b();

    public abstract b c();
}
