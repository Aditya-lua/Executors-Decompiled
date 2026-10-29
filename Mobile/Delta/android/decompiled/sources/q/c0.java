package q;

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
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f28953l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f28954m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28955a = 0;
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f28956c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f28957d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f28958e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f28959f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28960g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f28961h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f28962i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f28963j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f28964k;

    public static final class a {
        @NonNull
        public static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    public static class b extends d {
        @Override // q.c0.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) c0.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class c extends b {
        @Override // q.c0.b, q.c0.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // q.c0.d
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class d {
        public void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        public boolean b(TextView textView) {
            return ((Boolean) c0.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public c0(@NonNull TextView textView) {
        this.f28962i = textView;
        this.f28963j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f28964k = new c();
        } else {
            this.f28964k = new b();
        }
    }

    public static Method k(@NonNull String str) {
        try {
            Method declaredMethod = f28954m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f28954m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public static <T> T m(@NonNull Object obj, @NonNull String str, @NonNull T t8) {
        try {
            return (T) k(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t8;
        }
    }

    public void a() {
        if (n()) {
            if (this.b) {
                if (this.f28962i.getMeasuredHeight() <= 0 || this.f28962i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f28964k.b(this.f28962i) ? 1048576 : (this.f28962i.getMeasuredWidth() - this.f28962i.getTotalPaddingLeft()) - this.f28962i.getTotalPaddingRight();
                int height = (this.f28962i.getHeight() - this.f28962i.getCompoundPaddingBottom()) - this.f28962i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f28953l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f28962i.getTextSize()) {
                            t(0, fE);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.b = true;
        }
    }

    public final int[] b(int[] iArr) {
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

    public final void c() {
        this.f28955a = 0;
        this.f28957d = -1.0f;
        this.f28958e = -1.0f;
        this.f28956c = -1.0f;
        this.f28959f = new int[0];
        this.b = false;
    }

    @NonNull
    public StaticLayout d(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f28962i, this.f28961h, this.f28964k);
    }

    public final int e(RectF rectF) {
        int length = this.f28959f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f28959f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f28959f[i12];
    }

    public int f() {
        return Math.round(this.f28958e);
    }

    public int g() {
        return Math.round(this.f28957d);
    }

    public int h() {
        return Math.round(this.f28956c);
    }

    public int[] i() {
        return this.f28959f;
    }

    public int j() {
        return this.f28955a;
    }

    public void l(int i10) {
        TextPaint textPaint = this.f28961h;
        if (textPaint == null) {
            this.f28961h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f28961h.set(this.f28962i.getPaint());
        this.f28961h.setTextSize(i10);
    }

    public boolean n() {
        return y() && this.f28955a != 0;
    }

    public void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f28963j;
        int[] iArr = i.j.f20058i0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f28962i;
        androidx.core.view.o0.k0(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        int i11 = i.j.f20083n0;
        if (typedArrayObtainStyledAttributes.hasValue(i11)) {
            this.f28955a = typedArrayObtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = i.j.f20078m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = i.j.f20068k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i13) ? typedArrayObtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = i.j.f20063j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i14) ? typedArrayObtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = i.j.f20073l0;
        if (typedArrayObtainStyledAttributes.hasValue(i15) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f28955a = 0;
            return;
        }
        if (this.f28955a == 1) {
            if (!this.f28960g) {
                DisplayMetrics displayMetrics = this.f28963j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i10, int i11, int i12, int i13) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f28963j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(@NonNull int[] iArr, int i10) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f28963j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f28959f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f28960g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i10) {
        if (y()) {
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            DisplayMetrics displayMetrics = this.f28963j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public final void s(float f10) {
        if (f10 != this.f28962i.getPaint().getTextSize()) {
            this.f28962i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f28962i.isInLayout();
            if (this.f28962i.getLayout() != null) {
                this.b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f28962i, null);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f28962i.forceLayout();
                } else {
                    this.f28962i.requestLayout();
                }
                this.f28962i.invalidate();
            }
        }
    }

    public void t(int i10, float f10) {
        Context context = this.f28963j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.f28955a == 1) {
            if (!this.f28960g || this.f28959f.length == 0) {
                int iFloor = ((int) Math.floor((this.f28958e - this.f28957d) / this.f28956c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f28957d + (i10 * this.f28956c));
                }
                this.f28959f = b(iArr);
            }
            this.b = true;
        } else {
            this.b = false;
        }
        return this.b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f28959f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        int[] iArr = this.f28959f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f28960g = z10;
        if (z10) {
            this.f28955a = 1;
            this.f28957d = iArr[0];
            this.f28958e = iArr[length - 1];
            this.f28956c = -1.0f;
        }
        return z10;
    }

    public final boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f28962i.getText();
        TransformationMethod transformationMethod = this.f28962i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f28962i)) != null) {
            text = transformation;
        }
        int maxLines = this.f28962i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f28962i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.f28962i instanceof l);
    }

    public final void z(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f28955a = 1;
        this.f28957d = f10;
        this.f28958e = f11;
        this.f28956c = f12;
        this.f28960g = false;
    }
}
