package p348p1;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import androidx.camera.view.C0505b;
import p140g0.AbstractC5947v1;
import p347p0.C10110z;

/* JADX INFO: renamed from: p1.x */
/* JADX INFO: loaded from: classes.dex */
public class C10150x extends AbstractC5947v1 {

    /* JADX INFO: renamed from: e */
    public static final PointF f36512e = new PointF(2.0f, 2.0f);

    /* JADX INFO: renamed from: b */
    public final C0505b f36513b;

    /* JADX INFO: renamed from: c */
    public Rect f36514c = null;

    /* JADX INFO: renamed from: d */
    public Matrix f36515d;

    public C10150x(C0505b c0505b) {
        this.f36513b = c0505b;
    }

    @Override // p140g0.AbstractC5947v1
    /* JADX INFO: renamed from: a */
    public PointF mo26501a(float f10, float f11) {
        float[] fArr = {f10, f11};
        synchronized (this) {
            try {
                Matrix matrix = this.f36515d;
                if (matrix == null) {
                    return f36512e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m39086f(Size size, int i10) {
        Rect rect;
        C10110z.m39008b();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f36514c) != null) {
                    this.f36515d = this.f36513b.m2378c(size, i10, rect);
                    return;
                }
                this.f36515d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m39087g(Rect rect) {
        m26638e(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f36514c = rect;
        }
    }
}
