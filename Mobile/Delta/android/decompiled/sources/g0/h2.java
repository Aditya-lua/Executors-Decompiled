package g0;

import android.graphics.Rect;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public final class h2 extends androidx.camera.core.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17986d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i1 f17987e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect f17988f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f17990h;

    public h2(androidx.camera.core.d dVar, i1 i1Var) {
        this(dVar, null, i1Var);
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public void I0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f17986d) {
            this.f17988f = rect;
        }
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public i1 I2() {
        return this.f17987e;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getHeight() {
        return this.f17990h;
    }

    @Override // androidx.camera.core.b, androidx.camera.core.d
    public int getWidth() {
        return this.f17989g;
    }

    public h2(androidx.camera.core.d dVar, Size size, i1 i1Var) {
        super(dVar);
        this.f17986d = new Object();
        if (size == null) {
            this.f17989g = super.getWidth();
            this.f17990h = super.getHeight();
        } else {
            this.f17989g = size.getWidth();
            this.f17990h = size.getHeight();
        }
        this.f17987e = i1Var;
    }
}
