package p189i7;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import p121f7.InterfaceC5465o0;
import p288m7.C8466n;
import p324o7.AbstractC9709b;
import p444t7.C11550a;
import p444t7.C11552c;
import p444t7.C11553d;

/* JADX INFO: renamed from: i7.p */
/* JADX INFO: loaded from: classes3.dex */
public class C6658p {

    /* JADX INFO: renamed from: a */
    public final Matrix f25675a = new Matrix();

    /* JADX INFO: renamed from: b */
    public final Matrix f25676b;

    /* JADX INFO: renamed from: c */
    public final Matrix f25677c;

    /* JADX INFO: renamed from: d */
    public final Matrix f25678d;

    /* JADX INFO: renamed from: e */
    public final float[] f25679e;

    /* JADX INFO: renamed from: f */
    public AbstractC6643a<PointF, PointF> f25680f;

    /* JADX INFO: renamed from: g */
    public AbstractC6643a<?, PointF> f25681g;

    /* JADX INFO: renamed from: h */
    public AbstractC6643a<C11553d, C11553d> f25682h;

    /* JADX INFO: renamed from: i */
    public AbstractC6643a<Float, Float> f25683i;

    /* JADX INFO: renamed from: j */
    public AbstractC6643a<Integer, Integer> f25684j;

    /* JADX INFO: renamed from: k */
    public C6646d f25685k;

    /* JADX INFO: renamed from: l */
    public C6646d f25686l;

    /* JADX INFO: renamed from: m */
    public AbstractC6643a<?, Float> f25687m;

    /* JADX INFO: renamed from: n */
    public AbstractC6643a<?, Float> f25688n;

    /* JADX INFO: renamed from: o */
    public final boolean f25689o;

