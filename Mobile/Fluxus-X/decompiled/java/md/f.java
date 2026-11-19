package md;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class f extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23132e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23133f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f23134g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f23135h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public EditText f23136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View.OnClickListener f23137j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnFocusChangeListener f23138k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f23139l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f23140m;

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
        this.f23137j = new View.OnClickListener() { // from class: md.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f23127a, view);
            }
        };
        this.f23138k = new View.OnFocusChangeListener() { // from class: md.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = this.f23128a;
                fVar.A(fVar.E());
            }
        };
        this.f23132e = dd.h.f(aVar.getContext(), jc.b.L, 100);
        this.f23133f = dd.h.f(aVar.getContext(), jc.b.L, 150);
        this.f23134g = dd.h.g(aVar.getContext(), jc.b.Q, kc.a.f21325a);
        this.f23135h = dd.h.g(aVar.getContext(), jc.b.P, kc.a.f21327d);
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f23136i;
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
        fVar.f23170d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f23170d.setScaleX(fFloatValue);
        fVar.f23170d.setScaleY(fFloatValue);
    }

    public final void A(boolean z10) {
        boolean z11 = this.b.F() == z10;
        if (z10 && !this.f23139l.isRunning()) {
            this.f23140m.cancel();
            this.f23139l.start();
            if (z11) {
                this.f23139l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f23139l.cancel();
        this.f23140m.start();
        if (z11) {
            this.f23140m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f23134g);
        valueAnimatorOfFloat.setDuration(this.f23132e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: md.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f23129a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f23135h);
        valueAnimatorOfFloat.setDuration(this.f23133f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: md.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f23131a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f23139l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f23139l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f23140m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.f23136i;
        if (editText != null) {
            return (editText.hasFocus() || this.f23170d.hasFocus()) && this.f23136i.getText().length() > 0;
        }
        return false;
    }

    @Override // md.r
    public void a(@NonNull Editable editable) {
        if (this.b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // md.r
    public int c() {
        return jc.i.f20422e;
    }

    @Override // md.r
    public int d() {
        return jc.e.f20368l;
    }

    @Override // md.r
    public View.OnFocusChangeListener e() {
        return this.f23138k;
    }

    @Override // md.r
    public View.OnClickListener f() {
        return this.f23137j;
    }

    @Override // md.r
    public View.OnFocusChangeListener g() {
        return this.f23138k;
    }

    @Override // md.r
    public void n(EditText editText) {
        this.f23136i = editText;
        this.f23168a.setEndIconVisible(E());
    }

    @Override // md.r
    public void q(boolean z10) {
        if (this.b.w() == null) {
            return;
        }
        A(z10);
    }

    @Override // md.r
    public void s() {
        D();
    }

    @Override // md.r
    public void u() {
        EditText editText = this.f23136i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: md.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23130a.A(true);
                }
            });
        }
    }
}
