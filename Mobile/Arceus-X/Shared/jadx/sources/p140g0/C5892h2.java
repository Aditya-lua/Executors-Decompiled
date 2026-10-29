package p140g0;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.AbstractC0492b;
import androidx.camera.core.InterfaceC0494d;

/* JADX INFO: renamed from: g0.h2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5892h2 extends AbstractC0492b {

    /* JADX INFO: renamed from: d */
    public final Object f22520d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5895i1 f22521e;

    /* JADX INFO: renamed from: f */
    public Rect f22522f;

    /* JADX INFO: renamed from: g */
    public final int f22523g;

    /* JADX INFO: renamed from: h */
    public final int f22524h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5892h2(InterfaceC0494d interfaceC0494d, InterfaceC5895i1 interfaceC5895i1) {
        this(interfaceC0494d, null, interfaceC5895i1);
    }

    @Override // androidx.camera.core.AbstractC0492b, androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: H2 */
    public InterfaceC5895i1 mo2192H2() {
        return this.f22521e;
    }

    @Override // androidx.camera.core.AbstractC0492b, androidx.camera.core.InterfaceC0494d
    /* JADX INFO: renamed from: M0 */
    public void mo2193M0(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, getWidth(), getHeight())) {
                rect2.setEmpty();
            }
            rect = rect2;
        }
        synchronized (this.f22520d) {
            this.f22522f = rect;
        }
    }

    @Override // androidx.camera.core.AbstractC0492b, androidx.camera.core.InterfaceC0494d
    public int getHeight() {
        return this.f22524h;
    }

    @Override // androidx.camera.core.AbstractC0492b, androidx.camera.core.InterfaceC0494d
    public int getWidth() {
        return this.f22523g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5892h2(InterfaceC0494d interfaceC0494d, Size size, InterfaceC5895i1 interfaceC5895i1) {
        super(interfaceC0494d);
        this.f22520d = new Object();
        if (size == null) {
            this.f22523g = super.getWidth();
            this.f22524h = super.getHeight();
        } else {
            this.f22523g = size.getWidth();
            this.f22524h = size.getHeight();
        }
        this.f22521e = interfaceC5895i1;
    }
}
