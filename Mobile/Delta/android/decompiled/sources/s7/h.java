package s7;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f7.i f31057l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f31049d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f31050e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f31051f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f31052g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f31053h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f31054i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f31055j = -2.1474836E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f31056k = 2.1474836E9f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f31058m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f31059n = false;

    public void B() {
        C(true);
    }

    public void C(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f31058m = false;
        }
    }

    public void D() {
        this.f31058m = true;
        z();
        this.f31051f = 0L;
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
        boolean z10 = this.f31057l == null;
        this.f31057l = iVar;
        if (z10) {
            N(Math.max(this.f31055j, iVar.p()), Math.min(this.f31056k, iVar.f()));
        } else {
            N((int) iVar.p(), (int) iVar.f());
        }
        float f10 = this.f31053h;
        this.f31053h = 0.0f;
        this.f31052g = 0.0f;
        J((int) f10);
        i();
    }

    public void J(float f10) {
        if (this.f31052g == f10) {
            return;
        }
        float fB = j.b(f10, s(), r());
        this.f31052g = fB;
        if (this.f31059n) {
            fB = (float) Math.floor(fB);
        }
        this.f31053h = fB;
        this.f31051f = 0L;
        i();
    }

    public void K(float f10) {
        N(this.f31055j, f10);
    }

    public void N(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        f7.i iVar = this.f31057l;
        float fP = iVar == null ? -3.4028235E38f : iVar.p();
        f7.i iVar2 = this.f31057l;
        float f12 = iVar2 == null ? Float.MAX_VALUE : iVar2.f();
        float fB = j.b(f10, fP, f12);
        float fB2 = j.b(f11, fP, f12);
        if (fB == this.f31055j && fB2 == this.f31056k) {
            return;
        }
        this.f31055j = fB;
        this.f31056k = fB2;
        J((int) j.b(this.f31053h, fB, fB2));
    }

    public void O(int i10) {
        N(i10, (int) this.f31056k);
    }

    public void P(float f10) {
        this.f31049d = f10;
    }

    public void Q(boolean z10) {
        this.f31059n = z10;
    }

    public final void R() {
        if (this.f31057l == null) {
            return;
        }
        float f10 = this.f31053h;
        if (f10 < this.f31055j || f10 > this.f31056k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f31055j), Float.valueOf(this.f31056k), Float.valueOf(this.f31053h)));
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
        B();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        z();
        if (this.f31057l == null || !isRunning()) {
            return;
        }
        if (f7.e.h()) {
            f7.e.b("LottieValueAnimator#doFrame");
        }
        long j11 = this.f31051f;
        float fQ = (j11 != 0 ? j10 - j11 : 0L) / q();
        float f10 = this.f31052g;
        if (v()) {
            fQ = -fQ;
        }
        float f11 = f10 + fQ;
        boolean zD = j.d(f11, s(), r());
        float f12 = this.f31052g;
        float fB = j.b(f11, s(), r());
        this.f31052g = fB;
        if (this.f31059n) {
            fB = (float) Math.floor(fB);
        }
        this.f31053h = fB;
        this.f31051f = j10;
        if (zD) {
            j(f12);
        } else if (getRepeatCount() == -1 || this.f31054i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f31050e = !this.f31050e;
                E();
            } else {
                float fR = v() ? r() : s();
                this.f31052g = fR;
                this.f31053h = fR;
            }
            this.f31051f = j10;
            j(f12);
            e();
            this.f31054i++;
        } else {
            float fS = this.f31049d < 0.0f ? s() : r();
            this.f31052g = fS;
            this.f31053h = fS;
            B();
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
        if (this.f31057l == null) {
            return 0.0f;
        }
        if (v()) {
            fS = r() - this.f31053h;
            fR = r();
            fS2 = s();
        } else {
            fS = this.f31053h - s();
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
        f7.i iVar = this.f31057l;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f31058m;
    }

    public final void j(float f10) {
        if (this.f31059n && this.f31052g == f10) {
            return;
        }
        i();
    }

    public void k() {
        this.f31057l = null;
        this.f31055j = -2.1474836E9f;
        this.f31056k = 2.1474836E9f;
    }

    public void n() {
        B();
        b(v());
    }

    public float o() {
        f7.i iVar = this.f31057l;
        if (iVar == null) {
            return 0.0f;
        }
        return (this.f31053h - iVar.p()) / (this.f31057l.f() - this.f31057l.p());
    }

    public float p() {
        return this.f31053h;
    }

    public final float q() {
        f7.i iVar = this.f31057l;
        if (iVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iVar.i()) / Math.abs(this.f31049d);
    }

    public float r() {
        f7.i iVar = this.f31057l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f31056k;
        return f10 == 2.1474836E9f ? iVar.f() : f10;
    }

    public float s() {
        f7.i iVar = this.f31057l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f31055j;
        return f10 == -2.1474836E9f ? iVar.p() : f10;
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f31050e) {
            return;
        }
        this.f31050e = false;
        E();
    }

    public float t() {
        return this.f31049d;
    }

    public final boolean v() {
        return t() < 0.0f;
    }

    public void w() {
        B();
        c();
    }

    public void y() {
        this.f31058m = true;
        h(v());
        J((int) (v() ? r() : s()));
        this.f31051f = 0L;
        this.f31054i = 0;
        z();
    }

    public void z() {
        if (isRunning()) {
            C(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }
}
