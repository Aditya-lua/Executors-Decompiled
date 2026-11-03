package h7;

import android.graphics.Path;
import android.graphics.PointF;
import f7.h0;
import f7.o0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f implements m, i7.a.b, k {
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h0 f19094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i7.a<?, PointF> f19095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i7.a<?, PointF> f19096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n7.b f19097f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f19099h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19093a = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f19098g = new b();

    public f(h0 h0Var, o7.b bVar, n7.b bVar2) {
        this.b = bVar2.b();
        this.f19094c = h0Var;
        i7.a<PointF, PointF> aVarA = bVar2.d().a();
        this.f19095d = aVarA;
        i7.a<PointF, PointF> aVarA2 = bVar2.c().a();
        this.f19096e = aVarA2;
        this.f19097f = bVar2;
        bVar.j(aVarA);
        bVar.j(aVarA2);
        aVarA.a(this);
        aVarA2.a(this);
    }

    @Override // i7.a.b
    public void a() {
        f();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == n7.t.a.SIMULTANEOUSLY) {
                    this.f19098g.a(uVar);
                    uVar.c(this);
                }
            }
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f17025k) {
            this.f19095d.o(cVar);
        } else if (t8 == o0.f17028n) {
            this.f19096e.o(cVar);
        }
    }

    public final void f() {
        this.f19099h = false;
        this.f19094c.invalidateSelf();
    }

    @Override // h7.c
    public String getName() {
        return this.b;
    }

    @Override // h7.m
    public Path getPath() {
        if (this.f19099h) {
            return this.f19093a;
        }
        this.f19093a.reset();
        if (this.f19097f.e()) {
            this.f19099h = true;
            return this.f19093a;
        }
        PointF pointFH = this.f19095d.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.f19093a.reset();
        if (this.f19097f.f()) {
            float f14 = -f11;
            this.f19093a.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.f19093a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.f19093a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.f19093a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.f19093a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.f19093a.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.f19093a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.f19093a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.f19093a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.f19093a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF pointFH2 = this.f19096e.h();
        this.f19093a.offset(pointFH2.x, pointFH2.y);
        this.f19093a.close();
        this.f19098g.b(this.f19093a);
        this.f19099h = true;
        return this.f19093a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }
}
