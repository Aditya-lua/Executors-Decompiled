package nc;

import ad.r;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.core.view.o0;
import com.google.android.material.button.MaterialButton;
import ed.c;
import hd.g;
import hd.k;
import hd.n;
import ic.b;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f27055u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f27056v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f27057a;

    @NonNull
    public k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f27059d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f27061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f27062g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f27063h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f27064i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f27065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f27066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f27067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f27068m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f27072q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LayerDrawable f27074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f27075t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f27069n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f27070o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f27071p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f27073r = true;

    public a(MaterialButton materialButton, @NonNull k kVar) {
        this.f27057a = materialButton;
        this.b = kVar;
    }

    public void A(boolean z10) {
        this.f27069n = z10;
        J();
    }

    public void B(ColorStateList colorStateList) {
        if (this.f27066k != colorStateList) {
            this.f27066k = colorStateList;
            J();
        }
    }

    public void C(int i10) {
        if (this.f27063h != i10) {
            this.f27063h = i10;
            J();
        }
    }

    public void D(ColorStateList colorStateList) {
        if (this.f27065j != colorStateList) {
            this.f27065j = colorStateList;
            if (f() != null) {
                q2.a.o(f(), this.f27065j);
            }
        }
    }

    public void E(PorterDuff.Mode mode) {
        if (this.f27064i != mode) {
            this.f27064i = mode;
            if (f() == null || this.f27064i == null) {
                return;
            }
            q2.a.p(f(), this.f27064i);
        }
    }

    public void F(boolean z10) {
        this.f27073r = z10;
    }

    public final void G(int i10, int i11) {
        int iE = o0.E(this.f27057a);
        int paddingTop = this.f27057a.getPaddingTop();
        int iD = o0.D(this.f27057a);
        int paddingBottom = this.f27057a.getPaddingBottom();
        int i12 = this.f27060e;
        int i13 = this.f27061f;
        this.f27061f = i11;
        this.f27060e = i10;
        if (!this.f27070o) {
            H();
        }
        o0.B0(this.f27057a, iE, (paddingTop + i10) - i12, iD, (paddingBottom + i11) - i13);
    }

    public final void H() {
        this.f27057a.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.Z(this.f27075t);
            gVarF.setState(this.f27057a.getDrawableState());
        }
    }

    public final void I(@NonNull k kVar) {
        if (f27056v && !this.f27070o) {
            int iE = o0.E(this.f27057a);
            int paddingTop = this.f27057a.getPaddingTop();
            int iD = o0.D(this.f27057a);
            int paddingBottom = this.f27057a.getPaddingBottom();
            H();
            o0.B0(this.f27057a, iE, paddingTop, iD, paddingBottom);
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
            gVarF.h0(this.f27063h, this.f27066k);
            if (gVarN != null) {
                gVarN.g0(this.f27063h, this.f27069n ? uc.a.d(this.f27057a, b.f20612o) : 0);
            }
        }
    }

    @NonNull
    public final InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f27058c, this.f27060e, this.f27059d, this.f27061f);
    }

    public final Drawable a() {
        g gVar = new g(this.b);
        gVar.Q(this.f27057a.getContext());
        q2.a.o(gVar, this.f27065j);
        PorterDuff.Mode mode = this.f27064i;
        if (mode != null) {
            q2.a.p(gVar, mode);
        }
        gVar.h0(this.f27063h, this.f27066k);
        g gVar2 = new g(this.b);
        gVar2.setTint(0);
        gVar2.g0(this.f27063h, this.f27069n ? uc.a.d(this.f27057a, b.f20612o) : 0);
        if (f27055u) {
            g gVar3 = new g(this.b);
            this.f27068m = gVar3;
            q2.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(fd.b.a(this.f27067l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f27068m);
            this.f27074s = rippleDrawable;
            return rippleDrawable;
        }
        fd.a aVar = new fd.a(this.b);
        this.f27068m = aVar;
        q2.a.o(aVar, fd.b.a(this.f27067l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f27068m});
        this.f27074s = layerDrawable;
        return K(layerDrawable);
    }

    public int b() {
        return this.f27062g;
    }

    public int c() {
        return this.f27061f;
    }

    public int d() {
        return this.f27060e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f27074s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f27074s.getNumberOfLayers() > 2 ? (n) this.f27074s.getDrawable(2) : (n) this.f27074s.getDrawable(1);
    }

    public g f() {
        return g(false);
    }

    public final g g(boolean z10) {
        LayerDrawable layerDrawable = this.f27074s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f27055u ? (g) ((LayerDrawable) ((InsetDrawable) this.f27074s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (g) this.f27074s.getDrawable(!z10 ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f27067l;
    }

    @NonNull
    public k i() {
        return this.b;
    }

    public ColorStateList j() {
        return this.f27066k;
    }

    public int k() {
        return this.f27063h;
    }

    public ColorStateList l() {
        return this.f27065j;
    }

    public PorterDuff.Mode m() {
        return this.f27064i;
    }

    public final g n() {
        return g(true);
    }

    public boolean o() {
        return this.f27070o;
    }

    public boolean p() {
        return this.f27072q;
    }

    public boolean q() {
        return this.f27073r;
    }

    public void r(@NonNull TypedArray typedArray) {
        this.f27058c = typedArray.getDimensionPixelOffset(ic.k.H2, 0);
        this.f27059d = typedArray.getDimensionPixelOffset(ic.k.I2, 0);
        this.f27060e = typedArray.getDimensionPixelOffset(ic.k.J2, 0);
        this.f27061f = typedArray.getDimensionPixelOffset(ic.k.K2, 0);
        int i10 = ic.k.O2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f27062g = dimensionPixelSize;
            z(this.b.w(dimensionPixelSize));
            this.f27071p = true;
        }
        this.f27063h = typedArray.getDimensionPixelSize(ic.k.Y2, 0);
        this.f27064i = r.i(typedArray.getInt(ic.k.N2, -1), PorterDuff.Mode.SRC_IN);
        this.f27065j = c.a(this.f27057a.getContext(), typedArray, ic.k.M2);
        this.f27066k = c.a(this.f27057a.getContext(), typedArray, ic.k.X2);
        this.f27067l = c.a(this.f27057a.getContext(), typedArray, ic.k.W2);
        this.f27072q = typedArray.getBoolean(ic.k.L2, false);
        this.f27075t = typedArray.getDimensionPixelSize(ic.k.P2, 0);
        this.f27073r = typedArray.getBoolean(ic.k.Z2, true);
        int iE = o0.E(this.f27057a);
        int paddingTop = this.f27057a.getPaddingTop();
        int iD = o0.D(this.f27057a);
        int paddingBottom = this.f27057a.getPaddingBottom();
        if (typedArray.hasValue(ic.k.G2)) {
            t();
        } else {
            H();
        }
        o0.B0(this.f27057a, iE + this.f27058c, paddingTop + this.f27060e, iD + this.f27059d, paddingBottom + this.f27061f);
    }

    public void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    public void t() {
        this.f27070o = true;
        this.f27057a.setSupportBackgroundTintList(this.f27065j);
        this.f27057a.setSupportBackgroundTintMode(this.f27064i);
    }

    public void u(boolean z10) {
        this.f27072q = z10;
    }

    public void v(int i10) {
        if (this.f27071p && this.f27062g == i10) {
            return;
        }
        this.f27062g = i10;
        this.f27071p = true;
        z(this.b.w(i10));
    }

    public void w(int i10) {
        G(this.f27060e, i10);
    }

    public void x(int i10) {
        G(i10, this.f27061f);
    }

    public void y(ColorStateList colorStateList) {
        if (this.f27067l != colorStateList) {
            this.f27067l = colorStateList;
            boolean z10 = f27055u;
            if (z10 && (this.f27057a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f27057a.getBackground()).setColor(fd.b.a(colorStateList));
            } else {
                if (z10 || !(this.f27057a.getBackground() instanceof fd.a)) {
                    return;
                }
                ((fd.a) this.f27057a.getBackground()).setTintList(fd.b.a(colorStateList));
            }
        }
    }

    public void z(@NonNull k kVar) {
        this.b = kVar;
        I(kVar);
    }
}
