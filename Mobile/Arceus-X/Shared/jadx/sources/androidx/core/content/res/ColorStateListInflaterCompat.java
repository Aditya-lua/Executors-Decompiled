package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.C0530R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ColorStateListInflaterCompat {
    private static final int DEFAULT_COLOR = -65536;

    private ColorStateListInflaterCompat() {
    }

    @NonNull
    public static ColorStateList createFromXml(@NonNull Resources r8, @NonNull XmlPullParser parser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int type;
        AttributeSet attrs = Xml.asAttributeSet(parser);
        do {
            type = parser.next();
            if (type == 2) {
                break;
            }
        } while (type != 1);
        if (type != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return createFromXmlInner(r8, parser, attrs, theme);
    }

    @NonNull
    public static ColorStateList createFromXmlInner(@NonNull Resources r8, @NonNull XmlPullParser parser, @NonNull AttributeSet attrs, @Nullable Resources.Theme theme) throws XmlPullParserException {
        String name = parser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        return inflate(r8, parser, attrs, theme);
    }

    /* JADX DEBUG: Move duplicate insns, count: 4 to block B:46:0x00eb */
    private static ColorStateList inflate(@NonNull Resources r8, @NonNull XmlPullParser parser, @NonNull AttributeSet attrs, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int i10 = 1;
        int innerDepth = parser.getDepth() + 1;
        int defaultColor = -65536;
        int[][] stateSpecList = new int[20][];
        int[] colorList = new int[stateSpecList.length];
        int listSize = 0;
        while (true) {
            int type = parser.next();
            if (type == i10 || ((depth = parser.getDepth()) < innerDepth && type == 3)) {
                break;
                break;
            }
            if (type == 2 && depth <= innerDepth && parser.getName().equals("item")) {
                TypedArray a10 = obtainAttributes(r8, theme, attrs, C0530R.styleable.ColorStateListItem);
                int baseColor = a10.getColor(C0530R.styleable.ColorStateListItem_android_color, -65281);
                float alphaMod = 1.0f;
                int i11 = C0530R.styleable.ColorStateListItem_android_alpha;
                if (a10.hasValue(i11)) {
                    alphaMod = a10.getFloat(i11, 1.0f);
                } else {
                    int i12 = C0530R.styleable.ColorStateListItem_alpha;
                    if (a10.hasValue(i12)) {
                        alphaMod = a10.getFloat(i12, 1.0f);
                    }
                }
                a10.recycle();
                int j10 = 0;
                int numAttrs = attrs.getAttributeCount();
                int[] stateSpec = new int[numAttrs];
                int innerDepth2 = innerDepth;
                int innerDepth3 = 0;
                while (innerDepth3 < numAttrs) {
                    int numAttrs2 = numAttrs;
                    int stateResId = attrs.getAttributeNameResource(innerDepth3);
                    int defaultColor2 = defaultColor;
                    if (stateResId != 16843173 && stateResId != 16843551 && stateResId != C0530R.attr.alpha) {
                        int j11 = j10 + 1;
                        stateSpec[j10] = attrs.getAttributeBooleanValue(innerDepth3, false) ? stateResId : -stateResId;
                        j10 = j11;
                    }
                    innerDepth3++;
                    numAttrs = numAttrs2;
                    defaultColor = defaultColor2;
                }
                int defaultColor3 = defaultColor;
                int[] stateSpec2 = StateSet.trimStateSet(stateSpec, j10);
                int color = modulateColorAlpha(baseColor, alphaMod);
                defaultColor = (listSize == 0 || stateSpec2.length == 0) ? color : defaultColor3;
                colorList = GrowingArrayUtils.append(colorList, listSize, color);
                stateSpecList = (int[][]) GrowingArrayUtils.append(stateSpecList, listSize, stateSpec2);
                listSize++;
                innerDepth = innerDepth2;
                i10 = 1;
            } else {
                innerDepth = innerDepth;
                defaultColor = defaultColor;
                i10 = 1;
            }
        }
        int[] colors = new int[listSize];
        int[][] stateSpecs = new int[listSize][];
        System.arraycopy(colorList, 0, colors, 0, listSize);
        System.arraycopy(stateSpecList, 0, stateSpecs, 0, listSize);
        return new ColorStateList(stateSpecs, colors);
    }

    private static TypedArray obtainAttributes(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        return theme == null ? res.obtainAttributes(set, attrs) : theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    @ColorInt
    private static int modulateColorAlpha(@ColorInt int color, @FloatRange(from = 0.0d, m1479to = 1.0d) float alphaMod) {
        int alpha = Math.round(Color.alpha(color) * alphaMod);
        return (16777215 & color) | (alpha << 24);
    }
}
