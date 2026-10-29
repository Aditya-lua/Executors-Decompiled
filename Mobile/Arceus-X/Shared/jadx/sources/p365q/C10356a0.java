package p365q;

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
import androidx.core.view.C0625o0;
import java.lang.ref.WeakReference;
import p004a3.C0062a;
import p066d3.C4431i;
import p181i.C6598j;
import p298n2.C8870h;
import p533x2.C12639i;

/* JADX INFO: renamed from: q.a0 */
/* JADX INFO: loaded from: classes.dex */
public class C10356a0 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public final TextView f37218a;

    /* JADX INFO: renamed from: b */
    public C10412y0 f37219b;

    /* JADX INFO: renamed from: c */
    public C10412y0 f37220c;

    /* JADX INFO: renamed from: d */
    public C10412y0 f37221d;

    /* JADX INFO: renamed from: e */
    public C10412y0 f37222e;

    /* JADX INFO: renamed from: f */
    public C10412y0 f37223f;

    /* JADX INFO: renamed from: g */
    public C10412y0 f37224g;

    /* JADX INFO: renamed from: h */
    public C10412y0 f37225h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final C10362c0 f37226i;

    /* JADX INFO: renamed from: j */
    public int f37227j = 0;

    /* JADX INFO: renamed from: k */
    public int f37228k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f37229l;

    /* JADX INFO: renamed from: m */
    public boolean f37230m;

    /* JADX INFO: renamed from: q.a0$a */
    public class a extends C8870h.f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f37231a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f37232b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WeakReference f37233c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f37231a = i10;
            this.f37232b = i11;
            this.f37233c = weakReference;
        }

        @Override // p298n2.C8870h.f
        /* JADX INFO: renamed from: f */
        public void mo23760f(int i10) {
        }

        @Override // p298n2.C8870h.f
        /* JADX INFO: renamed from: g */
        public void mo23761g(@NonNull Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f37231a) != -1) {
                typeface = e.m39725a(typeface, i10, (this.f37232b & 2) != 0);
            }
            C10356a0.this.m39706n(this.f37233c, typeface);
        }
    }

    /* JADX INFO: renamed from: q.a0$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ TextView f37235a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Typeface f37236b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f37237c;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(TextView textView, Typeface typeface, int i10) {
            this.f37235a = textView;
            this.f37236b = typeface;
            this.f37237c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37235a.setTypeface(this.f37236b, this.f37237c);
        }
    }

    /* JADX INFO: renamed from: q.a0$c */
    public static class c {
        /* JADX INFO: renamed from: a */
        public static LocaleList m39719a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        /* JADX INFO: renamed from: b */
        public static void m39720b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: renamed from: q.a0$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public static int m39721a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* JADX INFO: renamed from: b */
        public static void m39722b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        /* JADX INFO: renamed from: c */
        public static void m39723c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        /* JADX INFO: renamed from: d */
        public static boolean m39724d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: renamed from: q.a0$e */
    public static class e {
        /* JADX INFO: renamed from: a */
        public static Typeface m39725a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    public C10356a0(@NonNull TextView textView) {
        this.f37218a = textView;
        this.f37226i = new C10362c0(textView);
    }

    /* JADX INFO: renamed from: d */
    public static C10412y0 m39690d(Context context, C10383k c10383k, int i10) {
        ColorStateList colorStateListM39868f = c10383k.m39868f(context, i10);
        if (colorStateListM39868f == null) {
            return null;
        }
        C10412y0 c10412y0 = new C10412y0();
        c10412y0.f37523d = true;
        c10412y0.f37520a = colorStateListM39868f;
        return c10412y0;
    }

    /* JADX INFO: renamed from: A */
    public void m39691A(int i10, float f10) {
        if (C10375g1.f37315c || m39704l()) {
            return;
        }
        m39692B(i10, f10);
    }

    /* JADX INFO: renamed from: B */
    public final void m39692B(int i10, float f10) {
        this.f37226i.m39812t(i10, f10);
    }

    /* JADX INFO: renamed from: C */
    public final void m39693C(Context context, C10357a1 c10357a1) {
        String strM39743o;
        this.f37227j = c10357a1.m39739k(C6598j.f25317X2, this.f37227j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iM39739k = c10357a1.m39739k(C6598j.f25330a3, -1);
            this.f37228k = iM39739k;
            if (iM39739k != -1) {
                this.f37227j &= 2;
            }
        }
        int i11 = C6598j.f25325Z2;
        if (!c10357a1.m39747s(i11) && !c10357a1.m39747s(C6598j.f25335b3)) {
            int i12 = C6598j.f25313W2;
            if (c10357a1.m39747s(i12)) {
                this.f37230m = false;
                int iM39739k2 = c10357a1.m39739k(i12, 1);
                if (iM39739k2 == 1) {
                    this.f37229l = Typeface.SANS_SERIF;
                    return;
                } else if (iM39739k2 == 2) {
                    this.f37229l = Typeface.SERIF;
                    return;
                } else {
                    if (iM39739k2 != 3) {
                        return;
                    }
                    this.f37229l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f37229l = null;
        int i13 = C6598j.f25335b3;
        if (c10357a1.m39747s(i13)) {
            i11 = i13;
        }
        int i14 = this.f37228k;
        int i15 = this.f37227j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM39738j = c10357a1.m39738j(i11, this.f37227j, new a(i14, i15, new WeakReference(this.f37218a)));
                if (typefaceM39738j != null) {
                    if (i10 < 28 || this.f37228k == -1) {
                        this.f37229l = typefaceM39738j;
                    } else {
                        this.f37229l = e.m39725a(Typeface.create(typefaceM39738j, 0), this.f37228k, (this.f37227j & 2) != 0);
                    }
                }
                this.f37230m = this.f37229l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f37229l != null || (strM39743o = c10357a1.m39743o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f37228k == -1) {
            this.f37229l = Typeface.create(strM39743o, this.f37227j);
        } else {
            this.f37229l = e.m39725a(Typeface.create(strM39743o, 0), this.f37228k, (this.f37227j & 2) != 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m39694a(Drawable drawable, C10412y0 c10412y0) {
        if (drawable == null || c10412y0 == null) {
            return;
        }
        C10383k.m39865i(drawable, c10412y0, this.f37218a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public void m39695b() {
        if (this.f37219b != null || this.f37220c != null || this.f37221d != null || this.f37222e != null) {
            Drawable[] compoundDrawables = this.f37218a.getCompoundDrawables();
            m39694a(compoundDrawables[0], this.f37219b);
            m39694a(compoundDrawables[1], this.f37220c);
            m39694a(compoundDrawables[2], this.f37221d);
            m39694a(compoundDrawables[3], this.f37222e);
        }
        if (this.f37223f == null && this.f37224g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f37218a.getCompoundDrawablesRelative();
        m39694a(compoundDrawablesRelative[0], this.f37223f);
        m39694a(compoundDrawablesRelative[2], this.f37224g);
    }

    /* JADX INFO: renamed from: c */
    public void m39696c() {
        this.f37226i.m39795a();
    }

    /* JADX INFO: renamed from: e */
    public int m39697e() {
        return this.f37226i.m39800f();
    }

    /* JADX INFO: renamed from: f */
    public int m39698f() {
        return this.f37226i.m39801g();
    }

    /* JADX INFO: renamed from: g */
    public int m39699g() {
        return this.f37226i.m39802h();
    }

    /* JADX INFO: renamed from: h */
    public int[] m39700h() {
        return this.f37226i.m39803i();
    }

    /* JADX INFO: renamed from: i */
    public int m39701i() {
        return this.f37226i.m39804j();
    }

    /* JADX INFO: renamed from: j */
    public ColorStateList m39702j() {
        C10412y0 c10412y0 = this.f37225h;
        if (c10412y0 != null) {
            return c10412y0.f37520a;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode m39703k() {
        C10412y0 c10412y0 = this.f37225h;
        if (c10412y0 != null) {
            return c10412y0.f37521b;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m39704l() {
        return this.f37226i.m39806n();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fb  */
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: m */
    public void m39705m(AttributeSet attributeSet, int i10) {
        boolean zM39729a;
        boolean z10;
        String strM39743o;
        String strM39743o2;
        int iM47081b;
        float fM39734f;
        Context context = this.f37218a.getContext();
        C10383k c10383kM39862b = C10383k.m39862b();
        int[] iArr = C6598j.f25327a0;
        C10357a1 c10357a1M39728v = C10357a1.m39728v(context, attributeSet, iArr, i10, 0);
        TextView textView = this.f37218a;
        C0625o0.m3036k0(textView, textView.getContext(), iArr, attributeSet, c10357a1M39728v.m39746r(), i10, 0);
        int iM39742n = c10357a1M39728v.m39742n(C6598j.f25332b0, -1);
        int i11 = C6598j.f25347e0;
        if (c10357a1M39728v.m39747s(i11)) {
            this.f37219b = m39690d(context, c10383kM39862b, c10357a1M39728v.m39742n(i11, 0));
        }
        int i12 = C6598j.f25337c0;
        if (c10357a1M39728v.m39747s(i12)) {
            this.f37220c = m39690d(context, c10383kM39862b, c10357a1M39728v.m39742n(i12, 0));
        }
        int i13 = C6598j.f25352f0;
        if (c10357a1M39728v.m39747s(i13)) {
            this.f37221d = m39690d(context, c10383kM39862b, c10357a1M39728v.m39742n(i13, 0));
        }
        int i14 = C6598j.f25342d0;
        if (c10357a1M39728v.m39747s(i14)) {
            this.f37222e = m39690d(context, c10383kM39862b, c10357a1M39728v.m39742n(i14, 0));
        }
        int i15 = C6598j.f25357g0;
        if (c10357a1M39728v.m39747s(i15)) {
            this.f37223f = m39690d(context, c10383kM39862b, c10357a1M39728v.m39742n(i15, 0));
        }
        int i16 = C6598j.f25362h0;
        if (c10357a1M39728v.m39747s(i16)) {
            this.f37224g = m39690d(context, c10383kM39862b, c10357a1M39728v.m39742n(i16, 0));
        }
        c10357a1M39728v.m39749x();
        boolean z11 = this.f37218a.getTransformationMethod() instanceof PasswordTransformationMethod;
        boolean z12 = true;
        if (iM39742n != -1) {
            C10357a1 c10357a1M39726t = C10357a1.m39726t(context, iM39742n, C6598j.f25305U2);
            if (z11) {
                zM39729a = false;
                z10 = false;
            } else {
                int i17 = C6598j.f25345d3;
                if (c10357a1M39726t.m39747s(i17)) {
                    zM39729a = c10357a1M39726t.m39729a(i17, false);
                    z10 = true;
                } else {
                    zM39729a = false;
                    z10 = false;
                }
            }
            m39693C(context, c10357a1M39726t);
            int i18 = C6598j.f25350e3;
            strM39743o = c10357a1M39726t.m39747s(i18) ? c10357a1M39726t.m39743o(i18) : null;
            int i19 = C6598j.f25340c3;
            strM39743o2 = c10357a1M39726t.m39747s(i19) ? c10357a1M39726t.m39743o(i19) : null;
            c10357a1M39726t.m39749x();
        } else {
            zM39729a = false;
            z10 = false;
            strM39743o = null;
            strM39743o2 = null;
        }
        C10357a1 c10357a1M39728v2 = C10357a1.m39728v(context, attributeSet, C6598j.f25305U2, i10, 0);
        if (z11) {
            z12 = z10;
        } else {
            int i20 = C6598j.f25345d3;
            if (c10357a1M39728v2.m39747s(i20)) {
                zM39729a = c10357a1M39728v2.m39729a(i20, false);
            } else {
                z12 = z10;
            }
        }
        int i21 = Build.VERSION.SDK_INT;
        int i22 = C6598j.f25350e3;
        if (c10357a1M39728v2.m39747s(i22)) {
            strM39743o = c10357a1M39728v2.m39743o(i22);
        }
        int i23 = C6598j.f25340c3;
        if (c10357a1M39728v2.m39747s(i23)) {
            strM39743o2 = c10357a1M39728v2.m39743o(i23);
        }
        if (i21 >= 28) {
            int i24 = C6598j.f25309V2;
            if (c10357a1M39728v2.m39747s(i24) && c10357a1M39728v2.m39734f(i24, -1) == 0) {
                this.f37218a.setTextSize(0, 0.0f);
            }
        }
        m39693C(context, c10357a1M39728v2);
        c10357a1M39728v2.m39749x();
        if (!z11 && z12) {
            m39711s(zM39729a);
        }
        Typeface typeface = this.f37229l;
        if (typeface != null) {
            if (this.f37228k == -1) {
                this.f37218a.setTypeface(typeface, this.f37227j);
            } else {
                this.f37218a.setTypeface(typeface);
            }
        }
        if (strM39743o2 != null) {
            d.m39724d(this.f37218a, strM39743o2);
        }
        if (strM39743o != null) {
            c.m39720b(this.f37218a, c.m39719a(strM39743o));
        }
        this.f37226i.m39807o(attributeSet, i10);
        if (C10375g1.f37315c && this.f37226i.m39804j() != 0) {
            int[] iArrM39803i = this.f37226i.m39803i();
            if (iArrM39803i.length > 0) {
                if (d.m39721a(this.f37218a) != -1.0f) {
                    d.m39722b(this.f37218a, this.f37226i.m39801g(), this.f37226i.m39800f(), this.f37226i.m39802h(), 0);
                } else {
                    d.m39723c(this.f37218a, iArrM39803i, 0);
                }
            }
        }
        C10357a1 c10357a1M39727u = C10357a1.m39727u(context, attributeSet, C6598j.f25367i0);
        int iM39742n2 = c10357a1M39727u.m39742n(C6598j.f25407q0, -1);
        Drawable drawableM39866c = iM39742n2 != -1 ? c10383kM39862b.m39866c(context, iM39742n2) : null;
        int iM39742n3 = c10357a1M39727u.m39742n(C6598j.f25432v0, -1);
        Drawable drawableM39866c2 = iM39742n3 != -1 ? c10383kM39862b.m39866c(context, iM39742n3) : null;
        int iM39742n4 = c10357a1M39727u.m39742n(C6598j.f25412r0, -1);
        Drawable drawableM39866c3 = iM39742n4 != -1 ? c10383kM39862b.m39866c(context, iM39742n4) : null;
        int iM39742n5 = c10357a1M39727u.m39742n(C6598j.f25397o0, -1);
        Drawable drawableM39866c4 = iM39742n5 != -1 ? c10383kM39862b.m39866c(context, iM39742n5) : null;
        int iM39742n6 = c10357a1M39727u.m39742n(C6598j.f25417s0, -1);
        Drawable drawableM39866c5 = iM39742n6 != -1 ? c10383kM39862b.m39866c(context, iM39742n6) : null;
        int iM39742n7 = c10357a1M39727u.m39742n(C6598j.f25402p0, -1);
        m39717y(drawableM39866c, drawableM39866c2, drawableM39866c3, drawableM39866c4, drawableM39866c5, iM39742n7 != -1 ? c10383kM39862b.m39866c(context, iM39742n7) : null);
        int i25 = C6598j.f25422t0;
        if (c10357a1M39727u.m39747s(i25)) {
            C4431i.m22304k(this.f37218a, c10357a1M39727u.m39731c(i25));
        }
        int i26 = C6598j.f25427u0;
        if (c10357a1M39727u.m39747s(i26)) {
            C4431i.m22305l(this.f37218a, C10384k0.m39887e(c10357a1M39727u.m39739k(i26, -1), null));
        }
        int iM39734f = c10357a1M39727u.m39734f(C6598j.f25442x0, -1);
        int iM39734f2 = c10357a1M39727u.m39734f(C6598j.f25447y0, -1);
        int i27 = C6598j.f25452z0;
        if (c10357a1M39727u.m39747s(i27)) {
            TypedValue typedValueM39748w = c10357a1M39727u.m39748w(i27);
            if (typedValueM39748w == null || typedValueM39748w.type != 5) {
                fM39734f = c10357a1M39727u.m39734f(i27, -1);
                iM47081b = -1;
            } else {
                iM47081b = C12639i.m47081b(typedValueM39748w.data);
                fM39734f = TypedValue.complexToFloat(typedValueM39748w.data);
            }
        } else {
            iM47081b = -1;
            fM39734f = -1.0f;
        }
        c10357a1M39727u.m39749x();
        if (iM39734f != -1) {
            C4431i.m22307n(this.f37218a, iM39734f);
        }
        if (iM39734f2 != -1) {
            C4431i.m22308o(this.f37218a, iM39734f2);
        }
        if (fM39734f != -1.0f) {
            if (iM47081b == -1) {
                C4431i.m22309p(this.f37218a, (int) fM39734f);
            } else {
                C4431i.m22310q(this.f37218a, iM47081b, fM39734f);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m39706n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f37230m) {
            this.f37229l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f37227j));
                } else {
                    textView.setTypeface(typeface, this.f37227j);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public void m39707o(boolean z10, int i10, int i11, int i12, int i13) {
        if (C10375g1.f37315c) {
            return;
        }
        m39696c();
    }

    /* JADX INFO: renamed from: p */
    public void m39708p() {
        m39695b();
    }

    /* JADX INFO: renamed from: q */
    public void m39709q(Context context, int i10) {
        String strM39743o;
        C10357a1 c10357a1M39726t = C10357a1.m39726t(context, i10, C6598j.f25305U2);
        int i11 = C6598j.f25345d3;
        if (c10357a1M39726t.m39747s(i11)) {
            m39711s(c10357a1M39726t.m39729a(i11, false));
        }
        int i12 = C6598j.f25309V2;
        if (c10357a1M39726t.m39747s(i12) && c10357a1M39726t.m39734f(i12, -1) == 0) {
            this.f37218a.setTextSize(0, 0.0f);
        }
        m39693C(context, c10357a1M39726t);
        int i13 = C6598j.f25340c3;
        if (c10357a1M39726t.m39747s(i13) && (strM39743o = c10357a1M39726t.m39743o(i13)) != null) {
            d.m39724d(this.f37218a, strM39743o);
        }
        c10357a1M39726t.m39749x();
        Typeface typeface = this.f37229l;
        if (typeface != null) {
            this.f37218a.setTypeface(typeface, this.f37227j);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m39710r(@NonNull TextView textView, InputConnection inputConnection, @NonNull EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C0062a.m132e(editorInfo, textView.getText());
    }

    /* JADX INFO: renamed from: s */
    public void m39711s(boolean z10) {
        this.f37218a.setAllCaps(z10);
    }

    /* JADX INFO: renamed from: t */
    public void m39712t(int i10, int i11, int i12, int i13) {
        this.f37226i.m39808p(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: u */
    public void m39713u(@NonNull int[] iArr, int i10) {
        this.f37226i.m39809q(iArr, i10);
    }

    /* JADX INFO: renamed from: v */
    public void m39714v(int i10) {
        this.f37226i.m39810r(i10);
    }

    /* JADX INFO: renamed from: w */
    public void m39715w(ColorStateList colorStateList) {
        if (this.f37225h == null) {
            this.f37225h = new C10412y0();
        }
        C10412y0 c10412y0 = this.f37225h;
        c10412y0.f37520a = colorStateList;
        c10412y0.f37523d = colorStateList != null;
        m39718z();
    }

    /* JADX INFO: renamed from: x */
    public void m39716x(PorterDuff.Mode mode) {
        if (this.f37225h == null) {
            this.f37225h = new C10412y0();
        }
        C10412y0 c10412y0 = this.f37225h;
        c10412y0.f37521b = mode;
        c10412y0.f37522c = mode != null;
        m39718z();
    }

    /* JADX INFO: renamed from: y */
    public final void m39717y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f37218a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f37218a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f37218a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f37218a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f37218a.getCompoundDrawables();
        TextView textView2 = this.f37218a;
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

    /* JADX INFO: renamed from: z */
    public final void m39718z() {
        C10412y0 c10412y0 = this.f37225h;
        this.f37219b = c10412y0;
        this.f37220c = c10412y0;
        this.f37221d = c10412y0;
        this.f37222e = c10412y0;
        this.f37223f = c10412y0;
        this.f37224g = c10412y0;
    }
}
