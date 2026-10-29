package p269ld;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import md.C8485a;
import p101ed.C5049b;
import p101ed.C5050c;
import p194ic.C6738b;
import p194ic.C6747k;
import p365q.C10359b0;

/* JADX INFO: renamed from: ld.a */
/* JADX INFO: loaded from: classes2.dex */
public class C8126a extends C10359b0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8126a(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m33338t(Context context) {
        return C5049b.m23731b(context, C6738b.f25896f0, true);
    }

    /* JADX INFO: renamed from: u */
    public static int m33339u(@NonNull Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C6747k.f26557u4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C6747k.f26566v4, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: w */
    public static int m33340w(@NonNull Context context, @NonNull TypedArray typedArray, @NonNull int... iArr) {
        int iM23738c = -1;
        for (int i10 = 0; i10 < iArr.length && iM23738c < 0; i10++) {
            iM23738c = C5050c.m23738c(context, typedArray, iArr[i10], -1);
        }
        return iM23738c;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m33341x(@NonNull Context context, @NonNull Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C6747k.f26557u4, i10, i11);
        int iM33340w = m33340w(context, typedArrayObtainStyledAttributes, C6747k.f26575w4, C6747k.f26584x4);
        typedArrayObtainStyledAttributes.recycle();
        return iM33340w != -1;
    }

    /* JADX INFO: renamed from: s */
    public final void m33342s(@NonNull Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, C6747k.f26521q4);
        int iM33340w = m33340w(getContext(), typedArrayObtainStyledAttributes, C6747k.f26539s4, C6747k.f26548t4);
        typedArrayObtainStyledAttributes.recycle();
        if (iM33340w >= 0) {
            setLineHeight(iM33340w);
        }
    }

    @Override // p365q.C10359b0, android.widget.TextView
    public void setTextAppearance(@NonNull Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (m33338t(context)) {
            m33342s(context.getTheme(), i10);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m33343v(AttributeSet attributeSet, int i10, int i11) {
        int iM33339u;
        Context context = getContext();
        if (m33338t(context)) {
            Resources.Theme theme = context.getTheme();
            if (m33341x(context, theme, attributeSet, i10, i11) || (iM33339u = m33339u(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            m33342s(theme, iM33339u);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8126a(@NonNull Context context, AttributeSet attributeSet, int i10) {
        super(C8485a.m34268c(context, attributeSet, i10, 0), attributeSet, i10);
        m33343v(attributeSet, i10, 0);
    }
}
