package n7;

import f7.h0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25950a;
    public final g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m7.c f25951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m7.d f25952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m7.f f25953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m7.f f25954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m7.b f25955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s.a f25956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s.b f25957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f25958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<m7.b> f25959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final m7.b f25960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f25961m;

    public f(String str, g gVar, m7.c cVar, m7.d dVar, m7.f fVar, m7.f fVar2, m7.b bVar, s.a aVar, s.b bVar2, float f10, List<m7.b> list, m7.b bVar3, boolean z10) {
        this.f25950a = str;
        this.b = gVar;
        this.f25951c = cVar;
        this.f25952d = dVar;
        this.f25953e = fVar;
        this.f25954f = fVar2;
        this.f25955g = bVar;
        this.f25956h = aVar;
        this.f25957i = bVar2;
        this.f25958j = f10;
        this.f25959k = list;
        this.f25960l = bVar3;
        this.f25961m = z10;
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return new h7.i(h0Var, bVar, this);
    }

    public s.a b() {
        return this.f25956h;
    }

    public m7.b c() {
        return this.f25960l;
    }

    public m7.f d() {
        return this.f25954f;
    }

    public m7.c e() {
        return this.f25951c;
    }

    public g f() {
        return this.b;
    }

    public s.b g() {
        return this.f25957i;
    }

    public List<m7.b> h() {
        return this.f25959k;
    }

    public float i() {
        return this.f25958j;
    }

    public String j() {
        return this.f25950a;
    }

    public m7.d k() {
        return this.f25952d;
    }

    public m7.f l() {
        return this.f25953e;
    }

    public m7.b m() {
        return this.f25955g;
    }

    public boolean n() {
        return this.f25961m;
    }
}
