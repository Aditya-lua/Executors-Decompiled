package pc;

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
import cd.h;
import com.google.android.material.card.MaterialCardView;
import com.google.mlkit.common.MlKitException;
import ed.c;
import hd.d;
import hd.e;
import hd.g;
import hd.k;
import ic.f;
import ic.j;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    public static final Drawable A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final double f28625z = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f28626a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final g f28627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final g f28628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Drawable f28633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f28634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f28635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f28636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f28637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f28638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f28639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayerDrawable f28640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g f28641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f28642r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f28644t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ValueAnimator f28645u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f28646v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f28647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f28648x;

    @NonNull
    public final Rect b = new Rect();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f28643s = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f28649y = 0.0f;

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
        this.f28626a = materialCardView;
        g gVar = new g(materialCardView.getContext(), attributeSet, i10, i11);
        this.f28627c = gVar;
        gVar.Q(materialCardView.getContext());
        gVar.f0(-12303292);
        k.b bVarV = gVar.E().v();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, ic.k.f20862j0, i10, j.f20753a);
        int i12 = ic.k.f20871k0;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            bVarV.o(typedArrayObtainStyledAttributes.getDimension(i12, 0.0f));
        }
        this.f28628d = new g();
        Y(bVarV.m());
        this.f28646v = h.g(materialCardView.getContext(), ic.b.Q, jc.a.f21812a);
        this.f28647w = h.f(materialCardView.getContext(), ic.b.K, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        this.f28648x = h.f(materialCardView.getContext(), ic.b.J, MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f28634j.setAlpha((int) (255.0f * fFloatValue));
        bVar.f28649y = fFloatValue;
    }

    public ColorStateList A() {
        return this.f28638n;
    }

    public int B() {
        return this.f28632h;
    }

    @NonNull
    public Rect C() {
        return this.b;
    }

    @NonNull
    public final Drawable D(Drawable drawable) {
        int iCeil;
        int iCeil2;
        if (this.f28626a.getUseCompatPadding()) {
            iCeil2 = (int) Math.ceil(f());
            iCeil = (int) Math.ceil(e());
        } else {
            iCeil = 0;
            iCeil2 = 0;
        }
        return new a(drawable, iCeil, iCeil2, iCeil, iCeil2);
    }

    public boolean E() {
        return this.f28643s;
    }

    public boolean F() {
        return this.f28644t;
    }

    public final boolean G() {
        return (this.f28631g & 80) == 80;
    }

    public final boolean H() {
        return (this.f28631g & 8388613) == 8388613;
    }

    public void I(@NonNull TypedArray typedArray) {
        ColorStateList colorStateListA = c.a(this.f28626a.getContext(), typedArray, ic.k.J3);
        this.f28638n = colorStateListA;
        if (colorStateListA == null) {
            this.f28638n = ColorStateList.valueOf(-1);
        }
        this.f28632h = typedArray.getDimensionPixelSize(ic.k.K3, 0);
        boolean z10 = typedArray.getBoolean(ic.k.B3, false);
        this.f28644t = z10;
        this.f28626a.setLongClickable(z10);
        this.f28636l = c.a(this.f28626a.getContext(), typedArray, ic.k.H3);
        Q(c.d(this.f28626a.getContext(), typedArray, ic.k.D3));
        T(typedArray.getDimensionPixelSize(ic.k.G3, 0));
        S(typedArray.getDimensionPixelSize(ic.k.F3, 0));
        this.f28631g = typedArray.getInteger(ic.k.E3, 8388661);
        ColorStateList colorStateListA2 = c.a(this.f28626a.getContext(), typedArray, ic.k.I3);
        this.f28635k = colorStateListA2;
        if (colorStateListA2 == null) {
            this.f28635k = ColorStateList.valueOf(uc.a.d(this.f28626a, ic.b.f20603h));
        }
        M(c.a(this.f28626a.getContext(), typedArray, ic.k.C3));
        k0();
        h0();
        l0();
        this.f28626a.setBackgroundInternal(D(this.f28627c));
        Drawable drawableT = e0() ? t() : this.f28628d;
        this.f28633i = drawableT;
        this.f28626a.setForeground(D(drawableT));
    }

    public void J(int i10, int i11) {
        int iCeil;
        int iCeil2;
        int i12;
        int i13;
        if (this.f28640p != null) {
            if (this.f28626a.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(f() * 2.0f);
                iCeil2 = (int) Math.ceil(e() * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i14 = H() ? ((i10 - this.f28629e) - this.f28630f) - iCeil2 : this.f28629e;
            int i15 = G() ? this.f28629e : ((i11 - this.f28629e) - this.f28630f) - iCeil;
            int i16 = H() ? this.f28629e : ((i10 - this.f28629e) - this.f28630f) - iCeil2;
            int i17 = G() ? ((i11 - this.f28629e) - this.f28630f) - iCeil : this.f28629e;
            if (o0.z(this.f28626a) == 1) {
                i13 = i16;
                i12 = i14;
            } else {
                i12 = i16;
                i13 = i14;
            }
            this.f28640p.setLayerInset(2, i13, i17, i12, i15);
        }
    }

    public void K(boolean z10) {
        this.f28643s = z10;
    }

    public void L(ColorStateList colorStateList) {
        this.f28627c.a0(colorStateList);
    }

    public void M(ColorStateList colorStateList) {
        g gVar = this.f28628d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.a0(colorStateList);
    }

    public void N(boolean z10) {
        this.f28644t = z10;
    }

    public void O(boolean z10) {
        P(z10, false);
    }

    public void P(boolean z10, boolean z11) {
        Drawable drawable = this.f28634j;
        if (drawable != null) {
            if (z11) {
                b(z10);
            } else {
                drawable.setAlpha(z10 ? 255 : 0);
                this.f28649y = z10 ? 1.0f : 0.0f;
            }
        }
    }

    public void Q(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = q2.a.r(drawable).mutate();
            this.f28634j = drawableMutate;
            q2.a.o(drawableMutate, this.f28636l);
            O(this.f28626a.isChecked());
        } else {
            this.f28634j = A;
        }
        LayerDrawable layerDrawable = this.f28640p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(f.D, this.f28634j);
        }
    }

    public void R(int i10) {
        this.f28631g = i10;
        J(this.f28626a.getMeasuredWidth(), this.f28626a.getMeasuredHeight());
    }

    public void S(int i10) {
        this.f28629e = i10;
    }

    public void T(int i10) {
        this.f28630f = i10;
    }

    public void U(ColorStateList colorStateList) {
        this.f28636l = colorStateList;
        Drawable drawable = this.f28634j;
        if (drawable != null) {
            q2.a.o(drawable, colorStateList);
        }
    }

    public void V(float f10) {
        Y(this.f28637m.w(f10));
        this.f28633i.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    public void W(float f10) {
        this.f28627c.b0(f10);
        g gVar = this.f28628d;
        if (gVar != null) {
            gVar.b0(f10);
        }
        g gVar2 = this.f28642r;
        if (gVar2 != null) {
            gVar2.b0(f10);
        }
    }

    public void X(ColorStateList colorStateList) {
        this.f28635k = colorStateList;
        k0();
    }

    public void Y(@NonNull k kVar) {
        this.f28637m = kVar;
        this.f28627c.setShapeAppearanceModel(kVar);
        g gVar = this.f28627c;
        gVar.e0(!gVar.T());
        g gVar2 = this.f28628d;
        if (gVar2 != null) {
            gVar2.setShapeAppearanceModel(kVar);
        }
        g gVar3 = this.f28642r;
        if (gVar3 != null) {
            gVar3.setShapeAppearanceModel(kVar);
        }
        g gVar4 = this.f28641q;
        if (gVar4 != null) {
            gVar4.setShapeAppearanceModel(kVar);
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f28638n == colorStateList) {
            return;
        }
        this.f28638n = colorStateList;
        l0();
    }

    public void a0(int i10) {
        if (i10 == this.f28632h) {
            return;
        }
        this.f28632h = i10;
        l0();
    }

    public void b(boolean z10) {
        float f10 = z10 ? 1.0f : 0.0f;
        float f11 = z10 ? 1.0f - this.f28649y : this.f28649y;
        ValueAnimator valueAnimator = this.f28645u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f28645u = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f28649y, f10);
        this.f28645u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pc.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(this.f28624a, valueAnimator2);
            }
        });
        this.f28645u.setInterpolator(this.f28646v);
        this.f28645u.setDuration((long) ((z10 ? this.f28647w : this.f28648x) * f11));
        this.f28645u.start();
    }

    public void b0(int i10, int i11, int i12, int i13) {
        this.b.set(i10, i11, i12, i13);
        g0();
    }

    public final float c() {
        return Math.max(Math.max(d(this.f28637m.q(), this.f28627c.J()), d(this.f28637m.s(), this.f28627c.K())), Math.max(d(this.f28637m.k(), this.f28627c.t()), d(this.f28637m.i(), this.f28627c.s())));
    }

    public final boolean c0() {
        return this.f28626a.getPreventCornerOverlap() && !g();
    }

    public final float d(d dVar, float f10) {
        if (dVar instanceof hd.j) {
            return (float) ((1.0d - f28625z) * ((double) f10));
        }
        if (dVar instanceof e) {
            return f10 / 2.0f;
        }
        return 0.0f;
    }

    public final boolean d0() {
        return this.f28626a.getPreventCornerOverlap() && g() && this.f28626a.getUseCompatPadding();
    }

    public final float e() {
        return this.f28626a.getMaxCardElevation() + (d0() ? c() : 0.0f);
    }

    public final boolean e0() {
        if (this.f28626a.isClickable()) {
            return true;
        }
        View view = this.f28626a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final float f() {
        return (this.f28626a.getMaxCardElevation() * 1.5f) + (d0() ? c() : 0.0f);
    }

    public void f0() {
        Drawable drawable = this.f28633i;
        Drawable drawableT = e0() ? t() : this.f28628d;
        this.f28633i = drawableT;
        if (drawable != drawableT) {
            i0(drawableT);
        }
    }

    public final boolean g() {
        return this.f28627c.T();
    }

    public void g0() {
        int iC = (int) (((c0() || d0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f28626a;
        Rect rect = this.b;
        materialCardView.i(rect.left + iC, rect.top + iC, rect.right + iC, rect.bottom + iC);
    }

    @NonNull
    public final Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        g gVarJ = j();
        this.f28641q = gVarJ;
        gVarJ.a0(this.f28635k);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, this.f28641q);
        return stateListDrawable;
    }

    public void h0() {
        this.f28627c.Z(this.f28626a.getCardElevation());
    }

    @NonNull
    public final Drawable i() {
        if (!fd.b.f17188a) {
            return h();
        }
        this.f28642r = j();
        return new RippleDrawable(this.f28635k, null, this.f28642r);
    }

    public final void i0(Drawable drawable) {
        if (this.f28626a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f28626a.getForeground()).setDrawable(drawable);
        } else {
            this.f28626a.setForeground(D(drawable));
        }
    }

    @NonNull
    public final g j() {
        return new g(this.f28637m);
    }

    public void j0() {
        if (!E()) {
            this.f28626a.setBackgroundInternal(D(this.f28627c));
        }
        this.f28626a.setForeground(D(this.f28633i));
    }

    public void k() {
        Drawable drawable = this.f28639o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i10 = bounds.bottom;
            this.f28639o.setBounds(bounds.left, bounds.top, bounds.right, i10 - 1);
            this.f28639o.setBounds(bounds.left, bounds.top, bounds.right, i10);
        }
    }

    public final void k0() {
        Drawable drawable;
        if (fd.b.f17188a && (drawable = this.f28639o) != null) {
            ((RippleDrawable) drawable).setColor(this.f28635k);
            return;
        }
        g gVar = this.f28641q;
        if (gVar != null) {
            gVar.a0(this.f28635k);
        }
    }

    @NonNull
    public g l() {
        return this.f28627c;
    }

    public void l0() {
        this.f28628d.h0(this.f28632h, this.f28638n);
    }

    public ColorStateList m() {
        return this.f28627c.x();
    }

    public ColorStateList n() {
        return this.f28628d.x();
    }

    public Drawable o() {
        return this.f28634j;
    }

    public int p() {
        return this.f28631g;
    }

    public int q() {
        return this.f28629e;
    }

    public int r() {
        return this.f28630f;
    }

    public ColorStateList s() {
        return this.f28636l;
    }

    @NonNull
    public final Drawable t() {
        if (this.f28639o == null) {
            this.f28639o = i();
        }
        if (this.f28640p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f28639o, this.f28628d, this.f28634j});
            this.f28640p = layerDrawable;
            layerDrawable.setId(2, f.D);
        }
        return this.f28640p;
    }

    public float u() {
        return this.f28627c.J();
    }

    public final float v() {
        if (this.f28626a.getPreventCornerOverlap() && this.f28626a.getUseCompatPadding()) {
            return (float) ((1.0d - f28625z) * ((double) this.f28626a.getCardViewRadius()));
        }
        return 0.0f;
    }

    public float w() {
        return this.f28627c.y();
    }

    public ColorStateList x() {
        return this.f28635k;
    }

    public k y() {
        return this.f28637m;
    }

    public int z() {
        ColorStateList colorStateList = this.f28638n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
