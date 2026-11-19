package j7;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class i extends u7.a<PointF> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f20110q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u7.a<PointF> f20111r;

    public i(g7.i iVar, u7.a<PointF> aVar) {
        super(iVar, aVar.b, aVar.f33237c, aVar.f33238d, aVar.f33239e, aVar.f33240f, aVar.f33241g, aVar.f33242h);
        this.f20111r = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t8;
        T t10;
        T t11 = this.f33237c;
        boolean z10 = (t11 == 0 || (t10 = this.b) == 0 || !((PointF) t10).equals(((PointF) t11).x, ((PointF) t11).y)) ? false : true;
        T t12 = this.b;
        if (t12 == 0 || (t8 = this.f33237c) == 0 || z10) {
            return;
        }
        u7.a<PointF> aVar = this.f20111r;
        this.f20110q = t7.m.d((PointF) t12, (PointF) t8, aVar.f33249o, aVar.f33250p);
    }

    public Path k() {
        return this.f20110q;
    }
}
