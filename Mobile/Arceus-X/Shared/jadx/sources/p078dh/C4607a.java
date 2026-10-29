package p078dh;

/* JADX INFO: renamed from: dh.a */
/* JADX INFO: loaded from: classes2.dex */
public class C4607a {

    /* JADX INFO: renamed from: a */
    public long f18870a;

    /* JADX INFO: renamed from: b */
    public String f18871b;

    /* JADX INFO: renamed from: c */
    public String f18872c;

    /* JADX INFO: renamed from: d */
    public String f18873d;

    public C4607a(long j10, String str) {
        this.f18870a = j10;
        this.f18871b = str == null ? "" : str;
        this.f18872c = "";
        this.f18873d = "";
    }

    /* JADX INFO: renamed from: a */
    public String m22747a() {
        return this.f18873d;
    }

    /* JADX INFO: renamed from: b */
    public long m22748b() {
        return this.f18870a;
    }

    /* JADX INFO: renamed from: c */
    public String m22749c() {
        return this.f18872c;
    }

    /* JADX INFO: renamed from: d */
    public String m22750d() {
        String str = this.f18871b;
        if (str != null) {
            return str;
        }
        return "User " + m22748b();
    }

    /* JADX INFO: renamed from: e */
    public void m22751e(String str) {
        this.f18873d = str;
    }

    /* JADX INFO: renamed from: f */
    public void m22752f(long j10) {
        this.f18870a = j10;
    }

    /* JADX INFO: renamed from: g */
    public void m22753g(String str) {
        this.f18872c = str;
    }

    /* JADX INFO: renamed from: h */
    public void m22754h(String str) {
        this.f18871b = str;
    }

    /* JADX INFO: renamed from: i */
    public void m22755i(C4607a c4607a) {
        if (c4607a == this) {
            return;
        }
        if (this.f18870a != c4607a.m22748b() && c4607a.m22748b() != -1) {
            m22752f(c4607a.m22748b());
        }
        if (!this.f18871b.equals(c4607a.m22750d()) && !c4607a.m22750d().isEmpty()) {
            m22754h(c4607a.m22750d());
        }
        if (!this.f18872c.equals(c4607a.m22749c()) && !c4607a.m22749c().isEmpty()) {
            m22753g(c4607a.m22749c());
        }
        if (this.f18873d.equals(c4607a.m22747a()) || c4607a.m22747a().isEmpty()) {
            return;
        }
        m22751e(c4607a.m22747a());
    }
}
