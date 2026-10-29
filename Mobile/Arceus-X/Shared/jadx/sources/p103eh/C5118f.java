package p103eh;

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
import p144g4.C6002a;
import p144g4.C6004c;
import sg.C11353s0;

/* JADX INFO: renamed from: eh.f */
/* JADX INFO: loaded from: classes2.dex */
public class C5118f {

    /* JADX INFO: renamed from: a */
    public View f19950a;

    /* JADX INFO: renamed from: b */
    public float f19951b;

    /* JADX INFO: renamed from: c */
    public float f19952c;

    /* JADX INFO: renamed from: d */
    public float f19953d;

    /* JADX INFO: renamed from: e */
    public float f19954e;

    /* JADX INFO: renamed from: f */
    public int f19955f;

    /* JADX INFO: renamed from: g */
    public int f19956g;

    /* JADX INFO: renamed from: h */
    public int f19957h;

    /* JADX INFO: renamed from: i */
    public int f19958i;

    /* JADX INFO: renamed from: j */
    public int f19959j;

    /* JADX INFO: renamed from: k */
    public int f19960k;

    /* JADX INFO: renamed from: l */
    public int f19961l;

    /* JADX INFO: renamed from: m */
    public int f19962m;

    /* JADX INFO: renamed from: n */
    public boolean f19963n = false;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f19964o = null;

    /* JADX INFO: renamed from: p */
    public ValueAnimator f19965p = null;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f19966q = null;

    /* JADX INFO: renamed from: r */
    public Rect f19967r = null;

    /* JADX INFO: renamed from: s */
    public final int f19968s = 60;

    /* JADX INFO: renamed from: t */
    public final int f19969t = 10;

    /* JADX INFO: renamed from: u */
    public final int f19970u = 12105912;

    /* JADX INFO: renamed from: v */
    public final int f19971v = 3500;

    /* JADX INFO: renamed from: w */
    public final int f19972w = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;

    /* JADX INFO: renamed from: x */
    public final float f19973x = 50.0f;

    /* JADX INFO: renamed from: eh.f$a */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5118f.this.f19953d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C5118f.this.f19950a.invalidate();
        }
    }

    /* JADX INFO: renamed from: eh.f$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5118f.this.f19957h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        }
    }

    /* JADX INFO: renamed from: eh.f$c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C5118f.this.f19957h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C5118f.this.f19950a.invalidate();
        }
    }

    /* JADX INFO: renamed from: eh.f$d */
    public class d extends AnimatorListenerAdapter {
        public d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C5118f.this.f19963n = false;
            C5118f.this.m23891h();
        }
    }

    public C5118f(View view, AttributeSet attributeSet) {
        this.f19950a = null;
        if (view != null) {
            this.f19950a = view;
            if (attributeSet == null) {
                this.f19953d = 50.0f;
                this.f19954e = 50.0f;
                this.f19958i = 3500;
                this.f19959j = MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE;
                this.f19955f = 60;
                this.f19956g = 10;
                this.f19960k = 12105912;
                this.f19962m = 12105912;
                return;
            }
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C11353s0.f40048D0);
            float f10 = typedArrayObtainStyledAttributes.getFloat(C11353s0.f40062K0, 50.0f);
            this.f19953d = f10;
            this.f19954e = f10;
            this.f19958i = typedArrayObtainStyledAttributes.getInt(C11353s0.f40054G0, 3500);
            this.f19959j = typedArrayObtainStyledAttributes.getInt(C11353s0.f40056H0, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
            this.f19955f = typedArrayObtainStyledAttributes.getInt(C11353s0.f40058I0, 60);
            this.f19956g = typedArrayObtainStyledAttributes.getInt(C11353s0.f40050E0, 10);
            this.f19960k = typedArrayObtainStyledAttributes.getColor(C11353s0.f40060J0, 12105912);
            this.f19962m = typedArrayObtainStyledAttributes.getColor(C11353s0.f40052F0, 12105912);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m23889f() {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3 = this.f19964o;
        return valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator = this.f19965p) != null && valueAnimator.isRunning() && (valueAnimator2 = this.f19966q) != null && valueAnimator2.isRunning();
    }

    /* JADX INFO: renamed from: g */
    public final float m23890g(int i10, int i11) {
        int i12;
        int i13;
        Rect rect = this.f19967r;
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

    /* JADX INFO: renamed from: h */
    public final void m23891h() {
        ValueAnimator valueAnimator = this.f19964o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f19964o.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.f19965p;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.f19965p.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f19966q;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
            this.f19966q.removeAllListeners();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m23892i(Canvas canvas) {
        if (this.f19963n) {
            Paint paint = new Paint(1);
            paint.setColor(this.f19961l);
            paint.setAlpha(this.f19957h);
            canvas.drawCircle(this.f19951b, this.f19952c, this.f19953d, paint);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m23893j() {
        if (m23889f()) {
            m23891h();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f19957h, 0);
        this.f19965p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new c());
        this.f19965p.addListener(new d());
        this.f19965p.setDuration(this.f19959j);
        this.f19965p.setInterpolator(new DecelerateInterpolator());
        this.f19965p.start();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m23894k(int i10, int i11) {
        int[] iArr = new int[2];
        this.f19950a.getLocationInWindow(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        return i10 >= i12 && i10 <= i12 + this.f19950a.getWidth() && i11 >= i13 && i11 <= i13 + this.f19950a.getHeight();
    }

    /* JADX INFO: renamed from: l */
    public void m23895l(MotionEvent motionEvent) {
        if (this.f19967r == null) {
            Rect rect = new Rect();
            this.f19967r = rect;
            this.f19950a.getDrawingRect(rect);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19963n = true;
            this.f19951b = motionEvent.getX();
            this.f19952c = motionEvent.getY();
            m23896m();
            return;
        }
        if (action == 1) {
            m23893j();
            return;
        }
        if (action != 2) {
            if (action != 3) {
                return;
            }
            m23893j();
        } else {
            if (m23894k((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                return;
            }
            m23893j();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m23896m() {
        if (m23889f()) {
            m23891h();
        }
        float f10 = this.f19954e;
        this.f19953d = f10;
        this.f19957h = this.f19955f;
        this.f19961l = this.f19960k;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10, m23890g((int) this.f19951b, (int) this.f19952c));
        this.f19964o = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new a());
        this.f19964o.setDuration(this.f19958i);
        this.f19964o.setInterpolator(new C6004c());
        this.f19964o.start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f19957h, this.f19956g);
        this.f19965p = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new b());
        this.f19965p.setDuration(this.f19958i);
        this.f19965p.setInterpolator(new C6002a());
        this.f19965p.start();
    }
}
