package n7;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class i implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f25471a;
    public final b b;

    public i(b bVar, b bVar2) {
        this.f25471a = bVar;
        this.b = bVar2;
    }

    @Override // n7.o
    public j7.a<PointF, PointF> a() {
        return new j7.n(this.f25471a.a(), this.b.a());
    }

    @Override // n7.o
    public List<u7.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // n7.o
    public boolean c() {
        return this.f25471a.c() && this.b.c();
    }
}
