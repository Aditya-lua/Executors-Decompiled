package p357pc;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import androidx.core.view.GravityCompat;
import cd.C1627h;
import com.google.android.material.card.MaterialCardView;
import com.google.mlkit.common.MlKitException;
import p101ed.C5050c;
import p126fd.C5584b;
import p168hd.C6360d;
import p168hd.C6361e;
import p168hd.C6363g;
import p168hd.C6366j;
import p168hd.C6367k;
import p194ic.C6738b;
import p194ic.C6742f;
import p194ic.C6746j;
import p194ic.C6747k;
import p216jc.C7137a;
import p368q2.C10425a;
import p463uc.C11840a;

/* JADX INFO: renamed from: pc.b */
/* JADX INFO: loaded from: classes2.dex */
public class C10195b {

    /* JADX INFO: renamed from: A */
    public static final Drawable f36772A;

    /* JADX INFO: renamed from: z */
    public static final double f36773z = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    @NonNull
    public final MaterialCardView f36774a;

    /* JADX INFO: renamed from: c */
    @NonNull
    public final C6363g f36776c;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final C6363g f36777d;

    /* JADX INFO: renamed from: e */
    public int f36778e;

    /* JADX INFO: renamed from: f */
    public int f36779f;

    /* JADX INFO: renamed from: g */
    public int f36780g;

    /* JADX INFO: renamed from: h */
    public int f36781h;

    /* JADX INFO: renamed from: i */
    public Drawable f36782i;

    /* JADX INFO: renamed from: j */
    public Drawable f36783j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f36784k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f36785l;

    /* JADX INFO: renamed from: m */
    public C6367k f36786m;

    /* JADX INFO: renamed from: n */
    public ColorStateList f36787n;

    /* JADX INFO: renamed from: o */
    public Drawable f36788o;

    /* JADX INFO: renamed from: p */
    public LayerDrawable f36789p;

    /* JADX INFO: renamed from: q */
    public C6363g f36790q;

    /* JADX INFO: renamed from: r */
    public C6363g f36791r;

    /* JADX INFO: renamed from: t */
    public boolean f36793t;

    /* JADX INFO: renamed from: u */
    public ValueAnimator f36794u;

    /* JADX INFO: renamed from: v */
    public final TimeInterpolator f36795v;

    /* JADX INFO: renamed from: w */
    public final int f36796w;

    /* JADX INFO: renamed from: x */
    public final int f36797x;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final Rect f36775b = new Rect();

    /* JADX INFO: renamed from: s */
    public boolean f36792s = false;

    /* JADX INFO: renamed from: y */
    public float f36798y = 0.0f;

