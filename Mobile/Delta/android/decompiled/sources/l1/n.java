package l1;

import android.util.Range;
import android.util.Size;
import f1.c2;
import g0.k0;
import g0.r1;
import m1.p1;
import n0.a4;

/* JADX INFO: loaded from: classes.dex */
public class n implements x2.h<p1> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Size f23305g = new Size(1280, 720);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23306a;
    public final a4 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f23307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Size f23308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f23309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Range<Integer> f23310f;

    public n(String str, a4 a4Var, c2 c2Var, Size size, k0 k0Var, Range<Integer> range) {
        this.f23306a = str;
        this.b = a4Var;
        this.f23307c = c2Var;
        this.f23308d = size;
        this.f23309e = k0Var;
        this.f23310f = range;
    }

    @Override // x2.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public p1 get() {
        CaptureEncodeRates captureEncodeRatesC = m.c(this.f23307c, this.f23310f);
        r1.a("VidEncCfgDefaultRslvr", "Resolved VIDEO frame rates: Capture frame rate = " + captureEncodeRatesC.getCaptureRate() + "fps. Encode frame rate = " + captureEncodeRatesC.getEncodeRate() + "fps.");
        Range<Integer> rangeC = this.f23307c.c();
        r1.a("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        int iA = this.f23309e.a();
        int encodeRate = captureEncodeRatesC.getEncodeRate();
        int width = this.f23308d.getWidth();
        Size size = f23305g;
        int iF = m.f(14000000, iA, 8, encodeRate, 30, width, size.getWidth(), this.f23308d.getHeight(), size.getHeight(), rangeC);
        int iA2 = n1.b.a(this.f23306a, this.f23309e);
        return p1.d().i(this.f23306a).h(this.b).k(this.f23308d).b(iF).c(captureEncodeRatesC.getCaptureRate()).f(captureEncodeRatesC.getEncodeRate()).j(iA2).e(m.b(this.f23306a, iA2)).a();
    }
}
