package n2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.appsflyer.sdk_base.referrer.Payload;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        return z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, j2.g.F);
        float f10 = k.f(typedArrayI, xmlPullParser, "startX", j2.g.O, 0.0f);
        float f11 = k.f(typedArrayI, xmlPullParser, "startY", j2.g.P, 0.0f);
        float f12 = k.f(typedArrayI, xmlPullParser, "endX", j2.g.Q, 0.0f);
        float f13 = k.f(typedArrayI, xmlPullParser, "endY", j2.g.R, 0.0f);
        float f14 = k.f(typedArrayI, xmlPullParser, "centerX", j2.g.J, 0.0f);
        float f15 = k.f(typedArrayI, xmlPullParser, "centerY", j2.g.K, 0.0f);
        int iG = k.g(typedArrayI, xmlPullParser, Payload.TYPE, j2.g.I, 0);
        int iB = k.b(typedArrayI, xmlPullParser, "startColor", j2.g.G, 0);
        boolean zH = k.h(xmlPullParser, "centerColor");
        int iB2 = k.b(typedArrayI, xmlPullParser, "centerColor", j2.g.N, 0);
        int iB3 = k.b(typedArrayI, xmlPullParser, "endColor", j2.g.H, 0);
        int iG2 = k.g(typedArrayI, xmlPullParser, "tileMode", j2.g.M, 0);
        float f16 = k.f(typedArrayI, xmlPullParser, "gradientRadius", j2.g.L, 0.0f);
        typedArrayI.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zH, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f10, f11, f12, f13, aVarA.f25006a, aVarA.b, d(iG2)) : new SweepGradient(f14, f15, aVarA.f25006a, aVarA.b);
        }
        if (f16 > 0.0f) {
            return new RadialGradient(f14, f15, f16, aVarA.f25006a, aVarA.b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    public static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, j2.g.S);
                int i10 = j2.g.T;
                boolean zHasValue = typedArrayI.hasValue(i10);
                int i11 = j2.g.U;
                boolean zHasValue2 = typedArrayI.hasValue(i11);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayI.getColor(i10, 0);
                float f10 = typedArrayI.getFloat(i11, 0.0f);
                typedArrayI.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    public static Shader.TileMode d(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f25006a;
        public final float[] b;

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f25006a = new int[size];
            this.b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f25006a[i10] = list.get(i10).intValue();
                this.b[i10] = list2.get(i10).floatValue();
            }
        }

        public a(int i10, int i11) {
            this.f25006a = new int[]{i10, i11};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(int i10, int i11, int i12) {
            this.f25006a = new int[]{i10, i11, i12};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
