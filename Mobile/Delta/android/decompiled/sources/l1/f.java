package l1;

import android.util.Range;
import android.util.Rational;
import g0.r1;
import n0.a2;

/* JADX INFO: loaded from: classes.dex */
public final class f implements x2.h<i1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.a f22898a;
    public final a2.a b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f22899c;

    public f(f1.a aVar, a2.a aVar2, Rational rational) {
        this.f22898a = aVar;
        this.b = aVar2;
        this.f22899c = rational;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i1.a get() {
        int iE = b.e(this.f22898a);
        int iF = b.f(this.f22898a);
        int iC = this.f22898a.c();
        int iC2 = this.b.c();
        if (iC == -1) {
            r1.a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + iC2);
            iC = iC2;
        } else {
            r1.a("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + iC2 + ", Resolved Channel Count: " + iC + "]");
        }
        Range<Integer> rangeD = this.f22898a.d();
        int iG = this.b.g();
        CaptureEncodeRates captureEncodeRatesG = b.g(rangeD, iG, iC, iF, this.f22899c);
        r1.a("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: " + captureEncodeRatesG.getCaptureRate() + "Hz. Encode sample rate: " + captureEncodeRatesG.getEncodeRate() + "Hz. [AudioProfile sample rate: " + iG + "Hz]");
        return i1.a.a().d(iE).c(iF).f(iC).e(captureEncodeRatesG.getCaptureRate()).g(captureEncodeRatesG.getEncodeRate()).b();
    }
}
