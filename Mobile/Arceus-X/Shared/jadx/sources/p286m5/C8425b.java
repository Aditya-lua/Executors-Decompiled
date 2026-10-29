package p286m5;

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
import androidx.core.view.ViewCompat;
import p144g4.C6003b;
import p533x2.C12637g;

/* JADX INFO: renamed from: m5.b */
/* JADX INFO: loaded from: classes.dex */
public class C8425b extends Drawable implements Animatable {

    /* JADX INFO: renamed from: g */
    public static final Interpolator f31048g = new LinearInterpolator();

    /* JADX INFO: renamed from: h */
    public static final Interpolator f31049h = new C6003b();

    /* JADX INFO: renamed from: i */
    public static final int[] f31050i = {ViewCompat.MEASURED_STATE_MASK};

    /* JADX INFO: renamed from: a */
    public final c f31051a;

    /* JADX INFO: renamed from: b */
    public float f31052b;

    /* JADX INFO: renamed from: c */
    public Resources f31053c;

    /* JADX INFO: renamed from: d */
    public Animator f31054d;

    /* JADX INFO: renamed from: e */
    public float f31055e;

    /* JADX INFO: renamed from: f */
    public boolean f31056f;

    /* JADX INFO: renamed from: m5.b$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f31057a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(c cVar) {
            this.f31057a = cVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C8425b.this.m34152n(fFloatValue, this.f31057a);
            C8425b.this.m34140b(fFloatValue, this.f31057a, false);
            C8425b.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: m5.b$b */
    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ c f31059a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(c cVar) {
            this.f31059a = cVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            C8425b.this.m34140b(1.0f, this.f31059a, true);
            this.f31059a.m34153A();
            this.f31059a.m34165l();
            C8425b c8425b = C8425b.this;
            if (!c8425b.f31056f) {
                c8425b.f31055e += 1.0f;
                return;
            }
            c8425b.f31056f = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            this.f31059a.m34177x(false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8425b.this.f31055e = 0.0f;
        }
    }

    /* JADX INFO: renamed from: m5.b$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final RectF f31061a = new RectF();

        /* JADX INFO: renamed from: b */
        public final Paint f31062b;

        /* JADX INFO: renamed from: c */
        public final Paint f31063c;

        /* JADX INFO: renamed from: d */
        public final Paint f31064d;

        /* JADX INFO: renamed from: e */
        public float f31065e;

        /* JADX INFO: renamed from: f */
        public float f31066f;

        /* JADX INFO: renamed from: g */
        public float f31067g;

        /* JADX INFO: renamed from: h */
        public float f31068h;

        /* JADX INFO: renamed from: i */
        public int[] f31069i;

        /* JADX INFO: renamed from: j */
        public int f31070j;

        /* JADX INFO: renamed from: k */
        public float f31071k;

        /* JADX INFO: renamed from: l */
        public float f31072l;

        /* JADX INFO: renamed from: m */
        public float f31073m;

        /* JADX INFO: renamed from: n */
        public boolean f31074n;

        /* JADX INFO: renamed from: o */
        public Path f31075o;

        /* JADX INFO: renamed from: p */
        public float f31076p;

        /* JADX INFO: renamed from: q */
        public float f31077q;

        /* JADX INFO: renamed from: r */
        public int f31078r;

        /* JADX INFO: renamed from: s */
        public int f31079s;

        /* JADX INFO: renamed from: t */
        public int f31080t;

        /* JADX INFO: renamed from: u */
        public int f31081u;

        public c() {
            Paint paint = new Paint();
            this.f31062b = paint;
            Paint paint2 = new Paint();
            this.f31063c = paint2;
            Paint paint3 = new Paint();
            this.f31064d = paint3;
            this.f31065e = 0.0f;
            this.f31066f = 0.0f;
            this.f31067g = 0.0f;
            this.f31068h = 5.0f;
            this.f31076p = 1.0f;
            this.f31080t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* JADX INFO: renamed from: A */
        public void m34153A() {
            this.f31071k = this.f31065e;
            this.f31072l = this.f31066f;
            this.f31073m = this.f31067g;
        }

        /* JADX INFO: renamed from: a */
        public void m34154a(Canvas canvas, Rect rect) {
            RectF rectF = this.f31061a;
            float f10 = this.f31077q;
            float fMin = (this.f31068h / 2.0f) + f10;
            if (f10 <= 0.0f) {
                fMin = (Math.min(rect.width(), rect.height()) / 2.0f) - Math.max((this.f31078r * this.f31076p) / 2.0f, this.f31068h / 2.0f);
            }
            rectF.set(rect.centerX() - fMin, rect.centerY() - fMin, rect.centerX() + fMin, rect.centerY() + fMin);
            float f11 = this.f31065e;
            float f12 = this.f31067g;
            float f13 = (f11 + f12) * 360.0f;
            float f14 = ((this.f31066f + f12) * 360.0f) - f13;
            this.f31062b.setColor(this.f31081u);
            this.f31062b.setAlpha(this.f31080t);
            float f15 = this.f31068h / 2.0f;
            rectF.inset(f15, f15);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f31064d);
            float f16 = -f15;
            rectF.inset(f16, f16);
            canvas.drawArc(rectF, f13, f14, false, this.f31062b);
            m34155b(canvas, f13, f14, rectF);
        }

