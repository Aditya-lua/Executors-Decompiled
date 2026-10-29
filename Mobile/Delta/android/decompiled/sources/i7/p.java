package i7;

import android.graphics.Matrix;
import android.graphics.PointF;
import f7.o0;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f20332a = new Matrix();
    public final Matrix b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f20333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Matrix f20334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f20335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a<PointF, PointF> f20336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a<?, PointF> f20337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a<t7.d, t7.d> f20338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a<Float, Float> f20339i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a<Integer, Integer> f20340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f20341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f20342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a<?, Float> f20343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a<?, Float> f20344n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f20345o;

    public p(m7.n nVar) {
        this.f20336f = nVar.c() == null ? null : nVar.c().a();
        this.f20337g = nVar.f() == null ? null : nVar.f().a();
        this.f20338h = nVar.h() == null ? null : nVar.h().a();
        this.f20339i = nVar.g() == null ? null : nVar.g().a();
        this.f20341k = nVar.i() == null ? null : nVar.i().a();
        this.f20345o = nVar.l();
        if (this.f20341k != null) {
            this.b = new Matrix();
            this.f20333c = new Matrix();
            this.f20334d = new Matrix();
            this.f20335e = new float[9];
        } else {
            this.b = null;
            this.f20333c = null;
            this.f20334d = null;
            this.f20335e = null;
        }
        this.f20342l = nVar.j() == null ? null : nVar.j().a();
        if (nVar.e() != null) {
            this.f20340j = nVar.e().a();
        }
        if (nVar.k() != null) {
            this.f20343m = nVar.k().a();
        } else {
            this.f20343m = null;
        }
        if (nVar.d() != null) {
            this.f20344n = nVar.d().a();
        } else {
            this.f20344n = null;
        }
    }

    public void a(o7.b bVar) {
        bVar.j(this.f20340j);
        bVar.j(this.f20343m);
        bVar.j(this.f20344n);
        bVar.j(this.f20336f);
        bVar.j(this.f20337g);
        bVar.j(this.f20338h);
        bVar.j(this.f20339i);
        bVar.j(this.f20341k);
        bVar.j(this.f20342l);
    }

    public void b(a.b bVar) {
        a<Integer, Integer> aVar = this.f20340j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        a<?, Float> aVar2 = this.f20343m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        a<?, Float> aVar3 = this.f20344n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        a<PointF, PointF> aVar4 = this.f20336f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        a<?, PointF> aVar5 = this.f20337g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        a<t7.d, t7.d> aVar6 = this.f20338h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        a<Float, Float> aVar7 = this.f20339i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        d dVar = this.f20341k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        d dVar2 = this.f20342l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t8, t7.c<T> cVar) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (t8 == o0.f16424f) {
            a<PointF, PointF> aVar = this.f20336f;
            if (aVar == null) {
                this.f20336f = new q(cVar, new PointF());
                return true;
            }
            aVar.o(cVar);
            return true;
        }
        if (t8 == o0.f16425g) {
            a<?, PointF> aVar2 = this.f20337g;
            if (aVar2 == null) {
                this.f20337g = new q(cVar, new PointF());
                return true;
            }
            aVar2.o(cVar);
            return true;
        }
        if (t8 == o0.f16426h) {
            a<?, PointF> aVar3 = this.f20337g;
            if (aVar3 instanceof n) {
                ((n) aVar3).t(cVar);
                return true;
            }
        }
        if (t8 == o0.f16427i) {
            a<?, PointF> aVar4 = this.f20337g;
            if (aVar4 instanceof n) {
                ((n) aVar4).u(cVar);
                return true;
            }
        }
        if (t8 == o0.f16433o) {
            a<t7.d, t7.d> aVar5 = this.f20338h;
            if (aVar5 == null) {
                this.f20338h = new q(cVar, new t7.d());
                return true;
            }
            aVar5.o(cVar);
            return true;
        }
        if (t8 == o0.f16434p) {
            a<Float, Float> aVar6 = this.f20339i;
            if (aVar6 == null) {
                this.f20339i = new q(cVar, fValueOf2);
                return true;
            }
            aVar6.o(cVar);
            return true;
        }
        if (t8 == o0.f16421c) {
            a<Integer, Integer> aVar7 = this.f20340j;
            if (aVar7 == null) {
                this.f20340j = new q(cVar, 100);
                return true;
            }
            aVar7.o(cVar);
            return true;
        }
        if (t8 == o0.C) {
            a<?, Float> aVar8 = this.f20343m;
            if (aVar8 == null) {
                this.f20343m = new q(cVar, fValueOf);
                return true;
            }
            aVar8.o(cVar);
            return true;
        }
        if (t8 == o0.D) {
            a<?, Float> aVar9 = this.f20344n;
            if (aVar9 == null) {
                this.f20344n = new q(cVar, fValueOf);
                return true;
            }
            aVar9.o(cVar);
            return true;
        }
        if (t8 == o0.f16435q) {
            if (this.f20341k == null) {
                this.f20341k = new d(Collections.singletonList(new t7.a(fValueOf2)));
            }
            this.f20341k.o(cVar);
            return true;
        }
        if (t8 != o0.f16436r) {
            return false;
        }
        if (this.f20342l == null) {
            this.f20342l = new d(Collections.singletonList(new t7.a(fValueOf2)));
        }
        this.f20342l.o(cVar);
        return true;
    }

    public final void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f20335e[i10] = 0.0f;
        }
    }

    public a<?, Float> e() {
        return this.f20344n;
    }

    public Matrix f() {
        PointF pointFH;
        t7.d dVarH;
        PointF pointFH2;
        this.f20332a.reset();
        a<?, PointF> aVar = this.f20337g;
        if (aVar != null && (pointFH2 = aVar.h()) != null) {
            float f10 = pointFH2.x;
            if (f10 != 0.0f || pointFH2.y != 0.0f) {
                this.f20332a.preTranslate(f10, pointFH2.y);
            }
        }
        if (!this.f20345o) {
            a<Float, Float> aVar2 = this.f20339i;
            if (aVar2 != null) {
                float fFloatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((d) aVar2).r();
                if (fFloatValue != 0.0f) {
                    this.f20332a.preRotate(fFloatValue);
                }
            }
        } else if (aVar != null) {
            float f11 = aVar.f();
            PointF pointFH3 = aVar.h();
            float f12 = pointFH3.x;
            float f13 = pointFH3.y;
            aVar.n(1.0E-4f + f11);
            PointF pointFH4 = aVar.h();
            aVar.n(f11);
            this.f20332a.preRotate((float) Math.toDegrees(Math.atan2(pointFH4.y - f13, pointFH4.x - f12)));
        }
        d dVar = this.f20341k;
        if (dVar != null) {
            d dVar2 = this.f20342l;
            float fCos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-dVar2.r()) + 90.0f));
            d dVar3 = this.f20342l;
            float fSin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-dVar3.r()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(dVar.r()));
            d();
            float[] fArr = this.f20335e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f14 = -fSin;
            fArr[3] = f14;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.f20335e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f20333c.setValues(fArr2);
            d();
            float[] fArr3 = this.f20335e;
            fArr3[0] = fCos;
            fArr3[1] = f14;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f20334d.setValues(fArr3);
            this.f20333c.preConcat(this.b);
            this.f20334d.preConcat(this.f20333c);
            this.f20332a.preConcat(this.f20334d);
        }
        a<t7.d, t7.d> aVar3 = this.f20338h;
        if (aVar3 != null && (dVarH = aVar3.h()) != null && (dVarH.b() != 1.0f || dVarH.c() != 1.0f)) {
            this.f20332a.preScale(dVarH.b(), dVarH.c());
        }
        a<PointF, PointF> aVar4 = this.f20336f;
        if (aVar4 != null && (pointFH = aVar4.h()) != null) {
            float f15 = pointFH.x;
            if (f15 != 0.0f || pointFH.y != 0.0f) {
                this.f20332a.preTranslate(-f15, -pointFH.y);
            }
        }
        return this.f20332a;
    }

    public Matrix g(float f10) {
        a<?, PointF> aVar = this.f20337g;
        PointF pointFH = aVar == null ? null : aVar.h();
        a<t7.d, t7.d> aVar2 = this.f20338h;
        t7.d dVarH = aVar2 == null ? null : aVar2.h();
        this.f20332a.reset();
        if (pointFH != null) {
            this.f20332a.preTranslate(pointFH.x * f10, pointFH.y * f10);
        }
        if (dVarH != null) {
            double d10 = f10;
            this.f20332a.preScale((float) Math.pow(dVarH.b(), d10), (float) Math.pow(dVarH.c(), d10));
        }
        a<Float, Float> aVar3 = this.f20339i;
        if (aVar3 != null) {
            float fFloatValue = aVar3.h().floatValue();
            a<PointF, PointF> aVar4 = this.f20336f;
            PointF pointFH2 = aVar4 != null ? aVar4.h() : null;
            this.f20332a.preRotate(fFloatValue * f10, pointFH2 == null ? 0.0f : pointFH2.x, pointFH2 != null ? pointFH2.y : 0.0f);
        }
        return this.f20332a;
    }

    public a<?, Integer> h() {
        return this.f20340j;
    }

    public a<?, Float> i() {
        return this.f20343m;
    }

    public void j(float f10) {
        a<Integer, Integer> aVar = this.f20340j;
        if (aVar != null) {
            aVar.n(f10);
        }
        a<?, Float> aVar2 = this.f20343m;
        if (aVar2 != null) {
            aVar2.n(f10);
        }
        a<?, Float> aVar3 = this.f20344n;
        if (aVar3 != null) {
            aVar3.n(f10);
        }
        a<PointF, PointF> aVar4 = this.f20336f;
        if (aVar4 != null) {
            aVar4.n(f10);
        }
        a<?, PointF> aVar5 = this.f20337g;
        if (aVar5 != null) {
            aVar5.n(f10);
        }
        a<t7.d, t7.d> aVar6 = this.f20338h;
        if (aVar6 != null) {
            aVar6.n(f10);
        }
        a<Float, Float> aVar7 = this.f20339i;
        if (aVar7 != null) {
            aVar7.n(f10);
        }
        d dVar = this.f20341k;
        if (dVar != null) {
            dVar.n(f10);
        }
        d dVar2 = this.f20342l;
        if (dVar2 != null) {
            dVar2.n(f10);
        }
    }
}
