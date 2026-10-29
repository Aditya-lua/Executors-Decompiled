package p589z;

import p140g0.InterfaceC5964z2;
import p296n0.C8742e;

/* JADX INFO: renamed from: z.h6 */
/* JADX INFO: loaded from: classes.dex */
public class C13538h6 implements InterfaceC5964z2 {

    /* JADX INFO: renamed from: a */
    public float f47436a;

    /* JADX INFO: renamed from: b */
    public final float f47437b;

    /* JADX INFO: renamed from: c */
    public final float f47438c;

    /* JADX INFO: renamed from: d */
    public float f47439d;

    public C13538h6(float f10, float f11) {
        this.f47437b = f10;
        this.f47438c = f11;
    }

    @Override // p140g0.InterfaceC5964z2
    /* JADX INFO: renamed from: a */
    public float mo26760a() {
        return this.f47437b;
    }

    @Override // p140g0.InterfaceC5964z2
    /* JADX INFO: renamed from: b */
    public float mo26761b() {
        return this.f47439d;
    }

    @Override // p140g0.InterfaceC5964z2
    /* JADX INFO: renamed from: c */
    public float mo26762c() {
        return this.f47438c;
    }

    @Override // p140g0.InterfaceC5964z2
    /* JADX INFO: renamed from: d */
    public float mo26763d() {
        return this.f47436a;
    }

    /* JADX INFO: renamed from: e */
    public void m49433e(float f10) {
        if (f10 <= 1.0f && f10 >= 0.0f) {
            this.f47439d = f10;
            this.f47436a = C8742e.m35067F(f10, this.f47438c, this.f47437b);
        } else {
            throw new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m49434f(float f10) {
        float f11 = this.f47437b;
        if (f10 <= f11) {
            float f12 = this.f47438c;
            if (f10 >= f12) {
                this.f47436a = f10;
                this.f47439d = C8742e.m35066D(f10, f12, f11);
                return;
            }
        }
        throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f47438c + " , " + this.f47437b + "]");
    }
}
