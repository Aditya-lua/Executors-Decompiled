package mh;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f23242a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f23243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f23244d;

    public a(long j10, String str) {
        this.f23242a = j10;
        this.b = str == null ? BuildConfig.FLAVOR : str;
        this.f23243c = BuildConfig.FLAVOR;
        this.f23244d = BuildConfig.FLAVOR;
    }

    public String a() {
        return this.f23244d;
    }

    public long b() {
        return this.f23242a;
    }

    public String c() {
        return this.f23243c;
    }

    public String d() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        return "User " + b();
    }

    public void e(String str) {
        this.f23244d = str;
    }

    public void f(long j10) {
        this.f23242a = j10;
    }

    public void g(String str) {
        this.f23243c = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(a aVar) {
        if (aVar == this) {
            return;
        }
        if (this.f23242a != aVar.b() && aVar.b() != -1) {
            f(aVar.b());
        }
        if (!this.b.equals(aVar.d()) && !aVar.d().isEmpty()) {
            h(aVar.d());
        }
        if (!this.f23243c.equals(aVar.c()) && !aVar.c().isEmpty()) {
            g(aVar.c());
        }
        if (this.f23244d.equals(aVar.a()) || aVar.a().isEmpty()) {
            return;
        }
        e(aVar.a());
    }
}
