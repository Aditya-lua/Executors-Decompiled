package m5;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import x2.g;

/* JADX INFO: loaded from: classes.dex */
public class b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Interpolator f23931g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f23932h = new g4.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f23933i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f23934a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Resources f23935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animator f23936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f23937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f23938f;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f23939a;

        public a(c cVar) {
            this.f23939a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f23939a);
            b.this.b(fFloatValue, this.f23939a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: m5.b$b, reason: collision with other inner class name */
    public class C0424b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f23940a;

        public C0424b(c cVar) {
            this.f23940a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f23940a, true);
            this.f23940a.A();
            this.f23940a.l();
            b bVar = b.this;
            if (!bVar.f23938f) {
                bVar.f23937e += 1.0f;
                return;
            }
            bVar.f23938f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f23940a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f23937e = 0.0f;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f23941a = new RectF();
        public final Paint b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f23942c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f23943d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f23944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f23945f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f23946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f23947h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f23948i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f23949j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f23950k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f23951l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f23952m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f23953n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f23954o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f23955p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f23956q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f23957r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f23958s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f23959t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f23960u;

        public c() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.f23942c = paint2;
            Paint paint3 = new Paint();
            this.f23943d = paint3;
            this.f23944e = 0.0f;
            this.f23945f = 0.0f;
            this.f23946g = 0.0f;
            this.f23947h = 5.0f;
            this.f23955p = 1.0f;
            this.f23959t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A() {
            this.f23950k = this.f23944e;
            this.f23951l = this.f23945f;
            this.f23952m = this.f23946g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f23941a;
            float f10 = this.f23956q;
            float fMin = (this.f23947h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f23957r * this.f23955p) / 2.0f, this.f23947h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f23944e;
            float f12 = this.f23946g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f23945f + f12) * 360.0f) - f13;
            this.b.setColor(this.f23960u);
            this.b.setAlpha(this.f23959t);
            float f15 = this.f23947h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f23943d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.b);
            b(canvas, f13, f14, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f23953n) {
                Path path = this.f23954o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f23954o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f23957r * this.f23955p) / 2.0f;
                this.f23954o.moveTo(0.0f, 0.0f);
                this.f23954o.lineTo(this.f23957r * this.f23955p, 0.0f);
                Path path3 = this.f23954o;
                float f13 = this.f23957r;
                float f14 = this.f23955p;
                path3.lineTo((f13 * f14) / 2.0f, this.f23958s * f14);
                this.f23954o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f23947h / 2.0f));
                this.f23954o.close();
                this.f23942c.setColor(this.f23960u);
                this.f23942c.setAlpha(this.f23959t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f23954o, this.f23942c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f23959t;
        }

        public float d() {
            return this.f23945f;
        }

        public int e() {
            return this.f23948i[f()];
        }

        public int f() {
            return (this.f23949j + 1) % this.f23948i.length;
        }

        public float g() {
            return this.f23944e;
        }

        public int h() {
            return this.f23948i[this.f23949j];
        }

        public float i() {
            return this.f23951l;
        }

        public float j() {
            return this.f23952m;
        }

        public float k() {
            return this.f23950k;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.f23950k = 0.0f;
            this.f23951l = 0.0f;
            this.f23952m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int i10) {
            this.f23959t = i10;
        }

        public void o(float f10, float f11) {
            this.f23957r = (int) f10;
            this.f23958s = (int) f11;
        }

        public void p(float f10) {
            if (f10 != this.f23955p) {
                this.f23955p = f10;
            }
        }

        public void q(float f10) {
            this.f23956q = f10;
        }

        public void r(int i10) {
            this.f23960u = i10;
        }

        public void s(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        public void t(int i10) {
            this.f23949j = i10;
            this.f23960u = this.f23948i[i10];
        }

        public void u(int[] iArr) {
            this.f23948i = iArr;
            t(0);
        }

        public void v(float f10) {
            this.f23945f = f10;
        }

        public void w(float f10) {
            this.f23946g = f10;
        }

        public void x(boolean z10) {
            if (this.f23953n != z10) {
                this.f23953n = z10;
            }
        }

        public void y(float f10) {
            this.f23944e = f10;
        }

        public void z(float f10) {
            this.f23947h = f10;
            this.b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f23935c = ((Context) g.g(context)).getResources();
        c cVar = new c();
        this.f23934a = cVar;
        cVar.u(f23933i);
        k(2.5f);
        m();
    }

    public final void a(float f10, c cVar) {
        n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.j() / 0.8f) + 1.0d);
        cVar.y(cVar.k() + (((cVar.i() - 0.01f) - cVar.k()) * f10));
        cVar.v(cVar.i());
        cVar.w(cVar.j() + ((fFloor - cVar.j()) * f10));
    }

    public void b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f23938f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f23932h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f23932h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f23937e) * 216.0f;
            cVar.y(interpolation);
            cVar.v(interpolation2);
            cVar.w(f11);
            h(f12);
        }
    }

    public final int c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    public void d(boolean z10) {
        this.f23934a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f23934a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f23934a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f23934a.u(iArr);
        this.f23934a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f23934a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23934a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(float f10) {
        this.b = f10;
    }

    public final void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f23934a;
        float f14 = this.f23935c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f23936d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f23934a.y(f10);
        this.f23934a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f23934a.z(f10);
        invalidateSelf();
    }

    public void l(int i10) {
        if (i10 == 0) {
            i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void m() {
        c cVar = this.f23934a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f23931g);
        valueAnimatorOfFloat.addListener(new C0424b(cVar));
        this.f23936d = valueAnimatorOfFloat;
    }

    public void n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.r(c((f10 - 0.75f) / 0.25f, cVar.h(), cVar.e()));
        } else {
            cVar.r(cVar.h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f23934a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23934a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f23936d.cancel();
        this.f23934a.A();
        if (this.f23934a.d() != this.f23934a.g()) {
            this.f23938f = true;
            this.f23936d.setDuration(666L);
            this.f23936d.start();
        } else {
            this.f23934a.t(0);
            this.f23934a.m();
            this.f23936d.setDuration(1332L);
            this.f23936d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f23936d.cancel();
        h(0.0f);
        this.f23934a.x(false);
        this.f23934a.t(0);
        this.f23934a.m();
        invalidateSelf();
    }
}
