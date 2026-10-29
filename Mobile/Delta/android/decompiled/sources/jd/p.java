package jd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes2.dex */
public class p extends r {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f21286s = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21287e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21288f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f21289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f21290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f21291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View.OnFocusChangeListener f21292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y2.c.a f21293k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f21294l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f21295m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21296n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f21297o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f21298p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f21299q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f21300r;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f21300r.start();
        }
    }

    public p(@NonNull com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f21291i = new View.OnClickListener() { // from class: jd.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21282a.J();
            }
        };
        this.f21292j = new View.OnFocusChangeListener() { // from class: jd.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(this.f21283a, view, z10);
            }
        };
        this.f21293k = new y2.c.a() { // from class: jd.n
            @Override // y2.c.a
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(this.f21284a, z10);
            }
        };
        this.f21297o = Long.MAX_VALUE;
        Context context = aVar.getContext();
        int i10 = hc.b.L;
        this.f21288f = bd.h.f(context, i10, 67);
        this.f21287e = bd.h.f(aVar.getContext(), i10, 50);
        this.f21289g = bd.h.g(aVar.getContext(), hc.b.Q, ic.a.f20471a);
    }

    public static /* synthetic */ void A(p pVar) {
        pVar.K();
        pVar.H(false);
    }

    @NonNull
    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.f21300r = E(this.f21288f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f21287e, 1.0f, 0.0f);
        this.f21299q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f21290h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f21295m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f21290h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        o0.w0(pVar.f21304d, z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f21304d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f21294l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f21295m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f21295m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    public final ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f21289g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: jd.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f21279a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f21297o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void H(boolean z10) {
        if (this.f21296n != z10) {
            this.f21296n = z10;
            this.f21300r.cancel();
            this.f21299q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void I() {
        this.f21290h.setOnTouchListener(new View.OnTouchListener() { // from class: jd.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f21280a, view, motionEvent);
            }
        });
        if (f21286s) {
            this.f21290h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: jd.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(this.f21281a);
                }
            });
        }
        this.f21290h.setThreshold(0);
    }

    public final void J() {
        if (this.f21290h == null) {
            return;
        }
        if (G()) {
            this.f21295m = false;
        }
        if (this.f21295m) {
            this.f21295m = false;
            return;
        }
        if (f21286s) {
            H(!this.f21296n);
        } else {
            this.f21296n = !this.f21296n;
            r();
        }
        if (!this.f21296n) {
            this.f21290h.dismissDropDown();
        } else {
            this.f21290h.requestFocus();
            this.f21290h.showDropDown();
        }
    }

    public final void K() {
        this.f21295m = true;
        this.f21297o = System.currentTimeMillis();
    }

    @Override // jd.r
    public void a(Editable editable) {
        if (this.f21298p.isTouchExplorationEnabled() && q.a(this.f21290h) && !this.f21304d.hasFocus()) {
            this.f21290h.dismissDropDown();
        }
        this.f21290h.post(new Runnable() { // from class: jd.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f21285a);
            }
        });
    }

    @Override // jd.r
    public int c() {
        return hc.i.f18914g;
    }

    @Override // jd.r
    public int d() {
        return f21286s ? hc.e.f18856j : hc.e.f18857k;
    }

    @Override // jd.r
    public View.OnFocusChangeListener e() {
        return this.f21292j;
    }

    @Override // jd.r
    public View.OnClickListener f() {
        return this.f21291i;
    }

    @Override // jd.r
    public y2.c.a h() {
        return this.f21293k;
    }

    @Override // jd.r
    public boolean i(int i10) {
        return i10 != 0;
    }

    @Override // jd.r
    public boolean j() {
        return true;
    }

    @Override // jd.r
    public boolean k() {
        return this.f21294l;
    }

    @Override // jd.r
    public boolean l() {
        return true;
    }

    @Override // jd.r
    public boolean m() {
        return this.f21296n;
    }

    @Override // jd.r
    public void n(EditText editText) {
        this.f21290h = D(editText);
        I();
        this.f21302a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f21298p.isTouchExplorationEnabled()) {
            o0.w0(this.f21304d, 2);
        }
        this.f21302a.setEndIconVisible(true);
    }

    @Override // jd.r
    public void o(View view, @NonNull y2.p pVar) {
        if (!q.a(this.f21290h)) {
            pVar.l0(Spinner.class.getName());
        }
        if (pVar.V()) {
            pVar.x0(null);
        }
    }

    @Override // jd.r
    @SuppressLint({"WrongConstant"})
    public void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.f21298p.isEnabled() || q.a(this.f21290h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f21296n && !this.f21290h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // jd.r
    public void s() {
        F();
        this.f21298p = (AccessibilityManager) this.f21303c.getSystemService("accessibility");
    }

    @Override // jd.r
    public boolean t() {
        return true;
    }

    @Override // jd.r
    @SuppressLint({"ClickableViewAccessibility"})
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f21290h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f21286s) {
                this.f21290h.setOnDismissListener(null);
            }
        }
    }
}
