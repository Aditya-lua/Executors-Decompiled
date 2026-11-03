package com.google.android.material.textfield;

import ad.n;
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
import com.google.android.material.internal.CheckableImageButton;
import ic.h;
import ic.i;
import ic.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kd.f;
import kd.g;
import kd.p;
import kd.r;
import kd.s;
import kd.u;
import kd.w;
import q.a1;
import q.b0;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class a extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f8356a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f8357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f8358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f8359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f8360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f8361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f8362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.g> f8364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f8365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f8366l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f8368n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f8369o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f8370p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f8371q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8372r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EditText f8373s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f8374t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y2.c.a f8375u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextWatcher f8376v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextInputLayout.f f8377w;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0128a extends n {
        public C0128a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.m().a(editable);
        }

        @Override // ad.n, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a.this.m().b(charSequence, i10, i11, i12);
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(@NonNull TextInputLayout textInputLayout) {
            if (a.this.f8373s == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.f8373s != null) {
                a.this.f8373s.removeTextChangedListener(a.this.f8376v);
                if (a.this.f8373s.getOnFocusChangeListener() == a.this.m().e()) {
                    a.this.f8373s.setOnFocusChangeListener(null);
                }
            }
            a.this.f8373s = textInputLayout.getEditText();
            if (a.this.f8373s != null) {
                a.this.f8373s.addTextChangedListener(a.this.f8376v);
            }
            a.this.m().n(a.this.f8373s);
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
        public final SparseArray<r> f8381a = new SparseArray<>();
        public final a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8383d;

        public d(a aVar, a1 a1Var) {
            this.b = aVar;
            this.f8382c = a1Var.n(k.Y6, 0);
            this.f8383d = a1Var.n(k.f20984w7, 0);
        }

        public final r b(int i10) {
            if (i10 == -1) {
                return new g(this.b);
            }
            if (i10 == 0) {
                return new u(this.b);
            }
            if (i10 == 1) {
                return new w(this.b, this.f8383d);
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
            r rVar = this.f8381a.get(i10);
            if (rVar != null) {
                return rVar;
            }
            r rVarB = b(i10);
            this.f8381a.append(i10, rVarB);
            return rVarB;
        }
    }

    public a(TextInputLayout textInputLayout, a1 a1Var) {
        super(textInputLayout.getContext());
        this.f8363i = 0;
        this.f8364j = new LinkedHashSet<>();
        this.f8376v = new C0128a();
        b bVar = new b();
        this.f8377w = bVar;
        this.f8374t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f8356a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, ic.f.O);
        this.f8357c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, ic.f.N);
        this.f8361g = checkableImageButtonI2;
        this.f8362h = new d(this, a1Var);
        b0 b0Var = new b0(getContext());
        this.f8371q = b0Var;
        C(a1Var);
        B(a1Var);
        D(a1Var);
        frameLayout.addView(checkableImageButtonI2);
        addView(b0Var);
        addView(frameLayout);
        addView(checkableImageButtonI);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public boolean A() {
        return this.f8363i != 0;
    }

    public final void B(a1 a1Var) {
        int i10 = k.f20993x7;
        if (!a1Var.s(i10)) {
            int i11 = k.f20805c7;
            if (a1Var.s(i11)) {
                this.f8365k = ed.c.b(getContext(), a1Var, i11);
            }
            int i12 = k.f20815d7;
            if (a1Var.s(i12)) {
                this.f8366l = ad.r.i(a1Var.k(i12, -1), null);
            }
        }
        int i13 = k.f20786a7;
        if (a1Var.s(i13)) {
            U(a1Var.k(i13, 0));
            int i14 = k.X6;
            if (a1Var.s(i14)) {
                Q(a1Var.p(i14));
            }
            O(a1Var.a(k.W6, true));
        } else if (a1Var.s(i10)) {
            int i15 = k.f21002y7;
            if (a1Var.s(i15)) {
                this.f8365k = ed.c.b(getContext(), a1Var, i15);
            }
            int i16 = k.f21011z7;
            if (a1Var.s(i16)) {
                this.f8366l = ad.r.i(a1Var.k(i16, -1), null);
            }
            U(a1Var.a(i10, false) ? 1 : 0);
            Q(a1Var.p(k.f20976v7));
        }
        T(a1Var.f(k.Z6, getResources().getDimensionPixelSize(ic.d.f20637c0)));
        int i17 = k.f20795b7;
        if (a1Var.s(i17)) {
            X(s.b(a1Var.k(i17, -1)));
        }
    }

    public final void C(a1 a1Var) {
        int i10 = k.f20860i7;
        if (a1Var.s(i10)) {
            this.f8358d = ed.c.b(getContext(), a1Var, i10);
        }
        int i11 = k.f20869j7;
        if (a1Var.s(i11)) {
            this.f8359e = ad.r.i(a1Var.k(i11, -1), null);
        }
        int i12 = k.f20851h7;
        if (a1Var.s(i12)) {
            c0(a1Var.g(i12));
        }
        this.f8357c.setContentDescription(getResources().getText(i.f20735f));
        o0.w0(this.f8357c, 2);
        this.f8357c.setClickable(false);
        this.f8357c.setPressable(false);
        this.f8357c.setFocusable(false);
    }

    public final void D(a1 a1Var) {
        this.f8371q.setVisibility(8);
        this.f8371q.setId(ic.f.U);
        this.f8371q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        o0.o0(this.f8371q, 1);
        q0(a1Var.n(k.O7, 0));
        int i10 = k.P7;
        if (a1Var.s(i10)) {
            r0(a1Var.c(i10));
        }
        p0(a1Var.p(k.N7));
    }

    public boolean E() {
        return A() && this.f8361g.isChecked();
    }

    public boolean F() {
        return this.b.getVisibility() == 0 && this.f8361g.getVisibility() == 0;
    }

    public boolean G() {
        return this.f8357c.getVisibility() == 0;
    }

    public void H(boolean z10) {
        this.f8372r = z10;
        y0();
    }

    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f8356a.d0());
        }
    }

    public void J() {
        s.d(this.f8356a, this.f8361g, this.f8365k);
    }

    public void K() {
        s.d(this.f8356a, this.f8357c, this.f8358d);
    }

    public void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        r rVarM = m();
        boolean z12 = true;
        if (!rVarM.l() || (zIsChecked = this.f8361g.isChecked()) == rVarM.m()) {
            z11 = false;
        } else {
            this.f8361g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!rVarM.j() || (zIsActivated = this.f8361g.isActivated()) == rVarM.k()) {
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
        y2.c.a aVar = this.f8375u;
        if (aVar == null || (accessibilityManager = this.f8374t) == null) {
            return;
        }
        y2.c.b(accessibilityManager, aVar);
    }

    public void N(boolean z10) {
        this.f8361g.setActivated(z10);
    }

    public void O(boolean z10) {
        this.f8361g.setCheckable(z10);
    }

    public void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f8361g.setContentDescription(charSequence);
        }
    }

    public void R(int i10) {
        S(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public void S(Drawable drawable) {
        this.f8361g.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f8356a, this.f8361g, this.f8365k, this.f8366l);
            J();
        }
    }

    public void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f8367m) {
            this.f8367m = i10;
            s.g(this.f8361g, i10);
            s.g(this.f8357c, i10);
        }
    }

    public void U(int i10) {
        if (this.f8363i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f8363i;
        this.f8363i = i10;
        j(i11);
        a0(i10 != 0);
        r rVarM = m();
        R(t(rVarM));
        P(rVarM.c());
        O(rVarM.l());
        if (!rVarM.i(this.f8356a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f8356a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(rVarM);
        V(rVarM.f());
        EditText editText = this.f8373s;
        if (editText != null) {
            rVarM.n(editText);
            h0(rVarM);
        }
        s.a(this.f8356a, this.f8361g, this.f8365k, this.f8366l);
        L(true);
    }

    public void V(View.OnClickListener onClickListener) {
        s.h(this.f8361g, onClickListener, this.f8369o);
    }

    public void W(View.OnLongClickListener onLongClickListener) {
        this.f8369o = onLongClickListener;
        s.i(this.f8361g, onLongClickListener);
    }

    public void X(@NonNull ImageView.ScaleType scaleType) {
        this.f8368n = scaleType;
        s.j(this.f8361g, scaleType);
        s.j(this.f8357c, scaleType);
    }

    public void Y(ColorStateList colorStateList) {
        if (this.f8365k != colorStateList) {
            this.f8365k = colorStateList;
            s.a(this.f8356a, this.f8361g, colorStateList, this.f8366l);
        }
    }

    public void Z(PorterDuff.Mode mode) {
        if (this.f8366l != mode) {
            this.f8366l = mode;
            s.a(this.f8356a, this.f8361g, this.f8365k, mode);
        }
    }

    public void a0(boolean z10) {
        if (F() != z10) {
            this.f8361g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f8356a.o0();
        }
    }

    public void b0(int i10) {
        c0(i10 != 0 ? k.a.b(getContext(), i10) : null);
        K();
    }

    public void c0(Drawable drawable) {
        this.f8357c.setImageDrawable(drawable);
        w0();
        s.a(this.f8356a, this.f8357c, this.f8358d, this.f8359e);
    }

    public void d0(View.OnClickListener onClickListener) {
        s.h(this.f8357c, onClickListener, this.f8360f);
    }

    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f8360f = onLongClickListener;
        s.i(this.f8357c, onLongClickListener);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.f8358d != colorStateList) {
            this.f8358d = colorStateList;
            s.a(this.f8356a, this.f8357c, colorStateList, this.f8359e);
        }
    }

    public final void g() {
        if (this.f8375u == null || this.f8374t == null || !o0.Q(this)) {
            return;
        }
        y2.c.a(this.f8374t, this.f8375u);
    }

    public void g0(PorterDuff.Mode mode) {
        if (this.f8359e != mode) {
            this.f8359e = mode;
            s.a(this.f8356a, this.f8357c, this.f8358d, mode);
        }
    }

    public void h() {
        this.f8361g.performClick();
        this.f8361g.jumpDrawablesToCurrentState();
    }

    public final void h0(r rVar) {
        if (this.f8373s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f8373s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f8361g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(h.f20712e, viewGroup, false);
        checkableImageButton.setId(i10);
        s.e(checkableImageButton);
        if (ed.c.g(getContext())) {
            androidx.core.view.n.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    public final void j(int i10) {
        Iterator<TextInputLayout.g> it = this.f8364j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f8356a, i10);
        }
    }

    public void j0(CharSequence charSequence) {
        this.f8361g.setContentDescription(charSequence);
    }

    public CheckableImageButton k() {
        if (G()) {
            return this.f8357c;
        }
        if (A() && F()) {
            return this.f8361g;
        }
        return null;
    }

    public void k0(int i10) {
        l0(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public CharSequence l() {
        return this.f8361g.getContentDescription();
    }

    public void l0(Drawable drawable) {
        this.f8361g.setImageDrawable(drawable);
    }

    public r m() {
        return this.f8362h.c(this.f8363i);
    }

    public void m0(boolean z10) {
        if (z10 && this.f8363i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    public Drawable n() {
        return this.f8361g.getDrawable();
    }

    public void n0(ColorStateList colorStateList) {
        this.f8365k = colorStateList;
        s.a(this.f8356a, this.f8361g, colorStateList, this.f8366l);
    }

    public int o() {
        return this.f8367m;
    }

    public void o0(PorterDuff.Mode mode) {
        this.f8366l = mode;
        s.a(this.f8356a, this.f8361g, this.f8365k, mode);
    }

    public int p() {
        return this.f8363i;
    }

    public void p0(CharSequence charSequence) {
        this.f8370p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8371q.setText(charSequence);
        y0();
    }

    @NonNull
    public ImageView.ScaleType q() {
        return this.f8368n;
    }

    public void q0(int i10) {
        d3.i.s(this.f8371q, i10);
    }

    public CheckableImageButton r() {
        return this.f8361g;
    }

    public void r0(@NonNull ColorStateList colorStateList) {
        this.f8371q.setTextColor(colorStateList);
    }

    public Drawable s() {
        return this.f8357c.getDrawable();
    }

    public final void s0(@NonNull r rVar) {
        rVar.s();
        this.f8375u = rVar.h();
        g();
    }

    public final int t(r rVar) {
        int i10 = this.f8362h.f8382c;
        return i10 == 0 ? rVar.d() : i10;
    }

    public final void t0(@NonNull r rVar) {
        M();
        this.f8375u = null;
        rVar.u();
    }

    public CharSequence u() {
        return this.f8361g.getContentDescription();
    }

    public final void u0(boolean z10) {
        if (!z10 || n() == null) {
            s.a(this.f8356a, this.f8361g, this.f8365k, this.f8366l);
            return;
        }
        Drawable drawableMutate = q2.a.r(n()).mutate();
        q2.a.n(drawableMutate, this.f8356a.getErrorCurrentTextColors());
        this.f8361g.setImageDrawable(drawableMutate);
    }

    public Drawable v() {
        return this.f8361g.getDrawable();
    }

    public final void v0() {
        this.b.setVisibility((this.f8361g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f8370p == null || this.f8372r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public CharSequence w() {
        return this.f8370p;
    }

    public final void w0() {
        this.f8357c.setVisibility(s() != null && this.f8356a.N() && this.f8356a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f8356a.o0();
    }

    public ColorStateList x() {
        return this.f8371q.getTextColors();
    }

    public void x0() {
        if (this.f8356a.f8303d == null) {
            return;
        }
        o0.B0(this.f8371q, getContext().getResources().getDimensionPixelSize(ic.d.K), this.f8356a.f8303d.getPaddingTop(), (F() || G()) ? 0 : o0.D(this.f8356a.f8303d), this.f8356a.f8303d.getPaddingBottom());
    }

    public int y() {
        return o0.D(this) + o0.D(this.f8371q) + ((F() || G()) ? this.f8361g.getMeasuredWidth() + androidx.core.view.n.b((ViewGroup.MarginLayoutParams) this.f8361g.getLayoutParams()) : 0);
    }

    public final void y0() {
        int visibility = this.f8371q.getVisibility();
        int i10 = (this.f8370p == null || this.f8372r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f8371q.setVisibility(i10);
        this.f8356a.o0();
    }

    public TextView z() {
        return this.f8371q;
    }
}
