package s7;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f7.i f30510l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30502d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30503e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f30504f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f30505g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f30506h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f30507i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f30508j = -2.1474836E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f30509k = 2.1474836E9f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f30511m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30512n = false;

    public void A() {
        C(true);
    }

    public void C(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f30511m = false;
        }
    }

    public void D() {
        this.f30511m = true;
        z();
        this.f30504f = 0L;
        if (v() && p() == s()) {
            J(r());
        } else if (!v() && p() == r()) {
            J(s());
        }
        f();
    }

    public void E() {
        P(-t());
    }

    public void G(f7.i iVar) {
        boolean z10 = this.f30510l == null;
        this.f30510l = iVar;
        if (z10) {
            N(Math.max(this.f30508j, iVar.p()), Math.min(this.f30509k, iVar.f()));
        } else {
            N((int) iVar.p(), (int) iVar.f());
        }
        float f10 = this.f30506h;
        this.f30506h = 0.0f;
        this.f30505g = 0.0f;
        J((int) f10);
        i();
    }

    public void J(float f10) {
        if (this.f30505g == f10) {
            return;
        }
        float fB = j.b(f10, s(), r());
        this.f30505g = fB;
        if (this.f30512n) {
            fB = (float) Math.floor(fB);
        }
        this.f30506h = fB;
        this.f30504f = 0L;
        i();
    }

    public void K(float f10) {
        N(this.f30508j, f10);
    }

    public void N(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        f7.i iVar = this.f30510l;
        float fP = iVar == null ? -3.4028235E38f : iVar.p();
        f7.i iVar2 = this.f30510l;
        float f12 = iVar2 == null ? Float.MAX_VALUE : iVar2.f();
        float fB = j.b(f10, fP, f12);
        float fB2 = j.b(f11, fP, f12);
        if (fB == this.f30508j && fB2 == this.f30509k) {
            return;
        }
        this.f30508j = fB;
        this.f30509k = fB2;
        J((int) j.b(this.f30506h, fB, fB2));
    }

    public void O(int i10) {
        N(i10, (int) this.f30509k);
    }

    public void P(float f10) {
        this.f30502d = f10;
    }

    public void Q(boolean z10) {
        this.f30512n = z10;
    }

    public final void R() {
        if (this.f30510l == null) {
            return;
        }
        float f10 = this.f30506h;
        if (f10 < this.f30508j || f10 > this.f30509k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f30508j), Float.valueOf(this.f30509k), Float.valueOf(this.f30506h)));
        }
    }

    @Override // s7.a
    public void a() {
        super.a();
        b(v());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        A();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        z();
        if (this.f30510l == null || !isRunning()) {
            return;
        }
        if (f7.e.h()) {
            f7.e.b("LottieValueAnimator#doFrame");
        }
        long j11 = this.f30504f;
        float fQ = (j11 != 0 ? j10 - j11 : 0L) / q();
        float f10 = this.f30505g;
        if (v()) {
            fQ = -fQ;
        }
        float f11 = f10 + fQ;
        boolean zD = j.d(f11, s(), r());
        float f12 = this.f30505g;
        float fB = j.b(f11, s(), r());
        this.f30505g = fB;
        if (this.f30512n) {
            fB = (float) Math.floor(fB);
        }
        this.f30506h = fB;
        this.f30504f = j10;
        if (zD) {
            j(f12);
        } else if (getRepeatCount() == -1 || this.f30507i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f30503e = !this.f30503e;
                E();
            } else {
                float fR = v() ? r() : s();
                this.f30505g = fR;
                this.f30506h = fR;
            }
            this.f30504f = j10;
            j(f12);
            e();
            this.f30507i++;
        } else {
            float fS = this.f30502d < 0.0f ? s() : r();
            this.f30505g = fS;
            this.f30506h = fS;
            A();
            j(f12);
            b(v());
        }
        R();
        if (f7.e.h()) {
            f7.e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fS;
        float fR;
        float fS2;
        if (this.f30510l == null) {
            return 0.0f;
        }
        if (v()) {
            fS = r() - this.f30506h;
            fR = r();
            fS2 = s();
        } else {
            fS = this.f30506h - s();
            fR = r();
            fS2 = s();
        }
        return fS / (fR - fS2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(o());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        f7.i iVar = this.f30510l;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f30511m;
    }

    public final void j(float f10) {
        if (this.f30512n && this.f30505g == f10) {
            return;
        }
        i();
    }

    public void k() {
        this.f30510l = null;
        this.f30508j = -2.1474836E9f;
        this.f30509k = 2.1474836E9f;
    }

    public void n() {
        A();
        b(v());
    }

    public float o() {
        f7.i iVar = this.f30510l;
        if (iVar == null) {
            return 0.0f;
        }
        return (this.f30506h - iVar.p()) / (this.f30510l.f() - this.f30510l.p());
    }

    public float p() {
        return this.f30506h;
    }

    public final float q() {
        f7.i iVar = this.f30510l;
        if (iVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iVar.i()) / Math.abs(this.f30502d);
    }

    public float r() {
        f7.i iVar = this.f30510l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f30509k;
        return f10 == 2.1474836E9f ? iVar.f() : f10;
    }

    public float s() {
        f7.i iVar = this.f30510l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f30508j;
        return f10 == -2.1474836E9f ? iVar.p() : f10;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f30503e) {
            return;
        }
        this.f30503e = false;
        E();
    }

    public float t() {
        return this.f30502d;
    }

    public final boolean v() {
        return t() < 0.0f;
    }

    public void w() {
        A();
        c();
    }

    public void x() {
        this.f30511m = true;
        h(v());
        J((int) (v() ? r() : s()));
        this.f30504f = 0L;
        this.f30507i = 0;
        z();
    }

    public void z() {
        if (isRunning()) {
            C(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
