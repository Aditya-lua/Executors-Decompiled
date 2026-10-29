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
import com.google.android.material.internal.CheckableImageButton;
import hc.h;
import hc.i;
import hc.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import jd.f;
import jd.g;
import jd.p;
import jd.r;
import jd.s;
import jd.u;
import jd.w;
import q.a1;
import q.b0;
import zc.n;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class a extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f8282a;

    @NonNull
    public final FrameLayout b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f8283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f8284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f8285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f8286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final CheckableImageButton f8287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f8288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashSet<TextInputLayout.g> f8290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f8291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f8292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f8294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f8295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f8296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    public final TextView f8297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public EditText f8299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f8300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y2.c.a f8301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextWatcher f8302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextInputLayout.f f8303w;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0124a extends n {
        public C0124a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.m().a(editable);
        }

        @Override // zc.n, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            a.this.m().b(charSequence, i10, i11, i12);
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(@NonNull TextInputLayout textInputLayout) {
            if (a.this.f8299s == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.f8299s != null) {
                a.this.f8299s.removeTextChangedListener(a.this.f8302v);
                if (a.this.f8299s.getOnFocusChangeListener() == a.this.m().e()) {
                    a.this.f8299s.setOnFocusChangeListener(null);
                }
            }
            a.this.f8299s = textInputLayout.getEditText();
            if (a.this.f8299s != null) {
                a.this.f8299s.addTextChangedListener(a.this.f8302v);
            }
            a.this.m().n(a.this.f8299s);
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
        public final SparseArray<r> f8307a = new SparseArray<>();
        public final a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f8308c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8309d;

        public d(a aVar, a1 a1Var) {
            this.b = aVar;
            this.f8308c = a1Var.n(k.Y6, 0);
            this.f8309d = a1Var.n(k.f19162w7, 0);
        }

        public final r b(int i10) {
            if (i10 == -1) {
                return new g(this.b);
            }
            if (i10 == 0) {
                return new u(this.b);
            }
            if (i10 == 1) {
                return new w(this.b, this.f8309d);
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
            r rVar = this.f8307a.get(i10);
            if (rVar != null) {
                return rVar;
            }
            r rVarB = b(i10);
            this.f8307a.append(i10, rVarB);
            return rVarB;
        }
    }

    public a(TextInputLayout textInputLayout, a1 a1Var) {
        super(textInputLayout.getContext());
        this.f8289i = 0;
        this.f8290j = new LinkedHashSet<>();
        this.f8302v = new C0124a();
        b bVar = new b();
        this.f8303w = bVar;
        this.f8300t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f8282a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonI = i(this, layoutInflaterFrom, hc.f.O);
        this.f8283c = checkableImageButtonI;
        CheckableImageButton checkableImageButtonI2 = i(frameLayout, layoutInflaterFrom, hc.f.N);
        this.f8287g = checkableImageButtonI2;
        this.f8288h = new d(this, a1Var);
        b0 b0Var = new b0(getContext());
        this.f8297q = b0Var;
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
        return this.f8289i != 0;
    }

    public final void B(a1 a1Var) {
        int i10 = k.f19171x7;
        if (!a1Var.s(i10)) {
            int i11 = k.f18983c7;
            if (a1Var.s(i11)) {
                this.f8291k = dd.c.b(getContext(), a1Var, i11);
            }
            int i12 = k.f18993d7;
            if (a1Var.s(i12)) {
                this.f8292l = zc.r.i(a1Var.k(i12, -1), null);
            }
        }
        int i13 = k.f18964a7;
        if (a1Var.s(i13)) {
            U(a1Var.k(i13, 0));
            int i14 = k.X6;
            if (a1Var.s(i14)) {
                Q(a1Var.p(i14));
            }
            O(a1Var.a(k.W6, true));
        } else if (a1Var.s(i10)) {
            int i15 = k.f19180y7;
            if (a1Var.s(i15)) {
                this.f8291k = dd.c.b(getContext(), a1Var, i15);
            }
            int i16 = k.f19189z7;
            if (a1Var.s(i16)) {
                this.f8292l = zc.r.i(a1Var.k(i16, -1), null);
            }
            U(a1Var.a(i10, false) ? 1 : 0);
            Q(a1Var.p(k.f19154v7));
        }
        T(a1Var.f(k.Z6, getResources().getDimensionPixelSize(hc.d.f18815c0)));
        int i17 = k.f18973b7;
        if (a1Var.s(i17)) {
            X(s.b(a1Var.k(i17, -1)));
        }
    }

    public final void C(a1 a1Var) {
        int i10 = k.f19038i7;
        if (a1Var.s(i10)) {
            this.f8284d = dd.c.b(getContext(), a1Var, i10);
        }
        int i11 = k.f19047j7;
        if (a1Var.s(i11)) {
            this.f8285e = zc.r.i(a1Var.k(i11, -1), null);
        }
        int i12 = k.f19029h7;
        if (a1Var.s(i12)) {
            c0(a1Var.g(i12));
        }
        this.f8283c.setContentDescription(getResources().getText(i.f18913f));
        o0.w0(this.f8283c, 2);
        this.f8283c.setClickable(false);
        this.f8283c.setPressable(false);
        this.f8283c.setFocusable(false);
    }

    public final void D(a1 a1Var) {
        this.f8297q.setVisibility(8);
        this.f8297q.setId(hc.f.U);
        this.f8297q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        o0.o0(this.f8297q, 1);
        q0(a1Var.n(k.O7, 0));
        int i10 = k.P7;
        if (a1Var.s(i10)) {
            r0(a1Var.c(i10));
        }
        p0(a1Var.p(k.N7));
    }

    public boolean E() {
        return A() && this.f8287g.isChecked();
    }

    public boolean F() {
        return this.b.getVisibility() == 0 && this.f8287g.getVisibility() == 0;
    }

    public boolean G() {
        return this.f8283c.getVisibility() == 0;
    }

    public void H(boolean z10) {
        this.f8298r = z10;
        y0();
    }

    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f8282a.d0());
        }
    }

    public void J() {
        s.d(this.f8282a, this.f8287g, this.f8291k);
    }

    public void K() {
        s.d(this.f8282a, this.f8283c, this.f8284d);
    }

    public void L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        r rVarM = m();
        boolean z12 = true;
        if (!rVarM.l() || (zIsChecked = this.f8287g.isChecked()) == rVarM.m()) {
            z11 = false;
        } else {
            this.f8287g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!rVarM.j() || (zIsActivated = this.f8287g.isActivated()) == rVarM.k()) {
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
        y2.c.a aVar = this.f8301u;
        if (aVar == null || (accessibilityManager = this.f8300t) == null) {
            return;
        }
        y2.c.b(accessibilityManager, aVar);
    }

    public void N(boolean z10) {
        this.f8287g.setActivated(z10);
    }

    public void O(boolean z10) {
        this.f8287g.setCheckable(z10);
    }

    public void P(int i10) {
        Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f8287g.setContentDescription(charSequence);
        }
    }

    public void R(int i10) {
        S(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public void S(Drawable drawable) {
        this.f8287g.setImageDrawable(drawable);
        if (drawable != null) {
            s.a(this.f8282a, this.f8287g, this.f8291k, this.f8292l);
            J();
        }
    }

    public void T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f8293m) {
            this.f8293m = i10;
            s.g(this.f8287g, i10);
            s.g(this.f8283c, i10);
        }
    }

    public void U(int i10) {
        if (this.f8289i == i10) {
            return;
        }
        t0(m());
        int i11 = this.f8289i;
        this.f8289i = i10;
        j(i11);
        a0(i10 != 0);
        r rVarM = m();
        R(t(rVarM));
        P(rVarM.c());
        O(rVarM.l());
        if (!rVarM.i(this.f8282a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f8282a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        s0(rVarM);
        V(rVarM.f());
        EditText editText = this.f8299s;
        if (editText != null) {
            rVarM.n(editText);
            h0(rVarM);
        }
        s.a(this.f8282a, this.f8287g, this.f8291k, this.f8292l);
        L(true);
    }

    public void V(View.OnClickListener onClickListener) {
        s.h(this.f8287g, onClickListener, this.f8295o);
    }

    public void W(View.OnLongClickListener onLongClickListener) {
        this.f8295o = onLongClickListener;
        s.i(this.f8287g, onLongClickListener);
    }

    public void X(@NonNull ImageView.ScaleType scaleType) {
        this.f8294n = scaleType;
        s.j(this.f8287g, scaleType);
        s.j(this.f8283c, scaleType);
    }

    public void Y(ColorStateList colorStateList) {
        if (this.f8291k != colorStateList) {
            this.f8291k = colorStateList;
            s.a(this.f8282a, this.f8287g, colorStateList, this.f8292l);
        }
    }

    public void Z(PorterDuff.Mode mode) {
        if (this.f8292l != mode) {
            this.f8292l = mode;
            s.a(this.f8282a, this.f8287g, this.f8291k, mode);
        }
    }

    public void a0(boolean z10) {
        if (F() != z10) {
            this.f8287g.setVisibility(z10 ? 0 : 8);
            v0();
            x0();
            this.f8282a.o0();
        }
    }

    public void b0(int i10) {
        c0(i10 != 0 ? k.a.b(getContext(), i10) : null);
        K();
    }

    public void c0(Drawable drawable) {
        this.f8283c.setImageDrawable(drawable);
        w0();
        s.a(this.f8282a, this.f8283c, this.f8284d, this.f8285e);
    }

    public void d0(View.OnClickListener onClickListener) {
        s.h(this.f8283c, onClickListener, this.f8286f);
    }

    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f8286f = onLongClickListener;
        s.i(this.f8283c, onLongClickListener);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.f8284d != colorStateList) {
            this.f8284d = colorStateList;
            s.a(this.f8282a, this.f8283c, colorStateList, this.f8285e);
        }
    }

    public final void g() {
        if (this.f8301u == null || this.f8300t == null || !o0.Q(this)) {
            return;
        }
        y2.c.a(this.f8300t, this.f8301u);
    }

    public void g0(PorterDuff.Mode mode) {
        if (this.f8285e != mode) {
            this.f8285e = mode;
            s.a(this.f8282a, this.f8283c, this.f8284d, mode);
        }
    }

    public void h() {
        this.f8287g.performClick();
        this.f8287g.jumpDrawablesToCurrentState();
    }

    public final void h0(r rVar) {
        if (this.f8299s == null) {
            return;
        }
        if (rVar.e() != null) {
            this.f8299s.setOnFocusChangeListener(rVar.e());
        }
        if (rVar.g() != null) {
            this.f8287g.setOnFocusChangeListener(rVar.g());
        }
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(h.f18890e, viewGroup, false);
        checkableImageButton.setId(i10);
        s.e(checkableImageButton);
        if (dd.c.g(getContext())) {
            androidx.core.view.n.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public void i0(int i10) {
        j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    public final void j(int i10) {
        Iterator<TextInputLayout.g> it = this.f8290j.iterator();
        while (it.hasNext()) {
            it.next().a(this.f8282a, i10);
        }
    }

    public void j0(CharSequence charSequence) {
        this.f8287g.setContentDescription(charSequence);
    }

    public CheckableImageButton k() {
        if (G()) {
            return this.f8283c;
        }
        if (A() && F()) {
            return this.f8287g;
        }
        return null;
    }

    public void k0(int i10) {
        l0(i10 != 0 ? k.a.b(getContext(), i10) : null);
    }

    public CharSequence l() {
        return this.f8287g.getContentDescription();
    }

    public void l0(Drawable drawable) {
        this.f8287g.setImageDrawable(drawable);
    }

    public r m() {
        return this.f8288h.c(this.f8289i);
    }

    public void m0(boolean z10) {
        if (z10 && this.f8289i != 1) {
            U(1);
        } else {
            if (z10) {
                return;
            }
            U(0);
        }
    }

    public Drawable n() {
        return this.f8287g.getDrawable();
    }

    public void n0(ColorStateList colorStateList) {
        this.f8291k = colorStateList;
        s.a(this.f8282a, this.f8287g, colorStateList, this.f8292l);
    }

    public int o() {
        return this.f8293m;
    }

    public void o0(PorterDuff.Mode mode) {
        this.f8292l = mode;
        s.a(this.f8282a, this.f8287g, this.f8291k, mode);
    }

    public int p() {
        return this.f8289i;
    }

    public void p0(CharSequence charSequence) {
        this.f8296p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f8297q.setText(charSequence);
        y0();
    }

    @NonNull
    public ImageView.ScaleType q() {
        return this.f8294n;
    }

    public void q0(int i10) {
        d3.i.s(this.f8297q, i10);
    }

    public CheckableImageButton r() {
        return this.f8287g;
    }

    public void r0(@NonNull ColorStateList colorStateList) {
        this.f8297q.setTextColor(colorStateList);
    }

    public Drawable s() {
        return this.f8283c.getDrawable();
    }

    public final void s0(@NonNull r rVar) {
        rVar.s();
        this.f8301u = rVar.h();
        g();
    }

    public final int t(r rVar) {
        int i10 = this.f8288h.f8308c;
        return i10 == 0 ? rVar.d() : i10;
    }

    public final void t0(@NonNull r rVar) {
        M();
        this.f8301u = null;
        rVar.u();
    }

    public CharSequence u() {
        return this.f8287g.getContentDescription();
    }

    public final void u0(boolean z10) {
        if (!z10 || n() == null) {
            s.a(this.f8282a, this.f8287g, this.f8291k, this.f8292l);
            return;
        }
        Drawable drawableMutate = q2.a.r(n()).mutate();
        q2.a.n(drawableMutate, this.f8282a.getErrorCurrentTextColors());
        this.f8287g.setImageDrawable(drawableMutate);
    }

    public Drawable v() {
        return this.f8287g.getDrawable();
    }

    public final void v0() {
        this.b.setVisibility((this.f8287g.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || ((this.f8296p == null || this.f8298r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public CharSequence w() {
        return this.f8296p;
    }

    public final void w0() {
        this.f8283c.setVisibility(s() != null && this.f8282a.N() && this.f8282a.d0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f8282a.o0();
    }

    public ColorStateList x() {
        return this.f8297q.getTextColors();
    }

    public void x0() {
        if (this.f8282a.f8229d == null) {
            return;
        }
        o0.B0(this.f8297q, getContext().getResources().getDimensionPixelSize(hc.d.K), this.f8282a.f8229d.getPaddingTop(), (F() || G()) ? 0 : o0.D(this.f8282a.f8229d), this.f8282a.f8229d.getPaddingBottom());
    }

    public int y() {
        return o0.D(this) + o0.D(this.f8297q) + ((F() || G()) ? this.f8287g.getMeasuredWidth() + androidx.core.view.n.b((ViewGroup.MarginLayoutParams) this.f8287g.getLayoutParams()) : 0);
    }

    public final void y0() {
        int visibility = this.f8297q.getVisibility();
        int i10 = (this.f8296p == null || this.f8298r) ? 8 : 0;
        if (visibility != i10) {
            m().q(i10 == 0);
        }
        v0();
        this.f8297q.setVisibility(i10);
        this.f8282a.o0();
    }

    public TextView z() {
        return this.f8297q;
    }
}
