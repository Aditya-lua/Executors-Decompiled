package p260l1;

import android.util.Range;
import android.util.Rational;
import p115f1.AbstractC5234a;
import p140g0.C5931r1;
import p183i1.AbstractC6601a;
import p533x2.InterfaceC12638h;

/* JADX INFO: renamed from: l1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7964g implements InterfaceC12638h<AbstractC6601a> {

    /* JADX INFO: renamed from: a */
    public final AbstractC5234a f29854a;

    /* JADX INFO: renamed from: b */
    public final Rational f29855b;

    public C7964g(AbstractC5234a abstractC5234a, Rational rational) {
        this.f29854a = abstractC5234a;
        this.f29855b = rational;
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // p533x2.InterfaceC12638h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC6601a get() {
        int iM32964e = C7959b.m32964e(this.f29854a);
        int iM32965f = C7959b.m32965f(this.f29854a);
        int iMo24220c = this.f29854a.mo24220c();
        if (iMo24220c == -1) {
            C5931r1.m26561a("DefAudioResolver", "Using fallback AUDIO channel count: 1");
            iMo24220c = 1;
        } else {
            C5931r1.m26561a("DefAudioResolver", "Using supplied AUDIO channel count: " + iMo24220c);
        }
        Range<Integer> rangeMo24221d = this.f29854a.mo24221d();
        CaptureEncodeRates captureEncodeRatesM32966g = C7959b.m32966g(rangeMo24221d, AbstractC5234a.f20288b.equals(rangeMo24221d) ? 44100 : ((Integer) rangeMo24221d.getUpper()).intValue(), iMo24220c, iM32964e, this.f29855b);
        C5931r1.m26561a("DefAudioResolver", "Using AUDIO sample rate resolved from AudioSpec: Capture sample rate: " + captureEncodeRatesM32966g.getCaptureRate() + "Hz. Encode sample rate: " + captureEncodeRatesM32966g.getEncodeRate() + "Hz.");
        return AbstractC6601a.m28508a().mo28518d(iM32964e).mo28517c(iM32965f).mo28520f(iMo24220c).mo28519e(captureEncodeRatesM32966g.getCaptureRate()).mo28521g(captureEncodeRatesM32966g.getEncodeRate()).m28516b();
    }
}
