package ak;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f582a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f583c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f584d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f585e;

    public d(String str, int i10) {
        this.f582a = str;
        this.b = i10;
    }

    public void a(String str) {
        this.f583c = str;
    }

    public void b(boolean z10) {
        this.f584d = z10;
    }

    public String toString() {
        return String.format("TCP Response for Address:Port -> %s:%s\nSuccessful: %s\nResponse Code: %s\nResponse Message: %s", this.f582a, Integer.valueOf(this.b), Boolean.valueOf(this.f584d), Integer.valueOf(this.f585e), this.f583c);
    }
}
