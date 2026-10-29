package p565y3;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* JADX INFO: renamed from: y3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13025e extends AbstractC13022b<C13025e> {

    /* JADX INFO: renamed from: A */
    public C13026f f46138A;

    /* JADX INFO: renamed from: B */
    public float f46139B;

    /* JADX INFO: renamed from: C */
    public boolean f46140C;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13025e(C13024d c13024d) {
        super(c13024d);
        this.f46138A = null;
        this.f46139B = Float.MAX_VALUE;
        this.f46140C = false;
    }

    @Override // p565y3.AbstractC13022b
    /* JADX INFO: renamed from: o */
    public void mo48486o(float f10) {
    }

    @Override // p565y3.AbstractC13022b
    /* JADX INFO: renamed from: p */
    public void mo48487p() {
        m48523v();
        this.f46138A.m48532g(m48478f());
        super.mo48487p();
    }

    @Override // p565y3.AbstractC13022b
    /* JADX INFO: renamed from: r */
    public boolean mo48489r(long j10) {
        if (this.f46140C) {
            float f10 = this.f46139B;
            if (f10 != Float.MAX_VALUE) {
                this.f46138A.m48530e(f10);
                this.f46139B = Float.MAX_VALUE;
            }
            this.f46121b = this.f46138A.m48526a();
            this.f46120a = 0.0f;
            this.f46140C = false;
            return true;
        }
        if (this.f46139B != Float.MAX_VALUE) {
            this.f46138A.m48526a();
            long j11 = j10 / 2;
            AbstractC13022b.p pVarM48533h = this.f46138A.m48533h(this.f46121b, this.f46120a, j11);
            this.f46138A.m48530e(this.f46139B);
            this.f46139B = Float.MAX_VALUE;
            AbstractC13022b.p pVarM48533h2 = this.f46138A.m48533h(pVarM48533h.f46134a, pVarM48533h.f46135b, j11);
            this.f46121b = pVarM48533h2.f46134a;
            this.f46120a = pVarM48533h2.f46135b;
        } else {
            AbstractC13022b.p pVarM48533h3 = this.f46138A.m48533h(this.f46121b, this.f46120a, j10);
            this.f46121b = pVarM48533h3.f46134a;
            this.f46120a = pVarM48533h3.f46135b;
        }
        float fMax = Math.max(this.f46121b, this.f46127h);
        this.f46121b = fMax;
        float fMin = Math.min(fMax, this.f46126g);
        this.f46121b = fMin;
        if (!m48522u(fMin, this.f46120a)) {
            return false;
        }
        this.f46121b = this.f46138A.m48526a();
        this.f46120a = 0.0f;
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m48520s(float f10) {
        if (m48479g()) {
            this.f46139B = f10;
            return;
        }
        if (this.f46138A == null) {
            this.f46138A = new C13026f(f10);
        }
        this.f46138A.m48530e(f10);
        mo48487p();
    }

    /* JADX INFO: renamed from: t */
    public boolean m48521t() {
        return this.f46138A.f46142b > 0.0d;
    }

    /* JADX INFO: renamed from: u */
    public boolean m48522u(float f10, float f11) {
        return this.f46138A.m48528c(f10, f11);
    }

    /* JADX INFO: renamed from: v */
    public final void m48523v() {
        C13026f c13026f = this.f46138A;
        if (c13026f == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dM48526a = c13026f.m48526a();
        if (dM48526a > this.f46126g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dM48526a < this.f46127h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    /* JADX INFO: renamed from: w */
    public C13025e m48524w(C13026f c13026f) {
        this.f46138A = c13026f;
        return this;
    }

    /* JADX INFO: renamed from: x */
    public void m48525x() {
        if (!m48521t()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f46125f) {
            this.f46140C = true;
        }
    }

    public <K> C13025e(K k10, AbstractC13023c<K> abstractC13023c) {
        super(k10, abstractC13023c);
        this.f46138A = null;
        this.f46139B = Float.MAX_VALUE;
        this.f46140C = false;
    }
}
