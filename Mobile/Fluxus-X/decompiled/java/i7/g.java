package i7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import g7.h0;
import g7.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e, j7.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19170a;
    public final Paint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p7.b f19171c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19172d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19173e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<m> f19174f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j7.a<Integer, Integer> f19175g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j7.a<Integer, Integer> f19176h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j7.a<ColorFilter, ColorFilter> f19177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f19178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j7.a<Float, Float> f19179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19180l;

    public g(h0 h0Var, p7.b bVar, o7.p pVar) {
        Path path = new Path();
        this.f19170a = path;
        this.b = new h7.a(1);
        this.f19174f = new ArrayList();
        this.f19171c = bVar;
        this.f19172d = pVar.d();
        this.f19173e = pVar.f();
        this.f19178j = h0Var;
        if (bVar.y() != null) {
            j7.d dVarA = bVar.y().a().a();
            this.f19179k = dVarA;
            dVarA.a(this);
            bVar.j(this.f19179k);
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f19175g = null;
            this.f19176h = null;
            return;
        }
        path.setFillType(pVar.c());
        j7.a<Integer, Integer> aVarA = pVar.b().a();
        this.f19175g = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        j7.a<Integer, Integer> aVarA2 = pVar.e().a();
        this.f19176h = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
    }

    @Override // j7.a.b
    public void a() {
        this.f19178j.invalidateSelf();
    }

    @Override // i7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f19174f.add((m) cVar);
            }
        }
    }

    @Override // m7.f
    public void c(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        t7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // i7.e
    public void d(Canvas canvas, Matrix matrix, int i10, t7.b bVar) {
        if (this.f19173e) {
            return;
        }
        if (g7.e.h()) {
            g7.e.b("FillContent#draw");
        }
        int iR = ((j7.b) this.f19175g).r();
        float fIntValue = this.f19176h.h().intValue() / 100.0f;
        this.b.setColor((t7.j.c((int) (i10 * fIntValue), 0, 255) << 24) | (iR & 16777215));
        j7.a<ColorFilter, ColorFilter> aVar = this.f19177i;
        if (aVar != null) {
            this.b.setColorFilter(aVar.h());
        }
        j7.a<Float, Float> aVar2 = this.f19179k;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (fFloatValue != this.f19180l) {
                this.b.setMaskFilter(this.f19171c.z(fFloatValue));
            }
            this.f19180l = fFloatValue;
        }
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.b);
        } else {
            this.b.clearShadowLayer();
        }
        this.f19170a.reset();
        for (int i11 = 0; i11 < this.f19174f.size(); i11++) {
            this.f19170a.addPath(this.f19174f.get(i11).x(), matrix);
        }
        canvas.drawPath(this.f19170a, this.b);
        if (g7.e.h()) {
            g7.e.c("FillContent#draw");
        }
    }

    @Override // m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        if (t8 == o0.f17499a) {
            this.f19175g.o(cVar);
            return;
        }
        if (t8 == o0.f17501d) {
            this.f19176h.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            j7.a<ColorFilter, ColorFilter> aVar = this.f19177i;
            if (aVar != null) {
                this.f19171c.I(aVar);
            }
            if (cVar == null) {
                this.f19177i = null;
                return;
            }
            j7.q qVar = new j7.q(cVar);
            this.f19177i = qVar;
            qVar.a(this);
            this.f19171c.j(this.f19177i);
            return;
        }
        if (t8 == o0.f17507j) {
            j7.a<Float, Float> aVar2 = this.f19179k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            j7.q qVar2 = new j7.q(cVar);
            this.f19179k = qVar2;
            qVar2.a(this);
            this.f19171c.j(this.f19179k);
        }
    }

    @Override // i7.e
    public void g(RectF rectF, Matrix matrix, boolean z10) {
        this.f19170a.reset();
        for (int i10 = 0; i10 < this.f19174f.size(); i10++) {
            this.f19170a.addPath(this.f19174f.get(i10).x(), matrix);
        }
        this.f19170a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // i7.c
    public String getName() {
        return this.f19172d;
    }
}
