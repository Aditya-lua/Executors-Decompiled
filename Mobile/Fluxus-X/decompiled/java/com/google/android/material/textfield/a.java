package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import bd.n;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jc.h;
import jc.i;
import jc.k;
import md.f;
import md.g;
import md.p;
import md.r;
import md.s;
import md.u;
import md.w;
import q.b1;
import q.c0;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class a extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f8199a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f8200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f8201d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f8202e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f8203f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f8204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f8205h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8206i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.g> f8207j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f8208k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f8209l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8210m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f8211n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f8212o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f8213p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f8214q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EditText f8216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f8217t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y2.c.a f8218u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextWatcher f8219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextInputLayout.f f8220w;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0131a extends n {
        public C0131a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.m().a(editable);
        }

        @Override // bd.n, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a.this.m().b(charSequence, i10, i11, i12);
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(@NonNull TextInputLayout textInputLayout) {
            if (a.this.f8216s == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.f8216s != null) {
                a.this.f8216s.removeTextChangedListener(a.this.f8219v);
                if (a.this.f8216s.getOnFocusChangeListener() == a.this.m().e()) {
                    a.this.f8216s.setOnFocusChangeListener(null);
                }
            }
            a.this.f8216s = textInputLayout.getEditText();
            if (a.this.f8216s != null) {
                a.this.f8216s.addTextChangedListener(a.this.f8219v);
            }
            a.this.m().n(a.this.f8216s);
            a aVar = a.this;
            aVar.h0(aVar.m());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.this.M();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseArray<r> f8224a = new SparseArray<>();
        public final a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8226d;

        public d(a aVar, b1 b1Var) {
            this.b = aVar;
            this.f8225c = b1Var.n(k.Y6, 0);
            this.f8226d = b1Var.n(k.f20673w7, 0);
        }

        public final r b(int i10) {
            if (i10 == -1) {
                return new g(this.b);
            }
            if (i10 == 0) {
                return new u(this.b);
            }
            if (i10 == 1) {
                return new w(this.b, this.f8226d);
            }
            if (i10 == 2) {
                return new f(this.b);
            }
            if (i10 == 3) {
                return new p(this.b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        public r c(int i10) {
            r rVar = this.f8224a.get(i10);
            if (rVar != null) {
                return rVar;
            }
            r rVarB = b(i10);
            this.f8224a.append(i10, rVarB);
            return rVarB;
        }
    }

    public a(TextInputLayout textInputLayout, b1 b1Var) {
        super(textInputLayout.getContext());
        this.f8206i = 0;
        this.f8207j = new LinkedHashSet<>();
        this.f8219v = new C0131a();
        b bVar = new b();
        this.f8220w = bVar;
        this.f8217t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f8199a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, jc.f.O);
        this.f8200c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, jc.f.N);
        this.f8204g = checkableImageButtonI2;
        this.f8205h = new d(this, b1Var);
        c0 c0Var = new c0(getContext());
        this.f8214q = c0Var;
        C(b1Var);
        B(b1Var);
        D(b1Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(c0Var);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public boolean A() {
        return this.f8206i != 0;
    }

    public final void B(b1 b1Var) {
        if (!b1Var.s(k.f20681x7)) {
            if (b1Var.s(k.f20493c7)) {
                this.f8208k = fd.c.b(getContext(), b1Var, k.f20493c7);
            }
            if (b1Var.s(k.f20503d7)) {
                this.f8209l = bd.r.i(b1Var.k(k.f20503d7, -1), null);
            }
        }
        if (b1Var.s(k.f20474a7)) {
            U(b1Var.k(k.f20474a7, 0));
            if (b1Var.s(k.X6)) {
                Q(b1Var.p(k.X6));
            }
            O(b1Var.a(k.W6, true));
        } else if (b1Var.s(k.f20681x7)) {
            if (b1Var.s(k.f20690y7)) {
                this.f8208k = fd.c.b(getContext(), b1Var, k.f20690y7);
            }
            if (b1Var.s(k.f20699z7)) {
                this.f8209l = bd.r.i(b1Var.k(k.f20699z7, -1), null);
            }
            U(b1Var.a(k.f20681x7, false) ? 1 : 0);
            Q(b1Var.p(k.f20665v7));
        }
        T(b1Var.f(k.Z6, getResources().getDimensionPixelSize(jc.d.f20325c0)));
        if (b1Var.s(k.f20483b7)) {
            X(s.b(b1Var.k(k.f20483b7, -1)));
        }
    }

    public final void C(b1 b1Var) {
        if (b1Var.s(k.f20548i7)) {
            this.f8201d = fd.c.b(getContext(), b1Var, k.f20548i7);
        }
        if (b1Var.s(k.f20557j7)) {
            this.f8202e = bd.r.i(b1Var.k(k.f20557j7, -1), null);
        }
        if (b1Var.s(k.f20539h7)) {
            c0(b1Var.g(k.f20539h7));
        }
        this.f8200c.setContentDescription(getResources().getText(i.f20423f));
        o0.w0(this.f8200c, 2);
        this.f8200c.setClickable(false);
        this.f8200c.setPressable(false);
        this.f8200c.setFocusable(false);
    }

    public final void D(b1 b1Var) {
        this.f8214q.setVisibility(8);
        this.f8214q.setId(jc.f.U);
        this.f8214q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        o0.o0(this.f8214q, 1);
        q0(b1Var.n(k.O7, 0));
        if (b1Var.s(k.P7)) {
            r0(b1Var.c(k.P7));
        }
        p0(b1Var.p(k.N7));
    }

    public boolean E() {
        return A() && this.f8204g.isChecked();
    }

    public boolean F() {
        return this.b.getVisibility() == 0 && this.f8204g.getVisibility() == 0;
    }

    public boolean G() {
        return this.f8200c.getVisibility() == 0;
    }

    public void H(boolean z10) {
        this.f8215r = z10;
        y0();
    }

    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f8199a.d0());
        }
    }

    public void J() {
        s.d(this.f8199a, this.f8204g, this.f8208k);
    }

    public void K() {
        s.d(this.f8199a, this.f8200c, this.f8201d);
    }

    public void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        r rVarM = m();
        boolean z12 = true;
        if (!rVarM.l() || (zIsChecked = this.f8204g.isChecked()) == rVarM.m()) {
            z11 = false;
        } else {
            this.f8204g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!rVarM.j() || (zIsActivated = this.f8204g.isActivated()) == rVarM.k()) {
            z12 = z11;
        } else {
            N(!zIsActivated);
        }
        if (z10 || z12) {
            J();
        }
    }

    public final void M() {
        AccessibilityManager accessibilityManager;
        y2.c.a aVar = this.f8218u;
        if (aVar == null || (accessibilityManager = this.f8217t) == null) {
            return;
        }
        y2.c.b(accessibilityManager, aVar);
    }

    public void N(boolean z10) {
        this.f8204g.setActivated(z10);
    }

    public void O(boolean z10) {
        this.f8204g.setCheckable(z10);
    }

    public void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f8204g.setContentDescription(charSequence);
        }
    }

    public void R(int i10) {
        S(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public void S(Drawable drawable) {
        this.f8204g.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f8199a, this.f8204g, this.f8208k, this.f8209l);
            J();
        }
    }

    public void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f8210m) {
            this.f8210m = i10;
            s.g(this.f8204g, i10);
            s.g(this.f8200c, i10);
        }
    }

    public void U(int i10) {
        if (this.f8206i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f8206i;
        this.f8206i = i10;
        j(i11);
        a0(i10 != 0);
        r rVarM = m();
        R(t(rVarM));
        P(rVarM.c());
        O(rVarM.l());
        if (!rVarM.i(this.f8199a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f8199a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(rVarM);
        V(rVarM.f());
        EditText editText = this.f8216s;
        if (editText != null) {
            rVarM.n(editText);
            h0(rVarM);
        }
        s.a(this.f8199a, this.f8204g, this.f8208k, this.f8209l);
        L(true);
    }

    public void V(View.OnClickListener onClickListener) {
        s.h(this.f8204g, onClickListener, this.f8212o);
    }

    public void W(View.OnLongClickListener onLongClickListener) {
        this.f8212o = onLongClickListener;
        s.i(this.f8204g, onLongClickListener);
    }

    public void X(@NonNull ImageView.ScaleType scaleType) {
        this.f8211n = scaleType;
        s.j(this.f8204g, scaleType);
        s.j(this.f8200c, scaleType);
    }

    public void Y(ColorStateList colorStateList) {
        if (this.f8208k != colorStateList) {
            this.f8208k = colorStateList;
            s.a(this.f8199a, this.f8204g, colorStateList, this.f8209l);
        }
    }

    public void Z(PorterDuff.Mode mode) {
        if (this.f8209l != mode) {
            this.f8209l = mode;
            s.a(this.f8199a, this.f8204g, this.f8208k, mode);
        }
    }

    public void a0(boolean z10) {
        if (F() != z10) {
            this.f8204g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f8199a.o0();
        }
    }

    public void b0(int i10) {
        c0(i10 != 0 ? k.a.b(getContext(), i10) : null);
        K();
    }

    public void c0(Drawable drawable) {
        this.f8200c.setImageDrawable(drawable);
        w0();
        s.a(this.f8199a, this.f8200c, this.f8201d, this.f8202e);
    }

    public void d0(View.OnClickListener onClickListener) {
        s.h(this.f8200c, onClickListener, this.f8203f);
    }

    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f8203f = onLongClickListener;
        s.i(this.f8200c, onLongClickListener);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.f8201d != colorStateList) {
            this.f8201d = colorStateList;
            s.a(this.f8199a, this.f8200c, colorStateList, this.f8202e);
        }
    }

    public final void g() {
        if (this.f8218u == null || this.f8217t == null || !o0.Q(this)) {
            return;
        }
        y2.c.a(this.f8217t, this.f8218u);
    }

    public void g0(PorterDuff.Mode mode) {
        if (this.f8202e != mode) {
            this.f8202e = mode;
            s.a(this.f8199a, this.f8200c, this.f8201d, mode);
        }
    }

    public void h() {
        this.f8204g.performClick();
        this.f8204g.jumpDrawablesToCurrentState();
    }

    public final void h0(r rVar) {
        if (this.f8216s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f8216s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f8204g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(h.f20400e, viewGroup, false);
        checkableImageButton.setId(i10);
        s.e(checkableImageButton);
        if (fd.c.g(getContext())) {
            androidx.core.view.n.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    public final void j(int i10) {
        Iterator<TextInputLayout.g> it = this.f8207j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f8199a, i10);
        }
    }

    public void j0(CharSequence charSequence) {
        this.f8204g.setContentDescription(charSequence);
    }

    public CheckableImageButton k() {
        if (G()) {
            return this.f8200c;
        }
        if (A() && F()) {
            return this.f8204g;
        }
        return null;
    }

    public void k0(int i10) {
        l0(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public CharSequence l() {
        return this.f8204g.getContentDescription();
    }

    public void l0(Drawable drawable) {
        this.f8204g.setImageDrawable(drawable);
    }

    public r m() {
        return this.f8205h.c(this.f8206i);
    }

    public void m0(boolean z10) {
        if (z10 && this.f8206i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    public Drawable n() {
        return this.f8204g.getDrawable();
    }

    public void n0(ColorStateList colorStateList) {
        this.f8208k = colorStateList;
        s.a(this.f8199a, this.f8204g, colorStateList, this.f8209l);
    }

    public int o() {
        return this.f8210m;
    }

    public void o0(PorterDuff.Mode mode) {
        this.f8209l = mode;
        s.a(this.f8199a, this.f8204g, this.f8208k, mode);
    }

    public int p() {
        return this.f8206i;
    }

    public void p0(CharSequence charSequence) {
        this.f8213p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8214q.setText(charSequence);
        y0();
    }

    @NonNull
    public ImageView.ScaleType q() {
        return this.f8211n;
    }

    public void q0(int i10) {
        d3.i.s(this.f8214q, i10);
    }

    public CheckableImageButton r() {
        return this.f8204g;
    }

    public void r0(@NonNull ColorStateList colorStateList) {
        this.f8214q.setTextColor(colorStateList);
    }

    public Drawable s() {
        return this.f8200c.getDrawable();
    }

    public final void s0(@NonNull r rVar) {
        rVar.s();
        this.f8218u = rVar.h();
        g();
    }

    public final int t(r rVar) {
        int i10 = this.f8205h.f8225c;
        return i10 == 0 ? rVar.d() : i10;
    }

    public final void t0(@NonNull r rVar) {
        M();
        this.f8218u = null;
        rVar.u();
    }

    public CharSequence u() {
        return this.f8204g.getContentDescription();
    }

    public final void u0(boolean z10) {
        if (!z10 || n() == null) {
            s.a(this.f8199a, this.f8204g, this.f8208k, this.f8209l);
            return;
        }
        Drawable drawableMutate = q2.a.r(n()).mutate();
        q2.a.n(drawableMutate, this.f8199a.getErrorCurrentTextColors());
        this.f8204g.setImageDrawable(drawableMutate);
    }

    public Drawable v() {
        return this.f8204g.getDrawable();
    }

    public final void v0() {
        this.b.setVisibility((this.f8204g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f8213p == null || this.f8215r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public CharSequence w() {
        return this.f8213p;
    }

    public final void w0() {
        this.f8200c.setVisibility(s() != null && this.f8199a.N() && this.f8199a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f8199a.o0();
    }

    public ColorStateList x() {
        return this.f8214q.getTextColors();
    }

    public void x0() {
        if (this.f8199a.f8146d == null) {
            return;
        }
        o0.B0(this.f8214q, getContext().getResources().getDimensionPixelSize(jc.d.K), this.f8199a.f8146d.getPaddingTop(), (F() || G()) ? 0 : o0.D(this.f8199a.f8146d), this.f8199a.f8146d.getPaddingBottom());
    }

    public int y() {
        return o0.D(this) + o0.D(this.f8214q) + ((F() || G()) ? this.f8204g.getMeasuredWidth() + androidx.core.view.n.b((ViewGroup.MarginLayoutParams) this.f8204g.getLayoutParams()) : 0);
    }

    public final void y0() {
        int visibility = this.f8214q.getVisibility();
        int i10 = (this.f8213p == null || this.f8215r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f8214q.setVisibility(i10);
        this.f8199a.o0();
    }

    public TextView z() {
        return this.f8214q;
    }
}
