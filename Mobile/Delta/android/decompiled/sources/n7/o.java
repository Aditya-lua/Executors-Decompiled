package n7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<l7.a> f25197a;
    public PointF b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25198c;

    public o(PointF pointF, boolean z10, List<l7.a> list) {
        this.b = pointF;
        this.f25198c = z10;
        this.f25197a = new ArrayList(list);
    }

    public List<l7.a> a() {
        return this.f25197a;
    }

    public PointF b() {
        return this.b;
    }

    public void c(o oVar, o oVar2, float f10) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.f25198c = oVar.d() || oVar2.d();
        if (oVar.a().size() != oVar2.a().size()) {
            s7.e.c("Curves must have the same number of control points. Shape 1: " + oVar.a().size() + "\tShape 2: " + oVar2.a().size());
        }
        int iMin = Math.min(oVar.a().size(), oVar2.a().size());
        if (this.f25197a.size() < iMin) {
            for (int size = this.f25197a.size(); size < iMin; size++) {
                this.f25197a.add(new l7.a());
            }
        } else if (this.f25197a.size() > iMin) {
            for (int size2 = this.f25197a.size() - 1; size2 >= iMin; size2--) {
                List<l7.a> list = this.f25197a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointFB = oVar.b();
        PointF pointFB2 = oVar2.b();
        f(s7.j.i(pointFB.x, pointFB2.x, f10), s7.j.i(pointFB.y, pointFB2.y, f10));
        for (int size3 = this.f25197a.size() - 1; size3 >= 0; size3--) {
            l7.a aVar = oVar.a().get(size3);
            l7.a aVar2 = oVar2.a().get(size3);
            PointF pointFA = aVar.a();
            PointF pointFB3 = aVar.b();
            PointF pointFC = aVar.c();
            PointF pointFA2 = aVar2.a();
            PointF pointFB4 = aVar2.b();
            PointF pointFC2 = aVar2.c();
            this.f25197a.get(size3).d(s7.j.i(pointFA.x, pointFA2.x, f10), s7.j.i(pointFA.y, pointFA2.y, f10));
            this.f25197a.get(size3).e(s7.j.i(pointFB3.x, pointFB4.x, f10), s7.j.i(pointFB3.y, pointFB4.y, f10));
            this.f25197a.get(size3).f(s7.j.i(pointFC.x, pointFC2.x, f10), s7.j.i(pointFC.y, pointFC2.y, f10));
        }
    }

    public boolean d() {
        return this.f25198c;
    }

    public void e(boolean z10) {
        this.f25198c = z10;
    }

    public void f(float f10, float f11) {
        if (this.b == null) {
            this.b = new PointF();
        }
        this.b.set(f10, f11);
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.f25197a.size() + "closed=" + this.f25198c + '}';
    }

    public o() {
        this.f25197a = new ArrayList();
    }
}
