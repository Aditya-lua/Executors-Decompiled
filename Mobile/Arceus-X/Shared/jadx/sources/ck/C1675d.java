package ck;

/* JADX INFO: renamed from: ck.d */
/* JADX INFO: loaded from: classes2.dex */
public class C1675d {

    /* JADX INFO: renamed from: a */
    public String f6445a;

    /* JADX INFO: renamed from: b */
    public int f6446b;

    /* JADX INFO: renamed from: c */
    public String f6447c = null;

    /* JADX INFO: renamed from: d */
    public boolean f6448d = true;

    /* JADX INFO: renamed from: e */
    public int f6449e;

    public C1675d(String str, int i10) {
        this.f6445a = str;
        this.f6446b = i10;
    }

    /* JADX INFO: renamed from: a */
    public void m8384a(String str) {
        this.f6447c = str;
    }

    /* JADX INFO: renamed from: b */
    public void m8385b(boolean z10) {
        this.f6448d = z10;
    }

    public String toString() {
        return String.format("TCP Response for Address:Port -> %s:%s\nSuccessful: %s\nResponse Code: %s\nResponse Message: %s", this.f6445a, Integer.valueOf(this.f6446b), Boolean.valueOf(this.f6448d), Integer.valueOf(this.f6449e), this.f6447c);
    }
}
