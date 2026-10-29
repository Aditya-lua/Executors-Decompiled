package i7;

import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public class i extends t7.a<PointF> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Path f20308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t7.a<PointF> f20309r;

    public i(f7.i iVar, t7.a<PointF> aVar) {
        super(iVar, aVar.b, aVar.f31671c, aVar.f31672d, aVar.f31673e, aVar.f31674f, aVar.f31675g, aVar.f31676h);
        this.f20309r = aVar;
        j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        T t8;
        T t10;
        T t11 = this.f31671c;
        boolean z10 = (t11 == 0 || (t10 = this.b) == 0 || !((PointF) t10).equals(((PointF) t11).x, ((PointF) t11).y)) ? false : true;
        T t12 = this.b;
        if (t12 == 0 || (t8 = this.f31671c) == 0 || z10) {
            return;
        }
        t7.a<PointF> aVar = this.f20309r;
        this.f20308q = s7.m.d((PointF) t12, (PointF) t8, aVar.f31683o, aVar.f31684p);
    }

    public Path k() {
        return this.f20308q;
    }
}
