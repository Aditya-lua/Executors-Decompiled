package p140g0;

import android.graphics.PointF;
import android.util.Rational;

/* JADX INFO: renamed from: g0.v1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5947v1 {

    /* JADX INFO: renamed from: a */
    public Rational f22650a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC5947v1() {
        this(null);
    }

    /* JADX INFO: renamed from: d */
    public static float m26635d() {
        return 0.15f;
    }

    /* JADX INFO: renamed from: a */
    public abstract PointF mo26501a(float f10, float f11);

    /* JADX INFO: renamed from: b */
    public final C5943u1 m26636b(float f10, float f11) {
        return m26637c(f10, f11, m26635d());
    }

    /* JADX INFO: renamed from: c */
    public final C5943u1 m26637c(float f10, float f11, float f12) {
        PointF pointFMo26501a = mo26501a(f10, f11);
        return new C5943u1(pointFMo26501a.x, pointFMo26501a.y, f12, this.f22650a);
    }

    /* JADX INFO: renamed from: e */
    public void m26638e(Rational rational) {
        this.f22650a = rational;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC5947v1(Rational rational) {
        this.f22650a = rational;
    }
}
