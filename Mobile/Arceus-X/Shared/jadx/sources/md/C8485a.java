package md;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import p194ic.C6738b;
import p316o.C9611d;

/* JADX INFO: renamed from: md.a */
/* JADX INFO: loaded from: classes2.dex */
public class C8485a {

    /* JADX INFO: renamed from: a */
    public static final int[] f31195a = {R.attr.theme, C6738b.f25900h0};

    /* JADX INFO: renamed from: b */
    public static final int[] f31196b = {C6738b.f25863E};

    /* JADX INFO: renamed from: a */
    public static int m34266a(@NonNull Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f31195a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* JADX INFO: renamed from: b */
    public static int m34267b(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f31196b, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static Context m34268c(@NonNull Context context, AttributeSet attributeSet, int i10, int i11) {
        int iM34267b = m34267b(context, attributeSet, i10, i11);
        boolean z10 = (context instanceof C9611d) && ((C9611d) context).m37924c() == iM34267b;
        if (iM34267b == 0 || z10) {
            return context;
        }
        C9611d c9611d = new C9611d(context, iM34267b);
        int iM34266a = m34266a(context, attributeSet);
        if (iM34266a != 0) {
            c9611d.getTheme().applyStyle(iM34266a, true);
        }
        return c9611d;
    }
}
