package p260l1;

import android.util.Range;
import android.util.Rational;
import p115f1.AbstractC5234a;
import p140g0.C5931r1;
import p183i1.AbstractC6601a;
import p296n0.InterfaceC8721a2;
import p533x2.InterfaceC12638h;

/* JADX INFO: renamed from: l1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7963f implements InterfaceC12638h<AbstractC6601a> {

    /* JADX INFO: renamed from: a */
    public final AbstractC5234a f29851a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8721a2.a f29852b;

    /* JADX INFO: renamed from: c */
    public final Rational f29853c;

    public C7963f(AbstractC5234a abstractC5234a, InterfaceC8721a2.a aVar, Rational rational) {
        this.f29851a = abstractC5234a;
        this.f29852b = aVar;
        this.f29853c = rational;
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // p533x2.InterfaceC12638h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC6601a get() {
        int iM32964e = C7959b.m32964e(this.f29851a);
        int iM32965f = C7959b.m32965f(this.f29851a);
        int iMo24220c = this.f29851a.mo24220c();
        int iMo34981c = this.f29852b.mo34981c();
        if (iMo24220c == -1) {
            C5931r1.m26561a("AudioSrcAdPrflRslvr", "Resolved AUDIO channel count from AudioProfile: " + iMo34981c);
            iMo24220c = iMo34981c;
        } else {
            C5931r1.m26561a("AudioSrcAdPrflRslvr", "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: " + iMo34981c + ", Resolved Channel Count: " + iMo24220c + "]");
        }
        Range<Integer> rangeMo24221d = this.f29851a.mo24221d();
        int iMo34985g = this.f29852b.mo34985g();
        CaptureEncodeRates captureEncodeRatesM32966g = C7959b.m32966g(rangeMo24221d, iMo34985g, iMo24220c, iM32965f, this.f29853c);
        C5931r1.m26561a("AudioSrcAdPrflRslvr", "Using resolved AUDIO sample rate or nearest supported from AudioProfile: Capture sample rate: " + captureEncodeRatesM32966g.getCaptureRate() + "Hz. Encode sample rate: " + captureEncodeRatesM32966g.getEncodeRate() + "Hz. [AudioProfile sample rate: " + iMo34985g + "Hz]");
        return AbstractC6601a.m28508a().mo28518d(iM32964e).mo28517c(iM32965f).mo28520f(iMo24220c).mo28519e(captureEncodeRatesM32966g.getCaptureRate()).mo28521g(captureEncodeRatesM32966g.getEncodeRate()).m28516b();
    }
}
