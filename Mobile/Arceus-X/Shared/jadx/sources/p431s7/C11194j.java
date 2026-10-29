package p431s7;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import p162h7.InterfaceC6304k;
import p266l7.C8002a;
import p266l7.C8006e;
import p303n7.C8909o;

/* JADX INFO: renamed from: s7.j */
/* JADX INFO: loaded from: classes3.dex */
public class C11194j {

    /* JADX INFO: renamed from: a */
    public static final PointF f39486a = new PointF();

    /* JADX INFO: renamed from: a */
    public static PointF m42183a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: b */
    public static float m42184b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    /* JADX INFO: renamed from: c */
    public static int m42185c(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m42186d(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    /* JADX INFO: renamed from: e */
    public static int m42187e(int i10, int i11) {
        int i12 = i10 / i11;
        return (((i10 ^ i11) >= 0) || i10 % i11 == 0) ? i12 : i12 - 1;
    }

    /* JADX INFO: renamed from: f */
    public static int m42188f(float f10, float f11) {
        return m42189g((int) f10, (int) f11);
    }

    /* JADX INFO: renamed from: g */
    public static int m42189g(int i10, int i11) {
        return i10 - (i11 * m42187e(i10, i11));
    }

    /* JADX INFO: renamed from: h */
    public static void m42190h(C8909o c8909o, Path path) {
        Path path2;
        path.reset();
        PointF pointFM35910b = c8909o.m35910b();
        path.moveTo(pointFM35910b.x, pointFM35910b.y);
        f39486a.set(pointFM35910b.x, pointFM35910b.y);
        int i10 = 0;
        while (i10 < c8909o.m35909a().size()) {
            C8002a c8002a = c8909o.m35909a().get(i10);
            PointF pointFM33060a = c8002a.m33060a();
            PointF pointFM33061b = c8002a.m33061b();
            PointF pointFM33062c = c8002a.m33062c();
            PointF pointF = f39486a;
            if (pointFM33060a.equals(pointF) && pointFM33061b.equals(pointFM33062c)) {
                path.lineTo(pointFM33062c.x, pointFM33062c.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointFM33060a.x, pointFM33060a.y, pointFM33061b.x, pointFM33061b.y, pointFM33062c.x, pointFM33062c.y);
            }
            pointF.set(pointFM33062c.x, pointFM33062c.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (c8909o.m35912d()) {
            path3.close();
        }
    }

    /* JADX INFO: renamed from: i */
    public static float m42191i(float f10, float f11, float f12) {
        return f10 + (f12 * (f11 - f10));
    }

    /* JADX INFO: renamed from: j */
    public static int m42192j(int i10, int i11, float f10) {
        return (int) (i10 + (f10 * (i11 - i10)));
    }

    /* JADX INFO: renamed from: k */
    public static void m42193k(C8006e c8006e, int i10, List<C8006e> list, C8006e c8006e2, InterfaceC6304k interfaceC6304k) {
        if (c8006e.m33078c(interfaceC6304k.getName(), i10)) {
            list.add(c8006e2.m33076a(interfaceC6304k.getName()).m33084i(interfaceC6304k));
        }
    }
}
