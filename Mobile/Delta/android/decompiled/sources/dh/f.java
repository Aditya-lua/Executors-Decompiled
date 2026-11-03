package dh;

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
import rg.s0;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f14781a;
    public float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14793n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ValueAnimator f14794o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ValueAnimator f14795p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f14796q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rect f14797r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14798s = 60;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14799t = 10;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f14800u = 12105912;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f14801v = 3500;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f14802w = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f14803x = 50.0f;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f14783d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            f.this.f14781a.invalidate();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f14787h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            f.this.f14787h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            f.this.f14781a.invalidate();
        }
    }

    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f.this.f14793n = false;
            f.this.h();
        }
    }

    public f(View view, AttributeSet attributeSet) {
        this.f14781a = null;
        if (view != null) {
            this.f14781a = view;
            if (attributeSet == null) {
                this.f14783d = 50.0f;
                this.f14784e = 50.0f;
                this.f14788i = 3500;
                this.f14789j = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;
                this.f14785f = 60;
                this.f14786g = 10;
                this.f14790k = 12105912;
                this.f14792m = 12105912;
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, s0.D0);
            float f10 = typedArrayObtainStyledAttributes.getFloat(s0.K0, 50.0f);
            this.f14783d = f10;
            this.f14784e = f10;
            this.f14788i = typedArrayObtainStyledAttributes.getInt(s0.G0, 3500);
            this.f14789j = typedArrayObtainStyledAttributes.getInt(s0.H0, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
            this.f14785f = typedArrayObtainStyledAttributes.getInt(s0.I0, 60);
            this.f14786g = typedArrayObtainStyledAttributes.getInt(s0.E0, 10);
            this.f14790k = typedArrayObtainStyledAttributes.getColor(s0.J0, 12105912);
            this.f14792m = typedArrayObtainStyledAttributes.getColor(s0.F0, 12105912);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean f() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f14794o;
        return valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator = this.f14795p) != null && valueAnimator.isRunning() && (valueAnimator2 = this.f14796q) != null && valueAnimator2.isRunning();
    }

    public final float g(int i10, int i11) {
        int i12;
        int i13;
        Rect rect = this.f14797r;
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
        ValueAnimator valueAnimator = this.f14794o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14794o.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f14795p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f14795p.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f14796q;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f14796q.removeAllListeners();
        }
    }

    public void i(Canvas canvas) {
        if (this.f14793n) {
            Paint paint = new Paint(1);
            paint.setColor(this.f14791l);
            paint.setAlpha(this.f14787h);
            canvas.drawCircle(this.b, this.f14782c, this.f14783d, paint);
        }
    }

    public final void j() {
        if (f()) {
            h();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f14787h, 0);
        this.f14795p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new c());
        this.f14795p.addListener(new d());
        this.f14795p.setDuration(this.f14789j);
        this.f14795p.setInterpolator(new DecelerateInterpolator());
        this.f14795p.start();
    }

    public final boolean k(int i10, int i11) {
        int[] iArr = new int[2];
        this.f14781a.getLocationInWindow(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        return i10 >= i12 && i10 <= i12 + this.f14781a.getWidth() && i11 >= i13 && i11 <= i13 + this.f14781a.getHeight();
    }

    public void l(MotionEvent motionEvent) {
        if (this.f14797r == null) {
            Rect rect = new Rect();
            this.f14797r = rect;
            this.f14781a.getDrawingRect(rect);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f14793n = true;
            this.b = motionEvent.getX();
            this.f14782c = motionEvent.getY();
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
        float f10 = this.f14784e;
        this.f14783d = f10;
        this.f14787h = this.f14785f;
        this.f14791l = this.f14790k;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, g((int) this.b, (int) this.f14782c));
        this.f14794o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new a());
        this.f14794o.setDuration(this.f14788i);
        this.f14794o.setInterpolator(new g4.c());
        this.f14794o.start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f14787h, this.f14786g);
        this.f14795p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new b());
        this.f14795p.setDuration(this.f14788i);
        this.f14795p.setInterpolator(new g4.a());
        this.f14795p.start();
    }
}
