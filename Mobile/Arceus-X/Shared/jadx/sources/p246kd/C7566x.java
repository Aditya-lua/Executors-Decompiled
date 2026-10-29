package p246kd;

import ad.C0146r;
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
import androidx.core.view.C0622n;
import androidx.core.view.C0625o0;
import androidx.core.view.GravityCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import p066d3.C4431i;
import p101ed.C5050c;
import p194ic.C6740d;
import p194ic.C6742f;
import p194ic.C6744h;
import p194ic.C6747k;
import p365q.C10357a1;
import p365q.C10359b0;
import p564y2.C13017p;

/* JADX INFO: renamed from: kd.x */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class C7566x extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f28997a;

    /* JADX INFO: renamed from: b */
    public final TextView f28998b;

    /* JADX INFO: renamed from: c */
    public CharSequence f28999c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f29000d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f29001e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f29002f;

    /* JADX INFO: renamed from: g */
    public int f29003g;

    /* JADX INFO: renamed from: h */
    @NonNull
    public ImageView.ScaleType f29004h;

    /* JADX INFO: renamed from: i */
    public View.OnLongClickListener f29005i;

    /* JADX INFO: renamed from: j */
    public boolean f29006j;

    public C7566x(TextInputLayout textInputLayout, C10357a1 c10357a1) {
        super(textInputLayout.getContext());
        this.f28997a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C6744h.f26064f, (ViewGroup) this, false);
        this.f29000d = checkableImageButton;
        C7561s.m31256e(checkableImageButton);
        C10359b0 c10359b0 = new C10359b0(getContext());
        this.f28998b = c10359b0;
        m31322j(c10357a1);
        m31321i(c10357a1);
        addView(checkableImageButton);
        addView(c10359b0);
    }

    /* JADX INFO: renamed from: A */
    public void m31310A(@NonNull C13017p c13017p) {
        if (this.f28998b.getVisibility() != 0) {
            c13017p.m48372L0(this.f29000d);
        } else {
            c13017p.m48432y0(this.f28998b);
            c13017p.m48372L0(this.f28998b);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m31311B() {
        EditText editText = this.f28997a.f10580d;
        if (editText == null) {
            return;
        }
        C0625o0.m2981B0(this.f28998b, m31323k() ? 0 : C0625o0.m2986E(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C6740d.f25940K), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: C */
    public final void m31312C() {
        int i10 = (this.f28999c == null || this.f29006j) ? 8 : 0;
        setVisibility((this.f29000d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f28998b.setVisibility(i10);
        this.f28997a.m13152o0();
    }

    /* JADX INFO: renamed from: a */
    public CharSequence m31313a() {
        return this.f28999c;
    }

    /* JADX INFO: renamed from: b */
    public ColorStateList m31314b() {
        return this.f28998b.getTextColors();
    }

    /* JADX INFO: renamed from: c */
    public int m31315c() {
        return C0625o0.m2986E(this) + C0625o0.m2986E(this.f28998b) + (m31323k() ? this.f29000d.getMeasuredWidth() + C0622n.m2974a((ViewGroup.MarginLayoutParams) this.f29000d.getLayoutParams()) : 0);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public TextView m31316d() {
        return this.f28998b;
    }

    /* JADX INFO: renamed from: e */
    public CharSequence m31317e() {
        return this.f29000d.getContentDescription();
    }

    /* JADX INFO: renamed from: f */
    public Drawable m31318f() {
        return this.f29000d.getDrawable();
    }

    /* JADX INFO: renamed from: g */
    public int m31319g() {
        return this.f29003g;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType m31320h() {
        return this.f29004h;
    }

    /* JADX INFO: renamed from: i */
    public final void m31321i(C10357a1 c10357a1) {
        this.f28998b.setVisibility(8);
        this.f28998b.setId(C6742f.f26026T);
        this.f28998b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C0625o0.m3044o0(this.f28998b, 1);
        m31327o(c10357a1.m39742n(C6747k.f26179E7, 0));
        int i10 = C6747k.f26188F7;
        if (c10357a1.m39747s(i10)) {
            m31328p(c10357a1.m39731c(i10));
        }
        m31326n(c10357a1.m39744p(C6747k.f26170D7));
    }

    /* JADX INFO: renamed from: j */
    public final void m31322j(C10357a1 c10357a1) {
        if (C5050c.m23742g(getContext())) {
            C0622n.m2976c((ViewGroup.MarginLayoutParams) this.f29000d.getLayoutParams(), 0);
        }
        m31333u(null);
        m31334v(null);
        int i10 = C6747k.f26242L7;
        if (c10357a1.m39747s(i10)) {
            this.f29001e = C5050c.m23737b(getContext(), c10357a1, i10);
        }
        int i11 = C6747k.f26251M7;
        if (c10357a1.m39747s(i11)) {
            this.f29002f = C0146r.m454i(c10357a1.m39739k(i11, -1), null);
        }
        int i12 = C6747k.f26215I7;
        if (c10357a1.m39747s(i12)) {
            m31331s(c10357a1.m39735g(i12));
            int i13 = C6747k.f26206H7;
            if (c10357a1.m39747s(i13)) {
                m31330r(c10357a1.m39744p(i13));
            }
            m31329q(c10357a1.m39729a(C6747k.f26197G7, true));
        }
        m31332t(c10357a1.m39734f(C6747k.f26224J7, getResources().getDimensionPixelSize(C6740d.f25961c0)));
        int i14 = C6747k.f26233K7;
        if (c10357a1.m39747s(i14)) {
            m31335w(C7561s.m31253b(c10357a1.m39739k(i14, -1)));
        }
    }

    /* JADX INFO: renamed from: k */
    public boolean m31323k() {
        return this.f29000d.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: l */
    public void m31324l(boolean z10) {
        this.f29006j = z10;
        m31312C();
    }

    /* JADX INFO: renamed from: m */
    public void m31325m() {
        C7561s.m31255d(this.f28997a, this.f29000d, this.f29001e);
    }

    /* JADX INFO: renamed from: n */
    public void m31326n(CharSequence charSequence) {
        this.f28999c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f28998b.setText(charSequence);
        m31312C();
    }

    /* JADX INFO: renamed from: o */
    public void m31327o(int i10) {
        C4431i.m22312s(this.f28998b, i10);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m31311B();
    }

    /* JADX INFO: renamed from: p */
    public void m31328p(@NonNull ColorStateList colorStateList) {
        this.f28998b.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: q */
    public void m31329q(boolean z10) {
        this.f29000d.setCheckable(z10);
    }

    /* JADX INFO: renamed from: r */
    public void m31330r(CharSequence charSequence) {
        if (m31317e() != charSequence) {
            this.f29000d.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m31331s(Drawable drawable) {
        this.f29000d.setImageDrawable(drawable);
        if (drawable != null) {
            C7561s.m31252a(this.f28997a, this.f29000d, this.f29001e, this.f29002f);
            m31338z(true);
            m31325m();
        } else {
            m31338z(false);
            m31333u(null);
            m31334v(null);
            m31330r(null);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m31332t(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f29003g) {
            this.f29003g = i10;
            C7561s.m31258g(this.f29000d, i10);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m31333u(View.OnClickListener onClickListener) {
        C7561s.m31259h(this.f29000d, onClickListener, this.f29005i);
    }

    /* JADX INFO: renamed from: v */
    public void m31334v(View.OnLongClickListener onLongClickListener) {
        this.f29005i = onLongClickListener;
        C7561s.m31260i(this.f29000d, onLongClickListener);
    }

    /* JADX INFO: renamed from: w */
    public void m31335w(@NonNull ImageView.ScaleType scaleType) {
        this.f29004h = scaleType;
        C7561s.m31261j(this.f29000d, scaleType);
    }

    /* JADX INFO: renamed from: x */
    public void m31336x(ColorStateList colorStateList) {
        if (this.f29001e != colorStateList) {
            this.f29001e = colorStateList;
            C7561s.m31252a(this.f28997a, this.f29000d, colorStateList, this.f29002f);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m31337y(PorterDuff.Mode mode) {
        if (this.f29002f != mode) {
            this.f29002f = mode;
            C7561s.m31252a(this.f28997a, this.f29000d, this.f29001e, mode);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m31338z(boolean z10) {
        if (m31323k() != z10) {
            this.f29000d.setVisibility(z10 ? 0 : 8);
            m31311B();
            m31312C();
        }
    }
}
