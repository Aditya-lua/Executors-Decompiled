package p162h7;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p189i7.AbstractC6643a;
import p189i7.C6659q;
import p303n7.C8898d;
import p303n7.C8900f;
import p303n7.EnumC8901g;
import p324o7.AbstractC9709b;
import p431s7.C11186b;
import p444t7.C11552c;
import p504w1.C12283g;

/* JADX INFO: renamed from: h7.i */
/* JADX INFO: loaded from: classes3.dex */
public class C6302i extends AbstractC6294a {

    /* JADX INFO: renamed from: A */
    public C6659q f23950A;

    /* JADX INFO: renamed from: q */
    public final String f23951q;

    /* JADX INFO: renamed from: r */
    public final boolean f23952r;

    /* JADX INFO: renamed from: s */
    public final C12283g<LinearGradient> f23953s;

    /* JADX INFO: renamed from: t */
    public final C12283g<RadialGradient> f23954t;

    /* JADX INFO: renamed from: u */
    public final RectF f23955u;

    /* JADX INFO: renamed from: v */
    public final EnumC8901g f23956v;

    /* JADX INFO: renamed from: w */
    public final int f23957w;

    /* JADX INFO: renamed from: x */
    public final AbstractC6643a<C8898d, C8898d> f23958x;

    /* JADX INFO: renamed from: y */
    public final AbstractC6643a<PointF, PointF> f23959y;

    /* JADX INFO: renamed from: z */
    public final AbstractC6643a<PointF, PointF> f23960z;

    public C6302i(C5451h0 c5451h0, AbstractC9709b abstractC9709b, C8900f c8900f) {
        super(c5451h0, abstractC9709b, c8900f.m35858b().m35937b(), c8900f.m35863g().m35939b(), c8900f.m35865i(), c8900f.m35867k(), c8900f.m35869m(), c8900f.m35864h(), c8900f.m35859c());
        this.f23953s = new C12283g<>();
        this.f23954t = new C12283g<>();
        this.f23955u = new RectF();
        this.f23951q = c8900f.m35866j();
        this.f23956v = c8900f.m35862f();
        this.f23952r = c8900f.m35870n();
        this.f23957w = (int) (c5451h0.m24966J().m25038d() / 32.0f);
        AbstractC6643a<C8898d, C8898d> abstractC6643aMo34233a = c8900f.m35861e().mo34233a();
        this.f23958x = abstractC6643aMo34233a;
        abstractC6643aMo34233a.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a);
        AbstractC6643a<PointF, PointF> abstractC6643aMo34233a2 = c8900f.m35868l().mo34233a();
        this.f23959y = abstractC6643aMo34233a2;
        abstractC6643aMo34233a2.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a2);
        AbstractC6643a<PointF, PointF> abstractC6643aMo34233a3 = c8900f.m35860d().mo34233a();
        this.f23960z = abstractC6643aMo34233a3;
        abstractC6643aMo34233a3.m28661a(this);
        abstractC9709b.m38353j(abstractC6643aMo34233a3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.lang.Integer[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p162h7.AbstractC6294a, p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        super.mo27577c(t8, c11552c);
        if (t8 == InterfaceC5465o0.f21156L) {
            C6659q c6659q = this.f23950A;
            if (c6659q != null) {
                this.f23884f.m38345H(c6659q);
            }
            if (c11552c == null) {
                this.f23950A = null;
                return;
            }
            C6659q c6659q2 = new C6659q(c11552c);
            this.f23950A = c6659q2;
            c6659q2.m28661a(this);
            this.f23884f.m38353j(this.f23950A);
        }
    }

    @Override // p162h7.InterfaceC6296c
    public String getName() {
        return this.f23951q;
    }

    @Override // p162h7.AbstractC6294a, p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: i */
    public void mo27581i(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        if (this.f23952r) {
            return;
        }
        mo27578e(this.f23955u, matrix, false);
        this.f23887i.setShader(this.f23956v == EnumC8901g.LINEAR ? m27600m() : m27601n());
        super.mo27581i(canvas, matrix, i10, c11186b);
    }

    /* JADX INFO: renamed from: k */
    public final int[] m27598k(int[] iArr) {
        C6659q c6659q = this.f23950A;
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

    /* JADX INFO: renamed from: l */
    public final int m27599l() {
        int iRound = Math.round(this.f23959y.m28666f() * this.f23957w);
        int iRound2 = Math.round(this.f23960z.m28666f() * this.f23957w);
        int iRound3 = Math.round(this.f23958x.m28666f() * this.f23957w);
        int i10 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i10 = i10 * 31 * iRound2;
        }
        return iRound3 != 0 ? i10 * 31 * iRound3 : i10;
    }

    /* JADX INFO: renamed from: m */
    public final LinearGradient m27600m() {
        long jM27599l = m27599l();
        LinearGradient linearGradientM45601e = this.f23953s.m45601e(jM27599l);
        if (linearGradientM45601e != null) {
            return linearGradientM45601e;
        }
        PointF pointFMo28668h = this.f23959y.mo28668h();
        PointF pointFMo28668h2 = this.f23960z.mo28668h();
        C8898d c8898dMo28668h = this.f23958x.mo28668h();
        LinearGradient linearGradient = new LinearGradient(pointFMo28668h.x, pointFMo28668h.y, pointFMo28668h2.x, pointFMo28668h2.y, m27598k(c8898dMo28668h.m35846d()), c8898dMo28668h.m35847e(), Shader.TileMode.CLAMP);
        this.f23953s.m45604i(jM27599l, linearGradient);
        return linearGradient;
    }

    /* JADX INFO: renamed from: n */
    public final RadialGradient m27601n() {
        long jM27599l = m27599l();
        RadialGradient radialGradientM45601e = this.f23954t.m45601e(jM27599l);
        if (radialGradientM45601e != null) {
            return radialGradientM45601e;
        }
        PointF pointFMo28668h = this.f23959y.mo28668h();
        PointF pointFMo28668h2 = this.f23960z.mo28668h();
        C8898d c8898dMo28668h = this.f23958x.mo28668h();
        int[] iArrM27598k = m27598k(c8898dMo28668h.m35846d());
        float[] fArrM35847e = c8898dMo28668h.m35847e();
        float f10 = pointFMo28668h.x;
        float f11 = pointFMo28668h.y;
        RadialGradient radialGradient = new RadialGradient(f10, f11, (float) Math.hypot(pointFMo28668h2.x - f10, pointFMo28668h2.y - f11), iArrM27598k, fArrM35847e, Shader.TileMode.CLAMP);
        this.f23954t.m45604i(jM27599l, radialGradient);
        return radialGradient;
    }
}
