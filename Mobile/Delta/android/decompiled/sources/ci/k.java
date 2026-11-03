package ci;

import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OkHttpClient f4993a;
    public int b = 5;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4994c = 5;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f4995a = new k();
    }

    public static k a() {
        return a.f4995a;
    }

    public OkHttpClient b() {
        if (this.f4993a == null) {
            this.f4993a = new uk.c(null, this.b, this.f4994c, tk.g.e()).a();
        }
        return this.f4993a;
    }
}
