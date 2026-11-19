package oc;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import bd.r;
import com.google.android.material.button.MaterialButton;
import fd.c;
import id.g;
import id.k;
import id.n;
import jc.b;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f28043u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f28044v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f28045a;

    @NonNull
    public k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f28049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f28050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f28051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f28052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f28053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f28054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f28055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f28056m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f28060q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LayerDrawable f28062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f28063t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f28057n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f28058o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f28059p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f28061r = true;

    public a(MaterialButton materialButton, @NonNull k kVar) {
        this.f28045a = materialButton;
        this.b = kVar;
    }

    public void A(boolean z10) {
        this.f28057n = z10;
        J();
    }

    public void B(ColorStateList colorStateList) {
        if (this.f28054k != colorStateList) {
            this.f28054k = colorStateList;
            J();
        }
    }

    public void C(int i10) {
        if (this.f28051h != i10) {
            this.f28051h = i10;
            J();
        }
    }

    public void D(ColorStateList colorStateList) {
        if (this.f28053j != colorStateList) {
            this.f28053j = colorStateList;
            if (f() != null) {
                q2.a.o(f(), this.f28053j);
            }
        }
    }

    public void E(PorterDuff.Mode mode) {
        if (this.f28052i != mode) {
            this.f28052i = mode;
            if (f() == null || this.f28052i == null) {
                return;
            }
            q2.a.p(f(), this.f28052i);
        }
    }

    public void F(boolean z10) {
        this.f28061r = z10;
    }

    public final void G(int i10, int i11) {
        int iE = o0.E(this.f28045a);
        int paddingTop = this.f28045a.getPaddingTop();
        int iD = o0.D(this.f28045a);
        int paddingBottom = this.f28045a.getPaddingBottom();
        int i12 = this.f28048e;
        int i13 = this.f28049f;
        this.f28049f = i11;
        this.f28048e = i10;
        if (!this.f28058o) {
            H();
        }
        o0.B0(this.f28045a, iE, (paddingTop + i10) - i12, iD, (paddingBottom + i11) - i13);
    }

    public final void H() {
        this.f28045a.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.Z(this.f28063t);
            gVarF.setState(this.f28045a.getDrawableState());
        }
    }

    public final void I(@NonNull k kVar) {
        if (f28044v && !this.f28058o) {
            int iE = o0.E(this.f28045a);
            int paddingTop = this.f28045a.getPaddingTop();
            int iD = o0.D(this.f28045a);
            int paddingBottom = this.f28045a.getPaddingBottom();
            H();
            o0.B0(this.f28045a, iE, paddingTop, iD, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    public final void J() {
        g gVarF = f();
        g gVarN = n();
        if (gVarF != null) {
            gVarF.h0(this.f28051h, this.f28054k);
            if (gVarN != null) {
                gVarN.g0(this.f28051h, this.f28057n ? vc.a.d(this.f28045a, b.f20300o) : 0);
            }
        }
    }

    @NonNull
    public final InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f28046c, this.f28048e, this.f28047d, this.f28049f);
    }

    public final Drawable a() {
        g gVar = new g(this.b);
        gVar.Q(this.f28045a.getContext());
        q2.a.o(gVar, this.f28053j);
        PorterDuff.Mode mode = this.f28052i;
        if (mode != null) {
            q2.a.p(gVar, mode);
        }
        gVar.h0(this.f28051h, this.f28054k);
        g gVar2 = new g(this.b);
        gVar2.setTint(0);
        gVar2.g0(this.f28051h, this.f28057n ? vc.a.d(this.f28045a, b.f20300o) : 0);
        if (f28043u) {
            g gVar3 = new g(this.b);
            this.f28056m = gVar3;
            q2.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(gd.b.a(this.f28055l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f28056m);
            this.f28062s = rippleDrawable;
            return rippleDrawable;
        }
        gd.a aVar = new gd.a(this.b);
        this.f28056m = aVar;
        q2.a.o(aVar, gd.b.a(this.f28055l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f28056m});
        this.f28062s = layerDrawable;
        return K(layerDrawable);
    }

    public int b() {
        return this.f28050g;
    }

    public int c() {
        return this.f28049f;
    }

    public int d() {
        return this.f28048e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f28062s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f28062s.getNumberOfLayers() > 2 ? (n) this.f28062s.getDrawable(2) : (n) this.f28062s.getDrawable(1);
    }

    public g f() {
        return g(false);
    }

    public final g g(boolean z10) {
        LayerDrawable layerDrawable = this.f28062s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f28043u ? (g) ((LayerDrawable) ((InsetDrawable) this.f28062s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (g) this.f28062s.getDrawable(!z10 ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f28055l;
    }

    @NonNull
    public k i() {
        return this.b;
    }

    public ColorStateList j() {
        return this.f28054k;
    }

    public int k() {
        return this.f28051h;
    }

    public ColorStateList l() {
        return this.f28053j;
    }

    public PorterDuff.Mode m() {
        return this.f28052i;
    }

    public final g n() {
        return g(true);
    }

    public boolean o() {
        return this.f28058o;
    }

    public boolean p() {
        return this.f28060q;
    }

    public boolean q() {
        return this.f28061r;
    }

    public void r(@NonNull TypedArray typedArray) {
        this.f28046c = typedArray.getDimensionPixelOffset(jc.k.H2, 0);
        this.f28047d = typedArray.getDimensionPixelOffset(jc.k.I2, 0);
        this.f28048e = typedArray.getDimensionPixelOffset(jc.k.J2, 0);
        this.f28049f = typedArray.getDimensionPixelOffset(jc.k.K2, 0);
        if (typedArray.hasValue(jc.k.O2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(jc.k.O2, -1);
            this.f28050g = dimensionPixelSize;
            z(this.b.w(dimensionPixelSize));
            this.f28059p = true;
        }
        this.f28051h = typedArray.getDimensionPixelSize(jc.k.Y2, 0);
        this.f28052i = r.i(typedArray.getInt(jc.k.N2, -1), PorterDuff.Mode.SRC_IN);
        this.f28053j = c.a(this.f28045a.getContext(), typedArray, jc.k.M2);
        this.f28054k = c.a(this.f28045a.getContext(), typedArray, jc.k.X2);
        this.f28055l = c.a(this.f28045a.getContext(), typedArray, jc.k.W2);
        this.f28060q = typedArray.getBoolean(jc.k.L2, false);
        this.f28063t = typedArray.getDimensionPixelSize(jc.k.P2, 0);
        this.f28061r = typedArray.getBoolean(jc.k.Z2, true);
        int iE = o0.E(this.f28045a);
        int paddingTop = this.f28045a.getPaddingTop();
        int iD = o0.D(this.f28045a);
        int paddingBottom = this.f28045a.getPaddingBottom();
        if (typedArray.hasValue(jc.k.G2)) {
            t();
        } else {
            H();
        }
        o0.B0(this.f28045a, iE + this.f28046c, paddingTop + this.f28048e, iD + this.f28047d, paddingBottom + this.f28049f);
    }

    public void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    public void t() {
        this.f28058o = true;
        this.f28045a.setSupportBackgroundTintList(this.f28053j);
        this.f28045a.setSupportBackgroundTintMode(this.f28052i);
    }

    public void u(boolean z10) {
        this.f28060q = z10;
    }

    public void v(int i10) {
        if (this.f28059p && this.f28050g == i10) {
            return;
        }
        this.f28050g = i10;
        this.f28059p = true;
        z(this.b.w(i10));
    }

    public void w(int i10) {
        G(this.f28048e, i10);
    }

    public void x(int i10) {
        G(i10, this.f28049f);
    }

    public void y(ColorStateList colorStateList) {
        if (this.f28055l != colorStateList) {
            this.f28055l = colorStateList;
            boolean z10 = f28043u;
            if (z10 && (this.f28045a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f28045a.getBackground()).setColor(gd.b.a(colorStateList));
            } else {
                if (z10 || !(this.f28045a.getBackground() instanceof gd.a)) {
                    return;
                }
                ((gd.a) this.f28045a.getBackground()).setTintList(gd.b.a(colorStateList));
            }
        }
    }

    public void z(@NonNull k kVar) {
        this.b = kVar;
        I(kVar);
    }
}
