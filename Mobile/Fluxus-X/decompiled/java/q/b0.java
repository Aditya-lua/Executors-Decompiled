package q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f29445a;
    public z0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0 f29446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z0 f29447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0 f29448e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z0 f29449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z0 f29450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z0 f29451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final d0 f29452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29453j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f29454k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f29455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f29456m;

    public class a extends n2.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f29457a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f29458c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f29457a = i10;
            this.b = i11;
            this.f29458c = weakReference;
        }

        @Override // n2.h.f
        public void f(int i10) {
        }

        @Override // n2.h.f
        public void g(@NonNull Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f29457a) != -1) {
                typeface = e.a(typeface, i10, (this.b & 2) != 0);
            }
            b0.this.n(this.f29458c, typeface);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f29460a;
        public final /* synthetic */ Typeface b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f29461c;

        public b(TextView textView, Typeface typeface, int i10) {
            this.f29460a = textView;
            this.b = typeface;
            this.f29461c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29460a.setTypeface(this.b, this.f29461c);
        }
    }

    public static class c {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    public static class d {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        public static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public static class e {
        public static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public b0(@NonNull TextView textView) {
        this.f29445a = textView;
        this.f29452i = new d0(textView);
    }

    public static z0 d(Context context, k kVar, int i10) {
        ColorStateList colorStateListF = kVar.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        z0 z0Var = new z0();
        z0Var.f29714d = true;
        z0Var.f29712a = colorStateListF;
        return z0Var;
    }

    public void A(int i10, float f10) {
        if (h1.f29527c || l()) {
            return;
        }
        B(i10, f10);
    }

    public final void B(int i10, float f10) {
        this.f29452i.t(i10, f10);
    }

    public final void C(Context context, b1 b1Var) {
        String strO;
        this.f29453j = b1Var.k(i.j.X2, this.f29453j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = b1Var.k(i.j.f18865a3, -1);
            this.f29454k = iK;
            if (iK != -1) {
                this.f29453j &= 2;
            }
        }
        if (!b1Var.s(i.j.Z2) && !b1Var.s(i.j.f18869b3)) {
            if (b1Var.s(i.j.W2)) {
                this.f29456m = false;
                int iK2 = b1Var.k(i.j.W2, 1);
                if (iK2 == 1) {
                    this.f29455l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f29455l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f29455l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f29455l = null;
        int i11 = b1Var.s(i.j.f18869b3) ? i.j.f18869b3 : i.j.Z2;
        int i12 = this.f29454k;
        int i13 = this.f29453j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = b1Var.j(i11, this.f29453j, new a(i12, i13, new WeakReference(this.f29445a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f29454k == -1) {
                        this.f29455l = typefaceJ;
                    } else {
                        this.f29455l = e.a(Typeface.create(typefaceJ, 0), this.f29454k, (this.f29453j & 2) != 0);
                    }
                }
                this.f29456m = this.f29455l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f29455l != null || (strO = b1Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f29454k == -1) {
            this.f29455l = Typeface.create(strO, this.f29453j);
        } else {
            this.f29455l = e.a(Typeface.create(strO, 0), this.f29454k, (this.f29453j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, z0 z0Var) {
        if (drawable == null || z0Var == null) {
            return;
        }
        k.i(drawable, z0Var, this.f29445a.getDrawableState());
    }

    public void b() {
        if (this.b != null || this.f29446c != null || this.f29447d != null || this.f29448e != null) {
            Drawable[] compoundDrawables = this.f29445a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.f29446c);
            a(compoundDrawables[2], this.f29447d);
            a(compoundDrawables[3], this.f29448e);
        }
        if (this.f29449f == null && this.f29450g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f29445a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f29449f);
        a(compoundDrawablesRelative[2], this.f29450g);
    }

    public void c() {
        this.f29452i.a();
    }

    public int e() {
        return this.f29452i.f();
    }

    public int f() {
        return this.f29452i.g();
    }

    public int g() {
        return this.f29452i.h();
    }

    public int[] h() {
        return this.f29452i.i();
    }

    public int i() {
        return this.f29452i.j();
    }

    public ColorStateList j() {
        z0 z0Var = this.f29451h;
        if (z0Var != null) {
            return z0Var.f29712a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        z0 z0Var = this.f29451h;
        if (z0Var != null) {
            return z0Var.b;
        }
        return null;
    }

    public boolean l() {
        return this.f29452i.n();
    }

    @SuppressLint({"NewApi"})
    public void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strO;
        String strO2;
        int iB;
        float f10;
        Context context = this.f29445a.getContext();
        k kVarB = k.b();
        b1 b1VarV = b1.v(context, attributeSet, i.j.f18862a0, i10, 0);
        TextView textView = this.f29445a;
        androidx.core.view.o0.k0(textView, textView.getContext(), i.j.f18862a0, attributeSet, b1VarV.r(), i10, 0);
        int iN = b1VarV.n(i.j.f18866b0, -1);
        if (b1VarV.s(i.j.f18881e0)) {
            this.b = d(context, kVarB, b1VarV.n(i.j.f18881e0, 0));
        }
        if (b1VarV.s(i.j.f18871c0)) {
            this.f29446c = d(context, kVarB, b1VarV.n(i.j.f18871c0, 0));
        }
        if (b1VarV.s(i.j.f18886f0)) {
            this.f29447d = d(context, kVarB, b1VarV.n(i.j.f18886f0, 0));
        }
        if (b1VarV.s(i.j.f18876d0)) {
            this.f29448e = d(context, kVarB, b1VarV.n(i.j.f18876d0, 0));
        }
        if (b1VarV.s(i.j.f18891g0)) {
            this.f29449f = d(context, kVarB, b1VarV.n(i.j.f18891g0, 0));
        }
        if (b1VarV.s(i.j.f18896h0)) {
            this.f29450g = d(context, kVarB, b1VarV.n(i.j.f18896h0, 0));
        }
        b1VarV.x();
        boolean z11 = this.f29445a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z12 = true;
        if (iN != -1) {
            b1 b1VarT = b1.t(context, iN, i.j.U2);
            if (z11 || !b1VarT.s(i.j.f18879d3)) {
                zA = false;
                z10 = false;
            } else {
                zA = b1VarT.a(i.j.f18879d3, false);
                z10 = true;
            }
            C(context, b1VarT);
            strO = b1VarT.s(i.j.f18884e3) ? b1VarT.o(i.j.f18884e3) : null;
            strO2 = b1VarT.s(i.j.f18874c3) ? b1VarT.o(i.j.f18874c3) : null;
            b1VarT.x();
        } else {
            zA = false;
            z10 = false;
            strO = null;
            strO2 = null;
        }
        b1 b1VarV2 = b1.v(context, attributeSet, i.j.U2, i10, 0);
        if (z11 || !b1VarV2.s(i.j.f18879d3)) {
            z12 = z10;
        } else {
            zA = b1VarV2.a(i.j.f18879d3, false);
        }
        int i11 = Build.VERSION.SDK_INT;
        if (b1VarV2.s(i.j.f18884e3)) {
            strO = b1VarV2.o(i.j.f18884e3);
        }
        if (b1VarV2.s(i.j.f18874c3)) {
            strO2 = b1VarV2.o(i.j.f18874c3);
        }
        if (i11 >= 28 && b1VarV2.s(i.j.V2) && b1VarV2.f(i.j.V2, -1) == 0) {
            this.f29445a.setTextSize(0, 0.0f);
        }
        C(context, b1VarV2);
        b1VarV2.x();
        if (!z11 && z12) {
            s(zA);
        }
        Typeface typeface = this.f29455l;
        if (typeface != null) {
            if (this.f29454k == -1) {
                this.f29445a.setTypeface(typeface, this.f29453j);
            } else {
                this.f29445a.setTypeface(typeface);
            }
        }
        if (strO2 != null) {
            d.d(this.f29445a, strO2);
        }
        if (strO != null) {
            c.b(this.f29445a, c.a(strO));
        }
        this.f29452i.o(attributeSet, i10);
        if (h1.f29527c && this.f29452i.j() != 0) {
            int[] iArrI = this.f29452i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f29445a) != -1.0f) {
                    d.b(this.f29445a, this.f29452i.g(), this.f29452i.f(), this.f29452i.h(), 0);
                } else {
                    d.c(this.f29445a, iArrI, 0);
                }
            }
        }
        b1 b1VarU = b1.u(context, attributeSet, i.j.f18901i0);
        int iN2 = b1VarU.n(i.j.f18941q0, -1);
        Drawable drawableC = iN2 != -1 ? kVarB.c(context, iN2) : null;
        int iN3 = b1VarU.n(i.j.f18966v0, -1);
        Drawable drawableC2 = iN3 != -1 ? kVarB.c(context, iN3) : null;
        int iN4 = b1VarU.n(i.j.f18946r0, -1);
        Drawable drawableC3 = iN4 != -1 ? kVarB.c(context, iN4) : null;
        int iN5 = b1VarU.n(i.j.f18931o0, -1);
        Drawable drawableC4 = iN5 != -1 ? kVarB.c(context, iN5) : null;
        int iN6 = b1VarU.n(i.j.f18951s0, -1);
        Drawable drawableC5 = iN6 != -1 ? kVarB.c(context, iN6) : null;
        int iN7 = b1VarU.n(i.j.f18936p0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? kVarB.c(context, iN7) : null);
        if (b1VarU.s(i.j.f18956t0)) {
            d3.i.k(this.f29445a, b1VarU.c(i.j.f18956t0));
        }
        if (b1VarU.s(i.j.f18961u0)) {
            d3.i.l(this.f29445a, l0.e(b1VarU.k(i.j.f18961u0, -1), null));
        }
        int iF = b1VarU.f(i.j.f18976x0, -1);
        int iF2 = b1VarU.f(i.j.f18981y0, -1);
        if (b1VarU.s(i.j.f18986z0)) {
            TypedValue typedValueW = b1VarU.w(i.j.f18986z0);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = b1VarU.f(i.j.f18986z0, -1);
                iB = -1;
            } else {
                iB = x2.i.b(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iB = -1;
            f10 = -1.0f;
        }
        b1VarU.x();
        if (iF != -1) {
            d3.i.n(this.f29445a, iF);
        }
        if (iF2 != -1) {
            d3.i.o(this.f29445a, iF2);
        }
        if (f10 != -1.0f) {
            if (iB == -1) {
                d3.i.p(this.f29445a, (int) f10);
            } else {
                d3.i.q(this.f29445a, iB, f10);
            }
        }
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f29456m) {
            this.f29455l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f29453j));
                } else {
                    textView.setTypeface(typeface, this.f29453j);
                }
            }
        }
    }

    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (h1.f29527c) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String strO;
        b1 b1VarT = b1.t(context, i10, i.j.U2);
        if (b1VarT.s(i.j.f18879d3)) {
            s(b1VarT.a(i.j.f18879d3, false));
        }
        if (b1VarT.s(i.j.V2) && b1VarT.f(i.j.V2, -1) == 0) {
            this.f29445a.setTextSize(0, 0.0f);
        }
        C(context, b1VarT);
        if (b1VarT.s(i.j.f18874c3) && (strO = b1VarT.o(i.j.f18874c3)) != null) {
            d.d(this.f29445a, strO);
        }
        b1VarT.x();
        Typeface typeface = this.f29455l;
        if (typeface != null) {
            this.f29445a.setTypeface(typeface, this.f29453j);
        }
    }

    public void r(@NonNull TextView textView, InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        a3.a.e(editorInfo, textView.getText());
    }

    public void s(boolean z10) {
        this.f29445a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) {
        this.f29452i.p(i10, i11, i12, i13);
    }

    public void u(@NonNull int[] iArr, int i10) {
        this.f29452i.q(iArr, i10);
    }

    public void v(int i10) {
        this.f29452i.r(i10);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f29451h == null) {
            this.f29451h = new z0();
        }
        z0 z0Var = this.f29451h;
        z0Var.f29712a = colorStateList;
        z0Var.f29714d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f29451h == null) {
            this.f29451h = new z0();
        }
        z0 z0Var = this.f29451h;
        z0Var.b = mode;
        z0Var.f29713c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f29445a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f29445a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f29445a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f29445a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f29445a.getCompoundDrawables();
        TextView textView2 = this.f29445a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        z0 z0Var = this.f29451h;
        this.b = z0Var;
        this.f29446c = z0Var;
        this.f29447d = z0Var;
        this.f29448e = z0Var;
        this.f29449f = z0Var;
        this.f29450g = z0Var;
    }
}
