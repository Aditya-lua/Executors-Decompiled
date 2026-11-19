package o7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<m7.a> f26893a;
    public PointF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f26894c;

    public o(PointF pointF, boolean z10, List<m7.a> list) {
        this.b = pointF;
        this.f26894c = z10;
        this.f26893a = new ArrayList(list);
    }

    public List<m7.a> a() {
        return this.f26893a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.f26894c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            t7.e.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f26893a.size() < iMin) {
            for (int size = this.f26893a.size(); size < iMin; size++) {
                this.f26893a.add(new m7.a());
            }
        } else if (this.f26893a.size() > iMin) {
            for (int size2 = this.f26893a.size() - 1; size2 >= iMin; size2--) {
                List<m7.a> list = this.f26893a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(t7.j.i(pointFB.x, pointFB2.x, f10), t7.j.i(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f26893a.size() - 1; size3 >= 0; size3--) {
            m7.a aVar = oVar.a().get(size3);
            m7.a aVar2 = oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            this.f26893a.get(size3).d(t7.j.i(pointFA.x, pointFA2.x, f10), t7.j.i(pointFA.y, pointFA2.y, f10));
            this.f26893a.get(size3).e(t7.j.i(pointFB3.x, pointFB4.x, f10), t7.j.i(pointFB3.y, pointFB4.y, f10));
            this.f26893a.get(size3).f(t7.j.i(pointFC.x, pointFC2.x, f10), t7.j.i(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f26894c;
    }

    public void e(boolean z10) {
        this.f26894c = z10;
    }

    public void f(float f10, float f11) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f26893a.size() + "closed=" + this.f26894c + '}';
    }

    public o() {
        this.f26893a = new ArrayList();
    }
}
