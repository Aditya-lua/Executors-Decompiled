package m7;

import android.graphics.PointF;
import f7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class n implements n7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f24030a;
    public final o<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f24031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f24032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f24033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f24034f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f24035g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f24036h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f24037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f24038j;

    public n() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // n7.c
    public h7.c a(h0 h0Var, f7.i iVar, o7.b bVar) {
        return null;
    }

    public i7.p b() {
        return new i7.p(this);
    }

    public e c() {
        return this.f24030a;
    }

    public b d() {
        return this.f24037i;
    }

    public d e() {
        return this.f24033e;
    }

    public o<PointF, PointF> f() {
        return this.b;
    }

    public b g() {
        return this.f24032d;
    }

    public g h() {
        return this.f24031c;
    }

    public b i() {
        return this.f24034f;
    }

    public b j() {
        return this.f24035g;
    }

    public b k() {
        return this.f24036h;
    }

    public boolean l() {
        return this.f24038j;
    }

    public void m(boolean z10) {
        this.f24038j = z10;
    }

    public n(e eVar, o<PointF, PointF> oVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5) {
        this.f24038j = false;
        this.f24030a = eVar;
        this.b = oVar;
        this.f24031c = gVar;
        this.f24032d = bVar;
        this.f24033e = dVar;
        this.f24036h = bVar2;
        this.f24037i = bVar3;
        this.f24034f = bVar4;
        this.f24035g = bVar5;
    }
}
