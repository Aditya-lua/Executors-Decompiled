package vk;

import okhttp3.OkHttpClient;
import zk.j;
import zk.k;
import zk.l;
import zk.m;
import zk.n;

/* JADX INFO: loaded from: classes2.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f33281a;
    public zk.d b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zk.e f33282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public zk.h f33283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f33284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zk.i f33285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zk.g f33286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zk.f f33287h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f33288i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public zk.b f33289j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public zk.c f33290k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public zk.a f33291l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public m f33292m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public OkHttpClient f33293n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public jv.e.a f33294o;

    public h(OkHttpClient okHttpClient, jv.e.a aVar) {
        this.f33293n = okHttpClient;
        this.f33294o = aVar;
    }

    @Override // vk.d
    public zk.h a() {
        zk.h hVar = this.f33283d;
        if (hVar != null) {
            return hVar;
        }
        throw new RuntimeException("Metrics interface not initialized");
    }

    @Override // vk.d
    public zk.f b() {
        zk.f fVar = this.f33287h;
        if (fVar != null) {
            return fVar;
        }
        throw new RuntimeException("Friends interface not initialized");
    }

    @Override // vk.d
    public zk.i c(b bVar) {
        if (this.f33285f == null) {
            this.f33285f = (zk.i) new l("apis", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(zk.i.class);
        }
        return this.f33285f;
    }

    @Override // vk.d
    public k d() {
        k kVar = this.f33281a;
        if (kVar != null) {
            return kVar;
        }
        throw new RuntimeException("PlatformChat interface not initialized");
    }

    @Override // vk.d
    public m e() {
        m mVar = this.f33292m;
        if (mVar != null) {
            return mVar;
        }
        throw new RuntimeException("Thumbnails interface not initialized");
    }

    @Override // vk.d
    public zk.g f(OkHttpClient okHttpClient) {
        zk.g gVar = (zk.g) new l("locale", g.c().f33272a).f(okHttpClient).e(this.f33294o).a(zk.g.class);
        if (gVar != null) {
            return gVar;
        }
        throw new RuntimeException("Locale interface not initialized");
    }

    @Override // vk.d
    public j g() {
        j jVar = this.f33284e;
        if (jVar != null) {
            return jVar;
        }
        throw new RuntimeException("Notifications interface not initialized");
    }

    @Override // vk.d
    public zk.b h() {
        zk.b bVar = this.f33289j;
        if (bVar != null) {
            return bVar;
        }
        throw new RuntimeException("AccountSettings interface not initialized");
    }

    public d i(b bVar) {
        if (this.f33281a == null) {
            this.f33281a = (k) new l("apis", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(k.class);
        }
        if (this.b == null) {
            this.b = (zk.d) new l("chat", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(zk.d.class);
        }
        if (this.f33282c == null) {
            this.f33282c = (zk.e) new l("clientsettings.api", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(zk.e.class);
        }
        if (this.f33283d == null) {
            this.f33283d = (zk.h) new l("metrics", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(zk.h.class);
        }
        if (this.f33284e == null) {
            this.f33284e = (j) new l("notifications", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(j.class);
        }
        if (this.f33286g == null) {
            this.f33286g = (zk.g) new l("locale", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(zk.g.class);
        }
        if (this.f33287h == null) {
            this.f33287h = (zk.f) new l("friends", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(zk.f.class);
        }
        if (this.f33288i == null) {
            this.f33288i = (n) new l("translations", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(n.class);
        }
        if (this.f33289j == null) {
            this.f33289j = (zk.b) new l("accountsettings", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(zk.b.class);
        }
        if (this.f33290k == null) {
            this.f33290k = (zk.c) new l("auth", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(zk.c.class);
        }
        if (this.f33291l == null) {
            this.f33291l = (zk.a) new l("accountinformation", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(zk.a.class);
        }
        if (this.f33292m == null) {
            this.f33292m = (m) new l("thumbnails", bVar.f33272a).f(this.f33293n).e(this.f33294o).a(m.class);
        }
        return this;
    }
}
