package r7;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s7.c.a f30598a = s7.c.a.a("x", "y");

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30599a;

        static {
            int[] iArr = new int[s7.c.b.values().length];
            f30599a = iArr;
            try {
                iArr[s7.c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30599a[s7.c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30599a[s7.c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(s7.c cVar, float f10) {
        cVar.b();
        float fH = (float) cVar.h();
        float fH2 = (float) cVar.h();
        while (cVar.p() != s7.c.b.END_ARRAY) {
            cVar.w();
        }
        cVar.d();
        return new PointF(fH * f10, fH2 * f10);
    }

    public static PointF b(s7.c cVar, float f10) {
        float fH = (float) cVar.h();
        float fH2 = (float) cVar.h();
        while (cVar.f()) {
            cVar.w();
        }
        return new PointF(fH * f10, fH2 * f10);
    }

    public static PointF c(s7.c cVar, float f10) {
        cVar.c();
        float fG = 0.0f;
        float fG2 = 0.0f;
        while (cVar.f()) {
            int iS = cVar.s(f30598a);
            if (iS == 0) {
                fG = g(cVar);
            } else if (iS != 1) {
                cVar.u();
                cVar.w();
            } else {
                fG2 = g(cVar);
            }
        }
        cVar.e();
        return new PointF(fG * f10, fG2 * f10);
    }

    public static int d(s7.c cVar) {
        cVar.b();
        int iH = (int) (cVar.h() * 255.0d);
        int iH2 = (int) (cVar.h() * 255.0d);
        int iH3 = (int) (cVar.h() * 255.0d);
        while (cVar.f()) {
            cVar.w();
        }
        cVar.d();
        return Color.argb(255, iH, iH2, iH3);
    }

    public static PointF e(s7.c cVar, float f10) {
        int i10 = a.f30599a[cVar.p().ordinal()];
        if (i10 == 1) {
            return b(cVar, f10);
        }
        if (i10 == 2) {
            return a(cVar, f10);
        }
        if (i10 == 3) {
            return c(cVar, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + cVar.p());
    }

    public static List<PointF> f(s7.c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        while (cVar.p() == s7.c.b.BEGIN_ARRAY) {
            cVar.b();
            arrayList.add(e(cVar, f10));
            cVar.d();
        }
        cVar.d();
        return arrayList;
    }

    public static float g(s7.c cVar) {
        s7.c.b bVarP = cVar.p();
        int i10 = a.f30599a[bVarP.ordinal()];
        if (i10 == 1) {
            return (float) cVar.h();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarP);
        }
        cVar.b();
        float fH = (float) cVar.h();
        while (cVar.f()) {
            cVar.w();
        }
        cVar.d();
        return fH;
    }
}
