package nk;

import androidx.p000lifecycle.a0;
import androidx.p000lifecycle.d0;
import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final cm.a f25799k = cm.a.LIGHT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f25800a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f25801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f25802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25803e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25804f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25805g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25806h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0<cm.a> f25808j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f25809a = new c();
    }

    public static c c() {
        return a.f25809a;
    }

    public void a() {
        this.b = 0;
        this.f25805g = 0;
        this.f25803e = BuildConfig.FLAVOR;
        this.f25801c = null;
        this.f25804f = true;
        v(-1L);
        u(f25799k);
    }

    public String b() {
        String str = this.f25803e;
        return (str == null || str.equals("null")) ? BuildConfig.FLAVOR : this.f25803e;
    }

    public int d() {
        return this.f25806h;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.f25805g;
    }

    public cm.a g() {
        cm.a aVarF = this.f25808j.f();
        return aVarF != null ? aVarF : f25799k;
    }

    public a0<cm.a> h() {
        return this.f25808j;
    }

    public String i() {
        return g().toString();
    }

    public long j() {
        return this.f25800a;
    }

    public String k() {
        String str = this.f25802d;
        return (str == null || str.equals("null")) ? BuildConfig.FLAVOR : this.f25802d;
    }

    public boolean l() {
        return this.f25807i;
    }

    public void m() {
        if (this.f25808j.f() == null) {
            u(f25799k);
        }
    }

    public boolean n() {
        return this.f25804f;
    }

    public void o(String str) {
        this.f25803e = str;
    }

    public void p(boolean z10) {
        this.f25807i = z10;
    }

    public void q(boolean z10) {
        this.f25804f = z10;
    }

    public void r(int i10) {
        this.f25806h = i10;
    }

    public void s(int i10) {
        this.b = i10;
    }

    public void t(int i10) {
        this.f25805g = i10;
    }

    public void u(cm.a aVar) {
        this.f25808j.o(aVar);
    }

    public void v(long j10) {
        this.f25800a = j10;
        e.f25810a.c(j10);
    }

    public void w(String str) {
        this.f25802d = str;
    }

    public c() {
        this.f25800a = -1L;
        this.f25804f = true;
        this.f25808j = new d0<>();
    }
}
