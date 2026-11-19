package md;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import com.github.luben.zstd.BuildConfig;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import q.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class t {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23171a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f23173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f23174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f23175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f23176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f23177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f23178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f23180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f23181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f23182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f23184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f23185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f23186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f23187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f23188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23189t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f23190u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f23191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f23192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f23193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f23194y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f23195z;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f23196a;
        public final /* synthetic */ TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f23197c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f23198d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f23196a = i10;
            this.b = textView;
            this.f23197c = i11;
            this.f23198d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.f23183n = this.f23196a;
            t.this.f23181l = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f23197c == 1 && t.this.f23187r != null) {
                    t.this.f23187r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f23198d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f23198d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f23198d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f23198d.setAlpha(0.0f);
            }
        }
    }

    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = t.this.f23177h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public t(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f23176g = context;
        this.f23177h = textInputLayout;
        this.f23182m = context.getResources().getDimensionPixelSize(jc.d.f20332g);
        this.f23171a = dd.h.f(context, jc.b.M, 217);
        this.b = dd.h.f(context, jc.b.I, 167);
        this.f23172c = dd.h.f(context, jc.b.M, 167);
        this.f23173d = dd.h.g(context, jc.b.O, kc.a.f21327d);
        int i10 = jc.b.O;
        TimeInterpolator timeInterpolator = kc.a.f21325a;
        this.f23174e = dd.h.g(context, i10, timeInterpolator);
        this.f23175f = dd.h.g(context, jc.b.Q, timeInterpolator);
    }

    public boolean A() {
        return this.f23186q;
    }

    public boolean B() {
        return this.f23193x;
    }

    public void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f23178i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f23180k) == null) {
            this.f23178i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f23179j - 1;
        this.f23179j = i11;
        O(this.f23178i, i11);
    }

    public final void D(int i10, int i11) {
        TextView textViewM;
        TextView textViewM2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM2 = m(i11)) != null) {
            textViewM2.setVisibility(0);
            textViewM2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM = m(i10)) != null) {
            textViewM.setVisibility(4);
            if (i10 == 1) {
                textViewM.setText((CharSequence) null);
            }
        }
        this.f23183n = i11;
    }

    public void E(int i10) {
        this.f23189t = i10;
        TextView textView = this.f23187r;
        if (textView != null) {
            o0.o0(textView, i10);
        }
    }

    public void F(CharSequence charSequence) {
        this.f23188s = charSequence;
        TextView textView = this.f23187r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void G(boolean z10) {
        if (this.f23186q == z10) {
            return;
        }
        h();
        if (z10) {
            c0 c0Var = new c0(this.f23176g);
            this.f23187r = c0Var;
            c0Var.setId(jc.f.Q);
            this.f23187r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f23187r.setTypeface(typeface);
            }
            H(this.f23190u);
            I(this.f23191v);
            F(this.f23188s);
            E(this.f23189t);
            this.f23187r.setVisibility(4);
            e(this.f23187r, 0);
        } else {
            w();
            C(this.f23187r, 0);
            this.f23187r = null;
            this.f23177h.p0();
            this.f23177h.A0();
        }
        this.f23186q = z10;
    }

    public void H(int i10) {
        this.f23190u = i10;
        TextView textView = this.f23187r;
        if (textView != null) {
            this.f23177h.c0(textView, i10);
        }
    }

    public void I(ColorStateList colorStateList) {
        this.f23191v = colorStateList;
        TextView textView = this.f23187r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void J(int i10) {
        this.f23195z = i10;
        TextView textView = this.f23194y;
        if (textView != null) {
            d3.i.s(textView, i10);
        }
    }

    public void K(boolean z10) {
        if (this.f23193x == z10) {
            return;
        }
        h();
        if (z10) {
            c0 c0Var = new c0(this.f23176g);
            this.f23194y = c0Var;
            c0Var.setId(jc.f.R);
            this.f23194y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f23194y.setTypeface(typeface);
            }
            this.f23194y.setVisibility(4);
            o0.o0(this.f23194y, 1);
            J(this.f23195z);
            L(this.A);
            e(this.f23194y, 1);
            this.f23194y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f23194y, 1);
            this.f23194y = null;
            this.f23177h.p0();
            this.f23177h.A0();
        }
        this.f23193x = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f23194y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f23187r, typeface);
            M(this.f23194y, typeface);
        }
    }

    public final void O(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean P(TextView textView, @NonNull CharSequence charSequence) {
        if (o0.R(this.f23177h) && this.f23177h.isEnabled()) {
            return (this.f23184o == this.f23183n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public void Q(CharSequence charSequence) {
        h();
        this.f23185p = charSequence;
        this.f23187r.setText(charSequence);
        int i10 = this.f23183n;
        if (i10 != 1) {
            this.f23184o = 1;
        }
        S(i10, this.f23184o, P(this.f23187r, charSequence));
    }

    public void R(CharSequence charSequence) {
        h();
        this.f23192w = charSequence;
        this.f23194y.setText(charSequence);
        int i10 = this.f23183n;
        if (i10 != 2) {
            this.f23184o = 2;
        }
        S(i10, this.f23184o, P(this.f23194y, charSequence));
    }

    public final void S(int i10, int i11, boolean z10) {
        t tVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f23181l = animatorSet;
            ArrayList arrayList = new ArrayList();
            tVar = this;
            tVar.i(arrayList, this.f23193x, this.f23194y, 2, i10, i11);
            tVar.i(arrayList, tVar.f23186q, tVar.f23187r, 1, i10, i11);
            kc.b.a(animatorSet, arrayList);
            animatorSet.addListener(tVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            tVar = this;
            D(i10, i11);
        }
        tVar.f23177h.p0();
        tVar.f23177h.u0(z10);
        tVar.f23177h.A0();
    }

    public void e(TextView textView, int i10) {
        if (this.f23178i == null && this.f23180k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f23176g);
            this.f23178i = linearLayout;
            linearLayout.setOrientation(0);
            this.f23177h.addView(this.f23178i, -1, -2);
            this.f23180k = new FrameLayout(this.f23176g);
            this.f23178i.addView(this.f23180k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f23177h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f23180k.setVisibility(0);
            this.f23180k.addView(textView);
        } else {
            this.f23178i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f23178i.setVisibility(0);
        this.f23179j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f23177h.getEditText();
            boolean zG = fd.c.g(this.f23176g);
            o0.B0(this.f23178i, v(zG, jc.d.I, o0.E(editText)), v(zG, jc.d.J, this.f23176g.getResources().getDimensionPixelSize(jc.d.H)), v(zG, jc.d.I, o0.D(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.f23178i == null || this.f23177h.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f23181l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(@NonNull List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorJ = j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorJ.setStartDelay(this.f23172c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f23172c);
            list.add(objectAnimatorK);
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.b : this.f23172c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f23174e : this.f23175f);
        return objectAnimatorOfFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f23182m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f23171a);
        objectAnimatorOfFloat.setInterpolator(this.f23173d);
        return objectAnimatorOfFloat;
    }

    public boolean l() {
        return y(this.f23184o);
    }

    public final TextView m(int i10) {
        if (i10 == 1) {
            return this.f23187r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f23194y;
    }

    public int n() {
        return this.f23189t;
    }

    public CharSequence o() {
        return this.f23188s;
    }

    public CharSequence p() {
        return this.f23185p;
    }

    public int q() {
        TextView textView = this.f23187r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList r() {
        TextView textView = this.f23187r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence s() {
        return this.f23192w;
    }

    public View t() {
        return this.f23194y;
    }

    public int u() {
        TextView textView = this.f23194y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int v(boolean z10, int i10, int i11) {
        return z10 ? this.f23176g.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void w() {
        this.f23185p = null;
        h();
        if (this.f23183n == 1) {
            if (!this.f23193x || TextUtils.isEmpty(this.f23192w)) {
                this.f23184o = 0;
            } else {
                this.f23184o = 2;
            }
        }
        S(this.f23183n, this.f23184o, P(this.f23187r, BuildConfig.FLAVOR));
    }

    public void x() {
        h();
        int i10 = this.f23183n;
        if (i10 == 2) {
            this.f23184o = 0;
        }
        S(i10, this.f23184o, P(this.f23194y, BuildConfig.FLAVOR));
    }

    public final boolean y(int i10) {
        return (i10 != 1 || this.f23187r == null || TextUtils.isEmpty(this.f23185p)) ? false : true;
    }

    public boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
