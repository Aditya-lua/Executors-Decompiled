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
import bd.r;
import com.google.mlkit.common.MlKitException;
import dd.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jc.j;
import jc.k;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8234a;
    public final TimeInterpolator b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ValueAnimator f8235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f8238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<b> f8242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f8244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f8245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RectF f8246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f8248p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f8249q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public double f8250r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8251s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8252t;

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
        this(context, attributeSet, jc.b.B);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void b(b bVar) {
        this.f8242j.add(bVar);
    }

    public final void c(float f10, float f11) {
        this.f8252t = cd.a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) h(2)) + r.d(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iH = h(this.f8252t);
        float f10 = width;
        float f11 = iH;
        float fCos = (((float) Math.cos(this.f8250r)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f8250r))) + f12;
        this.f8245m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f8243k, this.f8245m);
        double dSin = Math.sin(this.f8250r);
        double dCos = Math.cos(this.f8250r);
        double d10 = iH - this.f8243k;
        this.f8245m.setStrokeWidth(this.f8247o);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d10)), height + ((int) (d10 * dSin)), this.f8245m);
        canvas.drawCircle(f10, f12, this.f8244l, this.f8245m);
    }

    public RectF e() {
        return this.f8246n;
    }

    public final int f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    public float g() {
        return this.f8248p;
    }

    public final int h(int i10) {
        return i10 == 2 ? Math.round(this.f8251s * 0.66f) : this.f8251s;
    }

    public int i() {
        return this.f8243k;
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
        if (z12 && this.f8236d) {
            z13 = true;
        }
        n(f12, z13);
        return true;
    }

    public void l(int i10) {
        this.f8251s = i10;
        invalidate();
    }

    public void m(float f10) {
        n(f10, false);
    }

    public void n(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f8235c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            o(f10, false);
            return;
        }
        Pair<Float, Float> pairJ = j(f10);
        this.f8235c.setFloatValues(((Float) pairJ.first).floatValue(), ((Float) pairJ.second).floatValue());
        this.f8235c.setDuration(this.f8234a);
        this.f8235c.setInterpolator(this.b);
        this.f8235c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(this.f8258a, valueAnimator2);
            }
        });
        this.f8235c.addListener(new a());
        this.f8235c.start();
    }

    public final void o(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f8248p = f11;
        this.f8250r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fH = h(this.f8252t);
        float fCos = width + (((float) Math.cos(this.f8250r)) * fH);
        float fSin = height + (fH * ((float) Math.sin(this.f8250r)));
        RectF rectF = this.f8246n;
        int i10 = this.f8243k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator<b> it = this.f8242j.iterator();
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
        if (this.f8235c.isRunning()) {
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
        float x5 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f8237e = x5;
            this.f8238f = y10;
            this.f8239g = true;
            this.f8249q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x5 - this.f8237e);
            int i11 = (int) (y10 - this.f8238f);
            this.f8239g = (i10 * i10) + (i11 * i11) > this.f8240h;
            z11 = this.f8249q;
            boolean z13 = actionMasked == 1;
            if (this.f8241i) {
                c(x5, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f8249q |= k(x5, y10, z11, z10, z12);
        return true;
    }

    public void p(boolean z10) {
        if (this.f8241i && !z10) {
            this.f8252t = 1;
        }
        this.f8241i = z10;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f8235c = new ValueAnimator();
        this.f8242j = new ArrayList();
        Paint paint = new Paint();
        this.f8245m = paint;
        this.f8246n = new RectF();
        this.f8252t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f20569l1, i10, j.C);
        this.f8234a = h.f(context, jc.b.F, MlKitException.CODE_SCANNER_UNAVAILABLE);
        this.b = h.g(context, jc.b.P, kc.a.b);
        this.f8251s = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f20587n1, 0);
        this.f8243k = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.f20596o1, 0);
        Resources resources = getResources();
        this.f8247o = resources.getDimensionPixelSize(jc.d.f20355x);
        this.f8244l = resources.getDimensionPixelSize(jc.d.f20353v);
        int color = typedArrayObtainStyledAttributes.getColor(k.f20578m1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(0.0f);
        this.f8240h = ViewConfiguration.get(context).getScaledTouchSlop();
        o0.w0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
