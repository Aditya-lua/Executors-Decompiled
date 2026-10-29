package p298n2;

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
import p206j2.C7025g;

/* JADX INFO: renamed from: n2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8868f {
    /* JADX INFO: renamed from: a */
    public static a m35651a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        return z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    /* JADX INFO: renamed from: b */
    public static Shader m35652b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayM35693i = C8873k.m35693i(resources, theme, attributeSet, C7025g.f27541F);
        float fM35690f = C8873k.m35690f(typedArrayM35693i, xmlPullParser, "startX", C7025g.f27550O, 0.0f);
        float fM35690f2 = C8873k.m35690f(typedArrayM35693i, xmlPullParser, "startY", C7025g.f27551P, 0.0f);
        float fM35690f3 = C8873k.m35690f(typedArrayM35693i, xmlPullParser, "endX", C7025g.f27552Q, 0.0f);
        float fM35690f4 = C8873k.m35690f(typedArrayM35693i, xmlPullParser, "endY", C7025g.f27553R, 0.0f);
        float fM35690f5 = C8873k.m35690f(typedArrayM35693i, xmlPullParser, "centerX", C7025g.f27545J, 0.0f);
        float fM35690f6 = C8873k.m35690f(typedArrayM35693i, xmlPullParser, "centerY", C7025g.f27546K, 0.0f);
        int iM35691g = C8873k.m35691g(typedArrayM35693i, xmlPullParser, Payload.TYPE, C7025g.f27544I, 0);
        int iM35686b = C8873k.m35686b(typedArrayM35693i, xmlPullParser, "startColor", C7025g.f27542G, 0);
        boolean zM35692h = C8873k.m35692h(xmlPullParser, "centerColor");
        int iM35686b2 = C8873k.m35686b(typedArrayM35693i, xmlPullParser, "centerColor", C7025g.f27549N, 0);
        int iM35686b3 = C8873k.m35686b(typedArrayM35693i, xmlPullParser, "endColor", C7025g.f27543H, 0);
        int iM35691g2 = C8873k.m35691g(typedArrayM35693i, xmlPullParser, "tileMode", C7025g.f27548M, 0);
        float fM35690f7 = C8873k.m35690f(typedArrayM35693i, xmlPullParser, "gradientRadius", C7025g.f27547L, 0.0f);
        typedArrayM35693i.recycle();
        a aVarM35651a = m35651a(m35653c(resources, xmlPullParser, attributeSet, theme), iM35686b, iM35686b3, zM35692h, iM35686b2);
        if (iM35691g != 1) {
            return iM35691g != 2 ? new LinearGradient(fM35690f, fM35690f2, fM35690f3, fM35690f4, aVarM35651a.f32279a, aVarM35651a.f32280b, m35654d(iM35691g2)) : new SweepGradient(fM35690f5, fM35690f6, aVarM35651a.f32279a, aVarM35651a.f32280b);
        }
        if (fM35690f7 > 0.0f) {
            return new RadialGradient(fM35690f5, fM35690f6, fM35690f7, aVarM35651a.f32279a, aVarM35651a.f32280b, m35654d(iM35691g2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    /* JADX INFO: renamed from: c */
    public static a m35653c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayM35693i = C8873k.m35693i(resources, theme, attributeSet, C7025g.f27554S);
                int i10 = C7025g.f27555T;
                boolean zHasValue = typedArrayM35693i.hasValue(i10);
                int i11 = C7025g.f27556U;
                boolean zHasValue2 = typedArrayM35693i.hasValue(i11);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayM35693i.getColor(i10, 0);
                float f10 = typedArrayM35693i.getFloat(i11, 0.0f);
                typedArrayM35693i.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Shader.TileMode m35654d(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: renamed from: n2.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int[] f32279a;

        /* JADX INFO: renamed from: b */
        public final float[] f32280b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f32279a = new int[size];
            this.f32280b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f32279a[i10] = list.get(i10).intValue();
                this.f32280b[i10] = list2.get(i10).floatValue();
            }
        }

        public a(int i10, int i11) {
            this.f32279a = new int[]{i10, i11};
            this.f32280b = new float[]{0.0f, 1.0f};
        }

        public a(int i10, int i11, int i12) {
            this.f32279a = new int[]{i10, i11, i12};
            this.f32280b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
