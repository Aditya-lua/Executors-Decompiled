package ch;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4968a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4970d;

    public a(long j10, String str) {
        this.f4968a = j10;
        this.b = str == null ? "" : str;
        this.f4969c = "";
        this.f4970d = "";
    }

    public String a() {
        return this.f4970d;
    }

    public long b() {
        return this.f4968a;
    }

    public String c() {
        return this.f4969c;
    }

    public String d() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        return "User " + b();
    }

    public void e(String str) {
        this.f4970d = str;
    }

    public void f(long j10) {
        this.f4968a = j10;
    }

    public void g(String str) {
        this.f4969c = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(a aVar) {
        if (aVar == this) {
            return;
        }
        if (this.f4968a != aVar.b() && aVar.b() != -1) {
            f(aVar.b());
        }
        if (!this.b.equals(aVar.d()) && !aVar.d().isEmpty()) {
            h(aVar.d());
        }
        if (!this.f4969c.equals(aVar.c()) && !aVar.c().isEmpty()) {
            g(aVar.c());
        }
        if (this.f4970d.equals(aVar.a()) || aVar.a().isEmpty()) {
            return;
        }
        e(aVar.a());
    }
}
