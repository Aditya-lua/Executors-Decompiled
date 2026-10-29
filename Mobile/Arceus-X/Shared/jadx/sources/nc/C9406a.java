package nc;

import ad.C0146r;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import com.google.android.material.button.MaterialButton;
import p101ed.C5050c;
import p126fd.C5583a;
import p126fd.C5584b;
import p168hd.C6363g;
import p168hd.C6367k;
import p168hd.InterfaceC6370n;
import p194ic.C6738b;
import p194ic.C6747k;
import p368q2.C10425a;
import p463uc.C11840a;

/* JADX INFO: renamed from: nc.a */
/* JADX INFO: loaded from: classes2.dex */
public class C9406a {

    /* JADX INFO: renamed from: u */
    public static final boolean f33850u = true;

    /* JADX INFO: renamed from: v */
    public static final boolean f33851v = false;

    /* JADX INFO: renamed from: a */
    public final MaterialButton f33852a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public C6367k f33853b;

    /* JADX INFO: renamed from: c */
    public int f33854c;

    /* JADX INFO: renamed from: d */
    public int f33855d;

    /* JADX INFO: renamed from: e */
    public int f33856e;

    /* JADX INFO: renamed from: f */
    public int f33857f;

    /* JADX INFO: renamed from: g */
    public int f33858g;

    /* JADX INFO: renamed from: h */
    public int f33859h;

    /* JADX INFO: renamed from: i */
    public PorterDuff.Mode f33860i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f33861j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f33862k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f33863l;

    /* JADX INFO: renamed from: m */
    public Drawable f33864m;

    /* JADX INFO: renamed from: q */
    public boolean f33868q;

    /* JADX INFO: renamed from: s */
    public LayerDrawable f33870s;

    /* JADX INFO: renamed from: t */
    public int f33871t;

    /* JADX INFO: renamed from: n */
    public boolean f33865n = false;

    /* JADX INFO: renamed from: o */
    public boolean f33866o = false;

    /* JADX INFO: renamed from: p */
    public boolean f33867p = false;

    /* JADX INFO: renamed from: r */
    public boolean f33869r = true;

    public C9406a(MaterialButton materialButton, @NonNull C6367k c6367k) {
        this.f33852a = materialButton;
        this.f33853b = c6367k;
    }

    /* JADX INFO: renamed from: A */
    public void m37099A(boolean z10) {
        this.f33865n = z10;
        m37108J();
    }

