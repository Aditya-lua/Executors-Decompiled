package i7;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class i extends t7.a<PointF> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f20424q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t7.a<PointF> f20425r;

    public i(f7.i iVar, t7.a<PointF> aVar) {
        super(iVar, aVar.b, aVar.f32190c, aVar.f32191d, aVar.f32192e, aVar.f32193f, aVar.f32194g, aVar.f32195h);
        this.f20425r = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t8;
        T t10;
        T t11 = this.f32190c;
        boolean z10 = (t11 == 0 || (t10 = this.b) == 0 || !((PointF) t10).equals(((PointF) t11).x, ((PointF) t11).y)) ? false : true;
        T t12 = this.b;
        if (t12 == 0 || (t8 = this.f32190c) == 0 || z10) {
            return;
        }
        t7.a<PointF> aVar = this.f20425r;
        this.f20424q = s7.m.d((PointF) t12, (PointF) t8, aVar.f32202o, aVar.f32203p);
    }

    public Path k() {
        return this.f20424q;
    }
}
