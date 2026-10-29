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
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final TextView f28904a;
    public y0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y0 f28905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f28906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y0 f28907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y0 f28908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0 f28909g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public y0 f28910h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final c0 f28911i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f28912j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f28913k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f28914l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f28915m;

    public class a extends n2.h.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f28916a;
        public final /* synthetic */ int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f28917c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f28916a = i10;
            this.b = i11;
            this.f28917c = weakReference;
        }

        @Override // n2.h.f
        public void f(int i10) {
        }

        @Override // n2.h.f
        public void g(@NonNull Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f28916a) != -1) {
                typeface = e.a(typeface, i10, (this.b & 2) != 0);
            }
            a0.this.n(this.f28917c, typeface);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f28919a;
        public final /* synthetic */ Typeface b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f28920c;

        public b(TextView textView, Typeface typeface, int i10) {
            this.f28919a = textView;
            this.b = typeface;
            this.f28920c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28919a.setTypeface(this.b, this.f28920c);
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

    public a0(@NonNull TextView textView) {
        this.f28904a = textView;
        this.f28911i = new c0(textView);
    }

    public static y0 d(Context context, k kVar, int i10) {
        ColorStateList colorStateListF = kVar.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        y0 y0Var = new y0();
        y0Var.f29155d = true;
        y0Var.f29153a = colorStateListF;
        return y0Var;
    }

    public void A(int i10, float f10) {
        if (g1.f28984c || l()) {
            return;
        }
        B(i10, f10);
    }

    public final void B(int i10, float f10) {
        this.f28911i.t(i10, f10);
    }

    public final void C(Context context, a1 a1Var) {
        String strO;
        this.f28912j = a1Var.k(i.j.X2, this.f28912j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = a1Var.k(i.j.f20022a3, -1);
            this.f28913k = iK;
            if (iK != -1) {
                this.f28912j &= 2;
            }
        }
        int i11 = i.j.Z2;
        if (!a1Var.s(i11) && !a1Var.s(i.j.f20026b3)) {
            int i12 = i.j.W2;
            if (a1Var.s(i12)) {
                this.f28915m = false;
                int iK2 = a1Var.k(i12, 1);
                if (iK2 == 1) {
                    this.f28914l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f28914l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f28914l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f28914l = null;
        int i13 = i.j.f20026b3;
        if (a1Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f28913k;
        int i15 = this.f28912j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = a1Var.j(i11, this.f28912j, new a(i14, i15, new WeakReference(this.f28904a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f28913k == -1) {
                        this.f28914l = typefaceJ;
                    } else {
                        this.f28914l = e.a(Typeface.create(typefaceJ, 0), this.f28913k, (this.f28912j & 2) != 0);
                    }
                }
                this.f28915m = this.f28914l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f28914l != null || (strO = a1Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f28913k == -1) {
            this.f28914l = Typeface.create(strO, this.f28912j);
        } else {
            this.f28914l = e.a(Typeface.create(strO, 0), this.f28913k, (this.f28912j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, y0 y0Var) {
        if (drawable == null || y0Var == null) {
            return;
        }
        k.i(drawable, y0Var, this.f28904a.getDrawableState());
    }

    public void b() {
        if (this.b != null || this.f28905c != null || this.f28906d != null || this.f28907e != null) {
            Drawable[] compoundDrawables = this.f28904a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.f28905c);
            a(compoundDrawables[2], this.f28906d);
            a(compoundDrawables[3], this.f28907e);
        }
        if (this.f28908f == null && this.f28909g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f28904a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f28908f);
        a(compoundDrawablesRelative[2], this.f28909g);
    }

    public void c() {
        this.f28911i.a();
    }

    public int e() {
        return this.f28911i.f();
    }

    public int f() {
        return this.f28911i.g();
    }

    public int g() {
        return this.f28911i.h();
    }

    public int[] h() {
        return this.f28911i.i();
    }

    public int i() {
        return this.f28911i.j();
    }

    public ColorStateList j() {
        y0 y0Var = this.f28910h;
        if (y0Var != null) {
            return y0Var.f29153a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        y0 y0Var = this.f28910h;
        if (y0Var != null) {
            return y0Var.b;
        }
        return null;
    }

    public boolean l() {
        return this.f28911i.n();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    @SuppressLint({"NewApi"})
    public void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strO;
        String strO2;
        int iB;
        float f10;
        Context context = this.f28904a.getContext();
        k kVarB = k.b();
        int[] iArr = i.j.f20019a0;
        a1 a1VarV = a1.v(context, attributeSet, iArr, i10, 0);
        TextView textView = this.f28904a;
        androidx.core.view.o0.k0(textView, textView.getContext(), iArr, attributeSet, a1VarV.r(), i10, 0);
        int iN = a1VarV.n(i.j.f20023b0, -1);
        int i11 = i.j.f20038e0;
        if (a1VarV.s(i11)) {
            this.b = d(context, kVarB, a1VarV.n(i11, 0));
        }
        int i12 = i.j.f20028c0;
        if (a1VarV.s(i12)) {
            this.f28905c = d(context, kVarB, a1VarV.n(i12, 0));
        }
        int i13 = i.j.f20043f0;
        if (a1VarV.s(i13)) {
            this.f28906d = d(context, kVarB, a1VarV.n(i13, 0));
        }
        int i14 = i.j.f20033d0;
        if (a1VarV.s(i14)) {
            this.f28907e = d(context, kVarB, a1VarV.n(i14, 0));
        }
        int i15 = i.j.f20048g0;
        if (a1VarV.s(i15)) {
            this.f28908f = d(context, kVarB, a1VarV.n(i15, 0));
        }
        int i16 = i.j.f20053h0;
        if (a1VarV.s(i16)) {
            this.f28909g = d(context, kVarB, a1VarV.n(i16, 0));
        }
        a1VarV.x();
        boolean z11 = this.f28904a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z12 = true;
        if (iN != -1) {
            a1 a1VarT = a1.t(context, iN, i.j.U2);
            if (z11) {
                zA = false;
                z10 = false;
            } else {
                int i17 = i.j.f20036d3;
                if (a1VarT.s(i17)) {
                    zA = a1VarT.a(i17, false);
                    z10 = true;
                } else {
                    zA = false;
                    z10 = false;
                }
            }
            C(context, a1VarT);
            int i18 = i.j.f20041e3;
            strO = a1VarT.s(i18) ? a1VarT.o(i18) : null;
            int i19 = i.j.f20031c3;
            strO2 = a1VarT.s(i19) ? a1VarT.o(i19) : null;
            a1VarT.x();
        } else {
            zA = false;
            z10 = false;
            strO = null;
            strO2 = null;
        }
        a1 a1VarV2 = a1.v(context, attributeSet, i.j.U2, i10, 0);
        if (z11) {
            z12 = z10;
        } else {
            int i20 = i.j.f20036d3;
            if (a1VarV2.s(i20)) {
                zA = a1VarV2.a(i20, false);
            } else {
                z12 = z10;
            }
        }
        int i21 = Build.VERSION.SDK_INT;
        int i22 = i.j.f20041e3;
        if (a1VarV2.s(i22)) {
            strO = a1VarV2.o(i22);
        }
        int i23 = i.j.f20031c3;
        if (a1VarV2.s(i23)) {
            strO2 = a1VarV2.o(i23);
        }
        if (i21 >= 28) {
            int i24 = i.j.V2;
            if (a1VarV2.s(i24) && a1VarV2.f(i24, -1) == 0) {
                this.f28904a.setTextSize(0, 0.0f);
            }
        }
        C(context, a1VarV2);
        a1VarV2.x();
        if (!z11 && z12) {
            s(zA);
        }
        Typeface typeface = this.f28914l;
        if (typeface != null) {
            if (this.f28913k == -1) {
                this.f28904a.setTypeface(typeface, this.f28912j);
            } else {
                this.f28904a.setTypeface(typeface);
            }
        }
        if (strO2 != null) {
            d.d(this.f28904a, strO2);
        }
        if (strO != null) {
            c.b(this.f28904a, c.a(strO));
        }
        this.f28911i.o(attributeSet, i10);
        if (g1.f28984c && this.f28911i.j() != 0) {
            int[] iArrI = this.f28911i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f28904a) != -1.0f) {
                    d.b(this.f28904a, this.f28911i.g(), this.f28911i.f(), this.f28911i.h(), 0);
                } else {
                    d.c(this.f28904a, iArrI, 0);
                }
            }
        }
        a1 a1VarU = a1.u(context, attributeSet, i.j.f20058i0);
        int iN2 = a1VarU.n(i.j.f20098q0, -1);
        Drawable drawableC = iN2 != -1 ? kVarB.c(context, iN2) : null;
        int iN3 = a1VarU.n(i.j.f20123v0, -1);
        Drawable drawableC2 = iN3 != -1 ? kVarB.c(context, iN3) : null;
        int iN4 = a1VarU.n(i.j.f20103r0, -1);
        Drawable drawableC3 = iN4 != -1 ? kVarB.c(context, iN4) : null;
        int iN5 = a1VarU.n(i.j.f20088o0, -1);
        Drawable drawableC4 = iN5 != -1 ? kVarB.c(context, iN5) : null;
        int iN6 = a1VarU.n(i.j.f20108s0, -1);
        Drawable drawableC5 = iN6 != -1 ? kVarB.c(context, iN6) : null;
        int iN7 = a1VarU.n(i.j.f20093p0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? kVarB.c(context, iN7) : null);
        int i25 = i.j.f20113t0;
        if (a1VarU.s(i25)) {
            d3.i.k(this.f28904a, a1VarU.c(i25));
        }
        int i26 = i.j.f20118u0;
        if (a1VarU.s(i26)) {
            d3.i.l(this.f28904a, k0.e(a1VarU.k(i26, -1), null));
        }
        int iF = a1VarU.f(i.j.f20133x0, -1);
        int iF2 = a1VarU.f(i.j.f20138y0, -1);
        int i27 = i.j.f20143z0;
        if (a1VarU.s(i27)) {
            TypedValue typedValueW = a1VarU.w(i27);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = a1VarU.f(i27, -1);
                iB = -1;
            } else {
                iB = x2.i.b(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iB = -1;
            f10 = -1.0f;
        }
        a1VarU.x();
        if (iF != -1) {
            d3.i.n(this.f28904a, iF);
        }
        if (iF2 != -1) {
            d3.i.o(this.f28904a, iF2);
        }
        if (f10 != -1.0f) {
            if (iB == -1) {
                d3.i.p(this.f28904a, (int) f10);
            } else {
                d3.i.q(this.f28904a, iB, f10);
            }
        }
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f28915m) {
            this.f28914l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f28912j));
                } else {
                    textView.setTypeface(typeface, this.f28912j);
                }
            }
        }
    }

    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (g1.f28984c) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String strO;
        a1 a1VarT = a1.t(context, i10, i.j.U2);
        int i11 = i.j.f20036d3;
        if (a1VarT.s(i11)) {
            s(a1VarT.a(i11, false));
        }
        int i12 = i.j.V2;
        if (a1VarT.s(i12) && a1VarT.f(i12, -1) == 0) {
            this.f28904a.setTextSize(0, 0.0f);
        }
        C(context, a1VarT);
        int i13 = i.j.f20031c3;
        if (a1VarT.s(i13) && (strO = a1VarT.o(i13)) != null) {
            d.d(this.f28904a, strO);
        }
        a1VarT.x();
        Typeface typeface = this.f28914l;
        if (typeface != null) {
            this.f28904a.setTypeface(typeface, this.f28912j);
        }
    }

    public void r(@NonNull TextView textView, InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        a3.a.e(editorInfo, textView.getText());
    }

    public void s(boolean z10) {
        this.f28904a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) {
        this.f28911i.p(i10, i11, i12, i13);
    }

    public void u(@NonNull int[] iArr, int i10) {
        this.f28911i.q(iArr, i10);
    }

    public void v(int i10) {
        this.f28911i.r(i10);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f28910h == null) {
            this.f28910h = new y0();
        }
        y0 y0Var = this.f28910h;
        y0Var.f29153a = colorStateList;
        y0Var.f29155d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f28910h == null) {
            this.f28910h = new y0();
        }
        y0 y0Var = this.f28910h;
        y0Var.b = mode;
        y0Var.f29154c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f28904a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f28904a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f28904a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f28904a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f28904a.getCompoundDrawables();
        TextView textView2 = this.f28904a;
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
        y0 y0Var = this.f28910h;
        this.b = y0Var;
        this.f28905c = y0Var;
        this.f28906d = y0Var;
        this.f28907e = y0Var;
        this.f28908f = y0Var;
        this.f28909g = y0Var;
    }
}
