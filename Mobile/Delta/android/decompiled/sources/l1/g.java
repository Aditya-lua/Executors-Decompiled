package l1;

import android.util.Range;
import android.util.Rational;
import g0.r1;

/* JADX INFO: loaded from: classes.dex */
public final class g implements x2.h<i1.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f1.a f22900a;
    public final Rational b;

    public g(f1.a aVar, Rational rational) {
        this.f22900a = aVar;
        this.b = rational;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i1.a get() {
        int iE = b.e(this.f22900a);
        int iF = b.f(this.f22900a);
        int iC = this.f22900a.c();
        if (iC == -1) {
            r1.a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            iC = 1;
        } else {
            r1.a("DefAudioResolver", "Using supplied AUDIO channel count: " + iC);
        }
        Range<Integer> rangeD = this.f22900a.d();
        CaptureEncodeRates captureEncodeRatesG = b.g(rangeD, f1.a.b.equals(rangeD) ? 44100 : ((Integer) rangeD.getUpper()).intValue(), iC, iE, this.b);
        r1.a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: " + captureEncodeRatesG.getCaptureRate() + "Hz. Encode sample rate: " + captureEncodeRatesG.getEncodeRate() + "Hz.");
        return i1.a.a().d(iE).c(iF).f(iC).e(captureEncodeRatesG.getCaptureRate()).g(captureEncodeRatesG.getEncodeRate()).b();
    }
}
