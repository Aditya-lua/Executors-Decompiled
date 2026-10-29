package p162h7;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import p121f7.C5444e;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p147g7.C6047a;
import p189i7.AbstractC6643a;
import p189i7.C6646d;
import p189i7.C6659q;
import p266l7.C8006e;
import p288m7.C8454b;
import p288m7.C8456d;
import p303n7.C8914t;
import p324o7.AbstractC9709b;
import p431s7.C11186b;
import p431s7.C11194j;
import p431s7.C11197m;
import p444t7.C11552c;

/* JADX INFO: renamed from: h7.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6294a implements AbstractC6643a.b, InterfaceC6304k, InterfaceC6298e {

    /* JADX INFO: renamed from: e */
    public final C5451h0 f23883e;

    /* JADX INFO: renamed from: f */
    public final AbstractC9709b f23884f;

    /* JADX INFO: renamed from: h */
    public final float[] f23886h;

    /* JADX INFO: renamed from: i */
    public final Paint f23887i;

    /* JADX INFO: renamed from: j */
    public final AbstractC6643a<?, Float> f23888j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6643a<?, Integer> f23889k;

    /* JADX INFO: renamed from: l */
    public final List<AbstractC6643a<?, Float>> f23890l;

    /* JADX INFO: renamed from: m */
    public final AbstractC6643a<?, Float> f23891m;

    /* JADX INFO: renamed from: n */
    public AbstractC6643a<ColorFilter, ColorFilter> f23892n;

    /* JADX INFO: renamed from: o */
    public AbstractC6643a<Float, Float> f23893o;

    /* JADX INFO: renamed from: p */
    public float f23894p;

    /* JADX INFO: renamed from: a */
    public final PathMeasure f23879a = new PathMeasure();

    /* JADX INFO: renamed from: b */
    public final Path f23880b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f23881c = new Path();

    /* JADX INFO: renamed from: d */
    public final RectF f23882d = new RectF();

    /* JADX INFO: renamed from: g */
    public final List<b> f23885g = new ArrayList();

    /* JADX INFO: renamed from: h7.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC6306m> f23895a;

        /* JADX INFO: renamed from: b */
        public final C6314u f23896b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(C6314u c6314u) {
            this.f23895a = new ArrayList();
            this.f23896b = c6314u;
        }
    }

    public AbstractC6294a(C5451h0 c5451h0, AbstractC9709b abstractC9709b, Paint.Cap cap, Paint.Join join, float f10, C8456d c8456d, C8454b c8454b, List<C8454b> list, C8454b c8454b2) {
        C6047a c6047a = new C6047a(1);
        this.f23887i = c6047a;
        this.f23894p = 0.0f;
        this.f23883e = c5451h0;
        this.f23884f = abstractC9709b;
        c6047a.setStyle(Paint.Style.STROKE);
        c6047a.setStrokeCap(cap);
        c6047a.setStrokeJoin(join);
        c6047a.setStrokeMiter(f10);
        this.f23889k = c8456d.mo34233a();
        this.f23888j = c8454b.mo34233a();
        if (c8454b2 == null) {
            this.f23891m = null;
        } else {
            this.f23891m = c8454b2.mo34233a();
        }
        this.f23890l = new ArrayList(list.size());
        this.f23886h = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f23890l.add(list.get(i10).mo34233a());
        }
        abstractC9709b.m38353j(this.f23889k);
        abstractC9709b.m38353j(this.f23888j);
        for (int i11 = 0; i11 < this.f23890l.size(); i11++) {
            abstractC9709b.m38353j(this.f23890l.get(i11));
        }
        AbstractC6643a<?, Float> abstractC6643a = this.f23891m;
        if (abstractC6643a != null) {
            abstractC9709b.m38353j(abstractC6643a);
        }
        this.f23889k.m28661a(this);
        this.f23888j.m28661a(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f23890l.get(i12).m28661a(this);
        }
        AbstractC6643a<?, Float> abstractC6643a2 = this.f23891m;
        if (abstractC6643a2 != null) {
            abstractC6643a2.m28661a(this);
        }
        if (abstractC9709b.mo38366x() != null) {
            C6646d c6646dMo34233a = abstractC9709b.mo38366x().m35837a().mo34233a();
            this.f23893o = c6646dMo34233a;
            c6646dMo34233a.m28661a(this);
            abstractC9709b.m38353j(this.f23893o);
        }
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        this.f23883e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069 A[SYNTHETIC] */
    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        C6314u c6314u = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            InterfaceC6296c interfaceC6296c = list.get(size);
            if (interfaceC6296c instanceof C6314u) {
                C6314u c6314u2 = (C6314u) interfaceC6296c;
                if (c6314u2.m27620k() == C8914t.a.INDIVIDUALLY) {
                    c6314u = c6314u2;
                }
            }
        }
        if (c6314u != null) {
            c6314u.m27616c(this);
        }
        b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            InterfaceC6296c interfaceC6296c2 = list2.get(size2);
            if (interfaceC6296c2 instanceof C6314u) {
                C6314u c6314u3 = (C6314u) interfaceC6296c2;
                if (c6314u3.m27620k() == C8914t.a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f23885g.add(bVar);
                    }
                    bVar = new b(c6314u3);
                    c6314u3.m27616c(this);
                } else if (!(interfaceC6296c2 instanceof InterfaceC6306m)) {
                    if (bVar == null) {
                        bVar = new b(c6314u);
                    }
                    bVar.f23895a.add((InterfaceC6306m) interfaceC6296c2);
                }
            } else if (!(interfaceC6296c2 instanceof InterfaceC6306m)) {
                if (bVar == null) {
                    bVar = new b(c6314u);
                }
                bVar.f23895a.add((InterfaceC6306m) interfaceC6296c2);
            }
        }
        if (bVar != null) {
            this.f23885g.add(bVar);
        }
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        if (t8 == InterfaceC5465o0.f21164d) {
            this.f23889k.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21179s) {
            this.f23888j.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21155K) {
            AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a = this.f23892n;
            if (abstractC6643a != null) {
                this.f23884f.m38345H(abstractC6643a);
            }
            if (c11552c == null) {
                this.f23892n = null;
                return;
            }
            C6659q c6659q = new C6659q(c11552c);
            this.f23892n = c6659q;
            c6659q.m28661a(this);
            this.f23884f.m38353j(this.f23892n);
            return;
        }
        if (t8 == InterfaceC5465o0.f21170j) {
            AbstractC6643a<Float, Float> abstractC6643a2 = this.f23893o;
            if (abstractC6643a2 != null) {
                abstractC6643a2.m28675o(c11552c);
                return;
            }
            C6659q c6659q2 = new C6659q(c11552c);
            this.f23893o = c6659q2;
            c6659q2.m28661a(this);
            this.f23884f.m38353j(this.f23893o);
        }
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        if (C5444e.m24929h()) {
            C5444e.m24923b("StrokeContent#getBounds");
        }
        this.f23880b.reset();
        for (int i10 = 0; i10 < this.f23885g.size(); i10++) {
            b bVar = this.f23885g.get(i10);
            for (int i11 = 0; i11 < bVar.f23895a.size(); i11++) {
                this.f23880b.addPath(((InterfaceC6306m) bVar.f23895a.get(i11)).getPath(), matrix);
            }
        }
        this.f23880b.computeBounds(this.f23882d, false);
        float fM28693r = ((C6646d) this.f23888j).m28693r();
        RectF rectF2 = this.f23882d;
        float f10 = fM28693r / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.f23882d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (C5444e.m24929h()) {
            C5444e.m24924c("StrokeContent#getBounds");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m27579f() {
        if (C5444e.m24929h()) {
            C5444e.m24923b("StrokeContent#applyDashPattern");
        }
        if (this.f23890l.isEmpty()) {
            if (C5444e.m24929h()) {
                C5444e.m24924c("StrokeContent#applyDashPattern");
                return;
            }
            return;
        }
        for (int i10 = 0; i10 < this.f23890l.size(); i10++) {
            this.f23886h[i10] = this.f23890l.get(i10).mo28668h().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.f23886h;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f23886h;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
        }
        AbstractC6643a<?, Float> abstractC6643a = this.f23891m;
        this.f23887i.setPathEffect(new DashPathEffect(this.f23886h, abstractC6643a == null ? 0.0f : abstractC6643a.mo28668h().floatValue()));
        if (C5444e.m24929h()) {
            C5444e.m24924c("StrokeContent#applyDashPattern");
        }
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        C11194j.m42193k(c8006e, i10, list, c8006e2, this);
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: i */
    public void mo27581i(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        if (C5444e.m24929h()) {
            C5444e.m24923b("StrokeContent#draw");
        }
        if (C11197m.m42219h(matrix)) {
            if (C5444e.m24929h()) {
                C5444e.m24924c("StrokeContent#draw");
                return;
            }
            return;
        }
        float fIntValue = this.f23889k.mo28668h().intValue() / 100.0f;
        this.f23887i.setAlpha(C11194j.m42185c((int) (i10 * fIntValue), 0, 255));
        this.f23887i.setStrokeWidth(((C6646d) this.f23888j).m28693r());
        if (this.f23887i.getStrokeWidth() <= 0.0f) {
            if (C5444e.m24929h()) {
                C5444e.m24924c("StrokeContent#draw");
                return;
            }
            return;
        }
        m27579f();
        AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a = this.f23892n;
        if (abstractC6643a != null) {
            this.f23887i.setColorFilter(abstractC6643a.mo28668h());
        }
        AbstractC6643a<Float, Float> abstractC6643a2 = this.f23893o;
        if (abstractC6643a2 != null) {
            float fFloatValue = abstractC6643a2.mo28668h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f23887i.setMaskFilter(null);
            } else if (fFloatValue != this.f23894p) {
                this.f23887i.setMaskFilter(this.f23884f.m38367y(fFloatValue));
            }
            this.f23894p = fFloatValue;
        }
        if (c11186b != null) {
            c11186b.m42138c((int) (fIntValue * 255.0f), this.f23887i);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i11 = 0; i11 < this.f23885g.size(); i11++) {
            b bVar = this.f23885g.get(i11);
            if (bVar.f23896b != null) {
                m27582j(canvas, bVar);
            } else {
                if (C5444e.m24929h()) {
                    C5444e.m24923b("StrokeContent#buildPath");
                }
                this.f23880b.reset();
                for (int size = bVar.f23895a.size() - 1; size >= 0; size--) {
                    this.f23880b.addPath(((InterfaceC6306m) bVar.f23895a.get(size)).getPath());
                }
                if (C5444e.m24929h()) {
                    C5444e.m24924c("StrokeContent#buildPath");
                    C5444e.m24923b("StrokeContent#drawPath");
                }
                canvas.drawPath(this.f23880b, this.f23887i);
                if (C5444e.m24929h()) {
                    C5444e.m24924c("StrokeContent#drawPath");
                }
            }
        }
        canvas.restore();
        if (C5444e.m24929h()) {
            C5444e.m24924c("StrokeContent#draw");
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0123  */
    /* JADX INFO: renamed from: j */
    public final void m27582j(Canvas canvas, b bVar) {
        float f10;
        if (C5444e.m24929h()) {
            C5444e.m24923b("StrokeContent#applyTrimPath");
        }
        if (bVar.f23896b == null) {
            if (C5444e.m24929h()) {
                C5444e.m24924c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f23880b.reset();
        for (int size = bVar.f23895a.size() - 1; size >= 0; size--) {
            this.f23880b.addPath(((InterfaceC6306m) bVar.f23895a.get(size)).getPath());
        }
        float fFloatValue = bVar.f23896b.m27619j().mo28668h().floatValue() / 100.0f;
        float fFloatValue2 = bVar.f23896b.m27617f().mo28668h().floatValue() / 100.0f;
        float fFloatValue3 = bVar.f23896b.m27618h().mo28668h().floatValue() / 360.0f;
        if (fFloatValue < 0.01f && fFloatValue2 > 0.99f) {
            canvas.drawPath(this.f23880b, this.f23887i);
            if (C5444e.m24929h()) {
                C5444e.m24924c("StrokeContent#applyTrimPath");
                return;
            }
            return;
        }
        this.f23879a.setPath(this.f23880b, false);
        float length = this.f23879a.getLength();
        while (this.f23879a.nextContour()) {
            length += this.f23879a.getLength();
        }
        float f11 = fFloatValue3 * length;
        float f12 = (fFloatValue * length) + f11;
        float fMin = Math.min((fFloatValue2 * length) + f11, (f12 + length) - 1.0f);
        float f13 = 0.0f;
        for (int size2 = bVar.f23895a.size() - 1; size2 >= 0; size2--) {
            this.f23881c.set(((InterfaceC6306m) bVar.f23895a.get(size2)).getPath());
            this.f23879a.setPath(this.f23881c, false);
            float length2 = this.f23879a.getLength();
            if (fMin > length) {
                float f14 = fMin - length;
                if (f14 >= f13 + length2 || f13 >= f14) {
                    f10 = f13 + length2;
                    if (f10 < f12 && f13 <= fMin) {
                        if (f10 > fMin || f12 >= f13) {
                            C11197m.m42212a(this.f23881c, f12 < f13 ? 0.0f : (f12 - f13) / length2, fMin > f10 ? 1.0f : (fMin - f13) / length2, 0.0f);
                            canvas.drawPath(this.f23881c, this.f23887i);
                        } else {
                            canvas.drawPath(this.f23881c, this.f23887i);
                        }
                    }
                } else {
                    C11197m.m42212a(this.f23881c, f12 > length ? (f12 - length) / length2 : 0.0f, Math.min(f14 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f23881c, this.f23887i);
                }
            } else {
                f10 = f13 + length2;
                if (f10 < f12) {
                }
            }
            f13 += length2;
        }
        if (C5444e.m24929h()) {
            C5444e.m24924c("StrokeContent#applyTrimPath");
        }
    }
}
