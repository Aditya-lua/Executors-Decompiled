package o7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import f7.h0;
import f7.k0;
import f7.o0;
import i7.q;
import s7.l;
import s7.m;

/* JADX INFO: loaded from: classes3.dex */
public class d extends b {
    public final Paint E;
    public final Rect F;
    public final Rect G;
    public final RectF H;
    public final k0 I;
    public i7.a<ColorFilter, ColorFilter> J;
    public i7.a<Bitmap, Bitmap> K;
    public i7.c L;
    public l M;
    public l.a N;

    public d(h0 h0Var, e eVar) {
        super(h0Var, eVar);
        this.E = new g7.a(3);
        this.F = new Rect();
        this.G = new Rect();
        this.H = new RectF();
        this.I = h0Var.P(eVar.n());
        if (z() != null) {
            this.L = new i7.c(this, this, z());
        }
    }

    public final Bitmap P() {
        Bitmap bitmapH;
        i7.a<Bitmap, Bitmap> aVar = this.K;
        if (aVar != null && (bitmapH = aVar.h()) != null) {
            return bitmapH;
        }
        Bitmap bitmapG = this.f27238p.G(this.f27239q.n());
        if (bitmapG != null) {
            return bitmapG;
        }
        k0 k0Var = this.I;
        if (k0Var != null) {
            return k0Var.b();
        }
        return null;
    }

    @Override // o7.b, l7.f
    public <T> void c(T t8, t7.c<T> cVar) {
        i7.c cVar2;
        i7.c cVar3;
        i7.c cVar4;
        i7.c cVar5;
        i7.c cVar6;
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
        if (t8 == o0.N) {
            if (cVar == null) {
                this.K = null;
                return;
            } else {
                this.K = new q(cVar);
                return;
            }
        }
        if (t8 == o0.f16423e && (cVar6 = this.L) != null) {
            cVar6.c(cVar);
            return;
        }
        if (t8 == o0.G && (cVar5 = this.L) != null) {
            cVar5.f(cVar);
            return;
        }
        if (t8 == o0.H && (cVar4 = this.L) != null) {
            cVar4.d(cVar);
            return;
        }
        if (t8 == o0.I && (cVar3 = this.L) != null) {
            cVar3.e(cVar);
        } else {
            if (t8 != o0.J || (cVar2 = this.L) == null) {
                return;
            }
            cVar2.g(cVar);
        }
    }

    @Override // o7.b, h7.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        Bitmap bitmapP;
        super.e(rectF, matrix, z10);
        if (this.I != null) {
            float fE = m.e();
            if (this.f27238p.Q() || (bitmapP = P()) == null) {
                rectF.set(0.0f, 0.0f, this.I.f() * fE, this.I.d() * fE);
            } else {
                rectF.set(0.0f, 0.0f, bitmapP.getWidth() * fE, bitmapP.getHeight() * fE);
            }
            this.f27237o.mapRect(rectF);
        }
    }

    @Override // o7.b
    public void u(@NonNull Canvas canvas, Matrix matrix, int i10, s7.b bVar) {
        Bitmap bitmapP = P();
        if (bitmapP == null || bitmapP.isRecycled() || this.I == null) {
            return;
        }
        float fE = m.e();
        this.E.setAlpha(i10);
        i7.a<ColorFilter, ColorFilter> aVar = this.J;
        if (aVar != null) {
            this.E.setColorFilter(aVar.h());
        }
        i7.c cVar = this.L;
        if (cVar != null) {
            bVar = cVar.b(matrix, i10);
        }
        this.F.set(0, 0, bitmapP.getWidth(), bitmapP.getHeight());
        if (this.f27238p.Q()) {
            this.G.set(0, 0, (int) (this.I.f() * fE), (int) (this.I.d() * fE));
        } else {
            this.G.set(0, 0, (int) (bitmapP.getWidth() * fE), (int) (bitmapP.getHeight() * fE));
        }
        boolean z10 = bVar != null;
        if (z10) {
            if (this.M == null) {
                this.M = new l();
            }
            if (this.N == null) {
                this.N = new l.a();
            }
            this.N.f();
            bVar.d(i10, this.N);
            RectF rectF = this.H;
            Rect rect = this.G;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            matrix.mapRect(this.H);
            canvas = this.M.j(canvas, this.H, this.N);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapP, this.F, this.G, this.E);
        if (z10) {
            this.M.e();
            if (this.M.f()) {
                return;
            }
        }
        canvas.restore();
    }
}
