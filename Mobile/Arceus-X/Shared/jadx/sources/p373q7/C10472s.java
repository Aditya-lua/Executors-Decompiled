package p373q7;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p404r7.AbstractC10794c;

/* JADX INFO: renamed from: q7.s */
/* JADX INFO: loaded from: classes3.dex */
public class C10472s {

    /* JADX INFO: renamed from: a */
    public static final AbstractC10794c.a f37667a = AbstractC10794c.a.m41143a("x", "y");

    /* JADX INFO: renamed from: q7.s$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37668a;

        static {
            int[] iArr = new int[AbstractC10794c.b.values().length];
            f37668a = iArr;
            try {
                iArr[AbstractC10794c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37668a[AbstractC10794c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37668a[AbstractC10794c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static PointF m40251a(AbstractC10794c abstractC10794c, float f10) {
        abstractC10794c.mo41127b();
        float fMo41133h = (float) abstractC10794c.mo41133h();
        float fMo41133h2 = (float) abstractC10794c.mo41133h();
        while (abstractC10794c.mo41137o() != AbstractC10794c.b.END_ARRAY) {
            abstractC10794c.mo41141u();
        }
        abstractC10794c.mo41129d();
        return new PointF(fMo41133h * f10, fMo41133h2 * f10);
    }

    /* JADX INFO: renamed from: b */
    public static PointF m40252b(AbstractC10794c abstractC10794c, float f10) {
        float fMo41133h = (float) abstractC10794c.mo41133h();
        float fMo41133h2 = (float) abstractC10794c.mo41133h();
        while (abstractC10794c.mo41131f()) {
            abstractC10794c.mo41141u();
        }
        return new PointF(fMo41133h * f10, fMo41133h2 * f10);
    }

    /* JADX INFO: renamed from: c */
    public static PointF m40253c(AbstractC10794c abstractC10794c, float f10) {
        abstractC10794c.mo41128c();
        float fM40257g = 0.0f;
        float fM40257g2 = 0.0f;
        while (abstractC10794c.mo41131f()) {
            int iMo41139r = abstractC10794c.mo41139r(f37667a);
            if (iMo41139r == 0) {
                fM40257g = m40257g(abstractC10794c);
            } else if (iMo41139r != 1) {
                abstractC10794c.mo41140s();
                abstractC10794c.mo41141u();
            } else {
                fM40257g2 = m40257g(abstractC10794c);
            }
        }
        abstractC10794c.mo41130e();
        return new PointF(fM40257g * f10, fM40257g2 * f10);
    }

    /* JADX INFO: renamed from: d */
    public static int m40254d(AbstractC10794c abstractC10794c) {
        abstractC10794c.mo41127b();
        int iMo41133h = (int) (abstractC10794c.mo41133h() * 255.0d);
        int iMo41133h2 = (int) (abstractC10794c.mo41133h() * 255.0d);
        int iMo41133h3 = (int) (abstractC10794c.mo41133h() * 255.0d);
        while (abstractC10794c.mo41131f()) {
            abstractC10794c.mo41141u();
        }
        abstractC10794c.mo41129d();
        return Color.argb(255, iMo41133h, iMo41133h2, iMo41133h3);
    }

    /* JADX INFO: renamed from: e */
    public static PointF m40255e(AbstractC10794c abstractC10794c, float f10) {
        int i10 = a.f37668a[abstractC10794c.mo41137o().ordinal()];
        if (i10 == 1) {
            return m40252b(abstractC10794c, f10);
        }
        if (i10 == 2) {
            return m40251a(abstractC10794c, f10);
        }
        if (i10 == 3) {
            return m40253c(abstractC10794c, f10);
        }
        throw new IllegalArgumentException("Unknown point starts with " + abstractC10794c.mo41137o());
    }

    /* JADX INFO: renamed from: f */
    public static List<PointF> m40256f(AbstractC10794c abstractC10794c, float f10) {
        ArrayList arrayList = new ArrayList();
        abstractC10794c.mo41127b();
        while (abstractC10794c.mo41137o() == AbstractC10794c.b.BEGIN_ARRAY) {
            abstractC10794c.mo41127b();
            arrayList.add(m40255e(abstractC10794c, f10));
            abstractC10794c.mo41129d();
        }
        abstractC10794c.mo41129d();
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static float m40257g(AbstractC10794c abstractC10794c) {
        AbstractC10794c.b bVarMo41137o = abstractC10794c.mo41137o();
        int i10 = a.f37668a[bVarMo41137o.ordinal()];
        if (i10 == 1) {
            return (float) abstractC10794c.mo41133h();
        }
        if (i10 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + bVarMo41137o);
        }
        abstractC10794c.mo41127b();
        float fMo41133h = (float) abstractC10794c.mo41133h();
        while (abstractC10794c.mo41131f()) {
            abstractC10794c.mo41141u();
        }
        abstractC10794c.mo41129d();
        return fMo41133h;
    }
}
