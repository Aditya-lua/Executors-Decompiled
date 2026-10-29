package ad;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import p101ed.C5049b;
import p194ic.C6738b;
import p194ic.C6747k;
import p365q.C10357a1;

/* JADX INFO: renamed from: ad.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C0143o {

    /* JADX INFO: renamed from: a */
    public static final int[] f503a = {C6738b.f25905l};

    /* JADX INFO: renamed from: b */
    public static final int[] f504b = {C6738b.f25906m};

    /* JADX INFO: renamed from: a */
    public static void m428a(@NonNull Context context) {
        m432e(context, f503a, "Theme.AppCompat");
    }

    /* JADX INFO: renamed from: b */
    public static void m429b(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26287Q7, i10, i11);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(C6747k.f26305S7, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z10) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C6738b.f25916w, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m430c(context);
            }
        }
        m428a(context);
    }

    /* JADX INFO: renamed from: c */
    public static void m430c(@NonNull Context context) {
        m432e(context, f504b, "Theme.MaterialComponents");
    }

    /* JADX INFO: renamed from: d */
    public static void m431d(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i10, int i11, int... iArr2) {
        boolean zM433f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6747k.f26287Q7, i10, i11);
        if (!typedArrayObtainStyledAttributes.getBoolean(C6747k.f26314T7, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zM433f = typedArrayObtainStyledAttributes.getResourceId(C6747k.f26296R7, -1) != -1;
        } else {
            zM433f = m433f(context, attributeSet, iArr, i10, i11, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zM433f) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m432e(@NonNull Context context, @NonNull int[] iArr, String str) {
        if (m435h(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    /* JADX INFO: renamed from: f */
    public static boolean m433f(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i10, int i11, @NonNull int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        for (int i12 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i12, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m434g(@NonNull Context context) {
        return C5049b.m23731b(context, C6738b.f25915v, false);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m435h(@NonNull Context context, @NonNull int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i10 = 0; i10 < iArr.length; i10++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i10)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    @NonNull
    /* JADX INFO: renamed from: i */
    public static TypedArray m436i(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i10, int i11, int... iArr2) {
        m429b(context, attributeSet, i10, i11);
        m431d(context, attributeSet, iArr, i10, i11, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i10, i11);
    }

    /* JADX INFO: renamed from: j */
    public static C10357a1 m437j(@NonNull Context context, AttributeSet attributeSet, @NonNull int[] iArr, int i10, int i11, int... iArr2) {
        m429b(context, attributeSet, i10, i11);
        m431d(context, attributeSet, iArr, i10, i11, iArr2);
        return C10357a1.m39728v(context, attributeSet, iArr, i10, i11);
    }
}
