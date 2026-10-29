package p444t7;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import p121f7.C5452i;

/* JADX INFO: renamed from: t7.a */
/* JADX INFO: loaded from: classes3.dex */
public class C11550a<T> {

    /* JADX INFO: renamed from: a */
    public final C5452i f40888a;

    /* JADX INFO: renamed from: b */
    public final T f40889b;

    /* JADX INFO: renamed from: c */
    public T f40890c;

    /* JADX INFO: renamed from: d */
    public final Interpolator f40891d;

    /* JADX INFO: renamed from: e */
    public final Interpolator f40892e;

    /* JADX INFO: renamed from: f */
    public final Interpolator f40893f;

    /* JADX INFO: renamed from: g */
    public final float f40894g;

    /* JADX INFO: renamed from: h */
    public Float f40895h;

    /* JADX INFO: renamed from: i */
    public float f40896i;

    /* JADX INFO: renamed from: j */
    public float f40897j;

    /* JADX INFO: renamed from: k */
    public int f40898k;

    /* JADX INFO: renamed from: l */
    public int f40899l;

    /* JADX INFO: renamed from: m */
    public float f40900m;

    /* JADX INFO: renamed from: n */
    public float f40901n;

    /* JADX INFO: renamed from: o */
    public PointF f40902o;

    /* JADX INFO: renamed from: p */
    public PointF f40903p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11550a(C5452i c5452i, T t8, T t10, Interpolator interpolator, float f10, Float f11) {
        this.f40896i = -3987645.8f;
        this.f40897j = -3987645.8f;
        this.f40898k = 784923401;
        this.f40899l = 784923401;
        this.f40900m = Float.MIN_VALUE;
        this.f40901n = Float.MIN_VALUE;
        this.f40902o = null;
        this.f40903p = null;
        this.f40888a = c5452i;
        this.f40889b = t8;
        this.f40890c = t10;
        this.f40891d = interpolator;
        this.f40892e = null;
        this.f40893f = null;
        this.f40894g = f10;
        this.f40895h = f11;
    }

    /* JADX INFO: renamed from: a */
    public boolean m43178a(float f10) {
        return f10 >= m43183f() && f10 < m43180c();
    }

    /* JADX INFO: renamed from: b */
    public C11550a<T> m43179b(T t8, T t10) {
        return new C11550a<>(t8, t10);
    }

    /* JADX INFO: renamed from: c */
    public float m43180c() {
        if (this.f40888a == null) {
            return 1.0f;
        }
        if (this.f40901n == Float.MIN_VALUE) {
            if (this.f40895h == null) {
                this.f40901n = 1.0f;
            } else {
                float fM43183f = m43183f();
                this.f40901n = (float) (((double) fM43183f) + (((double) (this.f40895h.floatValue() - this.f40894g)) / ((double) this.f40888a.m25039e())));
            }
        }
        return this.f40901n;
    }

    /* JADX INFO: renamed from: d */
    public float m43181d() {
        if (this.f40897j == -3987645.8f) {
            this.f40897j = ((Float) this.f40890c).floatValue();
        }
        return this.f40897j;
    }

    /* JADX INFO: renamed from: e */
    public int m43182e() {
        if (this.f40899l == 784923401) {
            this.f40899l = ((Integer) this.f40890c).intValue();
        }
        return this.f40899l;
    }

    /* JADX INFO: renamed from: f */
    public float m43183f() {
        C5452i c5452i = this.f40888a;
        if (c5452i == null) {
            return 0.0f;
        }
        if (this.f40900m == Float.MIN_VALUE) {
            this.f40900m = (this.f40894g - c5452i.m25050p()) / this.f40888a.m25039e();
        }
        return this.f40900m;
    }

    /* JADX INFO: renamed from: g */
    public float m43184g() {
        if (this.f40896i == -3987645.8f) {
            this.f40896i = ((Float) this.f40889b).floatValue();
        }
        return this.f40896i;
    }

    /* JADX INFO: renamed from: h */
    public int m43185h() {
        if (this.f40898k == 784923401) {
            this.f40898k = ((Integer) this.f40889b).intValue();
        }
        return this.f40898k;
    }

    /* JADX INFO: renamed from: i */
    public boolean m43186i() {
        return this.f40891d == null && this.f40892e == null && this.f40893f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f40889b + ", endValue=" + this.f40890c + ", startFrame=" + this.f40894g + ", endFrame=" + this.f40895h + ", interpolator=" + this.f40891d + '}';
    }

    public C11550a(C5452i c5452i, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f40896i = -3987645.8f;
        this.f40897j = -3987645.8f;
        this.f40898k = 784923401;
        this.f40899l = 784923401;
        this.f40900m = Float.MIN_VALUE;
        this.f40901n = Float.MIN_VALUE;
        this.f40902o = null;
        this.f40903p = null;
        this.f40888a = c5452i;
        this.f40889b = t8;
        this.f40890c = t10;
        this.f40891d = null;
        this.f40892e = interpolator;
        this.f40893f = interpolator2;
        this.f40894g = f10;
        this.f40895h = f11;
    }

    public C11550a(C5452i c5452i, T t8, T t10, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f40896i = -3987645.8f;
        this.f40897j = -3987645.8f;
        this.f40898k = 784923401;
        this.f40899l = 784923401;
        this.f40900m = Float.MIN_VALUE;
        this.f40901n = Float.MIN_VALUE;
        this.f40902o = null;
        this.f40903p = null;
        this.f40888a = c5452i;
        this.f40889b = t8;
        this.f40890c = t10;
        this.f40891d = interpolator;
        this.f40892e = interpolator2;
        this.f40893f = interpolator3;
        this.f40894g = f10;
        this.f40895h = f11;
    }

    public C11550a(T t8) {
        this.f40896i = -3987645.8f;
        this.f40897j = -3987645.8f;
        this.f40898k = 784923401;
        this.f40899l = 784923401;
        this.f40900m = Float.MIN_VALUE;
        this.f40901n = Float.MIN_VALUE;
        this.f40902o = null;
        this.f40903p = null;
        this.f40888a = null;
        this.f40889b = t8;
        this.f40890c = t8;
        this.f40891d = null;
        this.f40892e = null;
        this.f40893f = null;
        this.f40894g = Float.MIN_VALUE;
        this.f40895h = Float.valueOf(Float.MAX_VALUE);
    }

    public C11550a(T t8, T t10) {
        this.f40896i = -3987645.8f;
        this.f40897j = -3987645.8f;
        this.f40898k = 784923401;
        this.f40899l = 784923401;
        this.f40900m = Float.MIN_VALUE;
        this.f40901n = Float.MIN_VALUE;
        this.f40902o = null;
        this.f40903p = null;
        this.f40888a = null;
        this.f40889b = t8;
        this.f40890c = t10;
        this.f40891d = null;
        this.f40892e = null;
        this.f40893f = null;
        this.f40894g = Float.MIN_VALUE;
        this.f40895h = Float.valueOf(Float.MAX_VALUE);
    }
}
