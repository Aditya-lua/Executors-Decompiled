package b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public class m extends l {
    public m(int i10, Surface surface) {
        this(new OutputConfiguration(i10, surface));
    }

    public static m k(OutputConfiguration outputConfiguration) {
        return new m(outputConfiguration);
    }

    @Override // b0.n, b0.i.a
    public void a(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) h()).setStreamUseCase(j10);
    }

    @Override // b0.k, b0.i.a
    public /* bridge */ /* synthetic */ void b(Surface surface) {
        super.b(surface);
    }

    @Override // b0.l, b0.k, b0.i.a
    public void c(long j10) {
        ((OutputConfiguration) h()).setDynamicRangeProfile(j10);
    }

    @Override // b0.l, b0.k, b0.i.a
    public /* bridge */ /* synthetic */ void d(String str) {
        super.d(str);
    }

    @Override // b0.l, b0.k, b0.i.a
    public /* bridge */ /* synthetic */ String e() {
        return super.e();
    }

    @Override // b0.n
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // b0.k, b0.i.a
    public /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @Override // b0.n, b0.i.a
    public void g(int i10) {
        ((OutputConfiguration) h()).setMirrorMode(i10);
    }

    @Override // b0.j, b0.i.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // b0.l, b0.k, b0.j, b0.i.a
    public Object h() {
        x2.g.a(this.f3770a instanceof OutputConfiguration);
        return this.f3770a;
    }

    @Override // b0.n
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public m(Object obj) {
        super(obj);
    }
}
