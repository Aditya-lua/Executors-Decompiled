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
    public static final int f14369r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f14371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f14372d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14376h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f14380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14382n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14383o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f14384p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f14385q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0277a f14370a = new C0277a();
    public final Interpolator b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f14373e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f14374f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f14377i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f14378j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f14379k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: d3.a$a, reason: collision with other inner class name */
    public static class C0277a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14386a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f14387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f14388d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f14394j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f14395k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f14389e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f14393i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f14390f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f14391g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f14392h = 0;

        public void a() {
            if (this.f14390f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f14390f;
            this.f14390f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f14391g = (int) (this.f14387c * f10);
            this.f14392h = (int) (f10 * this.f14388d);
        }

        public int b() {
            return this.f14391g;
        }

        public int c() {
            return this.f14392h;
        }

        public int d() {
            float f10 = this.f14387c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            long j11 = this.f14389e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f14393i;
            if (j12 < 0 || j10 < j12) {
                return a.e((j10 - j11) / this.f14386a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f14394j;
            return (1.0f - f10) + (f10 * a.e((j10 - j12) / this.f14395k, 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f14388d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f14393i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f14393i + ((long) this.f14395k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f14395k = a.f((int) (jCurrentAnimationTimeMillis - this.f14389e), 0, this.b);
            this.f14394j = e(jCurrentAnimationTimeMillis);
            this.f14393i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.b = i10;
        }

        public void k(int i10) {
            this.f14386a = i10;
        }

        public void l(float f10, float f11) {
            this.f14387c = f10;
            this.f14388d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f14389e = jCurrentAnimationTimeMillis;
            this.f14393i = -1L;
            this.f14390f = jCurrentAnimationTimeMillis;
            this.f14394j = 0.5f;
            this.f14391g = 0;
            this.f14392h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f14383o) {
                if (aVar.f14381m) {
                    aVar.f14381m = false;
                    aVar.f14370a.m();
                }
                C0277a c0277a = a.this.f14370a;
                if (c0277a.h() || !a.this.u()) {
                    a.this.f14383o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f14382n) {
                    aVar2.f14382n = false;
                    aVar2.c();
                }
                c0277a.a();
                a.this.j(c0277a.b(), c0277a.c());
                o0.e0(a.this.f14371c, this);
            }
        }
    }

    public a(View view) {
        this.f14371c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f14369r);
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
        this.f14371c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f14373e[i10], f11, this.f14374f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f14377i[i10];
        float f14 = this.f14378j[i10];
        float f15 = this.f14379k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f14375g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f14383o && i10 == 1) {
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
        if (this.f14381m) {
            this.f14383o = false;
        } else {
            this.f14370a.i();
        }
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f14376h = i10;
        return this;
    }

    public a l(int i10) {
        this.f14375g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f14384p && !z10) {
            i();
        }
        this.f14384p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f14374f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f14379k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f14384p) {
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
            return !this.f14385q && this.f14383o;
        }
        this.f14382n = true;
        this.f14380l = false;
        this.f14370a.l(d(0, motionEvent.getX(), view.getWidth(), this.f14371c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f14371c.getHeight()));
        if (!this.f14383o && u()) {
            v();
        }
        if (this.f14385q) {
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f14378j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f14370a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f14370a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f14373e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f14377i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0277a c0277a = this.f14370a;
        int iF = c0277a.f();
        int iD = c0277a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public final void v() {
        int i10;
        if (this.f14372d == null) {
            this.f14372d = new b();
        }
        this.f14383o = true;
        this.f14381m = true;
        if (this.f14380l || (i10 = this.f14376h) <= 0) {
            this.f14372d.run();
        } else {
            o0.f0(this.f14371c, this.f14372d, i10);
        }
        this.f14380l = true;
    }
}
