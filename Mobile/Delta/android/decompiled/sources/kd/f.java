package kd;

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
    public final int f22554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22555f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22556g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22557h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f22558i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View.OnClickListener f22559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnFocusChangeListener f22560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f22561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f22562m;

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
        this.f22559j = new View.OnClickListener() { // from class: kd.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f22549a, view);
            }
        };
        this.f22560k = new View.OnFocusChangeListener() { // from class: kd.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = this.f22550a;
                fVar.A(fVar.E());
            }
        };
        Context context = aVar.getContext();
        int i10 = ic.b.L;
        this.f22554e = cd.h.f(context, i10, 100);
        this.f22555f = cd.h.f(aVar.getContext(), i10, 150);
        this.f22556g = cd.h.g(aVar.getContext(), ic.b.Q, jc.a.f21812a);
        this.f22557h = cd.h.g(aVar.getContext(), ic.b.P, jc.a.f21814d);
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f22558i;
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
        fVar.f22592d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f22592d.setScaleX(fFloatValue);
        fVar.f22592d.setScaleY(fFloatValue);
    }

    public final void A(boolean z10) {
        boolean z11 = this.b.F() == z10;
        if (z10 && !this.f22561l.isRunning()) {
            this.f22562m.cancel();
            this.f22561l.start();
            if (z11) {
                this.f22561l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f22561l.cancel();
        this.f22562m.start();
        if (z11) {
            this.f22562m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f22556g);
        valueAnimatorOfFloat.setDuration(this.f22554e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kd.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f22551a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f22557h);
        valueAnimatorOfFloat.setDuration(this.f22555f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kd.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f22553a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f22561l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f22561l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f22562m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.f22558i;
        if (editText != null) {
            return (editText.hasFocus() || this.f22592d.hasFocus()) && this.f22558i.getText().length() > 0;
        }
        return false;
    }

    @Override // kd.r
    public void a(@NonNull Editable editable) {
        if (this.b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // kd.r
    public int c() {
        return ic.i.f20734e;
    }

    @Override // kd.r
    public int d() {
        return ic.e.f20680l;
    }

    @Override // kd.r
    public View.OnFocusChangeListener e() {
        return this.f22560k;
    }

    @Override // kd.r
    public View.OnClickListener f() {
        return this.f22559j;
    }

    @Override // kd.r
    public View.OnFocusChangeListener g() {
        return this.f22560k;
    }

    @Override // kd.r
    public void n(EditText editText) {
        this.f22558i = editText;
        this.f22590a.setEndIconVisible(E());
    }

    @Override // kd.r
    public void q(boolean z10) {
        if (this.b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // kd.r
    public void s() {
        D();
    }

    @Override // kd.r
    public void u() {
        EditText editText = this.f22558i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: kd.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22552a.A(true);
                }
            });
        }
    }
}
