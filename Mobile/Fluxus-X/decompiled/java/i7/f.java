package i7;

import android.graphics.Path;
import android.graphics.PointF;
import g7.h0;
import g7.o0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements m, j7.a.b, k {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f19164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j7.a<?, PointF> f19165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j7.a<?, PointF> f19166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o7.b f19167f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19169h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19163a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f19168g = new b();

    public f(h0 h0Var, p7.b bVar, o7.b bVar2) {
        this.b = bVar2.b();
        this.f19164c = h0Var;
        j7.a<PointF, PointF> aVarA = bVar2.d().a();
        this.f19165d = aVarA;
        j7.a<PointF, PointF> aVarA2 = bVar2.c().a();
        this.f19166e = aVarA2;
        this.f19167f = bVar2;
        bVar.j(aVarA);
        bVar.j(aVarA2);
        aVarA.a(this);
        aVarA2.a(this);
    }

    @Override // j7.a.b
    public void a() {
        h();
    }

    @Override // i7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == o7.t.a.SIMULTANEOUSLY) {
                    this.f19168g.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // m7.f
    public void c(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        t7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        if (t8 == o0.f17508k) {
            this.f19165d.o(cVar);
        } else if (t8 == o0.f17511n) {
            this.f19166e.o(cVar);
        }
    }

    @Override // i7.c
    public String getName() {
        return this.b;
    }

    public final void h() {
        this.f19169h = false;
        this.f19164c.invalidateSelf();
    }

    @Override // i7.m
    public Path x() {
        if (this.f19169h) {
            return this.f19163a;
        }
        this.f19163a.reset();
        if (this.f19167f.e()) {
            this.f19169h = true;
            return this.f19163a;
        }
        PointF pointFH = this.f19165d.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f19163a.reset();
        if (this.f19167f.f()) {
            float f14 = -f11;
            this.f19163a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f19163a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f19163a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f19163a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f19163a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f19163a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f19163a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f19163a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f19163a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f19163a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFH2 = this.f19166e.h();
        this.f19163a.offset(pointFH2.x, pointFH2.y);
        this.f19163a.close();
        this.f19168g.b(this.f19163a);
        this.f19169h = true;
        return this.f19163a;
    }
}
