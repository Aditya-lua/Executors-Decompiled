package ei;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f15572a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15575e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15577g;
    public String b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f15573c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f15574d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15576f = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f15578h = "";

    public enum a {
        GET,
        POST
    }

    public String a() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public int b() {
        return this.f15575e;
    }

    public void c(String str) {
        this.f15578h = str;
    }

    public void d(String str) {
        this.b = str;
    }

    public String e() {
        return this.f15573c;
    }

    public String toString() {
        return "HTTP Response for URL: " + this.f15573c + "\nRequest Type: " + this.f15572a + "\nResponse Body: " + this.b + "\nResponse Code: " + this.f15575e;
    }
}
