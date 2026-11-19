package n7;

import android.graphics.PointF;
import g7.h0;

/* JADX INFO: loaded from: classes3.dex */
public class n implements o7.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f25480a;
    public final o<PointF, PointF> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f25481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f25482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f25483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f25484f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f25485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f25486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f25487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f25488j;

    public n() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // o7.c
    public i7.c a(h0 h0Var, g7.i iVar, p7.b bVar) {
        return null;
    }

    public j7.p b() {
        return new j7.p(this);
    }

    public e c() {
        return this.f25480a;
    }

    public b d() {
        return this.f25487i;
    }

    public d e() {
        return this.f25483e;
    }

    public o<PointF, PointF> f() {
        return this.b;
    }

    public b g() {
        return this.f25482d;
    }

    public g h() {
        return this.f25481c;
    }

    public b i() {
        return this.f25484f;
    }

    public b j() {
        return this.f25485g;
    }

    public b k() {
        return this.f25486h;
    }

    public boolean l() {
        return this.f25488j;
    }

    public void m(boolean z10) {
        this.f25488j = z10;
    }

    public n(e eVar, o<PointF, PointF> oVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5) {
        this.f25488j = false;
        this.f25480a = eVar;
        this.b = oVar;
        this.f25481c = gVar;
        this.f25482d = bVar;
        this.f25483e = dVar;
        this.f25486h = bVar2;
        this.f25487i = bVar3;
        this.f25484f = bVar4;
        this.f25485g = bVar5;
    }
}
