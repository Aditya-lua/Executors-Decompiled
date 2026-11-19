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
    public static final int f11754r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f11756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f11757d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11761h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11765l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11766m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11767n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11768o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11770q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0209a f11755a = new C0209a();
    public final Interpolator b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f11758e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float[] f11759f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f11762i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float[] f11763j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float[] f11764k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: d3.a$a, reason: collision with other inner class name */
    public static class C0209a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f11771a;
        public int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f11772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f11773d;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f11779j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f11780k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f11774e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f11778i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f11775f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f11776g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f11777h = 0;

        public void a() {
            if (this.f11775f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f11775f;
            this.f11775f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fG;
            this.f11776g = (int) (this.f11772c * f10);
            this.f11777h = (int) (f10 * this.f11773d);
        }

        public int b() {
            return this.f11776g;
        }

        public int c() {
            return this.f11777h;
        }

        public int d() {
            float f10 = this.f11772c;
            return (int) (f10 / Math.abs(f10));
        }

        public final float e(long j10) {
            long j11 = this.f11774e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f11778i;
            if (j12 < 0 || j10 < j12) {
                return a.e((j10 - j11) / this.f11771a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f11779j;
            return (1.0f - f10) + (f10 * a.e((j10 - j12) / this.f11780k, 0.0f, 1.0f));
        }

        public int f() {
            float f10 = this.f11773d;
            return (int) (f10 / Math.abs(f10));
        }

        public final float g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        public boolean h() {
            return this.f11778i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f11778i + ((long) this.f11780k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f11780k = a.f((int) (jCurrentAnimationTimeMillis - this.f11774e), 0, this.b);
            this.f11779j = e(jCurrentAnimationTimeMillis);
            this.f11778i = jCurrentAnimationTimeMillis;
        }

        public void j(int i10) {
            this.b = i10;
        }

        public void k(int i10) {
            this.f11771a = i10;
        }

        public void l(float f10, float f11) {
            this.f11772c = f10;
            this.f11773d = f11;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f11774e = jCurrentAnimationTimeMillis;
            this.f11778i = -1L;
            this.f11775f = jCurrentAnimationTimeMillis;
            this.f11779j = 0.5f;
            this.f11776g = 0;
            this.f11777h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f11768o) {
                if (aVar.f11766m) {
                    aVar.f11766m = false;
                    aVar.f11755a.m();
                }
                C0209a c0209a = a.this.f11755a;
                if (c0209a.h() || !a.this.u()) {
                    a.this.f11768o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f11767n) {
                    aVar2.f11767n = false;
                    aVar2.c();
                }
                c0209a.a();
                a.this.j(c0209a.b(), c0209a.c());
                o0.e0(a.this.f11756c, this);
            }
        }
    }

    public a(View view) {
        this.f11756c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        p(f12, f12);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f11754r);
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
        this.f11756c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final float d(int i10, float f10, float f11, float f12) {
        float fH = h(this.f11758e[i10], f11, this.f11759f[i10], f10);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f11762i[i10];
        float f14 = this.f11763j[i10];
        float f15 = this.f11764k[i10];
        float f16 = f13 * f12;
        return fH > 0.0f ? e(fH * f16, f14, f15) : -e((-fH) * f16, f14, f15);
    }

    public final float g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f11760g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f11768o && i10 == 1) {
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
        if (this.f11766m) {
            this.f11768o = false;
        } else {
            this.f11755a.i();
        }
    }

    public abstract void j(int i10, int i11);

    public a k(int i10) {
        this.f11761h = i10;
        return this;
    }

    public a l(int i10) {
        this.f11760g = i10;
        return this;
    }

    public a m(boolean z10) {
        if (this.f11769p && !z10) {
            i();
        }
        this.f11769p = z10;
        return this;
    }

    public a n(float f10, float f11) {
        float[] fArr = this.f11759f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a o(float f10, float f11) {
        float[] fArr = this.f11764k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f11769p) {
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
            return !this.f11770q && this.f11768o;
        }
        this.f11767n = true;
        this.f11765l = false;
        this.f11755a.l(d(0, motionEvent.getX(), view.getWidth(), this.f11756c.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f11756c.getHeight()));
        if (!this.f11768o && u()) {
            v();
        }
        if (this.f11770q) {
        }
    }

    public a p(float f10, float f11) {
        float[] fArr = this.f11763j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public a q(int i10) {
        this.f11755a.j(i10);
        return this;
    }

    public a r(int i10) {
        this.f11755a.k(i10);
        return this;
    }

    public a s(float f10, float f11) {
        float[] fArr = this.f11758e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    public a t(float f10, float f11) {
        float[] fArr = this.f11762i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0209a c0209a = this.f11755a;
        int iF = c0209a.f();
        int iD = c0209a.d();
        if (iF == 0 || !b(iF)) {
            return iD != 0 && a(iD);
        }
        return true;
    }

    public final void v() {
        int i10;
        if (this.f11757d == null) {
            this.f11757d = new b();
        }
        this.f11768o = true;
        this.f11766m = true;
        if (this.f11765l || (i10 = this.f11761h) <= 0) {
            this.f11757d.run();
        } else {
            o0.f0(this.f11756c, this.f11757d, i10);
        }
        this.f11765l = true;
    }
}
