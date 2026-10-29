package ei;

import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f15581a;
    public int b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15582c = 5;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f15583a = new k();
    }

    public static k a() {
        return a.f15583a;
    }

    public OkHttpClient b() {
        if (this.f15581a == null) {
            this.f15581a = new wk.c(null, this.b, this.f15582c, vk.g.e()).a();
        }
        return this.f15581a;
    }
}