    /* JADX INFO: renamed from: pc.b$a */
    public class a extends InsetDrawable {
        public a(Drawable drawable, int i10, int i11, int i12, int i13) {
            super(drawable, i10, i11, i12, i13);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f36772A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public C10195b(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f36774a = materialCardView;
        C6363g c6363g = new C6363g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f36776c = c6363g;
        c6363g.m27710Q(materialCardView.getContext());
        c6363g.m27725f0(-12303292);
        C6367k.b bVarM27783v = c6363g.m27698E().m27783v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, C6747k.f26454j0, i10, C6746j.f26109a);
        int i12 = C6747k.f26463k0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            bVarM27783v.m27807o(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f36777d = new C6363g();
        m39232Y(bVarM27783v.m27806m());
        this.f36795v = C1627h.m8224g(materialCardView.getContext(), C6738b.f25875Q, C7137a.f27784a);
        this.f36796w = C1627h.m8223f(materialCardView.getContext(), C6738b.f25869K, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f36797x = C1627h.m8223f(materialCardView.getContext(), C6738b.f25868J, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m39207a(C10195b c10195b, ValueAnimator valueAnimator) {
        c10195b.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c10195b.f36783j.setAlpha((int) (255.0f * fFloatValue));
        c10195b.f36798y = fFloatValue;
    }

    /* JADX INFO: renamed from: A */
    public ColorStateList m39208A() {
        return this.f36787n;
    }

    /* JADX INFO: renamed from: B */
    public int m39209B() {
        return this.f36781h;
    }

    @NonNull
    /* JADX INFO: renamed from: C */
    public Rect m39210C() {
        return this.f36775b;
    }

    @NonNull
    /* JADX INFO: renamed from: D */
    public final Drawable m39211D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f36774a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(m39243f());
            iCeil = (int) Math.ceil(m39241e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    /* JADX INFO: renamed from: E */
    public boolean m39212E() {
        return this.f36792s;
    }

    /* JADX INFO: renamed from: F */
    public boolean m39213F() {
        return this.f36793t;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m39214G() {
        return (this.f36780g & 80) == 80;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m39215H() {
        return (this.f36780g & GravityCompat.END) == 8388613;
    }

    /* JADX INFO: renamed from: I */
    public void m39216I(@NonNull TypedArray typedArray) {
        ColorStateList colorStateListM23736a = C5050c.m23736a(this.f36774a.getContext(), typedArray, C6747k.f26220J3);
        this.f36787n = colorStateListM23736a;
        if (colorStateListM23736a == null) {
            this.f36787n = ColorStateList.valueOf(-1);
        }
        this.f36781h = typedArray.getDimensionPixelSize(C6747k.f26229K3, 0);
        boolean z10 = typedArray.getBoolean(C6747k.f26148B3, false);
        this.f36793t = z10;
        this.f36774a.setLongClickable(z10);
        this.f36785l = C5050c.m23736a(this.f36774a.getContext(), typedArray, C6747k.f26202H3);
        m39224Q(C5050c.m23739d(this.f36774a.getContext(), typedArray, C6747k.f26166D3));
        m39227T(typedArray.getDimensionPixelSize(C6747k.f26193G3, 0));
        m39226S(typedArray.getDimensionPixelSize(C6747k.f26184F3, 0));
        this.f36780g = typedArray.getInteger(C6747k.f26175E3, 8388661);
        ColorStateList colorStateListM23736a2 = C5050c.m23736a(this.f36774a.getContext(), typedArray, C6747k.f26211I3);
        this.f36784k = colorStateListM23736a2;
        if (colorStateListM23736a2 == null) {
            this.f36784k = ColorStateList.valueOf(C11840a.m44228d(this.f36774a, C6738b.f25899h));
        }
        m39220M(C5050c.m23736a(this.f36774a.getContext(), typedArray, C6747k.f26157C3));
        m39254k0();
        m39248h0();
        m39256l0();
        this.f36774a.setBackgroundInternal(m39211D(this.f36776c));
        Drawable drawableM39264t = m39242e0() ? m39264t() : this.f36777d;
        this.f36782i = drawableM39264t;
        this.f36774a.setForeground(m39211D(drawableM39264t));
    }

    /* JADX INFO: renamed from: J */
    public void m39217J(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f36789p != null) {
            if (this.f36774a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(m39243f() * 2.0f);
                iCeil2 = (int) Math.ceil(m39241e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = m39215H() ? ((i10 - this.f36778e) - this.f36779f) - iCeil2 : this.f36778e;
            int i15 = m39214G() ? this.f36778e : ((i11 - this.f36778e) - this.f36779f) - iCeil;
            int i16 = m39215H() ? this.f36778e : ((i10 - this.f36778e) - this.f36779f) - iCeil2;
            int i17 = m39214G() ? ((i11 - this.f36778e) - this.f36779f) - iCeil : this.f36778e;
            if (C0625o0.m3065z(this.f36774a) == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f36789p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m39218K(boolean z10) {
        this.f36792s = z10;
    }

    /* JADX INFO: renamed from: L */
    public void m39219L(ColorStateList colorStateList) {
        this.f36776c.m27719a0(colorStateList);
    }

    /* JADX INFO: renamed from: M */
    public void m39220M(ColorStateList colorStateList) {
        C6363g c6363g = this.f36777d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        c6363g.m27719a0(colorStateList);
    }

    /* JADX INFO: renamed from: N */
    public void m39221N(boolean z10) {
        this.f36793t = z10;
    }

    /* JADX INFO: renamed from: O */
    public void m39222O(boolean z10) {
        m39223P(z10, false);
    }

    /* JADX INFO: renamed from: P */
    public void m39223P(boolean z10, boolean z11) {
        Drawable drawable = this.f36783j;
        if (drawable != null) {
            if (z11) {
                m39235b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f36798y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m39224Q(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = C10425a.m40121r(drawable).mutate();
            this.f36783j = drawableMutate;
            C10425a.m40118o(drawableMutate, this.f36785l);
            m39222O(this.f36774a.isChecked());
        } else {
            this.f36783j = f36772A;
        }
        LayerDrawable layerDrawable = this.f36789p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(C6742f.f26010D, this.f36783j);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m39225R(int i10) {
        this.f36780g = i10;
        m39217J(this.f36774a.getMeasuredWidth(), this.f36774a.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: S */
    public void m39226S(int i10) {
        this.f36778e = i10;
    }

    /* JADX INFO: renamed from: T */
    public void m39227T(int i10) {
        this.f36779f = i10;
    }

    /* JADX INFO: renamed from: U */
    public void m39228U(ColorStateList colorStateList) {
        this.f36785l = colorStateList;
        Drawable drawable = this.f36783j;
        if (drawable != null) {
            C10425a.m40118o(drawable, colorStateList);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m39229V(float f10) {
        m39232Y(this.f36786m.m27784w(f10));
        this.f36782i.invalidateSelf();
        if (m39240d0() || m39238c0()) {
            m39246g0();
        }
        if (m39240d0()) {
            m39252j0();
        }
    }

    /* JADX INFO: renamed from: W */
    public void m39230W(float f10) {
        this.f36776c.m27720b0(f10);
        C6363g c6363g = this.f36777d;
        if (c6363g != null) {
            c6363g.m27720b0(f10);
        }
        C6363g c6363g2 = this.f36791r;
        if (c6363g2 != null) {
            c6363g2.m27720b0(f10);
        }
    }

    /* JADX INFO: renamed from: X */
    public void m39231X(ColorStateList colorStateList) {
        this.f36784k = colorStateList;
        m39254k0();
    }

    /* JADX INFO: renamed from: Y */
    public void m39232Y(@NonNull C6367k c6367k) {
        this.f36786m = c6367k;
        this.f36776c.setShapeAppearanceModel(c6367k);
        C6363g c6363g = this.f36776c;
        c6363g.m27723e0(!c6363g.m27713T());
        C6363g c6363g2 = this.f36777d;
        if (c6363g2 != null) {
            c6363g2.setShapeAppearanceModel(c6367k);
        }
        C6363g c6363g3 = this.f36791r;
        if (c6363g3 != null) {
            c6363g3.setShapeAppearanceModel(c6367k);
        }
        C6363g c6363g4 = this.f36790q;
        if (c6363g4 != null) {
            c6363g4.setShapeAppearanceModel(c6367k);
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m39233Z(ColorStateList colorStateList) {
        if (this.f36787n == colorStateList) {
            return;
        }
        this.f36787n = colorStateList;
        m39256l0();
    }

    /* JADX INFO: renamed from: a0 */
    public void m39234a0(int i10) {
        if (i10 == this.f36781h) {
            return;
        }
        this.f36781h = i10;
        m39256l0();
    }

    /* JADX INFO: renamed from: b */
    public void m39235b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f36798y : this.f36798y;
        ValueAnimator valueAnimator = this.f36794u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f36794u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f36798y, f10);
        this.f36794u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pc.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C10195b.m39207a(this.f36771a, valueAnimator2);
            }
        });
        this.f36794u.setInterpolator(this.f36795v);
        this.f36794u.setDuration((long) ((z10 ? this.f36796w : this.f36797x) * f11));
        this.f36794u.start();
    }

    /* JADX INFO: renamed from: b0 */
    public void m39236b0(int i10, int i11, int i12, int i13) {
        this.f36775b.set(i10, i11, i12, i13);
        m39246g0();
    }

    /* JADX INFO: renamed from: c */
    public final float m39237c() {
        return Math.max(Math.max(m39239d(this.f36786m.m27778q(), this.f36776c.m27703J()), m39239d(this.f36786m.m27780s(), this.f36776c.m27704K())), Math.max(m39239d(this.f36786m.m27773k(), this.f36776c.m27745t()), m39239d(this.f36786m.m27771i(), this.f36776c.m27744s())));
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m39238c0() {
        return this.f36774a.getPreventCornerOverlap() && !m39245g();
    }

    /* JADX INFO: renamed from: d */
    public final float m39239d(C6360d c6360d, float f10) {
        if (c6360d instanceof C6366j) {
            return (float) ((1.0d - f36773z) * ((double) f10));
        }
        if (c6360d instanceof C6361e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m39240d0() {
        return this.f36774a.getPreventCornerOverlap() && m39245g() && this.f36774a.getUseCompatPadding();
    }

    /* JADX INFO: renamed from: e */
    public final float m39241e() {
        return this.f36774a.getMaxCardElevation() + (m39240d0() ? m39237c() : 0.0f);
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m39242e0() {
        if (this.f36774a.isClickable()) {
            return true;
        }
        View view = this.f36774a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    /* JADX INFO: renamed from: f */
    public final float m39243f() {
        return (this.f36774a.getMaxCardElevation() * 1.5f) + (m39240d0() ? m39237c() : 0.0f);
    }

    /* JADX INFO: renamed from: f0 */
    public void m39244f0() {
        Drawable drawable = this.f36782i;
        Drawable drawableM39264t = m39242e0() ? m39264t() : this.f36777d;
        this.f36782i = drawableM39264t;
        if (drawable != drawableM39264t) {
            m39250i0(drawableM39264t);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m39245g() {
        return this.f36776c.m27713T();
    }

    /* JADX INFO: renamed from: g0 */
    public void m39246g0() {
        int iM39237c = (int) (((m39238c0() || m39240d0()) ? m39237c() : 0.0f) - m39266v());
        MaterialCardView materialCardView = this.f36774a;
        Rect rect = this.f36775b;
        materialCardView.m12241i(rect.left + iM39237c, rect.top + iM39237c, rect.right + iM39237c, rect.bottom + iM39237c);
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public final Drawable m39247h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        C6363g c6363gM39251j = m39251j();
        this.f36790q = c6363gM39251j;
        c6363gM39251j.m27719a0(this.f36784k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f36790q);
        return stateListDrawable;
    }

    /* JADX INFO: renamed from: h0 */
    public void m39248h0() {
        this.f36776c.m27718Z(this.f36774a.getCardElevation());
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public final Drawable m39249i() {
        if (!C5584b.f21377a) {
            return m39247h();
        }
        this.f36791r = m39251j();
        return new RippleDrawable(this.f36784k, null, this.f36791r);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m39250i0(Drawable drawable) {
        if (this.f36774a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f36774a.getForeground()).setDrawable(drawable);
        } else {
            this.f36774a.setForeground(m39211D(drawable));
        }
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public final C6363g m39251j() {
        return new C6363g(this.f36786m);
    }

    /* JADX INFO: renamed from: j0 */
    public void m39252j0() {
        if (!m39212E()) {
            this.f36774a.setBackgroundInternal(m39211D(this.f36776c));
        }
        this.f36774a.setForeground(m39211D(this.f36782i));
    }

    /* JADX INFO: renamed from: k */
    public void m39253k() {
        Drawable drawable = this.f36788o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f36788o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f36788o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m39254k0() {
        Drawable drawable;
        if (C5584b.f21377a && (drawable = this.f36788o) != null) {
            ((RippleDrawable) drawable).setColor(this.f36784k);
            return;
        }
        C6363g c6363g = this.f36790q;
        if (c6363g != null) {
            c6363g.m27719a0(this.f36784k);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: l */
    public C6363g m39255l() {
        return this.f36776c;
    }

    /* JADX INFO: renamed from: l0 */
    public void m39256l0() {
        this.f36777d.m27729h0(this.f36781h, this.f36787n);
    }

    /* JADX INFO: renamed from: m */
    public ColorStateList m39257m() {
        return this.f36776c.m27749x();
    }

    /* JADX INFO: renamed from: n */
    public ColorStateList m39258n() {
        return this.f36777d.m27749x();
    }

    /* JADX INFO: renamed from: o */
    public Drawable m39259o() {
        return this.f36783j;
    }

    /* JADX INFO: renamed from: p */
    public int m39260p() {
        return this.f36780g;
    }

    /* JADX INFO: renamed from: q */
    public int m39261q() {
        return this.f36778e;
    }

    /* JADX INFO: renamed from: r */
    public int m39262r() {
        return this.f36779f;
    }

    /* JADX INFO: renamed from: s */
    public ColorStateList m39263s() {
        return this.f36785l;
    }

    @NonNull
    /* JADX INFO: renamed from: t */
    public final Drawable m39264t() {
        if (this.f36788o == null) {
            this.f36788o = m39249i();
        }
        if (this.f36789p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f36788o, this.f36777d, this.f36783j});
            this.f36789p = layerDrawable;
            layerDrawable.setId(2, C6742f.f26010D);
        }
        return this.f36789p;
    }

    /* JADX INFO: renamed from: u */
    public float m39265u() {
        return this.f36776c.m27703J();
    }

    /* JADX INFO: renamed from: v */
    public final float m39266v() {
        if (this.f36774a.getPreventCornerOverlap() && this.f36774a.getUseCompatPadding()) {
            return (float) ((1.0d - f36773z) * ((double) this.f36774a.getCardViewRadius()));
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public float m39267w() {
        return this.f36776c.m27750y();
    }

    /* JADX INFO: renamed from: x */
    public ColorStateList m39268x() {
        return this.f36784k;
    }

    /* JADX INFO: renamed from: y */
    public C6367k m39269y() {
        return this.f36786m;
    }

    /* JADX INFO: renamed from: z */
    public int m39270z() {
        ColorStateList colorStateList = this.f36787n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
