package com.google.android.material.timepicker;

import ad.C0146r;
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
import androidx.core.view.C0625o0;
import bd.C1304a;
import cd.C1627h;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6746j;
import p194ic.C6747k;
import p216jc.C7137a;

/* JADX INFO: loaded from: classes2.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: a */
    public final int f10687a;

    /* JADX INFO: renamed from: b */
    public final TimeInterpolator f10688b;

    /* JADX INFO: renamed from: c */
    public final ValueAnimator f10689c;

    /* JADX INFO: renamed from: d */
    public boolean f10690d;

    /* JADX INFO: renamed from: e */
    public float f10691e;

    /* JADX INFO: renamed from: f */
    public float f10692f;

    /* JADX INFO: renamed from: g */
    public boolean f10693g;

    /* JADX INFO: renamed from: h */
    public final int f10694h;

    /* JADX INFO: renamed from: i */
    public boolean f10695i;

    /* JADX INFO: renamed from: j */
    public final List<InterfaceC2868b> f10696j;

    /* JADX INFO: renamed from: k */
    public final int f10697k;

    /* JADX INFO: renamed from: l */
    public final float f10698l;

    /* JADX INFO: renamed from: m */
    public final Paint f10699m;

    /* JADX INFO: renamed from: n */
    public final RectF f10700n;

    /* JADX INFO: renamed from: o */
    public final int f10701o;

    /* JADX INFO: renamed from: p */
    public float f10702p;

    /* JADX INFO: renamed from: q */
    public boolean f10703q;

    /* JADX INFO: renamed from: r */
    public double f10704r;

    /* JADX INFO: renamed from: s */
    public int f10705s;

    /* JADX INFO: renamed from: t */
    public int f10706t;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public class C2867a extends AnimatorListenerAdapter {
        public C2867a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public interface InterfaceC2868b {
        /* JADX INFO: renamed from: a */
        void mo13282a(float f10, boolean z10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6738b.f25860B);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13283a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.m13297o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    /* JADX INFO: renamed from: b */
    public void m13284b(InterfaceC2868b interfaceC2868b) {
        this.f10696j.add(interfaceC2868b);
    }

    /* JADX INFO: renamed from: c */
    public final void m13285c(float f10, float f11) {
        this.f10706t = C1304a.m7096a((float) (getWidth() / 2), (float) (getHeight() / 2), f10, f11) > ((float) m13290h(2)) + C0146r.m449d(getContext(), 12) ? 1 : 2;
    }

    /* JADX INFO: renamed from: d */
    public final void m13286d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int iM13290h = m13290h(this.f10706t);
        float f10 = width;
        float f11 = iM13290h;
        float fCos = (((float) Math.cos(this.f10704r)) * f11) + f10;
        float f12 = height;
        float fSin = (f11 * ((float) Math.sin(this.f10704r))) + f12;
        this.f10699m.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f10697k, this.f10699m);
        double dSin = Math.sin(this.f10704r);
        double dCos = Math.cos(this.f10704r);
        double d10 = iM13290h - this.f10697k;
        this.f10699m.setStrokeWidth(this.f10701o);
        canvas.drawLine(f10, f12, width + ((int) (dCos * d10)), height + ((int) (d10 * dSin)), this.f10699m);
        canvas.drawCircle(f10, f12, this.f10698l, this.f10699m);
    }

    /* JADX INFO: renamed from: e */
    public RectF m13287e() {
        return this.f10700n;
    }

    /* JADX INFO: renamed from: f */
    public final int m13288f(float f10, float f11) {
        int degrees = (int) Math.toDegrees(Math.atan2(f11 - (getHeight() / 2), f10 - (getWidth() / 2)));
        int i10 = degrees + 90;
        return i10 < 0 ? degrees + 450 : i10;
    }

    /* JADX INFO: renamed from: g */
    public float m13289g() {
        return this.f10702p;
    }

    /* JADX INFO: renamed from: h */
    public final int m13290h(int i10) {
        return i10 == 2 ? Math.round(this.f10705s * 0.66f) : this.f10705s;
    }

    /* JADX INFO: renamed from: i */
    public int m13291i() {
        return this.f10697k;
    }

    /* JADX INFO: renamed from: j */
    public final Pair<Float, Float> m13292j(float f10) {
        float fM13289g = m13289g();
        if (Math.abs(fM13289g - f10) > 180.0f) {
            if (fM13289g > 180.0f && f10 < 180.0f) {
                f10 += 360.0f;
            }
            if (fM13289g < 180.0f && f10 > 180.0f) {
                fM13289g += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fM13289g), Float.valueOf(f10));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m13293k(float f10, float f11, boolean z10, boolean z11, boolean z12) {
        float fM13288f = m13288f(f10, f11);
        boolean z13 = false;
        boolean z14 = m13289g() != fM13288f;
        if (z11 && z14) {
            return true;
        }
        if (!z14 && !z10) {
            return false;
        }
        if (z12 && this.f10690d) {
            z13 = true;
        }
        m13296n(fM13288f, z13);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m13294l(int i10) {
        this.f10705s = i10;
        invalidate();
    }

    /* JADX INFO: renamed from: m */
    public void m13295m(float f10) {
        m13296n(f10, false);
    }

    /* JADX INFO: renamed from: n */
    public void m13296n(float f10, boolean z10) {
        ValueAnimator valueAnimator = this.f10689c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            m13297o(f10, false);
            return;
        }
        Pair<Float, Float> pairM13292j = m13292j(f10);
        this.f10689c.setFloatValues(((Float) pairM13292j.first).floatValue(), ((Float) pairM13292j.second).floatValue());
        this.f10689c.setDuration(this.f10687a);
        this.f10689c.setInterpolator(this.f10688b);
        this.f10689c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.m13283a(this.f10725a, valueAnimator2);
            }
        });
        this.f10689c.addListener(new C2867a());
        this.f10689c.start();
    }

    /* JADX INFO: renamed from: o */
    public final void m13297o(float f10, boolean z10) {
        float f11 = f10 % 360.0f;
        this.f10702p = f11;
        this.f10704r = Math.toRadians(f11 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fM13290h = m13290h(this.f10706t);
        float fCos = width + (((float) Math.cos(this.f10704r)) * fM13290h);
        float fSin = height + (fM13290h * ((float) Math.sin(this.f10704r)));
        RectF rectF = this.f10700n;
        int i10 = this.f10697k;
        rectF.set(fCos - i10, fSin - i10, fCos + i10, fSin + i10);
        Iterator<InterfaceC2868b> it = this.f10696j.iterator();
        while (it.hasNext()) {
            it.next().mo13282a(f11, z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m13286d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.f10689c.isRunning()) {
            return;
        }
        m13295m(m13289g());
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
            this.f10691e = x10;
            this.f10692f = y10;
            this.f10693g = true;
            this.f10703q = false;
            z10 = true;
            z11 = false;
            z12 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i10 = (int) (x10 - this.f10691e);
            int i11 = (int) (y10 - this.f10692f);
            this.f10693g = (i10 * i10) + (i11 * i11) > this.f10694h;
            z11 = this.f10703q;
            boolean z13 = actionMasked == 1;
            if (this.f10695i) {
                m13285c(x10, y10);
            }
            z12 = z13;
            z10 = false;
        } else {
            z11 = false;
            z10 = false;
            z12 = false;
        }
        this.f10703q |= m13293k(x10, y10, z11, z10, z12);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m13298p(boolean z10) {
        if (this.f10695i && !z10) {
            this.f10706t = 1;
        }
        this.f10695i = z10;
        invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ClockHandView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f10689c = new ValueAnimator();
        this.f10696j = new ArrayList();
        Paint paint = new Paint();
        this.f10699m = paint;
        this.f10700n = new RectF();
        this.f10706t = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26473l1, i10, C6746j.f26107C);
        this.f10687a = C1627h.m8223f(context, C6738b.f25864F, MlKitException.CODE_SCANNER_UNAVAILABLE);
        this.f10688b = C1627h.m8224g(context, C6738b.f25874P, C7137a.f27785b);
        this.f10705s = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26491n1, 0);
        this.f10697k = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6747k.f26500o1, 0);
        Resources resources = getResources();
        this.f10701o = resources.getDimensionPixelSize(C6740d.f25991x);
        this.f10698l = resources.getDimensionPixelSize(C6740d.f25989v);
        int color = typedArrayObtainStyledAttributes.getColor(C6747k.f26482m1, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m13295m(0.0f);
        this.f10694h = ViewConfiguration.get(context).getScaledTouchSlop();
        C0625o0.m3060w0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
