package g0;

import android.graphics.PointF;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends v1 {
    public final float b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f17999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Display f18000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f18001e;

    public j0(Display display, t tVar, float f10, float f11) {
        this.b = f10;
        this.f17999c = f11;
        this.f18000d = display;
        this.f18001e = tVar;
    }

    @Override // g0.v1
    public PointF a(float f10, float f11) {
        float f12 = this.b;
        float f13 = this.f17999c;
        boolean z10 = this.f18001e.i() == 0;
        int iF = f(z10);
        if (iF != 90 && iF != 270) {
            f11 = f10;
            f10 = f11;
            f13 = f12;
            f12 = f13;
        }
        if (iF == 90) {
            f10 = f12 - f10;
        } else if (iF == 180) {
            f11 = f13 - f11;
            f10 = f12 - f10;
        } else if (iF == 270) {
            f11 = f13 - f11;
        }
        if (z10) {
            f11 = f13 - f11;
        }
        return new PointF(f11 / f13, f10 / f12);
    }

    public final int f(boolean z10) {
        try {
            int iW = this.f18001e.w(this.f18000d.getRotation());
            return z10 ? (360 - iW) % 360 : iW;
        } catch (Exception unused) {
            return 0;
        }
    }
}
