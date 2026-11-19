package kk;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f21465a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f21466c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21467d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21468e;

    public d(String str, int i10) {
        this.f21465a = str;
        this.b = i10;
    }

    public void a(String str) {
        this.f21466c = str;
    }

    public void b(boolean z10) {
        this.f21467d = z10;
    }

    public String toString() {
        return String.format("TCP Response for Address:Port -> %s:%s\nSuccessful: %s\nResponse Code: %s\nResponse Message: %s", this.f21465a, Integer.valueOf(this.b), Boolean.valueOf(this.f21467d), Integer.valueOf(this.f21468e), this.f21466c);
    }
}
