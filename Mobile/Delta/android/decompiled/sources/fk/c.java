package fk;

import androidx.p000lifecycle.a0;
import androidx.p000lifecycle.d0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ol.a f16787k = ol.a.LIGHT;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16788a;
    public int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f16793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f16795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d0<ol.a> f16796j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f16797a = new c();
    }

    public static c c() {
        return a.f16797a;
    }

    public void a() {
        this.b = 0;
        this.f16793g = 0;
        this.f16791e = "";
        this.f16789c = null;
        this.f16792f = true;
        v(-1L);
        u(f16787k);
    }

    public String b() {
        String str = this.f16791e;
        return (str == null || str.equals("null")) ? "" : this.f16791e;
    }

    public int d() {
        return this.f16794h;
    }

    public int e() {
        return this.b;
    }

    public int f() {
        return this.f16793g;
    }

    public ol.a g() {
        ol.a aVarF = this.f16796j.f();
        return aVarF != null ? aVarF : f16787k;
    }

    public a0<ol.a> h() {
        return this.f16796j;
    }

    public String i() {
        return g().toString();
    }

    public long j() {
        return this.f16788a;
    }

    public String k() {
        String str = this.f16790d;
        return (str == null || str.equals("null")) ? "" : this.f16790d;
    }

    public boolean l() {
        return this.f16795i;
    }

    public void m() {
        if (this.f16796j.f() == null) {
            u(f16787k);
        }
    }

    public boolean n() {
        return this.f16792f;
    }

    public void o(String str) {
        this.f16791e = str;
    }

    public void p(boolean z10) {
        this.f16795i = z10;
    }

    public void q(boolean z10) {
        this.f16792f = z10;
    }

    public void r(int i10) {
        this.f16794h = i10;
    }

    public void s(int i10) {
        this.b = i10;
    }

    public void t(int i10) {
        this.f16793g = i10;
    }

    public void u(ol.a aVar) {
        this.f16796j.o(aVar);
    }

    public void v(long j10) {
        this.f16788a = j10;
        e.f16798a.c(j10);
    }

    public void w(String str) {
        this.f16790d = str;
    }

    public c() {
        this.f16788a = -1L;
        this.f16792f = true;
        this.f16796j = new d0<>();
    }
}
