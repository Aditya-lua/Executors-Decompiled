package h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import f7.h0;
import f7.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements i7.a.b, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f18581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o7.b f18582f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f18584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f18585i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i7.a<?, Float> f18586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i7.a<?, Integer> f18587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<i7.a<?, Float>> f18588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i7.a<?, Float> f18589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i7.a<ColorFilter, ColorFilter> f18590n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i7.a<Float, Float> f18591o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18592p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f18578a = new PathMeasure();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f18579c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f18580d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<b> f18583g = new ArrayList();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<m> f18593a;
        public final u b;

        public b(u uVar) {
            this.f18593a = new ArrayList();
            this.b = uVar;
        }
    }

    public a(h0 h0Var, o7.b bVar, Paint.Cap cap, Paint.Join join, float f10, m7.d dVar, m7.b bVar2, List<m7.b> list, m7.b bVar3) {
        g7.a aVar = new g7.a(1);
        this.f18585i = aVar;
        this.f18592p = 0.0f;
        this.f18581e = h0Var;
        this.f18582f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f18587k = dVar.a();
        this.f18586j = bVar2.a();
        if (bVar3 == null) {
            this.f18589m = null;
        } else {
            this.f18589m = bVar3.a();
        }
        this.f18588l = new ArrayList(list.size());
        this.f18584h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f18588l.add(list.get(i10).a());
        }
        bVar.j(this.f18587k);
        bVar.j(this.f18586j);
        for (int i11 = 0; i11 < this.f18588l.size(); i11++) {
            bVar.j(this.f18588l.get(i11));
        }
        i7.a<?, Float> aVar2 = this.f18589m;
        if (aVar2 != null) {
            bVar.j(aVar2);
        }
        this.f18587k.a(this);
        this.f18586j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f18588l.get(i12).a(this);
        }
        i7.a<?, Float> aVar3 = this.f18589m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.x() != null) {
            i7.d dVarA = bVar.x().a().a();
            this.f18591o = dVarA;
            dVarA.a(this);
            bVar.j(this.f18591o);
        }
    }

    @Override // i7.a.b
    public void a() {
        this.f18581e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.k() == n7.t.a.INDIVIDUALLY) {
                    uVar = uVar2;
                }
            }
        }
        if (uVar != null) {
            uVar.c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            c cVar2 = list2.get(size2);
            if (cVar2 instanceof u) {
                u uVar3 = (u) cVar2;
                if (uVar3.k() == n7.t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f18583g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.c(this);
                } else if (!(cVar2 instanceof m)) {
                    if (bVar == null) {
                        bVar = new b(uVar);
                    }
                    bVar.f18593a.add((m) cVar2);
                }
            } else if (!(cVar2 instanceof m)) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f18593a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f18583g.add(bVar);
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f16422d) {
            this.f18587k.o(cVar);
            return;
        }
        if (t8 == o0.f16437s) {
            this.f18586j.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            i7.a<ColorFilter, ColorFilter> aVar = this.f18590n;
            if (aVar != null) {
                this.f18582f.H(aVar);
            }
            if (cVar == null) {
                this.f18590n = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.f18590n = qVar;
            qVar.a(this);
            this.f18582f.j(this.f18590n);
            return;
        }
        if (t8 == o0.f16428j) {
            i7.a<Float, Float> aVar2 = this.f18591o;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            i7.q qVar2 = new i7.q(cVar);
            this.f18591o = qVar2;
            qVar2.a(this);
            this.f18582f.j(this.f18591o);
        }
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        if (f7.e.h()) {
            f7.e.b("StrokeContent#getBounds");
        }
        this.b.reset();
        for (int i10 = 0; i10 < this.f18583g.size(); i10++) {
            b bVar = this.f18583g.get(i10);
            for (int i11 = 0; i11 < bVar.f18593a.size(); i11++) {
                this.b.addPath(((m) bVar.f18593a.get(i11)).getPath(), matrix);
            }
        }
        this.b.computeBounds(this.f18580d, false);
        float fR = ((i7.d) this.f18586j).r();
        RectF rectF2 = this.f18580d;
        float f10 = fR / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f18580d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (f7.e.h()) {
            f7.e.c("StrokeContent#getBounds");
        }
    }

    public final void f() {
        if (f7.e.h()) {
            f7.e.b("StrokeContent#applyDashPattern");
        }
        if (this.f18588l.isEmpty()) {
            if (f7.e.h()) {
                f7.e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f18588l.size(); i10++) {
            this.f18584h[i10] = this.f18588l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f18584h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f18584h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
        }
        i7.a<?, Float> aVar = this.f18589m;
        this.f18585i.setPathEffect(new DashPathEffect(this.f18584h, aVar == null ? 0.0f : aVar.h().floatValue()));
        if (f7.e.h()) {
            f7.e.c("StrokeContent#applyDashPattern");
        }
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (f7.e.h()) {
            f7.e.b("StrokeContent#draw");
        }
        if (s7.m.h(matrix)) {
            if (f7.e.h()) {
                f7.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.f18587k.h().intValue() / 100.0f;
        this.f18585i.setAlpha(s7.j.c((int) (i10 * fIntValue), 0, 255));
        this.f18585i.setStrokeWidth(((i7.d) this.f18586j).r());
        if (this.f18585i.getStrokeWidth() <= 0.0f) {
            if (f7.e.h()) {
                f7.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        f();
        i7.a<ColorFilter, ColorFilter> aVar = this.f18590n;
        if (aVar != null) {
            this.f18585i.setColorFilter(aVar.h());
        }
        i7.a<Float, Float> aVar2 = this.f18591o;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f18585i.setMaskFilter(null);
            } else if (fFloatValue != this.f18592p) {
                this.f18585i.setMaskFilter(this.f18582f.y(fFloatValue));
            }
            this.f18592p = fFloatValue;
        }
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f18585i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i11 = 0; i11 < this.f18583g.size(); i11++) {
            b bVar2 = this.f18583g.get(i11);
            if (bVar2.b != null) {
                j(canvas, bVar2);
            } else {
                if (f7.e.h()) {
                    f7.e.b("StrokeContent#buildPath");
                }
                this.b.reset();
                for (int size = bVar2.f18593a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((m) bVar2.f18593a.get(size)).getPath());
                }
                if (f7.e.h()) {
                    f7.e.c("StrokeContent#buildPath");
                    f7.e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.b, this.f18585i);
                if (f7.e.h()) {
                    f7.e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (f7.e.h()) {
            f7.e.c("StrokeContent#draw");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0123  */
    public final void j(Canvas canvas, b bVar) {
        float f10;
        if (f7.e.h()) {
            f7.e.b("StrokeContent#applyTrimPath");
        }
        if (bVar.b == null) {
            if (f7.e.h()) {
                f7.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.b.reset();
        for (int size = bVar.f18593a.size() - 1; size >= 0; size--) {
            this.b.addPath(((m) bVar.f18593a.get(size)).getPath());
        }
        float fFloatValue = bVar.b.j().h().floatValue() / 100.0f;
        float fFloatValue2 = bVar.b.f().h().floatValue() / 100.0f;
        float fFloatValue3 = bVar.b.h().h().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.b, this.f18585i);
            if (f7.e.h()) {
                f7.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f18578a.setPath(this.b, false);
        float length = this.f18578a.getLength();
        while (this.f18578a.nextContour()) {
            length += this.f18578a.getLength();
        }
        float f11 = fFloatValue3 * length;
        float f12 = (fFloatValue * length) + f11;
        float fMin = Math.min((fFloatValue2 * length) + f11, (f12 + length) - 1.0f);
        float f13 = 0.0f;
        for (int size2 = bVar.f18593a.size() - 1; size2 >= 0; size2--) {
            this.f18579c.set(((m) bVar.f18593a.get(size2)).getPath());
            this.f18578a.setPath(this.f18579c, false);
            float length2 = this.f18578a.getLength();
            if (fMin > length) {
                float f14 = fMin - length;
                if (f14 >= f13 + length2 || f13 >= f14) {
                    f10 = f13 + length2;
                    if (f10 < f12 && f13 <= fMin) {
                        if (f10 > fMin || f12 >= f13) {
                            s7.m.a(this.f18579c, f12 < f13 ? 0.0f : (f12 - f13) / length2, fMin > f10 ? 1.0f : (fMin - f13) / length2, 0.0f);
                            canvas.drawPath(this.f18579c, this.f18585i);
                        } else {
                            canvas.drawPath(this.f18579c, this.f18585i);
                        }
                    }
                } else {
                    s7.m.a(this.f18579c, f12 > length ? (f12 - length) / length2 : 0.0f, Math.min(f14 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f18579c, this.f18585i);
                }
            } else {
                f10 = f13 + length2;
                if (f10 < f12) {
                }
            }
            f13 += length2;
        }
        if (f7.e.h()) {
            f7.e.c("StrokeContent#applyTrimPath");
        }
    }
}
