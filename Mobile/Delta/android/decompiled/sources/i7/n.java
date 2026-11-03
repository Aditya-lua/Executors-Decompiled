package i7;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class n extends a<PointF, PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f20438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f20439j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a<Float, Float> f20440k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a<Float, Float> f20441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t7.c<Float> f20442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t7.c<Float> f20443n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.EMPTY_LIST);
        this.f20438i = new PointF();
        this.f20439j = new PointF();
        this.f20440k = aVar;
        this.f20441l = aVar2;
        n(f());
    }

    @Override // i7.a
    public void n(float f10) {
        this.f20440k.n(f10);
        this.f20441l.n(f10);
        this.f20438i.set(this.f20440k.h().floatValue(), this.f20441l.h().floatValue());
        for (int i10 = 0; i10 < this.f20401a.size(); i10++) {
            this.f20401a.get(i10).a();
        }
    }

    @Override // i7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // i7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(t7.a<PointF> aVar, float f10) {
        Float fB;
        t7.a<Float> aVarB;
        t7.a<Float> aVarB2;
        Float fB2 = null;
        if (this.f20442m == null || (aVarB2 = this.f20440k.b()) == null) {
            fB = null;
        } else {
            Float f11 = aVarB2.f32195h;
            t7.c<Float> cVar = this.f20442m;
            float f12 = aVarB2.f32194g;
            fB = cVar.b(f12, f11 == null ? f12 : f11.floatValue(), aVarB2.b, aVarB2.f32190c, this.f20440k.d(), this.f20440k.e(), this.f20440k.f());
        }
        if (this.f20443n != null && (aVarB = this.f20441l.b()) != null) {
            Float f13 = aVarB.f32195h;
            t7.c<Float> cVar2 = this.f20443n;
            float f14 = aVarB.f32194g;
            fB2 = cVar2.b(f14, f13 == null ? f14 : f13.floatValue(), aVarB.b, aVarB.f32190c, this.f20441l.d(), this.f20441l.e(), this.f20441l.f());
        }
        if (fB == null) {
            this.f20439j.set(this.f20438i.x, 0.0f);
        } else {
            this.f20439j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f20439j;
            pointF.set(pointF.x, this.f20438i.y);
        } else {
            PointF pointF2 = this.f20439j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f20439j;
    }

    public void t(t7.c<Float> cVar) {
        t7.c<Float> cVar2 = this.f20442m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20442m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void u(t7.c<Float> cVar) {
        t7.c<Float> cVar2 = this.f20443n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20443n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
