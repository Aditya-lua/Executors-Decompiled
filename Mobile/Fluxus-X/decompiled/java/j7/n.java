package j7;

import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public class n extends a<PointF, PointF> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PointF f20124i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final PointF f20125j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a<Float, Float> f20126k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a<Float, Float> f20127l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public u7.c<Float> f20128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u7.c<Float> f20129n;

    public n(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.EMPTY_LIST);
        this.f20124i = new PointF();
        this.f20125j = new PointF();
        this.f20126k = aVar;
        this.f20127l = aVar2;
        n(f());
    }

    @Override // j7.a
    public void n(float f10) {
        this.f20126k.n(f10);
        this.f20127l.n(f10);
        this.f20124i.set(this.f20126k.h().floatValue(), this.f20127l.h().floatValue());
        for (int i10 = 0; i10 < this.f20087a.size(); i10++) {
            this.f20087a.get(i10).a();
        }
    }

    @Override // j7.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    @Override // j7.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF i(u7.a<PointF> aVar, float f10) {
        Float fB;
        u7.a<Float> aVarB;
        u7.a<Float> aVarB2;
        Float fB2 = null;
        if (this.f20128m == null || (aVarB2 = this.f20126k.b()) == null) {
            fB = null;
        } else {
            Float f11 = aVarB2.f33242h;
            u7.c<Float> cVar = this.f20128m;
            float f12 = aVarB2.f33241g;
            fB = cVar.b(f12, f11 == null ? f12 : f11.floatValue(), aVarB2.b, aVarB2.f33237c, this.f20126k.d(), this.f20126k.e(), this.f20126k.f());
        }
        if (this.f20129n != null && (aVarB = this.f20127l.b()) != null) {
            Float f13 = aVarB.f33242h;
            u7.c<Float> cVar2 = this.f20129n;
            float f14 = aVarB.f33241g;
            fB2 = cVar2.b(f14, f13 == null ? f14 : f13.floatValue(), aVarB.b, aVarB.f33237c, this.f20127l.d(), this.f20127l.e(), this.f20127l.f());
        }
        if (fB == null) {
            this.f20125j.set(this.f20124i.x, 0.0f);
        } else {
            this.f20125j.set(fB.floatValue(), 0.0f);
        }
        if (fB2 == null) {
            PointF pointF = this.f20125j;
            pointF.set(pointF.x, this.f20124i.y);
        } else {
            PointF pointF2 = this.f20125j;
            pointF2.set(pointF2.x, fB2.floatValue());
        }
        return this.f20125j;
    }

    public void t(u7.c<Float> cVar) {
        u7.c<Float> cVar2 = this.f20128m;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20128m = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void u(u7.c<Float> cVar) {
        u7.c<Float> cVar2 = this.f20129n;
        if (cVar2 != null) {
            cVar2.c(null);
        }
        this.f20129n = cVar;
        if (cVar != null) {
            cVar.c(this);
        }
    }
}
