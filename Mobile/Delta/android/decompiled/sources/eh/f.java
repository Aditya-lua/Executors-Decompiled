package eh;

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
import com.google.mlkit.common.MlKitException;
import sg.s0;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f15527a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f15530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15534i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15535j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15536k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15537l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15538m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15539n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ValueAnimator f15540o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f15541p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f15542q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rect f15543r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15544s = 60;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15545t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f15546u = 12105912;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f15547v = 3500;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f15548w = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f15549x = 50.0f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f15529d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f.this.f15527a.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f15533h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f15533h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            f.this.f15527a.invalidate();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f.this.f15539n = false;
            f.this.h();
        }
    }

    public f(View view, AttributeSet attributeSet) {
        this.f15527a = null;
        if (view != null) {
            this.f15527a = view;
            if (attributeSet == null) {
                this.f15529d = 50.0f;
                this.f15530e = 50.0f;
                this.f15534i = 3500;
                this.f15535j = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;
                this.f15531f = 60;
                this.f15532g = 10;
                this.f15536k = 12105912;
                this.f15538m = 12105912;
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, s0.D0);
            float f10 = typedArrayObtainStyledAttributes.getFloat(s0.K0, 50.0f);
            this.f15529d = f10;
            this.f15530e = f10;
            this.f15534i = typedArrayObtainStyledAttributes.getInt(s0.G0, 3500);
            this.f15535j = typedArrayObtainStyledAttributes.getInt(s0.H0, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
            this.f15531f = typedArrayObtainStyledAttributes.getInt(s0.I0, 60);
            this.f15532g = typedArrayObtainStyledAttributes.getInt(s0.E0, 10);
            this.f15536k = typedArrayObtainStyledAttributes.getColor(s0.J0, 12105912);
            this.f15538m = typedArrayObtainStyledAttributes.getColor(s0.F0, 12105912);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean f() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f15540o;
        return valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator = this.f15541p) != null && valueAnimator.isRunning() && (valueAnimator2 = this.f15542q) != null && valueAnimator2.isRunning();
    }

    public final float g(int i10, int i11) {
        int i12;
        int i13;
        Rect rect = this.f15543r;
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
        ValueAnimator valueAnimator = this.f15540o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f15540o.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f15541p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f15541p.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f15542q;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f15542q.removeAllListeners();
        }
    }

    public void i(Canvas canvas) {
        if (this.f15539n) {
            Paint paint = new Paint(1);
            paint.setColor(this.f15537l);
            paint.setAlpha(this.f15533h);
            canvas.drawCircle(this.b, this.f15528c, this.f15529d, paint);
        }
    }

    public final void j() {
        if (f()) {
            h();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f15533h, 0);
        this.f15541p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new c());
        this.f15541p.addListener(new d());
        this.f15541p.setDuration(this.f15535j);
        this.f15541p.setInterpolator(new DecelerateInterpolator());
        this.f15541p.start();
    }

    public final boolean k(int i10, int i11) {
        int[] iArr = new int[2];
        this.f15527a.getLocationInWindow(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        return i10 >= i12 && i10 <= i12 + this.f15527a.getWidth() && i11 >= i13 && i11 <= i13 + this.f15527a.getHeight();
    }

    public void l(MotionEvent motionEvent) {
        if (this.f15543r == null) {
            Rect rect = new Rect();
            this.f15543r = rect;
            this.f15527a.getDrawingRect(rect);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f15539n = true;
            this.b = motionEvent.getX();
            this.f15528c = motionEvent.getY();
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
        float f10 = this.f15530e;
        this.f15529d = f10;
        this.f15533h = this.f15531f;
        this.f15537l = this.f15536k;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, g((int) this.b, (int) this.f15528c));
        this.f15540o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new a());
        this.f15540o.setDuration(this.f15534i);
        this.f15540o.setInterpolator(new g4.c());
        this.f15540o.start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f15533h, this.f15532g);
        this.f15541p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new b());
        this.f15541p.setDuration(this.f15534i);
        this.f15541p.setInterpolator(new g4.a());
        this.f15541p.start();
    }
}
