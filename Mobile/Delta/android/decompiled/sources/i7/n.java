package i7;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class n extends a<PointF, PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f20322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f20323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a<Float, Float> f20324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a<Float, Float> f20325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t7.c<Float> f20326m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t7.c<Float> f20327n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.EMPTY_LIST);
        this.f20322i = new PointF();
        this.f20323j = new PointF();
        this.f20324k = aVar;
        this.f20325l = aVar2;
        n(f());
    }

    @Override // i7.a
    public void n(float f10) {
        this.f20324k.n(f10);
        this.f20325l.n(f10);
        this.f20322i.set(this.f20324k.h().floatValue(), this.f20325l.h().floatValue());
        for (int i10 = 0; i10 < this.f20285a.size(); i10++) {
            this.f20285a.get(i10).a();
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
        if (this.f20326m == null || (aVarB2 = this.f20324k.b()) == null) {
            fB = null;
        } else {
            Float f11 = aVarB2.f31676h;
            t7.c<Float> cVar = this.f20326m;
            float f12 = aVarB2.f31675g;
            fB = cVar.b(f12, f11 == null ? f12 : f11.floatValue(), aVarB2.b, aVarB2.f31671c, this.f20324k.d(), this.f20324k.e(), this.f20324k.f());
        }
        if (this.f20327n != null && (aVarB = this.f20325l.b()) != null) {
            Float f13 = aVarB.f31676h;
            t7.c<Float> cVar2 = this.f20327n;
            float f14 = aVarB.f31675g;
            fB2 = cVar2.b(f14, f13 == null ? f14 : f13.floatValue(), aVarB.b, aVarB.f31671c, this.f20325l.d(), this.f20325l.e(), this.f20325l.f());
        }
        if (fB == null) {
            this.f20323j.set(this.f20322i.x, 0.0f);
        } else {
            this.f20323j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f20323j;
            pointF.set(pointF.x, this.f20322i.y);
        } else {
            PointF pointF2 = this.f20323j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f20323j;
    }

    public void t(t7.c<Float> cVar) {
        t7.c<Float> cVar2 = this.f20326m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20326m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void u(t7.c<Float> cVar) {
        t7.c<Float> cVar2 = this.f20327n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20327n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
