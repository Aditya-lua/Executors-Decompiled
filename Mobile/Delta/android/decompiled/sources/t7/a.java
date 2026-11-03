package t7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import f7.i;

/* JADX INFO: loaded from: classes3.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f32189a;
    public final T b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f32190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Interpolator f32191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Interpolator f32192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator f32193f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f32194g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Float f32195h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f32196i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f32197j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32198k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f32200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f32201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PointF f32202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public PointF f32203p;

    public a(i iVar, T t8, T t10, Interpolator interpolator, float f10, Float f11) {
        this.f32196i = -3987645.8f;
        this.f32197j = -3987645.8f;
        this.f32198k = 784923401;
        this.f32199l = 784923401;
        this.f32200m = Float.MIN_VALUE;
        this.f32201n = Float.MIN_VALUE;
        this.f32202o = null;
        this.f32203p = null;
        this.f32189a = iVar;
        this.b = t8;
        this.f32190c = t10;
        this.f32191d = interpolator;
        this.f32192e = null;
        this.f32193f = null;
        this.f32194g = f10;
        this.f32195h = f11;
    }

    public boolean a(float f10) {
        return f10 >= f() && f10 < c();
    }

    public a<T> b(T t8, T t10) {
        return new a<>(t8, t10);
    }

    public float c() {
        if (this.f32189a == null) {
            return 1.0f;
        }
        if (this.f32201n == Float.MIN_VALUE) {
            if (this.f32195h == null) {
                this.f32201n = 1.0f;
            } else {
                float f10 = f();
                this.f32201n = (float) (((double) f10) + (((double) (this.f32195h.floatValue() - this.f32194g)) / ((double) this.f32189a.e())));
            }
        }
        return this.f32201n;
    }

    public float d() {
        if (this.f32197j == -3987645.8f) {
            this.f32197j = ((Float) this.f32190c).floatValue();
        }
        return this.f32197j;
    }

    public int e() {
        if (this.f32199l == 784923401) {
            this.f32199l = ((Integer) this.f32190c).intValue();
        }
        return this.f32199l;
    }

    public float f() {
        i iVar = this.f32189a;
        if (iVar == null) {
            return 0.0f;
        }
        if (this.f32200m == Float.MIN_VALUE) {
            this.f32200m = (this.f32194g - iVar.p()) / this.f32189a.e();
        }
        return this.f32200m;
    }

    public float g() {
        if (this.f32196i == -3987645.8f) {
            this.f32196i = ((Float) this.b).floatValue();
        }
        return this.f32196i;
    }

    public int h() {
        if (this.f32198k == 784923401) {
            this.f32198k = ((Integer) this.b).intValue();
        }
        return this.f32198k;
    }

    public boolean i() {
        return this.f32191d == null && this.f32192e == null && this.f32193f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.b + ", endValue=" + this.f32190c + ", startFrame=" + this.f32194g + ", endFrame=" + this.f32195h + ", interpolator=" + this.f32191d + '}';
    }

    public a(i iVar, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f32196i = -3987645.8f;
        this.f32197j = -3987645.8f;
        this.f32198k = 784923401;
        this.f32199l = 784923401;
        this.f32200m = Float.MIN_VALUE;
        this.f32201n = Float.MIN_VALUE;
        this.f32202o = null;
        this.f32203p = null;
        this.f32189a = iVar;
        this.b = t8;
        this.f32190c = t10;
        this.f32191d = null;
        this.f32192e = interpolator;
        this.f32193f = interpolator2;
        this.f32194g = f10;
        this.f32195h = f11;
    }

    public a(i iVar, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f32196i = -3987645.8f;
        this.f32197j = -3987645.8f;
        this.f32198k = 784923401;
        this.f32199l = 784923401;
        this.f32200m = Float.MIN_VALUE;
        this.f32201n = Float.MIN_VALUE;
        this.f32202o = null;
        this.f32203p = null;
        this.f32189a = iVar;
        this.b = t8;
        this.f32190c = t10;
        this.f32191d = interpolator;
        this.f32192e = interpolator2;
        this.f32193f = interpolator3;
        this.f32194g = f10;
        this.f32195h = f11;
    }

    public a(T t8) {
        this.f32196i = -3987645.8f;
        this.f32197j = -3987645.8f;
        this.f32198k = 784923401;
        this.f32199l = 784923401;
        this.f32200m = Float.MIN_VALUE;
        this.f32201n = Float.MIN_VALUE;
        this.f32202o = null;
        this.f32203p = null;
        this.f32189a = null;
        this.b = t8;
        this.f32190c = t8;
        this.f32191d = null;
        this.f32192e = null;
        this.f32193f = null;
        this.f32194g = Float.MIN_VALUE;
        this.f32195h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(T t8, T t10) {
        this.f32196i = -3987645.8f;
        this.f32197j = -3987645.8f;
        this.f32198k = 784923401;
        this.f32199l = 784923401;
        this.f32200m = Float.MIN_VALUE;
        this.f32201n = Float.MIN_VALUE;
        this.f32202o = null;
        this.f32203p = null;
        this.f32189a = null;
        this.b = t8;
        this.f32190c = t10;
        this.f32191d = null;
        this.f32192e = null;
        this.f32193f = null;
        this.f32194g = Float.MIN_VALUE;
        this.f32195h = Float.valueOf(Float.MAX_VALUE);
    }
}
