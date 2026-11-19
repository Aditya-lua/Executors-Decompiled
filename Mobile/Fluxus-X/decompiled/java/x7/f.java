package x7;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b.r f36290a = null;
    public e b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f36291c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g.b f36292d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f36293e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g.b f36294f = null;

    public f a(String str) {
        this.f36290a = new b(b.u.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        b.r rVar = this.f36290a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.f36291c != null;
    }

    public boolean e() {
        return this.f36293e != null;
    }

    public boolean f() {
        return this.f36292d != null;
    }

    public boolean g() {
        return this.f36294f != null;
    }

    public f h(float f10, float f11, float f12, float f13) {
        this.f36294f = new g.b(f10, f11, f12, f13);
        return this;
    }
}
