package n0;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends u1 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Surface f24720o;

    public k2(Surface surface, Size size, int i10) {
        super(size, i10);
        this.f24720o = surface;
    }

    @Override // n0.u1
    public me.x<Surface> o() {
        return r0.n.p(this.f24720o);
    }

    public k2(Surface surface) {
        this.f24720o = surface;
    }
}
