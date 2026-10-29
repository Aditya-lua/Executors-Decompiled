package m7;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f24021a;
    public final b b;

    public i(b bVar, b bVar2) {
        this.f24021a = bVar;
        this.b = bVar2;
    }

    @Override // m7.o
    public i7.a<PointF, PointF> a() {
        return new i7.n(this.f24021a.a(), this.b.a());
    }

    @Override // m7.o
    public List<t7.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // m7.o
    public boolean c() {
        return this.f24021a.c() && this.b.c();
    }
}
