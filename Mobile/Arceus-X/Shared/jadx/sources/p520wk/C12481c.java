package p520wk;

import java.util.concurrent.TimeUnit;
import okhttp3.CookieJar;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p151gk.C6124q;
import p493vk.C12225g;
import p579yk.C13199a;
import p579yk.C13200b;

/* JADX INFO: renamed from: wk.c */
/* JADX INFO: loaded from: classes2.dex */
public class C12481c implements InterfaceC12484f {

    /* JADX INFO: renamed from: a */
    public CookieJar f44606a;

    /* JADX INFO: renamed from: b */
    public int f44607b;

    /* JADX INFO: renamed from: c */
    public int f44608c;

    /* JADX INFO: renamed from: d */
    public String f44609d;

    /* JADX INFO: renamed from: wk.c$a */
    public class a implements HttpLoggingInterceptor.Logger {
        public a() {
        }

        @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
        public void log(String str) {
            C6124q.m27057b("rbx.http", str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12481c() {
        this(null);
    }

    @Override // p520wk.InterfaceC12484f
    /* JADX INFO: renamed from: a */
    public OkHttpClient mo46742a() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(new a());
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(httpLoggingInterceptor);
        String str = this.f44609d;
        if (str != null) {
            builder.addNetworkInterceptor(new C13199a(str));
        }
        builder.addNetworkInterceptor(new C13200b());
        long j10 = this.f44607b;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        builder.connectTimeout(j10, timeUnit);
        builder.readTimeout(this.f44608c, timeUnit);
        CookieJar cookieJarM46781c = this.f44606a;
        if (cookieJarM46781c == null) {
            cookieJarM46781c = C12488j.m46781c();
        }
        builder.cookieJar(cookieJarM46781c);
        builder.followRedirects(false);
        return builder.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12481c(CookieJar cookieJar) {
        this(cookieJar, 30, 30, C12225g.m45327e());
    }

    public C12481c(CookieJar cookieJar, int i10, int i11, String str) {
        this.f44606a = cookieJar;
        this.f44607b = i10;
        this.f44608c = i11;
        this.f44609d = str;
    }
}
