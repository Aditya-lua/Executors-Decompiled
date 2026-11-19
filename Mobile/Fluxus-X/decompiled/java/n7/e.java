package n7;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e implements o<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<u7.a<PointF>> f25470a;

    public e(List<u7.a<PointF>> list) {
        this.f25470a = list;
    }

    @Override // n7.o
    public j7.a<PointF, PointF> a() {
        return this.f25470a.get(0).i() ? new j7.k(this.f25470a) : new j7.j(this.f25470a);
    }

    @Override // n7.o
    public List<u7.a<PointF>> b() {
        return this.f25470a;
    }

    @Override // n7.o
    public boolean c() {
        return this.f25470a.size() == 1 && this.f25470a.get(0).i();
    }
}
