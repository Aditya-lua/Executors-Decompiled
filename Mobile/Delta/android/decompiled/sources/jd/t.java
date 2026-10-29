package jd;

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
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import q.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class t {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21305a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f21307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f21308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f21309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f21310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f21311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f21312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f21314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f21315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f21316m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21317n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21318o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f21319p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21320q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f21321r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f21322s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f21323t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f21324u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f21325v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f21326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f21327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f21328y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f21329z;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f21330a;
        public final /* synthetic */ TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f21331c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f21332d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f21330a = i10;
            this.b = textView;
            this.f21331c = i11;
            this.f21332d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.f21317n = this.f21330a;
            t.this.f21315l = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f21331c == 1 && t.this.f21321r != null) {
                    t.this.f21321r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f21332d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f21332d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f21332d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f21332d.setAlpha(0.0f);
            }
        }
    }

    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = t.this.f21311h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public t(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f21310g = context;
        this.f21311h = textInputLayout;
        this.f21316m = context.getResources().getDimensionPixelSize(hc.d.f18822g);
        int i10 = hc.b.M;
        this.f21305a = bd.h.f(context, i10, 217);
        this.b = bd.h.f(context, hc.b.I, 167);
        this.f21306c = bd.h.f(context, i10, 167);
        int i11 = hc.b.O;
        this.f21307d = bd.h.g(context, i11, ic.a.f20473d);
        TimeInterpolator timeInterpolator = ic.a.f20471a;
        this.f21308e = bd.h.g(context, i11, timeInterpolator);
        this.f21309f = bd.h.g(context, hc.b.Q, timeInterpolator);
    }

    public boolean A() {
        return this.f21320q;
    }

    public boolean B() {
        return this.f21327x;
    }

    public void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f21312i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f21314k) == null) {
            this.f21312i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f21313j - 1;
        this.f21313j = i11;
        O(this.f21312i, i11);
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
        this.f21317n = i11;
    }

    public void E(int i10) {
        this.f21323t = i10;
        TextView textView = this.f21321r;
        if (textView != null) {
            o0.o0(textView, i10);
        }
    }

    public void F(CharSequence charSequence) {
        this.f21322s = charSequence;
        TextView textView = this.f21321r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void G(boolean z10) {
        if (this.f21320q == z10) {
            return;
        }
        h();
        if (z10) {
            b0 b0Var = new b0(this.f21310g);
            this.f21321r = b0Var;
            b0Var.setId(hc.f.Q);
            this.f21321r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f21321r.setTypeface(typeface);
            }
            H(this.f21324u);
            I(this.f21325v);
            F(this.f21322s);
            E(this.f21323t);
            this.f21321r.setVisibility(4);
            e(this.f21321r, 0);
        } else {
            w();
            C(this.f21321r, 0);
            this.f21321r = null;
            this.f21311h.p0();
            this.f21311h.A0();
        }
        this.f21320q = z10;
    }

    public void H(int i10) {
        this.f21324u = i10;
        TextView textView = this.f21321r;
        if (textView != null) {
            this.f21311h.c0(textView, i10);
        }
    }

    public void I(ColorStateList colorStateList) {
        this.f21325v = colorStateList;
        TextView textView = this.f21321r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void J(int i10) {
        this.f21329z = i10;
        TextView textView = this.f21328y;
        if (textView != null) {
            d3.i.s(textView, i10);
        }
    }

    public void K(boolean z10) {
        if (this.f21327x == z10) {
            return;
        }
        h();
        if (z10) {
            b0 b0Var = new b0(this.f21310g);
            this.f21328y = b0Var;
            b0Var.setId(hc.f.R);
            this.f21328y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f21328y.setTypeface(typeface);
            }
            this.f21328y.setVisibility(4);
            o0.o0(this.f21328y, 1);
            J(this.f21329z);
            L(this.A);
            e(this.f21328y, 1);
            this.f21328y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f21328y, 1);
            this.f21328y = null;
            this.f21311h.p0();
            this.f21311h.A0();
        }
        this.f21327x = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f21328y;
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
            M(this.f21321r, typeface);
            M(this.f21328y, typeface);
        }
    }

    public final void O(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean P(TextView textView, @NonNull CharSequence charSequence) {
        if (o0.R(this.f21311h) && this.f21311h.isEnabled()) {
            return (this.f21318o == this.f21317n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public void Q(CharSequence charSequence) {
        h();
        this.f21319p = charSequence;
        this.f21321r.setText(charSequence);
        int i10 = this.f21317n;
        if (i10 != 1) {
            this.f21318o = 1;
        }
        S(i10, this.f21318o, P(this.f21321r, charSequence));
    }

    public void R(CharSequence charSequence) {
        h();
        this.f21326w = charSequence;
        this.f21328y.setText(charSequence);
        int i10 = this.f21317n;
        if (i10 != 2) {
            this.f21318o = 2;
        }
        S(i10, this.f21318o, P(this.f21328y, charSequence));
    }

    public final void S(int i10, int i11, boolean z10) {
        t tVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f21315l = animatorSet;
            ArrayList arrayList = new ArrayList();
            tVar = this;
            tVar.i(arrayList, this.f21327x, this.f21328y, 2, i10, i11);
            tVar.i(arrayList, tVar.f21320q, tVar.f21321r, 1, i10, i11);
            ic.b.a(animatorSet, arrayList);
            animatorSet.addListener(tVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            tVar = this;
            D(i10, i11);
        }
        tVar.f21311h.p0();
        tVar.f21311h.u0(z10);
        tVar.f21311h.A0();
    }

    public void e(TextView textView, int i10) {
        if (this.f21312i == null && this.f21314k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f21310g);
            this.f21312i = linearLayout;
            linearLayout.setOrientation(0);
            this.f21311h.addView(this.f21312i, -1, -2);
            this.f21314k = new FrameLayout(this.f21310g);
            this.f21312i.addView(this.f21314k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f21311h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f21314k.setVisibility(0);
            this.f21314k.addView(textView);
        } else {
            this.f21312i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f21312i.setVisibility(0);
        this.f21313j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f21311h.getEditText();
            boolean zG = dd.c.g(this.f21310g);
            LinearLayout linearLayout = this.f21312i;
            int i10 = hc.d.I;
            o0.B0(linearLayout, v(zG, i10, o0.E(editText)), v(zG, hc.d.J, this.f21310g.getResources().getDimensionPixelSize(hc.d.H)), v(zG, i10, o0.D(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.f21312i == null || this.f21311h.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f21315l;
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
                objectAnimatorJ.setStartDelay(this.f21306c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f21306c);
            list.add(objectAnimatorK);
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.b : this.f21306c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f21308e : this.f21309f);
        return objectAnimatorOfFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f21316m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f21305a);
        objectAnimatorOfFloat.setInterpolator(this.f21307d);
        return objectAnimatorOfFloat;
    }

    public boolean l() {
        return y(this.f21318o);
    }

    public final TextView m(int i10) {
        if (i10 == 1) {
            return this.f21321r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f21328y;
    }

    public int n() {
        return this.f21323t;
    }

    public CharSequence o() {
        return this.f21322s;
    }

    public CharSequence p() {
        return this.f21319p;
    }

    public int q() {
        TextView textView = this.f21321r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList r() {
        TextView textView = this.f21321r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence s() {
        return this.f21326w;
    }

    public View t() {
        return this.f21328y;
    }

    public int u() {
        TextView textView = this.f21328y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int v(boolean z10, int i10, int i11) {
        return z10 ? this.f21310g.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void w() {
        this.f21319p = null;
        h();
        if (this.f21317n == 1) {
            if (!this.f21327x || TextUtils.isEmpty(this.f21326w)) {
                this.f21318o = 0;
            } else {
                this.f21318o = 2;
            }
        }
        S(this.f21317n, this.f21318o, P(this.f21321r, ""));
    }

    public void x() {
        h();
        int i10 = this.f21317n;
        if (i10 == 2) {
            this.f21318o = 0;
        }
        S(i10, this.f21318o, P(this.f21328y, ""));
    }

    public final boolean y(int i10) {
        return (i10 != 1 || this.f21321r == null || TextUtils.isEmpty(this.f21319p)) ? false : true;
    }

    public boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
