package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import bh.s0;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f25597a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f25598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f25599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f25600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f25601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f25602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f25604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f25605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f25606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f25607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f25608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f25609n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ValueAnimator f25610o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f25611p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f25612q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rect f25613r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f25614s = 60;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f25615t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f25616u = 12105912;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f25617v = 3500;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f25618w = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f25619x = 50.0f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f25599d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f.this.f25597a.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f25603h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f25603h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            f.this.f25597a.invalidate();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f.this.f25609n = false;
            f.this.h();
        }
    }

    public f(View view, AttributeSet attributeSet) {
        this.f25597a = null;
        if (view != null) {
            this.f25597a = view;
            if (attributeSet == null) {
                this.f25599d = 50.0f;
                this.f25600e = 50.0f;
                this.f25604i = 3500;
                this.f25605j = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;
                this.f25601f = 60;
                this.f25602g = 10;
                this.f25606k = 12105912;
                this.f25608m = 12105912;
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, s0.B0);
            float f10 = typedArrayObtainStyledAttributes.getFloat(s0.I0, 50.0f);
            this.f25599d = f10;
            this.f25600e = f10;
            this.f25604i = typedArrayObtainStyledAttributes.getInt(s0.E0, 3500);
            this.f25605j = typedArrayObtainStyledAttributes.getInt(s0.F0, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
            this.f25601f = typedArrayObtainStyledAttributes.getInt(s0.G0, 60);
            this.f25602g = typedArrayObtainStyledAttributes.getInt(s0.C0, 10);
            this.f25606k = typedArrayObtainStyledAttributes.getColor(s0.H0, 12105912);
            this.f25608m = typedArrayObtainStyledAttributes.getColor(s0.D0, 12105912);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean f() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f25610o;
        return valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator = this.f25611p) != null && valueAnimator.isRunning() && (valueAnimator2 = this.f25612q) != null && valueAnimator2.isRunning();
    }

    public final float g(int i10, int i11) {
        int i12;
        int i13;
        Rect rect = this.f25613r;
        if (rect != null) {
            int i14 = rect.left;
            int i15 = i10 - i14;
            int i16 = rect.right;
            i12 = i15 > i16 - i10 ? i10 - i14 : i16 - i10;
            int i17 = rect.top;
            int i18 = i11 - i17;
            int i19 = rect.bottom;
            i13 = i18 > i19 - i11 ? i11 - i17 : i19 - i11;
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (i13 > i12) {
            i12 = i13;
        }
        return i12 + 300.0f;
    }

    public final void h() {
        ValueAnimator valueAnimator = this.f25610o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f25610o.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f25611p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f25611p.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f25612q;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f25612q.removeAllListeners();
        }
    }

    public void i(Canvas canvas) {
        if (this.f25609n) {
            Paint paint = new Paint(1);
            paint.setColor(this.f25607l);
            paint.setAlpha(this.f25603h);
            canvas.drawCircle(this.b, this.f25598c, this.f25599d, paint);
        }
    }

    public final void j() {
        if (f()) {
            h();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f25603h, 0);
        this.f25611p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new c());
        this.f25611p.addListener(new d());
        this.f25611p.setDuration(this.f25605j);
        this.f25611p.setInterpolator(new DecelerateInterpolator());
        this.f25611p.start();
    }

    public final boolean k(int i10, int i11) {
        int[] iArr = new int[2];
        this.f25597a.getLocationInWindow(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        return i10 >= i12 && i10 <= i12 + this.f25597a.getWidth() && i11 >= i13 && i11 <= i13 + this.f25597a.getHeight();
    }

    public void l(MotionEvent motionEvent) {
        if (this.f25613r == null) {
            Rect rect = new Rect();
            this.f25613r = rect;
            this.f25597a.getDrawingRect(rect);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25609n = true;
            this.b = motionEvent.getX();
            this.f25598c = motionEvent.getY();
            m();
            return;
        }
        if (action == 1) {
            j();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            j();
        } else {
            if (k((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return;
            }
            j();
        }
    }

    public final void m() {
        if (f()) {
            h();
        }
        float f10 = this.f25600e;
        this.f25599d = f10;
        this.f25603h = this.f25601f;
        this.f25607l = this.f25606k;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, g((int) this.b, (int) this.f25598c));
        this.f25610o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new a());
        this.f25610o.setDuration(this.f25604i);
        this.f25610o.setInterpolator(new h4.c());
        this.f25610o.start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f25603h, this.f25602g);
        this.f25611p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new b());
        this.f25611p.setDuration(this.f25604i);
        this.f25611p.setInterpolator(new h4.a());
        this.f25611p.start();
    }
}
