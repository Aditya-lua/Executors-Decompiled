package u7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import g7.i;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f33236a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f33237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f33238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f33239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f33240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f33241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f33242h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f33243i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f33244j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f33245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f33247m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f33248n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f33249o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f33250p;

    public a(i iVar, T t8, T t10, Interpolator interpolator, float f10, Float f11) {
        this.f33243i = -3987645.8f;
        this.f33244j = -3987645.8f;
        this.f33245k = 784923401;
        this.f33246l = 784923401;
        this.f33247m = Float.MIN_VALUE;
        this.f33248n = Float.MIN_VALUE;
        this.f33249o = null;
        this.f33250p = null;
        this.f33236a = iVar;
        this.b = t8;
        this.f33237c = t10;
        this.f33238d = interpolator;
        this.f33239e = null;
        this.f33240f = null;
        this.f33241g = f10;
        this.f33242h = f11;
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public a<T> b(T t8, T t10) {
        return new a<>(t8, t10);
    }

    public float c() {
        if (this.f33236a == null) {
            return 1.0f;
        }
        if (this.f33248n == Float.MIN_VALUE) {
            if (this.f33242h == null) {
                this.f33248n = 1.0f;
            } else {
                float f10 = f();
                this.f33248n = (float) (((double) f10) + (((double) (this.f33242h.floatValue() - this.f33241g)) / ((double) this.f33236a.e())));
            }
        }
        return this.f33248n;
    }

    public float d() {
        if (this.f33244j == -3987645.8f) {
            this.f33244j = ((Float) this.f33237c).floatValue();
        }
        return this.f33244j;
    }

    public int e() {
        if (this.f33246l == 784923401) {
            this.f33246l = ((Integer) this.f33237c).intValue();
        }
        return this.f33246l;
    }

    public float f() {
        i iVar = this.f33236a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f33247m == Float.MIN_VALUE) {
            this.f33247m = (this.f33241g - iVar.p()) / this.f33236a.e();
        }
        return this.f33247m;
    }

    public float g() {
        if (this.f33243i == -3987645.8f) {
            this.f33243i = ((Float) this.b).floatValue();
        }
        return this.f33243i;
    }

    public int h() {
        if (this.f33245k == 784923401) {
            this.f33245k = ((Integer) this.b).intValue();
        }
        return this.f33245k;
    }

    public boolean i() {
        return this.f33238d == null && this.f33239e == null && this.f33240f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.f33237c + ", startFrame=" + this.f33241g + ", endFrame=" + this.f33242h + ", interpolator=" + this.f33238d + '}';
    }

    public a(i iVar, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f33243i = -3987645.8f;
        this.f33244j = -3987645.8f;
        this.f33245k = 784923401;
        this.f33246l = 784923401;
        this.f33247m = Float.MIN_VALUE;
        this.f33248n = Float.MIN_VALUE;
        this.f33249o = null;
        this.f33250p = null;
        this.f33236a = iVar;
        this.b = t8;
        this.f33237c = t10;
        this.f33238d = null;
        this.f33239e = interpolator;
        this.f33240f = interpolator2;
        this.f33241g = f10;
        this.f33242h = f11;
    }

    public a(i iVar, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f33243i = -3987645.8f;
        this.f33244j = -3987645.8f;
        this.f33245k = 784923401;
        this.f33246l = 784923401;
        this.f33247m = Float.MIN_VALUE;
        this.f33248n = Float.MIN_VALUE;
        this.f33249o = null;
        this.f33250p = null;
        this.f33236a = iVar;
        this.b = t8;
        this.f33237c = t10;
        this.f33238d = interpolator;
        this.f33239e = interpolator2;
        this.f33240f = interpolator3;
        this.f33241g = f10;
        this.f33242h = f11;
    }

    public a(T t8) {
        this.f33243i = -3987645.8f;
        this.f33244j = -3987645.8f;
        this.f33245k = 784923401;
        this.f33246l = 784923401;
        this.f33247m = Float.MIN_VALUE;
        this.f33248n = Float.MIN_VALUE;
        this.f33249o = null;
        this.f33250p = null;
        this.f33236a = null;
        this.b = t8;
        this.f33237c = t8;
        this.f33238d = null;
        this.f33239e = null;
        this.f33240f = null;
        this.f33241g = Float.MIN_VALUE;
        this.f33242h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(T t8, T t10) {
        this.f33243i = -3987645.8f;
        this.f33244j = -3987645.8f;
        this.f33245k = 784923401;
        this.f33246l = 784923401;
        this.f33247m = Float.MIN_VALUE;
        this.f33248n = Float.MIN_VALUE;
        this.f33249o = null;
        this.f33250p = null;
        this.f33236a = null;
        this.b = t8;
        this.f33237c = t10;
        this.f33238d = null;
        this.f33239e = null;
        this.f33240f = null;
        this.f33241g = Float.MIN_VALUE;
        this.f33242h = Float.valueOf(Float.MAX_VALUE);
    }
}
