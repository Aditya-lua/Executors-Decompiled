package p324o7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import p121f7.C5451h0;
import p121f7.C5457k0;
import p121f7.InterfaceC5465o0;
import p147g7.C6047a;
import p189i7.AbstractC6643a;
import p189i7.C6645c;
import p189i7.C6659q;
import p431s7.C11186b;
import p431s7.C11196l;
import p431s7.C11197m;
import p444t7.C11552c;

/* JADX INFO: renamed from: o7.d */
/* JADX INFO: loaded from: classes3.dex */
public class C9711d extends AbstractC9709b {

    /* JADX INFO: renamed from: E */
    public final Paint f35288E;

    /* JADX INFO: renamed from: F */
    public final Rect f35289F;

    /* JADX INFO: renamed from: G */
    public final Rect f35290G;

    /* JADX INFO: renamed from: H */
    public final RectF f35291H;

    /* JADX INFO: renamed from: I */
    public final C5457k0 f35292I;

    /* JADX INFO: renamed from: J */
    public AbstractC6643a<ColorFilter, ColorFilter> f35293J;

    /* JADX INFO: renamed from: K */
    public AbstractC6643a<Bitmap, Bitmap> f35294K;

    /* JADX INFO: renamed from: L */
    public C6645c f35295L;

    /* JADX INFO: renamed from: M */
    public C11196l f35296M;

    /* JADX INFO: renamed from: N */
    public C11196l.a f35297N;

    public C9711d(C5451h0 c5451h0, C9712e c9712e) {
        super(c5451h0, c9712e);
        this.f35288E = new C6047a(3);
        this.f35289F = new Rect();
        this.f35290G = new Rect();
        this.f35291H = new RectF();
        this.f35292I = c5451h0.m24978P(c9712e.m38385n());
        if (m38368z() != null) {
            this.f35295L = new C6645c(this, this, m38368z());
        }
    }

    /* JADX INFO: renamed from: P */
    public final Bitmap m38371P() {
        Bitmap bitmapMo28668h;
        AbstractC6643a<Bitmap, Bitmap> abstractC6643a = this.f35294K;
        if (abstractC6643a != null && (bitmapMo28668h = abstractC6643a.mo28668h()) != null) {
            return bitmapMo28668h;
        }
        Bitmap bitmapM24960G = this.f35264p.m24960G(this.f35265q.m38385n());
        if (bitmapM24960G != null) {
            return bitmapM24960G;
        }
        C5457k0 c5457k0 = this.f35292I;
        if (c5457k0 != null) {
            return c5457k0.m25061b();
        }
        return null;
    }

    @Override // p324o7.AbstractC9709b, p266l7.InterfaceC8007f
    /* JADX INFO: renamed from: c */
    public <T> void mo27577c(T t8, C11552c<T> c11552c) {
        C6645c c6645c;
        C6645c c6645c2;
        C6645c c6645c3;
        C6645c c6645c4;
        C6645c c6645c5;
        super.mo27577c(t8, c11552c);
        if (t8 == InterfaceC5465o0.f21155K) {
            if (c11552c == null) {
                this.f35293J = null;
                return;
            } else {
                this.f35293J = new C6659q(c11552c);
                return;
            }
        }
        if (t8 == InterfaceC5465o0.f21158N) {
            if (c11552c == null) {
                this.f35294K = null;
                return;
            } else {
                this.f35294K = new C6659q(c11552c);
                return;
            }
        }
        if (t8 == InterfaceC5465o0.f21165e && (c6645c5 = this.f35295L) != null) {
            c6645c5.m28687c(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21151G && (c6645c4 = this.f35295L) != null) {
            c6645c4.m28690f(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21152H && (c6645c3 = this.f35295L) != null) {
            c6645c3.m28688d(c11552c);
            return;
        }
        if (t8 == InterfaceC5465o0.f21153I && (c6645c2 = this.f35295L) != null) {
            c6645c2.m28689e(c11552c);
        } else {
            if (t8 != InterfaceC5465o0.f21154J || (c6645c = this.f35295L) == null) {
                return;
            }
            c6645c.m28691g(c11552c);
        }
    }

    @Override // p324o7.AbstractC9709b, p162h7.InterfaceC6298e
    /* JADX INFO: renamed from: e */
    public void mo27578e(RectF rectF, Matrix matrix, boolean z10) {
        Bitmap bitmapM38371P;
        super.mo27578e(rectF, matrix, z10);
        if (this.f35292I != null) {
            float fM42216e = C11197m.m42216e();
            if (this.f35264p.m24980Q() || (bitmapM38371P = m38371P()) == null) {
                rectF.set(0.0f, 0.0f, this.f35292I.m25065f() * fM42216e, this.f35292I.m25063d() * fM42216e);
            } else {
                rectF.set(0.0f, 0.0f, bitmapM38371P.getWidth() * fM42216e, bitmapM38371P.getHeight() * fM42216e);
            }
            this.f35263o.mapRect(rectF);
        }
    }

    @Override // p324o7.AbstractC9709b
    /* JADX INFO: renamed from: u */
    public void mo38364u(@NonNull Canvas canvas, Matrix matrix, int i10, C11186b c11186b) {
        Bitmap bitmapM38371P = m38371P();
        if (bitmapM38371P == null || bitmapM38371P.isRecycled() || this.f35292I == null) {
            return;
        }
        float fM42216e = C11197m.m42216e();
        this.f35288E.setAlpha(i10);
        AbstractC6643a<ColorFilter, ColorFilter> abstractC6643a = this.f35293J;
        if (abstractC6643a != null) {
            this.f35288E.setColorFilter(abstractC6643a.mo28668h());
        }
        C6645c c6645c = this.f35295L;
        if (c6645c != null) {
            c11186b = c6645c.m28686b(matrix, i10);
        }
        this.f35289F.set(0, 0, bitmapM38371P.getWidth(), bitmapM38371P.getHeight());
        if (this.f35264p.m24980Q()) {
            this.f35290G.set(0, 0, (int) (this.f35292I.m25065f() * fM42216e), (int) (this.f35292I.m25063d() * fM42216e));
        } else {
            this.f35290G.set(0, 0, (int) (bitmapM38371P.getWidth() * fM42216e), (int) (bitmapM38371P.getHeight() * fM42216e));
        }
        boolean z10 = c11186b != null;
        if (z10) {
            if (this.f35296M == null) {
                this.f35296M = new C11196l();
            }
            if (this.f35297N == null) {
                this.f35297N = new C11196l.a();
            }
            this.f35297N.m42210f();
            c11186b.m42139d(i10, this.f35297N);
            RectF rectF = this.f35291H;
            Rect rect = this.f35290G;
            rectF.set(rect.left, rect.top, rect.right, rect.bottom);
            matrix.mapRect(this.f35291H);
            canvas = this.f35296M.m42204j(canvas, this.f35291H, this.f35297N);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(bitmapM38371P, this.f35289F, this.f35290G, this.f35288E);
        if (z10) {
            this.f35296M.m42199e();
            if (this.f35296M.m42200f()) {
                return;
            }
        }
        canvas.restore();
    }
}
