package p246kd;

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
import androidx.core.view.C0625o0;
import cd.C1627h;
import com.google.android.material.textfield.C2862a;
import p194ic.C6738b;
import p194ic.C6741e;
import p194ic.C6745i;
import p216jc.C7137a;
import p564y2.C13004c;
import p564y2.C13017p;

/* JADX INFO: renamed from: kd.p */
/* JADX INFO: loaded from: classes2.dex */
public class C7558p extends AbstractC7560r {

    /* JADX INFO: renamed from: s */
    public static final boolean f28939s = true;

    /* JADX INFO: renamed from: e */
    public final int f28940e;

    /* JADX INFO: renamed from: f */
    public final int f28941f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final TimeInterpolator f28942g;

    /* JADX INFO: renamed from: h */
    public AutoCompleteTextView f28943h;

    /* JADX INFO: renamed from: i */
    public final View.OnClickListener f28944i;

    /* JADX INFO: renamed from: j */
    public final View.OnFocusChangeListener f28945j;

    /* JADX INFO: renamed from: k */
    public final C13004c.a f28946k;

    /* JADX INFO: renamed from: l */
    public boolean f28947l;

    /* JADX INFO: renamed from: m */
    public boolean f28948m;

    /* JADX INFO: renamed from: n */
    public boolean f28949n;

    /* JADX INFO: renamed from: o */
    public long f28950o;

    /* JADX INFO: renamed from: p */
    public AccessibilityManager f28951p;

    /* JADX INFO: renamed from: q */
    public ValueAnimator f28952q;

    /* JADX INFO: renamed from: r */
    public ValueAnimator f28953r;

