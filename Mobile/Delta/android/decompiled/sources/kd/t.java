package kd;

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
    public final int f22593a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f22597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f22598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f22599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f22600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f22602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Animator f22603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f22604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f22606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f22607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f22608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f22609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f22610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22611t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f22612u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f22613v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f22614w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f22615x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public TextView f22616y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f22617z;

    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f22618a;
        public final /* synthetic */ TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f22619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f22620d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f22618a = i10;
            this.b = textView;
            this.f22619c = i11;
            this.f22620d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            t.this.f22605n = this.f22618a;
            t.this.f22603l = null;
            TextView textView = this.b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f22619c == 1 && t.this.f22609r != null) {
                    t.this.f22609r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f22620d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f22620d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f22620d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f22620d.setAlpha(0.0f);
            }
        }
    }

    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = t.this.f22599h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public t(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f22598g = context;
        this.f22599h = textInputLayout;
        this.f22604m = context.getResources().getDimensionPixelSize(ic.d.f20644g);
        int i10 = ic.b.M;
        this.f22593a = cd.h.f(context, i10, 217);
        this.b = cd.h.f(context, ic.b.I, 167);
        this.f22594c = cd.h.f(context, i10, 167);
        int i11 = ic.b.O;
        this.f22595d = cd.h.g(context, i11, jc.a.f21814d);
        TimeInterpolator timeInterpolator = jc.a.f21812a;
        this.f22596e = cd.h.g(context, i11, timeInterpolator);
        this.f22597f = cd.h.g(context, ic.b.Q, timeInterpolator);
    }

    public boolean A() {
        return this.f22608q;
    }

    public boolean B() {
        return this.f22615x;
    }

    public void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f22600i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f22602k) == null) {
            this.f22600i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f22601j - 1;
        this.f22601j = i11;
        O(this.f22600i, i11);
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
        this.f22605n = i11;
    }

    public void E(int i10) {
        this.f22611t = i10;
        TextView textView = this.f22609r;
        if (textView != null) {
            o0.o0(textView, i10);
        }
    }

    public void F(CharSequence charSequence) {
        this.f22610s = charSequence;
        TextView textView = this.f22609r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void G(boolean z10) {
        if (this.f22608q == z10) {
            return;
        }
        h();
        if (z10) {
            b0 b0Var = new b0(this.f22598g);
            this.f22609r = b0Var;
            b0Var.setId(ic.f.Q);
            this.f22609r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f22609r.setTypeface(typeface);
            }
            H(this.f22612u);
            I(this.f22613v);
            F(this.f22610s);
            E(this.f22611t);
            this.f22609r.setVisibility(4);
            e(this.f22609r, 0);
        } else {
            w();
            C(this.f22609r, 0);
            this.f22609r = null;
            this.f22599h.p0();
            this.f22599h.A0();
        }
        this.f22608q = z10;
    }

    public void H(int i10) {
        this.f22612u = i10;
        TextView textView = this.f22609r;
        if (textView != null) {
            this.f22599h.c0(textView, i10);
        }
    }

    public void I(ColorStateList colorStateList) {
        this.f22613v = colorStateList;
        TextView textView = this.f22609r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void J(int i10) {
        this.f22617z = i10;
        TextView textView = this.f22616y;
        if (textView != null) {
            d3.i.s(textView, i10);
        }
    }

    public void K(boolean z10) {
        if (this.f22615x == z10) {
            return;
        }
        h();
        if (z10) {
            b0 b0Var = new b0(this.f22598g);
            this.f22616y = b0Var;
            b0Var.setId(ic.f.R);
            this.f22616y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f22616y.setTypeface(typeface);
            }
            this.f22616y.setVisibility(4);
            o0.o0(this.f22616y, 1);
            J(this.f22617z);
            L(this.A);
            e(this.f22616y, 1);
            this.f22616y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f22616y, 1);
            this.f22616y = null;
            this.f22599h.p0();
            this.f22599h.A0();
        }
        this.f22615x = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f22616y;
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
            M(this.f22609r, typeface);
            M(this.f22616y, typeface);
        }
    }

    public final void O(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean P(TextView textView, @NonNull CharSequence charSequence) {
        if (o0.R(this.f22599h) && this.f22599h.isEnabled()) {
            return (this.f22606o == this.f22605n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public void Q(CharSequence charSequence) {
        h();
        this.f22607p = charSequence;
        this.f22609r.setText(charSequence);
        int i10 = this.f22605n;
        if (i10 != 1) {
            this.f22606o = 1;
        }
        S(i10, this.f22606o, P(this.f22609r, charSequence));
    }

    public void R(CharSequence charSequence) {
        h();
        this.f22614w = charSequence;
        this.f22616y.setText(charSequence);
        int i10 = this.f22605n;
        if (i10 != 2) {
            this.f22606o = 2;
        }
        S(i10, this.f22606o, P(this.f22616y, charSequence));
    }

    public final void S(int i10, int i11, boolean z10) {
        t tVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f22603l = animatorSet;
            ArrayList arrayList = new ArrayList();
            tVar = this;
            tVar.i(arrayList, this.f22615x, this.f22616y, 2, i10, i11);
            tVar.i(arrayList, tVar.f22608q, tVar.f22609r, 1, i10, i11);
            jc.b.a(animatorSet, arrayList);
            animatorSet.addListener(tVar.new a(i11, m(i10), i10, m(i11)));
            animatorSet.start();
        } else {
            tVar = this;
            D(i10, i11);
        }
        tVar.f22599h.p0();
        tVar.f22599h.u0(z10);
        tVar.f22599h.A0();
    }

    public void e(TextView textView, int i10) {
        if (this.f22600i == null && this.f22602k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f22598g);
            this.f22600i = linearLayout;
            linearLayout.setOrientation(0);
            this.f22599h.addView(this.f22600i, -1, -2);
            this.f22602k = new FrameLayout(this.f22598g);
            this.f22600i.addView(this.f22602k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f22599h.getEditText() != null) {
                f();
            }
        }
        if (z(i10)) {
            this.f22602k.setVisibility(0);
            this.f22602k.addView(textView);
        } else {
            this.f22600i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f22600i.setVisibility(0);
        this.f22601j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f22599h.getEditText();
            boolean zG = ed.c.g(this.f22598g);
            LinearLayout linearLayout = this.f22600i;
            int i10 = ic.d.I;
            o0.B0(linearLayout, v(zG, i10, o0.E(editText)), v(zG, ic.d.J, this.f22598g.getResources().getDimensionPixelSize(ic.d.H)), v(zG, i10, o0.D(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.f22600i == null || this.f22599h.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f22603l;
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
                objectAnimatorJ.setStartDelay(this.f22594c);
            }
            list.add(objectAnimatorJ);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorK = k(textView);
            objectAnimatorK.setStartDelay(this.f22594c);
            list.add(objectAnimatorK);
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.b : this.f22594c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f22596e : this.f22597f);
        return objectAnimatorOfFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f22604m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f22593a);
        objectAnimatorOfFloat.setInterpolator(this.f22595d);
        return objectAnimatorOfFloat;
    }

    public boolean l() {
        return y(this.f22606o);
    }

    public final TextView m(int i10) {
        if (i10 == 1) {
            return this.f22609r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f22616y;
    }

    public int n() {
        return this.f22611t;
    }

    public CharSequence o() {
        return this.f22610s;
    }

    public CharSequence p() {
        return this.f22607p;
    }

    public int q() {
        TextView textView = this.f22609r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList r() {
        TextView textView = this.f22609r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence s() {
        return this.f22614w;
    }

    public View t() {
        return this.f22616y;
    }

    public int u() {
        TextView textView = this.f22616y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int v(boolean z10, int i10, int i11) {
        return z10 ? this.f22598g.getResources().getDimensionPixelSize(i10) : i11;
    }

    public void w() {
        this.f22607p = null;
        h();
        if (this.f22605n == 1) {
            if (!this.f22615x || TextUtils.isEmpty(this.f22614w)) {
                this.f22606o = 0;
            } else {
                this.f22606o = 2;
            }
        }
        S(this.f22605n, this.f22606o, P(this.f22609r, ""));
    }

    public void x() {
        h();
        int i10 = this.f22605n;
        if (i10 == 2) {
            this.f22606o = 0;
        }
        S(i10, this.f22606o, P(this.f22616y, ""));
    }

    public final boolean y(int i10) {
        return (i10 != 1 || this.f22609r == null || TextUtils.isEmpty(this.f22607p)) ? false : true;
    }

    public boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
