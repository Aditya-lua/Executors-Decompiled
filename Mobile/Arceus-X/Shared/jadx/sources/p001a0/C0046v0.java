package p001a0;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* JADX INFO: renamed from: a0.v0 */
/* JADX INFO: loaded from: classes.dex */
public class C0046v0 extends C0048w0 {
    public C0046v0(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // p001a0.C0044u0.a
    /* JADX INFO: renamed from: c */
    public long mo99c(int i10, Size size) {
        return this.f96a.getOutputMinFrameDuration(i10, size);
    }

    @Override // p001a0.C0044u0.a
    /* JADX INFO: renamed from: d */
    public Size[] mo100d(int i10) {
        return this.f96a.getOutputSizes(i10);
    }
}
