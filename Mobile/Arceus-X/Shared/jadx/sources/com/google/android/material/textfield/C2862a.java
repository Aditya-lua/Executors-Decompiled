package com.google.android.material.textfield;

import ad.C0142n;
import ad.C0146r;
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
import androidx.core.view.C0622n;
import androidx.core.view.C0625o0;
import androidx.core.view.GravityCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p066d3.C4431i;
import p101ed.C5050c;
import p194ic.C6740d;
import p194ic.C6742f;
import p194ic.C6744h;
import p194ic.C6745i;
import p194ic.C6747k;
import p232k.C7399a;
import p246kd.AbstractC7560r;
import p246kd.C7548f;
import p246kd.C7549g;
import p246kd.C7558p;
import p246kd.C7561s;
import p246kd.C7563u;
import p246kd.C7565w;
import p365q.C10357a1;
import p365q.C10359b0;
import p368q2.C10425a;
import p564y2.C13004c;

/* JADX INFO: renamed from: com.google.android.material.textfield.a */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public class C2862a extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f10634a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final FrameLayout f10635b;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final CheckableImageButton f10636c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f10637d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f10638e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f10639f;

    /* JADX INFO: renamed from: g */
    @NonNull
    public final CheckableImageButton f10640g;

    /* JADX INFO: renamed from: h */
    public final d f10641h;

    /* JADX INFO: renamed from: i */
    public int f10642i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet<TextInputLayout.InterfaceC2861g> f10643j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f10644k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f10645l;

    /* JADX INFO: renamed from: m */
    public int f10646m;

    /* JADX INFO: renamed from: n */
    @NonNull
    public ImageView.ScaleType f10647n;

    /* JADX INFO: renamed from: o */
    public View.OnLongClickListener f10648o;

    /* JADX INFO: renamed from: p */
    public CharSequence f10649p;

    /* JADX INFO: renamed from: q */
    @NonNull
    public final TextView f10650q;

    /* JADX INFO: renamed from: r */
    public boolean f10651r;

    /* JADX INFO: renamed from: s */
    public EditText f10652s;

    /* JADX INFO: renamed from: t */
    public final AccessibilityManager f10653t;

    /* JADX INFO: renamed from: u */
    public C13004c.a f10654u;

    /* JADX INFO: renamed from: v */
    public final TextWatcher f10655v;

    /* JADX INFO: renamed from: w */
    public final TextInputLayout.InterfaceC2860f f10656w;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a */
    public class a extends C0142n {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C2862a.this.m13231m().mo31206a(editable);
        }

        @Override // ad.C0142n, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C2862a.this.m13231m().mo31250b(charSequence, i10, i11, i12);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$b */
    public class b implements TextInputLayout.InterfaceC2860f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC2860f
        /* JADX INFO: renamed from: a */
        public void mo13179a(@NonNull TextInputLayout textInputLayout) {
            if (C2862a.this.f10652s == textInputLayout.getEditText()) {
                return;
            }
            if (C2862a.this.f10652s != null) {
                C2862a.this.f10652s.removeTextChangedListener(C2862a.this.f10655v);
                if (C2862a.this.f10652s.getOnFocusChangeListener() == C2862a.this.m13231m().mo31209e()) {
                    C2862a.this.f10652s.setOnFocusChangeListener(null);
                }
            }
            C2862a.this.f10652s = textInputLayout.getEditText();
            if (C2862a.this.f10652s != null) {
                C2862a.this.f10652s.addTextChangedListener(C2862a.this.f10655v);
            }
            C2862a.this.m13231m().mo31212n(C2862a.this.f10652s);
            C2862a c2862a = C2862a.this;
            c2862a.m13222h0(c2862a.m13231m());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$c */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            C2862a.this.m13219g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C2862a.this.m13199M();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final SparseArray<AbstractC7560r> f10660a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public final C2862a f10661b;

        /* JADX INFO: renamed from: c */
        public final int f10662c;

        /* JADX INFO: renamed from: d */
        public final int f10663d;

        public d(C2862a c2862a, C10357a1 c10357a1) {
            this.f10661b = c2862a;
            this.f10662c = c10357a1.m39742n(C6747k.f26358Y6, 0);
            this.f10663d = c10357a1.m39742n(C6747k.f26578w7, 0);
        }

        /* JADX INFO: renamed from: b */
        public final AbstractC7560r m13259b(int i10) {
            if (i10 == -1) {
                return new C7549g(this.f10661b);
            }
            if (i10 == 0) {
                return new C7563u(this.f10661b);
            }
            if (i10 == 1) {
                return new C7565w(this.f10661b, this.f10663d);
            }
            if (i10 == 2) {
                return new C7548f(this.f10661b);
            }
            if (i10 == 3) {
                return new C7558p(this.f10661b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        /* JADX INFO: renamed from: c */
        public AbstractC7560r m13260c(int i10) {
            AbstractC7560r abstractC7560r = this.f10660a.get(i10);
            if (abstractC7560r != null) {
                return abstractC7560r;
            }
            AbstractC7560r abstractC7560rM13259b = m13259b(i10);
            this.f10660a.append(i10, abstractC7560rM13259b);
            return abstractC7560rM13259b;
        }
    }

    public C2862a(TextInputLayout textInputLayout, C10357a1 c10357a1) {
        super(textInputLayout.getContext());
        this.f10642i = 0;
        this.f10643j = new LinkedHashSet<>();
        this.f10655v = new a();
        b bVar = new b();
        this.f10656w = bVar;
        this.f10653t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f10634a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.END));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f10635b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM13223i = m13223i(this, layoutInflaterFrom, C6742f.f26021O);
        this.f10636c = checkableImageButtonM13223i;
        CheckableImageButton checkableImageButtonM13223i2 = m13223i(frameLayout, layoutInflaterFrom, C6742f.f26020N);
        this.f10640g = checkableImageButtonM13223i2;
        this.f10641h = new d(this, c10357a1);
        C10359b0 c10359b0 = new C10359b0(getContext());
        this.f10650q = c10359b0;
        m13189C(c10357a1);
        m13188B(c10357a1);
        m13190D(c10357a1);
        frameLayout.addView(checkableImageButtonM13223i2);
        addView(c10359b0);
        addView(frameLayout);
        addView(checkableImageButtonM13223i);
        textInputLayout.m13140i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    /* JADX INFO: renamed from: A */
    public boolean m13187A() {
        return this.f10642i != 0;
    }

    /* JADX INFO: renamed from: B */
    public final void m13188B(C10357a1 c10357a1) {
        int i10 = C6747k.f26587x7;
        if (!c10357a1.m39747s(i10)) {
            int i11 = C6747k.f26397c7;
            if (c10357a1.m39747s(i11)) {
                this.f10644k = C5050c.m23737b(getContext(), c10357a1, i11);
            }
            int i12 = C6747k.f26407d7;
            if (c10357a1.m39747s(i12)) {
                this.f10645l = C0146r.m454i(c10357a1.m39739k(i12, -1), null);
            }
        }
        int i13 = C6747k.f26377a7;
        if (c10357a1.m39747s(i13)) {
            m13207U(c10357a1.m39739k(i13, 0));
            int i14 = C6747k.f26349X6;
            if (c10357a1.m39747s(i14)) {
                m13203Q(c10357a1.m39744p(i14));
            }
            m13201O(c10357a1.m39729a(C6747k.f26340W6, true));
        } else if (c10357a1.m39747s(i10)) {
            int i15 = C6747k.f26596y7;
            if (c10357a1.m39747s(i15)) {
                this.f10644k = C5050c.m23737b(getContext(), c10357a1, i15);
            }
            int i16 = C6747k.f26605z7;
            if (c10357a1.m39747s(i16)) {
                this.f10645l = C0146r.m454i(c10357a1.m39739k(i16, -1), null);
            }
            m13207U(c10357a1.m39729a(i10, false) ? 1 : 0);
            m13203Q(c10357a1.m39744p(C6747k.f26569v7));
        }
        m13206T(c10357a1.m39734f(C6747k.f26367Z6, getResources().getDimensionPixelSize(C6740d.f25961c0)));
        int i17 = C6747k.f26387b7;
        if (c10357a1.m39747s(i17)) {
            m13210X(C7561s.m31253b(c10357a1.m39739k(i17, -1)));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m13189C(C10357a1 c10357a1) {
        int i10 = C6747k.f26452i7;
        if (c10357a1.m39747s(i10)) {
            this.f10637d = C5050c.m23737b(getContext(), c10357a1, i10);
        }
        int i11 = C6747k.f26461j7;
        if (c10357a1.m39747s(i11)) {
            this.f10638e = C0146r.m454i(c10357a1.m39739k(i11, -1), null);
        }
        int i12 = C6747k.f26443h7;
        if (c10357a1.m39747s(i12)) {
            m13215c0(c10357a1.m39735g(i12));
        }
        this.f10636c.setContentDescription(getResources().getText(C6745i.f26087f));
        C0625o0.m3060w0(this.f10636c, 2);
        this.f10636c.setClickable(false);
        this.f10636c.setPressable(false);
        this.f10636c.setFocusable(false);
    }

    /* JADX INFO: renamed from: D */
    public final void m13190D(C10357a1 c10357a1) {
        this.f10650q.setVisibility(8);
        this.f10650q.setId(C6742f.f26027U);
        this.f10650q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        C0625o0.m3044o0(this.f10650q, 1);
        m13240q0(c10357a1.m39742n(C6747k.f26269O7, 0));
        int i10 = C6747k.f26278P7;
        if (c10357a1.m39747s(i10)) {
            m13242r0(c10357a1.m39731c(i10));
        }
        m13238p0(c10357a1.m39744p(C6747k.f26260N7));
    }

    /* JADX INFO: renamed from: E */
    public boolean m13191E() {
        return m13187A() && this.f10640g.isChecked();
    }

    /* JADX INFO: renamed from: F */
    public boolean m13192F() {
        return this.f10635b.getVisibility() == 0 && this.f10640g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: G */
    public boolean m13193G() {
        return this.f10636c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: H */
    public void m13194H(boolean z10) {
        this.f10651r = z10;
        m13256y0();
    }

    /* JADX INFO: renamed from: I */
    public void m13195I() {
        m13252w0();
        m13197K();
        m13196J();
        if (m13231m().mo31248t()) {
            m13248u0(this.f10634a.m13135d0());
        }
    }

    /* JADX INFO: renamed from: J */
    public void m13196J() {
        C7561s.m31255d(this.f10634a, this.f10640g, this.f10644k);
    }

    /* JADX INFO: renamed from: K */
    public void m13197K() {
        C7561s.m31255d(this.f10634a, this.f10636c, this.f10637d);
    }

    /* JADX INFO: renamed from: L */
    public void m13198L(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        AbstractC7560r abstractC7560rM13231m = m13231m();
        boolean z12 = true;
        if (!abstractC7560rM13231m.mo31244l() || (zIsChecked = this.f10640g.isChecked()) == abstractC7560rM13231m.mo31245m()) {
            z11 = false;
        } else {
            this.f10640g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!abstractC7560rM13231m.mo31242j() || (zIsActivated = this.f10640g.isActivated()) == abstractC7560rM13231m.mo31243k()) {
            z12 = z11;
        } else {
            m13200N(!zIsActivated);
        }
        if (z10 || z12) {
            m13196J();
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m13199M() {
        AccessibilityManager accessibilityManager;
        C13004c.a aVar = this.f10654u;
        if (aVar == null || (accessibilityManager = this.f10653t) == null) {
            return;
        }
        C13004c.m48329b(accessibilityManager, aVar);
    }

    /* JADX INFO: renamed from: N */
    public void m13200N(boolean z10) {
        this.f10640g.setActivated(z10);
    }

    /* JADX INFO: renamed from: O */
    public void m13201O(boolean z10) {
        this.f10640g.setCheckable(z10);
    }

    /* JADX INFO: renamed from: P */
    public void m13202P(int i10) {
        m13203Q(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* JADX INFO: renamed from: Q */
    public void m13203Q(CharSequence charSequence) {
        if (m13229l() != charSequence) {
            this.f10640g.setContentDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m13204R(int i10) {
        m13205S(i10 != 0 ? C7399a.m30679b(getContext(), i10) : null);
    }

    /* JADX INFO: renamed from: S */
    public void m13205S(Drawable drawable) {
        this.f10640g.setImageDrawable(drawable);
        if (drawable != null) {
            C7561s.m31252a(this.f10634a, this.f10640g, this.f10644k, this.f10645l);
            m13196J();
        }
    }

    /* JADX INFO: renamed from: T */
    public void m13206T(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f10646m) {
            this.f10646m = i10;
            C7561s.m31258g(this.f10640g, i10);
            C7561s.m31258g(this.f10636c, i10);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m13207U(int i10) {
        if (this.f10642i == i10) {
            return;
        }
        m13246t0(m13231m());
        int i11 = this.f10642i;
        this.f10642i = i10;
        m13225j(i11);
        m13213a0(i10 != 0);
        AbstractC7560r abstractC7560rM13231m = m13231m();
        m13204R(m13245t(abstractC7560rM13231m));
        m13202P(abstractC7560rM13231m.mo31207c());
        m13201O(abstractC7560rM13231m.mo31244l());
        if (!abstractC7560rM13231m.mo31241i(this.f10634a.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f10634a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        m13244s0(abstractC7560rM13231m);
        m13208V(abstractC7560rM13231m.mo31210f());
        EditText editText = this.f10652s;
        if (editText != null) {
            abstractC7560rM13231m.mo31212n(editText);
            m13222h0(abstractC7560rM13231m);
        }
        C7561s.m31252a(this.f10634a, this.f10640g, this.f10644k, this.f10645l);
        m13198L(true);
    }

    /* JADX INFO: renamed from: V */
    public void m13208V(View.OnClickListener onClickListener) {
        C7561s.m31259h(this.f10640g, onClickListener, this.f10648o);
    }

    /* JADX INFO: renamed from: W */
    public void m13209W(View.OnLongClickListener onLongClickListener) {
        this.f10648o = onLongClickListener;
        C7561s.m31260i(this.f10640g, onLongClickListener);
    }

    /* JADX INFO: renamed from: X */
    public void m13210X(@NonNull ImageView.ScaleType scaleType) {
        this.f10647n = scaleType;
        C7561s.m31261j(this.f10640g, scaleType);
        C7561s.m31261j(this.f10636c, scaleType);
    }

    /* JADX INFO: renamed from: Y */
    public void m13211Y(ColorStateList colorStateList) {
        if (this.f10644k != colorStateList) {
            this.f10644k = colorStateList;
            C7561s.m31252a(this.f10634a, this.f10640g, colorStateList, this.f10645l);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m13212Z(PorterDuff.Mode mode) {
        if (this.f10645l != mode) {
            this.f10645l = mode;
            C7561s.m31252a(this.f10634a, this.f10640g, this.f10644k, mode);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m13213a0(boolean z10) {
        if (m13192F() != z10) {
            this.f10640g.setVisibility(z10 ? 0 : 8);
            m13250v0();
            m13254x0();
            this.f10634a.m13152o0();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m13214b0(int i10) {
        m13215c0(i10 != 0 ? C7399a.m30679b(getContext(), i10) : null);
        m13197K();
    }

    /* JADX INFO: renamed from: c0 */
    public void m13215c0(Drawable drawable) {
        this.f10636c.setImageDrawable(drawable);
        m13252w0();
        C7561s.m31252a(this.f10634a, this.f10636c, this.f10637d, this.f10638e);
    }

    /* JADX INFO: renamed from: d0 */
    public void m13216d0(View.OnClickListener onClickListener) {
        C7561s.m31259h(this.f10636c, onClickListener, this.f10639f);
    }

    /* JADX INFO: renamed from: e0 */
    public void m13217e0(View.OnLongClickListener onLongClickListener) {
        this.f10639f = onLongClickListener;
        C7561s.m31260i(this.f10636c, onLongClickListener);
    }

    /* JADX INFO: renamed from: f0 */
    public void m13218f0(ColorStateList colorStateList) {
        if (this.f10637d != colorStateList) {
            this.f10637d = colorStateList;
            C7561s.m31252a(this.f10634a, this.f10636c, colorStateList, this.f10638e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m13219g() {
        if (this.f10654u == null || this.f10653t == null || !C0625o0.m3005Q(this)) {
            return;
        }
        C13004c.m48328a(this.f10653t, this.f10654u);
    }

    /* JADX INFO: renamed from: g0 */
    public void m13220g0(PorterDuff.Mode mode) {
        if (this.f10638e != mode) {
            this.f10638e = mode;
            C7561s.m31252a(this.f10634a, this.f10636c, this.f10637d, mode);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m13221h() {
        this.f10640g.performClick();
        this.f10640g.jumpDrawablesToCurrentState();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m13222h0(AbstractC7560r abstractC7560r) {
        if (this.f10652s == null) {
            return;
        }
        if (abstractC7560r.mo31209e() != null) {
            this.f10652s.setOnFocusChangeListener(abstractC7560r.mo31209e());
        }
        if (abstractC7560r.mo31211g() != null) {
            this.f10640g.setOnFocusChangeListener(abstractC7560r.mo31211g());
        }
    }

    /* JADX INFO: renamed from: i */
    public final CheckableImageButton m13223i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C6744h.f26063e, viewGroup, false);
        checkableImageButton.setId(i10);
        C7561s.m31256e(checkableImageButton);
        if (C5050c.m23742g(getContext())) {
            C0622n.m2977d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: i0 */
    public void m13224i0(int i10) {
        m13226j0(i10 != 0 ? getResources().getText(i10) : null);
    }

    /* JADX INFO: renamed from: j */
    public final void m13225j(int i10) {
        Iterator<TextInputLayout.InterfaceC2861g> it = this.f10643j.iterator();
        while (it.hasNext()) {
            it.next().m13180a(this.f10634a, i10);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m13226j0(CharSequence charSequence) {
        this.f10640g.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: k */
    public CheckableImageButton m13227k() {
        if (m13193G()) {
            return this.f10636c;
        }
        if (m13187A() && m13192F()) {
            return this.f10640g;
        }
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public void m13228k0(int i10) {
        m13230l0(i10 != 0 ? C7399a.m30679b(getContext(), i10) : null);
    }

    /* JADX INFO: renamed from: l */
    public CharSequence m13229l() {
        return this.f10640g.getContentDescription();
    }

    /* JADX INFO: renamed from: l0 */
    public void m13230l0(Drawable drawable) {
        this.f10640g.setImageDrawable(drawable);
    }

    /* JADX INFO: renamed from: m */
    public AbstractC7560r m13231m() {
        return this.f10641h.m13260c(this.f10642i);
    }

    /* JADX INFO: renamed from: m0 */
    public void m13232m0(boolean z10) {
        if (z10 && this.f10642i != 1) {
            m13207U(1);
        } else {
            if (z10) {
                return;
            }
            m13207U(0);
        }
    }

    /* JADX INFO: renamed from: n */
    public Drawable m13233n() {
        return this.f10640g.getDrawable();
    }

    /* JADX INFO: renamed from: n0 */
    public void m13234n0(ColorStateList colorStateList) {
        this.f10644k = colorStateList;
        C7561s.m31252a(this.f10634a, this.f10640g, colorStateList, this.f10645l);
    }

    /* JADX INFO: renamed from: o */
    public int m13235o() {
        return this.f10646m;
    }

    /* JADX INFO: renamed from: o0 */
    public void m13236o0(PorterDuff.Mode mode) {
        this.f10645l = mode;
        C7561s.m31252a(this.f10634a, this.f10640g, this.f10644k, mode);
    }

    /* JADX INFO: renamed from: p */
    public int m13237p() {
        return this.f10642i;
    }

    /* JADX INFO: renamed from: p0 */
    public void m13238p0(CharSequence charSequence) {
        this.f10649p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f10650q.setText(charSequence);
        m13256y0();
    }

    @NonNull
    /* JADX INFO: renamed from: q */
    public ImageView.ScaleType m13239q() {
        return this.f10647n;
    }

    /* JADX INFO: renamed from: q0 */
    public void m13240q0(int i10) {
        C4431i.m22312s(this.f10650q, i10);
    }

    /* JADX INFO: renamed from: r */
    public CheckableImageButton m13241r() {
        return this.f10640g;
    }

    /* JADX INFO: renamed from: r0 */
    public void m13242r0(@NonNull ColorStateList colorStateList) {
        this.f10650q.setTextColor(colorStateList);
    }

    /* JADX INFO: renamed from: s */
    public Drawable m13243s() {
        return this.f10636c.getDrawable();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m13244s0(@NonNull AbstractC7560r abstractC7560r) {
        abstractC7560r.mo31214s();
        this.f10654u = abstractC7560r.mo31240h();
        m13219g();
    }

    /* JADX INFO: renamed from: t */
    public final int m13245t(AbstractC7560r abstractC7560r) {
        int i10 = this.f10641h.f10662c;
        return i10 == 0 ? abstractC7560r.mo31208d() : i10;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m13246t0(@NonNull AbstractC7560r abstractC7560r) {
        m13199M();
        this.f10654u = null;
        abstractC7560r.mo31215u();
    }

    /* JADX INFO: renamed from: u */
    public CharSequence m13247u() {
        return this.f10640g.getContentDescription();
    }

    /* JADX INFO: renamed from: u0 */
    public final void m13248u0(boolean z10) {
        if (!z10 || m13233n() == null) {
            C7561s.m31252a(this.f10634a, this.f10640g, this.f10644k, this.f10645l);
            return;
        }
        Drawable drawableMutate = C10425a.m40121r(m13233n()).mutate();
        C10425a.m40117n(drawableMutate, this.f10634a.getErrorCurrentTextColors());
        this.f10640g.setImageDrawable(drawableMutate);
    }

    /* JADX INFO: renamed from: v */
    public Drawable m13249v() {
        return this.f10640g.getDrawable();
    }

    /* JADX INFO: renamed from: v0 */
    public final void m13250v0() {
        this.f10635b.setVisibility((this.f10640g.getVisibility() != 0 || m13193G()) ? 8 : 0);
        setVisibility((m13192F() || m13193G() || ((this.f10649p == null || this.f10651r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: w */
    public CharSequence m13251w() {
        return this.f10649p;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m13252w0() {
        this.f10636c.setVisibility(m13243s() != null && this.f10634a.m13120N() && this.f10634a.m13135d0() ? 0 : 8);
        m13250v0();
        m13254x0();
        if (m13187A()) {
            return;
        }
        this.f10634a.m13152o0();
    }

    /* JADX INFO: renamed from: x */
    public ColorStateList m13253x() {
        return this.f10650q.getTextColors();
    }

    /* JADX INFO: renamed from: x0 */
    public void m13254x0() {
        if (this.f10634a.f10580d == null) {
            return;
        }
        C0625o0.m2981B0(this.f10650q, getContext().getResources().getDimensionPixelSize(C6740d.f25940K), this.f10634a.f10580d.getPaddingTop(), (m13192F() || m13193G()) ? 0 : C0625o0.m2984D(this.f10634a.f10580d), this.f10634a.f10580d.getPaddingBottom());
    }

    /* JADX INFO: renamed from: y */
    public int m13255y() {
        return C0625o0.m2984D(this) + C0625o0.m2984D(this.f10650q) + ((m13192F() || m13193G()) ? this.f10640g.getMeasuredWidth() + C0622n.m2975b((ViewGroup.MarginLayoutParams) this.f10640g.getLayoutParams()) : 0);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m13256y0() {
        int visibility = this.f10650q.getVisibility();
        int i10 = (this.f10649p == null || this.f10651r) ? 8 : 0;
        if (visibility != i10) {
            m13231m().mo31213q(i10 == 0);
        }
        m13250v0();
        this.f10650q.setVisibility(i10);
        this.f10634a.m13152o0();
    }

    /* JADX INFO: renamed from: z */
    public TextView m13257z() {
        return this.f10650q;
    }
}