    public C6658p(C8466n c8466n) {
        this.f25680f = c8466n.m34244c() == null ? null : c8466n.m34244c().mo34233a();
        this.f25681g = c8466n.m34247f() == null ? null : c8466n.m34247f().mo34233a();
        this.f25682h = c8466n.m34249h() == null ? null : c8466n.m34249h().mo34233a();
        this.f25683i = c8466n.m34248g() == null ? null : c8466n.m34248g().mo34233a();
        this.f25685k = c8466n.m34250i() == null ? null : c8466n.m34250i().mo34233a();
        this.f25689o = c8466n.m34253l();
        if (this.f25685k != null) {
            this.f25676b = new Matrix();
            this.f25677c = new Matrix();
            this.f25678d = new Matrix();
            this.f25679e = new float[9];
        } else {
            this.f25676b = null;
            this.f25677c = null;
            this.f25678d = null;
            this.f25679e = null;
        }
        this.f25686l = c8466n.m34251j() == null ? null : c8466n.m34251j().mo34233a();
        if (c8466n.m34246e() != null) {
            this.f25684j = c8466n.m34246e().mo34233a();
        }
        if (c8466n.m34252k() != null) {
            this.f25687m = c8466n.m34252k().mo34233a();
        } else {
            this.f25687m = null;
        }
        if (c8466n.m34245d() != null) {
            this.f25688n = c8466n.m34245d().mo34233a();
        } else {
            this.f25688n = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m28717a(AbstractC9709b abstractC9709b) {
        abstractC9709b.m38353j(this.f25684j);
        abstractC9709b.m38353j(this.f25687m);
        abstractC9709b.m38353j(this.f25688n);
        abstractC9709b.m38353j(this.f25680f);
        abstractC9709b.m38353j(this.f25681g);
        abstractC9709b.m38353j(this.f25682h);
        abstractC9709b.m38353j(this.f25683i);
        abstractC9709b.m38353j(this.f25685k);
        abstractC9709b.m38353j(this.f25686l);
    }

    /* JADX INFO: renamed from: b */
    public void m28718b(AbstractC6643a.b bVar) {
        AbstractC6643a<Integer, Integer> abstractC6643a = this.f25684j;
        if (abstractC6643a != null) {
            abstractC6643a.m28661a(bVar);
        }
        AbstractC6643a<?, Float> abstractC6643a2 = this.f25687m;
        if (abstractC6643a2 != null) {
            abstractC6643a2.m28661a(bVar);
        }
        AbstractC6643a<?, Float> abstractC6643a3 = this.f25688n;
        if (abstractC6643a3 != null) {
            abstractC6643a3.m28661a(bVar);
        }
        AbstractC6643a<PointF, PointF> abstractC6643a4 = this.f25680f;
        if (abstractC6643a4 != null) {
            abstractC6643a4.m28661a(bVar);
        }
        AbstractC6643a<?, PointF> abstractC6643a5 = this.f25681g;
        if (abstractC6643a5 != null) {
            abstractC6643a5.m28661a(bVar);
        }
        AbstractC6643a<C11553d, C11553d> abstractC6643a6 = this.f25682h;
        if (abstractC6643a6 != null) {
            abstractC6643a6.m28661a(bVar);
        }
        AbstractC6643a<Float, Float> abstractC6643a7 = this.f25683i;
        if (abstractC6643a7 != null) {
            abstractC6643a7.m28661a(bVar);
        }
        C6646d c6646d = this.f25685k;
        if (c6646d != null) {
            c6646d.m28661a(bVar);
        }
        C6646d c6646d2 = this.f25686l;
        if (c6646d2 != null) {
            c6646d2.m28661a(bVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public <T> boolean m28719c(T t8, C11552c<T> c11552c) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (t8 == InterfaceC5465o0.f21166f) {
            AbstractC6643a<PointF, PointF> abstractC6643a = this.f25680f;
            if (abstractC6643a == null) {
                this.f25680f = new C6659q(c11552c, new PointF());
                return true;
            }
            abstractC6643a.m28675o(c11552c);
            return true;
        }
        if (t8 == InterfaceC5465o0.f21167g) {
            AbstractC6643a<?, PointF> abstractC6643a2 = this.f25681g;
            if (abstractC6643a2 == null) {
                this.f25681g = new C6659q(c11552c, new PointF());
                return true;
            }
            abstractC6643a2.m28675o(c11552c);
            return true;
        }
        if (t8 == InterfaceC5465o0.f21168h) {
            AbstractC6643a<?, PointF> abstractC6643a3 = this.f25681g;
            if (abstractC6643a3 instanceof C6656n) {
                ((C6656n) abstractC6643a3).m28712t(c11552c);
                return true;
            }
        }
        if (t8 == InterfaceC5465o0.f21169i) {
            AbstractC6643a<?, PointF> abstractC6643a4 = this.f25681g;
            if (abstractC6643a4 instanceof C6656n) {
                ((C6656n) abstractC6643a4).m28713u(c11552c);
                return true;
            }
        }
        if (t8 == InterfaceC5465o0.f21175o) {
            AbstractC6643a<C11553d, C11553d> abstractC6643a5 = this.f25682h;
            if (abstractC6643a5 == null) {
                this.f25682h = new C6659q(c11552c, new C11553d());
                return true;
            }
            abstractC6643a5.m28675o(c11552c);
            return true;
        }
        if (t8 == InterfaceC5465o0.f21176p) {
            AbstractC6643a<Float, Float> abstractC6643a6 = this.f25683i;
            if (abstractC6643a6 == null) {
                this.f25683i = new C6659q(c11552c, fValueOf2);
                return true;
            }
            abstractC6643a6.m28675o(c11552c);
            return true;
        }
        if (t8 == InterfaceC5465o0.f21163c) {
            AbstractC6643a<Integer, Integer> abstractC6643a7 = this.f25684j;
            if (abstractC6643a7 == null) {
                this.f25684j = new C6659q(c11552c, 100);
                return true;
            }
            abstractC6643a7.m28675o(c11552c);
            return true;
        }
        if (t8 == InterfaceC5465o0.f21147C) {
            AbstractC6643a<?, Float> abstractC6643a8 = this.f25687m;
            if (abstractC6643a8 == null) {
                this.f25687m = new C6659q(c11552c, fValueOf);
                return true;
            }
            abstractC6643a8.m28675o(c11552c);
            return true;
        }
        if (t8 == InterfaceC5465o0.f21148D) {
            AbstractC6643a<?, Float> abstractC6643a9 = this.f25688n;
            if (abstractC6643a9 == null) {
                this.f25688n = new C6659q(c11552c, fValueOf);
                return true;
            }
            abstractC6643a9.m28675o(c11552c);
            return true;
        }
        if (t8 == InterfaceC5465o0.f21177q) {
            if (this.f25685k == null) {
                this.f25685k = new C6646d(Collections.singletonList(new C11550a(fValueOf2)));
            }
            this.f25685k.m28675o(c11552c);
            return true;
        }
        if (t8 != InterfaceC5465o0.f21178r) {
            return false;
        }
        if (this.f25686l == null) {
            this.f25686l = new C6646d(Collections.singletonList(new C11550a(fValueOf2)));
        }
        this.f25686l.m28675o(c11552c);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m28720d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f25679e[i10] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: e */
    public AbstractC6643a<?, Float> m28721e() {
        return this.f25688n;
    }

    /* JADX INFO: renamed from: f */
    public Matrix m28722f() {
        PointF pointFMo28668h;
        C11553d c11553dMo28668h;
        PointF pointFMo28668h2;
        this.f25675a.reset();
        AbstractC6643a<?, PointF> abstractC6643a = this.f25681g;
        if (abstractC6643a != null && (pointFMo28668h2 = abstractC6643a.mo28668h()) != null) {
            float f10 = pointFMo28668h2.x;
            if (f10 != 0.0f || pointFMo28668h2.y != 0.0f) {
                this.f25675a.preTranslate(f10, pointFMo28668h2.y);
            }
        }
        if (!this.f25689o) {
            AbstractC6643a<Float, Float> abstractC6643a2 = this.f25683i;
            if (abstractC6643a2 != null) {
                float fFloatValue = abstractC6643a2 instanceof C6659q ? abstractC6643a2.mo28668h().floatValue() : ((C6646d) abstractC6643a2).m28693r();
                if (fFloatValue != 0.0f) {
                    this.f25675a.preRotate(fFloatValue);
                }
            }
        } else if (abstractC6643a != null) {
            float fM28666f = abstractC6643a.m28666f();
            PointF pointFMo28668h3 = abstractC6643a.mo28668h();
            float f11 = pointFMo28668h3.x;
            float f12 = pointFMo28668h3.y;
            abstractC6643a.mo28674n(1.0E-4f + fM28666f);
            PointF pointFMo28668h4 = abstractC6643a.mo28668h();
            abstractC6643a.mo28674n(fM28666f);
            this.f25675a.preRotate((float) Math.toDegrees(Math.atan2(pointFMo28668h4.y - f12, pointFMo28668h4.x - f11)));
        }
        C6646d c6646d = this.f25685k;
        if (c6646d != null) {
            C6646d c6646d2 = this.f25686l;
            float fCos = c6646d2 == null ? 0.0f : (float) Math.cos(Math.toRadians((-c6646d2.m28693r()) + 90.0f));
            C6646d c6646d3 = this.f25686l;
            float fSin = c6646d3 == null ? 1.0f : (float) Math.sin(Math.toRadians((-c6646d3.m28693r()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(c6646d.m28693r()));
            m28720d();
            float[] fArr = this.f25679e;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f13 = -fSin;
            fArr[3] = f13;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f25676b.setValues(fArr);
            m28720d();
            float[] fArr2 = this.f25679e;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f25677c.setValues(fArr2);
            m28720d();
            float[] fArr3 = this.f25679e;
            fArr3[0] = fCos;
            fArr3[1] = f13;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f25678d.setValues(fArr3);
            this.f25677c.preConcat(this.f25676b);
            this.f25678d.preConcat(this.f25677c);
            this.f25675a.preConcat(this.f25678d);
        }
        AbstractC6643a<C11553d, C11553d> abstractC6643a3 = this.f25682h;
        if (abstractC6643a3 != null && (c11553dMo28668h = abstractC6643a3.mo28668h()) != null && (c11553dMo28668h.m43198b() != 1.0f || c11553dMo28668h.m43199c() != 1.0f)) {
            this.f25675a.preScale(c11553dMo28668h.m43198b(), c11553dMo28668h.m43199c());
        }
        AbstractC6643a<PointF, PointF> abstractC6643a4 = this.f25680f;
        if (abstractC6643a4 != null && (pointFMo28668h = abstractC6643a4.mo28668h()) != null) {
            float f14 = pointFMo28668h.x;
            if (f14 != 0.0f || pointFMo28668h.y != 0.0f) {
                this.f25675a.preTranslate(-f14, -pointFMo28668h.y);
            }
        }
        return this.f25675a;
    }

    /* JADX INFO: renamed from: g */
    public Matrix m28723g(float f10) {
        AbstractC6643a<?, PointF> abstractC6643a = this.f25681g;
        PointF pointFMo28668h = abstractC6643a == null ? null : abstractC6643a.mo28668h();
        AbstractC6643a<C11553d, C11553d> abstractC6643a2 = this.f25682h;
        C11553d c11553dMo28668h = abstractC6643a2 == null ? null : abstractC6643a2.mo28668h();
        this.f25675a.reset();
        if (pointFMo28668h != null) {
            this.f25675a.preTranslate(pointFMo28668h.x * f10, pointFMo28668h.y * f10);
        }
        if (c11553dMo28668h != null) {
            double d10 = f10;
            this.f25675a.preScale((float) Math.pow(c11553dMo28668h.m43198b(), d10), (float) Math.pow(c11553dMo28668h.m43199c(), d10));
        }
        AbstractC6643a<Float, Float> abstractC6643a3 = this.f25683i;
        if (abstractC6643a3 != null) {
            float fFloatValue = abstractC6643a3.mo28668h().floatValue();
            AbstractC6643a<PointF, PointF> abstractC6643a4 = this.f25680f;
            PointF pointFMo28668h2 = abstractC6643a4 != null ? abstractC6643a4.mo28668h() : null;
            this.f25675a.preRotate(fFloatValue * f10, pointFMo28668h2 == null ? 0.0f : pointFMo28668h2.x, pointFMo28668h2 != null ? pointFMo28668h2.y : 0.0f);
        }
        return this.f25675a;
    }

    /* JADX INFO: renamed from: h */
    public AbstractC6643a<?, Integer> m28724h() {
        return this.f25684j;
    }

    /* JADX INFO: renamed from: i */
    public AbstractC6643a<?, Float> m28725i() {
        return this.f25687m;
    }

    /* JADX INFO: renamed from: j */
    public void m28726j(float f10) {
        AbstractC6643a<Integer, Integer> abstractC6643a = this.f25684j;
        if (abstractC6643a != null) {
            abstractC6643a.mo28674n(f10);
        }
        AbstractC6643a<?, Float> abstractC6643a2 = this.f25687m;
        if (abstractC6643a2 != null) {
            abstractC6643a2.mo28674n(f10);
        }
        AbstractC6643a<?, Float> abstractC6643a3 = this.f25688n;
        if (abstractC6643a3 != null) {
            abstractC6643a3.mo28674n(f10);
        }
        AbstractC6643a<PointF, PointF> abstractC6643a4 = this.f25680f;
        if (abstractC6643a4 != null) {
            abstractC6643a4.mo28674n(f10);
        }
        AbstractC6643a<?, PointF> abstractC6643a5 = this.f25681g;
        if (abstractC6643a5 != null) {
            abstractC6643a5.mo28674n(f10);
        }
        AbstractC6643a<C11553d, C11553d> abstractC6643a6 = this.f25682h;
        if (abstractC6643a6 != null) {
            abstractC6643a6.mo28674n(f10);
        }
        AbstractC6643a<Float, Float> abstractC6643a7 = this.f25683i;
        if (abstractC6643a7 != null) {
            abstractC6643a7.mo28674n(f10);
        }
        C6646d c6646d = this.f25685k;
        if (c6646d != null) {
            c6646d.mo28674n(f10);
        }
        C6646d c6646d2 = this.f25686l;
        if (c6646d2 != null) {
            c6646d2.mo28674n(f10);
        }
    }
}
