package h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import f7.h0;
import f7.o0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class g implements e, i7.a.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19100a;
    public final Paint b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o7.b f19101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<m> f19104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i7.a<Integer, Integer> f19105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i7.a<Integer, Integer> f19106h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i7.a<ColorFilter, ColorFilter> f19107i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final h0 f19108j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i7.a<Float, Float> f19109k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f19110l;

    public g(h0 h0Var, o7.b bVar, n7.p pVar) {
        Path path = new Path();
        this.f19100a = path;
        this.b = new g7.a(1);
        this.f19104f = new ArrayList();
        this.f19101c = bVar;
        this.f19102d = pVar.d();
        this.f19103e = pVar.f();
        this.f19108j = h0Var;
        if (bVar.x() != null) {
            i7.d dVarA = bVar.x().a().a();
            this.f19109k = dVarA;
            dVarA.a(this);
            bVar.j(this.f19109k);
        }
        if (pVar.b() == null || pVar.e() == null) {
            this.f19105g = null;
            this.f19106h = null;
            return;
        }
        path.setFillType(pVar.c());
        i7.a<Integer, Integer> aVarA = pVar.b().a();
        this.f19105g = aVarA;
        aVarA.a(this);
        bVar.j(aVarA);
        i7.a<Integer, Integer> aVarA2 = pVar.e().a();
        this.f19106h = aVarA2;
        aVarA2.a(this);
        bVar.j(aVarA2);
    }

    @Override // i7.a.b
    public void a() {
        this.f19108j.invalidateSelf();
    }

    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            c cVar = list2.get(i10);
            if (cVar instanceof m) {
                this.f19104f.add((m) cVar);
            }
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f17016a) {
            this.f19105g.o(cVar);
            return;
        }
        if (t8 == o0.f17018d) {
            this.f19106h.o(cVar);
            return;
        }
        if (t8 == o0.K) {
            i7.a<ColorFilter, ColorFilter> aVar = this.f19107i;
            if (aVar != null) {
                this.f19101c.H(aVar);
            }
            if (cVar == null) {
                this.f19107i = null;
                return;
            }
            i7.q qVar = new i7.q(cVar);
            this.f19107i = qVar;
            qVar.a(this);
            this.f19101c.j(this.f19107i);
            return;
        }
        if (t8 == o0.f17024j) {
            i7.a<Float, Float> aVar2 = this.f19109k;
            if (aVar2 != null) {
                aVar2.o(cVar);
                return;
            }
            i7.q qVar2 = new i7.q(cVar);
            this.f19109k = qVar2;
            qVar2.a(this);
            this.f19101c.j(this.f19109k);
        }
    }

    @Override // h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f19100a.reset();
        for (int i10 = 0; i10 < this.f19104f.size(); i10++) {
            this.f19100a.addPath(this.f19104f.get(i10).getPath(), matrix);
        }
        this.f19100a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // h7.c
    public String getName() {
        return this.f19102d;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // h7.e
    public void i(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        if (this.f19103e) {
            return;
        }
        if (f7.e.h()) {
            f7.e.b("FillContent#draw");
        }
        int iR = ((i7.b) this.f19105g).r();
        float fIntValue = this.f19106h.h().intValue() / 100.0f;
        this.b.setColor((s7.j.c((int) (i10 * fIntValue), 0, 255) << 24) | (iR & 16777215));
        i7.a<ColorFilter, ColorFilter> aVar = this.f19107i;
        if (aVar != null) {
            this.b.setColorFilter(aVar.h());
        }
        i7.a<Float, Float> aVar2 = this.f19109k;
        if (aVar2 != null) {
            float fFloatValue = aVar2.h().floatValue();
            if (fFloatValue == 0.0f) {
                this.b.setMaskFilter(null);
            } else if (fFloatValue != this.f19110l) {
                this.b.setMaskFilter(this.f19101c.y(fFloatValue));
            }
            this.f19110l = fFloatValue;
        }
        if (bVar != null) {
            bVar.c((int) (fIntValue * 255.0f), this.b);
        } else {
            this.b.clearShadowLayer();
        }
        this.f19100a.reset();
        for (int i11 = 0; i11 < this.f19104f.size(); i11++) {
            this.f19100a.addPath(this.f19104f.get(i11).getPath(), matrix);
        }
        canvas.drawPath(this.f19100a, this.b);
        if (f7.e.h()) {
            f7.e.c("FillContent#draw");
        }
    }
}
