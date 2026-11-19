package qc;

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
import com.google.android.material.card.MaterialCardView;
import com.google.mlkit.common.MlKitException;
import dd.h;
import fd.c;
import id.d;
import id.e;
import id.g;
import id.k;
import jc.f;
import jc.j;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static final Drawable A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final double f29966z = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f29967a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final g f29968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final g f29969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29971f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f29972g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29973h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f29974i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f29975j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f29976k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f29977l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f29978m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f29979n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f29980o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f29981p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f29982q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f29983r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f29985t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ValueAnimator f29986u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f29987v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f29988w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f29989x;

    @NonNull
    public final Rect b = new Rect();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f29984s = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f29990y = 0.0f;

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
        this.f29967a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f29968c = gVar;
        gVar.Q(materialCardView.getContext());
        gVar.f0(-12303292);
        k.b bVarV = gVar.E().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, jc.k.f20550j0, i10, j.f20441a);
        if (typedArrayObtainStyledAttributes.hasValue(jc.k.f20559k0)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(jc.k.f20559k0, 0.0f));
        }
        this.f29969d = new g();
        Y(bVarV.m());
        this.f29987v = h.g(materialCardView.getContext(), jc.b.Q, kc.a.f21325a);
        this.f29988w = h.f(materialCardView.getContext(), jc.b.K, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f29989x = h.f(materialCardView.getContext(), jc.b.J, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f29975j.setAlpha((int) (255.0f * fFloatValue));
        bVar.f29990y = fFloatValue;
    }

    public ColorStateList A() {
        return this.f29979n;
    }

    public int B() {
        return this.f29973h;
    }

    @NonNull
    public Rect C() {
        return this.b;
    }

    @NonNull
    public final Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f29967a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public boolean E() {
        return this.f29984s;
    }

    public boolean F() {
        return this.f29985t;
    }

    public final boolean G() {
        return (this.f29972g & 80) == 80;
    }

    public final boolean H() {
        return (this.f29972g & 8388613) == 8388613;
    }

    public void I(@NonNull TypedArray typedArray) {
        ColorStateList colorStateListA = c.a(this.f29967a.getContext(), typedArray, jc.k.J3);
        this.f29979n = colorStateListA;
        if (colorStateListA == null) {
            this.f29979n = ColorStateList.valueOf(-1);
        }
        this.f29973h = typedArray.getDimensionPixelSize(jc.k.K3, 0);
        boolean z10 = typedArray.getBoolean(jc.k.B3, false);
        this.f29985t = z10;
        this.f29967a.setLongClickable(z10);
        this.f29977l = c.a(this.f29967a.getContext(), typedArray, jc.k.H3);
        Q(c.d(this.f29967a.getContext(), typedArray, jc.k.D3));
        T(typedArray.getDimensionPixelSize(jc.k.G3, 0));
        S(typedArray.getDimensionPixelSize(jc.k.F3, 0));
        this.f29972g = typedArray.getInteger(jc.k.E3, 8388661);
        ColorStateList colorStateListA2 = c.a(this.f29967a.getContext(), typedArray, jc.k.I3);
        this.f29976k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f29976k = ColorStateList.valueOf(vc.a.d(this.f29967a, jc.b.f20291h));
        }
        M(c.a(this.f29967a.getContext(), typedArray, jc.k.C3));
        k0();
        h0();
        l0();
        this.f29967a.setBackgroundInternal(D(this.f29968c));
        Drawable drawableT = e0() ? t() : this.f29969d;
        this.f29974i = drawableT;
        this.f29967a.setForeground(D(drawableT));
    }

    public void J(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f29981p != null) {
            if (this.f29967a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = H() ? ((i10 - this.f29970e) - this.f29971f) - iCeil2 : this.f29970e;
            int i15 = G() ? this.f29970e : ((i11 - this.f29970e) - this.f29971f) - iCeil;
            int i16 = H() ? this.f29970e : ((i10 - this.f29970e) - this.f29971f) - iCeil2;
            int i17 = G() ? ((i11 - this.f29970e) - this.f29971f) - iCeil : this.f29970e;
            if (o0.z(this.f29967a) == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f29981p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    public void K(boolean z10) {
        this.f29984s = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.f29968c.a0(colorStateList);
    }

    public void M(ColorStateList colorStateList) {
        g gVar = this.f29969d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.a0(colorStateList);
    }

    public void N(boolean z10) {
        this.f29985t = z10;
    }

    public void O(boolean z10) {
        P(z10, false);
    }

    public void P(boolean z10, boolean z11) {
        Drawable drawable = this.f29975j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f29990y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    public void Q(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = q2.a.r(drawable).mutate();
            this.f29975j = drawableMutate;
            q2.a.o(drawableMutate, this.f29977l);
            O(this.f29967a.isChecked());
        } else {
            this.f29975j = A;
        }
        LayerDrawable layerDrawable = this.f29981p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.D, this.f29975j);
        }
    }

    public void R(int i10) {
        this.f29972g = i10;
        J(this.f29967a.getMeasuredWidth(), this.f29967a.getMeasuredHeight());
    }

    public void S(int i10) {
        this.f29970e = i10;
    }

    public void T(int i10) {
        this.f29971f = i10;
    }

    public void U(ColorStateList colorStateList) {
        this.f29977l = colorStateList;
        Drawable drawable = this.f29975j;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
        }
    }

    public void V(float f10) {
        Y(this.f29978m.w(f10));
        this.f29974i.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    public void W(float f10) {
        this.f29968c.b0(f10);
        g gVar = this.f29969d;
        if (gVar != null) {
            gVar.b0(f10);
        }
        g gVar2 = this.f29983r;
        if (gVar2 != null) {
            gVar2.b0(f10);
        }
    }

    public void X(ColorStateList colorStateList) {
        this.f29976k = colorStateList;
        k0();
    }

    public void Y(@NonNull k kVar) {
        this.f29978m = kVar;
        this.f29968c.setShapeAppearanceModel(kVar);
        g gVar = this.f29968c;
        gVar.e0(!gVar.T());
        g gVar2 = this.f29969d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f29983r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        g gVar4 = this.f29982q;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f29979n == colorStateList) {
            return;
        }
        this.f29979n = colorStateList;
        l0();
    }

    public void a0(int i10) {
        if (i10 == this.f29973h) {
            return;
        }
        this.f29973h = i10;
        l0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f29990y : this.f29990y;
        ValueAnimator valueAnimator = this.f29986u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f29986u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f29990y, f10);
        this.f29986u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qc.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(this.f29965a, valueAnimator2);
            }
        });
        this.f29986u.setInterpolator(this.f29987v);
        this.f29986u.setDuration((long) ((z10 ? this.f29988w : this.f29989x) * f11));
        this.f29986u.start();
    }

    public void b0(int i10, int i11, int i12, int i13) {
        this.b.set(i10, i11, i12, i13);
        g0();
    }

    public final float c() {
        return Math.max(Math.max(d(this.f29978m.q(), this.f29968c.J()), d(this.f29978m.s(), this.f29968c.K())), Math.max(d(this.f29978m.k(), this.f29968c.t()), d(this.f29978m.i(), this.f29968c.s())));
    }

    public final boolean c0() {
        return this.f29967a.getPreventCornerOverlap() && !g();
    }

    public final float d(d dVar, float f10) {
        if (dVar instanceof id.j) {
            return (float) ((1.0d - f29966z) * ((double) f10));
        }
        if (dVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final boolean d0() {
        return this.f29967a.getPreventCornerOverlap() && g() && this.f29967a.getUseCompatPadding();
    }

    public final float e() {
        return this.f29967a.getMaxCardElevation() + (d0() ? c() : 0.0f);
    }

    public final boolean e0() {
        if (this.f29967a.isClickable()) {
            return true;
        }
        View view = this.f29967a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final float f() {
        return (this.f29967a.getMaxCardElevation() * 1.5f) + (d0() ? c() : 0.0f);
    }

    public void f0() {
        Drawable drawable = this.f29974i;
        Drawable drawableT = e0() ? t() : this.f29969d;
        this.f29974i = drawableT;
        if (drawable != drawableT) {
            i0(drawableT);
        }
    }

    public final boolean g() {
        return this.f29968c.T();
    }

    public void g0() {
        int iC = (int) (((c0() || d0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f29967a;
        Rect rect = this.b;
        materialCardView.i(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    @NonNull
    public final Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g gVarJ = j();
        this.f29982q = gVarJ;
        gVarJ.a0(this.f29976k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f29982q);
        return stateListDrawable;
    }

    public void h0() {
        this.f29968c.Z(this.f29967a.getCardElevation());
    }

    @NonNull
    public final Drawable i() {
        if (!gd.b.f17685a) {
            return h();
        }
        this.f29983r = j();
        return new RippleDrawable(this.f29976k, null, this.f29983r);
    }

    public final void i0(Drawable drawable) {
        if (this.f29967a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f29967a.getForeground()).setDrawable(drawable);
        } else {
            this.f29967a.setForeground(D(drawable));
        }
    }

    @NonNull
    public final g j() {
        return new g(this.f29978m);
    }

    public void j0() {
        if (!E()) {
            this.f29967a.setBackgroundInternal(D(this.f29968c));
        }
        this.f29967a.setForeground(D(this.f29974i));
    }

    public void k() {
        Drawable drawable = this.f29980o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f29980o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f29980o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    public final void k0() {
        Drawable drawable;
        if (gd.b.f17685a && (drawable = this.f29980o) != null) {
            ((RippleDrawable) drawable).setColor(this.f29976k);
            return;
        }
        g gVar = this.f29982q;
        if (gVar != null) {
            gVar.a0(this.f29976k);
        }
    }

    @NonNull
    public g l() {
        return this.f29968c;
    }

    public void l0() {
        this.f29969d.h0(this.f29973h, this.f29979n);
    }

    public ColorStateList m() {
        return this.f29968c.x();
    }

    public ColorStateList n() {
        return this.f29969d.x();
    }

    public Drawable o() {
        return this.f29975j;
    }

    public int p() {
        return this.f29972g;
    }

    public int q() {
        return this.f29970e;
    }

    public int r() {
        return this.f29971f;
    }

    public ColorStateList s() {
        return this.f29977l;
    }

    @NonNull
    public final Drawable t() {
        if (this.f29980o == null) {
            this.f29980o = i();
        }
        if (this.f29981p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f29980o, this.f29969d, this.f29975j});
            this.f29981p = layerDrawable;
            layerDrawable.setId(2, f.D);
        }
        return this.f29981p;
    }

    public float u() {
        return this.f29968c.J();
    }

    public final float v() {
        if (this.f29967a.getPreventCornerOverlap() && this.f29967a.getUseCompatPadding()) {
            return (float) ((1.0d - f29966z) * ((double) this.f29967a.getCardViewRadius()));
        }
        return 0.0f;
    }

    public float w() {
        return this.f29968c.y();
    }

    public ColorStateList x() {
        return this.f29976k;
    }

    public k y() {
        return this.f29978m;
    }

    public int z() {
        ColorStateList colorStateList = this.f29979n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
