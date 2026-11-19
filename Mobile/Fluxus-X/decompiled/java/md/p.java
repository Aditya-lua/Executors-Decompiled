package md;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
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
    public static final boolean f23152s = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f23154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f23155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f23156h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f23157i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View.OnFocusChangeListener f23158j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y2.c.a f23159k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f23160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f23161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23162n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f23163o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f23164p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f23165q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f23166r;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p.this.r();
            p.this.f23166r.start();
        }
    }

    public p(@NonNull com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f23157i = new View.OnClickListener() { // from class: md.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23148a.J();
            }
        };
        this.f23158j = new View.OnFocusChangeListener() { // from class: md.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                p.y(this.f23149a, view, z10);
            }
        };
        this.f23159k = new y2.c.a() { // from class: md.n
            @Override // y2.c.a
            public final void onTouchExplorationStateChanged(boolean z10) {
                p.w(this.f23150a, z10);
            }
        };
        this.f23163o = Long.MAX_VALUE;
        this.f23154f = dd.h.f(aVar.getContext(), jc.b.L, 67);
        this.f23153e = dd.h.f(aVar.getContext(), jc.b.L, 50);
        this.f23155g = dd.h.g(aVar.getContext(), jc.b.Q, kc.a.f21325a);
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
        this.f23166r = E(this.f23154f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorE = E(this.f23153e, 1.0f, 0.0f);
        this.f23165q = valueAnimatorE;
        valueAnimatorE.addListener(new a());
    }

    public static /* synthetic */ void v(p pVar) {
        boolean zIsPopupShowing = pVar.f23156h.isPopupShowing();
        pVar.H(zIsPopupShowing);
        pVar.f23161m = zIsPopupShowing;
    }

    public static /* synthetic */ void w(p pVar, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = pVar.f23156h;
        if (autoCompleteTextView == null || q.a(autoCompleteTextView)) {
            return;
        }
        o0.w0(pVar.f23170d, z10 ? 2 : 1);
    }

    public static /* synthetic */ void x(p pVar, ValueAnimator valueAnimator) {
        pVar.getClass();
        pVar.f23170d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(p pVar, View view, boolean z10) {
        pVar.f23160l = z10;
        pVar.r();
        if (z10) {
            return;
        }
        pVar.H(false);
        pVar.f23161m = false;
    }

    public static /* synthetic */ boolean z(p pVar, View view, MotionEvent motionEvent) {
        pVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (pVar.G()) {
                pVar.f23161m = false;
            }
            pVar.J();
            pVar.K();
        }
        return false;
    }

    public final ValueAnimator E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f23155g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: md.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                p.x(this.f23145a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    public final boolean G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f23163o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    public final void H(boolean z10) {
        if (this.f23162n != z10) {
            this.f23162n = z10;
            this.f23166r.cancel();
            this.f23165q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void I() {
        this.f23156h.setOnTouchListener(new View.OnTouchListener() { // from class: md.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return p.z(this.f23146a, view, motionEvent);
            }
        });
        if (f23152s) {
            this.f23156h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: md.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    p.A(this.f23147a);
                }
            });
        }
        this.f23156h.setThreshold(0);
    }

    public final void J() {
        if (this.f23156h == null) {
            return;
        }
        if (G()) {
            this.f23161m = false;
        }
        if (this.f23161m) {
            this.f23161m = false;
            return;
        }
        if (f23152s) {
            H(!this.f23162n);
        } else {
            this.f23162n = !this.f23162n;
            r();
        }
        if (!this.f23162n) {
            this.f23156h.dismissDropDown();
        } else {
            this.f23156h.requestFocus();
            this.f23156h.showDropDown();
        }
    }

    public final void K() {
        this.f23161m = true;
        this.f23163o = System.currentTimeMillis();
    }

    @Override // md.r
    public void a(Editable editable) {
        if (this.f23164p.isTouchExplorationEnabled() && q.a(this.f23156h) && !this.f23170d.hasFocus()) {
            this.f23156h.dismissDropDown();
        }
        this.f23156h.post(new Runnable() { // from class: md.o
            @Override // java.lang.Runnable
            public final void run() {
                p.v(this.f23151a);
            }
        });
    }

    @Override // md.r
    public int c() {
        return jc.i.f20424g;
    }

    @Override // md.r
    public int d() {
        return f23152s ? jc.e.f20366j : jc.e.f20367k;
    }

    @Override // md.r
    public View.OnFocusChangeListener e() {
        return this.f23158j;
    }

    @Override // md.r
    public View.OnClickListener f() {
        return this.f23157i;
    }

    @Override // md.r
    public y2.c.a h() {
        return this.f23159k;
    }

    @Override // md.r
    public boolean i(int i10) {
        return i10 != 0;
    }

    @Override // md.r
    public boolean j() {
        return true;
    }

    @Override // md.r
    public boolean k() {
        return this.f23160l;
    }

    @Override // md.r
    public boolean l() {
        return true;
    }

    @Override // md.r
    public boolean m() {
        return this.f23162n;
    }

    @Override // md.r
    public void n(EditText editText) {
        this.f23156h = D(editText);
        I();
        this.f23168a.setErrorIconDrawable((Drawable) null);
        if (!q.a(editText) && this.f23164p.isTouchExplorationEnabled()) {
            o0.w0(this.f23170d, 2);
        }
        this.f23168a.setEndIconVisible(true);
    }

    @Override // md.r
    public void o(View view, @NonNull y2.p pVar) {
        if (!q.a(this.f23156h)) {
            pVar.l0(Spinner.class.getName());
        }
        if (pVar.V()) {
            pVar.x0(null);
        }
    }

    @Override // md.r
    @SuppressLint({"WrongConstant"})
    public void p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.f23164p.isEnabled() || q.a(this.f23156h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f23162n && !this.f23156h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            J();
            K();
        }
    }

    @Override // md.r
    public void s() {
        F();
        this.f23164p = (AccessibilityManager) this.f23169c.getSystemService("accessibility");
    }

    @Override // md.r
    public boolean t() {
        return true;
    }

    @Override // md.r
    @SuppressLint({"ClickableViewAccessibility"})
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f23156h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f23152s) {
                this.f23156h.setOnDismissListener(null);
            }
        }
    }
}
