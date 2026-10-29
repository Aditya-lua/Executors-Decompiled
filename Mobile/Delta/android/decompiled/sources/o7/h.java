package o7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import f7.h0;
import f7.o0;
import i7.q;

/* JADX INFO: loaded from: classes3.dex */
public class h extends b {
    public final RectF E;
    public final Paint F;
    public final float[] G;
    public final Path H;
    public final e I;
    public i7.a<ColorFilter, ColorFilter> J;
    public i7.a<Integer, Integer> K;

    public h(h0 h0Var, e eVar) {
        super(h0Var, eVar);
        this.E = new RectF();
        g7.a aVar = new g7.a();
        this.F = aVar;
        this.G = new float[8];
        this.H = new Path();
        this.I = eVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(eVar.p());
    }

    @Override // o7.b, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        super.c(t8, cVar);
        if (t8 == o0.K) {
            if (cVar == null) {
                this.J = null;
                return;
            } else {
                this.J = new q(cVar);
                return;
            }
        }
        if (t8 == o0.f16420a) {
            if (cVar != null) {
                this.K = new q(cVar);
            } else {
                this.K = null;
                this.F.setColor(this.I.p());
            }
        }
    }

    @Override // o7.b, h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        this.E.set(0.0f, 0.0f, this.I.r(), this.I.q());
        this.f27237o.mapRect(this.E);
        rectF.set(this.E);
    }

    @Override // o7.b
    public void u(Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        int iAlpha = Color.alpha(this.I.p());
        if (iAlpha == 0) {
            return;
        }
        i7.a<Integer, Integer> aVar = this.K;
        Integer numH = aVar == null ? null : aVar.h();
        if (numH != null) {
            this.F.setColor(numH.intValue());
        } else {
            this.F.setColor(this.I.p());
        }
        int iIntValue = (int) ((i10 / 255.0f) * (((iAlpha / 255.0f) * (this.f27246x.h() == null ? 100 : this.f27246x.h().h().intValue())) / 100.0f) * 255.0f);
        this.F.setAlpha(iIntValue);
        if (bVar != null) {
            bVar.a(this.F);
        } else {
            this.F.clearShadowLayer();
        }
        i7.a<ColorFilter, ColorFilter> aVar2 = this.J;
        if (aVar2 != null) {
            this.F.setColorFilter(aVar2.h());
        }
        if (iIntValue > 0) {
            float[] fArr = this.G;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.I.r();
            float[] fArr2 = this.G;
            fArr2[3] = 0.0f;
            fArr2[4] = this.I.r();
            this.G[5] = this.I.q();
            float[] fArr3 = this.G;
            fArr3[6] = 0.0f;
            fArr3[7] = this.I.q();
            matrix.mapPoints(this.G);
            this.H.reset();
            Path path = this.H;
            float[] fArr4 = this.G;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.H;
            float[] fArr5 = this.G;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.H;
            float[] fArr6 = this.G;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.H;
            float[] fArr7 = this.G;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.H;
            float[] fArr8 = this.G;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.H.close();
            canvas.drawPath(this.H, this.F);
        }
    }
}
