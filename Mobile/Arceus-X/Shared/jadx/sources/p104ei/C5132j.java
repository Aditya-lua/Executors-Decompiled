package p104ei;

/* JADX INFO: renamed from: ei.j */
/* JADX INFO: loaded from: classes2.dex */
public class C5132j {

    /* JADX INFO: renamed from: a */
    public a f19999a;

    /* JADX INFO: renamed from: e */
    public int f20003e;

    /* JADX INFO: renamed from: g */
    public boolean f20005g;

    /* JADX INFO: renamed from: b */
    public String f20000b = null;

    /* JADX INFO: renamed from: c */
    public String f20001c = null;

    /* JADX INFO: renamed from: d */
    public byte[] f20002d = null;

    /* JADX INFO: renamed from: f */
    public long f20004f = 0;

    /* JADX INFO: renamed from: h */
    public String f20006h = "";

    /* JADX INFO: renamed from: ei.j$a */
    public enum a {
        GET,
        POST
    }

    /* JADX INFO: renamed from: a */
    public String m23932a() {
        String str = this.f20000b;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: b */
    public int m23933b() {
        return this.f20003e;
    }

    /* JADX INFO: renamed from: c */
    public void m23934c(String str) {
        this.f20006h = str;
    }

    /* JADX INFO: renamed from: d */
    public void m23935d(String str) {
        this.f20000b = str;
    }

    /* JADX INFO: renamed from: e */
    public String m23936e() {
        return this.f20001c;
    }

    public String toString() {
        return "HTTP Response for URL: " + this.f20001c + "\nRequest Type: " + this.f19999a + "\nResponse Body: " + this.f20000b + "\nResponse Code: " + this.f20003e;
    }
}
