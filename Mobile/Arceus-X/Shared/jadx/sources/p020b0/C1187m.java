package p020b0;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import p533x2.C12637g;

/* JADX INFO: renamed from: b0.m */
/* JADX INFO: loaded from: classes.dex */
public class C1187m extends C1186l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1187m(int i10, Surface surface) {
        this(new OutputConfiguration(i10, surface));
    }

    /* JADX INFO: renamed from: k */
    public static C1187m m6576k(OutputConfiguration outputConfiguration) {
        return new C1187m(outputConfiguration);
    }

    @Override // p020b0.C1188n, p020b0.C1183i.a
    /* JADX INFO: renamed from: a */
    public void mo6566a(long j10) {
        if (j10 == -1) {
            return;
        }
        ((OutputConfiguration) mo6573h()).setStreamUseCase(j10);
    }

    @Override // p020b0.C1185k, p020b0.C1183i.a
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo6567b(Surface surface) {
        super.mo6567b(surface);
    }

    @Override // p020b0.C1186l, p020b0.C1185k, p020b0.C1183i.a
    /* JADX INFO: renamed from: c */
    public void mo6568c(long j10) {
        ((OutputConfiguration) mo6573h()).setDynamicRangeProfile(j10);
    }

    @Override // p020b0.C1186l, p020b0.C1185k, p020b0.C1183i.a
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void mo6569d(String str) {
        super.mo6569d(str);
    }

    @Override // p020b0.C1186l, p020b0.C1185k, p020b0.C1183i.a
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ String mo6570e() {
        return super.mo6570e();
    }

    @Override // p020b0.C1188n
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p020b0.C1185k, p020b0.C1183i.a
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ void mo6571f() {
        super.mo6571f();
    }

    @Override // p020b0.C1188n, p020b0.C1183i.a
    /* JADX INFO: renamed from: g */
    public void mo6572g(int i10) {
        ((OutputConfiguration) mo6573h()).setMirrorMode(i10);
    }

    @Override // p020b0.C1184j, p020b0.C1183i.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // p020b0.C1186l, p020b0.C1185k, p020b0.C1184j, p020b0.C1183i.a
    /* JADX INFO: renamed from: h */
    public Object mo6573h() {
        C12637g.m47069a(this.f4934a instanceof OutputConfiguration);
        return this.f4934a;
    }

    @Override // p020b0.C1188n
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1187m(Object obj) {
        super(obj);
    }
}
