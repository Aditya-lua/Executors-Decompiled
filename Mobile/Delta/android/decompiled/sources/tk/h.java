package tk;

import okhttp3.OkHttpClient;
import xk.j;
import xk.k;
import xk.l;
import xk.m;
import xk.n;

/* JADX INFO: loaded from: classes2.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f32416a;
    public xk.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xk.e f32417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public xk.h f32418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f32419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public xk.i f32420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public xk.g f32421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public xk.f f32422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f32423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xk.b f32424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public xk.c f32425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public xk.a f32426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f32427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OkHttpClient f32428n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public hv.e.a f32429o;

    public h(OkHttpClient okHttpClient, hv.e.a aVar) {
        this.f32428n = okHttpClient;
        this.f32429o = aVar;
    }

    @Override // tk.d
    public xk.h a() {
        xk.h hVar = this.f32418d;
        if (hVar != null) {
            return hVar;
        }
        throw new RuntimeException("Metrics interface not initialized");
    }

    @Override // tk.d
    public xk.f b() {
        xk.f fVar = this.f32422h;
        if (fVar != null) {
            return fVar;
        }
        throw new RuntimeException("Friends interface not initialized");
    }

    @Override // tk.d
    public k c() {
        k kVar = this.f32416a;
        if (kVar != null) {
            return kVar;
        }
        throw new RuntimeException("PlatformChat interface not initialized");
    }

    @Override // tk.d
    public m d() {
        m mVar = this.f32427m;
        if (mVar != null) {
            return mVar;
        }
        throw new RuntimeException("Thumbnails interface not initialized");
    }

    @Override // tk.d
    public xk.g e(OkHttpClient okHttpClient) {
        xk.g gVar = (xk.g) new l("locale", g.c().f32407a).f(okHttpClient).e(this.f32429o).a(xk.g.class);
        if (gVar != null) {
            return gVar;
        }
        throw new RuntimeException("Locale interface not initialized");
    }

    @Override // tk.d
    public j f() {
        j jVar = this.f32419e;
        if (jVar != null) {
            return jVar;
        }
        throw new RuntimeException("Notifications interface not initialized");
    }

    @Override // tk.d
    public xk.i g(b bVar) {
        if (this.f32420f == null) {
            this.f32420f = (xk.i) new l("apis", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(xk.i.class);
        }
        return this.f32420f;
    }

    @Override // tk.d
    public xk.b h() {
        xk.b bVar = this.f32424j;
        if (bVar != null) {
            return bVar;
        }
        throw new RuntimeException("AccountSettings interface not initialized");
    }

    public d i(b bVar) {
        if (this.f32416a == null) {
            this.f32416a = (k) new l("apis", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(k.class);
        }
        if (this.b == null) {
            this.b = (xk.d) new l("chat", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(xk.d.class);
        }
        if (this.f32417c == null) {
            this.f32417c = (xk.e) new l("clientsettings.api", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(xk.e.class);
        }
        if (this.f32418d == null) {
            this.f32418d = (xk.h) new l("metrics", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(xk.h.class);
        }
        if (this.f32419e == null) {
            this.f32419e = (j) new l("notifications", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(j.class);
        }
        if (this.f32421g == null) {
            this.f32421g = (xk.g) new l("locale", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(xk.g.class);
        }
        if (this.f32422h == null) {
            this.f32422h = (xk.f) new l("friends", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(xk.f.class);
        }
        if (this.f32423i == null) {
            this.f32423i = (n) new l("translations", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(n.class);
        }
        if (this.f32424j == null) {
            this.f32424j = (xk.b) new l("accountsettings", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(xk.b.class);
        }
        if (this.f32425k == null) {
            this.f32425k = (xk.c) new l("auth", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(xk.c.class);
        }
        if (this.f32426l == null) {
            this.f32426l = (xk.a) new l("accountinformation", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(xk.a.class);
        }
        if (this.f32427m == null) {
            this.f32427m = (m) new l("thumbnails", bVar.f32407a).f(this.f32428n).e(this.f32429o).a(m.class);
        }
        return this;
    }
}
