package ad;

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
    public static final boolean f313t0 = false;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NonNull
    public static final Paint f314u0 = null;
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public ed.a D;
    public ed.a E;
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
    public final View f315a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f316a0;
    public float b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f317b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f318c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ColorStateList f319c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f320d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f321d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f322e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f323e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f324f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f325f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    public final Rect f326g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ColorStateList f327g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    public final Rect f328h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f329h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final RectF f330i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f331i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f333j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public StaticLayout f335k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f337l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f339m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ColorStateList f340n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f341n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f342o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public CharSequence f343o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f344p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f346q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f350s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f352t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f353u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f354v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f355w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f356x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f357y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Typeface f358z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f332j = 16;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f334k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f336l = 15.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f338m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f345p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f347q0 = 0.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f349r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f351s0 = k.f375n;

    /* JADX INFO: renamed from: ad.a$a, reason: collision with other inner class name */
    public class C0003a implements ed.a.InterfaceC0296a {
        public C0003a() {
        }

        @Override // ed.a.InterfaceC0296a
        public void a(Typeface typeface) {
            a.this.T(typeface);
        }
    }

    public a(View view) {
        this.f315a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f328h = new Rect();
        this.f326g = new Rect();
        this.f330i = new RectF();
        this.f322e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    public static boolean C(float f10, float f11) {
        return Math.abs(f10 - f11) < 1.0E-5f;
    }

    public static float G(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return jc.a.a(f10, f11, f12);
    }

    public static boolean L(@NonNull Rect rect, int i10, int i11, int i12, int i13) {
        return rect.left == i10 && rect.top == i11 && rect.right == i12 && rect.bottom == i13;
    }

    public static int a(int i10, int i11, float f10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f11) + (Color.alpha(i11) * f10)), Math.round((Color.red(i10) * f11) + (Color.red(i11) * f10)), Math.round((Color.green(i10) * f11) + (Color.green(i11) * f10)), Math.round((Color.blue(i10) * f11) + (Color.blue(i11) * f10)));
    }

    public final void A(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f336l);
        textPaint.setTypeface(this.f358z);
        textPaint.setLetterSpacing(this.f331i0);
    }

    public final void B(float f10) {
        if (this.f318c) {
            this.f330i.set(f10 < this.f322e ? this.f326g : this.f328h);
            return;
        }
        this.f330i.left = G(this.f326g.left, this.f328h.left, f10, this.X);
        this.f330i.top = G(this.f346q, this.f348r, f10, this.X);
        this.f330i.right = G(this.f326g.right, this.f328h.right, f10, this.X);
        this.f330i.bottom = G(this.f326g.bottom, this.f328h.bottom, f10, this.X);
    }

    public final boolean D() {
        return o0.z(this.f315a) == 1;
    }

    public final boolean E() {
        ColorStateList colorStateList = this.f342o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f340n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final boolean F(@NonNull CharSequence charSequence, boolean z10) {
        return (z10 ? w2.g.f33858d : w2.g.f33857c).isRtl(charSequence, 0, charSequence.length());
    }

    public void H(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f357y;
            if (typeface != null) {
                this.f356x = ed.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = ed.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f356x;
            if (typeface3 == null) {
                typeface3 = this.f357y;
            }
            this.f355w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f358z = typeface4;
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
        if ((this.f315a.getHeight() <= 0 || this.f315a.getWidth() <= 0) && !z10) {
            return;
        }
        b(z10);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f342o == colorStateList && this.f340n == colorStateList) {
            return;
        }
        this.f342o = colorStateList;
        this.f340n = colorStateList;
        J();
    }

    public void N(int i10, int i11, int i12, int i13) {
        if (L(this.f328h, i10, i11, i12, i13)) {
            return;
        }
        this.f328h.set(i10, i11, i12, i13);
        this.U = true;
    }

    public void O(@NonNull Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i10) {
        ed.d dVar = new ed.d(this.f315a.getContext(), i10);
        if (dVar.i() != null) {
            this.f342o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f338m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f16049c;
        if (colorStateList != null) {
            this.f319c0 = colorStateList;
        }
        this.f316a0 = dVar.f16054h;
        this.f317b0 = dVar.f16055i;
        this.Z = dVar.f16056j;
        this.f329h0 = dVar.f16058l;
        ed.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new ed.a(new C0003a(), dVar.e());
        dVar.h(this.f315a.getContext(), this.E);
        J();
    }

    public final void Q(float f10) {
        this.f339m0 = f10;
        o0.d0(this.f315a);
    }

    public void R(ColorStateList colorStateList) {
        if (this.f342o != colorStateList) {
            this.f342o = colorStateList;
            J();
        }
    }

    public void S(int i10) {
        if (this.f334k != i10) {
            this.f334k = i10;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public final boolean U(Typeface typeface) {
        ed.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f357y == typeface) {
            return false;
        }
        this.f357y = typeface;
        Typeface typefaceB = ed.h.b(this.f315a.getContext().getResources().getConfiguration(), typeface);
        this.f356x = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.f357y;
        }
        this.f355w = typefaceB;
        return true;
    }

    public void V(int i10, int i11, int i12, int i13) {
        if (L(this.f326g, i10, i11, i12, i13)) {
            return;
        }
        this.f326g.set(i10, i11, i12, i13);
        this.U = true;
    }

    public void W(@NonNull Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f10) {
        if (this.f331i0 != f10) {
            this.f331i0 = f10;
            J();
        }
    }

    public final void Y(float f10) {
        this.f341n0 = f10;
        o0.d0(this.f315a);
    }

    public void Z(int i10) {
        if (this.f332j != i10) {
            this.f332j = i10;
            J();
        }
    }

    public void a0(float f10) {
        if (this.f336l != f10) {
            this.f336l = f10;
            J();
        }
    }

    public final void b(boolean z10) {
        StaticLayout staticLayout;
        i(1.0f, z10);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout = this.f335k0) != null) {
            this.f343o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.f343o0;
        float fI = 0.0f;
        if (charSequence2 != null) {
            this.f337l0 = I(this.V, charSequence2);
        } else {
            this.f337l0 = 0.0f;
        }
        int iB = androidx.core.view.k.b(this.f334k, this.I ? 1 : 0);
        int i10 = iB & 112;
        if (i10 == 48) {
            this.f348r = this.f328h.top;
        } else if (i10 != 80) {
            this.f348r = this.f328h.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
        } else {
            this.f348r = this.f328h.bottom + this.V.ascent();
        }
        int i11 = iB & 8388615;
        if (i11 == 1) {
            this.f352t = this.f328h.centerX() - (this.f337l0 / 2.0f);
        } else if (i11 != 5) {
            this.f352t = this.f328h.left;
        } else {
            this.f352t = this.f328h.right - this.f337l0;
        }
        i(0.0f, z10);
        StaticLayout staticLayout2 = this.f335k0;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.f335k0;
        if (staticLayout3 == null || this.f345p0 <= 1) {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                fI = I(this.V, charSequence3);
            }
        } else {
            fI = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.f335k0;
        this.f344p = staticLayout4 != null ? staticLayout4.getLineCount() : 0;
        int iB2 = androidx.core.view.k.b(this.f332j, this.I ? 1 : 0);
        int i12 = iB2 & 112;
        if (i12 == 48) {
            this.f346q = this.f326g.top;
        } else if (i12 != 80) {
            this.f346q = this.f326g.centerY() - (height / 2.0f);
        } else {
            this.f346q = (this.f326g.bottom - height) + this.V.descent();
        }
        int i13 = iB2 & 8388615;
        if (i13 == 1) {
            this.f350s = this.f326g.centerX() - (fI / 2.0f);
        } else if (i13 != 5) {
            this.f350s = this.f326g.left;
        } else {
            this.f350s = this.f326g.right - fI;
        }
        j();
        d0(this.b);
    }

    public final boolean b0(Typeface typeface) {
        ed.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface typefaceB = ed.h.b(this.f315a.getContext().getResources().getConfiguration(), typeface);
        this.A = typefaceB;
        if (typefaceB == null) {
            typefaceB = this.B;
        }
        this.f358z = typefaceB;
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
        float f11 = this.f322e;
        return f10 <= f11 ? jc.a.b(1.0f, 0.0f, this.f320d, f11, f10) : jc.a.b(0.0f, 1.0f, f11, 1.0f, f10);
    }

    public final void d0(float f10) {
        h(f10);
        boolean z10 = f313t0 && this.N != 1.0f;
        this.K = z10;
        if (z10) {
            n();
        }
        o0.d0(this.f315a);
    }

    public final float e() {
        float f10 = this.f320d;
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
        if (!this.f318c) {
            this.f353u = G(this.f350s, this.f352t, f10, this.X);
            this.f354v = G(this.f346q, this.f348r, f10, this.X);
            d0(f10);
            f11 = f10;
        } else if (f10 < this.f322e) {
            this.f353u = this.f350s;
            this.f354v = this.f346q;
            d0(0.0f);
            f11 = 0.0f;
        } else {
            this.f353u = this.f352t;
            this.f354v = this.f348r - Math.max(0, this.f324f);
            d0(1.0f);
            f11 = 1.0f;
        }
        TimeInterpolator timeInterpolator = jc.a.b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f10, timeInterpolator));
        Y(G(1.0f, 0.0f, f10, timeInterpolator));
        if (this.f342o != this.f340n) {
            this.V.setColor(a(v(), t(), f11));
        } else {
            this.V.setColor(t());
        }
        int i10 = Build.VERSION.SDK_INT;
        float f12 = this.f329h0;
        float f13 = this.f331i0;
        if (f12 != f13) {
            this.V.setLetterSpacing(G(f13, f12, f10, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f12);
        }
        this.P = G(this.f321d0, this.Z, f10, null);
        this.Q = G(this.f323e0, this.f316a0, f10, null);
        this.R = G(this.f325f0, this.f317b0, f10, null);
        int iA = a(u(this.f327g0), u(this.f319c0), f10);
        this.S = iA;
        this.V.setShadowLayer(this.P, this.Q, this.R, iA);
        if (this.f318c) {
            this.V.setAlpha((int) (d(f10) * this.V.getAlpha()));
            if (i10 >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, uc.a.a(this.S, textPaint.getAlpha()));
            }
        }
        o0.d0(this.f315a);
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
        float fWidth = this.f328h.width();
        float fWidth2 = this.f326g.width();
        if (C(f10, 1.0f)) {
            f11 = this.f338m;
            f12 = this.f329h0;
            this.N = 1.0f;
            typeface = this.f355w;
        } else {
            float f13 = this.f336l;
            float f14 = this.f331i0;
            Typeface typeface2 = this.f358z;
            if (C(f10, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = G(this.f336l, this.f338m, f10, this.Y) / this.f336l;
            }
            float f15 = this.f338m / this.f336l;
            fWidth = (z10 || this.f318c || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        boolean z11 = false;
        if (fWidth > 0.0f) {
            boolean z12 = this.O != f11;
            boolean z13 = this.f333j0 != f12;
            boolean z14 = this.C != typeface;
            StaticLayout staticLayout = this.f335k0;
            boolean z15 = z12 || z13 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.U;
            this.O = f11;
            this.f333j0 = f12;
            this.C = typeface;
            this.U = false;
            this.V.setLinearText(this.N != 1.0f);
            z11 = z15;
        }
        if (this.H == null || z11) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.f333j0);
            this.I = f(this.G);
            StaticLayout staticLayoutK = k(j0() ? this.f345p0 : 1, fWidth, this.I);
            this.f335k0 = staticLayoutK;
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
        if (this.f345p0 > 1) {
            return (!this.I || this.f318c) && !this.K;
        }
        return false;
    }

    public final StaticLayout k(int i10, float f10, boolean z10) {
        return (StaticLayout) x2.g.g(k.b(this.G, this.V, (int) f10).d(this.F).g(z10).c(i10 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i10).h(this.f347q0, this.f349r0).e(this.f351s0).j(null).a());
    }

    public void l(@NonNull Canvas canvas) {
        int iSave = canvas.save();
        if (this.H == null || this.f330i.width() <= 0.0f || this.f330i.height() <= 0.0f) {
            return;
        }
        this.V.setTextSize(this.O);
        float f10 = this.f353u;
        float f11 = this.f354v;
        boolean z10 = this.K && this.L != null;
        float f12 = this.N;
        if (f12 != 1.0f && !this.f318c) {
            canvas.scale(f12, f12, f10, f11);
        }
        if (z10) {
            canvas.drawBitmap(this.L, f10, f11, this.M);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!j0() || (this.f318c && this.b <= this.f322e)) {
            canvas.translate(f10, f11);
            this.f335k0.draw(canvas);
        } else {
            m(canvas, this.f353u - this.f335k0.getLineStart(0), f11);
        }
        canvas.restoreToCount(iSave);
    }

    public final void m(@NonNull Canvas canvas, float f10, float f11) {
        int alpha = this.V.getAlpha();
        canvas.translate(f10, f11);
        if (!this.f318c) {
            this.V.setAlpha((int) (this.f341n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, uc.a.a(this.S, textPaint.getAlpha()));
            }
            this.f335k0.draw(canvas);
        }
        if (!this.f318c) {
            this.V.setAlpha((int) (this.f339m0 * alpha));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, uc.a.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f335k0.getLineBaseline(0);
        CharSequence charSequence = this.f343o0;
        float f12 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, this.V);
        if (i10 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.f318c) {
            return;
        }
        String strTrim = this.f343o0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f335k0.getLineEnd(0), str.length()), 0.0f, f12, (Paint) this.V);
    }

    public final void n() {
        if (this.L != null || this.f326g.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.f335k0.getWidth();
        int height = this.f335k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f335k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    public void o(@NonNull RectF rectF, int i10, int i11) {
        this.I = f(this.G);
        rectF.left = Math.max(r(i10, i11), this.f328h.left);
        rectF.top = this.f328h.top;
        rectF.right = Math.min(s(rectF, i10, i11), this.f328h.right);
        rectF.bottom = this.f328h.top + q();
    }

    public ColorStateList p() {
        return this.f342o;
    }

    public float q() {
        z(this.W);
        return -this.W.ascent();
    }

    public final float r(int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) - (this.f337l0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.I ? this.f328h.left : this.f328h.right - this.f337l0;
        }
        return this.I ? this.f328h.right - this.f337l0 : this.f328h.left;
    }

    public final float s(@NonNull RectF rectF, int i10, int i11) {
        if (i11 == 17 || (i11 & 7) == 1) {
            return (i10 / 2.0f) + (this.f337l0 / 2.0f);
        }
        if ((i11 & 8388613) == 8388613 || (i11 & 5) == 5) {
            return this.I ? rectF.left + this.f337l0 : this.f328h.right;
        }
        return this.I ? this.f328h.right : rectF.left + this.f337l0;
    }

    public int t() {
        return u(this.f342o);
    }

    public final int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int v() {
        return u(this.f340n);
    }

    public float w() {
        A(this.W);
        return -this.W.ascent();
    }

    public float x() {
        return this.b;
    }

    public final Layout.Alignment y() {
        int iB = androidx.core.view.k.b(this.f332j, this.I ? 1 : 0) & 7;
        if (iB == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (iB != 5) {
            return this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
    }

    public final void z(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f338m);
        textPaint.setTypeface(this.f355w);
        textPaint.setLetterSpacing(this.f329h0);
    }
}
