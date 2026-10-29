package a8;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    public static abstract class a {
        @NonNull
        public abstract l a();

        @NonNull
        public abstract a b(Integer num);

        @NonNull
        public abstract a c(long j10);

        @NonNull
        public abstract a d(long j10);

        @NonNull
        public abstract a e(o oVar);

        @NonNull
        public abstract a f(byte[] bArr);

        @NonNull
        public abstract a g(String str);

        @NonNull
        public abstract a h(long j10);
    }

    public static a a() {
        return new f.b();
    }

    @NonNull
    public static a i(@NonNull String str) {
        return a().g(str);
    }

    @NonNull
    public static a j(@NonNull byte[] bArr) {
        return a().f(bArr);
    }

    public abstract Integer b();

    public abstract long c();

    public abstract long d();

    public abstract o e();

    public abstract byte[] f();

    public abstract String g();

    public abstract long h();
}
