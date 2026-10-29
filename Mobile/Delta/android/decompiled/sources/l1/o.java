package l1;

import android.util.Range;
import android.util.Size;
import f1.c2;
import g0.k0;
import g0.r1;
import m1.p1;
import n0.a2;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public class o implements x2.h<p1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22917a;
    public final a4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f22918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f22919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2.c f22920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f22921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Range<Integer> f22922g;

    public o(String str, a4 a4Var, c2 c2Var, Size size, a2.c cVar, k0 k0Var, Range<Integer> range) {
        this.f22917a = str;
        this.b = a4Var;
        this.f22918c = c2Var;
        this.f22919d = size;
        this.f22920e = cVar;
        this.f22921f = k0Var;
        this.f22922g = range;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 get() {
        CaptureEncodeRates captureEncodeRatesC = m.c(this.f22918c, this.f22922g);
        r1.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + captureEncodeRatesC.getCaptureRate() + "fps. Encode frame rate = " + captureEncodeRatesC.getEncodeRate() + "fps.");
        Range<Integer> rangeC = this.f22918c.c();
        r1.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iF = m.f(this.f22920e.c(), this.f22921f.a(), this.f22920e.b(), captureEncodeRatesC.getEncodeRate(), this.f22920e.f(), this.f22919d.getWidth(), this.f22920e.l(), this.f22919d.getHeight(), this.f22920e.h(), rangeC);
        int iJ = this.f22920e.j();
        return p1.d().i(this.f22917a).h(this.b).k(this.f22919d).b(iF).c(captureEncodeRatesC.getCaptureRate()).f(captureEncodeRatesC.getEncodeRate()).j(iJ).e(m.b(this.f22917a, iJ)).a();
    }
}
