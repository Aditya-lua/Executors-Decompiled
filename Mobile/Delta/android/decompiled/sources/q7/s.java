package q7;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7.c.a f29268a = r7.c.a.a("x", "y");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29269a;

        static {
            int[] iArr = new int[r7.c.b.values().length];
            f29269a = iArr;
            try {
                iArr[r7.c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29269a[r7.c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29269a[r7.c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(r7.c cVar, float f10) {
        cVar.b();
        float fH = (float) cVar.h();
        float fH2 = (float) cVar.h();
        while (cVar.o() != r7.c.b.END_ARRAY) {
            cVar.u();
        }
        cVar.d();
        return new PointF(fH * f10, fH2 * f10);
    }

    public static PointF b(r7.c cVar, float f10) {
        float fH = (float) cVar.h();
        float fH2 = (float) cVar.h();
        while (cVar.f()) {
            cVar.u();
        }
        return new PointF(fH * f10, fH2 * f10);
    }

    public static PointF c(r7.c cVar, float f10) {
        cVar.c();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.f()) {
            int iR = cVar.r(f29268a);
            if (iR == 0) {
                fG = g(cVar);
            } else if (iR != 1) {
                cVar.s();
                cVar.u();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.e();
        return new PointF(fG * f10, fG2 * f10);
    }

    public static int d(r7.c cVar) {
        cVar.b();
        int iH = (int) (cVar.h() * 255.0d);
        int iH2 = (int) (cVar.h() * 255.0d);
        int iH3 = (int) (cVar.h() * 255.0d);
        while (cVar.f()) {
            cVar.u();
        }
        cVar.d();
        return Color.argb(255, iH, iH2, iH3);
    }

    public static PointF e(r7.c cVar, float f10) {
        int i10 = a.f29269a[cVar.o().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.o());
    }

    public static List<PointF> f(r7.c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.o() == r7.c.b.BEGIN_ARRAY) {
            cVar.b();
            arrayList.add(e(cVar, f10));
            cVar.d();
        }
        cVar.d();
        return arrayList;
    }

    public static float g(r7.c cVar) {
        r7.c.b bVarO = cVar.o();
        int i10 = a.f29269a[bVarO.ordinal()];
        if (i10 == 1) {
            return (float) cVar.h();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarO);
        }
        cVar.b();
        float fH = (float) cVar.h();
        while (cVar.f()) {
            cVar.u();
        }
        cVar.d();
        return fH;
    }
}
