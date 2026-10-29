package t7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import f7.i;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f31670a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f31671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f31672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f31673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f31674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f31675g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f31676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f31677i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f31678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31679k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31680l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f31681m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f31682n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f31683o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f31684p;

    public a(i iVar, T t8, T t10, Interpolator interpolator, float f10, Float f11) {
        this.f31677i = -3987645.8f;
        this.f31678j = -3987645.8f;
        this.f31679k = 784923401;
        this.f31680l = 784923401;
        this.f31681m = Float.MIN_VALUE;
        this.f31682n = Float.MIN_VALUE;
        this.f31683o = null;
        this.f31684p = null;
        this.f31670a = iVar;
        this.b = t8;
        this.f31671c = t10;
        this.f31672d = interpolator;
        this.f31673e = null;
        this.f31674f = null;
        this.f31675g = f10;
        this.f31676h = f11;
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public a<T> b(T t8, T t10) {
        return new a<>(t8, t10);
    }

    public float c() {
        if (this.f31670a == null) {
            return 1.0f;
        }
        if (this.f31682n == Float.MIN_VALUE) {
            if (this.f31676h == null) {
                this.f31682n = 1.0f;
            } else {
                float f10 = f();
                this.f31682n = (float) (((double) f10) + (((double) (this.f31676h.floatValue() - this.f31675g)) / ((double) this.f31670a.e())));
            }
        }
        return this.f31682n;
    }

    public float d() {
        if (this.f31678j == -3987645.8f) {
            this.f31678j = ((Float) this.f31671c).floatValue();
        }
        return this.f31678j;
    }

    public int e() {
        if (this.f31680l == 784923401) {
            this.f31680l = ((Integer) this.f31671c).intValue();
        }
        return this.f31680l;
    }

    public float f() {
        i iVar = this.f31670a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f31681m == Float.MIN_VALUE) {
            this.f31681m = (this.f31675g - iVar.p()) / this.f31670a.e();
        }
        return this.f31681m;
    }

    public float g() {
        if (this.f31677i == -3987645.8f) {
            this.f31677i = ((Float) this.b).floatValue();
        }
        return this.f31677i;
    }

    public int h() {
        if (this.f31679k == 784923401) {
            this.f31679k = ((Integer) this.b).intValue();
        }
        return this.f31679k;
    }

    public boolean i() {
        return this.f31672d == null && this.f31673e == null && this.f31674f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.f31671c + ", startFrame=" + this.f31675g + ", endFrame=" + this.f31676h + ", interpolator=" + this.f31672d + '}';
    }

    public a(i iVar, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f31677i = -3987645.8f;
        this.f31678j = -3987645.8f;
        this.f31679k = 784923401;
        this.f31680l = 784923401;
        this.f31681m = Float.MIN_VALUE;
        this.f31682n = Float.MIN_VALUE;
        this.f31683o = null;
        this.f31684p = null;
        this.f31670a = iVar;
        this.b = t8;
        this.f31671c = t10;
        this.f31672d = null;
        this.f31673e = interpolator;
        this.f31674f = interpolator2;
        this.f31675g = f10;
        this.f31676h = f11;
    }

    public a(i iVar, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f31677i = -3987645.8f;
        this.f31678j = -3987645.8f;
        this.f31679k = 784923401;
        this.f31680l = 784923401;
        this.f31681m = Float.MIN_VALUE;
        this.f31682n = Float.MIN_VALUE;
        this.f31683o = null;
        this.f31684p = null;
        this.f31670a = iVar;
        this.b = t8;
        this.f31671c = t10;
        this.f31672d = interpolator;
        this.f31673e = interpolator2;
        this.f31674f = interpolator3;
        this.f31675g = f10;
        this.f31676h = f11;
    }

    public a(T t8) {
        this.f31677i = -3987645.8f;
        this.f31678j = -3987645.8f;
        this.f31679k = 784923401;
        this.f31680l = 784923401;
        this.f31681m = Float.MIN_VALUE;
        this.f31682n = Float.MIN_VALUE;
        this.f31683o = null;
        this.f31684p = null;
        this.f31670a = null;
        this.b = t8;
        this.f31671c = t8;
        this.f31672d = null;
        this.f31673e = null;
        this.f31674f = null;
        this.f31675g = Float.MIN_VALUE;
        this.f31676h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(T t8, T t10) {
        this.f31677i = -3987645.8f;
        this.f31678j = -3987645.8f;
        this.f31679k = 784923401;
        this.f31680l = 784923401;
        this.f31681m = Float.MIN_VALUE;
        this.f31682n = Float.MIN_VALUE;
        this.f31683o = null;
        this.f31684p = null;
        this.f31670a = null;
        this.b = t8;
        this.f31671c = t10;
        this.f31672d = null;
        this.f31673e = null;
        this.f31674f = null;
        this.f31675g = Float.MIN_VALUE;
        this.f31676h = Float.valueOf(Float.MAX_VALUE);
    }
}
