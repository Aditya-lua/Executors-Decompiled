package d3;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f14389r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f14391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f14392d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14396h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14400l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14405q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0265a f14390a = new C0265a();
    public final Interpolator b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f14393e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f14394f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f14397i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f14398j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f14399k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: d3.a$a, reason: collision with other inner class name */
    public static class C0265a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14406a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14407c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f14408d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f14414j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f14415k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f14409e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f14413i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f14410f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14411g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14412h = 0;

        public void a() {
            if (this.f14410f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f14410f;
            this.f14410f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f14411g = (int) (this.f14407c * f10);
            this.f14412h = (int) (f10 * this.f14408d);
        }

        public int b() {
            return this.f14411g;
        }

        public int c() {
            return this.f14412h;
        }

        public int d() {
            float f10 = this.f14407c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            long j11 = this.f14409e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f14413i;
            if (j12 < 0 || j10 < j12) {
                return a.e((j10 - j11) / this.f14406a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f14414j;
            return (1.0f - f10) + (f10 * a.e((j10 - j12) / this.f14415k, 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f14408d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f14413i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f14413i + ((long) this.f14415k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f14415k = a.f((int) (jCurrentAnimationTimeMillis - this.f14409e), 0, this.b);
            this.f14414j = e(jCurrentAnimationTimeMillis);
            this.f14413i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.b = i10;
        }

        public void k(int i10) {
            this.f14406a = i10;
        }

        public void l(float f10, float f11) {
            this.f14407c = f10;
            this.f14408d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f14409e = jCurrentAnimationTimeMillis;
            this.f14413i = -1L;
            this.f14410f = jCurrentAnimationTimeMillis;
            this.f14414j = 0.5f;
            this.f14411g = 0;
            this.f14412h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f14403o) {
                if (aVar.f14401m) {
                    aVar.f14401m = false;
                    aVar.f14390a.m();
                }
                C0265a c0265a = a.this.f14390a;
                if (c0265a.h() || !a.this.u()) {
                    a.this.f14403o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f14402n) {
                    aVar2.f14402n = false;
                    aVar2.c();
                }
                c0265a.a();
                a.this.j(c0265a.b(), c0265a.c());
                o0.e0(a.this.f14391c, this);
            }
        }
    }

    public a(View view) {
        this.f14391c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f14389r);
        r(500);
        q(500);
    }

    public static float e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    public static int f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    public abstract boolean a(int i10);

    public abstract boolean b(int i10);

    public void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f14391c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f14393e[i10], f11, this.f14394f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f14397i[i10];
        float f14 = this.f14398j[i10];
        float f15 = this.f14399k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f14395g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f14403o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final float h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fE = e(f10 * f11, 0.0f, f12);
        float fG = g(f11 - f13, fE) - g(f13, fE);
        if (fG < 0.0f) {
            interpolation = -this.b.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.b.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f14401m) {
            this.f14403o = false;
        } else {
            this.f14390a.i();
        }
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f14396h = i10;
        return this;
    }

    public a l(int i10) {
        this.f14395g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f14404p && !z10) {
            i();
        }
        this.f14404p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f14394f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f14399k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f14404p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return !this.f14405q && this.f14403o;
        }
        this.f14402n = true;
        this.f14400l = false;
        this.f14390a.l(d(0, motionEvent.getX(), view.getWidth(), this.f14391c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f14391c.getHeight()));
        if (!this.f14403o && u()) {
            v();
        }
        if (this.f14405q) {
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f14398j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f14390a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f14390a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f14393e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f14397i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0265a c0265a = this.f14390a;
        int iF = c0265a.f();
        int iD = c0265a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public final void v() {
        int i10;
        if (this.f14392d == null) {
            this.f14392d = new b();
        }
        this.f14403o = true;
        this.f14401m = true;
        if (this.f14400l || (i10 = this.f14396h) <= 0) {
            this.f14392d.run();
        } else {
            o0.f0(this.f14391c, this.f14392d, i10);
        }
        this.f14400l = true;
    }
}
