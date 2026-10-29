package a8;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    public static abstract class a {
        @NonNull
        public abstract m a();

        @NonNull
        public abstract a b(k kVar);

        @NonNull
        public abstract a c(List<l> list);

        @NonNull
        public abstract a d(Integer num);

        @NonNull
        public abstract a e(String str);

        @NonNull
        public abstract a f(p pVar);

        @NonNull
        public abstract a g(long j10);

        @NonNull
        public abstract a h(long j10);

        @NonNull
        public a i(int i10) {
            return d(Integer.valueOf(i10));
        }

        @NonNull
        public a j(@NonNull String str) {
            return e(str);
        }
    }

    @NonNull
    public static a a() {
        return new g.b();
    }

    public abstract k b();

    public abstract List<l> c();

    public abstract Integer d();

    public abstract String e();

    public abstract p f();

    public abstract long g();

    public abstract long h();
}
