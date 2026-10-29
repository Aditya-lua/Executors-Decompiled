package kd;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import dd.b;
import dd.c;
import hc.k;
import q.b0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends b0 {
    public a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static boolean t(Context context) {
        return b.b(context, hc.b.f18778f0, true);
    }

    public static int u(@NonNull Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f19143u4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(k.f19152v4, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int w(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull int... iArr) {
        int iC = -1;
        for (int i10 = 0; i10 < iArr.length && iC < 0; i10++) {
            iC = c.c(context, typedArray, iArr[i10], -1);
        }
        return iC;
    }

    public static boolean x(@NonNull Context context, @NonNull Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f19143u4, i10, i11);
        int iW = w(context, typedArrayObtainStyledAttributes, k.f19160w4, k.f19168x4);
        typedArrayObtainStyledAttributes.recycle();
        return iW != -1;
    }

    public final void s(@NonNull Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f19107q4);
        int iW = w(getContext(), typedArrayObtainStyledAttributes, k.f19125s4, k.f19134t4);
        typedArrayObtainStyledAttributes.recycle();
        if (iW >= 0) {
            setLineHeight(iW);
        }
    }

    @Override // q.b0, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (t(context)) {
            s(context.getTheme(), i10);
        }
    }

    public final void v(AttributeSet attributeSet, int i10, int i11) {
        int iU;
        Context context = getContext();
        if (t(context)) {
            Resources.Theme theme = context.getTheme();
            if (x(context, theme, attributeSet, i10, i11) || (iU = u(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            s(theme, iU);
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(ld.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        v(attributeSet, i10, 0);
    }
}
