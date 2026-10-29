package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    private ColorUtils() {
    }

    public static int compositeColors(@ColorInt int foreground, @ColorInt int background) {
        int bgAlpha = Color.alpha(background);
        int fgAlpha = Color.alpha(foreground);
        int a10 = compositeAlpha(fgAlpha, bgAlpha);
        int r8 = compositeComponent(Color.red(foreground), fgAlpha, Color.red(background), bgAlpha, a10);
        int g10 = compositeComponent(Color.green(foreground), fgAlpha, Color.green(background), bgAlpha, a10);
        int b = compositeComponent(Color.blue(foreground), fgAlpha, Color.blue(background), bgAlpha, a10);
        return Color.argb(a10, r8, g10, b);
    }

    @NonNull
    @RequiresApi(26)
    public static Color compositeColors(@NonNull Color foreground, @NonNull Color background) {
        if (!Objects.equals(foreground.getModel(), background.getModel())) {
            throw new IllegalArgumentException("Color models must match (" + foreground.getModel() + " vs. " + background.getModel() + ")");
        }
        Color s8 = Objects.equals(background.getColorSpace(), foreground.getColorSpace()) ? foreground : foreground.convert(background.getColorSpace());
        float[] src = s8.getComponents();
        float[] dst = background.getComponents();
        float sa2 = s8.alpha();
        float da2 = background.alpha() * (1.0f - sa2);
        int ai = background.getComponentCount() - 1;
        dst[ai] = sa2 + da2;
        if (dst[ai] > 0.0f) {
            sa2 /= dst[ai];
            da2 /= dst[ai];
        }
        for (int i10 = 0; i10 < ai; i10++) {
            dst[i10] = (src[i10] * sa2) + (dst[i10] * da2);
        }
        return Color.valueOf(dst, background.getColorSpace());
    }

    private static int compositeAlpha(int foregroundAlpha, int backgroundAlpha) {
        return 255 - (((255 - backgroundAlpha) * (255 - foregroundAlpha)) / 255);
    }

    private static int compositeComponent(int fgC, int fgA, int bgC, int bgA, int a10) {
        if (a10 == 0) {
            return 0;
        }
        return (((fgC * 255) * fgA) + ((bgC * bgA) * (255 - fgA))) / (a10 * 255);
    }

    @FloatRange(from = 0.0d, m1479to = 1.0d)
    public static double calculateLuminance(@ColorInt int color) {
        double[] result = getTempDouble3Array();
        colorToXYZ(color, result);
        return result[1] / XYZ_WHITE_REFERENCE_Y;
    }

    public static double calculateContrast(@ColorInt int foreground, @ColorInt int background) {
        if (Color.alpha(background) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(background));
        }
        if (Color.alpha(foreground) < 255) {
            foreground = compositeColors(foreground, background);
        }
        double luminance1 = calculateLuminance(foreground) + 0.05d;
        double luminance2 = calculateLuminance(background) + 0.05d;
        return Math.max(luminance1, luminance2) / Math.min(luminance1, luminance2);
    }

    public static int calculateMinimumAlpha(@ColorInt int foreground, @ColorInt int background, float minContrastRatio) {
        if (Color.alpha(background) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(background));
        }
        int testForeground = setAlphaComponent(foreground, 255);
        double testRatio = calculateContrast(testForeground, background);
        if (testRatio < minContrastRatio) {
            return -1;
        }
        int minAlpha = 0;
        int maxAlpha = 255;
        for (int numIterations = 0; numIterations <= 10 && maxAlpha - minAlpha > 1; numIterations++) {
            int testAlpha = (minAlpha + maxAlpha) / 2;
            int testForeground2 = setAlphaComponent(foreground, testAlpha);
            double testRatio2 = calculateContrast(testForeground2, background);
            if (testRatio2 < minContrastRatio) {
                minAlpha = testAlpha;
            } else {
                maxAlpha = testAlpha;
            }
        }
        return maxAlpha;
    }

    public static void RGBToHSL(@IntRange(from = 0, m1480to = 255) int r8, @IntRange(from = 0, m1480to = 255) int g10, @IntRange(from = 0, m1480to = 255) int b, @NonNull float[] outHsl) {
        float h10;
        float s8;
        float rf2 = r8 / 255.0f;
        float gf2 = g10 / 255.0f;
        float bf2 = b / 255.0f;
        float max = Math.max(rf2, Math.max(gf2, bf2));
        float min = Math.min(rf2, Math.min(gf2, bf2));
        float deltaMaxMin = max - min;
        float l10 = (max + min) / 2.0f;
        if (max != min) {
            if (max == rf2) {
                h10 = ((gf2 - bf2) / deltaMaxMin) % 6.0f;
            } else if (max == gf2) {
                h10 = ((bf2 - rf2) / deltaMaxMin) + 2.0f;
            } else {
                float h11 = rf2 - gf2;
                h10 = (h11 / deltaMaxMin) + 4.0f;
            }
            s8 = deltaMaxMin / (1.0f - Math.abs((2.0f * l10) - 1.0f));
        } else {
            s8 = 0.0f;
            h10 = 0.0f;
        }
        float h12 = (60.0f * h10) % 360.0f;
        if (h12 < 0.0f) {
            h12 += 360.0f;
        }
        outHsl[0] = constrain(h12, 0.0f, 360.0f);
        outHsl[1] = constrain(s8, 0.0f, 1.0f);
        outHsl[2] = constrain(l10, 0.0f, 1.0f);
    }

    public static void colorToHSL(@ColorInt int color, @NonNull float[] outHsl) {
        RGBToHSL(Color.red(color), Color.green(color), Color.blue(color), outHsl);
    }

    @ColorInt
    public static int HSLToColor(@NonNull float[] hsl) {
        float h10 = hsl[0];
        float s8 = hsl[1];
        float l10 = hsl[2];
        float c10 = (1.0f - Math.abs((l10 * 2.0f) - 1.0f)) * s8;
        float m10 = l10 - (0.5f * c10);
        float x10 = (1.0f - Math.abs(((h10 / 60.0f) % 2.0f) - 1.0f)) * c10;
        int hueSegment = ((int) h10) / 60;
        int r8 = 0;
        int g10 = 0;
        int b = 0;
        switch (hueSegment) {
            case 0:
                r8 = Math.round((c10 + m10) * 255.0f);
                g10 = Math.round((x10 + m10) * 255.0f);
                b = Math.round(255.0f * m10);
                break;
            case 1:
                r8 = Math.round((x10 + m10) * 255.0f);
                g10 = Math.round((c10 + m10) * 255.0f);
                b = Math.round(255.0f * m10);
                break;
            case 2:
                r8 = Math.round(m10 * 255.0f);
                g10 = Math.round((c10 + m10) * 255.0f);
                b = Math.round((x10 + m10) * 255.0f);
                break;
            case 3:
                r8 = Math.round(m10 * 255.0f);
                g10 = Math.round((x10 + m10) * 255.0f);
                b = Math.round((c10 + m10) * 255.0f);
                break;
            case 4:
                r8 = Math.round((x10 + m10) * 255.0f);
                g10 = Math.round(m10 * 255.0f);
                b = Math.round((c10 + m10) * 255.0f);
                break;
            case 5:
            case 6:
                r8 = Math.round((c10 + m10) * 255.0f);
                g10 = Math.round(m10 * 255.0f);
                b = Math.round((x10 + m10) * 255.0f);
                break;
        }
        return Color.rgb(constrain(r8, 0, 255), constrain(g10, 0, 255), constrain(b, 0, 255));
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int color, @IntRange(from = 0, m1480to = 255) int alpha) {
        if (alpha < 0 || alpha > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (16777215 & color) | (alpha << 24);
    }

    public static void colorToLAB(@ColorInt int color, @NonNull double[] outLab) {
        RGBToLAB(Color.red(color), Color.green(color), Color.blue(color), outLab);
    }

    public static void RGBToLAB(@IntRange(from = 0, m1480to = 255) int r8, @IntRange(from = 0, m1480to = 255) int g10, @IntRange(from = 0, m1480to = 255) int b, @NonNull double[] outLab) {
        RGBToXYZ(r8, g10, b, outLab);
        XYZToLAB(outLab[0], outLab[1], outLab[2], outLab);
    }

    public static void colorToXYZ(@ColorInt int color, @NonNull double[] outXyz) {
        RGBToXYZ(Color.red(color), Color.green(color), Color.blue(color), outXyz);
    }

    public static void RGBToXYZ(@IntRange(from = 0, m1480to = 255) int r8, @IntRange(from = 0, m1480to = 255) int g10, @IntRange(from = 0, m1480to = 255) int b, @NonNull double[] outXyz) {
        if (outXyz.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double sr2 = ((double) r8) / 255.0d;
        double sr3 = sr2 < 0.04045d ? sr2 / 12.92d : Math.pow((sr2 + 0.055d) / 1.055d, 2.4d);
        double sg2 = ((double) g10) / 255.0d;
        double sg3 = sg2 < 0.04045d ? sg2 / 12.92d : Math.pow((sg2 + 0.055d) / 1.055d, 2.4d);
        double sb2 = ((double) b) / 255.0d;
        double sb3 = sb2 < 0.04045d ? sb2 / 12.92d : Math.pow((0.055d + sb2) / 1.055d, 2.4d);
        outXyz[0] = ((0.4124d * sr3) + (0.3576d * sg3) + (0.1805d * sb3)) * XYZ_WHITE_REFERENCE_Y;
        outXyz[1] = ((0.2126d * sr3) + (0.7152d * sg3) + (0.0722d * sb3)) * XYZ_WHITE_REFERENCE_Y;
        outXyz[2] = ((0.0193d * sr3) + (0.1192d * sg3) + (0.9505d * sb3)) * XYZ_WHITE_REFERENCE_Y;
    }

    public static void XYZToLAB(@FloatRange(from = 0.0d, m1479to = XYZ_WHITE_REFERENCE_X) double x10, @FloatRange(from = 0.0d, m1479to = XYZ_WHITE_REFERENCE_Y) double y10, @FloatRange(from = 0.0d, m1479to = XYZ_WHITE_REFERENCE_Z) double z10, @NonNull double[] outLab) {
        if (outLab.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double x11 = pivotXyzComponent(x10 / XYZ_WHITE_REFERENCE_X);
        double y11 = pivotXyzComponent(y10 / XYZ_WHITE_REFERENCE_Y);
        double z11 = pivotXyzComponent(z10 / XYZ_WHITE_REFERENCE_Z);
        outLab[0] = Math.max(0.0d, (116.0d * y11) - 16.0d);
        outLab[1] = (x11 - y11) * 500.0d;
        outLab[2] = (y11 - z11) * 200.0d;
    }

    public static void LABToXYZ(@FloatRange(from = 0.0d, m1479to = XYZ_WHITE_REFERENCE_Y) double l10, @FloatRange(from = -128.0d, m1479to = 127.0d) double a10, @FloatRange(from = -128.0d, m1479to = 127.0d) double b, @NonNull double[] outXyz) {
        double fy = (l10 + 16.0d) / 116.0d;
        double fx = (a10 / 500.0d) + fy;
        double fz = fy - (b / 200.0d);
        double tmp = Math.pow(fx, 3.0d);
        double xr2 = tmp > XYZ_EPSILON ? tmp : ((fx * 116.0d) - 16.0d) / XYZ_KAPPA;
        double yr2 = l10 > 7.9996247999999985d ? Math.pow(fy, 3.0d) : l10 / XYZ_KAPPA;
        double tmp2 = Math.pow(fz, 3.0d);
        double zr2 = tmp2 > XYZ_EPSILON ? tmp2 : ((116.0d * fz) - 16.0d) / XYZ_KAPPA;
        outXyz[0] = XYZ_WHITE_REFERENCE_X * xr2;
        outXyz[1] = XYZ_WHITE_REFERENCE_Y * yr2;
        outXyz[2] = XYZ_WHITE_REFERENCE_Z * zr2;
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = 0.0d, m1479to = XYZ_WHITE_REFERENCE_X) double x10, @FloatRange(from = 0.0d, m1479to = XYZ_WHITE_REFERENCE_Y) double y10, @FloatRange(from = 0.0d, m1479to = XYZ_WHITE_REFERENCE_Z) double z10) {
        double r8 = (((3.2406d * x10) + ((-1.5372d) * y10)) + ((-0.4986d) * z10)) / XYZ_WHITE_REFERENCE_Y;
        double g10 = ((((-0.9689d) * x10) + (1.8758d * y10)) + (0.0415d * z10)) / XYZ_WHITE_REFERENCE_Y;
        double b = (((0.0557d * x10) + ((-0.204d) * y10)) + (1.057d * z10)) / XYZ_WHITE_REFERENCE_Y;
        return Color.rgb(constrain((int) Math.round((r8 > 0.0031308d ? (Math.pow(r8, 0.4166666666666667d) * 1.055d) - 0.055d : r8 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((g10 > 0.0031308d ? (Math.pow(g10, 0.4166666666666667d) * 1.055d) - 0.055d : g10 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round(255.0d * (b > 0.0031308d ? (Math.pow(b, 0.4166666666666667d) * 1.055d) - 0.055d : b * 12.92d)), 0, 255));
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = 0.0d, m1479to = XYZ_WHITE_REFERENCE_Y) double l10, @FloatRange(from = -128.0d, m1479to = 127.0d) double a10, @FloatRange(from = -128.0d, m1479to = 127.0d) double b) {
        double[] result = getTempDouble3Array();
        LABToXYZ(l10, a10, b, result);
        return XYZToColor(result[0], result[1], result[2]);
    }

    public static double distanceEuclidean(@NonNull double[] labX, @NonNull double[] labY) {
        return Math.sqrt(Math.pow(labX[0] - labY[0], 2.0d) + Math.pow(labX[1] - labY[1], 2.0d) + Math.pow(labX[2] - labY[2], 2.0d));
    }

    private static float constrain(float amount, float low, float high) {
        if (amount < low) {
            return low;
        }
        return amount > high ? high : amount;
    }

    private static int constrain(int amount, int low, int high) {
        if (amount < low) {
            return low;
        }
        return amount > high ? high : amount;
    }

    private static double pivotXyzComponent(double component) {
        return component > XYZ_EPSILON ? Math.pow(component, 0.3333333333333333d) : ((XYZ_KAPPA * component) + 16.0d) / 116.0d;
    }

    @ColorInt
    public static int blendARGB(@ColorInt int color1, @ColorInt int color2, @FloatRange(from = 0.0d, m1479to = 1.0d) float ratio) {
        float inverseRatio = 1.0f - ratio;
        float a10 = (Color.alpha(color1) * inverseRatio) + (Color.alpha(color2) * ratio);
        float r8 = (Color.red(color1) * inverseRatio) + (Color.red(color2) * ratio);
        float g10 = (Color.green(color1) * inverseRatio) + (Color.green(color2) * ratio);
        float b = (Color.blue(color1) * inverseRatio) + (Color.blue(color2) * ratio);
        return Color.argb((int) a10, (int) r8, (int) g10, (int) b);
    }

    public static void blendHSL(@NonNull float[] hsl1, @NonNull float[] hsl2, @FloatRange(from = 0.0d, m1479to = 1.0d) float ratio, @NonNull float[] outResult) {
        if (outResult.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float inverseRatio = 1.0f - ratio;
        outResult[0] = circularInterpolate(hsl1[0], hsl2[0], ratio);
        outResult[1] = (hsl1[1] * inverseRatio) + (hsl2[1] * ratio);
        outResult[2] = (hsl1[2] * inverseRatio) + (hsl2[2] * ratio);
    }

    public static void blendLAB(@NonNull double[] lab1, @NonNull double[] lab2, @FloatRange(from = 0.0d, m1479to = 1.0d) double ratio, @NonNull double[] outResult) {
        if (outResult.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double inverseRatio = 1.0d - ratio;
        outResult[0] = (lab1[0] * inverseRatio) + (lab2[0] * ratio);
        outResult[1] = (lab1[1] * inverseRatio) + (lab2[1] * ratio);
        outResult[2] = (lab1[2] * inverseRatio) + (lab2[2] * ratio);
    }

    @VisibleForTesting
    static float circularInterpolate(float a10, float b, float f10) {
        if (Math.abs(b - a10) > 180.0f) {
            if (b > a10) {
                a10 += 360.0f;
            } else {
                b += 360.0f;
            }
        }
        return (((b - a10) * f10) + a10) % 360.0f;
    }

    private static double[] getTempDouble3Array() {
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] result = threadLocal.get();
        if (result == null) {
            double[] result2 = new double[3];
            threadLocal.set(result2);
            return result2;
        }
        return result;
    }
}
