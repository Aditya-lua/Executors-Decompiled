package z0;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public static abstract class a {
        public abstract e a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    public static a a() {
        return new z0.a.b().e("0.0").c("0.0").d(BuildConfig.FLAVOR).b(BuildConfig.FLAVOR);
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
