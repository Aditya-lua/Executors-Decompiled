package p066d3;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.C0625o0;

/* JADX INFO: renamed from: d3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC4423a implements View.OnTouchListener {

    /* JADX INFO: renamed from: r */
    public static final int f18394r = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: c */
    public final View f18397c;

    /* JADX INFO: renamed from: d */
    public Runnable f18398d;

    /* JADX INFO: renamed from: g */
    public int f18401g;

    /* JADX INFO: renamed from: h */
    public int f18402h;

    /* JADX INFO: renamed from: l */
    public boolean f18406l;

    /* JADX INFO: renamed from: m */
    public boolean f18407m;

    /* JADX INFO: renamed from: n */
    public boolean f18408n;

    /* JADX INFO: renamed from: o */
    public boolean f18409o;

    /* JADX INFO: renamed from: p */
    public boolean f18410p;

    /* JADX INFO: renamed from: q */
    public boolean f18411q;

    /* JADX INFO: renamed from: a */
    public final a f18395a = new a();

    /* JADX INFO: renamed from: b */
    public final Interpolator f18396b = new AccelerateInterpolator();

    /* JADX INFO: renamed from: e */
    public float[] f18399e = {0.0f, 0.0f};

    /* JADX INFO: renamed from: f */
    public float[] f18400f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: i */
    public float[] f18403i = {0.0f, 0.0f};

    /* JADX INFO: renamed from: j */
    public float[] f18404j = {0.0f, 0.0f};

    /* JADX INFO: renamed from: k */
    public float[] f18405k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: d3.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f18412a;

        /* JADX INFO: renamed from: b */
        public int f18413b;

        /* JADX INFO: renamed from: c */
        public float f18414c;

        /* JADX INFO: renamed from: d */
        public float f18415d;

        /* JADX INFO: renamed from: j */
        public float f18421j;

        /* JADX INFO: renamed from: k */
        public int f18422k;

        /* JADX INFO: renamed from: e */
        public long f18416e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: i */
        public long f18420i = -1;

        /* JADX INFO: renamed from: f */
        public long f18417f = 0;

        /* JADX INFO: renamed from: g */
        public int f18418g = 0;

        /* JADX INFO: renamed from: h */
        public int f18419h = 0;

        /* JADX INFO: renamed from: a */
        public void m22245a() {
            if (this.f18417f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fM22251g = m22251g(m22249e(jCurrentAnimationTimeMillis));
            long j10 = jCurrentAnimationTimeMillis - this.f18417f;
            this.f18417f = jCurrentAnimationTimeMillis;
            float f10 = j10 * fM22251g;
            this.f18418g = (int) (this.f18414c * f10);
            this.f18419h = (int) (f10 * this.f18415d);
        }

        /* JADX INFO: renamed from: b */
        public int m22246b() {
            return this.f18418g;
        }

        /* JADX INFO: renamed from: c */
        public int m22247c() {
            return this.f18419h;
        }

        /* JADX INFO: renamed from: d */
        public int m22248d() {
            float f10 = this.f18414c;
            return (int) (f10 / Math.abs(f10));
        }

        /* JADX INFO: renamed from: e */
        public final float m22249e(long j10) {
            long j11 = this.f18416e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f18420i;
            if (j12 < 0 || j10 < j12) {
                return AbstractViewOnTouchListenerC4423a.m22223e((j10 - j11) / this.f18412a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f18421j;
            return (1.0f - f10) + (f10 * AbstractViewOnTouchListenerC4423a.m22223e((j10 - j12) / this.f18422k, 0.0f, 1.0f));
        }

        /* JADX INFO: renamed from: f */
        public int m22250f() {
            float f10 = this.f18415d;
            return (int) (f10 / Math.abs(f10));
        }

        /* JADX INFO: renamed from: g */
        public final float m22251g(float f10) {
            return ((-4.0f) * f10 * f10) + (f10 * 4.0f);
        }

        /* JADX INFO: renamed from: h */
        public boolean m22252h() {
            return this.f18420i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f18420i + ((long) this.f18422k);
        }

        /* JADX INFO: renamed from: i */
        public void m22253i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f18422k = AbstractViewOnTouchListenerC4423a.m22224f((int) (jCurrentAnimationTimeMillis - this.f18416e), 0, this.f18413b);
            this.f18421j = m22249e(jCurrentAnimationTimeMillis);
            this.f18420i = jCurrentAnimationTimeMillis;
        }

        /* JADX INFO: renamed from: j */
        public void m22254j(int i10) {
            this.f18413b = i10;
        }

        /* JADX INFO: renamed from: k */
        public void m22255k(int i10) {
            this.f18412a = i10;
        }

        /* JADX INFO: renamed from: l */
        public void m22256l(float f10, float f11) {
            this.f18414c = f10;
            this.f18415d = f11;
        }

        /* JADX INFO: renamed from: m */
        public void m22257m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f18416e = jCurrentAnimationTimeMillis;
            this.f18420i = -1L;
            this.f18417f = jCurrentAnimationTimeMillis;
            this.f18421j = 0.5f;
            this.f18418g = 0;
            this.f18419h = 0;
        }
    }

    /* JADX INFO: renamed from: d3.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractViewOnTouchListenerC4423a abstractViewOnTouchListenerC4423a = AbstractViewOnTouchListenerC4423a.this;
            if (abstractViewOnTouchListenerC4423a.f18409o) {
                if (abstractViewOnTouchListenerC4423a.f18407m) {
                    abstractViewOnTouchListenerC4423a.f18407m = false;
                    abstractViewOnTouchListenerC4423a.f18395a.m22257m();
                }
                a aVar = AbstractViewOnTouchListenerC4423a.this.f18395a;
                if (aVar.m22252h() || !AbstractViewOnTouchListenerC4423a.this.m22243u()) {
                    AbstractViewOnTouchListenerC4423a.this.f18409o = false;
                    return;
                }
                AbstractViewOnTouchListenerC4423a abstractViewOnTouchListenerC4423a2 = AbstractViewOnTouchListenerC4423a.this;
                if (abstractViewOnTouchListenerC4423a2.f18408n) {
                    abstractViewOnTouchListenerC4423a2.f18408n = false;
                    abstractViewOnTouchListenerC4423a2.m22227c();
                }
                aVar.m22245a();
                AbstractViewOnTouchListenerC4423a.this.mo22232j(aVar.m22246b(), aVar.m22247c());
                C0625o0.m3024e0(AbstractViewOnTouchListenerC4423a.this.f18397c, this);
            }
        }
    }

    public AbstractViewOnTouchListenerC4423a(View view) {
        this.f18397c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float f11 = (int) ((1575.0f * f10) + 0.5f);
        m22237o(f11, f11);
        float f12 = (int) ((f10 * 315.0f) + 0.5f);
        m22238p(f12, f12);
        m22234l(1);
        m22236n(Float.MAX_VALUE, Float.MAX_VALUE);
        m22241s(0.2f, 0.2f);
        m22242t(1.0f, 1.0f);
        m22233k(f18394r);
        m22240r(500);
        m22239q(500);
    }

    /* JADX INFO: renamed from: e */
    public static float m22223e(float f10, float f11, float f12) {
        if (f10 > f12) {
            return f12;
        }
        return f10 < f11 ? f11 : f10;
    }

    /* JADX INFO: renamed from: f */
    public static int m22224f(int i10, int i11, int i12) {
        if (i10 > i12) {
            return i12;
        }
        return i10 < i11 ? i11 : i10;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo22225a(int i10);

    /* JADX INFO: renamed from: b */
    public abstract boolean mo22226b(int i10);

    /* JADX INFO: renamed from: c */
    public void m22227c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f18397c.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    /* JADX INFO: renamed from: d */
    public final float m22228d(int i10, float f10, float f11, float f12) {
        float fM22230h = m22230h(this.f18399e[i10], f11, this.f18400f[i10], f10);
        if (fM22230h == 0.0f) {
            return 0.0f;
        }
        float f13 = this.f18403i[i10];
        float f14 = this.f18404j[i10];
        float f15 = this.f18405k[i10];
        float f16 = f13 * f12;
        return fM22230h > 0.0f ? m22223e(fM22230h * f16, f14, f15) : -m22223e((-fM22230h) * f16, f14, f15);
    }

    /* JADX INFO: renamed from: g */
    public final float m22229g(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f18401g;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.f18409o && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: h */
    public final float m22230h(float f10, float f11, float f12, float f13) {
        float interpolation;
        float fM22223e = m22223e(f10 * f11, 0.0f, f12);
        float fM22229g = m22229g(f11 - f13, fM22223e) - m22229g(f13, fM22223e);
        if (fM22229g < 0.0f) {
            interpolation = -this.f18396b.getInterpolation(-fM22229g);
        } else {
            if (fM22229g <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f18396b.getInterpolation(fM22229g);
        }
        return m22223e(interpolation, -1.0f, 1.0f);
    }

    /* JADX INFO: renamed from: i */
    public final void m22231i() {
        if (this.f18407m) {
            this.f18409o = false;
        } else {
            this.f18395a.m22253i();
        }
    }

    /* JADX INFO: renamed from: j */
    public abstract void mo22232j(int i10, int i11);

    /* JADX INFO: renamed from: k */
    public AbstractViewOnTouchListenerC4423a m22233k(int i10) {
        this.f18402h = i10;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public AbstractViewOnTouchListenerC4423a m22234l(int i10) {
        this.f18401g = i10;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public AbstractViewOnTouchListenerC4423a m22235m(boolean z10) {
        if (this.f18410p && !z10) {
            m22231i();
        }
        this.f18410p = z10;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public AbstractViewOnTouchListenerC4423a m22236n(float f10, float f11) {
        float[] fArr = this.f18400f;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* JADX INFO: renamed from: o */
    public AbstractViewOnTouchListenerC4423a m22237o(float f10, float f11) {
        float[] fArr = this.f18405k;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f18410p) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m22231i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m22231i();
                }
            }
            return !this.f18411q && this.f18409o;
        }
        this.f18408n = true;
        this.f18406l = false;
        this.f18395a.m22256l(m22228d(0, motionEvent.getX(), view.getWidth(), this.f18397c.getWidth()), m22228d(1, motionEvent.getY(), view.getHeight(), this.f18397c.getHeight()));
        if (!this.f18409o && m22243u()) {
            m22244v();
        }
        if (this.f18411q) {
        }
    }

    /* JADX INFO: renamed from: p */
    public AbstractViewOnTouchListenerC4423a m22238p(float f10, float f11) {
        float[] fArr = this.f18404j;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public AbstractViewOnTouchListenerC4423a m22239q(int i10) {
        this.f18395a.m22254j(i10);
        return this;
    }

    /* JADX INFO: renamed from: r */
    public AbstractViewOnTouchListenerC4423a m22240r(int i10) {
        this.f18395a.m22255k(i10);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public AbstractViewOnTouchListenerC4423a m22241s(float f10, float f11) {
        float[] fArr = this.f18399e;
        fArr[0] = f10;
        fArr[1] = f11;
        return this;
    }

    /* JADX INFO: renamed from: t */
    public AbstractViewOnTouchListenerC4423a m22242t(float f10, float f11) {
        float[] fArr = this.f18403i;
        fArr[0] = f10 / 1000.0f;
        fArr[1] = f11 / 1000.0f;
        return this;
    }

    /* JADX INFO: renamed from: u */
    public boolean m22243u() {
        a aVar = this.f18395a;
        int iM22250f = aVar.m22250f();
        int iM22248d = aVar.m22248d();
        if (iM22250f == 0 || !mo22226b(iM22250f)) {
            return iM22248d != 0 && mo22225a(iM22248d);
        }
        return true;
    }

    /* JADX INFO: renamed from: v */
    public final void m22244v() {
        int i10;
        if (this.f18398d == null) {
            this.f18398d = new b();
        }
        this.f18409o = true;
        this.f18407m = true;
        if (this.f18406l || (i10 = this.f18402h) <= 0) {
            this.f18398d.run();
        } else {
            C0625o0.m3026f0(this.f18397c, this.f18398d, i10);
        }
        this.f18406l = true;
    }
}
