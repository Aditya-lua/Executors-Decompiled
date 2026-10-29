package jd;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import q.a1;
import q.b0;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class x extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f21339a;
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f21340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f21341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f21342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f21343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f21345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f21346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21347j;

    public x(TextInputLayout textInputLayout, a1 a1Var) {
        super(textInputLayout.getContext());
        this.f21339a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(hc.h.f18891f, (ViewGroup) this, false);
        this.f21341d = checkableImageButton;
        s.e(checkableImageButton);
        b0 b0Var = new b0(getContext());
        this.b = b0Var;
        j(a1Var);
        i(a1Var);
        addView(checkableImageButton);
        addView(b0Var);
    }

    public void A(@NonNull y2.p pVar) {
        if (this.b.getVisibility() != 0) {
            pVar.L0(this.f21341d);
        } else {
            pVar.y0(this.b);
            pVar.L0(this.b);
        }
    }

    public void B() {
        EditText editText = this.f21339a.f8229d;
        if (editText == null) {
            return;
        }
        o0.B0(this.b, k() ? 0 : o0.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(hc.d.K), editText.getCompoundPaddingBottom());
    }

    public final void C() {
        int i10 = (this.f21340c == null || this.f21347j) ? 8 : 0;
        setVisibility((this.f21341d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.b.setVisibility(i10);
        this.f21339a.o0();
    }

    public CharSequence a() {
        return this.f21340c;
    }

    public ColorStateList b() {
        return this.b.getTextColors();
    }

    public int c() {
        return o0.E(this) + o0.E(this.b) + (k() ? this.f21341d.getMeasuredWidth() + androidx.core.view.n.a((ViewGroup.MarginLayoutParams) this.f21341d.getLayoutParams()) : 0);
    }

    @NonNull
    public TextView d() {
        return this.b;
    }

    public CharSequence e() {
        return this.f21341d.getContentDescription();
    }

    public Drawable f() {
        return this.f21341d.getDrawable();
    }

    public int g() {
        return this.f21344g;
    }

    @NonNull
    public ImageView.ScaleType h() {
        return this.f21345h;
    }

    public final void i(a1 a1Var) {
        this.b.setVisibility(8);
        this.b.setId(hc.f.T);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        o0.o0(this.b, 1);
        o(a1Var.n(hc.k.E7, 0));
        int i10 = hc.k.F7;
        if (a1Var.s(i10)) {
            p(a1Var.c(i10));
        }
        n(a1Var.p(hc.k.D7));
    }

    public final void j(a1 a1Var) {
        if (dd.c.g(getContext())) {
            androidx.core.view.n.c((ViewGroup.MarginLayoutParams) this.f21341d.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        int i10 = hc.k.L7;
        if (a1Var.s(i10)) {
            this.f21342e = dd.c.b(getContext(), a1Var, i10);
        }
        int i11 = hc.k.M7;
        if (a1Var.s(i11)) {
            this.f21343f = zc.r.i(a1Var.k(i11, -1), null);
        }
        int i12 = hc.k.I7;
        if (a1Var.s(i12)) {
            s(a1Var.g(i12));
            int i13 = hc.k.H7;
            if (a1Var.s(i13)) {
                r(a1Var.p(i13));
            }
            q(a1Var.a(hc.k.G7, true));
        }
        t(a1Var.f(hc.k.J7, getResources().getDimensionPixelSize(hc.d.f18815c0)));
        int i14 = hc.k.K7;
        if (a1Var.s(i14)) {
            w(s.b(a1Var.k(i14, -1)));
        }
    }

    public boolean k() {
        return this.f21341d.getVisibility() == 0;
    }

    public void l(boolean z10) {
        this.f21347j = z10;
        C();
    }

    public void m() {
        s.d(this.f21339a, this.f21341d, this.f21342e);
    }

    public void n(CharSequence charSequence) {
        this.f21340c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.b.setText(charSequence);
        C();
    }

    public void o(int i10) {
        d3.i.s(this.b, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        B();
    }

    public void p(@NonNull ColorStateList colorStateList) {
        this.b.setTextColor(colorStateList);
    }

    public void q(boolean z10) {
        this.f21341d.setCheckable(z10);
    }

    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f21341d.setContentDescription(charSequence);
        }
    }

    public void s(Drawable drawable) {
        this.f21341d.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f21339a, this.f21341d, this.f21342e, this.f21343f);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    public void t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f21344g) {
            this.f21344g = i10;
            s.g(this.f21341d, i10);
        }
    }

    public void u(View.OnClickListener onClickListener) {
        s.h(this.f21341d, onClickListener, this.f21346i);
    }

    public void v(View.OnLongClickListener onLongClickListener) {
        this.f21346i = onLongClickListener;
        s.i(this.f21341d, onLongClickListener);
    }

    public void w(@NonNull ImageView.ScaleType scaleType) {
        this.f21345h = scaleType;
        s.j(this.f21341d, scaleType);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f21342e != colorStateList) {
            this.f21342e = colorStateList;
            s.a(this.f21339a, this.f21341d, colorStateList, this.f21343f);
        }
    }

    public void y(PorterDuff.Mode mode) {
        if (this.f21343f != mode) {
            this.f21343f = mode;
            s.a(this.f21339a, this.f21341d, this.f21342e, mode);
        }
    }

    public void z(boolean z10) {
        if (k() != z10) {
            this.f21341d.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
