package m1;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class t1 extends g1 implements r1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r1.a f23853d = new r1.a() { // from class: m1.s1
        @Override // m1.r1.a
        public final r1 a(String str) {
            return t1.k(str);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediaCodecInfo.VideoCapabilities f23854c;

    public t1(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f23854c = videoCapabilities;
    }

    public static /* synthetic */ r1 k(String str) {
        try {
            return o1.g.l(new t1(n1.a.c(str), str), null);
        } catch (k1 e10) {
            g0.r1.m("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e10);
            return null;
        }
    }

    public static IllegalArgumentException l(Throwable th2) {
        return th2 instanceof IllegalArgumentException ? (IllegalArgumentException) th2 : new IllegalArgumentException(th2);
    }

    @Override // m1.r1
    public boolean a() {
        return true;
    }

    @Override // m1.r1
    public Range<Integer> b(int i10) {
        try {
            return this.f23854c.getSupportedWidthsFor(i10);
        } catch (Throwable th2) {
            throw l(th2);
        }
    }

    @Override // m1.r1
    public int c() {
        return this.f23854c.getHeightAlignment();
    }

    @Override // m1.r1
    public boolean d(int i10, int i11) {
        return this.f23854c.isSizeSupported(i10, i11);
    }

    @Override // m1.r1
    public int f() {
        return this.f23854c.getWidthAlignment();
    }

    @Override // m1.r1
    public Range<Integer> g() {
        return this.f23854c.getBitrateRange();
    }

    @Override // m1.r1
    public Range<Integer> h(int i10) {
        try {
            return this.f23854c.getSupportedHeightsFor(i10);
        } catch (Throwable th2) {
            throw l(th2);
        }
    }

    @Override // m1.r1
    public Range<Integer> i() {
        return this.f23854c.getSupportedWidths();
    }

    @Override // m1.r1
    public Range<Integer> j() {
        return this.f23854c.getSupportedHeights();
    }
}
