package mi;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f23258a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23261e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23263g;
    public String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23259c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f23260d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23262f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f23264h = BuildConfig.FLAVOR;

    public enum a {
        GET,
        POST
    }

    public String a() {
        String str = this.b;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int b() {
        return this.f23261e;
    }

    public void c(String str) {
        this.f23264h = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public String e() {
        return this.f23259c;
    }

    public String toString() {
        return "HTTP Response for URL: " + this.f23259c + "\nRequest Type: " + this.f23258a + "\nResponse Body: " + this.b + "\nResponse Code: " + this.f23261e;
    }
}
