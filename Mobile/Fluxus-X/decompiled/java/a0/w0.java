package a0;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import g0.r1;

/* JADX INFO: loaded from: classes.dex */
public class w0 implements u0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StreamConfigurationMap f66a;

    public static class a {
        public static Size[] a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    public w0(StreamConfigurationMap streamConfigurationMap) {
        this.f66a = streamConfigurationMap;
    }

    @Override // a0.u0.a
    public StreamConfigurationMap a() {
        return this.f66a;
    }

    @Override // a0.u0.a
    public Size[] b(Range<Integer> range) {
        return this.f66a.getHighSpeedVideoSizesFor(range);
    }

    @Override // a0.u0.a
    public int[] e() {
        try {
            return this.f66a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e10) {
            r1.m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e10);
            return null;
        }
    }

    @Override // a0.u0.a
    public Size[] f() {
        return this.f66a.getHighSpeedVideoSizes();
    }

    @Override // a0.u0.a
    public Range<Integer>[] g(Size size) {
        return this.f66a.getHighSpeedVideoFpsRangesFor(size);
    }

    @Override // a0.u0.a
    public Size[] h(int i10) {
        return a.a(this.f66a, i10);
    }
}
