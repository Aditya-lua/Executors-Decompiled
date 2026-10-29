package p260l1;

import android.util.Range;
import android.util.Size;
import p115f1.AbstractC5245c2;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p282m1.AbstractC8383p1;
import p296n0.EnumC8723a4;
import p297n1.C8859b;
import p533x2.InterfaceC12638h;

/* JADX INFO: renamed from: l1.n */
/* JADX INFO: loaded from: classes.dex */
public class C7971n implements InterfaceC12638h<AbstractC8383p1> {

    /* JADX INFO: renamed from: g */
    public static final Size f29871g = new Size(1280, 720);

    /* JADX INFO: renamed from: a */
    public final String f29872a;

    /* JADX INFO: renamed from: b */
    public final EnumC8723a4 f29873b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5245c2 f29874c;

    /* JADX INFO: renamed from: d */
    public final Size f29875d;

    /* JADX INFO: renamed from: e */
    public final C5902k0 f29876e;

    /* JADX INFO: renamed from: f */
    public final Range<Integer> f29877f;

    public C7971n(String str, EnumC8723a4 enumC8723a4, AbstractC5245c2 abstractC5245c2, Size size, C5902k0 c5902k0, Range<Integer> range) {
        this.f29872a = str;
        this.f29873b = enumC8723a4;
        this.f29874c = abstractC5245c2;
        this.f29875d = size;
        this.f29876e = c5902k0;
        this.f29877f = range;
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // p533x2.InterfaceC12638h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC8383p1 get() {
        CaptureEncodeRates captureEncodeRatesM32994c = C7970m.m32994c(this.f29874c, this.f29877f);
        C5931r1.m26561a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + captureEncodeRatesM32994c.getCaptureRate() + "fps. Encode frame rate = " + captureEncodeRatesM32994c.getEncodeRate() + "fps.");
        Range<Integer> rangeMo24264c = this.f29874c.mo24264c();
        C5931r1.m26561a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int iM26516a = this.f29876e.m26516a();
        int encodeRate = captureEncodeRatesM32994c.getEncodeRate();
        int width = this.f29875d.getWidth();
        Size size = f29871g;
        int iM32997f = C7970m.m32997f(14000000, iM26516a, 8, encodeRate, 30, width, size.getWidth(), this.f29875d.getHeight(), size.getHeight(), rangeMo24264c);
        int iM35569a = C8859b.m35569a(this.f29872a, this.f29876e);
        return AbstractC8383p1.m34061d().mo33923i(this.f29872a).mo33922h(this.f29873b).mo33925k(this.f29875d).mo33916b(iM32997f).mo33917c(captureEncodeRatesM32994c.getCaptureRate()).mo33920f(captureEncodeRatesM32994c.getEncodeRate()).mo33924j(iM35569a).mo33919e(C7970m.m32993b(this.f29872a, iM35569a)).mo33915a();
    }
}
