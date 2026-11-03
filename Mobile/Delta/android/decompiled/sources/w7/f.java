package w7;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b.r f34006a = null;
    public e b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34007c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g.b f34008d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34009e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g.b f34010f = null;

    public f a(String str) {
        this.f34006a = new b(b.u.RenderOptions).d(str);
        return this;
    }

    public boolean b() {
        b.r rVar = this.f34006a;
        return rVar != null && rVar.f() > 0;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean d() {
        return this.f34007c != null;
    }

    public boolean e() {
        return this.f34009e != null;
    }

    public boolean f() {
        return this.f34008d != null;
    }

    public boolean g() {
        return this.f34010f != null;
    }

    public f h(float f10, float f11, float f12, float f13) {
        this.f34010f = new g.b(f10, f11, f12, f13);
        return this;
    }
}
