package dh;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14619a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14621d;

    public a(long j10, String str) {
        this.f14619a = j10;
        this.b = str == null ? "" : str;
        this.f14620c = "";
        this.f14621d = "";
    }

    public String a() {
        return this.f14621d;
    }

    public long b() {
        return this.f14619a;
    }

    public String c() {
        return this.f14620c;
    }

    public String d() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        return "User " + b();
    }

    public void e(String str) {
        this.f14621d = str;
    }

    public void f(long j10) {
        this.f14619a = j10;
    }

    public void g(String str) {
        this.f14620c = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(a aVar) {
        if (aVar == this) {
            return;
        }
        if (this.f14619a != aVar.b() && aVar.b() != -1) {
            f(aVar.b());
        }
        if (!this.b.equals(aVar.d()) && !aVar.d().isEmpty()) {
            h(aVar.d());
        }
        if (!this.f14620c.equals(aVar.c()) && !aVar.c().isEmpty()) {
            g(aVar.c());
        }
        if (this.f14621d.equals(aVar.a()) || aVar.a().isEmpty()) {
            return;
        }
        e(aVar.a());
    }
}
