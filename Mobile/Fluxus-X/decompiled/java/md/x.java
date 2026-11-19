package md;

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
import q.b1;
import q.c0;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class x extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f23205a;
    public final TextView b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f23206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f23207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f23208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f23209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f23211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f23212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23213j;

    public x(TextInputLayout textInputLayout, b1 b1Var) {
        super(textInputLayout.getContext());
        this.f23205a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(jc.h.f20401f, (ViewGroup) this, false);
        this.f23207d = checkableImageButton;
        s.e(checkableImageButton);
        c0 c0Var = new c0(getContext());
        this.b = c0Var;
        j(b1Var);
        i(b1Var);
        addView(checkableImageButton);
        addView(c0Var);
    }

    public void A(@NonNull y2.p pVar) {
        if (this.b.getVisibility() != 0) {
            pVar.L0(this.f23207d);
        } else {
            pVar.y0(this.b);
            pVar.L0(this.b);
        }
    }

    public void B() {
        EditText editText = this.f23205a.f8146d;
        if (editText == null) {
            return;
        }
        o0.B0(this.b, k() ? 0 : o0.E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(jc.d.K), editText.getCompoundPaddingBottom());
    }

    public final void C() {
        int i10 = (this.f23206c == null || this.f23213j) ? 8 : 0;
        setVisibility((this.f23207d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.b.setVisibility(i10);
        this.f23205a.o0();
    }

    public CharSequence a() {
        return this.f23206c;
    }

    public ColorStateList b() {
        return this.b.getTextColors();
    }

    public int c() {
        return o0.E(this) + o0.E(this.b) + (k() ? this.f23207d.getMeasuredWidth() + androidx.core.view.n.a((ViewGroup.MarginLayoutParams) this.f23207d.getLayoutParams()) : 0);
    }

    @NonNull
    public TextView d() {
        return this.b;
    }

    public CharSequence e() {
        return this.f23207d.getContentDescription();
    }

    public Drawable f() {
        return this.f23207d.getDrawable();
    }

    public int g() {
        return this.f23210g;
    }

    @NonNull
    public ImageView.ScaleType h() {
        return this.f23211h;
    }

    public final void i(b1 b1Var) {
        this.b.setVisibility(8);
        this.b.setId(jc.f.T);
        this.b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        o0.o0(this.b, 1);
        o(b1Var.n(jc.k.E7, 0));
        if (b1Var.s(jc.k.F7)) {
            p(b1Var.c(jc.k.F7));
        }
        n(b1Var.p(jc.k.D7));
    }

    public final void j(b1 b1Var) {
        if (fd.c.g(getContext())) {
            androidx.core.view.n.c((ViewGroup.MarginLayoutParams) this.f23207d.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        if (b1Var.s(jc.k.L7)) {
            this.f23208e = fd.c.b(getContext(), b1Var, jc.k.L7);
        }
        if (b1Var.s(jc.k.M7)) {
            this.f23209f = bd.r.i(b1Var.k(jc.k.M7, -1), null);
        }
        if (b1Var.s(jc.k.I7)) {
            s(b1Var.g(jc.k.I7));
            if (b1Var.s(jc.k.H7)) {
                r(b1Var.p(jc.k.H7));
            }
            q(b1Var.a(jc.k.G7, true));
        }
        t(b1Var.f(jc.k.J7, getResources().getDimensionPixelSize(jc.d.f20325c0)));
        if (b1Var.s(jc.k.K7)) {
            w(s.b(b1Var.k(jc.k.K7, -1)));
        }
    }

    public boolean k() {
        return this.f23207d.getVisibility() == 0;
    }

    public void l(boolean z10) {
        this.f23213j = z10;
        C();
    }

    public void m() {
        s.d(this.f23205a, this.f23207d, this.f23208e);
    }

    public void n(CharSequence charSequence) {
        this.f23206c = TextUtils.isEmpty(charSequence) ? null : charSequence;
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
        this.f23207d.setCheckable(z10);
    }

    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f23207d.setContentDescription(charSequence);
        }
    }

    public void s(Drawable drawable) {
        this.f23207d.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f23205a, this.f23207d, this.f23208e, this.f23209f);
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
        if (i10 != this.f23210g) {
            this.f23210g = i10;
            s.g(this.f23207d, i10);
        }
    }

    public void u(View.OnClickListener onClickListener) {
        s.h(this.f23207d, onClickListener, this.f23212i);
    }

    public void v(View.OnLongClickListener onLongClickListener) {
        this.f23212i = onLongClickListener;
        s.i(this.f23207d, onLongClickListener);
    }

    public void w(@NonNull ImageView.ScaleType scaleType) {
        this.f23211h = scaleType;
        s.j(this.f23207d, scaleType);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f23208e != colorStateList) {
            this.f23208e = colorStateList;
            s.a(this.f23205a, this.f23207d, colorStateList, this.f23209f);
        }
    }

    public void y(PorterDuff.Mode mode) {
        if (this.f23209f != mode) {
            this.f23209f = mode;
            s.a(this.f23205a, this.f23207d, this.f23208e, mode);
        }
    }

    public void z(boolean z10) {
        if (k() != z10) {
            this.f23207d.setVisibility(z10 ? 0 : 8);
            B();
            C();
        }
    }
}
