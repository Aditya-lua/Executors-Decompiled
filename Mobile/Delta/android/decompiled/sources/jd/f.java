package jd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class f extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f21268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f21269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f21270i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View.OnClickListener f21271j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnFocusChangeListener f21272k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f21273l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f21274m;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.b.a0(true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.b.a0(false);
        }
    }

    public f(@NonNull com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f21271j = new View.OnClickListener() { // from class: jd.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f21261a, view);
            }
        };
        this.f21272k = new View.OnFocusChangeListener() { // from class: jd.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = this.f21262a;
                fVar.A(fVar.E());
            }
        };
        Context context = aVar.getContext();
        int i10 = hc.b.L;
        this.f21266e = bd.h.f(context, i10, 100);
        this.f21267f = bd.h.f(aVar.getContext(), i10, 150);
        this.f21268g = bd.h.g(aVar.getContext(), hc.b.Q, ic.a.f20471a);
        this.f21269h = bd.h.g(aVar.getContext(), hc.b.P, ic.a.f20473d);
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f21270i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f21304d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f21304d.setScaleX(fFloatValue);
        fVar.f21304d.setScaleY(fFloatValue);
    }

    public final void A(boolean z10) {
        boolean z11 = this.b.F() == z10;
        if (z10 && !this.f21273l.isRunning()) {
            this.f21274m.cancel();
            this.f21273l.start();
            if (z11) {
                this.f21273l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f21273l.cancel();
        this.f21274m.start();
        if (z11) {
            this.f21274m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f21268g);
        valueAnimatorOfFloat.setDuration(this.f21266e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jd.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f21263a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f21269h);
        valueAnimatorOfFloat.setDuration(this.f21267f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jd.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f21265a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f21273l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f21273l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f21274m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.f21270i;
        if (editText != null) {
            return (editText.hasFocus() || this.f21304d.hasFocus()) && this.f21270i.getText().length() > 0;
        }
        return false;
    }

    @Override // jd.r
    public void a(@NonNull Editable editable) {
        if (this.b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // jd.r
    public int c() {
        return hc.i.f18912e;
    }

    @Override // jd.r
    public int d() {
        return hc.e.f18858l;
    }

    @Override // jd.r
    public View.OnFocusChangeListener e() {
        return this.f21272k;
    }

    @Override // jd.r
    public View.OnClickListener f() {
        return this.f21271j;
    }

    @Override // jd.r
    public View.OnFocusChangeListener g() {
        return this.f21272k;
    }

    @Override // jd.r
    public void n(EditText editText) {
        this.f21270i = editText;
        this.f21302a.setEndIconVisible(E());
    }

    @Override // jd.r
    public void q(boolean z10) {
        if (this.b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // jd.r
    public void s() {
        D();
    }

    @Override // jd.r
    public void u() {
        EditText editText = this.f21270i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: jd.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21264a.A(true);
                }
            });
        }
    }
}
