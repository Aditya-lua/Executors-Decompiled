package mc;

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
import dd.c;
import gd.g;
import gd.k;
import gd.n;
import hc.b;
import zc.r;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f24047u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final boolean f24048v = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f24049a;

    @NonNull
    public k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f24056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f24057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f24058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f24059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f24060m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f24064q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public LayerDrawable f24066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f24067t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f24061n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f24062o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24063p = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24065r = true;

    public a(MaterialButton materialButton, @NonNull k kVar) {
        this.f24049a = materialButton;
        this.b = kVar;
    }

    public void A(boolean z10) {
        this.f24061n = z10;
        J();
    }

    public void B(ColorStateList colorStateList) {
        if (this.f24058k != colorStateList) {
            this.f24058k = colorStateList;
            J();
        }
    }

    public void C(int i10) {
        if (this.f24055h != i10) {
            this.f24055h = i10;
            J();
        }
    }

    public void D(ColorStateList colorStateList) {
        if (this.f24057j != colorStateList) {
            this.f24057j = colorStateList;
            if (f() != null) {
                q2.a.o(f(), this.f24057j);
            }
        }
    }

    public void E(PorterDuff.Mode mode) {
        if (this.f24056i != mode) {
            this.f24056i = mode;
            if (f() == null || this.f24056i == null) {
                return;
            }
            q2.a.p(f(), this.f24056i);
        }
    }

    public void F(boolean z10) {
        this.f24065r = z10;
    }

    public final void G(int i10, int i11) {
        int iE = o0.E(this.f24049a);
        int paddingTop = this.f24049a.getPaddingTop();
        int iD = o0.D(this.f24049a);
        int paddingBottom = this.f24049a.getPaddingBottom();
        int i12 = this.f24052e;
        int i13 = this.f24053f;
        this.f24053f = i11;
        this.f24052e = i10;
        if (!this.f24062o) {
            H();
        }
        o0.B0(this.f24049a, iE, (paddingTop + i10) - i12, iD, (paddingBottom + i11) - i13);
    }

    public final void H() {
        this.f24049a.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.Z(this.f24067t);
            gVarF.setState(this.f24049a.getDrawableState());
        }
    }

    public final void I(@NonNull k kVar) {
        if (f24048v && !this.f24062o) {
            int iE = o0.E(this.f24049a);
            int paddingTop = this.f24049a.getPaddingTop();
            int iD = o0.D(this.f24049a);
            int paddingBottom = this.f24049a.getPaddingBottom();
            H();
            o0.B0(this.f24049a, iE, paddingTop, iD, paddingBottom);
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
            gVarF.h0(this.f24055h, this.f24058k);
            if (gVarN != null) {
                gVarN.g0(this.f24055h, this.f24061n ? tc.a.d(this.f24049a, b.f18790o) : 0);
            }
        }
    }

    @NonNull
    public final InsetDrawable K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f24050c, this.f24052e, this.f24051d, this.f24053f);
    }

    public final Drawable a() {
        g gVar = new g(this.b);
        gVar.Q(this.f24049a.getContext());
        q2.a.o(gVar, this.f24057j);
        PorterDuff.Mode mode = this.f24056i;
        if (mode != null) {
            q2.a.p(gVar, mode);
        }
        gVar.h0(this.f24055h, this.f24058k);
        g gVar2 = new g(this.b);
        gVar2.setTint(0);
        gVar2.g0(this.f24055h, this.f24061n ? tc.a.d(this.f24049a, b.f18790o) : 0);
        if (f24047u) {
            g gVar3 = new g(this.b);
            this.f24060m = gVar3;
            q2.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(ed.b.a(this.f24059l), K(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.f24060m);
            this.f24066s = rippleDrawable;
            return rippleDrawable;
        }
        ed.a aVar = new ed.a(this.b);
        this.f24060m = aVar;
        q2.a.o(aVar, ed.b.a(this.f24059l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.f24060m});
        this.f24066s = layerDrawable;
        return K(layerDrawable);
    }

    public int b() {
        return this.f24054g;
    }

    public int c() {
        return this.f24053f;
    }

    public int d() {
        return this.f24052e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f24066s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f24066s.getNumberOfLayers() > 2 ? (n) this.f24066s.getDrawable(2) : (n) this.f24066s.getDrawable(1);
    }

    public g f() {
        return g(false);
    }

    public final g g(boolean z10) {
        LayerDrawable layerDrawable = this.f24066s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f24047u ? (g) ((LayerDrawable) ((InsetDrawable) this.f24066s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (g) this.f24066s.getDrawable(!z10 ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f24059l;
    }

    @NonNull
    public k i() {
        return this.b;
    }

    public ColorStateList j() {
        return this.f24058k;
    }

    public int k() {
        return this.f24055h;
    }

    public ColorStateList l() {
        return this.f24057j;
    }

    public PorterDuff.Mode m() {
        return this.f24056i;
    }

    public final g n() {
        return g(true);
    }

    public boolean o() {
        return this.f24062o;
    }

    public boolean p() {
        return this.f24064q;
    }

    public boolean q() {
        return this.f24065r;
    }

    public void r(@NonNull TypedArray typedArray) {
        this.f24050c = typedArray.getDimensionPixelOffset(hc.k.H2, 0);
        this.f24051d = typedArray.getDimensionPixelOffset(hc.k.I2, 0);
        this.f24052e = typedArray.getDimensionPixelOffset(hc.k.J2, 0);
        this.f24053f = typedArray.getDimensionPixelOffset(hc.k.K2, 0);
        int i10 = hc.k.O2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f24054g = dimensionPixelSize;
            z(this.b.w(dimensionPixelSize));
            this.f24063p = true;
        }
        this.f24055h = typedArray.getDimensionPixelSize(hc.k.Y2, 0);
        this.f24056i = r.i(typedArray.getInt(hc.k.N2, -1), PorterDuff.Mode.SRC_IN);
        this.f24057j = c.a(this.f24049a.getContext(), typedArray, hc.k.M2);
        this.f24058k = c.a(this.f24049a.getContext(), typedArray, hc.k.X2);
        this.f24059l = c.a(this.f24049a.getContext(), typedArray, hc.k.W2);
        this.f24064q = typedArray.getBoolean(hc.k.L2, false);
        this.f24067t = typedArray.getDimensionPixelSize(hc.k.P2, 0);
        this.f24065r = typedArray.getBoolean(hc.k.Z2, true);
        int iE = o0.E(this.f24049a);
        int paddingTop = this.f24049a.getPaddingTop();
        int iD = o0.D(this.f24049a);
        int paddingBottom = this.f24049a.getPaddingBottom();
        if (typedArray.hasValue(hc.k.G2)) {
            t();
        } else {
            H();
        }
        o0.B0(this.f24049a, iE + this.f24050c, paddingTop + this.f24052e, iD + this.f24051d, paddingBottom + this.f24053f);
    }

    public void s(int i10) {
        if (f() != null) {
            f().setTint(i10);
        }
    }

    public void t() {
        this.f24062o = true;
        this.f24049a.setSupportBackgroundTintList(this.f24057j);
        this.f24049a.setSupportBackgroundTintMode(this.f24056i);
    }

    public void u(boolean z10) {
        this.f24064q = z10;
    }

    public void v(int i10) {
        if (this.f24063p && this.f24054g == i10) {
            return;
        }
        this.f24054g = i10;
        this.f24063p = true;
        z(this.b.w(i10));
    }

    public void w(int i10) {
        G(this.f24052e, i10);
    }

    public void x(int i10) {
        G(i10, this.f24053f);
    }

    public void y(ColorStateList colorStateList) {
        if (this.f24059l != colorStateList) {
            this.f24059l = colorStateList;
            boolean z10 = f24047u;
            if (z10 && (this.f24049a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f24049a.getBackground()).setColor(ed.b.a(colorStateList));
            } else {
                if (z10 || !(this.f24049a.getBackground() instanceof ed.a)) {
                    return;
                }
                ((ed.a) this.f24049a.getBackground()).setTintList(ed.b.a(colorStateList));
            }
        }
    }

    public void z(@NonNull k kVar) {
        this.b = kVar;
        I(kVar);
    }
}
