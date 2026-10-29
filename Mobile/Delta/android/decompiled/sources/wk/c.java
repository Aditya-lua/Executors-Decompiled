package wk;

import gk.p;
import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: loaded from: classes2.dex */
public class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CookieJar f34405a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f34407d;

    public class a implements HttpLoggingInterceptor.Logger {
        public a() {
        }

        @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
        public void log(String str) {
            p.b("rbx.http", str);
        }
    }

    public c() {
        this(null);
    }

    @Override // wk.f
    public OkHttpClient a() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new a());
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(httpLoggingInterceptor);
        String str = this.f34407d;
        if (str != null) {
            builder.addNetworkInterceptor(new yk.a(str));
        }
        builder.addNetworkInterceptor(new yk.b());
        long j10 = this.b;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(j10, timeUnit);
        builder.readTimeout(this.f34406c, timeUnit);
        CookieJar cookieJarC = this.f34405a;
        if (cookieJarC == null) {
            cookieJarC = j.c();
        }
        builder.cookieJar(cookieJarC);
        builder.followRedirects(false);
        return builder.build();
    }

    public c(CookieJar cookieJar) {
        this(cookieJar, 30, 30, vk.g.e());
    }

    public c(CookieJar cookieJar, int i10, int i11, String str) {
        this.f34405a = cookieJar;
        this.b = i10;
        this.f34406c = i11;
        this.f34407d = str;
    }
}
