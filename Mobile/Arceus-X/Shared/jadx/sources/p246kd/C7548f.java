package p246kd;

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
import cd.C1627h;
import com.google.android.material.textfield.C2862a;
import p194ic.C6738b;
import p194ic.C6741e;
import p194ic.C6745i;
import p216jc.C7137a;

/* JADX INFO: renamed from: kd.f */
/* JADX INFO: loaded from: classes2.dex */
public class C7548f extends AbstractC7560r {

    /* JADX INFO: renamed from: e */
    public final int f28919e;

    /* JADX INFO: renamed from: f */
    public final int f28920f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TimeInterpolator f28921g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TimeInterpolator f28922h;

    /* JADX INFO: renamed from: i */
    public EditText f28923i;

    /* JADX INFO: renamed from: j */
    public final View.OnClickListener f28924j;

    /* JADX INFO: renamed from: k */
    public final View.OnFocusChangeListener f28925k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f28926l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f28927m;

    /* JADX INFO: renamed from: kd.f$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C7548f.this.f28956b.m13213a0(true);
        }
    }

    /* JADX INFO: renamed from: kd.f$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7548f.this.f28956b.m13213a0(false);
        }
    }

    public C7548f(@NonNull C2862a c2862a) {
        super(c2862a);
        this.f28924j = new View.OnClickListener() { // from class: kd.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7548f.m31196v(this.f28914a, view);
            }
        };
        this.f28925k = new View.OnFocusChangeListener() { // from class: kd.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C7548f c7548f = this.f28915a;
                c7548f.m31201A(c7548f.m31205E());
            }
        };
        Context context = c2862a.getContext();
        int i10 = C6738b.f25870L;
        this.f28919e = C1627h.m8223f(context, i10, 100);
        this.f28920f = C1627h.m8223f(c2862a.getContext(), i10, 150);
        this.f28921g = C1627h.m8224g(c2862a.getContext(), C6738b.f25875Q, C7137a.f27784a);
        this.f28922h = C1627h.m8224g(c2862a.getContext(), C6738b.f25874P, C7137a.f27787d);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m31196v(C7548f c7548f, View view) {
        EditText editText = c7548f.f28923i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        c7548f.m31251r();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m31198x(C7548f c7548f, ValueAnimator valueAnimator) {
        c7548f.getClass();
        c7548f.f28958d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m31199y(C7548f c7548f, ValueAnimator valueAnimator) {
        c7548f.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c7548f.f28958d.setScaleX(fFloatValue);
        c7548f.f28958d.setScaleY(fFloatValue);
    }

    /* JADX INFO: renamed from: A */
    public final void m31201A(boolean z10) {
        boolean z11 = this.f28956b.m13192F() == z10;
        if (z10 && !this.f28926l.isRunning()) {
            this.f28927m.cancel();
            this.f28926l.start();
            if (z11) {
                this.f28926l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f28926l.cancel();
        this.f28927m.start();
        if (z11) {
            this.f28927m.end();
        }
    }

    /* JADX INFO: renamed from: B */
    public final ValueAnimator m31202B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f28921g);
        valueAnimatorOfFloat.setDuration(this.f28919e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kd.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7548f.m31198x(this.f28916a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: C */
    public final ValueAnimator m31203C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f28922h);
        valueAnimatorOfFloat.setDuration(this.f28920f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kd.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7548f.m31199y(this.f28918a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: D */
    public final void m31204D() {
        ValueAnimator valueAnimatorM31203C = m31203C();
        ValueAnimator valueAnimatorM31202B = m31202B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f28926l = animatorSet;
        animatorSet.playTogether(valueAnimatorM31203C, valueAnimatorM31202B);
        this.f28926l.addListener(new a());
        ValueAnimator valueAnimatorM31202B2 = m31202B(1.0f, 0.0f);
        this.f28927m = valueAnimatorM31202B2;
        valueAnimatorM31202B2.addListener(new b());
    }

    /* JADX INFO: renamed from: E */
    public final boolean m31205E() {
        EditText editText = this.f28923i;
        if (editText != null) {
            return (editText.hasFocus() || this.f28958d.hasFocus()) && this.f28923i.getText().length() > 0;
        }
        return false;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: a */
    public void mo31206a(@NonNull Editable editable) {
        if (this.f28956b.m13251w() != null) {
            return;
        }
        m31201A(m31205E());
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: c */
    public int mo31207c() {
        return C6745i.f26086e;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: d */
    public int mo31208d() {
        return C6741e.f26005l;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo31209e() {
        return this.f28925k;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo31210f() {
        return this.f28924j;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: g */
    public View.OnFocusChangeListener mo31211g() {
        return this.f28925k;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: n */
    public void mo31212n(EditText editText) {
        this.f28923i = editText;
        this.f28955a.setEndIconVisible(m31205E());
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: q */
    public void mo31213q(boolean z10) {
        if (this.f28956b.m13251w() == null) {
            return;
        }
        m31201A(z10);
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: s */
    public void mo31214s() {
        m31204D();
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: u */
    public void mo31215u() {
        EditText editText = this.f28923i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: kd.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28917a.m31201A(true);
                }
            });
        }
    }
}
