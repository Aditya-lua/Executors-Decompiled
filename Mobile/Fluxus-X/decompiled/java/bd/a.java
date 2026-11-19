package bd;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final boolean f3870t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NonNull
    public static final Paint f3871u0 = null;
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public fd.a D;
    public fd.a E;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public boolean K;
    public Bitmap L;
    public Paint M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public int[] T;
    public boolean U;

    @NonNull
    public final TextPaint V;

    @NonNull
    public final TextPaint W;
    public TimeInterpolator X;
    public TimeInterpolator Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f3872a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f3873a0;
    public float b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f3874b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3875c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f3876c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3877d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f3878d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3879e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f3880e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3881f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f3882f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Rect f3883g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorStateList f3884g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Rect f3885h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f3886h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RectF f3887i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f3888i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f3890j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public StaticLayout f3892k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f3894l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f3896m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f3897n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f3898n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f3899o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public CharSequence f3900o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3901p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f3903q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f3905r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f3907s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f3909t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f3910u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f3911v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f3912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f3913x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f3914y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Typeface f3915z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3889j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3891k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f3893l = 15.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f3895m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f3902p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f3904q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f3906r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f3908s0 = k.f3932n;

    /* JADX INFO: renamed from: bd.a$a, reason: collision with other inner class name */
    public class C0081a implements fd.a.InterfaceC0294a {
        public C0081a() {
        }

        @Override // fd.a.InterfaceC0294a
        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f3872a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f3885h = new Rect();
        this.f3883g = new Rect();
        this.f3887i = new RectF();
        this.f3879e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    public static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    public static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return kc.a.a(f10, f11, f12);
    }

    public static boolean L(@NonNull Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public final void A(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f3893l);
        textPaint.setTypeface(this.f3915z);
        textPaint.setLetterSpacing(this.f3888i0);
    }

    public final void B(float f10) {
        if (this.f3875c) {
            this.f3887i.set(f10 < this.f3879e ? this.f3883g : this.f3885h);
            return;
        }
        this.f3887i.left = G(this.f3883g.left, this.f3885h.left, f10, this.X);
        this.f3887i.top = G(this.f3903q, this.f3905r, f10, this.X);
        this.f3887i.right = G(this.f3883g.right, this.f3885h.right, f10, this.X);
        this.f3887i.bottom = G(this.f3883g.bottom, this.f3885h.bottom, f10, this.X);
    }

    public final boolean D() {
        return o0.z(this.f3872a) == 1;
    }

    public final boolean E() {
        ColorStateList colorStateList = this.f3899o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f3897n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final boolean F(@NonNull CharSequence charSequence, boolean z10) {
        return (z10 ? w2.g.f35547d : w2.g.f35546c).isRtl(charSequence, 0, charSequence.length());
    }

    public void H(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f3914y;
            if (typeface != null) {
                this.f3913x = fd.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = fd.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f3913x;
            if (typeface3 == null) {
                typeface3 = this.f3914y;
            }
            this.f3912w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f3915z = typeface4;
            K(true);
        }
    }

    public final float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void J() {
        K(false);
    }

    public void K(boolean z10) {
        if ((this.f3872a.getHeight() <= 0 || this.f3872a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f3899o == colorStateList && this.f3897n == colorStateList) {
            return;
        }
        this.f3899o = colorStateList;
        this.f3897n = colorStateList;
        J();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (L(this.f3885h, i10, i11, i12, i13)) {
            return;
        }
        this.f3885h.set(i10, i11, i12, i13);
        this.U = true;
    }

    public void O(@NonNull Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        fd.d dVar = new fd.d(this.f3872a.getContext(), i10);
        if (dVar.i() != null) {
            this.f3899o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f3895m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f15905c;
        if (colorStateList != null) {
            this.f3876c0 = colorStateList;
        }
        this.f3873a0 = dVar.f15910h;
        this.f3874b0 = dVar.f15911i;
        this.Z = dVar.f15912j;
        this.f3886h0 = dVar.f15914l;
        fd.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new fd.a(new C0081a(), dVar.e());
        dVar.h(this.f3872a.getContext(), this.E);
        J();
    }

    public final void Q(float f10) {
        this.f3896m0 = f10;
        o0.d0(this.f3872a);
    }

    public void R(ColorStateList colorStateList) {
        if (this.f3899o != colorStateList) {
            this.f3899o = colorStateList;
            J();
        }
    }

    public void S(int i10) {
        if (this.f3891k != i10) {
            this.f3891k = i10;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public final boolean U(Typeface typeface) {
        fd.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f3914y == typeface) {
            return false;
        }
        this.f3914y = typeface;
        Typeface typefaceB = fd.h.b(this.f3872a.getContext().getResources().getConfiguration(), typeface);
        this.f3913x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f3914y;
        }
        this.f3912w = typefaceB;
        return true;
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (L(this.f3883g, i10, i11, i12, i13)) {
            return;
        }
        this.f3883g.set(i10, i11, i12, i13);
        this.U = true;
    }

    public void W(@NonNull Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f3888i0 != f10) {
            this.f3888i0 = f10;
            J();
        }
    }

    public final void Y(float f10) {
        this.f3898n0 = f10;
        o0.d0(this.f3872a);
    }

    public void Z(int i10) {
        if (this.f3889j != i10) {
            this.f3889j = i10;
            J();
        }
    }

    public void a0(float f10) {
        if (this.f3893l != f10) {
            this.f3893l = f10;
            J();
        }
    }

    public final void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout = this.f3892k0) != null) {
            this.f3900o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.f3900o0;
        float fI = 0.0f;
        if (charSequence2 != null) {
            this.f3894l0 = I(this.V, charSequence2);
        } else {
            this.f3894l0 = 0.0f;
        }
        int iB = androidx.core.view.k.b(this.f3891k, this.I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            this.f3905r = this.f3885h.top;
        } else if (i10 != 80) {
            this.f3905r = this.f3885h.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
        } else {
            this.f3905r = this.f3885h.bottom + this.V.ascent();
        }
        int i11 = iB & 8388615;
        if (i11 == 1) {
            this.f3909t = this.f3885h.centerX() - (this.f3894l0 / 2.0f);
        } else if (i11 != 5) {
            this.f3909t = this.f3885h.left;
        } else {
            this.f3909t = this.f3885h.right - this.f3894l0;
        }
        i(0.0f, z10);
        StaticLayout staticLayout2 = this.f3892k0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f3892k0;
        if (staticLayout3 == null || this.f3902p0 <= 1) {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                fI = I(this.V, charSequence3);
            }
        } else {
            fI = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f3892k0;
        this.f3901p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int iB2 = androidx.core.view.k.b(this.f3889j, this.I ? 1 : 0);
        int i12 = iB2 & 112;
        if (i12 == 48) {
            this.f3903q = this.f3883g.top;
        } else if (i12 != 80) {
            this.f3903q = this.f3883g.centerY() - (height / 2.0f);
        } else {
            this.f3903q = (this.f3883g.bottom - height) + this.V.descent();
        }
        int i13 = iB2 & 8388615;
        if (i13 == 1) {
            this.f3907s = this.f3883g.centerX() - (fI / 2.0f);
        } else if (i13 != 5) {
            this.f3907s = this.f3883g.left;
        } else {
            this.f3907s = this.f3883g.right - fI;
        }
        j();
        d0(this.b);
    }

    public final boolean b0(Typeface typeface) {
        fd.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface typefaceB = fd.h.b(this.f3872a.getContext().getResources().getConfiguration(), typeface);
        this.A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.B;
        }
        this.f3915z = typefaceB;
        return true;
    }

    public final void c() {
        g(this.b);
    }

    public void c0(float f10) {
        float fB = s2.a.b(f10, 0.0f, 1.0f);
        if (fB != this.b) {
            this.b = fB;
            c();
        }
    }

    public final float d(float f10) {
        float f11 = this.f3879e;
        return f10 <= f11 ? kc.a.b(1.0f, 0.0f, this.f3877d, f11, f10) : kc.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    public final void d0(float f10) {
        h(f10);
        boolean z10 = f3870t0 && this.N != 1.0f;
        this.K = z10;
        if (z10) {
            n();
        }
        o0.d0(this.f3872a);
    }

    public final float e() {
        float f10 = this.f3877d;
        return f10 + ((1.0f - f10) * 0.5f);
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        J();
    }

    public final boolean f(@NonNull CharSequence charSequence) {
        boolean zD = D();
        return this.J ? F(charSequence, zD) : zD;
    }

    public final boolean f0(int[] iArr) {
        this.T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public final void g(float f10) {
        float f11;
        B(f10);
        if (!this.f3875c) {
            this.f3910u = G(this.f3907s, this.f3909t, f10, this.X);
            this.f3911v = G(this.f3903q, this.f3905r, f10, this.X);
            d0(f10);
            f11 = f10;
        } else if (f10 < this.f3879e) {
            this.f3910u = this.f3907s;
            this.f3911v = this.f3903q;
            d0(0.0f);
            f11 = 0.0f;
        } else {
            this.f3910u = this.f3909t;
            this.f3911v = this.f3905r - Math.max(0, this.f3881f);
            d0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = kc.a.b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f3899o != this.f3897n) {
            this.V.setColor(a(v(), t(), f11));
        } else {
            this.V.setColor(t());
        }
        int i10 = Build.VERSION.SDK_INT;
        float f12 = this.f3886h0;
        float f13 = this.f3888i0;
        if (f12 != f13) {
            this.V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f12);
        }
        this.P = G(this.f3878d0, this.Z, f10, null);
        this.Q = G(this.f3880e0, this.f3873a0, f10, null);
        this.R = G(this.f3882f0, this.f3874b0, f10, null);
        int iA = a(u(this.f3884g0), u(this.f3876c0), f10);
        this.S = iA;
        this.V.setShadowLayer(this.P, this.Q, this.R, iA);
        if (this.f3875c) {
            this.V.setAlpha((int) (d(f10) * this.V.getAlpha()));
            if (i10 >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, vc.a.a(this.S, textPaint.getAlpha()));
            }
        }
        o0.d0(this.f3872a);
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            J();
        }
    }

    public final void h(float f10) {
        i(f10, false);
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        J();
    }

    public final void i(float f10, boolean z10) {
        float f11;
        float f12;
        Typeface typeface;
        if (this.G == null) {
            return;
        }
        float fWidth = this.f3885h.width();
        float fWidth2 = this.f3883g.width();
        if (C(f10, 1.0f)) {
            f11 = this.f3895m;
            f12 = this.f3886h0;
            this.N = 1.0f;
            typeface = this.f3912w;
        } else {
            float f13 = this.f3893l;
            float f14 = this.f3888i0;
            Typeface typeface2 = this.f3915z;
            if (C(f10, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = G(this.f3893l, this.f3895m, f10, this.Y) / this.f3893l;
            }
            float f15 = this.f3895m / this.f3893l;
            fWidth = (z10 || this.f3875c || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        boolean z11 = false;
        if (fWidth > 0.0f) {
            boolean z12 = this.O != f11;
            boolean z13 = this.f3890j0 != f12;
            boolean z14 = this.C != typeface;
            StaticLayout staticLayout = this.f3892k0;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.U;
            this.O = f11;
            this.f3890j0 = f12;
            this.C = typeface;
            this.U = false;
            this.V.setLinearText(this.N != 1.0f);
            z11 = z15;
        }
        if (this.H == null || z11) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.f3890j0);
            this.I = f(this.G);
            StaticLayout staticLayoutK = k(j0() ? this.f3902p0 : 1, fWidth, this.I);
            this.f3892k0 = staticLayoutK;
            this.H = staticLayoutK.getText();
        }
    }

    public void i0(Typeface typeface) {
        boolean zU = U(typeface);
        boolean zB0 = b0(typeface);
        if (zU || zB0) {
            J();
        }
    }

    public final void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    public final boolean j0() {
        if (this.f3902p0 > 1) {
            return (!this.I || this.f3875c) && !this.K;
        }
        return false;
    }

    public final StaticLayout k(int i10, float f10, boolean z10) {
        return (StaticLayout) x2.g.g(k.b(this.G, this.V, (int) f10).d(this.F).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f3904q0, this.f3906r0).e(this.f3908s0).j(null).a());
    }

    public void l(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.H == null || this.f3887i.width() <= 0.0f || this.f3887i.height() <= 0.0f) {
            return;
        }
        this.V.setTextSize(this.O);
        float f10 = this.f3910u;
        float f11 = this.f3911v;
        boolean z10 = this.K && this.L != null;
        float f12 = this.N;
        if (f12 != 1.0f && !this.f3875c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.L, f10, f11, this.M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!j0() || (this.f3875c && this.b <= this.f3879e)) {
            canvas.translate(f10, f11);
            this.f3892k0.draw(canvas);
        } else {
            m(canvas, this.f3910u - this.f3892k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    public final void m(@NonNull Canvas canvas, float f10, float f11) {
        int alpha = this.V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f3875c) {
            this.V.setAlpha((int) (this.f3898n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, vc.a.a(this.S, textPaint.getAlpha()));
            }
            this.f3892k0.draw(canvas);
        }
        if (!this.f3875c) {
            this.V.setAlpha((int) (this.f3896m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, vc.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f3892k0.getLineBaseline(0);
        CharSequence charSequence = this.f3900o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.V);
        if (i10 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.f3875c) {
            return;
        }
        String strTrim = this.f3900o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f3892k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.V);
    }

    public final void n() {
        if (this.L != null || this.f3883g.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.f3892k0.getWidth();
        int height = this.f3892k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f3892k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    public void o(@NonNull RectF rectF, int i10, int i11) {
        this.I = f(this.G);
        rectF.left = Math.max(r(i10, i11), this.f3885h.left);
        rectF.top = this.f3885h.top;
        rectF.right = Math.min(s(rectF, i10, i11), this.f3885h.right);
        rectF.bottom = this.f3885h.top + q();
    }

    public ColorStateList p() {
        return this.f3899o;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public final float r(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (this.f3894l0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.I ? this.f3885h.left : this.f3885h.right - this.f3894l0;
        }
        return this.I ? this.f3885h.right - this.f3894l0 : this.f3885h.left;
    }

    public final float s(@NonNull RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (this.f3894l0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.I ? rectF.left + this.f3894l0 : this.f3885h.right;
        }
        return this.I ? this.f3885h.right : rectF.left + this.f3894l0;
    }

    public int t() {
        return u(this.f3899o);
    }

    public final int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int v() {
        return u(this.f3897n);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.b;
    }

    public final Layout.Alignment y() {
        int iB = androidx.core.view.k.b(this.f3889j, this.I ? 1 : 0) & 7;
        if (iB == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (iB != 5) {
            return this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public final void z(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f3895m);
        textPaint.setTypeface(this.f3912w);
        textPaint.setLetterSpacing(this.f3886h0);
    }
}
