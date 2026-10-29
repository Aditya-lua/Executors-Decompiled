package p365q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.C0625o0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p181i.C6598j;

/* JADX INFO: renamed from: q.c0 */
/* JADX INFO: loaded from: classes.dex */
public class C10362c0 {

    /* JADX INFO: renamed from: l */
    public static final RectF f37276l = new RectF();

    /* JADX INFO: renamed from: m */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f37277m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public int f37278a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f37279b = false;

    /* JADX INFO: renamed from: c */
    public float f37280c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f37281d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f37282e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f37283f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f37284g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f37285h;

    /* JADX INFO: renamed from: i */
    @NonNull
    public final TextView f37286i;

    /* JADX INFO: renamed from: j */
    public final Context f37287j;

    /* JADX INFO: renamed from: k */
    public final d f37288k;

    /* JADX INFO: renamed from: q.c0$a */
    public static final class a {
        @NonNull
        /* JADX INFO: renamed from: a */
        public static StaticLayout m39819a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.mo39820a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: renamed from: q.c0$b */
    public static class b extends d {
        @Override // p365q.C10362c0.d
        /* JADX INFO: renamed from: a */
        public void mo39820a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C10362c0.m39794m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: renamed from: q.c0$c */
    public static class c extends b {
        @Override // p365q.C10362c0.b, p365q.C10362c0.d
        /* JADX INFO: renamed from: a */
        public void mo39820a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // p365q.C10362c0.d
        /* JADX INFO: renamed from: b */
        public boolean mo39821b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: q.c0$d */
    public static class d {
        /* JADX INFO: renamed from: a */
        public void mo39820a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo39821b(TextView textView) {
            return ((Boolean) C10362c0.m39794m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C10362c0(@NonNull TextView textView) {
        this.f37286i = textView;
        this.f37287j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f37288k = new c();
        } else {
            this.f37288k = new b();
        }
    }

    /* JADX INFO: renamed from: k */
    public static Method m39793k(@NonNull String str) {
        try {
            Method declaredMethod = f37277m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f37277m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: m */
    public static <T> T m39794m(@NonNull Object obj, @NonNull String str, @NonNull T t8) {
        try {
            return (T) m39793k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t8;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m39795a() {
        if (m39806n()) {
            if (this.f37279b) {
                if (this.f37286i.getMeasuredHeight() <= 0 || this.f37286i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f37288k.mo39821b(this.f37286i) ? 1048576 : (this.f37286i.getMeasuredWidth() - this.f37286i.getTotalPaddingLeft()) - this.f37286i.getTotalPaddingRight();
                int height = (this.f37286i.getHeight() - this.f37286i.getCompoundPaddingBottom()) - this.f37286i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f37276l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM39799e = m39799e(rectF);
                        if (fM39799e != this.f37286i.getTextSize()) {
                            m39812t(0, fM39799e);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f37279b = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m39796b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: c */
    public final void m39797c() {
        this.f37278a = 0;
        this.f37281d = -1.0f;
        this.f37282e = -1.0f;
        this.f37280c = -1.0f;
        this.f37283f = new int[0];
        this.f37279b = false;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public StaticLayout m39798d(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11) {
        return a.m39819a(charSequence, alignment, i10, i11, this.f37286i, this.f37285h, this.f37288k);
    }

    /* JADX INFO: renamed from: e */
    public final int m39799e(RectF rectF) {
        int length = this.f37283f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (m39816x(this.f37283f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f37283f[i12];
    }

    /* JADX INFO: renamed from: f */
    public int m39800f() {
        return Math.round(this.f37282e);
    }

    /* JADX INFO: renamed from: g */
    public int m39801g() {
        return Math.round(this.f37281d);
    }

    /* JADX INFO: renamed from: h */
    public int m39802h() {
        return Math.round(this.f37280c);
    }

    /* JADX INFO: renamed from: i */
    public int[] m39803i() {
        return this.f37283f;
    }

    /* JADX INFO: renamed from: j */
    public int m39804j() {
        return this.f37278a;
    }

    /* JADX INFO: renamed from: l */
    public void m39805l(int i10) {
        TextPaint textPaint = this.f37285h;
        if (textPaint == null) {
            this.f37285h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f37285h.set(this.f37286i.getPaint());
        this.f37285h.setTextSize(i10);
    }

    /* JADX INFO: renamed from: n */
    public boolean m39806n() {
        return m39817y() && this.f37278a != 0;
    }

    /* JADX INFO: renamed from: o */
    public void m39807o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f37287j;
        int[] iArr = C6598j.f25367i0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f37286i;
        C0625o0.m3036k0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = C6598j.f25392n0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f37278a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = C6598j.f25387m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = C6598j.f25377k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = C6598j.f25372j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = C6598j.f25382l0;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m39814v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!m39817y()) {
            this.f37278a = 0;
            return;
        }
        if (this.f37278a == 1) {
            if (!this.f37284g) {
                DisplayMetrics displayMetrics = this.f37287j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m39818z(dimension2, dimension3, dimension);
            }
            m39813u();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m39808p(int i10, int i11, int i12, int i13) {
        if (m39817y()) {
            DisplayMetrics displayMetrics = this.f37287j.getResources().getDisplayMetrics();
            m39818z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (m39813u()) {
                m39795a();
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m39809q(@NonNull int[] iArr, int i10) {
        if (m39817y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f37287j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f37283f = m39796b(iArrCopyOf);
                if (!m39815w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f37284g = false;
            }
            if (m39813u()) {
                m39795a();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m39810r(int i10) {
        if (m39817y()) {
            if (i10 == 0) {
                m39797c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f37287j.getResources().getDisplayMetrics();
            m39818z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m39813u()) {
                m39795a();
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: s */
    public final void m39811s(float f10) {
        if (f10 != this.f37286i.getPaint().getTextSize()) {
            this.f37286i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f37286i.isInLayout();
            if (this.f37286i.getLayout() != null) {
                this.f37279b = false;
                try {
                    Method methodM39793k = m39793k("nullLayouts");
                    if (methodM39793k != null) {
                        methodM39793k.invoke(this.f37286i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f37286i.forceLayout();
                } else {
                    this.f37286i.requestLayout();
                }
                this.f37286i.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void m39812t(int i10, float f10) {
        Context context = this.f37287j;
        m39811s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    /* JADX INFO: renamed from: u */
    public final boolean m39813u() {
        if (m39817y() && this.f37278a == 1) {
            if (!this.f37284g || this.f37283f.length == 0) {
                int iFloor = ((int) Math.floor((this.f37282e - this.f37281d) / this.f37280c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f37281d + (i10 * this.f37280c));
                }
                this.f37283f = m39796b(iArr);
            }
            this.f37279b = true;
        } else {
            this.f37279b = false;
        }
        return this.f37279b;
    }

    /* JADX INFO: renamed from: v */
    public final void m39814v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f37283f = m39796b(iArr);
            m39815w();
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m39815w() {
        int[] iArr = this.f37283f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f37284g = z10;
        if (z10) {
            this.f37278a = 1;
            this.f37281d = iArr[0];
            this.f37282e = iArr[length - 1];
            this.f37280c = -1.0f;
        }
        return z10;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m39816x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f37286i.getText();
        TransformationMethod transformationMethod = this.f37286i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f37286i)) != null) {
            text = transformation;
        }
        int maxLines = this.f37286i.getMaxLines();
        m39805l(i10);
        StaticLayout staticLayoutM39798d = m39798d(text, (Layout.Alignment) m39794m(this.f37286i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutM39798d.getLineCount() <= maxLines && staticLayoutM39798d.getLineEnd(staticLayoutM39798d.getLineCount() - 1) == text.length())) && ((float) staticLayoutM39798d.getHeight()) <= rectF.bottom;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m39817y() {
        return !(this.f37286i instanceof C10385l);
    }

    /* JADX INFO: renamed from: z */
    public final void m39818z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f37278a = 1;
        this.f37281d = f10;
        this.f37282e = f11;
        this.f37280c = f12;
        this.f37284g = false;
    }
}
