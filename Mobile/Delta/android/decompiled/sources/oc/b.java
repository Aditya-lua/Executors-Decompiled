package oc;

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
import androidx.core.view.o0;
import bd.h;
import com.google.android.material.card.MaterialCardView;
import com.google.mlkit.common.MlKitException;
import dd.c;
import gd.d;
import gd.e;
import gd.g;
import gd.k;
import hc.f;
import hc.j;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static final Drawable A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final double f27297z = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f27298a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final g f27299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final g f27300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f27305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f27306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f27307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f27308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f27309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f27310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f27311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f27312p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f27313q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f27314r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f27316t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ValueAnimator f27317u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f27318v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f27319w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f27320x;

    @NonNull
    public final Rect b = new Rect();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f27315s = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f27321y = 0.0f;

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
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i10, int i11) {
        this.f27298a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f27299c = gVar;
        gVar.Q(materialCardView.getContext());
        gVar.f0(-12303292);
        k.b bVarV = gVar.E().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, hc.k.f19040j0, i10, j.f18931a);
        int i12 = hc.k.f19049k0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f27300d = new g();
        Y(bVarV.m());
        this.f27318v = h.g(materialCardView.getContext(), hc.b.Q, ic.a.f20471a);
        this.f27319w = h.f(materialCardView.getContext(), hc.b.K, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f27320x = h.f(materialCardView.getContext(), hc.b.J, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f27306j.setAlpha((int) (255.0f * fFloatValue));
        bVar.f27321y = fFloatValue;
    }

    public ColorStateList A() {
        return this.f27310n;
    }

    public int B() {
        return this.f27304h;
    }

    @NonNull
    public Rect C() {
        return this.b;
    }

    @NonNull
    public final Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f27298a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public boolean E() {
        return this.f27315s;
    }

    public boolean F() {
        return this.f27316t;
    }

    public final boolean G() {
        return (this.f27303g & 80) == 80;
    }

    public final boolean H() {
        return (this.f27303g & 8388613) == 8388613;
    }

    public void I(@NonNull TypedArray typedArray) {
        ColorStateList colorStateListA = c.a(this.f27298a.getContext(), typedArray, hc.k.J3);
        this.f27310n = colorStateListA;
        if (colorStateListA == null) {
            this.f27310n = ColorStateList.valueOf(-1);
        }
        this.f27304h = typedArray.getDimensionPixelSize(hc.k.K3, 0);
        boolean z10 = typedArray.getBoolean(hc.k.B3, false);
        this.f27316t = z10;
        this.f27298a.setLongClickable(z10);
        this.f27308l = c.a(this.f27298a.getContext(), typedArray, hc.k.H3);
        Q(c.d(this.f27298a.getContext(), typedArray, hc.k.D3));
        T(typedArray.getDimensionPixelSize(hc.k.G3, 0));
        S(typedArray.getDimensionPixelSize(hc.k.F3, 0));
        this.f27303g = typedArray.getInteger(hc.k.E3, 8388661);
        ColorStateList colorStateListA2 = c.a(this.f27298a.getContext(), typedArray, hc.k.I3);
        this.f27307k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f27307k = ColorStateList.valueOf(tc.a.d(this.f27298a, hc.b.f18781h));
        }
        M(c.a(this.f27298a.getContext(), typedArray, hc.k.C3));
        k0();
        h0();
        l0();
        this.f27298a.setBackgroundInternal(D(this.f27299c));
        Drawable drawableT = e0() ? t() : this.f27300d;
        this.f27305i = drawableT;
        this.f27298a.setForeground(D(drawableT));
    }

    public void J(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f27312p != null) {
            if (this.f27298a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = H() ? ((i10 - this.f27301e) - this.f27302f) - iCeil2 : this.f27301e;
            int i15 = G() ? this.f27301e : ((i11 - this.f27301e) - this.f27302f) - iCeil;
            int i16 = H() ? this.f27301e : ((i10 - this.f27301e) - this.f27302f) - iCeil2;
            int i17 = G() ? ((i11 - this.f27301e) - this.f27302f) - iCeil : this.f27301e;
            if (o0.z(this.f27298a) == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f27312p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    public void K(boolean z10) {
        this.f27315s = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.f27299c.a0(colorStateList);
    }

    public void M(ColorStateList colorStateList) {
        g gVar = this.f27300d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.a0(colorStateList);
    }

    public void N(boolean z10) {
        this.f27316t = z10;
    }

    public void O(boolean z10) {
        P(z10, false);
    }

    public void P(boolean z10, boolean z11) {
        Drawable drawable = this.f27306j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f27321y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    public void Q(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = q2.a.r(drawable).mutate();
            this.f27306j = drawableMutate;
            q2.a.o(drawableMutate, this.f27308l);
            O(this.f27298a.isChecked());
        } else {
            this.f27306j = A;
        }
        LayerDrawable layerDrawable = this.f27312p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.D, this.f27306j);
        }
    }

    public void R(int i10) {
        this.f27303g = i10;
        J(this.f27298a.getMeasuredWidth(), this.f27298a.getMeasuredHeight());
    }

    public void S(int i10) {
        this.f27301e = i10;
    }

    public void T(int i10) {
        this.f27302f = i10;
    }

    public void U(ColorStateList colorStateList) {
        this.f27308l = colorStateList;
        Drawable drawable = this.f27306j;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
        }
    }

    public void V(float f10) {
        Y(this.f27309m.w(f10));
        this.f27305i.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    public void W(float f10) {
        this.f27299c.b0(f10);
        g gVar = this.f27300d;
        if (gVar != null) {
            gVar.b0(f10);
        }
        g gVar2 = this.f27314r;
        if (gVar2 != null) {
            gVar2.b0(f10);
        }
    }

    public void X(ColorStateList colorStateList) {
        this.f27307k = colorStateList;
        k0();
    }

    public void Y(@NonNull k kVar) {
        this.f27309m = kVar;
        this.f27299c.setShapeAppearanceModel(kVar);
        g gVar = this.f27299c;
        gVar.e0(!gVar.T());
        g gVar2 = this.f27300d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f27314r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        g gVar4 = this.f27313q;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f27310n == colorStateList) {
            return;
        }
        this.f27310n = colorStateList;
        l0();
    }

    public void a0(int i10) {
        if (i10 == this.f27304h) {
            return;
        }
        this.f27304h = i10;
        l0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f27321y : this.f27321y;
        ValueAnimator valueAnimator = this.f27317u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f27317u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f27321y, f10);
        this.f27317u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oc.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(this.f27296a, valueAnimator2);
            }
        });
        this.f27317u.setInterpolator(this.f27318v);
        this.f27317u.setDuration((long) ((z10 ? this.f27319w : this.f27320x) * f11));
        this.f27317u.start();
    }

    public void b0(int i10, int i11, int i12, int i13) {
        this.b.set(i10, i11, i12, i13);
        g0();
    }

    public final float c() {
        return Math.max(Math.max(d(this.f27309m.q(), this.f27299c.J()), d(this.f27309m.s(), this.f27299c.K())), Math.max(d(this.f27309m.k(), this.f27299c.t()), d(this.f27309m.i(), this.f27299c.s())));
    }

    public final boolean c0() {
        return this.f27298a.getPreventCornerOverlap() && !g();
    }

    public final float d(d dVar, float f10) {
        if (dVar instanceof gd.j) {
            return (float) ((1.0d - f27297z) * ((double) f10));
        }
        if (dVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final boolean d0() {
        return this.f27298a.getPreventCornerOverlap() && g() && this.f27298a.getUseCompatPadding();
    }

    public final float e() {
        return this.f27298a.getMaxCardElevation() + (d0() ? c() : 0.0f);
    }

    public final boolean e0() {
        if (this.f27298a.isClickable()) {
            return true;
        }
        View view = this.f27298a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final float f() {
        return (this.f27298a.getMaxCardElevation() * 1.5f) + (d0() ? c() : 0.0f);
    }

    public void f0() {
        Drawable drawable = this.f27305i;
        Drawable drawableT = e0() ? t() : this.f27300d;
        this.f27305i = drawableT;
        if (drawable != drawableT) {
            i0(drawableT);
        }
    }

    public final boolean g() {
        return this.f27299c.T();
    }

    public void g0() {
        int iC = (int) (((c0() || d0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f27298a;
        Rect rect = this.b;
        materialCardView.i(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    @NonNull
    public final Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g gVarJ = j();
        this.f27313q = gVarJ;
        gVarJ.a0(this.f27307k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f27313q);
        return stateListDrawable;
    }

    public void h0() {
        this.f27299c.Z(this.f27298a.getCardElevation());
    }

    @NonNull
    public final Drawable i() {
        if (!ed.b.f15434a) {
            return h();
        }
        this.f27314r = j();
        return new RippleDrawable(this.f27307k, null, this.f27314r);
    }

    public final void i0(Drawable drawable) {
        if (this.f27298a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f27298a.getForeground()).setDrawable(drawable);
        } else {
            this.f27298a.setForeground(D(drawable));
        }
    }

    @NonNull
    public final g j() {
        return new g(this.f27309m);
    }

    public void j0() {
        if (!E()) {
            this.f27298a.setBackgroundInternal(D(this.f27299c));
        }
        this.f27298a.setForeground(D(this.f27305i));
    }

    public void k() {
        Drawable drawable = this.f27311o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f27311o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f27311o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    public final void k0() {
        Drawable drawable;
        if (ed.b.f15434a && (drawable = this.f27311o) != null) {
            ((RippleDrawable) drawable).setColor(this.f27307k);
            return;
        }
        g gVar = this.f27313q;
        if (gVar != null) {
            gVar.a0(this.f27307k);
        }
    }

    @NonNull
    public g l() {
        return this.f27299c;
    }

    public void l0() {
        this.f27300d.h0(this.f27304h, this.f27310n);
    }

    public ColorStateList m() {
        return this.f27299c.x();
    }

    public ColorStateList n() {
        return this.f27300d.x();
    }

    public Drawable o() {
        return this.f27306j;
    }

    public int p() {
        return this.f27303g;
    }

    public int q() {
        return this.f27301e;
    }

    public int r() {
        return this.f27302f;
    }

    public ColorStateList s() {
        return this.f27308l;
    }

    @NonNull
    public final Drawable t() {
        if (this.f27311o == null) {
            this.f27311o = i();
        }
        if (this.f27312p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f27311o, this.f27300d, this.f27306j});
            this.f27312p = layerDrawable;
            layerDrawable.setId(2, f.D);
        }
        return this.f27312p;
    }

    public float u() {
        return this.f27299c.J();
    }

    public final float v() {
        if (this.f27298a.getPreventCornerOverlap() && this.f27298a.getUseCompatPadding()) {
            return (float) ((1.0d - f27297z) * ((double) this.f27298a.getCardViewRadius()));
        }
        return 0.0f;
    }

    public float w() {
        return this.f27299c.y();
    }

    public ColorStateList x() {
        return this.f27307k;
    }

    public k y() {
        return this.f27309m;
    }

    public int z() {
        ColorStateList colorStateList = this.f27310n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
