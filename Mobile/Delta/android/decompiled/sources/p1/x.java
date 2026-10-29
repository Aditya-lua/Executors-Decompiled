package p1;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Rational;
import android.util.Size;
import g0.v1;

/* JADX INFO: loaded from: classes.dex */
public class x extends v1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final PointF f28196e = new PointF(2.0f, 2.0f);
    public final androidx.camera.view.b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f28197c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Matrix f28198d;

    public x(androidx.camera.view.b bVar) {
        this.b = bVar;
    }

    @Override // g0.v1
    public PointF a(float f10, float f11) {
        float[] fArr = {f10, f11};
        synchronized (this) {
            try {
                Matrix matrix = this.f28198d;
                if (matrix == null) {
                    return f28196e;
                }
                matrix.mapPoints(fArr);
                return new PointF(fArr[0], fArr[1]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(Size size, int i10) {
        Rect rect;
        p0.z.b();
        synchronized (this) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = this.f28197c) != null) {
                    this.f28198d = this.b.c(size, i10, rect);
                    return;
                }
                this.f28198d = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void g(Rect rect) {
        e(new Rational(rect.width(), rect.height()));
        synchronized (this) {
            this.f28197c = rect;
        }
    }
}
