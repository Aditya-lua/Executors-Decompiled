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
    public static final Interpolator f24581g = new LinearInterpolator();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Interpolator f24582h = new g4.b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f24583i = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f24584a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Resources f24585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Animator f24586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f24588f;

    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f24589a;

        public a(c cVar) {
            this.f24589a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            b.this.n(fFloatValue, this.f24589a);
            b.this.b(fFloatValue, this.f24589a, false);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: m5.b$b, reason: collision with other inner class name */
    public class C0438b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f24590a;

        public C0438b(c cVar) {
            this.f24590a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            b.this.b(1.0f, this.f24590a, true);
            this.f24590a.A();
            this.f24590a.l();
            b bVar = b.this;
            if (!bVar.f24588f) {
                bVar.f24587e += 1.0f;
                return;
            }
            bVar.f24588f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f24590a.x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.f24587e = 0.0f;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RectF f24591a = new RectF();
        public final Paint b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Paint f24592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Paint f24593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f24594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f24595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f24596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f24597h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int[] f24598i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f24599j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f24600k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f24601l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f24602m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f24603n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Path f24604o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f24605p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f24606q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f24607r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f24608s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f24609t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f24610u;

        public c() {
            Paint paint = new Paint();
            this.b = paint;
            Paint paint2 = new Paint();
            this.f24592c = paint2;
            Paint paint3 = new Paint();
            this.f24593d = paint3;
            this.f24594e = 0.0f;
            this.f24595f = 0.0f;
            this.f24596g = 0.0f;
            this.f24597h = 5.0f;
            this.f24605p = 1.0f;
            this.f24609t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public void A() {
            this.f24600k = this.f24594e;
            this.f24601l = this.f24595f;
            this.f24602m = this.f24596g;
        }

        public void a(Canvas canvas, Rect rect) {
            RectF rectF = this.f24591a;
            float f10 = this.f24606q;
            float fMin = (this.f24597h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f24607r * this.f24605p) / 2.0f, this.f24597h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f24594e;
            float f12 = this.f24596g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f24595f + f12) * 360.0f) - f13;
            this.b.setColor(this.f24610u);
            this.b.setAlpha(this.f24609t);
            float f15 = this.f24597h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f24593d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.b);
            b(canvas, f13, f14, rectF);
        }

        public void b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f24603n) {
                Path path = this.f24604o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f24604o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f24607r * this.f24605p) / 2.0f;
                this.f24604o.moveTo(0.0f, 0.0f);
                this.f24604o.lineTo(this.f24607r * this.f24605p, 0.0f);
                Path path3 = this.f24604o;
                float f13 = this.f24607r;
                float f14 = this.f24605p;
                path3.lineTo((f13 * f14) / 2.0f, this.f24608s * f14);
                this.f24604o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f24597h / 2.0f));
                this.f24604o.close();
                this.f24592c.setColor(this.f24610u);
                this.f24592c.setAlpha(this.f24609t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f24604o, this.f24592c);
                canvas.restore();
            }
        }

        public int c() {
            return this.f24609t;
        }

        public float d() {
            return this.f24595f;
        }

        public int e() {
            return this.f24598i[f()];
        }

        public int f() {
            return (this.f24599j + 1) % this.f24598i.length;
        }

        public float g() {
            return this.f24594e;
        }

        public int h() {
            return this.f24598i[this.f24599j];
        }

        public float i() {
            return this.f24601l;
        }

        public float j() {
            return this.f24602m;
        }

        public float k() {
            return this.f24600k;
        }

        public void l() {
            t(f());
        }

        public void m() {
            this.f24600k = 0.0f;
            this.f24601l = 0.0f;
            this.f24602m = 0.0f;
            y(0.0f);
            v(0.0f);
            w(0.0f);
        }

        public void n(int i10) {
            this.f24609t = i10;
        }

        public void o(float f10, float f11) {
            this.f24607r = (int) f10;
            this.f24608s = (int) f11;
        }

        public void p(float f10) {
            if (f10 != this.f24605p) {
                this.f24605p = f10;
            }
        }

        public void q(float f10) {
            this.f24606q = f10;
        }

        public void r(int i10) {
            this.f24610u = i10;
        }

        public void s(ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }

        public void t(int i10) {
            this.f24599j = i10;
            this.f24610u = this.f24598i[i10];
        }

        public void u(int[] iArr) {
            this.f24598i = iArr;
            t(0);
        }

        public void v(float f10) {
            this.f24595f = f10;
        }

        public void w(float f10) {
            this.f24596g = f10;
        }

        public void x(boolean z10) {
            if (this.f24603n != z10) {
                this.f24603n = z10;
            }
        }

        public void y(float f10) {
            this.f24594e = f10;
        }

        public void z(float f10) {
            this.f24597h = f10;
            this.b.setStrokeWidth(f10);
        }
    }

    public b(Context context) {
        this.f24585c = ((Context) g.g(context)).getResources();
        c cVar = new c();
        this.f24584a = cVar;
        cVar.u(f24583i);
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
        if (this.f24588f) {
            a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fJ = cVar.j();
            if (f10 < 0.5f) {
                interpolation = cVar.k();
                interpolation2 = (f24582h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fK = cVar.k() + 0.79f;
                interpolation = fK - (((1.0f - f24582h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fK;
            }
            float f11 = fJ + (0.20999998f * f10);
            float f12 = (f10 + this.f24587e) * 216.0f;
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
        this.f24584a.x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f24584a.a(canvas, bounds);
        canvas.restore();
    }

    public void e(float f10) {
        this.f24584a.p(f10);
        invalidateSelf();
    }

    public void f(int... iArr) {
        this.f24584a.u(iArr);
        this.f24584a.t(0);
        invalidateSelf();
    }

    public void g(float f10) {
        this.f24584a.w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24584a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final void h(float f10) {
        this.b = f10;
    }

    public final void i(float f10, float f11, float f12, float f13) {
        c cVar = this.f24584a;
        float f14 = this.f24585c.getDisplayMetrics().density;
        cVar.z(f11 * f14);
        cVar.q(f10 * f14);
        cVar.t(0);
        cVar.o(f12 * f14, f13 * f14);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f24586d.isRunning();
    }

    public void j(float f10, float f11) {
        this.f24584a.y(f10);
        this.f24584a.v(f11);
        invalidateSelf();
    }

    public void k(float f10) {
        this.f24584a.z(f10);
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
        c cVar = this.f24584a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f24581g);
        valueAnimatorOfFloat.addListener(new C0438b(cVar));
        this.f24586d = valueAnimatorOfFloat;
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
        this.f24584a.n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f24584a.s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f24586d.cancel();
        this.f24584a.A();
        if (this.f24584a.d() != this.f24584a.g()) {
            this.f24588f = true;
            this.f24586d.setDuration(666L);
            this.f24586d.start();
        } else {
            this.f24584a.t(0);
            this.f24584a.m();
            this.f24586d.setDuration(1332L);
            this.f24586d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f24586d.cancel();
        h(0.0f);
        this.f24584a.x(false);
        this.f24584a.t(0);
        this.f24584a.m();
        invalidateSelf();
    }
}
