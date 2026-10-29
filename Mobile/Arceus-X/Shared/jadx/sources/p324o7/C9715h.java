package p324o7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import p121f7.C5451h0;
import p121f7.InterfaceC5465o0;
import p147g7.C6047a;
import p189i7.AbstractC6643a;
import p189i7.C6659q;
import p431s7.C11186b;
import p444t7.C11552c;

/* JADX INFO: renamed from: o7.h */
/* JADX INFO: loaded from: classes3.dex */
public class C9715h extends AbstractC9709b {

    /* JADX INFO: renamed from: E */
    public final RectF f35341E;

    /* JADX INFO: renamed from: F */
    public final Paint f35342F;

    /* JADX INFO: renamed from: G */
    public final float[] f35343G;

    /* JADX INFO: renamed from: H */
    public final Path f35344H;

    /* JADX INFO: renamed from: I */
    public final C9712e f35345I;

    /* JADX INFO: renamed from: J */
    public AbstractC6643a<ColorFilter, ColorFilter> f35346J;

    /* JADX INFO: renamed from: K */
    public AbstractC6643a<Integer, Integer> f35347K;

    public C9715h(C5451h0 c5451h0, C9712e c9712e) {
        super(c5451h0, c9712e);
        this.f35341E = new RectF();
        C6047a c6047a = new C6047a();
        this.f35342F = c6047a;
        this.f35343G = new float[8];
        this.f35344H = new Path();
        this.f35345I = c9712e;
        c6047a.setAlpha(0);
        c6047a.setStyle(Paint.Style.FILL);
        c6047a.setColor(c9712e.m38387p());
    }

    @Override // p324o7.AbstractC9709b, p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        super.mo27577c(t8, c11552c);
        if (t8 == InterfaceC5465o0.f21155K) {
            if (c11552c == null) {
                this.f35346J = null;
                return;
            } else {
                this.f35346J = new C6659q(c11552c);
                return;
            }
        }
        if (t8 == InterfaceC5465o0.f21161a) {
            if (c11552c != null) {
                this.f35347K = new C6659q(c11552c);
            } else {
                this.f35347K = null;
                this.f35342F.setColor(this.f35345I.m38387p());
            }
        }
    }

    @Override // p324o7.AbstractC9709b, p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        super.mo27578e(rectF, matrix, z10);
        this.f35341E.set(0.0f, 0.0f, this.f35345I.m38389r(), this.f35345I.m38388q());
        this.f35263o.mapRect(this.f35341E);
        rectF.set(this.f35341E);
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: u */
    public void mo38364u(Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        int iAlpha = Color.alpha(this.f35345I.m38387p());
        if (iAlpha == 0) {
            return;
        }
        AbstractC6643a<Integer, Integer> abstractC6643a = this.f35347K;
        Integer numMo28668h = abstractC6643a == null ? null : abstractC6643a.mo28668h();
        if (numMo28668h != null) {
            this.f35342F.setColor(numMo28668h.intValue());
        } else {
            this.f35342F.setColor(this.f35345I.m38387p());
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.f35272x.m28724h() == null ? 100 : this.f35272x.m28724h().mo28668h().intValue())) / 100.0f) * 255.0f);
        this.f35342F.setAlpha(iIntValue);
        if (c11186b != null) {
            c11186b.m42136a(this.f35342F);
        } else {
            this.f35342F.clearShadowLayer();
        }
        AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a2 = this.f35346J;
        if (abstractC6643a2 != null) {
            this.f35342F.setColorFilter(abstractC6643a2.mo28668h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f35343G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f35345I.m38389r();
            float[] fArr2 = this.f35343G;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f35345I.m38389r();
            this.f35343G[5] = this.f35345I.m38388q();
            float[] fArr3 = this.f35343G;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f35345I.m38388q();
            matrix.mapPoints(this.f35343G);
            this.f35344H.reset();
            Path path = this.f35344H;
            float[] fArr4 = this.f35343G;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f35344H;
            float[] fArr5 = this.f35343G;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f35344H;
            float[] fArr6 = this.f35343G;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f35344H;
            float[] fArr7 = this.f35343G;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f35344H;
            float[] fArr8 = this.f35343G;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f35344H.close();
            canvas.drawPath(this.f35344H, this.f35342F);
        }
    }
}
