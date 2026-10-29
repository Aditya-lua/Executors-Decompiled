package p162h7;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import p121f7.C5444e;
import p121f7.C5451h0;
import p121f7.C5452i;
import p121f7.InterfaceC5465o0;
import p147g7.C6047a;
import p189i7.AbstractC6643a;
import p189i7.C6646d;
import p189i7.C6659q;
import p266l7.C8006e;
import p303n7.C8898d;
import p303n7.C8899e;
import p303n7.EnumC8901g;
import p324o7.AbstractC9709b;
import p431s7.C11186b;
import p431s7.C11194j;
import p444t7.C11552c;
import p504w1.C12283g;

/* JADX INFO: renamed from: h7.h */
/* JADX INFO: loaded from: classes3.dex */
public class C6301h implements InterfaceC6298e, AbstractC6643a.b, InterfaceC6304k {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final String f23930a;

    /* JADX INFO: renamed from: b */
    public final boolean f23931b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9709b f23932c;

    /* JADX INFO: renamed from: d */
    public final C12283g<LinearGradient> f23933d = new C12283g<>();

    /* JADX INFO: renamed from: e */
    public final C12283g<RadialGradient> f23934e = new C12283g<>();

    /* JADX INFO: renamed from: f */
    public final Path f23935f;

    /* JADX INFO: renamed from: g */
    public final Paint f23936g;

    /* JADX INFO: renamed from: h */
    public final RectF f23937h;

    /* JADX INFO: renamed from: i */
    public final List<InterfaceC6306m> f23938i;

    /* JADX INFO: renamed from: j */
    public final EnumC8901g f23939j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6643a<C8898d, C8898d> f23940k;

    /* JADX INFO: renamed from: l */
    public final AbstractC6643a<Integer, Integer> f23941l;

    /* JADX INFO: renamed from: m */
    public final AbstractC6643a<PointF, PointF> f23942m;

    /* JADX INFO: renamed from: n */
    public final AbstractC6643a<PointF, PointF> f23943n;

    /* JADX INFO: renamed from: o */
    public AbstractC6643a<ColorFilter, ColorFilter> f23944o;

    /* JADX INFO: renamed from: p */
    public C6659q f23945p;

    /* JADX INFO: renamed from: q */
    public final C5451h0 f23946q;

    /* JADX INFO: renamed from: r */
    public final int f23947r;

    /* JADX INFO: renamed from: s */
    public AbstractC6643a<Float, Float> f23948s;

    /* JADX INFO: renamed from: t */
    public float f23949t;

