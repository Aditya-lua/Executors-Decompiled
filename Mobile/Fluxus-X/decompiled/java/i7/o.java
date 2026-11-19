package i7;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import g7.h0;
import g7.o0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o implements j7.a.b, k, m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f19237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j7.a<?, PointF> f19238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j7.a<?, PointF> f19239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j7.a<?, Float> f19240h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19243k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19234a = new Path();
    public final RectF b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f19241i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j7.a<Float, Float> f19242j = null;

    public o(h0 h0Var, p7.b bVar, o7.l lVar) {
        this.f19235c = lVar.c();
        this.f19236d = lVar.f();
        this.f19237e = h0Var;
        j7.a<PointF, PointF> aVarA = lVar.d().a();
        this.f19238f = aVarA;
        j7.a<PointF, PointF> aVarA2 = lVar.e().a();
        this.f19239g = aVarA2;
        j7.d dVarA = lVar.b().a();
        this.f19240h = dVarA;
        bVar.j(aVarA);
        bVar.j(aVarA2);
        bVar.j(dVarA);
        aVarA.a(this);
        aVarA2.a(this);
        dVarA.a(this);
    }

    private void h() {
        this.f19243k = false;
        this.f19237e.invalidateSelf();
    }

    @Override // j7.a.b
    public void a() {
        h();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // i7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == o7.t.a.SIMULTANEOUSLY) {
                    this.f19241i.a(uVar);
                    uVar.c(this);
                } else if (cVar instanceof q) {
                    this.f19242j = ((q) cVar).h();
                }
            } else if (cVar instanceof q) {
                this.f19242j = ((q) cVar).h();
            }
        }
    }

    @Override // m7.f
    public void c(m7.e eVar, int i10, List<m7.e> list, m7.e eVar2) {
        t7.j.k(eVar, i10, list, eVar2, this);
    }

    @Override // m7.f
    public <T> void e(T t8, u7.c<T> cVar) {
        if (t8 == o0.f17509l) {
            this.f19239g.o(cVar);
        } else if (t8 == o0.f17511n) {
            this.f19238f.o(cVar);
        } else if (t8 == o0.f17510m) {
            this.f19240h.o(cVar);
        }
    }

    @Override // i7.c
    public String getName() {
        return this.f19235c;
    }

    @Override // i7.m
    public Path x() {
        j7.a<Float, Float> aVar;
        if (this.f19243k) {
            return this.f19234a;
        }
        this.f19234a.reset();
        if (this.f19236d) {
            this.f19243k = true;
            return this.f19234a;
        }
        PointF pointFH = this.f19239g.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        j7.a<?, Float> aVar2 = this.f19240h;
        float fR = aVar2 == null ? 0.0f : ((j7.d) aVar2).r();
        if (fR == 0.0f && (aVar = this.f19242j) != null) {
            fR = Math.min(aVar.h().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fR > fMin) {
            fR = fMin;
        }
        PointF pointFH2 = this.f19238f.h();
        this.f19234a.moveTo(pointFH2.x + f10, (pointFH2.y - f11) + fR);
        this.f19234a.lineTo(pointFH2.x + f10, (pointFH2.y + f11) - fR);
        if (fR > 0.0f) {
            RectF rectF = this.b;
            float f12 = pointFH2.x;
            float f13 = fR * 2.0f;
            float f14 = pointFH2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f19234a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.f19234a.lineTo((pointFH2.x - f10) + fR, pointFH2.y + f11);
        if (fR > 0.0f) {
            RectF rectF2 = this.b;
            float f15 = pointFH2.x;
            float f16 = pointFH2.y;
            float f17 = fR * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f19234a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.f19234a.lineTo(pointFH2.x - f10, (pointFH2.y - f11) + fR);
        if (fR > 0.0f) {
            RectF rectF3 = this.b;
            float f18 = pointFH2.x;
            float f19 = pointFH2.y;
            float f20 = fR * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f19234a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.f19234a.lineTo((pointFH2.x + f10) - fR, pointFH2.y - f11);
        if (fR > 0.0f) {
            RectF rectF4 = this.b;
            float f21 = pointFH2.x;
            float f22 = fR * 2.0f;
            float f23 = pointFH2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f19234a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.f19234a.close();
        this.f19241i.b(this.f19234a);
        this.f19243k = true;
        return this.f19234a;
    }
}
