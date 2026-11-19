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
    public final String f21862a;
    public final a4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f21863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f21864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2.c f21865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f21866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Range<Integer> f21867g;

    public o(String str, a4 a4Var, c2 c2Var, Size size, a2.c cVar, k0 k0Var, Range<Integer> range) {
        this.f21862a = str;
        this.b = a4Var;
        this.f21863c = c2Var;
        this.f21864d = size;
        this.f21865e = cVar;
        this.f21866f = k0Var;
        this.f21867g = range;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 get() {
        CaptureEncodeRates captureEncodeRatesC = m.c(this.f21863c, this.f21867g);
        r1.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + captureEncodeRatesC.getCaptureRate() + "fps. Encode frame rate = " + captureEncodeRatesC.getEncodeRate() + "fps.");
        Range<Integer> rangeC = this.f21863c.c();
        r1.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iF = m.f(this.f21865e.c(), this.f21866f.a(), this.f21865e.b(), captureEncodeRatesC.getEncodeRate(), this.f21865e.f(), this.f21864d.getWidth(), this.f21865e.l(), this.f21864d.getHeight(), this.f21865e.h(), rangeC);
        int iJ = this.f21865e.j();
        return p1.d().i(this.f21862a).h(this.b).k(this.f21864d).b(iF).c(captureEncodeRatesC.getCaptureRate()).f(captureEncodeRatesC.getEncodeRate()).j(iJ).e(m.b(this.f21862a, iJ)).a();
    }
}
