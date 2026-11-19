package i7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import g7.h0;
import g7.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements j7.a.b, k, e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f19138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p7.b f19139f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f19141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Paint f19142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j7.a<?, Float> f19143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final j7.a<?, Integer> f19144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<j7.a<?, Float>> f19145l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j7.a<?, Float> f19146m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j7.a<ColorFilter, ColorFilter> f19147n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j7.a<Float, Float> f19148o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f19149p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PathMeasure f19135a = new PathMeasure();
    public final Path b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f19136c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RectF f19137d = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<b> f19140g = new ArrayList();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<m> f19150a;
        public final u b;

        public b(u uVar) {
            this.f19150a = new ArrayList();
            this.b = uVar;
        }
    }

    public a(h0 h0Var, p7.b bVar, Paint.Cap cap, Paint.Join join, float f10, n7.d dVar, n7.b bVar2, List<n7.b> list, n7.b bVar3) {
        h7.a aVar = new h7.a(1);
        this.f19142i = aVar;
        this.f19149p = 0.0f;
        this.f19138e = h0Var;
        this.f19139f = bVar;
        aVar.setStyle(Paint.Style.STROKE);
        aVar.setStrokeCap(cap);
        aVar.setStrokeJoin(join);
        aVar.setStrokeMiter(f10);
        this.f19144k = dVar.a();
        this.f19143j = bVar2.a();
        if (bVar3 == null) {
            this.f19146m = null;
        } else {
            this.f19146m = bVar3.a();
        }
        this.f19145l = new ArrayList(list.size());
        this.f19141h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f19145l.add(list.get(i10).a());
        }
        bVar.j(this.f19144k);
        bVar.j(this.f19143j);
        for (int i11 = 0; i11 < this.f19145l.size(); i11++) {
            bVar.j(this.f19145l.get(i11));
        }
        j7.a<?, Float> aVar2 = this.f19146m;
        if (aVar2 != null) {
            bVar.j(aVar2);
        }
        this.f19144k.a(this);
        this.f19143j.a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f19145l.get(i12).a(this);
        }
        j7.a<?, Float> aVar3 = this.f19146m;
        if (aVar3 != null) {
            aVar3.a(this);
        }
        if (bVar.y() != null) {
            j7.d dVarA = bVar.y().a().a();
            this.f19148o = dVarA;
            dVarA.a(this);
            bVar.j(this.f19148o);
        }
    }

    @Override // j7.a.b
    public void a() {
        this.f19138e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // i7.c
    public void b(List<c> list, List<c> list2) {
        u uVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = list.get(size);
            if (cVar instanceof u) {
                u uVar2 = (u) cVar;
                if (uVar2.k() == o7.t.a.INDIVIDUALLY) {
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
                if (uVar3.k() == o7.t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f19140g.add(bVar);
                    }
                    bVar = new b(uVar3);
                    uVar3.c(this);
                } else if (!(cVar2 instanceof m)) {
                    if (bVar == null) {
                        bVar = new b(uVar);
                    }
                    bVar.f19150a.add((m) cVar2);
                }
            } else if (!(cVar2 instanceof m)) {
                if (bVar == null) {
                    bVar = new b(uVar);
                }
                bVar.f19150a.add((m) cVar2);
            }
        }
        if (bVar != null) {
            this.f19140g.add(bVar);
        }
    }

    @Override // m7.f
    public void c(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        t7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // i7.e
    public void d(Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        if (g7.e.h()) {
            g7.e.b("StrokeContent#draw");
        }
        if (t7.m.h(matrix)) {
            if (g7.e.h()) {
                g7.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.f19144k.h().intValue() / 100.0f;
        this.f19142i.setAlpha(t7.j.c((int) (i10 * fIntValue), 0, 255));
        this.f19142i.setStrokeWidth(((j7.d) this.f19143j).r());
        if (this.f19142i.getStrokeWidth() <= 0.0f) {
            if (g7.e.h()) {
                g7.e.c("StrokeContent#draw");
                return;
            }
            return;
        }
        h();
        j7.a<ColorFilter, ColorFilter> aVar = this.f19147n;
        if (aVar != null) {
            this.f19142i.setColorFilter(aVar.h());
        }
        j7.a<Float, Float> aVar2 = this.f19148o;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f19142i.setMaskFilter(null);
            } else if (fFloatValue != this.f19149p) {
                this.f19142i.setMaskFilter(this.f19139f.z(fFloatValue));
            }
            this.f19149p = fFloatValue;
        }
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.f19142i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i11 = 0; i11 < this.f19140g.size(); i11++) {
            b bVar2 = this.f19140g.get(i11);
            if (bVar2.b != null) {
                j(canvas, bVar2);
            } else {
                if (g7.e.h()) {
                    g7.e.b("StrokeContent#buildPath");
                }
                this.b.reset();
                for (int size = bVar2.f19150a.size() - 1; size >= 0; size--) {
                    this.b.addPath(((m) bVar2.f19150a.get(size)).x());
                }
                if (g7.e.h()) {
                    g7.e.c("StrokeContent#buildPath");
                    g7.e.b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.b, this.f19142i);
                if (g7.e.h()) {
                    g7.e.c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (g7.e.h()) {
            g7.e.c("StrokeContent#draw");
        }
    }

    @Override // m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        if (t8 == o0.f17501d) {
            this.f19144k.o(cVar);
            return;
        }
        if (t8 == o0.f17516s) {
            this.f19143j.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            j7.a<ColorFilter, ColorFilter> aVar = this.f19147n;
            if (aVar != null) {
                this.f19139f.I(aVar);
            }
            if (cVar == null) {
                this.f19147n = null;
                return;
            }
            j7.q qVar = new j7.q(cVar);
            this.f19147n = qVar;
            qVar.a(this);
            this.f19139f.j(this.f19147n);
            return;
        }
        if (t8 == o0.f17507j) {
            j7.a<Float, Float> aVar2 = this.f19148o;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            j7.q qVar2 = new j7.q(cVar);
            this.f19148o = qVar2;
            qVar2.a(this);
            this.f19139f.j(this.f19148o);
        }
    }

    @Override // i7.e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        if (g7.e.h()) {
            g7.e.b("StrokeContent#getBounds");
        }
        this.b.reset();
        for (int i10 = 0; i10 < this.f19140g.size(); i10++) {
            b bVar = this.f19140g.get(i10);
            for (int i11 = 0; i11 < bVar.f19150a.size(); i11++) {
                this.b.addPath(((m) bVar.f19150a.get(i11)).x(), matrix);
            }
        }
        this.b.computeBounds(this.f19137d, false);
        float fR = ((j7.d) this.f19143j).r();
        RectF rectF2 = this.f19137d;
        float f10 = fR / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f19137d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (g7.e.h()) {
            g7.e.c("StrokeContent#getBounds");
        }
    }

    public final void h() {
        if (g7.e.h()) {
            g7.e.b("StrokeContent#applyDashPattern");
        }
        if (this.f19145l.isEmpty()) {
            if (g7.e.h()) {
                g7.e.c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f19145l.size(); i10++) {
            this.f19141h[i10] = this.f19145l.get(i10).h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f19141h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f19141h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
        }
        j7.a<?, Float> aVar = this.f19146m;
        this.f19142i.setPathEffect(new DashPathEffect(this.f19141h, aVar == null ? 0.0f : aVar.h().floatValue()));
        if (g7.e.h()) {
            g7.e.c("StrokeContent#applyDashPattern");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0123  */
    public final void j(Canvas canvas, b bVar) {
        float f10;
        if (g7.e.h()) {
            g7.e.b("StrokeContent#applyTrimPath");
        }
        if (bVar.b == null) {
            if (g7.e.h()) {
                g7.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.b.reset();
        for (int size = bVar.f19150a.size() - 1; size >= 0; size--) {
            this.b.addPath(((m) bVar.f19150a.get(size)).x());
        }
        float fFloatValue = bVar.b.j().h().floatValue() / 100.0f;
        float fFloatValue2 = bVar.b.e().h().floatValue() / 100.0f;
        float fFloatValue3 = bVar.b.h().h().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.b, this.f19142i);
            if (g7.e.h()) {
                g7.e.c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f19135a.setPath(this.b, false);
        float length = this.f19135a.getLength();
        while (this.f19135a.nextContour()) {
            length += this.f19135a.getLength();
        }
        float f11 = fFloatValue3 * length;
        float f12 = (fFloatValue * length) + f11;
        float fMin = Math.min((fFloatValue2 * length) + f11, (f12 + length) - 1.0f);
        float f13 = 0.0f;
        for (int size2 = bVar.f19150a.size() - 1; size2 >= 0; size2--) {
            this.f19136c.set(((m) bVar.f19150a.get(size2)).x());
            this.f19135a.setPath(this.f19136c, false);
            float length2 = this.f19135a.getLength();
            if (fMin > length) {
                float f14 = fMin - length;
                if (f14 >= f13 + length2 || f13 >= f14) {
                    f10 = f13 + length2;
                    if (f10 < f12 && f13 <= fMin) {
                        if (f10 > fMin || f12 >= f13) {
                            t7.m.a(this.f19136c, f12 < f13 ? 0.0f : (f12 - f13) / length2, fMin > f10 ? 1.0f : (fMin - f13) / length2, 0.0f);
                            canvas.drawPath(this.f19136c, this.f19142i);
                        } else {
                            canvas.drawPath(this.f19136c, this.f19142i);
                        }
                    }
                } else {
                    t7.m.a(this.f19136c, f12 > length ? (f12 - length) / length2 : 0.0f, Math.min(f14 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f19136c, this.f19142i);
                }
            } else {
                f10 = f13 + length2;
                if (f10 < f12) {
                }
            }
            f13 += length2;
        }
        if (g7.e.h()) {
            g7.e.c("StrokeContent#applyTrimPath");
        }
    }
}
