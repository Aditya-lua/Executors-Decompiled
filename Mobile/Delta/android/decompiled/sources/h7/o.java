package h7;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import f7.h0;
import f7.o0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o implements i7.a.b, k, m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f18679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f18680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i7.a<?, PointF> f18681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i7.a<?, PointF> f18682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i7.a<?, Float> f18683h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f18686k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f18677a = new Path();
    public final RectF b = new RectF();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f18684i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i7.a<Float, Float> f18685j = null;

    public o(h0 h0Var, o7.b bVar, n7.l lVar) {
        this.f18678c = lVar.c();
        this.f18679d = lVar.f();
        this.f18680e = h0Var;
        i7.a<PointF, PointF> aVarA = lVar.d().a();
        this.f18681f = aVarA;
        i7.a<PointF, PointF> aVarA2 = lVar.e().a();
        this.f18682g = aVarA2;
        i7.d dVarA = lVar.b().a();
        this.f18683h = dVarA;
        bVar.j(aVarA);
        bVar.j(aVarA2);
        bVar.j(dVarA);
        aVarA.a(this);
        aVarA2.a(this);
        dVarA.a(this);
    }

    private void f() {
        this.f18686k = false;
        this.f18680e.invalidateSelf();
    }

    @Override // i7.a.b
    public void a() {
        f();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031 A[SYNTHETIC] */
    @Override // h7.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.k() == n7.t.a.SIMULTANEOUSLY) {
                    this.f18684i.a(uVar);
                    uVar.c(this);
                } else if (cVar instanceof q) {
                    this.f18685j = ((q) cVar).h();
                }
            } else if (cVar instanceof q) {
                this.f18685j = ((q) cVar).h();
            }
        }
    }

    @Override // l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        if (t8 == o0.f16430l) {
            this.f18682g.o(cVar);
        } else if (t8 == o0.f16432n) {
            this.f18681f.o(cVar);
        } else if (t8 == o0.f16431m) {
            this.f18683h.o(cVar);
        }
    }

    @Override // h7.c
    public String getName() {
        return this.f18678c;
    }

    @Override // h7.m
    public Path getPath() {
        i7.a<Float, Float> aVar;
        if (this.f18686k) {
            return this.f18677a;
        }
        this.f18677a.reset();
        if (this.f18679d) {
            this.f18686k = true;
            return this.f18677a;
        }
        PointF pointFH = this.f18682g.h();
        float f10 = pointFH.x / 2.0f;
        float f11 = pointFH.y / 2.0f;
        i7.a<?, Float> aVar2 = this.f18683h;
        float fR = aVar2 == null ? 0.0f : ((i7.d) aVar2).r();
        if (fR == 0.0f && (aVar = this.f18685j) != null) {
            fR = Math.min(aVar.h().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fR > fMin) {
            fR = fMin;
        }
        PointF pointFH2 = this.f18681f.h();
        this.f18677a.moveTo(pointFH2.x + f10, (pointFH2.y - f11) + fR);
        this.f18677a.lineTo(pointFH2.x + f10, (pointFH2.y + f11) - fR);
        if (fR > 0.0f) {
            RectF rectF = this.b;
            float f12 = pointFH2.x;
            float f13 = fR * 2.0f;
            float f14 = pointFH2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.f18677a.arcTo(this.b, 0.0f, 90.0f, false);
        }
        this.f18677a.lineTo((pointFH2.x - f10) + fR, pointFH2.y + f11);
        if (fR > 0.0f) {
            RectF rectF2 = this.b;
            float f15 = pointFH2.x;
            float f16 = pointFH2.y;
            float f17 = fR * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.f18677a.arcTo(this.b, 90.0f, 90.0f, false);
        }
        this.f18677a.lineTo(pointFH2.x - f10, (pointFH2.y - f11) + fR);
        if (fR > 0.0f) {
            RectF rectF3 = this.b;
            float f18 = pointFH2.x;
            float f19 = pointFH2.y;
            float f20 = fR * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.f18677a.arcTo(this.b, 180.0f, 90.0f, false);
        }
        this.f18677a.lineTo((pointFH2.x + f10) - fR, pointFH2.y - f11);
        if (fR > 0.0f) {
            RectF rectF4 = this.b;
            float f21 = pointFH2.x;
            float f22 = fR * 2.0f;
            float f23 = pointFH2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.f18677a.arcTo(this.b, 270.0f, 90.0f, false);
        }
        this.f18677a.close();
        this.f18684i.b(this.f18677a);
        this.f18686k = true;
        return this.f18677a;
    }

    @Override // l7.f
    public void h(l7.e eVar, int i10, List<l7.e> list, l7.e eVar2) {
        s7.j.k(eVar, i10, list, eVar2, this);
    }
}
