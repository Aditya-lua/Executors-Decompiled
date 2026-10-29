package p189i7;

import android.graphics.PointF;
import java.util.Collections;
import p444t7.C11550a;
import p444t7.C11552c;

/* JADX INFO: renamed from: i7.n */
/* JADX INFO: loaded from: classes3.dex */
public class C6656n extends AbstractC6643a<PointF, PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f25665i;

    /* JADX INFO: renamed from: j */
    public final PointF f25666j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6643a<Float, Float> f25667k;

    /* JADX INFO: renamed from: l */
    public final AbstractC6643a<Float, Float> f25668l;

    /* JADX INFO: renamed from: m */
    public C11552c<Float> f25669m;

    /* JADX INFO: renamed from: n */
    public C11552c<Float> f25670n;

    public C6656n(AbstractC6643a<Float, Float> abstractC6643a, AbstractC6643a<Float, Float> abstractC6643a2) {
        super(Collections.EMPTY_LIST);
        this.f25665i = new PointF();
        this.f25666j = new PointF();
        this.f25667k = abstractC6643a;
        this.f25668l = abstractC6643a2;
        mo28674n(m28666f());
    }

    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: n */
    public void mo28674n(float f10) {
        this.f25667k.mo28674n(f10);
        this.f25668l.mo28674n(f10);
        this.f25665i.set(this.f25667k.mo28668h().floatValue(), this.f25668l.mo28668h().floatValue());
        for (int i10 = 0; i10 < this.f25623a.size(); i10++) {
            this.f25623a.get(i10).mo27575a();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: h()Ljava/lang/Object; */
    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF mo28668h() {
        return mo28669i(null, 0.0f);
    }

    /* JADX DEBUG: Method merged with bridge method: i(Lt7/a;F)Ljava/lang/Object; */
    @Override // p189i7.AbstractC6643a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public PointF mo28669i(C11550a<PointF> c11550a, float f10) {
        Float fM43195b;
        C11550a<Float> c11550aM28662b;
        C11550a<Float> c11550aM28662b2;
        Float fM43195b2 = null;
        if (this.f25669m == null || (c11550aM28662b2 = this.f25667k.m28662b()) == null) {
            fM43195b = null;
        } else {
            Float f11 = c11550aM28662b2.f40895h;
            C11552c<Float> c11552c = this.f25669m;
            float f12 = c11550aM28662b2.f40894g;
            fM43195b = c11552c.m43195b(f12, f11 == null ? f12 : f11.floatValue(), c11550aM28662b2.f40889b, c11550aM28662b2.f40890c, this.f25667k.m28664d(), this.f25667k.m28665e(), this.f25667k.m28666f());
        }
        if (this.f25670n != null && (c11550aM28662b = this.f25668l.m28662b()) != null) {
            Float f13 = c11550aM28662b.f40895h;
            C11552c<Float> c11552c2 = this.f25670n;
            float f14 = c11550aM28662b.f40894g;
            fM43195b2 = c11552c2.m43195b(f14, f13 == null ? f14 : f13.floatValue(), c11550aM28662b.f40889b, c11550aM28662b.f40890c, this.f25668l.m28664d(), this.f25668l.m28665e(), this.f25668l.m28666f());
        }
        if (fM43195b == null) {
            this.f25666j.set(this.f25665i.x, 0.0f);
        } else {
            this.f25666j.set(fM43195b.floatValue(), 0.0f);
        }
        if (fM43195b2 == null) {
            PointF pointF = this.f25666j;
            pointF.set(pointF.x, this.f25665i.y);
        } else {
            PointF pointF2 = this.f25666j;
            pointF2.set(pointF2.x, fM43195b2.floatValue());
        }
        return this.f25666j;
    }

    /* JADX INFO: renamed from: t */
    public void m28712t(C11552c<Float> c11552c) {
        C11552c<Float> c11552c2 = this.f25669m;
        if (c11552c2 != null) {
            c11552c2.m43196c(null);
        }
        this.f25669m = c11552c;
        if (c11552c != null) {
            c11552c.m43196c(this);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m28713u(C11552c<Float> c11552c) {
        C11552c<Float> c11552c2 = this.f25670n;
        if (c11552c2 != null) {
            c11552c2.m43196c(null);
        }
        this.f25670n = c11552c;
        if (c11552c != null) {
            c11552c.m43196c(this);
        }
    }
}
