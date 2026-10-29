package p298n2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: n2.k */
/* JADX INFO: loaded from: classes.dex */
public class C8873k {
    /* JADX INFO: renamed from: a */
    public static boolean m35685a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        return !m35692h(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    /* JADX INFO: renamed from: b */
    public static int m35686b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m35692h(xmlPullParser, str) ? i11 : typedArray.getColor(i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m35687c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        if (!m35692h(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        int i11 = typedValue.type;
        if (i11 != 2) {
            return (i11 < 28 || i11 > 31) ? C8865c.m35613d(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme) : m35688d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m35688d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    /* JADX INFO: renamed from: e */
    public static C8866d m35689e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        if (m35692h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return C8866d.m35619b(typedValue.data);
            }
            C8866d c8866dM35622g = C8866d.m35622g(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (c8866dM35622g != null) {
                return c8866dM35622g;
            }
        }
        return C8866d.m35619b(i11);
    }

    /* JADX INFO: renamed from: f */
    public static float m35690f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !m35692h(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    /* JADX INFO: renamed from: g */
    public static int m35691g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !m35692h(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m35692h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: i */
    public static TypedArray m35693i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
