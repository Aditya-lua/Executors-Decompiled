package m7;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<t7.a<PointF>> f24020a;

    public e(List<t7.a<PointF>> list) {
        this.f24020a = list;
    }

    @Override // m7.o
    public i7.a<PointF, PointF> a() {
        return this.f24020a.get(0).i() ? new i7.k(this.f24020a) : new i7.j(this.f24020a);
    }

    @Override // m7.o
    public List<t7.a<PointF>> b() {
        return this.f24020a;
    }

    @Override // m7.o
    public boolean c() {
        return this.f24020a.size() == 1 && this.f24020a.get(0).i();
    }
}
