package lc;

import androidx.annotation.NonNull;
import p168hd.C6362f;
import p168hd.C6369m;

/* JADX INFO: renamed from: lc.b */
/* JADX INFO: loaded from: classes2.dex */
public class C8125b extends C6362f implements Cloneable {

    /* JADX INFO: renamed from: a */
    public float f30151a;

    /* JADX INFO: renamed from: b */
    public float f30152b;

    /* JADX INFO: renamed from: c */
    public float f30153c;

    /* JADX INFO: renamed from: d */
    public float f30154d;

    /* JADX INFO: renamed from: e */
    public float f30155e;

    /* JADX INFO: renamed from: f */
    public float f30156f;

    @Override // p168hd.C6362f
    /* JADX INFO: renamed from: b */
    public void mo27687b(float f10, float f11, float f12, @NonNull C6369m c6369m) {
        float f13;
        float f14;
        float f15 = this.f30153c;
        if (f15 == 0.0f) {
            c6369m.m27845m(f10, 0.0f);
            return;
        }
        float f16 = ((this.f30152b * 2.0f) + f15) / 2.0f;
        float f17 = f12 * this.f30151a;
        float f18 = f11 + this.f30155e;
        float f19 = (this.f30154d * f12) + ((1.0f - f12) * f16);
        if (f19 / f16 >= 1.0f) {
            c6369m.m27845m(f10, 0.0f);
            return;
        }
        float f20 = this.f30156f;
        float f21 = f20 * f12;
        boolean z10 = f20 == -1.0f || Math.abs((f20 * 2.0f) - f15) < 0.1f;
        if (z10) {
            f13 = f19;
            f14 = 0.0f;
        } else {
            f14 = 1.75f;
            f13 = 0.0f;
        }
        float f22 = f16 + f17;
        float f23 = f13 + f17;
        float fSqrt = (float) Math.sqrt((f22 * f22) - (f23 * f23));
        float f24 = f18 - fSqrt;
        float f25 = f18 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f23));
        float f26 = (90.0f - degrees) + f14;
        c6369m.m27845m(f24, 0.0f);
        float f27 = f24 - f17;
        float f28 = f24 + f17;
        float f29 = f17 * 2.0f;
        c6369m.m27833a(f27, 0.0f, f28, f29, 270.0f, degrees);
        if (z10) {
            c6369m.m27833a(f18 - f16, (-f16) - f13, f18 + f16, f16 - f13, 180.0f - f26, (f26 * 2.0f) - 180.0f);
        } else {
            float f30 = this.f30152b;
            float f31 = f21 * 2.0f;
            float f32 = f30 + f31;
            float f33 = f18 - f16;
            c6369m.m27833a(f33, -(f21 + f30), f32 + f33, f30 + f21, 180.0f - f26, ((f26 * 2.0f) - 180.0f) / 2.0f);
            float f34 = f18 + f16;
            float f35 = this.f30152b;
            c6369m.m27845m(f34 - ((f35 / 2.0f) + f21), f35 + f21);
            float f36 = this.f30152b;
            c6369m.m27833a(f34 - (f31 + f36), -(f21 + f36), f34, f36 + f21, 90.0f, f26 - 90.0f);
        }
        c6369m.m27833a(f25 - f17, 0.0f, f25 + f17, f29, 270.0f - degrees, degrees);
        c6369m.m27845m(f10, 0.0f);
    }

    /* JADX INFO: renamed from: c */
    public float m33327c() {
        return this.f30154d;
    }

    /* JADX INFO: renamed from: e */
    public float m33328e() {
        return this.f30156f;
    }

    /* JADX INFO: renamed from: f */
    public float m33329f() {
        return this.f30152b;
    }

    /* JADX INFO: renamed from: h */
    public float m33330h() {
        return this.f30151a;
    }

    /* JADX INFO: renamed from: i */
    public float m33331i() {
        return this.f30153c;
    }

    /* JADX INFO: renamed from: j */
    public void m33332j(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.f30154d = f10;
    }

    /* JADX INFO: renamed from: k */
    public void m33333k(float f10) {
        this.f30156f = f10;
    }

    /* JADX INFO: renamed from: n */
    public void m33334n(float f10) {
        this.f30152b = f10;
    }

    /* JADX INFO: renamed from: o */
    public void m33335o(float f10) {
        this.f30151a = f10;
    }

    /* JADX INFO: renamed from: p */
    public void m33336p(float f10) {
        this.f30153c = f10;
    }

    /* JADX INFO: renamed from: q */
    public void m33337q(float f10) {
        this.f30155e = f10;
    }
}
