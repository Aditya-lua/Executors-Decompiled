package p303n7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p266l7.C8002a;
import p431s7.C11189e;
import p431s7.C11194j;

/* JADX INFO: renamed from: n7.o */
/* JADX INFO: loaded from: classes3.dex */
public class C8909o {

    /* JADX INFO: renamed from: a */
    public final List<C8002a> f32509a;

    /* JADX INFO: renamed from: b */
    public PointF f32510b;

    /* JADX INFO: renamed from: c */
    public boolean f32511c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8909o(PointF pointF, boolean z10, List<C8002a> list) {
        this.f32510b = pointF;
        this.f32511c = z10;
        this.f32509a = new ArrayList(list);
    }

    /* JADX INFO: renamed from: a */
    public List<C8002a> m35909a() {
        return this.f32509a;
    }

    /* JADX INFO: renamed from: b */
    public PointF m35910b() {
        return this.f32510b;
    }

    /* JADX INFO: renamed from: c */
    public void m35911c(C8909o c8909o, C8909o c8909o2, float f10) {
        if (this.f32510b == null) {
            this.f32510b = new PointF();
        }
        this.f32511c = c8909o.m35912d() || c8909o2.m35912d();
        if (c8909o.m35909a().size() != c8909o2.m35909a().size()) {
            C11189e.m42153c("Curves must have the same number of control points. Shape 1: " + c8909o.m35909a().size() + "\tShape 2: " + c8909o2.m35909a().size());
        }
        int iMin = Math.min(c8909o.m35909a().size(), c8909o2.m35909a().size());
        if (this.f32509a.size() < iMin) {
            for (int size = this.f32509a.size(); size < iMin; size++) {
                this.f32509a.add(new C8002a());
            }
        } else if (this.f32509a.size() > iMin) {
            for (int size2 = this.f32509a.size() - 1; size2 >= iMin; size2--) {
                List<C8002a> list = this.f32509a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFM35910b = c8909o.m35910b();
        PointF pointFM35910b2 = c8909o2.m35910b();
        m35914f(C11194j.m42191i(pointFM35910b.x, pointFM35910b2.x, f10), C11194j.m42191i(pointFM35910b.y, pointFM35910b2.y, f10));
        for (int size3 = this.f32509a.size() - 1; size3 >= 0; size3--) {
            C8002a c8002a = c8909o.m35909a().get(size3);
            C8002a c8002a2 = c8909o2.m35909a().get(size3);
            PointF pointFM33060a = c8002a.m33060a();
            PointF pointFM33061b = c8002a.m33061b();
            PointF pointFM33062c = c8002a.m33062c();
            PointF pointFM33060a2 = c8002a2.m33060a();
            PointF pointFM33061b2 = c8002a2.m33061b();
            PointF pointFM33062c2 = c8002a2.m33062c();
            this.f32509a.get(size3).m33063d(C11194j.m42191i(pointFM33060a.x, pointFM33060a2.x, f10), C11194j.m42191i(pointFM33060a.y, pointFM33060a2.y, f10));
            this.f32509a.get(size3).m33064e(C11194j.m42191i(pointFM33061b.x, pointFM33061b2.x, f10), C11194j.m42191i(pointFM33061b.y, pointFM33061b2.y, f10));
            this.f32509a.get(size3).m33065f(C11194j.m42191i(pointFM33062c.x, pointFM33062c2.x, f10), C11194j.m42191i(pointFM33062c.y, pointFM33062c2.y, f10));
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m35912d() {
        return this.f32511c;
    }

    /* JADX INFO: renamed from: e */
    public void m35913e(boolean z10) {
        this.f32511c = z10;
    }

    /* JADX INFO: renamed from: f */
    public void m35914f(float f10, float f11) {
        if (this.f32510b == null) {
            this.f32510b = new PointF();
        }
        this.f32510b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f32509a.size() + "closed=" + this.f32511c + '}';
    }

    public C8909o() {
        this.f32509a = new ArrayList();
    }
}
