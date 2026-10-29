package p101ed;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import p232k.C7399a;
import p365q.C10357a1;

/* JADX INFO: renamed from: ed.c */
/* JADX INFO: loaded from: classes2.dex */
public class C5050c {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m23736a(@NonNull Context context, @NonNull TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateListM30678a;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateListM30678a = C7399a.m30678a(context, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateListM30678a;
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m23737b(@NonNull Context context, @NonNull C10357a1 c10357a1, int i10) {
        int iM39742n;
        ColorStateList colorStateListM30678a;
        return (!c10357a1.m39747s(i10) || (iM39742n = c10357a1.m39742n(i10, 0)) == 0 || (colorStateListM30678a = C7399a.m30678a(context, iM39742n)) == null) ? c10357a1.m39731c(i10) : colorStateListM30678a;
    }

    /* JADX INFO: renamed from: c */
    public static int m23738c(@NonNull Context context, @NonNull TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i10, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i10, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i11);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX INFO: renamed from: d */
    public static Drawable m23739d(@NonNull Context context, @NonNull TypedArray typedArray, int i10) {
        int resourceId;
        Drawable drawableM30679b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (drawableM30679b = C7399a.m30679b(context, resourceId)) == null) ? typedArray.getDrawable(i10) : drawableM30679b;
    }

    /* JADX INFO: renamed from: e */
    public static int m23740e(@NonNull TypedArray typedArray, int i10, int i11) {
        return typedArray.hasValue(i10) ? i10 : i11;
    }

    /* JADX INFO: renamed from: f */
    public static C5051d m23741f(@NonNull Context context, @NonNull TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return new C5051d(context, resourceId);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m23742g(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m23743h(@NonNull Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
