package p298n2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p206j2.C7019a;
import p206j2.C7025g;
import p426s2.C11162a;

/* JADX INFO: renamed from: n2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8865c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<TypedValue> f32264a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m35610a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m35611b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m35611b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return m35614e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    /* JADX INFO: renamed from: c */
    public static TypedValue m35612c() {
        ThreadLocal<TypedValue> threadLocal = f32264a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m35613d(Resources resources, int i10, Resources.Theme theme) {
        try {
            return m35610a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX INFO: renamed from: e */
    public static ColorStateList m35614e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f10;
        int i10 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrM35655a = new int[20];
        int i11 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i10 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayM35617h = m35617h(resources, theme, attributeSet, C7025g.f27558b);
                int i12 = C7025g.f27559c;
                int resourceId = typedArrayM35617h.getResourceId(i12, -1);
                if (resourceId == -1 || m35615f(resources, resourceId)) {
                    color = typedArrayM35617h.getColor(i12, -65281);
                } else {
                    try {
                        color = m35610a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayM35617h.getColor(C7025g.f27559c, -65281);
                    }
                }
                int i13 = C7025g.f27560d;
                float f11 = 1.0f;
                if (typedArrayM35617h.hasValue(i13)) {
                    f11 = typedArrayM35617h.getFloat(i13, 1.0f);
                } else {
                    int i14 = C7025g.f27562f;
                    if (typedArrayM35617h.hasValue(i14)) {
                        f11 = typedArrayM35617h.getFloat(i14, 1.0f);
                    }
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    int i15 = C7025g.f27561e;
                    if (typedArrayM35617h.hasValue(i15)) {
                        f10 = typedArrayM35617h.getFloat(i15, -1.0f);
                    } else {
                        f10 = typedArrayM35617h.getFloat(C7025g.f27563g, -1.0f);
                    }
                } else {
                    f10 = typedArrayM35617h.getFloat(C7025g.f27563g, -1.0f);
                }
                typedArrayM35617h.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i16 = 0;
                for (int i17 = 0; i17 < attributeCount; i17++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i17);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != C7019a.f27472a && attributeNameResource != C7019a.f27473b) {
                        int i18 = i16 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i17, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i16] = attributeNameResource;
                        i16 = i18;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i16);
                iArrM35655a = C8869g.m35655a(iArrM35655a, i11, m35616g(color, f11, f10));
                iArr = (int[][]) C8869g.m35656b(iArr, i11, iArrTrimStateSet);
                i11++;
            }
            i10 = 1;
        }
        int[] iArr3 = new int[i11];
        int[][] iArr4 = new int[i11][];
        System.arraycopy(iArrM35655a, 0, iArr3, 0, i11);
        System.arraycopy(iArr, 0, iArr4, 0, i11);
        return new ColorStateList(iArr4, iArr3);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m35615f(Resources resources, int i10) {
        TypedValue typedValueM35612c = m35612c();
        resources.getValue(i10, typedValueM35612c, true);
        int i11 = typedValueM35612c.type;
        return i11 >= 28 && i11 <= 31;
    }

    /* JADX INFO: renamed from: g */
    public static int m35616g(int i10, float f10, float f11) {
        boolean z10 = f11 >= 0.0f && f11 <= 100.0f;
        if (f10 == 1.0f && !z10) {
            return i10;
        }
        int iM42060c = C11162a.m42060c((int) ((Color.alpha(i10) * f10) + 0.5f), 0, 255);
        if (z10) {
            C8863a c8863aM35587c = C8863a.m35587c(i10);
            i10 = C8863a.m35591m(c8863aM35587c.m35597j(), c8863aM35587c.m35596i(), f11);
        }
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (iM42060c << 24);
    }

    /* JADX INFO: renamed from: h */
    public static TypedArray m35617h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
