package w7;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b.r f33800a = null;
    public e b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33801c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g.b f33802d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33803e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g.b f33804f = null;

    public f a(String str) {
        this.f33800a = new b(b.u.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        b.r rVar = this.f33800a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.f33801c != null;
    }

    public boolean e() {
        return this.f33803e != null;
    }

    public boolean f() {
        return this.f33802d != null;
    }

    public boolean g() {
        return this.f33804f != null;
    }

    public f h(float f10, float f11, float f12, float f13) {
        this.f33804f = new g.b(f10, f11, f12, f13);
        return this;
    }
}
