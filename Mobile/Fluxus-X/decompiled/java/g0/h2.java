package g0;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends androidx.camera.core.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f16844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f16845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f16846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f16848h;

    public h2(androidx.camera.core.d dVar, i1 i1Var) {
        this(dVar, null, i1Var);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public i1 L2() {
        return this.f16845e;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public void N0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f16844d) {
            this.f16846f = rect;
        }
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getHeight() {
        return this.f16848h;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getWidth() {
        return this.f16847g;
    }

    public h2(androidx.camera.core.d dVar, Size size, i1 i1Var) {
        super(dVar);
        this.f16844d = new Object();
        if (size == null) {
            this.f16847g = super.getWidth();
            this.f16848h = super.getHeight();
        } else {
            this.f16847g = size.getWidth();
            this.f16848h = size.getHeight();
        }
        this.f16845e = i1Var;
    }
}
