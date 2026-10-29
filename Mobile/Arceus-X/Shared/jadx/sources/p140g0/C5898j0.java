package p140g0;

import android.graphics.PointF;
import android.view.Display;

/* JADX INFO: renamed from: g0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5898j0 extends AbstractC5947v1 {

    /* JADX INFO: renamed from: b */
    public final float f22537b;

    /* JADX INFO: renamed from: c */
    public final float f22538c;

    /* JADX INFO: renamed from: d */
    public final Display f22539d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC5937t f22540e;

    public C5898j0(Display display, InterfaceC5937t interfaceC5937t, float f10, float f11) {
        this.f22537b = f10;
        this.f22538c = f11;
        this.f22539d = display;
        this.f22540e = interfaceC5937t;
    }

    @Override // p140g0.AbstractC5947v1
    /* JADX INFO: renamed from: a */
    public PointF mo26501a(float f10, float f11) {
        float f12 = this.f22537b;
        float f13 = this.f22538c;
        boolean z10 = this.f22540e.mo26583i() == 0;
        int iM26502f = m26502f(z10);
        if (iM26502f != 90 && iM26502f != 270) {
            f11 = f10;
            f10 = f11;
            f13 = f12;
            f12 = f13;
        }
        if (iM26502f == 90) {
            f10 = f12 - f10;
        } else if (iM26502f == 180) {
            f11 = f13 - f11;
            f10 = f12 - f10;
        } else if (iM26502f == 270) {
            f11 = f13 - f11;
        }
        if (z10) {
            f11 = f13 - f11;
        }
        return new PointF(f11 / f13, f10 / f12);
    }

    /* JADX INFO: renamed from: f */
    public final int m26502f(boolean z10) {
        try {
            int iMo6751w = this.f22540e.mo6751w(this.f22539d.getRotation());
            return z10 ? (360 - iMo6751w) % 360 : iMo6751w;
        } catch (Exception unused) {
            return 0;
        }
    }
}
