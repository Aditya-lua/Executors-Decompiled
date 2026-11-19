package o7;

import g7.h0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26825a;
    public final g b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.c f26826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.d f26827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n7.f f26828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n7.f f26829f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n7.b f26830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s.a f26831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s.b f26832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f26833j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<n7.b> f26834k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n7.b f26835l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f26836m;

    public f(String str, g gVar, n7.c cVar, n7.d dVar, n7.f fVar, n7.f fVar2, n7.b bVar, s.a aVar, s.b bVar2, float f10, List<n7.b> list, n7.b bVar3, boolean z10) {
        this.f26825a = str;
        this.b = gVar;
        this.f26826c = cVar;
        this.f26827d = dVar;
        this.f26828e = fVar;
        this.f26829f = fVar2;
        this.f26830g = bVar;
        this.f26831h = aVar;
        this.f26832i = bVar2;
        this.f26833j = f10;
        this.f26834k = list;
        this.f26835l = bVar3;
        this.f26836m = z10;
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return new i7.i(h0Var, bVar, this);
    }

    public s.a b() {
        return this.f26831h;
    }

    public n7.b c() {
        return this.f26835l;
    }

    public n7.f d() {
        return this.f26829f;
    }

    public n7.c e() {
        return this.f26826c;
    }

    public g f() {
        return this.b;
    }

    public s.b g() {
        return this.f26832i;
    }

    public List<n7.b> h() {
        return this.f26834k;
    }

    public float i() {
        return this.f26833j;
    }

    public String j() {
        return this.f26825a;
    }

    public n7.d k() {
        return this.f26827d;
    }

    public n7.f l() {
        return this.f26828e;
    }

    public n7.b m() {
        return this.f26830g;
    }

    public boolean n() {
        return this.f26836m;
    }
}
