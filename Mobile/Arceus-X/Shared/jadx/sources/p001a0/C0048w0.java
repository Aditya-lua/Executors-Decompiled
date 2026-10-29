package p001a0;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import p140g0.C5931r1;

/* JADX INFO: renamed from: a0.w0 */
/* JADX INFO: loaded from: classes.dex */
public class C0048w0 implements C0044u0.a {

    /* JADX INFO: renamed from: a */
    public final StreamConfigurationMap f96a;

    /* JADX INFO: renamed from: a0.w0$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Size[] m106a(StreamConfigurationMap streamConfigurationMap, int i10) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i10);
        }
    }

    public C0048w0(StreamConfigurationMap streamConfigurationMap) {
        this.f96a = streamConfigurationMap;
    }

    @Override // p001a0.C0044u0.a
    /* JADX INFO: renamed from: a */
    public StreamConfigurationMap mo97a() {
        return this.f96a;
    }

    @Override // p001a0.C0044u0.a
    /* JADX INFO: renamed from: b */
    public Size[] mo98b(Range<Integer> range) {
        return this.f96a.getHighSpeedVideoSizesFor(range);
    }

    @Override // p001a0.C0044u0.a
    /* JADX INFO: renamed from: e */
    public int[] mo101e() {
        try {
            return this.f96a.getOutputFormats();
        } catch (IllegalArgumentException | NullPointerException e10) {
            C5931r1.m26573m("StreamConfigurationMapCompatBaseImpl", "Failed to get output formats from StreamConfigurationMap", e10);
            return null;
        }
    }

    @Override // p001a0.C0044u0.a
    /* JADX INFO: renamed from: f */
    public Size[] mo102f() {
        return this.f96a.getHighSpeedVideoSizes();
    }

    @Override // p001a0.C0044u0.a
    /* JADX INFO: renamed from: g */
    public Range<Integer>[] mo103g(Size size) {
        return this.f96a.getHighSpeedVideoFpsRangesFor(size);
    }

    @Override // p001a0.C0044u0.a
    /* JADX INFO: renamed from: h */
    public Size[] mo104h(int i10) {
        return a.m106a(this.f96a, i10);
    }
}
