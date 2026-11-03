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
    public final String f23311a;
    public final a4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f23312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f23313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a2.c f23314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k0 f23315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Range<Integer> f23316g;

    public o(String str, a4 a4Var, c2 c2Var, Size size, a2.c cVar, k0 k0Var, Range<Integer> range) {
        this.f23311a = str;
        this.b = a4Var;
        this.f23312c = c2Var;
        this.f23313d = size;
        this.f23314e = cVar;
        this.f23315f = k0Var;
        this.f23316g = range;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 get() {
        CaptureEncodeRates captureEncodeRatesC = m.c(this.f23312c, this.f23316g);
        r1.a("VidEncVdPrflRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + captureEncodeRatesC.getCaptureRate() + "fps. Encode frame rate = " + captureEncodeRatesC.getEncodeRate() + "fps.");
        Range<Integer> rangeC = this.f23312c.c();
        r1.a("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int iF = m.f(this.f23314e.c(), this.f23315f.a(), this.f23314e.b(), captureEncodeRatesC.getEncodeRate(), this.f23314e.f(), this.f23313d.getWidth(), this.f23314e.l(), this.f23313d.getHeight(), this.f23314e.h(), rangeC);
        int iJ = this.f23314e.j();
        return p1.d().i(this.f23311a).h(this.b).k(this.f23313d).b(iF).c(captureEncodeRatesC.getCaptureRate()).f(captureEncodeRatesC.getEncodeRate()).j(iJ).e(m.b(this.f23311a, iJ)).a();
    }
}
