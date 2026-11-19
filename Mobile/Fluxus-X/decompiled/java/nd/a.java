package nd;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import fd.b;
import fd.c;
import jc.k;
import q.c0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c0 {
    public a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public static boolean t(Context context) {
        return b.b(context, jc.b.f20288f0, true);
    }

    public static int u(@NonNull Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f20653u4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(k.f20662v4, -1);
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
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, k.f20653u4, i10, i11);
        int iW = w(context, typedArrayObtainStyledAttributes, k.f20671w4, k.f20679x4);
        typedArrayObtainStyledAttributes.recycle();
        return iW != -1;
    }

    public final void s(@NonNull Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, k.f20617q4);
        int iW = w(getContext(), typedArrayObtainStyledAttributes, k.f20635s4, k.f20644t4);
        typedArrayObtainStyledAttributes.recycle();
        if (iW >= 0) {
            setLineHeight(iW);
        }
    }

    @Override // q.c0, android.widget.TextView
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
        super(od.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        v(attributeSet, i10, 0);
    }
}