    public C6301h(C5451h0 c5451h0, C5452i c5452i, AbstractC9709b abstractC9709b, C8899e c8899e) {
        Path path = new Path();
        this.f23935f = path;
        this.f23936g = new C6047a(1);
        this.f23937h = new RectF();
        this.f23938i = new ArrayList();
        this.f23949t = 0.0f;
        this.f23932c = abstractC9709b;
        this.f23930a = c8899e.m35854f();
        this.f23931b = c8899e.m35857i();
        this.f23946q = c5451h0;
        this.f23939j = c8899e.m35853e();
        path.setFillType(c8899e.m35851c());
        this.f23947r = (int) (c5452i.m25038d() / 32.0f);
        AbstractC6643a<C8898d, C8898d> abstractC6643aMo34233a = c8899e.m35852d().mo34233a();
        this.f23940k = abstractC6643aMo34233a;
        abstractC6643aMo34233a.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a);
        AbstractC6643a<Integer, Integer> abstractC6643aMo34233a2 = c8899e.m35855g().mo34233a();
        this.f23941l = abstractC6643aMo34233a2;
        abstractC6643aMo34233a2.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a2);
        AbstractC6643a<PointF, PointF> abstractC6643aMo34233a3 = c8899e.m35856h().mo34233a();
        this.f23942m = abstractC6643aMo34233a3;
        abstractC6643aMo34233a3.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a3);
        AbstractC6643a<PointF, PointF> abstractC6643aMo34233a4 = c8899e.m35850b().mo34233a();
        this.f23943n = abstractC6643aMo34233a4;
        abstractC6643aMo34233a4.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a4);
        if (abstractC9709b.mo38366x() != null) {
            C6646d c6646dMo34233a = abstractC9709b.mo38366x().m35837a().mo34233a();
            this.f23948s = c6646dMo34233a;
            c6646dMo34233a.m28661a(this);
            abstractC9709b.m38353j(this.f23948s);
        }
    }

    /* JADX INFO: renamed from: f */
    private int[] m27594f(int[] iArr) {
        C6659q c6659q = this.f23945p;
        if (c6659q != null) {
            Integer[] numArr = (Integer[]) c6659q.mo28668h();
            int i10 = 0;
            if (iArr.length == numArr.length) {
                while (i10 < iArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i10 < numArr.length) {
                    iArr[i10] = numArr[i10].intValue();
                    i10++;
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: j */
    private int m27595j() {
        int iRound = Math.round(this.f23942m.m28666f() * this.f23947r);
        int iRound2 = Math.round(this.f23943n.m28666f() * this.f23947r);
        int iRound3 = Math.round(this.f23940k.m28666f() * this.f23947r);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    /* JADX INFO: renamed from: k */
    private LinearGradient m27596k() {
        float[] fArr;
        int[] iArr;
        long jM27595j = m27595j();
        LinearGradient linearGradientM45601e = this.f23933d.m45601e(jM27595j);
        if (linearGradientM45601e != null) {
            return linearGradientM45601e;
        }
        PointF pointFMo28668h = this.f23942m.mo28668h();
        PointF pointFMo28668h2 = this.f23943n.mo28668h();
        C8898d c8898dMo28668h = this.f23940k.mo28668h();
        int[] iArrM27594f = m27594f(c8898dMo28668h.m35846d());
        float[] fArrM35847e = c8898dMo28668h.m35847e();
        if (iArrM27594f.length < 2) {
            iArr = new int[]{iArrM27594f[0], iArrM27594f[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrM35847e;
            iArr = iArrM27594f;
        }
        LinearGradient linearGradient = new LinearGradient(pointFMo28668h.x, pointFMo28668h.y, pointFMo28668h2.x, pointFMo28668h2.y, iArr, fArr, Shader.TileMode.CLAMP);
        this.f23933d.m45604i(jM27595j, linearGradient);
        return linearGradient;
    }

    /* JADX INFO: renamed from: l */
    private RadialGradient m27597l() {
        float[] fArr;
        int[] iArr;
        long jM27595j = m27595j();
        RadialGradient radialGradientM45601e = this.f23934e.m45601e(jM27595j);
        if (radialGradientM45601e != null) {
            return radialGradientM45601e;
        }
        PointF pointFMo28668h = this.f23942m.mo28668h();
        PointF pointFMo28668h2 = this.f23943n.mo28668h();
        C8898d c8898dMo28668h = this.f23940k.mo28668h();
        int[] iArrM27594f = m27594f(c8898dMo28668h.m35846d());
        float[] fArrM35847e = c8898dMo28668h.m35847e();
        if (iArrM27594f.length < 2) {
            iArr = new int[]{iArrM27594f[0], iArrM27594f[0]};
            fArr = new float[]{0.0f, 1.0f};
        } else {
            fArr = fArrM35847e;
            iArr = iArrM27594f;
        }
        float f10 = pointFMo28668h.x;
        float f11 = pointFMo28668h.y;
        float fHypot = (float) Math.hypot(pointFMo28668h2.x - f10, pointFMo28668h2.y - f11);
        if (fHypot <= 0.0f) {
            fHypot = 0.001f;
        }
        RadialGradient radialGradient = new RadialGradient(f10, f11, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
        this.f23934e.m45604i(jM27595j, radialGradient);
        return radialGradient;
    }

    @Override // p189i7.AbstractC6643a.b
    /* JADX INFO: renamed from: a */
    public void mo27575a() {
        this.f23946q.invalidateSelf();
    }

    @Override // p162h7.InterfaceC6296c
    /* JADX INFO: renamed from: b */
    public void mo27576b(List<InterfaceC6296c> list, List<InterfaceC6296c> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            InterfaceC6296c interfaceC6296c = list2.get(i10);
            if (interfaceC6296c instanceof InterfaceC6306m) {
                this.f23938i.add((InterfaceC6306m) interfaceC6296c);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        if (t8 == InterfaceC5465o0.f21164d) {
            this.f23941l.m28675o(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21155K) {
            AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a = this.f23944o;
            if (abstractC6643a != null) {
                this.f23932c.m38345H(abstractC6643a);
            }
            if (c11552c == null) {
                this.f23944o = null;
                return;
            }
            C6659q c6659q = new C6659q(c11552c);
            this.f23944o = c6659q;
            c6659q.m28661a(this);
            this.f23932c.m38353j(this.f23944o);
            return;
        }
        if (t8 != InterfaceC5465o0.f21156L) {
            if (t8 == InterfaceC5465o0.f21170j) {
                AbstractC6643a<Float, Float> abstractC6643a2 = this.f23948s;
                if (abstractC6643a2 != null) {
                    abstractC6643a2.m28675o(c11552c);
                    return;
                }
                C6659q c6659q2 = new C6659q(c11552c);
                this.f23948s = c6659q2;
                c6659q2.m28661a(this);
                this.f23932c.m38353j(this.f23948s);
                return;
            }
            return;
        }
        C6659q c6659q3 = this.f23945p;
        if (c6659q3 != null) {
            this.f23932c.m38345H(c6659q3);
        }
        if (c11552c == null) {
            this.f23945p = null;
            return;
        }
        this.f23933d.m45598a();
        this.f23934e.m45598a();
        C6659q c6659q4 = new C6659q(c11552c);
        this.f23945p = c6659q4;
        c6659q4.m28661a(this);
        this.f23932c.m38353j(this.f23945p);
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        this.f23935f.reset();
        for (int i10 = 0; i10 < this.f23938i.size(); i10++) {
            this.f23935f.addPath(this.f23938i.get(i10).getPath(), matrix);
        }
        this.f23935f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f23930a;
    }

    @Override // p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: h */
    public void mo27580h(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2) {
        C11194j.m42193k(c8006e, i10, list, c8006e2, this);
    }

    @Override // p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: i */
    public void mo27581i(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        if (this.f23931b) {
            return;
        }
        if (C5444e.m24929h()) {
            C5444e.m24923b("GradientFillContent#draw");
        }
        this.f23935f.reset();
        for (int i11 = 0; i11 < this.f23938i.size(); i11++) {
            this.f23935f.addPath(this.f23938i.get(i11).getPath(), matrix);
        }
        this.f23935f.computeBounds(this.f23937h, false);
        Shader shaderM27596k = this.f23939j == EnumC8901g.LINEAR ? m27596k() : m27597l();
        shaderM27596k.setLocalMatrix(matrix);
        this.f23936g.setShader(shaderM27596k);
        AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a = this.f23944o;
        if (abstractC6643a != null) {
            this.f23936g.setColorFilter(abstractC6643a.mo28668h());
        }
        AbstractC6643a<Float, Float> abstractC6643a2 = this.f23948s;
        if (abstractC6643a2 != null) {
            float fFloatValue = abstractC6643a2.mo28668h().floatValue();
            if (fFloatValue == 0.0f) {
                this.f23936g.setMaskFilter(null);
            } else if (fFloatValue != this.f23949t) {
                this.f23936g.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.f23949t = fFloatValue;
        }
        float fIntValue = this.f23941l.mo28668h().intValue() / 100.0f;
        this.f23936g.setAlpha(C11194j.m42185c((int) (i10 * fIntValue), 0, 255));
        if (c11186b != null) {
            c11186b.m42138c((int) (fIntValue * 255.0f), this.f23936g);
        }
        canvas.drawPath(this.f23935f, this.f23936g);
        if (C5444e.m24929h()) {
            C5444e.m24924c("GradientFillContent#draw");
        }
    }
}
