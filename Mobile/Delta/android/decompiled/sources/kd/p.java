package kd;

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
    public static final boolean f22574s = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f22578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f22579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View.OnFocusChangeListener f22580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y2.c.a f22581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f22585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f22586p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f22587q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f22588r;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f22588r.start();
        }
    }

    public p(@NonNull com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f22579i = new View.OnClickListener() { // from class: kd.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22570a.J();
            }
        };
        this.f22580j = new View.OnFocusChangeListener() { // from class: kd.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(this.f22571a, view, z10);
            }
        };
        this.f22581k = new y2.c.a() { // from class: kd.n
            @Override // y2.c.a
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(this.f22572a, z10);
            }
        };
        this.f22585o = Long.MAX_VALUE;
        Context context = aVar.getContext();
        int i10 = ic.b.L;
        this.f22576f = cd.h.f(context, i10, 67);
        this.f22575e = cd.h.f(aVar.getContext(), i10, 50);
        this.f22577g = cd.h.g(aVar.getContext(), ic.b.Q, jc.a.f21812a);
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
        this.f22588r = E(this.f22576f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f22575e, 1.0f, 0.0f);
        this.f22587q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f22578h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f22583m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f22578h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        o0.w0(pVar.f22592d, z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f22592d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f22582l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f22583m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f22583m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    public final ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f22577g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kd.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f22567a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f22585o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void H(boolean z10) {
        if (this.f22584n != z10) {
            this.f22584n = z10;
            this.f22588r.cancel();
            this.f22587q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void I() {
        this.f22578h.setOnTouchListener(new View.OnTouchListener() { // from class: kd.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f22568a, view, motionEvent);
            }
        });
        if (f22574s) {
            this.f22578h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: kd.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(this.f22569a);
                }
            });
        }
        this.f22578h.setThreshold(0);
    }

    public final void J() {
        if (this.f22578h == null) {
            return;
        }
        if (G()) {
            this.f22583m = false;
        }
        if (this.f22583m) {
            this.f22583m = false;
            return;
        }
        if (f22574s) {
            H(!this.f22584n);
        } else {
            this.f22584n = !this.f22584n;
            r();
        }
        if (!this.f22584n) {
            this.f22578h.dismissDropDown();
        } else {
            this.f22578h.requestFocus();
            this.f22578h.showDropDown();
        }
    }

    public final void K() {
        this.f22583m = true;
        this.f22585o = System.currentTimeMillis();
    }

    @Override // kd.r
    public void a(Editable editable) {
        if (this.f22586p.isTouchExplorationEnabled() && q.a(this.f22578h) && !this.f22592d.hasFocus()) {
            this.f22578h.dismissDropDown();
        }
        this.f22578h.post(new Runnable() { // from class: kd.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f22573a);
            }
        });
    }

    @Override // kd.r
    public int c() {
        return ic.i.f20736g;
    }

    @Override // kd.r
    public int d() {
        return f22574s ? ic.e.f20678j : ic.e.f20679k;
    }

    @Override // kd.r
    public View.OnFocusChangeListener e() {
        return this.f22580j;
    }

    @Override // kd.r
    public View.OnClickListener f() {
        return this.f22579i;
    }

    @Override // kd.r
    public y2.c.a h() {
        return this.f22581k;
    }

    @Override // kd.r
    public boolean i(int i10) {
        return i10 != 0;
    }

    @Override // kd.r
    public boolean j() {
        return true;
    }

    @Override // kd.r
    public boolean k() {
        return this.f22582l;
    }

    @Override // kd.r
    public boolean l() {
        return true;
    }

    @Override // kd.r
    public boolean m() {
        return this.f22584n;
    }

    @Override // kd.r
    public void n(EditText editText) {
        this.f22578h = D(editText);
        I();
        this.f22590a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f22586p.isTouchExplorationEnabled()) {
            o0.w0(this.f22592d, 2);
        }
        this.f22590a.setEndIconVisible(true);
    }

    @Override // kd.r
    public void o(View view, @NonNull y2.p pVar) {
        if (!q.a(this.f22578h)) {
            pVar.l0(Spinner.class.getName());
        }
        if (pVar.V()) {
            pVar.x0(null);
        }
    }

    @Override // kd.r
    @SuppressLint({"WrongConstant"})
    public void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.f22586p.isEnabled() || q.a(this.f22578h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f22584n && !this.f22578h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // kd.r
    public void s() {
        F();
        this.f22586p = (AccessibilityManager) this.f22591c.getSystemService("accessibility");
    }

    @Override // kd.r
    public boolean t() {
        return true;
    }

    @Override // kd.r
    @SuppressLint({"ClickableViewAccessibility"})
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f22578h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f22574s) {
                this.f22578h.setOnDismissListener(null);
            }
        }
    }
}
