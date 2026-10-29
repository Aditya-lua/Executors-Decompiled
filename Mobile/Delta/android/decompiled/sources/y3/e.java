package y3;

import android.os.Looper;
import android.util.AndroidRuntimeException;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b<e> {
    public f A;
    public float B;
    public boolean C;

    public e(d dVar) {
        super(dVar);
        this.A = null;
        this.B = Float.MAX_VALUE;
        this.C = false;
    }

    @Override // y3.b
    public void o(float f10) {
    }

    @Override // y3.b
    public void p() {
        v();
        this.A.g(f());
        super.p();
    }

    @Override // y3.b
    public boolean r(long j10) {
        if (this.C) {
            float f10 = this.B;
            if (f10 != Float.MAX_VALUE) {
                this.A.e(f10);
                this.B = Float.MAX_VALUE;
            }
            this.b = this.A.a();
            this.f35556a = 0.0f;
            this.C = false;
            return true;
        }
        if (this.B != Float.MAX_VALUE) {
            this.A.a();
            long j11 = j10 / 2;
            b.p pVarH = this.A.h(this.b, this.f35556a, j11);
            this.A.e(this.B);
            this.B = Float.MAX_VALUE;
            b.p pVarH2 = this.A.h(pVarH.f35568a, pVarH.b, j11);
            this.b = pVarH2.f35568a;
            this.f35556a = pVarH2.b;
        } else {
            b.p pVarH3 = this.A.h(this.b, this.f35556a, j10);
            this.b = pVarH3.f35568a;
            this.f35556a = pVarH3.b;
        }
        float fMax = Math.max(this.b, this.f35562h);
        this.b = fMax;
        float fMin = Math.min(fMax, this.f35561g);
        this.b = fMin;
        if (!u(fMin, this.f35556a)) {
            return false;
        }
        this.b = this.A.a();
        this.f35556a = 0.0f;
        return true;
    }

    public void s(float f10) {
        if (g()) {
            this.B = f10;
            return;
        }
        if (this.A == null) {
            this.A = new f(f10);
        }
        this.A.e(f10);
        p();
    }

    public boolean t() {
        return this.A.b > 0.0d;
    }

    public boolean u(float f10, float f11) {
        return this.A.c(f10, f11);
    }

    public final void v() {
        f fVar = this.A;
        if (fVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = fVar.a();
        if (dA > this.f35561g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.f35562h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public e w(f fVar) {
        this.A = fVar;
        return this;
    }

    public void x() {
        if (!t()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f35560f) {
            this.C = true;
        }
    }

    public <K> e(K k10, c<K> cVar) {
        super(k10, cVar);
        this.A = null;
        this.B = Float.MAX_VALUE;
        this.C = false;
    }
}
