package ck;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f4937a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4938c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4939d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4940e;

    public d(String str, int i10) {
        this.f4937a = str;
        this.b = i10;
    }

    public void a(String str) {
        this.f4938c = str;
    }

    public void b(boolean z10) {
        this.f4939d = z10;
    }

    public String toString() {
        return String.format("TCP Response for Address:Port -> %s:%s\nSuccessful: %s\nResponse Code: %s\nResponse Message: %s", this.f4937a, Integer.valueOf(this.b), Boolean.valueOf(this.f4939d), Integer.valueOf(this.f4940e), this.f4938c);
    }
}
