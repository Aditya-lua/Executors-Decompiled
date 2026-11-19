package a0;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;

/* JADX INFO: loaded from: classes.dex */
public class v0 extends w0 {
    public v0(StreamConfigurationMap streamConfigurationMap) {
        super(streamConfigurationMap);
    }

    @Override // a0.u0.a
    public long c(int i10, Size size) {
        return this.f66a.getOutputMinFrameDuration(i10, size);
    }

    @Override // a0.u0.a
    public Size[] d(int i10) {
        return this.f66a.getOutputSizes(i10);
    }
}
