package androidx.core.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.AnyRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class TypedArrayUtils {
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";

    public static boolean hasAttribute(@NonNull XmlPullParser parser, @NonNull String attrName) {
        return parser.getAttributeValue(NAMESPACE, attrName) != null;
    }

    public static float getNamedFloat(@NonNull TypedArray a10, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, float defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a10.getFloat(resId, defaultValue);
    }

    public static boolean getNamedBoolean(@NonNull TypedArray a10, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, boolean defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a10.getBoolean(resId, defaultValue);
    }

    public static int getNamedInt(@NonNull TypedArray a10, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, int defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a10.getInt(resId, defaultValue);
    }

    @ColorInt
    public static int getNamedColor(@NonNull TypedArray a10, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, @ColorInt int defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a10.getColor(resId, defaultValue);
    }

    public static ComplexColorCompat getNamedComplexColor(@NonNull TypedArray a10, @NonNull XmlPullParser parser, @Nullable Resources.Theme theme, @NonNull String attrName, @StyleableRes int resId, @ColorInt int defaultValue) {
        if (hasAttribute(parser, attrName)) {
            TypedValue value = new TypedValue();
            a10.getValue(resId, value);
            int i10 = value.type;
            if (i10 >= 28 && i10 <= 31) {
                return ComplexColorCompat.from(value.data);
            }
            ComplexColorCompat complexColor = ComplexColorCompat.inflate(a10.getResources(), a10.getResourceId(resId, 0), theme);
            if (complexColor != null) {
                return complexColor;
            }
        }
        return ComplexColorCompat.from(defaultValue);
    }

    @AnyRes
    public static int getNamedResourceId(@NonNull TypedArray a10, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId, @AnyRes int defaultValue) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (!hasAttr) {
            return defaultValue;
        }
        return a10.getResourceId(resId, defaultValue);
    }

    @Nullable
    public static String getNamedString(@NonNull TypedArray a10, @NonNull XmlPullParser parser, @NonNull String attrName, @StyleableRes int resId) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (!hasAttr) {
            return null;
        }
        return a10.getString(resId);
    }

    @Nullable
    public static TypedValue peekNamedValue(@NonNull TypedArray a10, @NonNull XmlPullParser parser, @NonNull String attrName, int resId) {
        boolean hasAttr = hasAttribute(parser, attrName);
        if (!hasAttr) {
            return null;
        }
        return a10.peekValue(resId);
    }

    @NonNull
    public static TypedArray obtainAttributes(@NonNull Resources res, @Nullable Resources.Theme theme, @NonNull AttributeSet set, @NonNull int[] attrs) {
        if (theme == null) {
            return res.obtainAttributes(set, attrs);
        }
        return theme.obtainStyledAttributes(set, attrs, 0, 0);
    }

    public static boolean getBoolean(@NonNull TypedArray a10, @StyleableRes int index, @StyleableRes int fallbackIndex, boolean defaultValue) {
        boolean val = a10.getBoolean(fallbackIndex, defaultValue);
        return a10.getBoolean(index, val);
    }

    @Nullable
    public static Drawable getDrawable(@NonNull TypedArray a10, @StyleableRes int index, @StyleableRes int fallbackIndex) {
        Drawable val = a10.getDrawable(index);
        if (val == null) {
            return a10.getDrawable(fallbackIndex);
        }
        return val;
    }

    public static int getInt(@NonNull TypedArray a10, @StyleableRes int index, @StyleableRes int fallbackIndex, int defaultValue) {
        int val = a10.getInt(fallbackIndex, defaultValue);
        return a10.getInt(index, val);
    }

    @AnyRes
    public static int getResourceId(@NonNull TypedArray a10, @StyleableRes int index, @StyleableRes int fallbackIndex, @AnyRes int defaultValue) {
        int val = a10.getResourceId(fallbackIndex, defaultValue);
        return a10.getResourceId(index, val);
    }

    @Nullable
    public static String getString(@NonNull TypedArray a10, @StyleableRes int index, @StyleableRes int fallbackIndex) {
        String val = a10.getString(index);
        if (val == null) {
            return a10.getString(fallbackIndex);
        }
        return val;
    }

    @Nullable
    public static CharSequence getText(@NonNull TypedArray a10, @StyleableRes int index, @StyleableRes int fallbackIndex) {
        CharSequence val = a10.getText(index);
        if (val == null) {
            return a10.getText(fallbackIndex);
        }
        return val;
    }

    @Nullable
    public static CharSequence[] getTextArray(@NonNull TypedArray a10, @StyleableRes int index, @StyleableRes int fallbackIndex) {
        CharSequence[] val = a10.getTextArray(index);
        if (val == null) {
            return a10.getTextArray(fallbackIndex);
        }
        return val;
    }

    public static int getAttr(@NonNull Context context, int attr, int fallbackAttr) {
        TypedValue value = new TypedValue();
        context.getTheme().resolveAttribute(attr, value, true);
        if (value.resourceId != 0) {
            return attr;
        }
        return fallbackAttr;
    }

    private TypedArrayUtils() {
    }
}
