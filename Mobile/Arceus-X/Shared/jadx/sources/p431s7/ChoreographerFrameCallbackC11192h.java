package p431s7;

import android.view.Choreographer;
import p121f7.C5444e;
import p121f7.C5452i;

/* JADX INFO: renamed from: s7.h */
/* JADX INFO: loaded from: classes3.dex */
public class ChoreographerFrameCallbackC11192h extends AbstractC11185a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l */
    public C5452i f39481l;

    /* JADX INFO: renamed from: d */
    public float f39473d = 1.0f;

    /* JADX INFO: renamed from: e */
    public boolean f39474e = false;

    /* JADX INFO: renamed from: f */
    public long f39475f = 0;

    /* JADX INFO: renamed from: g */
    public float f39476g = 0.0f;

    /* JADX INFO: renamed from: h */
    public float f39477h = 0.0f;

    /* JADX INFO: renamed from: i */
    public int f39478i = 0;

    /* JADX INFO: renamed from: j */
    public float f39479j = -2.14748365E9f;

    /* JADX INFO: renamed from: k */
    public float f39480k = 2.14748365E9f;

    /* JADX INFO: renamed from: m */
    public boolean f39482m = false;

    /* JADX INFO: renamed from: n */
    public boolean f39483n = false;

    /* JADX INFO: renamed from: A */
    public void m42157A() {
        m42158C(true);
    }

    /* JADX INFO: renamed from: C */
    public void m42158C(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f39482m = false;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m42159D() {
        this.f39482m = true;
        m42181z();
        this.f39475f = 0L;
        if (m42178v() && m42173p() == m42176s()) {
            m42162J(m42175r());
        } else if (!m42178v() && m42173p() == m42175r()) {
            m42162J(m42176s());
        }
        m42133f();
    }

    /* JADX INFO: renamed from: E */
    public void m42160E() {
        m42166P(-m42177t());
    }

    /* JADX INFO: renamed from: G */
    public void m42161G(C5452i c5452i) {
        boolean z10 = this.f39481l == null;
        this.f39481l = c5452i;
        if (z10) {
            m42164N(Math.max(this.f39479j, c5452i.m25050p()), Math.min(this.f39480k, c5452i.m25040f()));
        } else {
            m42164N((int) c5452i.m25050p(), (int) c5452i.m25040f());
        }
        float f10 = this.f39477h;
        this.f39477h = 0.0f;
        this.f39476g = 0.0f;
        m42162J((int) f10);
        m42135i();
    }

    /* JADX INFO: renamed from: J */
    public void m42162J(float f10) {
        if (this.f39476g == f10) {
            return;
        }
        float fM42184b = C11194j.m42184b(f10, m42176s(), m42175r());
        this.f39476g = fM42184b;
        if (this.f39483n) {
            fM42184b = (float) Math.floor(fM42184b);
        }
        this.f39477h = fM42184b;
        this.f39475f = 0L;
        m42135i();
    }

    /* JADX INFO: renamed from: K */
    public void m42163K(float f10) {
        m42164N(this.f39479j, f10);
    }

    /* JADX INFO: renamed from: N */
    public void m42164N(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        C5452i c5452i = this.f39481l;
        float fM25050p = c5452i == null ? -3.4028235E38f : c5452i.m25050p();
        C5452i c5452i2 = this.f39481l;
        float fM25040f = c5452i2 == null ? Float.MAX_VALUE : c5452i2.m25040f();
        float fM42184b = C11194j.m42184b(f10, fM25050p, fM25040f);
        float fM42184b2 = C11194j.m42184b(f11, fM25050p, fM25040f);
        if (fM42184b == this.f39479j && fM42184b2 == this.f39480k) {
            return;
        }
        this.f39479j = fM42184b;
        this.f39480k = fM42184b2;
        m42162J((int) C11194j.m42184b(this.f39477h, fM42184b, fM42184b2));
    }

    /* JADX INFO: renamed from: O */
    public void m42165O(int i10) {
        m42164N(i10, (int) this.f39480k);
    }

    /* JADX INFO: renamed from: P */
    public void m42166P(float f10) {
        this.f39473d = f10;
    }

    /* JADX INFO: renamed from: Q */
    public void m42167Q(boolean z10) {
        this.f39483n = z10;
    }

    /* JADX INFO: renamed from: R */
    public final void m42168R() {
        if (this.f39481l == null) {
            return;
        }
        float f10 = this.f39477h;
        if (f10 < this.f39479j || f10 > this.f39480k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f39479j), Float.valueOf(this.f39480k), Float.valueOf(this.f39477h)));
        }
    }

    @Override // p431s7.AbstractC11185a
    /* JADX INFO: renamed from: a */
    public void mo42129a() {
        super.mo42129a();
        m42130b(m42178v());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        mo42129a();
        m42157A();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        m42181z();
        if (this.f39481l == null || !isRunning()) {
            return;
        }
        if (C5444e.m24929h()) {
            C5444e.m24923b("LottieValueAnimator#doFrame");
        }
        long j11 = this.f39475f;
        float fM42174q = (j11 != 0 ? j10 - j11 : 0L) / m42174q();
        float f10 = this.f39476g;
        if (m42178v()) {
            fM42174q = -fM42174q;
        }
        float f11 = f10 + fM42174q;
        boolean zM42186d = C11194j.m42186d(f11, m42176s(), m42175r());
        float f12 = this.f39476g;
        float fM42184b = C11194j.m42184b(f11, m42176s(), m42175r());
        this.f39476g = fM42184b;
        if (this.f39483n) {
            fM42184b = (float) Math.floor(fM42184b);
        }
        this.f39477h = fM42184b;
        this.f39475f = j10;
        if (zM42186d) {
            m42169j(f12);
        } else if (getRepeatCount() == -1 || this.f39478i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f39474e = !this.f39474e;
                m42160E();
            } else {
                float fM42175r = m42178v() ? m42175r() : m42176s();
                this.f39476g = fM42175r;
                this.f39477h = fM42175r;
            }
            this.f39475f = j10;
            m42169j(f12);
            m42132e();
            this.f39478i++;
        } else {
            float fM42176s = this.f39473d < 0.0f ? m42176s() : m42175r();
            this.f39476g = fM42176s;
            this.f39477h = fM42176s;
            m42157A();
            m42169j(f12);
            m42130b(m42178v());
        }
        m42168R();
        if (C5444e.m24929h()) {
            C5444e.m24924c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fM42176s;
        float fM42175r;
        float fM42176s2;
        if (this.f39481l == null) {
            return 0.0f;
        }
        if (m42178v()) {
            fM42176s = m42175r() - this.f39477h;
            fM42175r = m42175r();
            fM42176s2 = m42176s();
        } else {
            fM42176s = this.f39477h - m42176s();
            fM42175r = m42175r();
            fM42176s2 = m42176s();
        }
        return fM42176s / (fM42175r - fM42176s2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m42172o());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C5452i c5452i = this.f39481l;
        if (c5452i == null) {
            return 0L;
        }
        return (long) c5452i.m25038d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f39482m;
    }

    /* JADX INFO: renamed from: j */
    public final void m42169j(float f10) {
        if (this.f39483n && this.f39476g == f10) {
            return;
        }
        m42135i();
    }

    /* JADX INFO: renamed from: k */
    public void m42170k() {
        this.f39481l = null;
        this.f39479j = -2.14748365E9f;
        this.f39480k = 2.14748365E9f;
    }

    /* JADX INFO: renamed from: n */
    public void m42171n() {
        m42157A();
        m42130b(m42178v());
    }

    /* JADX INFO: renamed from: o */
    public float m42172o() {
        C5452i c5452i = this.f39481l;
        if (c5452i == null) {
            return 0.0f;
        }
        return (this.f39477h - c5452i.m25050p()) / (this.f39481l.m25040f() - this.f39481l.m25050p());
    }

    /* JADX INFO: renamed from: p */
    public float m42173p() {
        return this.f39477h;
    }

    /* JADX INFO: renamed from: q */
    public final float m42174q() {
        C5452i c5452i = this.f39481l;
        if (c5452i == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c5452i.m25043i()) / Math.abs(this.f39473d);
    }

    /* JADX INFO: renamed from: r */
    public float m42175r() {
        C5452i c5452i = this.f39481l;
        if (c5452i == null) {
            return 0.0f;
        }
        float f10 = this.f39480k;
        return f10 == 2.14748365E9f ? c5452i.m25040f() : f10;
    }

    /* JADX INFO: renamed from: s */
    public float m42176s() {
        C5452i c5452i = this.f39481l;
        if (c5452i == null) {
            return 0.0f;
        }
        float f10 = this.f39479j;
        return f10 == -2.14748365E9f ? c5452i.m25050p() : f10;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f39474e) {
            return;
        }
        this.f39474e = false;
        m42160E();
    }

    /* JADX INFO: renamed from: t */
    public float m42177t() {
        return this.f39473d;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m42178v() {
        return m42177t() < 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public void m42179w() {
        m42157A();
        m42131c();
    }

    /* JADX INFO: renamed from: x */
    public void m42180x() {
        this.f39482m = true;
        m42134h(m42178v());
        m42162J((int) (m42178v() ? m42175r() : m42176s()));
        this.f39475f = 0L;
        this.f39478i = 0;
        m42181z();
    }

    /* JADX INFO: renamed from: z */
    public void m42181z() {
        if (isRunning()) {
            m42158C(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
