package ci;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f4984a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4987e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4989g;
    public String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4985c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f4986d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4988f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4990h = "";

    public enum a {
        GET,
        POST
    }

    public String a() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public int b() {
        return this.f4987e;
    }

    public void c(String str) {
        this.f4990h = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public String e() {
        return this.f4985c;
    }

    public String toString() {
        return "HTTP Response for URL: " + this.f4985c + "\nRequest Type: " + this.f4984a + "\nResponse Body: " + this.b + "\nResponse Code: " + this.f4987e;
    }
}
