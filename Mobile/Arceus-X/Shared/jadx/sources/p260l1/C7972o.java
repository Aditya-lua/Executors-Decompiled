package p260l1;

import android.util.Range;
import android.util.Size;
import p115f1.AbstractC5245c2;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p282m1.AbstractC8383p1;
import p296n0.EnumC8723a4;
import p296n0.InterfaceC8721a2;
import p533x2.InterfaceC12638h;

/* JADX INFO: renamed from: l1.o */
/* JADX INFO: loaded from: classes.dex */
public class C7972o implements InterfaceC12638h<AbstractC8383p1> {

    /* JADX INFO: renamed from: a */
    public final String f29878a;

    /* JADX INFO: renamed from: b */
    public final EnumC8723a4 f29879b;

    /* JADX INFO: renamed from: c */
    public final AbstractC5245c2 f29880c;

    /* JADX INFO: renamed from: d */
    public final Size f29881d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8721a2.c f29882e;

    /* JADX INFO: renamed from: f */
    public final C5902k0 f29883f;

    /* JADX INFO: renamed from: g */
    public final Range<Integer> f29884g;

    public C7972o(String str, EnumC8723a4 enumC8723a4, AbstractC5245c2 abstractC5245c2, Size size, InterfaceC8721a2.c cVar, C5902k0 c5902k0, Range<Integer> range) {
        this.f29878a = str;
        this.f29879b = enumC8723a4;
        this.f29880c = abstractC5245c2;
        this.f29881d = size;
        this.f29882e = cVar;
        this.f29883f = c5902k0;
        this.f29884g = range;
    }

    /* JADX DEBUG: Method merged with bridge method: get()Ljava/lang/Object; */
    @Override // p533x2.InterfaceC12638h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC8383p1 get() {
        CaptureEncodeRates captureEncodeRatesM32994c = C7970m.m32994c(this.f29880c, this.f29884g);
        C5931r1.m26561a("VidEncVdPrflRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + captureEncodeRatesM32994c.getCaptureRate() + "fps. Encode frame rate = " + captureEncodeRatesM32994c.getEncodeRate() + "fps.");
        Range<Integer> rangeMo24264c = this.f29880c.mo24264c();
        C5931r1.m26561a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iM32997f = C7970m.m32997f(this.f29882e.mo34989c(), this.f29883f.m26516a(), this.f29882e.mo34988b(), captureEncodeRatesM32994c.getEncodeRate(), this.f29882e.mo34992f(), this.f29881d.getWidth(), this.f29882e.mo34998l(), this.f29881d.getHeight(), this.f29882e.mo34994h(), rangeMo24264c);
        int iMo34996j = this.f29882e.mo34996j();
        return AbstractC8383p1.m34061d().mo33923i(this.f29878a).mo33922h(this.f29879b).mo33925k(this.f29881d).mo33916b(iM32997f).mo33917c(captureEncodeRatesM32994c.getCaptureRate()).mo33920f(captureEncodeRatesM32994c.getEncodeRate()).mo33924j(iMo34996j).mo33919e(C7970m.m32993b(this.f29878a, iMo34996j)).mo33915a();
    }
}
