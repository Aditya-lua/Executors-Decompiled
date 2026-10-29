package p246kd;

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
import androidx.core.view.C0625o0;
import cd.C1627h;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import p066d3.C4431i;
import p101ed.C5050c;
import p194ic.C6738b;
import p194ic.C6740d;
import p194ic.C6742f;
import p216jc.C7137a;
import p216jc.C7138b;
import p365q.C10359b0;

/* JADX INFO: renamed from: kd.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C7562t {

    /* JADX INFO: renamed from: A */
    public ColorStateList f28959A;

    /* JADX INFO: renamed from: B */
    public Typeface f28960B;

    /* JADX INFO: renamed from: a */
    public final int f28961a;

    /* JADX INFO: renamed from: b */
    public final int f28962b;

    /* JADX INFO: renamed from: c */
    public final int f28963c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final TimeInterpolator f28964d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public final TimeInterpolator f28965e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public final TimeInterpolator f28966f;

    /* JADX INFO: renamed from: g */
    public final Context f28967g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public final TextInputLayout f28968h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f28969i;

    /* JADX INFO: renamed from: j */
    public int f28970j;

    /* JADX INFO: renamed from: k */
    public FrameLayout f28971k;

    /* JADX INFO: renamed from: l */
    public Animator f28972l;

    /* JADX INFO: renamed from: m */
    public final float f28973m;

    /* JADX INFO: renamed from: n */
    public int f28974n;

    /* JADX INFO: renamed from: o */
    public int f28975o;

    /* JADX INFO: renamed from: p */
    public CharSequence f28976p;

    /* JADX INFO: renamed from: q */
    public boolean f28977q;

    /* JADX INFO: renamed from: r */
    public TextView f28978r;

    /* JADX INFO: renamed from: s */
    public CharSequence f28979s;

    /* JADX INFO: renamed from: t */
    public int f28980t;

    /* JADX INFO: renamed from: u */
    public int f28981u;

    /* JADX INFO: renamed from: v */
    public ColorStateList f28982v;

    /* JADX INFO: renamed from: w */
    public CharSequence f28983w;

    /* JADX INFO: renamed from: x */
    public boolean f28984x;

    /* JADX INFO: renamed from: y */
    public TextView f28985y;

    /* JADX INFO: renamed from: z */
    public int f28986z;

    /* JADX INFO: renamed from: kd.t$a */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f28987a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TextView f28988b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f28989c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ TextView f28990d;

        public a(int i10, TextView textView, int i11, TextView textView2) {
            this.f28987a = i10;
            this.f28988b = textView;
            this.f28989c = i11;
            this.f28990d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C7562t.this.f28974n = this.f28987a;
            C7562t.this.f28972l = null;
            TextView textView = this.f28988b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f28989c == 1 && C7562t.this.f28978r != null) {
                    C7562t.this.f28978r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f28990d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f28990d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f28990d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f28990d.setAlpha(0.0f);
            }
        }
    }

    /* JADX INFO: renamed from: kd.t$b */
    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C7562t.this.f28968h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C7562t(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f28967g = context;
        this.f28968h = textInputLayout;
        this.f28973m = context.getResources().getDimensionPixelSize(C6740d.f25968g);
        int i10 = C6738b.f25871M;
        this.f28961a = C1627h.m8223f(context, i10, 217);
        this.f28962b = C1627h.m8223f(context, C6738b.f25867I, 167);
        this.f28963c = C1627h.m8223f(context, i10, 167);
        int i11 = C6738b.f25873O;
        this.f28964d = C1627h.m8224g(context, i11, C7137a.f27787d);
        TimeInterpolator timeInterpolator = C7137a.f27784a;
        this.f28965e = C1627h.m8224g(context, i11, timeInterpolator);
        this.f28966f = C1627h.m8224g(context, C6738b.f25875Q, timeInterpolator);
    }

    /* JADX INFO: renamed from: A */
    public boolean m31266A() {
        return this.f28977q;
    }

    /* JADX INFO: renamed from: B */
    public boolean m31267B() {
        return this.f28984x;
    }

    /* JADX INFO: renamed from: C */
    public void m31268C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f28969i == null) {
            return;
        }
        if (!m31306z(i10) || (frameLayout = this.f28971k) == null) {
            this.f28969i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f28970j - 1;
        this.f28970j = i11;
        m31280O(this.f28969i, i11);
    }

    /* JADX INFO: renamed from: D */
    public final void m31269D(int i10, int i11) {
        TextView textViewM31293m;
        TextView textViewM31293m2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewM31293m2 = m31293m(i11)) != null) {
            textViewM31293m2.setVisibility(0);
            textViewM31293m2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewM31293m = m31293m(i10)) != null) {
            textViewM31293m.setVisibility(4);
            if (i10 == 1) {
                textViewM31293m.setText((CharSequence) null);
            }
        }
        this.f28974n = i11;
    }

    /* JADX INFO: renamed from: E */
    public void m31270E(int i10) {
        this.f28980t = i10;
        TextView textView = this.f28978r;
        if (textView != null) {
            C0625o0.m3044o0(textView, i10);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m31271F(CharSequence charSequence) {
        this.f28979s = charSequence;
        TextView textView = this.f28978r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m31272G(boolean z10) {
        if (this.f28977q == z10) {
            return;
        }
        m31288h();
        if (z10) {
            C10359b0 c10359b0 = new C10359b0(this.f28967g);
            this.f28978r = c10359b0;
            c10359b0.setId(C6742f.f26023Q);
            this.f28978r.setTextAlignment(5);
            Typeface typeface = this.f28960B;
            if (typeface != null) {
                this.f28978r.setTypeface(typeface);
            }
            m31273H(this.f28981u);
            m31274I(this.f28982v);
            m31271F(this.f28979s);
            m31270E(this.f28980t);
            this.f28978r.setVisibility(4);
            m31285e(this.f28978r, 0);
        } else {
            m31303w();
            m31268C(this.f28978r, 0);
            this.f28978r = null;
            this.f28968h.m13154p0();
            this.f28968h.m13109A0();
        }
        this.f28977q = z10;
    }

    /* JADX INFO: renamed from: H */
    public void m31273H(int i10) {
        this.f28981u = i10;
        TextView textView = this.f28978r;
        if (textView != null) {
            this.f28968h.m13134c0(textView, i10);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m31274I(ColorStateList colorStateList) {
        this.f28982v = colorStateList;
        TextView textView = this.f28978r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: J */
    public void m31275J(int i10) {
        this.f28986z = i10;
        TextView textView = this.f28985y;
        if (textView != null) {
            C4431i.m22312s(textView, i10);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m31276K(boolean z10) {
        if (this.f28984x == z10) {
            return;
        }
        m31288h();
        if (z10) {
            C10359b0 c10359b0 = new C10359b0(this.f28967g);
            this.f28985y = c10359b0;
            c10359b0.setId(C6742f.f26024R);
            this.f28985y.setTextAlignment(5);
            Typeface typeface = this.f28960B;
            if (typeface != null) {
                this.f28985y.setTypeface(typeface);
            }
            this.f28985y.setVisibility(4);
            C0625o0.m3044o0(this.f28985y, 1);
            m31275J(this.f28986z);
            m31277L(this.f28959A);
            m31285e(this.f28985y, 1);
            this.f28985y.setAccessibilityDelegate(new b());
        } else {
            m31304x();
            m31268C(this.f28985y, 1);
            this.f28985y = null;
            this.f28968h.m13154p0();
            this.f28968h.m13109A0();
        }
        this.f28984x = z10;
    }

    /* JADX INFO: renamed from: L */
    public void m31277L(ColorStateList colorStateList) {
        this.f28959A = colorStateList;
        TextView textView = this.f28985y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: M */
    public final void m31278M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m31279N(Typeface typeface) {
        if (typeface != this.f28960B) {
            this.f28960B = typeface;
            m31278M(this.f28978r, typeface);
            m31278M(this.f28985y, typeface);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m31280O(@NonNull ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m31281P(TextView textView, @NonNull CharSequence charSequence) {
        if (C0625o0.m3006R(this.f28968h) && this.f28968h.isEnabled()) {
            return (this.f28975o == this.f28974n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public void m31282Q(CharSequence charSequence) {
        m31288h();
        this.f28976p = charSequence;
        this.f28978r.setText(charSequence);
        int i10 = this.f28974n;
        if (i10 != 1) {
            this.f28975o = 1;
        }
        m31284S(i10, this.f28975o, m31281P(this.f28978r, charSequence));
    }

    /* JADX INFO: renamed from: R */
    public void m31283R(CharSequence charSequence) {
        m31288h();
        this.f28983w = charSequence;
        this.f28985y.setText(charSequence);
        int i10 = this.f28974n;
        if (i10 != 2) {
            this.f28975o = 2;
        }
        m31284S(i10, this.f28975o, m31281P(this.f28985y, charSequence));
    }

    /* JADX INFO: renamed from: S */
    public final void m31284S(int i10, int i11, boolean z10) {
        C7562t c7562t;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f28972l = animatorSet;
            ArrayList arrayList = new ArrayList();
            c7562t = this;
            c7562t.m31289i(arrayList, this.f28984x, this.f28985y, 2, i10, i11);
            c7562t.m31289i(arrayList, c7562t.f28977q, c7562t.f28978r, 1, i10, i11);
            C7138b.m29922a(animatorSet, arrayList);
            animatorSet.addListener(c7562t.new a(i11, m31293m(i10), i10, m31293m(i11)));
            animatorSet.start();
        } else {
            c7562t = this;
            m31269D(i10, i11);
        }
        c7562t.f28968h.m13154p0();
        c7562t.f28968h.m13164u0(z10);
        c7562t.f28968h.m13109A0();
    }

    /* JADX INFO: renamed from: e */
    public void m31285e(TextView textView, int i10) {
        if (this.f28969i == null && this.f28971k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f28967g);
            this.f28969i = linearLayout;
            linearLayout.setOrientation(0);
            this.f28968h.addView(this.f28969i, -1, -2);
            this.f28971k = new FrameLayout(this.f28967g);
            this.f28969i.addView(this.f28971k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f28968h.getEditText() != null) {
                m31286f();
            }
        }
        if (m31306z(i10)) {
            this.f28971k.setVisibility(0);
            this.f28971k.addView(textView);
        } else {
            this.f28969i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f28969i.setVisibility(0);
        this.f28970j++;
    }

    /* JADX INFO: renamed from: f */
    public void m31286f() {
        if (m31287g()) {
            EditText editText = this.f28968h.getEditText();
            boolean zM23742g = C5050c.m23742g(this.f28967g);
            LinearLayout linearLayout = this.f28969i;
            int i10 = C6740d.f25938I;
            C0625o0.m2981B0(linearLayout, m31302v(zM23742g, i10, C0625o0.m2986E(editText)), m31302v(zM23742g, C6740d.f25939J, this.f28967g.getResources().getDimensionPixelSize(C6740d.f25937H)), m31302v(zM23742g, i10, C0625o0.m2984D(editText)), 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m31287g() {
        return (this.f28969i == null || this.f28968h.getEditText() == null) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public void m31288h() {
        Animator animator = this.f28972l;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m31289i(@NonNull List<Animator> list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorM31290j = m31290j(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorM31290j.setStartDelay(this.f28963c);
            }
            list.add(objectAnimatorM31290j);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorM31291k = m31291k(textView);
            objectAnimatorM31291k.setStartDelay(this.f28963c);
            list.add(objectAnimatorM31291k);
        }
    }

    /* JADX INFO: renamed from: j */
    public final ObjectAnimator m31290j(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f28962b : this.f28963c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f28965e : this.f28966f);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: k */
    public final ObjectAnimator m31291k(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f28973m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f28961a);
        objectAnimatorOfFloat.setInterpolator(this.f28964d);
        return objectAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: l */
    public boolean m31292l() {
        return m31305y(this.f28975o);
    }

    /* JADX INFO: renamed from: m */
    public final TextView m31293m(int i10) {
        if (i10 == 1) {
            return this.f28978r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f28985y;
    }

    /* JADX INFO: renamed from: n */
    public int m31294n() {
        return this.f28980t;
    }

    /* JADX INFO: renamed from: o */
    public CharSequence m31295o() {
        return this.f28979s;
    }

    /* JADX INFO: renamed from: p */
    public CharSequence m31296p() {
        return this.f28976p;
    }

    /* JADX INFO: renamed from: q */
    public int m31297q() {
        TextView textView = this.f28978r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: renamed from: r */
    public ColorStateList m31298r() {
        TextView textView = this.f28978r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public CharSequence m31299s() {
        return this.f28983w;
    }

    /* JADX INFO: renamed from: t */
    public View m31300t() {
        return this.f28985y;
    }

    /* JADX INFO: renamed from: u */
    public int m31301u() {
        TextView textView = this.f28985y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* JADX INFO: renamed from: v */
    public final int m31302v(boolean z10, int i10, int i11) {
        return z10 ? this.f28967g.getResources().getDimensionPixelSize(i10) : i11;
    }

    /* JADX INFO: renamed from: w */
    public void m31303w() {
        this.f28976p = null;
        m31288h();
        if (this.f28974n == 1) {
            if (!this.f28984x || TextUtils.isEmpty(this.f28983w)) {
                this.f28975o = 0;
            } else {
                this.f28975o = 2;
            }
        }
        m31284S(this.f28974n, this.f28975o, m31281P(this.f28978r, ""));
    }

    /* JADX INFO: renamed from: x */
    public void m31304x() {
        m31288h();
        int i10 = this.f28974n;
        if (i10 == 2) {
            this.f28975o = 0;
        }
        m31284S(i10, this.f28975o, m31281P(this.f28985y, ""));
    }

    /* JADX INFO: renamed from: y */
    public final boolean m31305y(int i10) {
        return (i10 != 1 || this.f28978r == null || TextUtils.isEmpty(this.f28976p)) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public boolean m31306z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