    /* JADX INFO: renamed from: kd.p$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7558p.this.m31251r();
            C7558p.this.f28953r.start();
        }
    }

    public C7558p(@NonNull C2862a c2862a) {
        super(c2862a);
        this.f28944i = new View.OnClickListener() { // from class: kd.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28935a.m31238J();
            }
        };
        this.f28945j = new View.OnFocusChangeListener() { // from class: kd.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C7558p.m31232y(this.f28936a, view, z10);
            }
        };
        this.f28946k = new C13004c.a() { // from class: kd.n
            @Override // p564y2.C13004c.a
            public final void onTouchExplorationStateChanged(boolean z10) {
                C7558p.m31230w(this.f28937a, z10);
            }
        };
        this.f28950o = Long.MAX_VALUE;
        Context context = c2862a.getContext();
        int i10 = C6738b.f25870L;
        this.f28941f = C1627h.m8223f(context, i10, 67);
        this.f28940e = C1627h.m8223f(c2862a.getContext(), i10, 50);
        this.f28942g = C1627h.m8224g(c2862a.getContext(), C6738b.f25875Q, C7137a.f27784a);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m31224A(C7558p c7558p) {
        c7558p.m31239K();
        c7558p.m31236H(false);
    }

    @NonNull
    /* JADX INFO: renamed from: D */
    public static AutoCompleteTextView m31227D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* JADX INFO: renamed from: F */
    private void m31228F() {
        this.f28953r = m31234E(this.f28941f, 0.0f, 1.0f);
        ValueAnimator valueAnimatorM31234E = m31234E(this.f28940e, 1.0f, 0.0f);
        this.f28952q = valueAnimatorM31234E;
        valueAnimatorM31234E.addListener(new a());
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m31229v(C7558p c7558p) {
        boolean zIsPopupShowing = c7558p.f28943h.isPopupShowing();
        c7558p.m31236H(zIsPopupShowing);
        c7558p.f28948m = zIsPopupShowing;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m31230w(C7558p c7558p, boolean z10) {
        AutoCompleteTextView autoCompleteTextView = c7558p.f28943h;
        if (autoCompleteTextView == null || C7559q.m31249a(autoCompleteTextView)) {
            return;
        }
        C0625o0.m3060w0(c7558p.f28958d, z10 ? 2 : 1);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m31231x(C7558p c7558p, ValueAnimator valueAnimator) {
        c7558p.getClass();
        c7558p.f28958d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m31232y(C7558p c7558p, View view, boolean z10) {
        c7558p.f28947l = z10;
        c7558p.m31251r();
        if (z10) {
            return;
        }
        c7558p.m31236H(false);
        c7558p.f28948m = false;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m31233z(C7558p c7558p, View view, MotionEvent motionEvent) {
        c7558p.getClass();
        if (motionEvent.getAction() == 1) {
            if (c7558p.m31235G()) {
                c7558p.f28948m = false;
            }
            c7558p.m31238J();
            c7558p.m31239K();
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public final ValueAnimator m31234E(int i10, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f28942g);
        valueAnimatorOfFloat.setDuration(i10);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kd.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7558p.m31231x(this.f28932a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m31235G() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f28950o;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: renamed from: H */
    public final void m31236H(boolean z10) {
        if (this.f28949n != z10) {
            this.f28949n = z10;
            this.f28953r.cancel();
            this.f28952q.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: I */
    public final void m31237I() {
        this.f28943h.setOnTouchListener(new View.OnTouchListener() { // from class: kd.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return C7558p.m31233z(this.f28933a, view, motionEvent);
            }
        });
        if (f28939s) {
            this.f28943h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: kd.k
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    C7558p.m31224A(this.f28934a);
                }
            });
        }
        this.f28943h.setThreshold(0);
    }

    /* JADX INFO: renamed from: J */
    public final void m31238J() {
        if (this.f28943h == null) {
            return;
        }
        if (m31235G()) {
            this.f28948m = false;
        }
        if (this.f28948m) {
            this.f28948m = false;
            return;
        }
        if (f28939s) {
            m31236H(!this.f28949n);
        } else {
            this.f28949n = !this.f28949n;
            m31251r();
        }
        if (!this.f28949n) {
            this.f28943h.dismissDropDown();
        } else {
            this.f28943h.requestFocus();
            this.f28943h.showDropDown();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m31239K() {
        this.f28948m = true;
        this.f28950o = System.currentTimeMillis();
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: a */
    public void mo31206a(Editable editable) {
        if (this.f28951p.isTouchExplorationEnabled() && C7559q.m31249a(this.f28943h) && !this.f28958d.hasFocus()) {
            this.f28943h.dismissDropDown();
        }
        this.f28943h.post(new Runnable() { // from class: kd.o
            @Override // java.lang.Runnable
            public final void run() {
                C7558p.m31229v(this.f28938a);
            }
        });
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: c */
    public int mo31207c() {
        return C6745i.f26088g;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: d */
    public int mo31208d() {
        return f28939s ? C6741e.f26003j : C6741e.f26004k;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: e */
    public View.OnFocusChangeListener mo31209e() {
        return this.f28945j;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: f */
    public View.OnClickListener mo31210f() {
        return this.f28944i;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: h */
    public C13004c.a mo31240h() {
        return this.f28946k;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: i */
    public boolean mo31241i(int i10) {
        return i10 != 0;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: j */
    public boolean mo31242j() {
        return true;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: k */
    public boolean mo31243k() {
        return this.f28947l;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: l */
    public boolean mo31244l() {
        return true;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: m */
    public boolean mo31245m() {
        return this.f28949n;
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: n */
    public void mo31212n(EditText editText) {
        this.f28943h = m31227D(editText);
        m31237I();
        this.f28955a.setErrorIconDrawable((Drawable) null);
        if (!C7559q.m31249a(editText) && this.f28951p.isTouchExplorationEnabled()) {
            C0625o0.m3060w0(this.f28958d, 2);
        }
        this.f28955a.setEndIconVisible(true);
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: o */
    public void mo31246o(View view, @NonNull C13017p c13017p) {
        if (!C7559q.m31249a(this.f28943h)) {
            c13017p.m48408l0(Spinner.class.getName());
        }
        if (c13017p.m48384V()) {
            c13017p.m48430x0(null);
        }
    }

    @Override // p246kd.AbstractC7560r
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: p */
    public void mo31247p(View view, @NonNull AccessibilityEvent accessibilityEvent) {
        if (!this.f28951p.isEnabled() || C7559q.m31249a(this.f28943h)) {
            return;
        }
        boolean z10 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f28949n && !this.f28943h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z10) {
            m31238J();
            m31239K();
        }
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: s */
    public void mo31214s() {
        m31228F();
        this.f28951p = (AccessibilityManager) this.f28957c.getSystemService("accessibility");
    }

    @Override // p246kd.AbstractC7560r
    /* JADX INFO: renamed from: t */
    public boolean mo31248t() {
        return true;
    }

    @Override // p246kd.AbstractC7560r
    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: u */
    public void mo31215u() {
        AutoCompleteTextView autoCompleteTextView = this.f28943h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f28939s) {
                this.f28943h.setOnDismissListener(null);
            }
        }
    }
}