    /* JADX INFO: renamed from: B */
    public void m37100B(ColorStateList colorStateList) {
        if (this.f33862k != colorStateList) {
            this.f33862k = colorStateList;
            m37108J();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m37101C(int i10) {
        if (this.f33859h != i10) {
            this.f33859h = i10;
            m37108J();
        }
    }

    /* JADX INFO: renamed from: D */
    public void m37102D(ColorStateList colorStateList) {
        if (this.f33861j != colorStateList) {
            this.f33861j = colorStateList;
            if (m37115f() != null) {
                C10425a.m40118o(m37115f(), this.f33861j);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m37103E(PorterDuff.Mode mode) {
        if (this.f33860i != mode) {
            this.f33860i = mode;
            if (m37115f() == null || this.f33860i == null) {
                return;
            }
            C10425a.m40119p(m37115f(), this.f33860i);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m37104F(boolean z10) {
        this.f33869r = z10;
    }

    /* JADX INFO: renamed from: G */
    public final void m37105G(int i10, int i11) {
        int iM2986E = C0625o0.m2986E(this.f33852a);
        int paddingTop = this.f33852a.getPaddingTop();
        int iM2984D = C0625o0.m2984D(this.f33852a);
        int paddingBottom = this.f33852a.getPaddingBottom();
        int i12 = this.f33856e;
        int i13 = this.f33857f;
        this.f33857f = i11;
        this.f33856e = i10;
        if (!this.f33866o) {
            m37106H();
        }
        C0625o0.m2981B0(this.f33852a, iM2986E, (paddingTop + i10) - i12, iM2984D, (paddingBottom + i11) - i13);
    }

    /* JADX INFO: renamed from: H */
    public final void m37106H() {
        this.f33852a.setInternalBackground(m37110a());
        C6363g c6363gM37115f = m37115f();
        if (c6363gM37115f != null) {
            c6363gM37115f.m27718Z(this.f33871t);
            c6363gM37115f.setState(this.f33852a.getDrawableState());
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m37107I(@NonNull C6367k c6367k) {
        if (f33851v && !this.f33866o) {
            int iM2986E = C0625o0.m2986E(this.f33852a);
            int paddingTop = this.f33852a.getPaddingTop();
            int iM2984D = C0625o0.m2984D(this.f33852a);
            int paddingBottom = this.f33852a.getPaddingBottom();
            m37106H();
            C0625o0.m2981B0(this.f33852a, iM2986E, paddingTop, iM2984D, paddingBottom);
            return;
        }
        if (m37115f() != null) {
            m37115f().setShapeAppearanceModel(c6367k);
        }
        if (m37123n() != null) {
            m37123n().setShapeAppearanceModel(c6367k);
        }
        if (m37114e() != null) {
            m37114e().setShapeAppearanceModel(c6367k);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m37108J() {
        C6363g c6363gM37115f = m37115f();
        C6363g c6363gM37123n = m37123n();
        if (c6363gM37115f != null) {
            c6363gM37115f.m27729h0(this.f33859h, this.f33862k);
            if (c6363gM37123n != null) {
                c6363gM37123n.m27727g0(this.f33859h, this.f33865n ? C11840a.m44228d(this.f33852a, C6738b.f25908o) : 0);
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: K */
    public final InsetDrawable m37109K(Drawable drawable) {
        return new InsetDrawable(drawable, this.f33854c, this.f33856e, this.f33855d, this.f33857f);
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m37110a() {
        C6363g c6363g = new C6363g(this.f33853b);
        c6363g.m27710Q(this.f33852a.getContext());
        C10425a.m40118o(c6363g, this.f33861j);
        PorterDuff.Mode mode = this.f33860i;
        if (mode != null) {
            C10425a.m40119p(c6363g, mode);
        }
        c6363g.m27729h0(this.f33859h, this.f33862k);
        C6363g c6363g2 = new C6363g(this.f33853b);
        c6363g2.setTint(0);
        c6363g2.m27727g0(this.f33859h, this.f33865n ? C11840a.m44228d(this.f33852a, C6738b.f25908o) : 0);
        if (f33850u) {
            C6363g c6363g3 = new C6363g(this.f33853b);
            this.f33864m = c6363g3;
            C10425a.m40117n(c6363g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(C5584b.m25241a(this.f33863l), m37109K(new LayerDrawable(new Drawable[]{c6363g2, c6363g})), this.f33864m);
            this.f33870s = rippleDrawable;
            return rippleDrawable;
        }
        C5583a c5583a = new C5583a(this.f33853b);
        this.f33864m = c5583a;
        C10425a.m40118o(c5583a, C5584b.m25241a(this.f33863l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c6363g2, c6363g, this.f33864m});
        this.f33870s = layerDrawable;
        return m37109K(layerDrawable);
    }

    /* JADX INFO: renamed from: b */
    public int m37111b() {
        return this.f33858g;
    }

    /* JADX INFO: renamed from: c */
    public int m37112c() {
        return this.f33857f;
    }

    /* JADX INFO: renamed from: d */
    public int m37113d() {
        return this.f33856e;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC6370n m37114e() {
        LayerDrawable layerDrawable = this.f33870s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f33870s.getNumberOfLayers() > 2 ? (InterfaceC6370n) this.f33870s.getDrawable(2) : (InterfaceC6370n) this.f33870s.getDrawable(1);
    }

    /* JADX INFO: renamed from: f */
    public C6363g m37115f() {
        return m37116g(false);
    }

    /* JADX INFO: renamed from: g */
    public final C6363g m37116g(boolean z10) {
        LayerDrawable layerDrawable = this.f33870s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f33850u ? (C6363g) ((LayerDrawable) ((InsetDrawable) this.f33870s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0) : (C6363g) this.f33870s.getDrawable(!z10 ? 1 : 0);
    }

    /* JADX INFO: renamed from: h */
    public ColorStateList m37117h() {
        return this.f33863l;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public C6367k m37118i() {
        return this.f33853b;
    }

    /* JADX INFO: renamed from: j */
    public ColorStateList m37119j() {
        return this.f33862k;
    }

    /* JADX INFO: renamed from: k */
    public int m37120k() {
        return this.f33859h;
    }

    /* JADX INFO: renamed from: l */
    public ColorStateList m37121l() {
        return this.f33861j;
    }

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode m37122m() {
        return this.f33860i;
    }

    /* JADX INFO: renamed from: n */
    public final C6363g m37123n() {
        return m37116g(true);
    }

    /* JADX INFO: renamed from: o */
    public boolean m37124o() {
        return this.f33866o;
    }

    /* JADX INFO: renamed from: p */
    public boolean m37125p() {
        return this.f33868q;
    }

    /* JADX INFO: renamed from: q */
    public boolean m37126q() {
        return this.f33869r;
    }

    /* JADX INFO: renamed from: r */
    public void m37127r(@NonNull TypedArray typedArray) {
        this.f33854c = typedArray.getDimensionPixelOffset(C6747k.f26201H2, 0);
        this.f33855d = typedArray.getDimensionPixelOffset(C6747k.f26210I2, 0);
        this.f33856e = typedArray.getDimensionPixelOffset(C6747k.f26219J2, 0);
        this.f33857f = typedArray.getDimensionPixelOffset(C6747k.f26228K2, 0);
        int i10 = C6747k.f26264O2;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f33858g = dimensionPixelSize;
            m37135z(this.f33853b.m27784w(dimensionPixelSize));
            this.f33867p = true;
        }
        this.f33859h = typedArray.getDimensionPixelSize(C6747k.f26354Y2, 0);
        this.f33860i = C0146r.m454i(typedArray.getInt(C6747k.f26255N2, -1), PorterDuff.Mode.SRC_IN);
        this.f33861j = C5050c.m23736a(this.f33852a.getContext(), typedArray, C6747k.f26246M2);
        this.f33862k = C5050c.m23736a(this.f33852a.getContext(), typedArray, C6747k.f26345X2);
        this.f33863l = C5050c.m23736a(this.f33852a.getContext(), typedArray, C6747k.f26336W2);
        this.f33868q = typedArray.getBoolean(C6747k.f26237L2, false);
        this.f33871t = typedArray.getDimensionPixelSize(C6747k.f26273P2, 0);
        this.f33869r = typedArray.getBoolean(C6747k.f26363Z2, true);
        int iM2986E = C0625o0.m2986E(this.f33852a);
        int paddingTop = this.f33852a.getPaddingTop();
        int iM2984D = C0625o0.m2984D(this.f33852a);
        int paddingBottom = this.f33852a.getPaddingBottom();
        if (typedArray.hasValue(C6747k.f26192G2)) {
            m37129t();
        } else {
            m37106H();
        }
        C0625o0.m2981B0(this.f33852a, iM2986E + this.f33854c, paddingTop + this.f33856e, iM2984D + this.f33855d, paddingBottom + this.f33857f);
    }

    /* JADX INFO: renamed from: s */
    public void m37128s(int i10) {
        if (m37115f() != null) {
            m37115f().setTint(i10);
        }
    }

    /* JADX INFO: renamed from: t */
    public void m37129t() {
        this.f33866o = true;
        this.f33852a.setSupportBackgroundTintList(this.f33861j);
        this.f33852a.setSupportBackgroundTintMode(this.f33860i);
    }

    /* JADX INFO: renamed from: u */
    public void m37130u(boolean z10) {
        this.f33868q = z10;
    }

    /* JADX INFO: renamed from: v */
    public void m37131v(int i10) {
        if (this.f33867p && this.f33858g == i10) {
            return;
        }
        this.f33858g = i10;
        this.f33867p = true;
        m37135z(this.f33853b.m27784w(i10));
    }

    /* JADX INFO: renamed from: w */
    public void m37132w(int i10) {
        m37105G(this.f33856e, i10);
    }

    /* JADX INFO: renamed from: x */
    public void m37133x(int i10) {
        m37105G(i10, this.f33857f);
    }

    /* JADX INFO: renamed from: y */
    public void m37134y(ColorStateList colorStateList) {
        if (this.f33863l != colorStateList) {
            this.f33863l = colorStateList;
            boolean z10 = f33850u;
            if (z10 && (this.f33852a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f33852a.getBackground()).setColor(C5584b.m25241a(colorStateList));
            } else {
                if (z10 || !(this.f33852a.getBackground() instanceof C5583a)) {
                    return;
                }
                ((C5583a) this.f33852a.getBackground()).setTintList(C5584b.m25241a(colorStateList));
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public void m37135z(@NonNull C6367k c6367k) {
        this.f33853b = c6367k;
        m37107I(c6367k);
    }
}
