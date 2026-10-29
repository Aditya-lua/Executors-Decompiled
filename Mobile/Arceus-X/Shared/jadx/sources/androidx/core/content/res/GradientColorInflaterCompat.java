package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.C0530R;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
final class GradientColorInflaterCompat {
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;

    private GradientColorInflaterCompat() {
    }

    static Shader createFromXml(@NonNull Resources resources, @NonNull XmlPullParser parser, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
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
        return createFromXmlInner(resources, parser, attrs, theme);
    }

    static Shader createFromXmlInner(@NonNull Resources resources, @NonNull XmlPullParser parser, @NonNull AttributeSet attrs, @Nullable Resources.Theme theme) throws XmlPullParserException {
        String name = parser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(parser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray a10 = TypedArrayUtils.obtainAttributes(resources, theme, attrs, C0530R.styleable.GradientColor);
        float startX = TypedArrayUtils.getNamedFloat(a10, parser, "startX", C0530R.styleable.GradientColor_android_startX, 0.0f);
        float startY = TypedArrayUtils.getNamedFloat(a10, parser, "startY", C0530R.styleable.GradientColor_android_startY, 0.0f);
        float endX = TypedArrayUtils.getNamedFloat(a10, parser, "endX", C0530R.styleable.GradientColor_android_endX, 0.0f);
        float endY = TypedArrayUtils.getNamedFloat(a10, parser, "endY", C0530R.styleable.GradientColor_android_endY, 0.0f);
        float centerX = TypedArrayUtils.getNamedFloat(a10, parser, "centerX", C0530R.styleable.GradientColor_android_centerX, 0.0f);
        float centerY = TypedArrayUtils.getNamedFloat(a10, parser, "centerY", C0530R.styleable.GradientColor_android_centerY, 0.0f);
        int type = TypedArrayUtils.getNamedInt(a10, parser, Payload.TYPE, C0530R.styleable.GradientColor_android_type, 0);
        int startColor = TypedArrayUtils.getNamedColor(a10, parser, "startColor", C0530R.styleable.GradientColor_android_startColor, 0);
        boolean hasCenterColor = TypedArrayUtils.hasAttribute(parser, "centerColor");
        int centerColor = TypedArrayUtils.getNamedColor(a10, parser, "centerColor", C0530R.styleable.GradientColor_android_centerColor, 0);
        int endColor = TypedArrayUtils.getNamedColor(a10, parser, "endColor", C0530R.styleable.GradientColor_android_endColor, 0);
        int tileMode = TypedArrayUtils.getNamedInt(a10, parser, "tileMode", C0530R.styleable.GradientColor_android_tileMode, 0);
        float gradientRadius = TypedArrayUtils.getNamedFloat(a10, parser, "gradientRadius", C0530R.styleable.GradientColor_android_gradientRadius, 0.0f);
        a10.recycle();
        ColorStops colorStops = checkColors(inflateChildElements(resources, parser, attrs, theme), startColor, endColor, hasCenterColor, centerColor);
        switch (type) {
            case 1:
                if (gradientRadius <= 0.0f) {
                    throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                }
                return new RadialGradient(centerX, centerY, gradientRadius, colorStops.mColors, colorStops.mOffsets, parseTileMode(tileMode));
            case 2:
                return new SweepGradient(centerX, centerY, colorStops.mColors, colorStops.mOffsets);
            default:
                return new LinearGradient(startX, startY, endX, endY, colorStops.mColors, colorStops.mOffsets, parseTileMode(tileMode));
        }
    }

    private static ColorStops inflateChildElements(@NonNull Resources resources, @NonNull XmlPullParser parser, @NonNull AttributeSet attrs, @Nullable Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int innerDepth = parser.getDepth() + 1;
        List<Float> offsets = new ArrayList<>(20);
        List<Integer> colors = new ArrayList<>(20);
        while (true) {
            int type = parser.next();
            if (type == 1 || ((depth = parser.getDepth()) < innerDepth && type == 3)) {
                break;
            }
            if (type == 2 && depth <= innerDepth && parser.getName().equals("item")) {
                TypedArray a10 = TypedArrayUtils.obtainAttributes(resources, theme, attrs, C0530R.styleable.GradientColorItem);
                int i10 = C0530R.styleable.GradientColorItem_android_color;
                boolean hasColor = a10.hasValue(i10);
                int i11 = C0530R.styleable.GradientColorItem_android_offset;
                boolean hasOffset = a10.hasValue(i11);
                if (!hasColor || !hasOffset) {
                    throw new XmlPullParserException(parser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = a10.getColor(i10, 0);
                float offset = a10.getFloat(i11, 0.0f);
                a10.recycle();
                colors.add(Integer.valueOf(color));
                offsets.add(Float.valueOf(offset));
            }
        }
        if (colors.size() > 0) {
            return new ColorStops(colors, offsets);
        }
        return null;
    }

    private static ColorStops checkColors(@Nullable ColorStops colorItems, @ColorInt int startColor, @ColorInt int endColor, boolean hasCenterColor, @ColorInt int centerColor) {
        if (colorItems != null) {
            return colorItems;
        }
        if (hasCenterColor) {
            return new ColorStops(startColor, centerColor, endColor);
        }
        return new ColorStops(startColor, endColor);
    }

    private static Shader.TileMode parseTileMode(int tileMode) {
        switch (tileMode) {
            case 1:
                return Shader.TileMode.REPEAT;
            case 2:
                return Shader.TileMode.MIRROR;
            default:
                return Shader.TileMode.CLAMP;
        }
    }

    static final class ColorStops {
        final int[] mColors;
        final float[] mOffsets;

        ColorStops(@NonNull List<Integer> colorsList, @NonNull List<Float> offsetsList) {
            int size = colorsList.size();
            this.mColors = new int[size];
            this.mOffsets = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.mColors[i10] = colorsList.get(i10).intValue();
                this.mOffsets[i10] = offsetsList.get(i10).floatValue();
            }
        }

        ColorStops(@ColorInt int startColor, @ColorInt int endColor) {
            this.mColors = new int[]{startColor, endColor};
            this.mOffsets = new float[]{0.0f, 1.0f};
        }

        ColorStops(@ColorInt int startColor, @ColorInt int centerColor, @ColorInt int endColor) {
            this.mColors = new int[]{startColor, centerColor, endColor};
            this.mOffsets = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