        /* JADX INFO: renamed from: b */
        public void m34155b(Canvas canvas, float f10, float f11, RectF rectF) {
            if (this.f31074n) {
                Path path = this.f31075o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f31075o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                float fMin = Math.min(rectF.width(), rectF.height()) / 2.0f;
                float f12 = (this.f31078r * this.f31076p) / 2.0f;
                this.f31075o.moveTo(0.0f, 0.0f);
                this.f31075o.lineTo(this.f31078r * this.f31076p, 0.0f);
                Path path3 = this.f31075o;
                float f13 = this.f31078r;
                float f14 = this.f31076p;
                path3.lineTo((f13 * f14) / 2.0f, this.f31079s * f14);
                this.f31075o.offset((fMin + rectF.centerX()) - f12, rectF.centerY() + (this.f31068h / 2.0f));
                this.f31075o.close();
                this.f31063c.setColor(this.f31081u);
                this.f31063c.setAlpha(this.f31080t);
                canvas.save();
                canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f31075o, this.f31063c);
                canvas.restore();
            }
        }

        /* JADX INFO: renamed from: c */
        public int m34156c() {
            return this.f31080t;
        }

        /* JADX INFO: renamed from: d */
        public float m34157d() {
            return this.f31066f;
        }

        /* JADX INFO: renamed from: e */
        public int m34158e() {
            return this.f31069i[m34159f()];
        }

        /* JADX INFO: renamed from: f */
        public int m34159f() {
            return (this.f31070j + 1) % this.f31069i.length;
        }

        /* JADX INFO: renamed from: g */
        public float m34160g() {
            return this.f31065e;
        }

        /* JADX INFO: renamed from: h */
        public int m34161h() {
            return this.f31069i[this.f31070j];
        }

        /* JADX INFO: renamed from: i */
        public float m34162i() {
            return this.f31072l;
        }

        /* JADX INFO: renamed from: j */
        public float m34163j() {
            return this.f31073m;
        }

        /* JADX INFO: renamed from: k */
        public float m34164k() {
            return this.f31071k;
        }

        /* JADX INFO: renamed from: l */
        public void m34165l() {
            m34173t(m34159f());
        }

        /* JADX INFO: renamed from: m */
        public void m34166m() {
            this.f31071k = 0.0f;
            this.f31072l = 0.0f;
            this.f31073m = 0.0f;
            m34178y(0.0f);
            m34175v(0.0f);
            m34176w(0.0f);
        }

        /* JADX INFO: renamed from: n */
        public void m34167n(int i10) {
            this.f31080t = i10;
        }

        /* JADX INFO: renamed from: o */
        public void m34168o(float f10, float f11) {
            this.f31078r = (int) f10;
            this.f31079s = (int) f11;
        }

        /* JADX INFO: renamed from: p */
        public void m34169p(float f10) {
            if (f10 != this.f31076p) {
                this.f31076p = f10;
            }
        }

        /* JADX INFO: renamed from: q */
        public void m34170q(float f10) {
            this.f31077q = f10;
        }

        /* JADX INFO: renamed from: r */
        public void m34171r(int i10) {
            this.f31081u = i10;
        }

        /* JADX INFO: renamed from: s */
        public void m34172s(ColorFilter colorFilter) {
            this.f31062b.setColorFilter(colorFilter);
        }

        /* JADX INFO: renamed from: t */
        public void m34173t(int i10) {
            this.f31070j = i10;
            this.f31081u = this.f31069i[i10];
        }

        /* JADX INFO: renamed from: u */
        public void m34174u(int[] iArr) {
            this.f31069i = iArr;
            m34173t(0);
        }

        /* JADX INFO: renamed from: v */
        public void m34175v(float f10) {
            this.f31066f = f10;
        }

        /* JADX INFO: renamed from: w */
        public void m34176w(float f10) {
            this.f31067g = f10;
        }

        /* JADX INFO: renamed from: x */
        public void m34177x(boolean z10) {
            if (this.f31074n != z10) {
                this.f31074n = z10;
            }
        }

        /* JADX INFO: renamed from: y */
        public void m34178y(float f10) {
            this.f31065e = f10;
        }

        /* JADX INFO: renamed from: z */
        public void m34179z(float f10) {
            this.f31068h = f10;
            this.f31062b.setStrokeWidth(f10);
        }
    }

    public C8425b(Context context) {
        this.f31053c = ((Context) C12637g.m47075g(context)).getResources();
        c cVar = new c();
        this.f31051a = cVar;
        cVar.m34174u(f31050i);
        m34149k(2.5f);
        m34151m();
    }

    /* JADX INFO: renamed from: a */
    public final void m34139a(float f10, c cVar) {
        m34152n(f10, cVar);
        float fFloor = (float) (Math.floor(cVar.m34163j() / 0.8f) + 1.0d);
        cVar.m34178y(cVar.m34164k() + (((cVar.m34162i() - 0.01f) - cVar.m34164k()) * f10));
        cVar.m34175v(cVar.m34162i());
        cVar.m34176w(cVar.m34163j() + ((fFloor - cVar.m34163j()) * f10));
    }

    /* JADX INFO: renamed from: b */
    public void m34140b(float f10, c cVar, boolean z10) {
        float interpolation;
        float interpolation2;
        if (this.f31056f) {
            m34139a(f10, cVar);
            return;
        }
        if (f10 != 1.0f || z10) {
            float fM34163j = cVar.m34163j();
            if (f10 < 0.5f) {
                interpolation = cVar.m34164k();
                interpolation2 = (f31049h.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float fM34164k = cVar.m34164k() + 0.79f;
                interpolation = fM34164k - (((1.0f - f31049h.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = fM34164k;
            }
            float f11 = fM34163j + (0.20999998f * f10);
            float f12 = (f10 + this.f31055e) * 216.0f;
            cVar.m34178y(interpolation);
            cVar.m34175v(interpolation2);
            cVar.m34176w(f11);
            m34146h(f12);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m34141c(float f10, int i10, int i11) {
        int i12 = (i10 >> 24) & 255;
        int i13 = (i10 >> 16) & 255;
        int i14 = (i10 >> 8) & 255;
        int i15 = i10 & 255;
        return ((i12 + ((int) ((((i11 >> 24) & 255) - i12) * f10))) << 24) | ((i13 + ((int) ((((i11 >> 16) & 255) - i13) * f10))) << 16) | ((i14 + ((int) ((((i11 >> 8) & 255) - i14) * f10))) << 8) | (i15 + ((int) (f10 * ((i11 & 255) - i15))));
    }

    /* JADX INFO: renamed from: d */
    public void m34142d(boolean z10) {
        this.f31051a.m34177x(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f31052b, bounds.exactCenterX(), bounds.exactCenterY());
        this.f31051a.m34154a(canvas, bounds);
        canvas.restore();
    }

    /* JADX INFO: renamed from: e */
    public void m34143e(float f10) {
        this.f31051a.m34169p(f10);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: f */
    public void m34144f(int... iArr) {
        this.f31051a.m34174u(iArr);
        this.f31051a.m34173t(0);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: g */
    public void m34145g(float f10) {
        this.f31051a.m34176w(f10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f31051a.m34156c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m34146h(float f10) {
        this.f31052b = f10;
    }

    /* JADX INFO: renamed from: i */
    public final void m34147i(float f10, float f11, float f12, float f13) {
        c cVar = this.f31051a;
        float f14 = this.f31053c.getDisplayMetrics().density;
        cVar.m34179z(f11 * f14);
        cVar.m34170q(f10 * f14);
        cVar.m34173t(0);
        cVar.m34168o(f12 * f14, f13 * f14);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f31054d.isRunning();
    }

    /* JADX INFO: renamed from: j */
    public void m34148j(float f10, float f11) {
        this.f31051a.m34178y(f10);
        this.f31051a.m34175v(f11);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m34149k(float f10) {
        this.f31051a.m34179z(f10);
        invalidateSelf();
    }

    /* JADX INFO: renamed from: l */
    public void m34150l(int i10) {
        if (i10 == 0) {
            m34147i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m34147i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: m */
    public final void m34151m() {
        c cVar = this.f31051a;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a(cVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f31048g);
        valueAnimatorOfFloat.addListener(new b(cVar));
        this.f31054d = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: n */
    public void m34152n(float f10, c cVar) {
        if (f10 > 0.75f) {
            cVar.m34171r(m34141c((f10 - 0.75f) / 0.25f, cVar.m34161h(), cVar.m34158e()));
        } else {
            cVar.m34171r(cVar.m34161h());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f31051a.m34167n(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f31051a.m34172s(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f31054d.cancel();
        this.f31051a.m34153A();
        if (this.f31051a.m34157d() != this.f31051a.m34160g()) {
            this.f31056f = true;
            this.f31054d.setDuration(666L);
            this.f31054d.start();
        } else {
            this.f31051a.m34173t(0);
            this.f31051a.m34166m();
            this.f31054d.setDuration(1332L);
            this.f31054d.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f31054d.cancel();
        m34146h(0.0f);
        this.f31051a.m34177x(false);
        this.f31051a.m34173t(0);
        this.f31051a.m34166m();
        invalidateSelf();
    }
}
