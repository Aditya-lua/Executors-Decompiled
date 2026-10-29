package p282m1;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.Objects;
import p140g0.C5931r1;
import p297n1.C8858a;
import p318o1.C9627g;

/* JADX INFO: renamed from: m1.t1 */
/* JADX INFO: loaded from: classes.dex */
public class C8395t1 extends AbstractC8356g1 implements InterfaceC8389r1 {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC8389r1.a f30947d = new InterfaceC8389r1.a() { // from class: m1.s1
        @Override // p282m1.InterfaceC8389r1.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC8389r1 mo34064a(String str) {
            return C8395t1.m34065k(str);
        }
    };

    /* JADX INFO: renamed from: c */
    public final MediaCodecInfo.VideoCapabilities f30948c;

    public C8395t1(MediaCodecInfo mediaCodecInfo, String str) {
        super(mediaCodecInfo, str);
        MediaCodecInfo.VideoCapabilities videoCapabilities = this.f30813b.getVideoCapabilities();
        Objects.requireNonNull(videoCapabilities);
        this.f30948c = videoCapabilities;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ InterfaceC8389r1 m34065k(String str) {
        try {
            return C9627g.m37990l(new C8395t1(C8858a.m35568c(str), str), null);
        } catch (C8368k1 e10) {
            C5931r1.m26573m("VideoEncoderInfoImpl", "Unable to find a VideoEncoderInfoImpl", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static IllegalArgumentException m34066l(Throwable th2) {
        return th2 instanceof IllegalArgumentException ? (IllegalArgumentException) th2 : new IllegalArgumentException(th2);
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: a */
    public boolean mo34052a() {
        return true;
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: b */
    public Range<Integer> mo34053b(int i10) {
        try {
            return this.f30948c.getSupportedWidthsFor(i10);
        } catch (Throwable th2) {
            throw m34066l(th2);
        }
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: c */
    public int mo34054c() {
        return this.f30948c.getHeightAlignment();
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: d */
    public boolean mo34055d(int i10, int i11) {
        return this.f30948c.isSizeSupported(i10, i11);
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: f */
    public int mo34056f() {
        return this.f30948c.getWidthAlignment();
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: g */
    public Range<Integer> mo34057g() {
        return this.f30948c.getBitrateRange();
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: h */
    public Range<Integer> mo34058h(int i10) {
        try {
            return this.f30948c.getSupportedHeightsFor(i10);
        } catch (Throwable th2) {
            throw m34066l(th2);
        }
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: i */
    public Range<Integer> mo34059i() {
        return this.f30948c.getSupportedWidths();
    }

    @Override // p282m1.InterfaceC8389r1
    /* JADX INFO: renamed from: j */
    public Range<Integer> mo34060j() {
        return this.f30948c.getSupportedHeights();
    }
}
