package t7;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes3.dex */
public class h extends a implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g7.i f32163l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f32155d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32156e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f32157f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f32158g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f32159h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32160i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f32161j = -2.1474836E9f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f32162k = 2.1474836E9f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f32164m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f32165n = false;

    public void B() {
        if (isRunning()) {
            D(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void C() {
        D(true);
    }

    public void D(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f32164m = false;
        }
    }

    public void F() {
        this.f32164m = true;
        B();
        this.f32157f = 0L;
        if (x() && r() == u()) {
            J(t());
        } else if (!x() && r() == t()) {
            J(u());
        }
        f();
    }

    public void G() {
        R(-v());
    }

    public void H(g7.i iVar) {
        boolean z10 = this.f32163l == null;
        this.f32163l = iVar;
        if (z10) {
            O(Math.max(this.f32161j, iVar.p()), Math.min(this.f32162k, iVar.f()));
        } else {
            O((int) iVar.p(), (int) iVar.f());
        }
        float f10 = this.f32159h;
        this.f32159h = 0.0f;
        this.f32158g = 0.0f;
        J((int) f10);
        k();
    }

    public void J(float f10) {
        if (this.f32158g == f10) {
            return;
        }
        float fB = j.b(f10, u(), t());
        this.f32158g = fB;
        if (this.f32165n) {
            fB = (float) Math.floor(fB);
        }
        this.f32159h = fB;
        this.f32157f = 0L;
        k();
    }

    public void M(float f10) {
        O(this.f32161j, f10);
    }

    public void O(float f10, float f11) {
        if (f10 > f11) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f10), Float.valueOf(f11)));
        }
        g7.i iVar = this.f32163l;
        float fP = iVar == null ? -3.4028235E38f : iVar.p();
        g7.i iVar2 = this.f32163l;
        float f12 = iVar2 == null ? Float.MAX_VALUE : iVar2.f();
        float fB = j.b(f10, fP, f12);
        float fB2 = j.b(f11, fP, f12);
        if (fB == this.f32161j && fB2 == this.f32162k) {
            return;
        }
        this.f32161j = fB;
        this.f32162k = fB2;
        J((int) j.b(this.f32159h, fB, fB2));
    }

    public void P(int i10) {
        O(i10, (int) this.f32162k);
    }

    public void R(float f10) {
        this.f32155d = f10;
    }

    public void S(boolean z10) {
        this.f32165n = z10;
    }

    public final void U() {
        if (this.f32163l == null) {
            return;
        }
        float f10 = this.f32159h;
        if (f10 < this.f32161j || f10 > this.f32162k) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f32161j), Float.valueOf(this.f32162k), Float.valueOf(this.f32159h)));
        }
    }

    @Override // t7.a
    public void a() {
        super.a();
        b(x());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        a();
        C();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        B();
        if (this.f32163l == null || !isRunning()) {
            return;
        }
        if (g7.e.h()) {
            g7.e.b("LottieValueAnimator#doFrame");
        }
        long j11 = this.f32157f;
        float fS = (j11 != 0 ? j10 - j11 : 0L) / s();
        float f10 = this.f32158g;
        if (x()) {
            fS = -fS;
        }
        float f11 = f10 + fS;
        boolean zD = j.d(f11, u(), t());
        float f12 = this.f32158g;
        float fB = j.b(f11, u(), t());
        this.f32158g = fB;
        if (this.f32165n) {
            fB = (float) Math.floor(fB);
        }
        this.f32159h = fB;
        this.f32157f = j10;
        if (zD) {
            l(f12);
        } else if (getRepeatCount() == -1 || this.f32160i < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.f32156e = !this.f32156e;
                G();
            } else {
                float fT = x() ? t() : u();
                this.f32158g = fT;
                this.f32159h = fT;
            }
            this.f32157f = j10;
            l(f12);
            e();
            this.f32160i++;
        } else {
            float fU = this.f32155d < 0.0f ? u() : t();
            this.f32158g = fU;
            this.f32159h = fU;
            C();
            l(f12);
            b(x());
        }
        U();
        if (g7.e.h()) {
            g7.e.c("LottieValueAnimator#doFrame");
        }
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fU;
        float fT;
        float fU2;
        if (this.f32163l == null) {
            return 0.0f;
        }
        if (x()) {
            fU = t() - this.f32159h;
            fT = t();
            fU2 = u();
        } else {
            fU = this.f32159h - u();
            fT = t();
            fU2 = u();
        }
        return fU / (fT - fU2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(q());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        g7.i iVar = this.f32163l;
        if (iVar == null) {
            return 0L;
        }
        return (long) iVar.d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f32164m;
    }

    public final void l(float f10) {
        if (this.f32165n && this.f32158g == f10) {
            return;
        }
        k();
    }

    public void o() {
        this.f32163l = null;
        this.f32161j = -2.1474836E9f;
        this.f32162k = 2.1474836E9f;
    }

    public void p() {
        C();
        b(x());
    }

    public float q() {
        g7.i iVar = this.f32163l;
        if (iVar == null) {
            return 0.0f;
        }
        return (this.f32159h - iVar.p()) / (this.f32163l.f() - this.f32163l.p());
    }

    public float r() {
        return this.f32159h;
    }

    public final float s() {
        g7.i iVar = this.f32163l;
        if (iVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / iVar.i()) / Math.abs(this.f32155d);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 == 2 || !this.f32156e) {
            return;
        }
        this.f32156e = false;
        G();
    }

    public float t() {
        g7.i iVar = this.f32163l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f32162k;
        return f10 == 2.1474836E9f ? iVar.f() : f10;
    }

    public float u() {
        g7.i iVar = this.f32163l;
        if (iVar == null) {
            return 0.0f;
        }
        float f10 = this.f32161j;
        return f10 == -2.1474836E9f ? iVar.p() : f10;
    }

    public float v() {
        return this.f32155d;
    }

    public final boolean x() {
        return v() < 0.0f;
    }

    public void y() {
        C();
        c();
    }

    public void z() {
        this.f32164m = true;
        i(x());
        J((int) (x() ? t() : u()));
        this.f32157f = 0L;
        this.f32160i = 0;
        B();
    }
}
