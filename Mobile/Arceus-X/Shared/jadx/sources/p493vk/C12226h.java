package p493vk;

import okhttp3.OkHttpClient;
import p231jv.InterfaceC7377e;
import p607zk.C13832l;
import p607zk.InterfaceC13821a;
import p607zk.InterfaceC13822b;
import p607zk.InterfaceC13823c;
import p607zk.InterfaceC13824d;
import p607zk.InterfaceC13825e;
import p607zk.InterfaceC13826f;
import p607zk.InterfaceC13827g;
import p607zk.InterfaceC13828h;
import p607zk.InterfaceC13829i;
import p607zk.InterfaceC13830j;
import p607zk.InterfaceC13831k;
import p607zk.InterfaceC13833m;
import p607zk.InterfaceC13834n;

/* JADX INFO: renamed from: vk.h */
/* JADX INFO: loaded from: classes2.dex */
public class C12226h implements InterfaceC12222d {

    /* JADX INFO: renamed from: a */
    public InterfaceC13831k f43099a;

    /* JADX INFO: renamed from: b */
    public InterfaceC13824d f43100b;

    /* JADX INFO: renamed from: c */
    public InterfaceC13825e f43101c;

    /* JADX INFO: renamed from: d */
    public InterfaceC13828h f43102d;

    /* JADX INFO: renamed from: e */
    public InterfaceC13830j f43103e;

    /* JADX INFO: renamed from: f */
    public InterfaceC13829i f43104f;

    /* JADX INFO: renamed from: g */
    public InterfaceC13827g f43105g;

    /* JADX INFO: renamed from: h */
    public InterfaceC13826f f43106h;

    /* JADX INFO: renamed from: i */
    public InterfaceC13834n f43107i;

    /* JADX INFO: renamed from: j */
    public InterfaceC13822b f43108j;

    /* JADX INFO: renamed from: k */
    public InterfaceC13823c f43109k;

    /* JADX INFO: renamed from: l */
    public InterfaceC13821a f43110l;

    /* JADX INFO: renamed from: m */
    public InterfaceC13833m f43111m;

    /* JADX INFO: renamed from: n */
    public OkHttpClient f43112n;

    /* JADX INFO: renamed from: o */
    public InterfaceC7377e.a f43113o;

    public C12226h(OkHttpClient okHttpClient, InterfaceC7377e.a aVar) {
        this.f43112n = okHttpClient;
        this.f43113o = aVar;
    }

    @Override // p493vk.InterfaceC12222d
    /* JADX INFO: renamed from: a */
    public InterfaceC13828h mo45315a() {
        InterfaceC13828h interfaceC13828h = this.f43102d;
        if (interfaceC13828h != null) {
            return interfaceC13828h;
        }
        throw new RuntimeException("Metrics interface not initialized");
    }

    @Override // p493vk.InterfaceC12222d
    /* JADX INFO: renamed from: b */
    public InterfaceC13826f mo45316b() {
        InterfaceC13826f interfaceC13826f = this.f43106h;
        if (interfaceC13826f != null) {
            return interfaceC13826f;
        }
        throw new RuntimeException("Friends interface not initialized");
    }

    @Override // p493vk.InterfaceC12222d
    /* JADX INFO: renamed from: c */
    public InterfaceC13829i mo45317c(C12220b c12220b) {
        if (this.f43104f == null) {
            this.f43104f = (InterfaceC13829i) new C13832l("apis", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13829i.class);
        }
        return this.f43104f;
    }

    @Override // p493vk.InterfaceC12222d
    /* JADX INFO: renamed from: d */
    public InterfaceC13831k mo45318d() {
        InterfaceC13831k interfaceC13831k = this.f43099a;
        if (interfaceC13831k != null) {
            return interfaceC13831k;
        }
        throw new RuntimeException("PlatformChat interface not initialized");
    }

    @Override // p493vk.InterfaceC12222d
    /* JADX INFO: renamed from: e */
    public InterfaceC13833m mo45319e() {
        InterfaceC13833m interfaceC13833m = this.f43111m;
        if (interfaceC13833m != null) {
            return interfaceC13833m;
        }
        throw new RuntimeException("Thumbnails interface not initialized");
    }

    @Override // p493vk.InterfaceC12222d
    /* JADX INFO: renamed from: f */
    public InterfaceC13827g mo45320f(OkHttpClient okHttpClient) {
        InterfaceC13827g interfaceC13827g = (InterfaceC13827g) new C13832l("locale", C12225g.m45325c().f43087a).m50328f(okHttpClient).m50327e(this.f43113o).m50323a(InterfaceC13827g.class);
        if (interfaceC13827g != null) {
            return interfaceC13827g;
        }
        throw new RuntimeException("Locale interface not initialized");
    }

    @Override // p493vk.InterfaceC12222d
    /* JADX INFO: renamed from: g */
    public InterfaceC13830j mo45321g() {
        InterfaceC13830j interfaceC13830j = this.f43103e;
        if (interfaceC13830j != null) {
            return interfaceC13830j;
        }
        throw new RuntimeException("Notifications interface not initialized");
    }

    @Override // p493vk.InterfaceC12222d
    /* JADX INFO: renamed from: h */
    public InterfaceC13822b mo45322h() {
        InterfaceC13822b interfaceC13822b = this.f43108j;
        if (interfaceC13822b != null) {
            return interfaceC13822b;
        }
        throw new RuntimeException("AccountSettings interface not initialized");
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC12222d m45333i(C12220b c12220b) {
        if (this.f43099a == null) {
            this.f43099a = (InterfaceC13831k) new C13832l("apis", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13831k.class);
        }
        if (this.f43100b == null) {
            this.f43100b = (InterfaceC13824d) new C13832l("chat", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13824d.class);
        }
        if (this.f43101c == null) {
            this.f43101c = (InterfaceC13825e) new C13832l("clientsettings.api", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13825e.class);
        }
        if (this.f43102d == null) {
            this.f43102d = (InterfaceC13828h) new C13832l("metrics", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13828h.class);
        }
        if (this.f43103e == null) {
            this.f43103e = (InterfaceC13830j) new C13832l("notifications", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13830j.class);
        }
        if (this.f43105g == null) {
            this.f43105g = (InterfaceC13827g) new C13832l("locale", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13827g.class);
        }
        if (this.f43106h == null) {
            this.f43106h = (InterfaceC13826f) new C13832l("friends", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13826f.class);
        }
        if (this.f43107i == null) {
            this.f43107i = (InterfaceC13834n) new C13832l("translations", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13834n.class);
        }
        if (this.f43108j == null) {
            this.f43108j = (InterfaceC13822b) new C13832l("accountsettings", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13822b.class);
        }
        if (this.f43109k == null) {
            this.f43109k = (InterfaceC13823c) new C13832l("auth", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13823c.class);
        }
        if (this.f43110l == null) {
            this.f43110l = (InterfaceC13821a) new C13832l("accountinformation", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13821a.class);
        }
        if (this.f43111m == null) {
            this.f43111m = (InterfaceC13833m) new C13832l("thumbnails", c12220b.f43087a).m50328f(this.f43112n).m50327e(this.f43113o).m50323a(InterfaceC13833m.class);
        }
        return this;
    }
}
