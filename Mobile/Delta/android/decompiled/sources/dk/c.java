package dk;

import androidx.p000lifecycle.a0;
import androidx.p000lifecycle.d0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ml.a f14983k = ml.a.LIGHT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f14984a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f14986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f14987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f14988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0<ml.a> f14992j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f14993a = new c();
    }

    public static c c() {
        return a.f14993a;
    }

    public void a() {
        this.b = 0;
        this.f14989g = 0;
        this.f14987e = "";
        this.f14985c = null;
        this.f14988f = true;
        v(-1L);
        u(f14983k);
    }

    public String b() {
        String str = this.f14987e;
        return (str == null || str.equals("null")) ? "" : this.f14987e;
    }

    public int d() {
        return this.f14990h;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.f14989g;
    }

    public ml.a g() {
        ml.a aVarF = this.f14992j.f();
        return aVarF != null ? aVarF : f14983k;
    }

    public a0<ml.a> h() {
        return this.f14992j;
    }

    public String i() {
        return g().toString();
    }

    public long j() {
        return this.f14984a;
    }

    public String k() {
        String str = this.f14986d;
        return (str == null || str.equals("null")) ? "" : this.f14986d;
    }

    public boolean l() {
        return this.f14991i;
    }

    public void m() {
        if (this.f14992j.f() == null) {
            u(f14983k);
        }
    }

    public boolean n() {
        return this.f14988f;
    }

    public void o(String str) {
        this.f14987e = str;
    }

    public void p(boolean z10) {
        this.f14991i = z10;
    }

    public void q(boolean z10) {
        this.f14988f = z10;
    }

    public void r(int i10) {
        this.f14990h = i10;
    }

    public void s(int i10) {
        this.b = i10;
    }

    public void t(int i10) {
        this.f14989g = i10;
    }

    public void u(ml.a aVar) {
        this.f14992j.o(aVar);
    }

    public void v(long j10) {
        this.f14984a = j10;
        e.f14994a.c(j10);
    }

    public void w(String str) {
        this.f14986d = str;
    }

    public c() {
        this.f14984a = -1L;
        this.f14988f = true;
        this.f14992j = new d0<>();
    }
}
