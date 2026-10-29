package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.o0;
import bd.h;
import com.google.mlkit.common.MlKitException;
import hc.j;
import hc.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zc.r;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8317a;
    public final TimeInterpolator b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ValueAnimator f8318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8320e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8322g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8323h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8324i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<b> f8325j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8326k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f8327l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f8328m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RectF f8329n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8330o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f8331p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8332q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f8333r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8334s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8335t;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f10, boolean z10);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, hc.b.B);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void b(b bVar) {
        this.f8325j.add(bVar);
    }

    public final void c(float f10, float f11) {
        this.f8335t = ad.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + r.d(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iH = h(this.f8335t);
        float f10 = width;
        float f11 = iH;
        float fCos = (((float) Math.cos(this.f8333r)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f8333r))) + f12;
        this.f8328m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f8326k, this.f8328m);
        double dSin = Math.sin(this.f8333r);
        double dCos = Math.cos(this.f8333r);
        double d10 = iH - this.f8326k;
        this.f8328m.setStrokeWidth(this.f8330o);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d10)), height + ((int) (d10 * dSin)), this.f8328m);
        canvas.drawCircle(f10, f12, this.f8327l, this.f8328m);
    }

    public RectF e() {
        return this.f8329n;
    }

    public final int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    public float g() {
        return this.f8331p;
    }

    public final int h(int i10) {
        return i10 == 2 ? Math.round(this.f8334s * 0.66f) : this.f8334s;
    }

    public int i() {
        return this.f8326k;
    }

    public final Pair<Float, Float> j(float f10) {
        float fG = g();
        if (Math.abs(fG - f10) > 180.0f) {
            if (fG > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fG < 180.0f && f10 > 180.0f) {
                fG += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fG), Float.valueOf(f10));
    }

    public final boolean k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float f12 = f(f10, f11);
        boolean z13 = false;
        boolean z14 = g() != f12;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f8319d) {
            z13 = true;
        }
        n(f12, z13);
        return true;
    }

    public void l(int i10) {
        this.f8334s = i10;
        invalidate();
    }

    public void m(float f10) {
        n(f10, false);
    }

    public void n(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f8318c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            o(f10, false);
            return;
        }
        Pair<Float, Float> pairJ = j(f10);
        this.f8318c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f8318c.setDuration(this.f8317a);
        this.f8318c.setInterpolator(this.b);
        this.f8318c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(this.f8347a, valueAnimator2);
            }
        });
        this.f8318c.addListener(new a());
        this.f8318c.start();
    }

    public final void o(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f8331p = f11;
        this.f8333r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f8335t);
        float fCos = width + (((float) Math.cos(this.f8333r)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f8333r)));
        RectF rectF = this.f8329n;
        int i10 = this.f8326k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator<b> it = this.f8325j.iterator();
        while (it.hasNext()) {
            it.next().a(f11, z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f8318c.isRunning()) {
            return;
        }
        m(g());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f8320e = x10;
            this.f8321f = y10;
            this.f8322g = true;
            this.f8332q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f8320e);
            int i11 = (int) (y10 - this.f8321f);
            this.f8322g = (i10 * i10) + (i11 * i11) > this.f8323h;
            z11 = this.f8332q;
            boolean z13 = actionMasked == 1;
            if (this.f8324i) {
                c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f8332q |= k(x10, y10, z11, z10, z12);
        return true;
    }

    public void p(boolean z10) {
        if (this.f8324i && !z10) {
            this.f8335t = 1;
        }
        this.f8324i = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8318c = new ValueAnimator();
        this.f8325j = new ArrayList();
        Paint paint = new Paint();
        this.f8328m = paint;
        this.f8329n = new RectF();
        this.f8335t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f19059l1, i10, j.C);
        this.f8317a = h.f(context, hc.b.F, MlKitException.CODE_SCANNER_UNAVAILABLE);
        this.b = h.g(context, hc.b.P, ic.a.b);
        this.f8334s = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f19077n1, 0);
        this.f8326k = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f19086o1, 0);
        Resources resources = getResources();
        this.f8330o = resources.getDimensionPixelSize(hc.d.f18845x);
        this.f8327l = resources.getDimensionPixelSize(hc.d.f18843v);
        int color = typedArrayObtainStyledAttributes.getColor(k.f19068m1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(0.0f);
        this.f8323h = ViewConfiguration.get(context).getScaledTouchSlop();
        o0.w0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
